import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;

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
        return null;
    }

    public void addtheater(Scanner sc){
        System.out.println("Enter Theater Name:");
        String theatername=sc.nextLine();
        System.out.println("Enter Theater Location:");
        String loc=sc.nextLine();

        for(String theatera:Bookmyshow.getTheaterHashMap().keySet()){
            var currenttheater=Bookmyshow.getTheaterHashMap().get(theatera);
            if (theatera.equals(theatername)&&currenttheater.getLocation().equals(loc)){
                System.out.println("The Theater already Exist");
                return;
            }

        }

        System.out.println("Enter Number of Screen :");
        int noofscreeen=Integer.parseInt(sc.nextLine());
        HashMap<String,Screen>screenHashMap=new HashMap<>();

        while (noofscreeen!=0){
            System.out.println("Enter Name of the Screen :");
            String screenname=sc.nextLine();
            //var currentscreen=screenHashMap.get(scrrennamee);
            for(String scrrennamee:screenHashMap.keySet()) {
                if (scrrennamee.equals(screenname)) {
                    System.out.println("Screen Name already Exist");
                    return;
                }
            }
            System.out.println("Enter NO.OF. Seats :");
            int noofseats = Integer.parseInt(sc.nextLine());

            System.out.println("Enter the grid :");
            String scrgrid = sc.nextLine();
            var grid=Utility.patters(noofseats,scrgrid);
            if(grid==null){
                continue;
            }

            Screen screen = (new Screen(screenname, noofseats, scrgrid,grid));
            screenHashMap.put(screenname, screen);

            noofscreeen--;
        }
        Theater theater=(new Theater(theatername,loc,screenHashMap));
        Bookmyshow.getTheaterHashMap().put(theatername,theater);
        System.out.println("Thearter Added Successfully");

    }

    public void viewtheater(){
        for(var thea:Bookmyshow.getTheaterHashMap().keySet()){
            var theater=Bookmyshow.getTheaterHashMap().get(thea);
            System.out.println("Theater name :"+theater.getTreatername());
            System.out.println("Location :"+theater.getLocation());
            System.out.println("screens");
            System.out.println("------------------------------------------");

            for(var scr:theater.getScreenHashMap().entrySet()){

                System.out.println("Screen name:"+scr.getValue().getScreenname());
                System.out.println("No.of.Seats"+scr.getValue().getNoofseats());


                for(var te:scr.getValue().getSeatpatters().keySet()){
                    var tep=scr.getValue().getSeatpatters().get(te);
                    System.out.println(te);
                    System.out.println(tep);
                }

            }

        }
    }

    public void addmovie(Scanner sc){
        System.out.println("Enter movie Name :");
        String movie=sc.nextLine();
        System.out.println("Enter Movie Location:");
        String movieloc=sc.nextLine();

        for(String theater:Bookmyshow.getTheaterHashMap().keySet()){
            var threater=Bookmyshow.getTheaterHashMap().get(theater);
            if(threater.getLocation().equals()){

            }

        }

    }
}
