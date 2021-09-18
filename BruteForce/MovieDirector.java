import java.util.*;

public class MovieDirector {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int num = 666;
        int count = 1;

        while(count != N)
        {
            num++;
            if(String.valueOf(num).contains("666")){
                count++;
            }
        }
        System.out.println(num);
        scan.close();
    }
    
}
