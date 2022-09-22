package org.bike;

public class RTR160 implements Bike{

	@Override
	public void cost() {
		System.out.println("bike cost is 100000 ");
		
	}

	@Override
	public void speed() {
		System.out.println("bike speed is 160 ");
	}
public static void main(String[] args) {
	RTR160 r = new RTR160();
	r.cost();
	r.speed();
	
}
}
