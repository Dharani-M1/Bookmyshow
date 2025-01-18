import java.util.Scanner;

public class Useractions {

    public static User customerlog(Scanner sc) {

        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        User userr = null;


        for (User u : Bookmyshow.getUsers()) {
            if (u.getUsername().equals(username)) {
                userr = u;
                break;
            }
        }

        if (userr != null) {
            System.out.print("Enter User Pin: ");
            String password = sc.nextLine();


            if (password.equals(userr.getPassword())) {
                return userr;
            } else {
                System.out.println("Invalid Pin.");
            }
        }
        return null;
    }

    public static User createcustermor(Scanner sc) {
        System.out.println("Enter New Username:");
        String newusername = sc.nextLine();
        User user = null;

        for (User newuser : Bookmyshow.getUsers()) {
            if (newuser.getUsername().equals(newusername)) {
                System.out.println("Username Already Exist,Try Another");
                user = newuser;
                break;
            }
        }
        if (user == null) {

            System.out.println("Enter New Password : ");
            String newpassword = sc.nextLine();
            System.out.println("Enter Location :");
            String loc = sc.nextLine();

            User userr=(new User(newusername,newpassword,loc));
            Bookmyshow.getUsers().add(userr);
            return userr;
        }
        return null;
    }
}

