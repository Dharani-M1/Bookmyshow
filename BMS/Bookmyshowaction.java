import java.util.*;
public class Bookmyshowaction {
    private Adminactions adminactions;
    private Useractions useractions;

    public Bookmyshowaction(){
        this.adminactions=new Adminactions();
        this.useractions=new Useractions();

        Bookmyshow.getAdmins().add(new Admin("admin","1234"));
        Bookmyshow.getAdmins().add(new Admin("admin1","1234"));


    }

    public void start(){
        Scanner sc =new Scanner(System.in);

        boolean exit=false;
        System.out.println("***************************************************************");
        System.out.println("**********************  BOOK MY SHOW   ************************");
        System.out.println("***************************************************************");


        while (!exit){

            System.out.println("---------------------------------------------------------------");
            System.out.println("1.Admin Login");
            System.out.println("2.Customer Login");
            System.out.println("3.Exit");
            System.out.print("Enter Your Choice:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    Admin a=Adminactions.adminlog(sc);
                    if(a!=null){
                        adminactionsmenu(sc,adminactions,a);
                    }

                    break;

                case 2:

                    System.out.println("Enter 1 if you are a Exsisting User or Enter 2 to create a new Account:");
                    String num=sc.nextLine();
                    if(num.equals("1")) {
                        User c = Useractions.customerlog(sc);
                        if(c!=null){
                                useractionsmenu(sc,useractions,c);
                        }
                    } else if (num.equals("2")) {
                        User c=Useractions.createcustermor(sc);

                            useractionsmenu(sc,useractions,c);

                    }
                    else{
                        System.out.println("Invalid choice");
                    }

                    break;

                case 3:
                    System.out.println("Exiting Bookmyshow... ");
                    exit=true;
                    break;

                default:
                    System.out.println("Invalid Choice, Enter Valid Choice ");
                    break;



            }


        }


    }

    private void adminactionsmenu(Scanner sc,Adminactions adminactions,Admin admin){
        System.out.println("1.Add");
    }
    private void useractionsmenu(Scanner sc,Useractions useractions,User user){

        System.out.println("1.Add");
    }
}
