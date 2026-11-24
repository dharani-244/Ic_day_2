public class task8 {
    public static void main(String[] args) {
       payment[] p={new creditCard(),new upi()};
       for(int i=0;i<p.length;i++){
            p[i].pay(500.0);
        }
        
    }
    
}
class payment{
    void pay(double amount){
        System.err.println("Processing generic payment of ₹" + amount);
    }
}
class creditCard extends payment{
    @Override 
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via Credit card");
    }
}
class upi extends payment{
    @Override 
    void pay(double amount){
        System.out.println("Paid ₹" + amount + " via upi");
    }
}
