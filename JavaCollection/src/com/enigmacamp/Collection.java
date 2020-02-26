package com.enigmacamp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection {
	private static void arrayList() {
		Student a = new Student("Wulan", "Female", 25);
		Student b = new Student("Astri", "Female", 24);
		Student c = new Student("Cici", "Female", 27);
		Student d = new Student("Suti", "Female", 25);
		Student e = new Student("Winda", "Female", 25);

		ArrayList<Student> array = new ArrayList<Student>(); // Creating arraylist
		// Adding object in arraylist
		array.add(a);
		array.add(b);
		array.add(c);
		array.add(d);
		array.add(e);
		array.add(e);
		// Traversing list through Iterator
		Iterator itr = array.iterator();
		while (itr.hasNext()) {
			Student std = (Student) itr.next();
			System.out.println(std.getName() + "\t" + std.getGender() + "\t" + std.getAge());
		}
	}

	private static void linkedList() {
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("Winda");
		linked.add("Suti");
		linked.add("Cici");
		linked.add("Astri");
		linked.add("Wulan");
		Iterator<String> itr = linked.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void vector() {
		Vector<String> vctr = new Vector<String>();
		vctr.add("Winda");
		vctr.add("Suti");
		vctr.add("Cici");
		vctr.add("Astri");
		vctr.add("Wulan");
		Iterator<String> itr = vctr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void stack() {
		Stack<String> stack = new Stack<String>();
		stack.push("Winda");
		stack.push("Suti");
		stack.push("Cici");
		stack.push("Astri");
		stack.push("Wulan");
		stack.pop();
		Iterator<String> itr = stack.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void priorityQueue() {
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Wulan");
		queue.add("Astri");
		queue.add("Cici");
		queue.add("Suti");
		queue.add("Winda");
		System.out.println("head:" + queue.element());
		System.out.println("head:" + queue.peek());
		System.out.println("iterating the queue elements:");
		Iterator itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

	private static void deque() {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Winda");
		deque.add("Suti");
		deque.add("Cici");
		deque.add("Astri");
		deque.add("Wulan");
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}

	private static void hashSet() {
		// Creating HashSet and adding elements
		HashSet<String> set = new HashSet<String>();
		set.add("Wulan");
		set.add("Astri");
		set.add("Cici");
		set.add("Suti");
		set.add("Winda");
		set.add("Winda");
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void linkedHashSet() {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Wulan");
		set.add("Astri");
		set.add("Cici");
		set.add("Suti");
		set.add("Winda");
		set.add("Winda");
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	private static void treeSet() {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("Wulan");
		set.add("Astri");
		set.add("Cici");
		set.add("Suti");
		set.add("Winda");
		set.add("Winda");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	private static void hashMap() {
		Map<String, Integer> studentScores = new HashMap<String, Integer>();
		studentScores.put("Winda", 100);
		studentScores.put("Suti", 90);
		studentScores.put("Cici", 80);
		studentScores.put("Astri", 70);
		studentScores.put("Wulan", 60);
		
		System.out.println(studentScores.get("Winda"));
		System.out.println(studentScores.containsKey("Suti"));
		
		Map<Integer, Student> students = new HashMap<Integer, Student>();
		students.put(1, new Student("Rahadi", "Male", 25));
		students.put(2, new Student("Oemar", "Male", 25));
		
		Map<Student, Float> mapScore = new HashMap<Student, Float>();
		Student a = new Student("Rahadi", "Male", 25);
		Student b = new Student("Oemar", "Male", 25);
		mapScore.put(a, 90.5F);
		mapScore.put(b, 80F);
		
		System.out.println(mapScore.get(a));
		System.out.println(mapScore.size());

		System.out.println(mapScore.containsValue(""));
		System.out.println(mapScore.values());
	}

	public static void main(String[] args) {
		arrayList();
		linkedList();
		vector();
		stack();
		priorityQueue();
		deque();
		hashSet();
		linkedHashSet();
		treeSet();
		hashMap();
	}
}