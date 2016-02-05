import java.util.*;
public class Oppgave_3 {

	public static void main(String[] args) {
		//generate our array and fill it with random numbers
		Double[] numbers = new Double[100];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = Math.random() * 100;
		}
		//Since we are just playing around, we set the run condition to true - period!
		while(true){
			try{
				System.out.println("Enter index(1-100):");
				Scanner input = new Scanner(System.in);
				int guess = input.nextInt() - 1;
				System.out.println(numbers[guess]);
			
			}
			//If we are out of bounds
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Out of bounds.");
			}
		}
	}
}
