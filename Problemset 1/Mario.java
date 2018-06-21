import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Mario{
	public static void main(String[] args){
		int n;
		Scanner scan= new Scanner(System.in);
		do{
			n=scan.nextInt();
		}while(n<0||n>23);
		for(int i=1;i<=n;i++){
        for(int j=n;j>=1;j--){
            if(j<=i)System.out.print("#");
            else System.out.print(" ");
        }
        System.out.print("  ");
        for(int j=1;j<=n;j++){
            if(j<=i)System.out.print("#");
            else System.out.print(" ");
        }
        System.out.print("\n");

    }
    scan.close();
	}
}