import java.util.ArrayList;
import java.util.Scanner;
 
public class studentgradetracker{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        ArrayList<String> stunames=new ArrayList<>();
        ArrayList<Double> stugrades=new ArrayList<>();

        System.out.println("enter then no of students");
        int n =s.nextInt();
        s.nextLine();

        for(int i=0;i<n;i++){
            System.out.println("student. "+ (i+1));
             System.out.println("enter the student name: ");
             String name=s.nextLine();

             System.out.println("enter the grade: ");
             double grade=s.nextDouble();
             s.nextLine();

             stunames.add(name);
             stugrades.add(grade);
        }
        double total=0;
        double highest=stugrades.get(0);
        double lowest=stugrades.get(0);

        for(double grade : stugrades){
            total+=grade;
        
        if(grade>highest){
            highest=grade;
        }
        if(grade<lowest){
            lowest=grade;
        }
    }
    double avg=total/stugrades.size();

    for(int i=0;i<stunames.size();i++){
        System.out.println((i+1)+"."+stunames.get(i)+"-"+stugrades.get(i));
    }
    System.out.println("\n----- SUMMARY -----");
        System.out.println("Average Score : " + avg);
        System.out.println("Highest Score : " + highest);
        System.out.println("Lowest Score  : " + lowest);




    }
}