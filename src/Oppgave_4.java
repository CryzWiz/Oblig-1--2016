import java.io.FileNotFoundException;
import java.util.*;
public class Oppgave_4 {
	public static void main(String[] args) throws Exception{
		//Our counters
		int wordCount = 0;int linesCount = 0;int lettersCount = 0;
		try {
			//We take the argument(filename) and read it
		    java.io.File file = new java.io.File(args[0]);
		    Scanner inputLines = new Scanner(file);
		    //Finding words, letters and lines
		    while(inputLines.hasNextLine()){
		    	linesCount++;
				char[] letters = inputLines.nextLine().trim().toCharArray();
				lettersCount = letters.length;
				if(letters.length > 0)
					wordCount++;
				for(int i = 0; i < letters.length; i++){
					if(letters[i] == ' ')
						wordCount++;
				}
			}
		    inputLines.close();
		    //Printing the result
		    System.out.println("We have " + linesCount + " lines.");
		    System.out.println("And " + wordCount + " words.");
		    System.out.println("And a total of " + lettersCount + " letters.");
		    
			}
			//If we can't find the file
			catch (FileNotFoundException ex) {
				System.out.println("Cant find the file - check your spelling if the file exist, and remember the file extension(ex: file.txt).");
			}
	}
}

