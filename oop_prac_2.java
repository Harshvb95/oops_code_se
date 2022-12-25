//Problem Statement::
/*
Identify commonalities and differences between Publication, Book and Magazine classes. 
Title, Price, Copies are common instance variables and saleCopy is common method.
The differences are, Book class has author and orderCopies().
Magazine Class has data members as orderQty, Current issue and method receiveNewissue().Write a program 
to find how many copies of the given books are ordered and display total sale of publication.
*/



import java.util.*;

class Publication
{
    String Title;
    double Price;
    int Copies;
    public Publication()
    {
        Title = "";
        Price = 0.0;
        Copies = 0;
        
    }
    public void saleCopy()
    {
        System.out.println("\nSeperate Sale Copy for Book and Magazine!!!");
    }
    public void input()
    {
        Scanner in_obj = new Scanner(System.in);
        System.out.print("\nEnter Title: ");
        Title = in_obj.nextLine();
        System.out.print("\nEnter Price: ");
        Price = in_obj.nextInt();
        System.out.print("\nEnter Number of copies sold: ");
        Copies = in_obj.nextInt();
       
    }
    public void display()
    {
        System.out.println("\n\n______________Displaying the input__________________");
        System.out.println("\n\tTitle: "+Title);
        System.out.println("\n\tPrice: "+Price);
        System.out.println("\n\tNumber of Copies sold: "+Copies);
    }
}



class Book1 extends Publication
{
    String author;
    public Book1()
    {
        super();
        author = "";
    }
    
    public void input_book()
    {
        input();
        System.out.print("\nEnter Book Author: ");
        Scanner in_obj = new Scanner(System.in);
        author = in_obj.nextLine();
        //in_obj.close();
    }
    public void display_book()
    {
        display();
        System.out.println("\n\tBook Author: "+author);
    }

    public int get_Copies()
    {
        return Copies;
    }
    
    public void orderCopies()
    {
        int n;
        Scanner in_obj = new Scanner(System.in);
        System.out.print("\nHow many Copies of book you want to order?: ");
        n = in_obj.nextInt();
        Copies = Copies+n;
        
    }

    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price*Copies;
        System.out.println("\n\n\nTotal Sale Copy for Book!!!\n");
        display_book();
        System.out.println("\nTotal Sales for " + author +" is "+total_sale);
    }
}

class Magazine extends Publication
{
    int issue;
    public Magazine()
    {
        super();
        issue = 0;
    }
    
    
    public void input_mag()
    {
        input();
        Scanner in_obj = new Scanner(System.in);
        System.out.print("\nEnter Magazine Issue: ");
        issue = in_obj.nextInt();
    }

    public void display_mag()
    {
        display();
        System.out.println("\n\tMagazine Issue: "+issue);
    }

    public void orderQty()
    {
        int n;
        Scanner in_obj = new Scanner(System.in);
        System.out.println("\nQuantity of magazine you want to order?: ");
        n = in_obj.nextInt();
        Copies = Copies+n;
        
    }
    public int receiveissue()
    {
        return issue;
    }
    
    public void saleCopy()
    {
        double total_sale = 0;
        total_sale = Price*Copies;
        System.out.println("\nTotal Sale Copy for Magazine!!!");
        display_mag();
        System.out.println("\nTotal Sales is "+total_sale);
    }
}
    
public class oop_prac_2
{
    public static void main(String args[])
    {
        Book1 b1 = new Book1();
        Magazine m1 = new Magazine();
        Publication p1 = new Book1();
        Publication p2 = new Magazine();
        
        System.out.println("\n----------------------------Book Data--------------------------------");
        b1.input_book();
        b1.display_book();
        b1.orderCopies();
        p1 = b1;
        p1.saleCopy();
        
        System.out.println("\nTotal Copies Sold: "+ b1.get_Copies());
        
        System.out.println("\n\n----------------------------Magazine Data--------------------------------");
        //p1 = new Magazine();
        m1.input_mag();
        m1.display_mag();
        m1.orderQty();
        p2 = m1;
        p2.saleCopy();
        
        System.out.println("\nAbove Information is for issue: "+m1.receiveissue());
    
    }
}