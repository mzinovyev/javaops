public class Variable {
	public static void main(String[] args) {
		// 1  bit
		boolean cpu = true;
		// 1 byte
		byte ram = 8;
		// 2 byte
		short rootFoldersOnDisk = 32; 			
		// 4 byte
		int cpuCores = 4;
		// 8 byte
		long hddCapacityBt = 25000000000L;
		// 4 byte
		float cpuGhz = 2.7F;
		// 8 byte
		double cpuMaxGhz = 3.48D; 	
		// 2 byte
		char cpuGeneration = '5'; 		

		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(rootFoldersOnDisk);
		System.out.println(cpuCores);
		System.out.println(hddCapacityBt);
		System.out.println(cpuGhz);
		System.out.println(cpuMaxGhz);
		System.out.println(cpuGeneration);
	}
}