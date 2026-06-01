import java.util.*;
interface StringFormatter
{
    String format(String s);
}
public class test2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        StringFormatter runner = (p)-> p.toUpperCase();
        System.out.println(runner.format(s));
    }
    
}
