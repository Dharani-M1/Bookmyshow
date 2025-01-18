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

            System.out.println("--------------------------------------------------------------");
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
                    else{
                        System.out.println("Invalid Admin");
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
                        else {
                            System.out.println("User Account Not Found.");
                        }
                    } else if (num.equals("2")) {
                        User c=Useractions.createcustermor(sc);
                        if (c!=null) {
                            System.out.println("User Account Created Sucessfully");
                            useractionsmenu(sc, useractions, c);
                        }
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
        boolean exit=false;

        while (!exit) {
            System.out.println("1.Add theater");
            System.out.println("2.Add Movie");
            System.out.println("3.View Theater");
            System.out.println("4.");
            System.out.println("5.");
            System.out.print("Enter Your Choice:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    adminactions.addtheater(sc);
                    break;
                case 2:
                    adminactions.addmovie(sc);
                    break;
                case 3:
                    adminactions.viewtheater();

                    break;
                case 4:

                    break;

                case 5:
                    exit=true;
                    break;

                default:
                    System.out.println("Invalid Choice, Enter Valid Choice ");
                    break;



            }
        }

    }
    private void useractionsmenu(Scanner sc,Useractions useractions,User user){
        System.out.println("1.Add");

        System.out.print("Enter Your Choice:");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4 :

                break;


            default:
                System.out.println("Invalid Choice, Enter Valid Choice ");
                break;


        }

    }
}
