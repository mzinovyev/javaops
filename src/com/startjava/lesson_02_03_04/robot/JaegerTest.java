package com.startjava.lesson_02_03_04.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger j1 = new Jaeger();
		j1.setModelName("Striker Eureka");

		j1.setMark("Mark-5");

		j1.setOrigin("Australia");

		j1.setHeight(76.2F);

		j1.setWeight(1.850F);

		j1.setSpeed(10);

		j1.setStrength(10);

		j1.setArmor(9);

		j1.setWeapon1("Assault Mount");

		j1.setWeapon2("WMB2x90");

		j1.setPilots("Herc Hansen, Stacker");

		Jaeger j2 = new Jaeger();
		
		j2.setModelName("Crimson Typhoon");

		j2.setMark("Mark-4");

		j2.setOrigin("China");

		j2.setHeight(76.2F);

		j2.setWeight(1.722F);

		j2.setSpeed(9);

		j2.setStrength(9);

		j2.setArmor(6);

		j2.setWeapon1("IB22 Plasmacaster");

		j2.setWeapon2("none");

		j2.setPilots("Cheung Wei, Jin Wei");

		testJaeger(j1);
		testJaeger(j2);
	}
	static void testJaeger(Jaeger j) {
		System.out.println("---Start testing jaeger---");
		System.out.println("lounch jaeger " + j.getModelName());

		j.drift();

		j.move();

		j.useWeapon();		
	}	
}