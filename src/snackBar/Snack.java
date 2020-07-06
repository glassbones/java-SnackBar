package snackBar;

public class Snack {

        //fields
        private static int maxId = 1;

        private int id;
        private String name;
        private double quantity;
        private double cost;
        private int vmId;

        //constructor
        public Snack(String name, double quantity, double cost, int vmId)
        {
            maxId++;
            id = maxId;
            this.name = name;
            this.quantity = quantity;
            this.cost = cost;
            this.vmId = vmId;
        }

        //methods
        public int getId(){ return id; }
        public String getName(){ return name; }
        public double getQuantity(){ return quantity; }
        public double getCost(){ return cost; }
        public int getVmId(){ return vmId; }

        public void setName(String name){ this.name = name; }
        public void setQuantity(double cost){ this.cost = cost; }
        public void setVmId(int vmId){ this.vmId = vmId ; }
        public void addQuantity(double quantityAdded){ quantity = quantity + quantityAdded ; }
        //public void buySnacks(String snackName)
        //public void getTotalCost

}