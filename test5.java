import java.util.*;

class OutOfStockException extends Exception{
    public OutOfStockException(String message)
    {
        super(message);
    }
}

public class test5 {
    public static void sellItem(Map<String, Integer> inventory, String item, int quantityToSell) throws OutOfStockException
    {
        if(inventory.containsKey(item))
        {
            if(quantityToSell<=inventory.get(item))
            {
                int bal=inventory.get(item)-quantityToSell;
                System.out.println("You purchased "+quantityToSell);
                inventory.put(item, bal);
            }
            else
            {
                throw new OutOfStockException("Not enough inventory");
            }
        }
        else
        {
            System.out.println("Item not found");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> m=new HashMap<>();
        m.put("Laptop", 5);
        String item;
        int quantityToSell;
        System.out.println("Enter item name: ");
        item=sc.nextLine();
        System.out.println("Enter quantity to sell: ");
        quantityToSell=sc.nextInt();
        try{
            sellItem(m, item, quantityToSell);
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
