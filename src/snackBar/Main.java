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
        Snack s2 = new Snack("snack 2", 200, 0.02, vm1.getId());
        Snack s3 = new Snack("snack 3", 300, 0.03, vm1.getId());
        Snack s4 = new Snack("snack 4", 400, 0.04, vm1.getId());
        
        //init Customers
        //public Customer(String name, int cashOnHand)
        Customer c1 = new Customer("Customer 1", 1000000.10);
        Customer c2 = new Customer("Customer 2", 2000000.20);
        
        //print
        System.out.println(c1.printCashOnHand());
        System.out.println(s2.printQuantity());
        s4.buySnacks(5, c1);
        System.out.println(c1.printSnacksOnHand(2));
        //public void buySnacks(double quantityBought, Customer customer)
    
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}