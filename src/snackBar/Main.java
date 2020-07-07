package snackBar;
// package must match folder name

public class Main
// must be capitalized, must match file name
{
    private static void workWithData()
    {

        //init Vending Machine
        //public VendingMachine(String name){ this.name = name; }
        VendingMachine vm1 = new VendingMachine("Vending Machine 1");

        //init Snacks
        //public Snack(String name, double quantity, double cost, int vmId)
        Snack s2 = new Snack("snack 2", 200, 1, vm1.getId());
        Snack s3 = new Snack("snack 3", 300, 1, vm1.getId());
        Snack s4 = new Snack("snack 4", 400, 1, vm1.getId());
        
        //init Customers
        //public Customer(String name, int cashOnHand)
        Customer c1 = new Customer("Customer 1", 1000000.00);
        Customer c2 = new Customer("Customer 2", 2000000.00);



        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        ////////////////////////////////////////////////////
        
        System.out.println("\n*** Pre purchase values ***\n");
        //print customer 1 cash on hand
        System.out.println(c1.printCashOnHand());
        //print snack 2 quantity
        System.out.println(s4.printQuantity());
        
        // customer 1 buy snack4 x5
        s4.buySnacks(5, c1);

        System.out.println("\n*** Customer 1 has purchased 'Snack 4'x5! ***\n");
        // print customer 1's snack 4 quantity
        System.out.println(c1.printSnacksOnHand("s4"));
        //print customer 1 cash on hand
        System.out.println(c1.printCashOnHand());
        //print snack 2 quantity
        System.out.println(s4.printQuantity());

        ////////////////////////////////////////////////////


        System.out.println("\n*** Pre purchase values ***\n");
        //print customer 1 cash on hand
        System.out.println(c2.printCashOnHand());
        //print snack 2 quantity
        System.out.println(s3.printQuantity());
        
        // customer 1 buy snack4 x5
        s3.buySnacks(10, c2);

        System.out.println("\n*** Customer 1 has purchased 'Snack 3'x10! ***\n");
        // print customer 1's snack 4 quantity
        System.out.println(c2.printSnacksOnHand("s3"));
        //print customer 1 cash on hand
        System.out.println(c2.printCashOnHand());
        //print snack 2 quantity
        System.out.println(s3.printQuantity());

    
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}