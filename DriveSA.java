public class DriveSA{
	public static void main(String[] args) {

		//Sets a new array with size 0, and should be empty
		System.out.println("Creating new array:");
		SuperArray A = new SuperArray();
		System.out.println("The Array (with nulls): " + A.toStringDebug());
		System.out.println("The Array (no nulls): " + A);
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

		//tests the resize method
		System.out.println("A is looped 5 times adding J");
		for (int x = 0; x < 5; x++) {
			A.add("J");
		}
		System.out.println("Current Array (with nulls): " + A.toStringDebug());
		System.out.println("Size of array: " + A.size());
		System.out.println("Length of array w/ nulls: " + A.checkit());
		System.out.println();

		//tests add(int,string) method
		System.out.println("Current Array:" + A);
		A.add(1,"IMHERE");
		System.out.println("After adding IMHERE at index 1:" + A);
		A.add(0,"bop");
		System.out.println("After adding bop at index 0: " + A);
		System.out.println();

		//tests remove(int) method
		System.out.println("Current Array (with nulls): " + A.toStringDebug());
		System.out.println("Size of array: " + A.size());
		System.out.println("Removing 2 Js");
		A.remove(5);
		A.remove(5);
		System.out.println(A);
		System.out.println("Size of array: " + A.size());
		System.out.println("Remove letsgo: ");
		A.remove(1);
		System.out.println(A);
		System.out.println("Size of array: " + A.size());
		System.out.println();

		//tests remove(String)
 		System.out.println("Remove IMHERE? " + A.remove("IMHERE"));
		System.out.println(A);
		System.out.println("Size of array: " + A.size());

		System.out.println("Final array with nulls: " + A.toStringDebug());
  }
}
