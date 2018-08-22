import java.io.*;
import java.util.*;
import java.lang.*;

public class Game {
    public static void main(String args[]) {
	play();
    }

    public static void play () {
	Scanner sc = new Scanner(System.in);
	selectClassHeader(sc);
	selectClass(sc);
	
    }
    
    public static void selectClassHeader(Scanner sc) {
	printLine();
	System.out.print("Select Class:\n");
        System.out.printf("%6s%10s%10s%10s","1.Mage","2.Warior","3.Hunter","4.Rouge\n");
	printLine();
	
    }

    public static Player selectClass(Scanner sc) {
	String in;
	int choise = 0;
	boolean isValid;
	in = sc.next();
	do {
	    try {
		choise =  Integer.parseInt(in);
	    } catch(Exception e) {
		System.out.print("Invalid input!\n");
		isValid = false;

	    }
	    choise = Integer.parseInt(in);
	    if ((choise < 1) || (choise > 4)) {
		isValid = false;
	    }
	    else {
		isValid = true;
	    }
	    
	    } while(!isValid);
	Player player = new Player(choise);
	return player;
    }

    public static void printLine() {
	System.out.print("+");
	for (int i = 0; i < 34; i++) {
	    System.out.print("-");
	}
	System.out.print("+\n");
    }
}
