import java.util.ArrayList;
import java.util.HashMap;

public class Screen {
    private String screenname;
    private int noofseats;
    private String grid;
    private HashMap<Character, ArrayList<String>>seatpatters;


    public Screen(String screenname,int noofseats,String grid,HashMap<Character,ArrayList<String>>seatpatters){
        this.screenname=screenname;
        this.noofseats=noofseats;
        this.grid=grid;
        this.seatpatters=seatpatters;
    }


    public String getScreenname() {
        return screenname;
    }

    public int getNoofseats() {
        return noofseats;
    }

    public String getGrid() {
        return grid;
    }

    public HashMap<Character, ArrayList<String>> getSeatpatters() {
        return seatpatters;
    }
}
