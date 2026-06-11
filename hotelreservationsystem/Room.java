public class Room{
    private int roomno;
    private String category;
    private Double price;
    private boolean available;
    public Room(int roomno,String category,double price){
        this.roomno=roomno;
        this.category=category;
        this.price=price;
        this.available=true;
    }

    public int getroomno(){
        return roomno;
    }
    public String getcategory(){
        return category;
    }
    public double getprice(){
        return price;
    }
    public boolean isavailable(){
        return available;
    }
    public void setavailable(boolean available){
        this.available=available;
    }

}