package com.enigmacamp;

public class Hero implements Hitable {
	protected String name;
	protected Integer hp;
	protected Integer damage;
	
	public Hero(String name, Integer hp, Integer damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.damage = damage;
	}
	
	public void attack(Hitable hitable) {
		hitable.getHit(this.damage);
	}
	
	@Override
	public void getHit(Integer damage) {
		this.hp = this.hp - damage;
	}
	
	public String print() {
		return "Hero : " + name + " hp : " + hp + " damage: " + damage;
	}
}