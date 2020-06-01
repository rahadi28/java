package com.enigmacamp;

public class Tower implements Hitable {
	protected Integer hp;

	public Tower(Integer hp) {
		super();
		this.hp = hp;
	}

	@Override
	public void getHit(Integer damage) {
		this.hp = this.hp - damage;
		
	}
	
	public String print() {
		return "Tower hp : " + hp;
	}
}