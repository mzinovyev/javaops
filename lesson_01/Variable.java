public class Variable{
	public static void main(String[] args){
		boolean isIntelProcessor = true; 		//1 byte (1  bit)
		byte totalMemoryGbytes = 8; 			//2 (1 byte)
		short rootFoldersOnDisk = 32; 			//3 (2 byte)
		int numberOfCores = 4; 					//4 (4 byte)
		long totalDiskSpaceBytes = 25000000000L;//5 (8 byte)
		float cpuFrequencyGhz = 2.7F;			//6 (4 byte)
		double cpuMaximumFrequencyGhz = 3.48D; 	//7 (8 byte)
		char processorGeneration = '5'; 		//8 (2 byte)

		System.out.print("isIntelProcessor: "); System.out.println(isIntelProcessor);
		System.out.print("totalMemoryGbytes: "); System.out.println(totalMemoryGbytes);
		System.out.print("rootFoldersOnDisk: "); System.out.println(rootFoldersOnDisk);
		System.out.print("numberOfCores: "); System.out.println(numberOfCores);
		System.out.print("totalDiskSpaceBytes: "); System.out.println(totalDiskSpaceBytes);
		System.out.print("cpuFrequencyGhz: "); System.out.println(cpuFrequencyGhz);
		System.out.print("cpuMaximumFrequencyGhz: "); System.out.println(cpuMaximumFrequencyGhz);
		System.out.print("processorGeneration: "); System.out.println(processorGeneration);
	}
}