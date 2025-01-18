import java.util.HashMap;
import java.util.Scanner;

public class Theater {

    private String treatername;
    private String location;
    private HashMap<String,Screen>screenHashMap;



public Theater(String treatername,String location,HashMap<String,Screen>screenHashMap){
    this.treatername=treatername;
    this.location=location;
    this.screenHashMap=screenHashMap;
}

    public String getLocation() {
        return location;
    }

    public String getTreatername() {
        return treatername;
    }

    public HashMap<String,Screen> getScreenHashMap() {
        return screenHashMap;
    }
}