import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
//steph eley
//5.13.2020

public class Exercise12_15 {

	public static void main(String[] args) throws FileNotFoundException {
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if(!file.exists()) {

			try(PrintWriter out = new PrintWriter(file)){
			//catch(Exception ex){
				//PrintWriter out = new PrintWriter(file);
				for(int p = 0; p < 100; p++ ) {
					out.print((int)(Math.random() * 10000)+ " ");
				}
				
				//System.out.println("Exercise12_15.txt");
			}
		}
		try (Scanner in = new Scanner(file)){
			int[] number = new int[100];
			for(int i = 0; i < 100; i++) {
				number [i] = in.nextInt();
			}
			Arrays.sort(number);
			for(int k = 0 ; k < number.length; k++) {
				System.out.println(number[k] + " ");
			}
		}
	}
}
