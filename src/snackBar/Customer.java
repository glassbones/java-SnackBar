package snackBar;

public class Customer {
    
    //fields
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    //methods

    //get
    public int getId(){ return id; }
    public String getName(){ return name; }
    public double getCashOnHand(){ return cashOnHand; }

    public void addCash(double addedCash){ this.cashOnHand = this.cashOnHand + addedCash; }
    //buy snacks

}