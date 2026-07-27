public class AccessModifer{
    public static void main(String args[]){
        BankAccount b=new BankAccount();
        b.Username="Sainath";
        // b.password="adkask";  bcz it is private access modifier
        System.out.println(b.Username);
        b.setPassword("manish");
        
    }
}

class BankAccount{
    public String Username;
    private String password;

    public void setPassword(String newPass){
        password=newPass;
        
    }
}