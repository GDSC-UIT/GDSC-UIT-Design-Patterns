public class User {

    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    public void order(String nameOfDrink){
        System.out.println(userName + " ordering " + nameOfDrink);
    }

    public void pay(double amount){
        System.out.println(userName + " paying with amount of " + amount + " USD");
    }
    
}
