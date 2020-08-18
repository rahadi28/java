package com.enigmacamp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {
	private static final int HASH_BYTE_SIZE = 30;
	private static final int PBKDF2_ITERATIONS = 1000;
	private static final String SALT = "m@1nArh0a";

	public String gPLH(String payload, String salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
		return gplHI(payload.toCharArray(), salt.getBytes());
	}

	private String gplHI(char[] payload, byte[] salt) throws NoSuchAlgorithmException, InvalidKeySpecException {
		byte[] hash = pbkdf2(payload, salt, PBKDF2_ITERATIONS, HASH_BYTE_SIZE);
		return toHex(hash);
	}

	private byte[] pbkdf2(char[] password, byte[] salt, int iterations, int bytes)
			throws NoSuchAlgorithmException, InvalidKeySpecException {
		PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, bytes * 8);
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
		return skf.generateSecret(spec).getEncoded();
	}

	private static String toHex(byte[] array) throws NoSuchAlgorithmException {
		BigInteger bi = new BigInteger(1, array);
		String hex = bi.toString(16);
		int paddingLength = (array.length * 2) - hex.length();

		if (paddingLength > 0) {
			return String.format("%0" + paddingLength + "d", 0) + hex;
		} else {
			return hex;
		}
	}

	private File getFileFromResources(String filename) {
		ClassLoader classLoader = getClass().getClassLoader();
		URL resource = classLoader.getResource(filename);

		if (resource == null) {
			throw new IllegalArgumentException("file is not found!");
		} else {
			return new File(resource.getFile());
		}
	}

	private String readFile(File file) throws IOException {
		if (file == null)
			return null;
		
		JSONParser parser = new JSONParser();		
		String str = null;

		try (Reader reader = new FileReader(file)) {
			JSONObject jsonObject = (JSONObject) parser.parse(reader);
			str = jsonObject.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return str;
	}
	
	

	private String generatePayload() {
		String str = null;
		JSONObject obj = new JSONObject();
		obj.put("deviceId", "aa213d4b0a976d6c");
		obj.put("username", "NGztUshX6XxIktmeQX8Fsg==");
		obj.put("password", "huHCRs1CKZlIl1SY7iT/kYXzCt670ETWSncmH6lyByppKMbkC+9iFkDs8imIbNV9UD0rDxuD08hVkVa+3wBvfjpUEhW55ghd9ZUCoxiwYL2sN6hch088NTBl5mE2DVtq0q4P+79bA91B8GAhnnxpWe9ZjkmJjEjQ29Xq+z88OpMGdR7Sb/BWCkjBqHk5obZN22IuJ56WZTmzDms76wr+eu1cU8D7Ra7BYQwUaApxAU2XYph0XaY6WO4FlTG4fJwqqKVnGgd99aSwHORhW90SL7DAVNn2DFAdpPwcim3GcGDti3+edA5QWkPD7v8YN5nWD8426neUwEq+vk4gPrna4g==");
		obj.put("deviceToken", null);
		
//		HashMap<String, String> obj = new HashMap<>();
//		obj.put("deviceId", "aa213d4b0a976d6c");
//		obj.put("username", "NGztUshX6XxIktmeQX8Fsg==");
//		obj.put("password", "huHCRs1CKZlIl1SY7iT/kYXzCt670ETWSncmH6lyByppKMbkC+9iFkDs8imIbNV9UD0rDxuD08hVkVa+3wBvfjpUEhW55ghd9ZUCoxiwYL2sN6hch088NTBl5mE2DVtq0q4P+79bA91B8GAhnnxpWe9ZjkmJjEjQ29Xq+z88OpMGdR7Sb/BWCkjBqHk5obZN22IuJ56WZTmzDms76wr+eu1cU8D7Ra7BYQwUaApxAU2XYph0XaY6WO4FlTG4fJwqqKVnGgd99aSwHORhW90SL7DAVNn2DFAdpPwcim3GcGDti3+edA5QWkPD7v8YN5nWD8426neUwEq+vk4gPrna4g==");
//		obj.put("deviceToken", null);
		
		str = obj.toString();

		return str;
	}

	public static void main(String[] args) throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		Main app = new Main();
		File file = app.getFileFromResources("payload.json");
		String payload = app.readFile(file);
//		String payload = app.generatePayload();
//		String payload = "{\"deviceId\":\"aa213d4b0a976d6c\",\"username\":\"NGztUshX6XxIktmeQX8Fsg==\",\"password\":\"huHCRs1CKZlIl1SY7iT/kYXzCt670ETWSncmH6lyByppKMbkC+9iFkDs8imIbNV9UD0rDxuD08hVkVa+3wBvfjpUEhW55ghd9ZUCoxiwYL2sN6hch088NTBl5mE2DVtq0q4P+79bA91B8GAhnnxpWe9ZjkmJjEjQ29Xq+z88OpMGdR7Sb/BWCkjBqHk5obZN22IuJ56WZTmzDms76wr+eu1cU8D7Ra7BYQwUaApxAU2XYph0XaY6WO4FlTG4fJwqqKVnGgd99aSwHORhW90SL7DAVNn2DFAdpPwcim3GcGDti3+edA5QWkPD7v8YN5nWD8426neUwEq+vk4gPrna4g==\",\"deviceToken\":null}";
		System.out.println(payload);
		String result = app.gPLH(payload, SALT);
		System.out.println(result);
	}
}