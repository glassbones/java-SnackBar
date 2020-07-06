package snackBar;

public class Customer {
    
    //fields
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    //constructor
    public Customer(String name, double cashOnHand)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    //methods
    //get
    public int getId(){ return id; }
    public String getName(){ return name; }
    public double getCashOnHand(){ return cashOnHand; }

    public void addCash(double addedCash){ this.cashOnHand = this.cashOnHand + addedCash; }
    //buy snacks

}