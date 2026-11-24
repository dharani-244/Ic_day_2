public class task5{
    public static void main(String args[]){
        UserRegistration ur=new UserRegistration();
        ur.register("sree",101);

        ur.register(102,"ram");
    }
}
class UserRegistration{
    void register(String name, int userId){
        System.out.println( name + " with ID: " + userId);
    }
    void register(int userId, String name){
        System.out.println(userId + " for user: " + name);
    }
}