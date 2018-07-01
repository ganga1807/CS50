import java.util.Scanner;
public class Caesar{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s;
		StringBuffer d=new StringBuffer();
		int key;
		key=scan.nextInt();
		scan.nextLine();
		s=scan.nextLine();
		for(int i=0;i<s.length();i++){
			char a;
			if (Character.isUpperCase(s.charAt(i))){
                a=(char)(((int)s.charAt(i)-65+key) % 26 + 65);
                d.append(a);
            }
            else if (Character.isLowerCase(s.charAt(i))){
                a=(char)(((int)s.charAt(i)-97+key) % 26 + 97);
                d.append(a);
            }
            else
            {
            	a=s.charAt(i);
                d.append(a);
            }
            }
        System.out.println(d);
        scan.close();
		}


}