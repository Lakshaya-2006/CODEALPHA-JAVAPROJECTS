import java.io.*;
import java.util.*;

public class booking{
      ArrayList<Room> rooms =new ArrayList<>();
      ArrayList<Reservation> reservations=new ArrayList<>();
      public booking(){
        rooms.add(new Room(101,"standard",1500));
        rooms.add(new Room(102,"standard",1500));
        rooms.add(new Room(201,"delux",2500));
        rooms.add(new Room(202,"delux",2500));
        rooms.add(new Room(301,"suite",3000));

      }
      public void showavailablerooms(){
        for(Room room:rooms){
            if(room.isavailable()){
                System.out.println(room.getroomno()+" "+room.getcategory()+" "+"RS."+
                room.getprice());
            }
        }
      }
      public void bookroom(String name,int roomno){
        for(Room room:rooms){
            if(room.getroomno()==roomno && room.isavailable()){
                room.setavailable(false);
                reservations.add(new Reservation(name,roomno));
                savebooking(name,roomno);
                System.out.println("Booking successful");
                return;
            }
        }
        System.out.println("Room not available");


      }
      public void cancelbooking(int roomno){
        Iterator<Reservation> iterator=reservations.iterator();
        while(iterator.hasNext()){
            Reservation reservation=iterator.next();
            if(reservation.getroomno()==roomno){
                iterator.remove();
                for(Room room:rooms){
                    if(room.getroomno()==roomno){
                        room.setavailable(true);
                    }
                }
                System.out.println("Booking Cancelled");
                return;
            }
        }
        System.out.println("Reservation not found!");

      }
      private void savebooking(String name,int roomno){
        try(FileWriter fw=new FileWriter("Booking.txt",true)){
            fw.write(name+","+roomno+"\n");

        }catch(Exception e){
            System.out.println(e);
        }
      }





}