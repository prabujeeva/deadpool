import java.util.Scanner;

public class JavaProgram
{
    public static void main(String args[])
    {
        char sh;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter a Character : ");
        ch = scan.next().charAt(0);
		
        if((sh>='a' && ch<='z') || (sh>='A' && ch<='Z'))
        {
            System.out.print(sh + " is an Alphabet");
        }
        else
        {
            System.out.print(sh + " is not an Alphabet");
        }
    }
}
