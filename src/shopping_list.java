import java.util.Scanner;

public class shopping_list
{
    // constructs node
    public static class node
    {
        int data; node next;
        public node(int data) {this.data = data; this.next = null;}
    }
    // type in add command
    private node head;
    public shopping_list(node head)
    {
        this.head = head;
    }
    public node get_head()
    {
        return this.head;
    }

    public void print_list(node head)
    {
        while (head != null)
        {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public int get_data(node head)
    {
        return head.data;
    }

    public static void main(String[] args) throws Exception 
    {

        //accept input until given name 

        Scanner kbd = new Scanner(System.in);
        node jack = new node(26);
        node jack1 = new node(23);
        node jack2 = new node(25);


        jack.next = jack1;
        jack1.next = jack2;

        shopping_list test = new shopping_list(jack);

        test.print_list(test.get_head());

       // System.out.println(test.get_data( test.get_head() ) );
        //test.print_list( test.get_head() );
        




        /* 
        //check for valid command
        try {args[0].length();}
        catch ( IndexOutOfBoundsException e ) 
        {
            System.out.println("\nInsert command. Functionality shoppinglist.java ... \n"+
            "\tadd : Add items to your shopping cart.\n"+
            "\tremove : Remove items form your shopping cart.\n"+
            "\thelp : list all commands.");
            return; 
        }
        if (!(args.length == 1))
        {
            System.out.println("\n use one command");
            return;
        }

        switch(args[0])
        {
            case "add":
                command_add();
                break;
            case "remove":
                // command_ remove
                System.out.println("Remove coming soon!");
                break;
            default:
                System.out.println("input a valid command");



        }
        System.out.println("testing git");
        return;
        */
        //System.out.println("this is zero: " + args[0] + "\nthis is one: " + args[1]);
    }



    /*
     * make new function to create a linked list 
     *  
     * 
     */
    public static void command_add()
    {
       

    }

    /*
    public static void command_remove()
    {

    }
    */
}
