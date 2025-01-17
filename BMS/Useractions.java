import java.util.Scanner;

public class Useractions {

    public static User customerlog(Scanner sc){

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        User userr = null;


        for (User u : Bookmyshow.getUsers()) {
                if (u.getUsername().equals(username)) {
                    userr = u;
                    break;
                }
        }

        if (userr!=null) {
            System.out.print("Enter User Pin: ");
            String password = sc.nextLine();


            if (password.equals(userr.getPassword())) {
                return userr;
            } else {
                System.out.println("Invalid Pin.");
            }
        } else {
            System.out.println("User Account Not Found.");
        }

        return null;
    }

    public static User createcustermor(Scanner sc){
        System.out.println("Enter New Username:");
        String newusername=sc.nextLine();
        boolean cus=false;

        for(User newuser:Bookmyshow.getUsers()) {

                if (newuser.getUsername().equals(newusername)) {
                    System.out.println("Username Already Exist,Try Another");
                    cus=true;
                }

        }
        if(!cus){
            System.out.println("Enter New Password : ");
            String newpassword=sc.nextLine();
            Bookmyshow.getUsers().add(new User(newusername,newpassword));

        }

      return null;
    }
}
