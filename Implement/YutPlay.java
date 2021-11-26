package Implement;
import java.util.*;

public class YutPlay {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
       
        for(int i = 0; i < 3; i++){
            int count = 0;
            for(int j = 0; j < 4; j++){
            int n = scan.nextInt();
            
            if(n == 0){
                count++;
            }
        }

            if(count == 1){
               System.out.println("A");
            }
            else if(count == 2){
                System.out.println("B");
            }
            else if(count == 3){
                System.out.println("C");
            }
            else if(count == 4){
                System.out.println("D");
            }
            else if(count == 0){
                System.out.println("E");
            }
        }
    }
}
