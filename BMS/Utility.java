import java.util.ArrayList;
import java.util.HashMap;

public class Utility {
    public static HashMap<Character, ArrayList<String>>patters(int noofseats,String scrgrid){
        int count=noofseats;
        String[]splitscr=scrgrid.split("\\*");
        int sum=0;
        int counter=0;
        for(String grid:splitscr){
            int tem=Integer.parseInt(grid);
            sum=sum+tem;
            counter++;
        }
        if(count%sum==0){
            var arrangeseat=new HashMap<Character,ArrayList<String>>();
            char ch='A';
            while (count>0){
                ArrayList<String>row=new ArrayList<>();

                for(int i=0;i<splitscr.length;i++){
                    for (int j=0;j<Integer.parseInt(splitscr[i]);j++){
                        row.add("[ ]");
                    }
                    if(i<scrgrid.length()-counter){
                        row.add("<=====>");
                    }

                }
                arrangeseat.put(ch,row);
                ch++;
                count=count-sum;

            }
            return arrangeseat;

        }
        System.out.println("Invalid Grid");
        return null;
    }

}
