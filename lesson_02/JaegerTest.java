public class JaegerTest {
	protected static void testJaeger(Jaeger j) {
		System.out.println("---Start testing jaeger---");
		System.out.println("lounch jaeger " + j.getName());
		j.drift();
		j.move();
		j.useWeapon();		
	}

	public static void main(String[] args) {
		Jaeger j1 = new Jaeger();
		j1.setTechInfo("Striker Eureka", "Mark-5", "Australia");
		j1.setSpecifications(76.2F, 1.850F, 10, 10, 9);
		j1.setWeapons("Assault Mount", "WMB2x90");
		j1.setPilots("Herc Hansen, Stacker");

		Jaeger j2 = new Jaeger();
		j2.setTechInfo("Crimson Typhoon", "Mark-4", "China");
		j2.setSpecifications(76.2F, 1.722F, 9, 8, 6);
		j2.setWeapons("IB22 Plasmacaster", "empty");
		j2.setPilots("Cheung Wei, Jin Wei");

		testJaeger(j1);
		testJaeger(j2);
	}
}