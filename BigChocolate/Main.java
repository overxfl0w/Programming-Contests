import java.util.Scanner;

public class Main{
	
    public static void main (String args[]) {
	Scanner tc = new Scanner(System.in);
	while(tc.hasNextLong()){
	    long M = tc.nextLong();
	    long N = tc.nextLong();
	    System.out.println((M*N)-1);
	}	
    }
}

