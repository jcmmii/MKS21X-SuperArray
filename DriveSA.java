public class DriveSA{
	public static void main(String[] args) {

    SuperArray A = new SuperArray();

		//Sets a new array with size 0, and should be empty
		System.out.println("Creating new array:");
		System.out.println("The Array: " + A);
		System.out.println("Size of array: " + A.size());
		System.out.println("Array empty? " +  A.isEmpty());
		System.out.println();

		//adds values to the array
		System.out.println("Adding yuh to array: " + A.add("yuh"));
		System.out.println("Adding getthisbread: " + A.add("getthisbread"));
		System.out.println();

		//gets indexs 1 and 0, reutrns array
		System.out.println("Getting index 0: " + A.get(0));
		System.out.println("Getting index 1: " + A.get(1));
		System.out.println("Current Array: " + A);
		System.out.println();

		//sets index 0 to something new
		System.out.println("Setting index 0 to: " + A.set(0,"letsgo"));
		System.out.println("Size of array: " + A.size());
		System.out.println("Current Array: " + A);
		System.out.println();

		
  }
}
//for loop to make sure add(int, String)'s  int is in teh length
// of the array
