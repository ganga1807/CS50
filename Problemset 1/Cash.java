import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Cash{
	public static void main(String[] args){
		
		Scanner scan= new Scanner(System.in);
		double cash;
		double n;                 
		int counter;

    cash = scan.nextDouble();

	n = cash * 100;
    counter=0;

    while ( n >= 25 ) {
		counter += 1;
		n=n-25;
	}
	 while ( n >= 10 ) {
		counter += 1;
		n=n-10;
	}
	 while ( n >= 5 ) {
		counter += 1;
		n=n-5;
	}
	while ( n >= 1 ) {
		counter += 1;
		n=n-1;
	}


    System.out.println(counter);


    scan.close();
	}
}