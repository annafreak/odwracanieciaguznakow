
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String s1=sc.nextLine();


        String s2 = "";

        for(int i = s1.length()-1; i>=0; i--)
        {

            s2 = s2 + s1.charAt(i);
        }

        System.out.print("The reversed string of the '"+s1+"' is: " );
        System.out.println(s2);
    }
}
