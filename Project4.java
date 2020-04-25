import java.util.Scanner;
public class Project4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		    System.out.print("Enter size of list 1, then elements: "); //displaying command to person 
		    int size = input.nextInt(); //enter size of array

		    int[] list1 = new int[size];
		    for (int i = 0; i < size; i++) {
		        list1[i] = input.nextInt(); //enter array
		    }

		    System.out.print("Enter size of list 2, then elements: ");
		    size = input.nextInt(); //enter size of array

		    int[] list2 = new int[size]; //
		    for (int i = 0; i < size; i++) {
		        list2[i] = input.nextInt(); //enter array
		    }

		    input.close();

		    if (equals(list1, list2)) {
		        System.out.println("Two lists are strictly identical"); //prints if the arrays are identical
		    } else {
		        System.out.println("Two lists are not strictly identical"); //prints if the arrays are not identical
		    }

		}

		public static boolean equals(int[] list1, int[] list2) {

		    if (list1.length != list2.length) { //checks to see if the arrays are equal
		        return false;
		    }

		    for (int i = 0; i < list1.length; i++) {
		        if (list1[i] != list2[i]) {
		            return false;
		        }
		    }

		    return true;
		}

	}


