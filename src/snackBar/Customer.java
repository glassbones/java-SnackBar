package snackBar;

public class Customer {
    
    //fields
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;
    private double s2onHand;
    private double s3onHand;
    private double s4onHand;

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
    public double getS2onHand(){ return s2onHand; }
    public double getS3onHand(){ return s3onHand; }
    public double getS4onHand(){ return s4onHand; }

    public void addCash(double addedCash){ this.cashOnHand = this.cashOnHand + addedCash; }
    public void setCashOnHand(double cashValue){ this.cashOnHand = cashValue; }

    // this is bad practice for sure
    public void setSnacks(int id, double quantity){ 
        if (id == 2){s2onHand = s2onHand + quantity;}
        if (id == 3){s3onHand = s3onHand + quantity;}
        if (id == 4){s4onHand = s4onHand + quantity;}
    }
    //buy snacks

    //prints
    public String printCashOnHand(){ 
        return 
        getName() + 
        " has $" +
        Double.toString(cashOnHand) +
        " cash on hand!"; }
    public String printSnacksOnHand(String name){ 
         
        if (name.equals("s2")){
            return
            getName() +
            " has 'snack 2'x" +
            Double.toString(s2onHand) +
            " on hand!";
        }else if (name.equals("s3")){
            return
            getName() +
            " has 'snack 3'x" +
            Double.toString(s3onHand) +
            " on hand!";
        }else if (name.equals("s4")){
            return
            getName() +
            " has 'snack 4'x" +
            Double.toString(s4onHand) +
            " on hand!";
        }else { return "invalid request"; }
    }

}