import  java.util.*;

public class SortingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//This variable will define size for String 
		int length = s.nextInt();
length++;
		String array[] = new String[length];
		//This loop will be used for giving values for String array
		for(int i = 0;i<array.length;i++) {
			String ip = s.nextLine();
			ip = ip.toUpperCase();
			array[i] = ip;
		}
		//Sorting Array
		Arrays.sort(array);
		//Printing sorted Values using Loops
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		

	}

}
