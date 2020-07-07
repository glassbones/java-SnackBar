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
        " cash on hand $" +
        Double.toString(cashOnHand); }
    public String printSnacksOnHand(int SnackId){ 
         
        if (id == 2){
            return
            "Quantity of snack 2 is " +
            Double.toString(s2onHand);
        }
        if (id == 3){
            return
            "Quantity of snack 3 is " +
            Double.toString(s3onHand);
        }
        if (id == 4){
            return
            "Quantity of snack 4 is " +
            Double.toString(s4onHand);
        }
        else { return "invalid request"; }
    }

}