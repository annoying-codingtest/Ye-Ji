import java.util.*;

public class Bulk {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         int n = scan.nextInt();
        
         int [][] array = new int [n][2];


         for(int i = 0; i < n; i++){
            array[i][0] = scan.nextInt(); //몸무게
            array[i][1] = scan.nextInt(); //키
         }

         for(int i = 0; i < n; i++){
             int count = 1;
             for(int j = 0; j < n; j++){
                 if(i == j){
                     continue;
                 }
                 else if(array[i][0] < array[j][0] && array[i][1] < array[j][1]){
                     count++;
                 }
             }
             
         System.out.print(count + " ");
         }
    
         scan.close();
     }
}