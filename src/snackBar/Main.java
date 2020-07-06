package snackBar;
// package must match folder name

public class Main
// must be capitalized, must match file name
{
    private static void workWithData()
    {
        //public VendingMachine(String name){ this.name = name; }
        VendingMachine vm1 = new VendingMachine("Vending Machine 1");

        //public Snack(String name, double quantity, double cost, int vmId)
        Snack s2 = new Snack("snack 2", 200, 0.02, vm1.getId());
        Snack s3 = new Snack("snack 3", 300, 0.03, vm1.getId());
        Snack s4 = new Snack("snack 4", 400, 0.04, vm1.getId());

        //public Customer(String name, int cashOnHand)
        Customer c1 = new Customer("Customer 1", 37.75);
        Customer c2 = new Customer("Customer 2", 37.75);
    
    }
    public static void main(String[] args)
    {
        workWithData();
    }
}