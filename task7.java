public class task7 {
    public static void main(String[] args) {
        SalesEmployee s=new SalesEmployee();
        s.baseSal=20000;
        s.bonus=2000;
        System.out.println("total salary : "+s.CalSalary());
    }
    
}
class Employee{
    double baseSal;
    double CalSalary(){
        return baseSal;
       
    }

}
class SalesEmployee extends Employee{
    double bonus;
    @Override 
    double CalSalary(){
        return super.CalSalary()+bonus;
    }
    
}
