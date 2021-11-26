package Implement;
import java.util.*;


public class Alarm {
    public static void main(String[] args) {
        

    Scanner scan = new Scanner(System.in);

    int hour = scan.nextInt();
    int minute = scan.nextInt();

    if(minute < 45){
        hour = hour - 1;
        minute = 60 - (45 - minute);
        
        
        if(hour < 0){
            hour = 23;
        }

        System.out.println(hour + " " + minute);
    }
    else{
        System.out.println(hour + " " + (minute - 45));
    }
    scan.close();
}
}