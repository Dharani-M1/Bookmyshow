import java.util.ArrayList;

public class Bookmyshow {

    private static ArrayList<Admin>admins=new ArrayList<>();
    private static ArrayList<User>users=new ArrayList<>();





    public static ArrayList<Admin> getAdmins() {
        return admins;
    }

    public static void setAdmins(ArrayList<Admin> admins) {
        Bookmyshow.admins = admins;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static void setUsers(ArrayList<User> users) {
        Bookmyshow.users = users;
    }
}
