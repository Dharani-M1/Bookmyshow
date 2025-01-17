import java.util.Scanner;

public class Adminactions {
    public static Admin adminlog(Scanner sc){
        System.out.println("Enter Admin Username:");
        String adminusername=sc.nextLine();
        Admin adminn=null;

        for(Admin admin:Bookmyshow.getAdmins()) {

                if (admin.getUsername().equals(adminusername)) {
                    adminn = admin;
                    break;
                }

        }

        if (adminn != null) {
            System.out.println("Enter Admin Password:");
            String adminpassword = sc.nextLine();
            if (adminn.getPassword().equals(adminpassword)) {
                return adminn;
            } else {
                System.out.println("Invalid Password");
            }
        }
        else{
            System.out.println("Invalid Admin");
        }
        return null;
    }
}
