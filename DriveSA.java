public class DriveSA{
	public static void main(String[] args) {

    SuperArray A = new SuperArray();

		System.out.println("The Array: " + A);
		System.out.println("The size of the array: " + A.size());
		System.out.println("Is the array empty? " +  A.isEmpty());
		System.out.println("Adding yuh to array: " + A.add("yuh"));
		System.out.println("Adding getthisbread: " + A.add("getthisbread"));
		System.out.println("Getting index 0: " + A.get(0));
		System.out.println("Getting index 1: " + A.get(1));
		System.out.println("Setting index 0 yur: " + A.set(0,"yur"));
		System.out.println("Returning size: " + A.size());
		System.out.println("The Array: " + A);

		for (int x = 0; x < 10; x++) {
				A.add("t");
		}

		System.out.println("The Array: " + A);
		System.out.println("Adding YO: " + A.add("YO"));
		System.out.println("The Array: " + A);
  }
}
//for loop to make sure add(int, String)'s  int is in teh length
// of the array
