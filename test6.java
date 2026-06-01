class Book
{
    int isbn;
    String title;
    public Book(int isbn, String title){
        this.title=title;
        this.isbn=isbn;
    }
    public boolean equals(Object obj) {
        // 1. If they are the exact same memory object, return true
        if (this == obj) return true;

        // 2. If the other object is null, or not even a Book, return false
        if (obj == null || this.getClass() != obj.getClass()) return false;

        // 3. Cast the generic Object into a Book
        Book otherBook = (Book) obj;

        // 4. Compare their ISBNs
        return this.isbn == otherBook.isbn;
    }
}

public class test6 {
    public static <T> boolean containsElement(T[] array, T target)
    {
        for(int i=0;i<array.length;i++)
        {
            if(array[i].equals(target)) 
                {
                    System.out.println(array[i]);
                    return true;
                }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer[] m={111, 222, 333};
        Book[] n = {
            new Book(1, "apple"),
            new Book(2, "mango"),
            new Book(3, "banana")
        };
        System.out.println("Integer: "+containsElement(m,222));
        System.out.println("String: "+containsElement(n,new Book(2, "mango")));
    }
}
