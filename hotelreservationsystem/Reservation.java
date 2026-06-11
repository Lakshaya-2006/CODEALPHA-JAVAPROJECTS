public class Reservation{
        private String cusname;
        private int roomno;
        Reservation(String cusname,int roomno){
            this.cusname=cusname;
            this.roomno=roomno;
        }
        public String getcusname(){
            return cusname;
        }
        public int getroomno(){
            return roomno;
        }
}