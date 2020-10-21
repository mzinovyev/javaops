public class Variable {
	public static void main(String[] args) {
		// 1  bit
		boolean isIntelProcessor = true;
		// 1 byte
		byte totalMemoryGB = 8;
		// 2 byte
		short rootFoldersOnDisk = 32; 			
		// 4 byte
		int numberOfCores = 4;
		// 8 byte
		long totalDiskSpaceBt = 25000000000L;
		// 4 byte
		float cpuFrequencyGhz = 2.7F;
		// 8 byte
		double cpuMaximumFrequencyGhz = 3.48D; 	
		// 2 byte
		char processorGeneration = '5'; 		

		System.out.println(isIntelProcessor);
		System.out.println(totalMemoryGB);
		System.out.println(rootFoldersOnDisk);
		System.out.println(numberOfCores);
		System.out.println(totalDiskSpaceBt);
		System.out.println(cpuFrequencyGhz);
		System.out.println(cpuMaximumFrequencyGhz);
		System.out.println(processorGeneration);
	}
}