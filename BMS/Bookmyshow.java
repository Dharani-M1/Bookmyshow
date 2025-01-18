import java.util.ArrayList;
import java.util.HashMap;

public class Bookmyshow {

    private static ArrayList<Admin>admins=new ArrayList<>();
    private static ArrayList<User>users=new ArrayList<>();
    private static HashMap<String,Theater>theaterHashMap=new HashMap<>();


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

    public static HashMap<String,Theater> getTheaterHashMap() {
        return theaterHashMap;
    }
}
