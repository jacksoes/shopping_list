public class shopping_list {
    public static void main(String[] args) throws Exception 
    {
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
                /*command_remove();*/
                System.out.println("Remove coming soon!");
                break;
            default:
                System.out.println("input a valid command");



        }
        System.out.println("testing git");
        return;
        //System.out.println("this is zero: " + args[0] + "\nthis is one: " + args[1]);
    }



    public static void command_add()
    {
       

    }

    /*
    public static void command_remove()
    {

    }
    */
}
