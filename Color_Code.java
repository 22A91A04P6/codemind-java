import java.util.Scanner;
public class sample
{
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        if(ch=='V'||ch=='v')
        System.out.println("Violet");
        else if(ch=='I'||ch=='i')
        System.out.println("Indigo");
         else if(ch=='B'||ch=='b')
        System.out.println("Blue");
         else if(ch=='Y'||ch=='y')
        System.out.println("Yellow");
         else if(ch=='O'||ch=='o')
        System.out.println("Orange");
         else if(ch=='R'||ch=='r')
        System.out.println("Red");
         else if(ch=='G'||ch=='g')
        System.out.println("Green");
        
        else
        System.out.println(-1);
        sc.close();
        
        
    }
}