import java.util.Scanner;
public class HotelReservationSystem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        booking manager=new booking();
        while(true){
             System.out.println( "\nHOTEL RESERVATION SYSTEM");
             System.out.println("1. View Rooms");
             System.out.println("2. Book Room");
             System.out.println("3. Cancel Booking");
             System.out.println("4. Exit");
             int choice=sc.nextInt();
             switch(choice){
                case 1:
                    manager.showavailablerooms();
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("enter customer name:");
                    String name=sc.nextLine();
                    System.out.println("enter room no:");
                    int room=sc.nextInt();
                    System.out.println("procced payment:(yes/no)");
                    String pay=sc.nextLine();
                    if(pay.equalsIgnoreCase("yes")){
                        manager.bookroom(name,room);
                    }
                    break;
                case 3:
                    System.out.println("enter room no:");
                    int cancelroom=sc.nextInt();
                    manager.cancelbooking(cancelroom);
                    break;
                case 4:
                    System.exit(0);
             }
             
        }
    }

}