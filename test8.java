import java.util.*;

public class test8 {
    public static boolean check(String s) throws NumberFormatException
    {
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetter(c))
            {
                throw new NumberFormatException("Skipping invalid input: "+s);

            }
        }
        return true;
    }
    public static void main(String[] args) {
        int s=0;
        List<Integer> p=new ArrayList<>();
        for(String arg: args)
        {
            try{
            
                if(check(arg))
                {
                    int n=Integer.parseInt(arg);
                    p.add(n);
                    s+=n;
                }
                
            }catch(NumberFormatException e){
            System.out.println(e.getMessage());
            }
        
        }
        
        System.out.println("The sum is "+s+" and average is "+(s/p.size()));
    }
}
