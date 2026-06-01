import java.util.*;

public class test1 {
    public static <T> List<T> removeDuplicates(List<T> inputList)
    {;
        for(int i=0; i<inputList.size();i++)
        {
            for(int j=i+1; j<inputList.size();j++)
            {
                if((inputList.get(i).equals(inputList.get(j))))
                {
                    inputList.remove(j);
                    j--;
                }
            }
        }
        return inputList;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<String> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        System.out.println("Enter the size of list: ");
        int s=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter string elements: ");
        for(int i=0; i<s;i++)
        {
            l1.add(sc.nextLine());
        }
        System.out.println("Enter integer elements: ");
        for(int i=0; i<s;i++)
        {
            l2.add(sc.nextInt());
        }
        System.out.println(removeDuplicates(l1));
        System.out.println(removeDuplicates(l2));
    }
}
