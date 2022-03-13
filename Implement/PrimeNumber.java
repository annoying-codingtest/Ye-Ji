package Implement;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int ans = 0;

        for(int i = 1; i <= count; i++){
            int number = scan.nextInt();
            int c = 0;

            for (int j = 2; j <= number; j++){
                if(number % j == 0){ //약수 갯수
                    c++;
                }
            }
           
            if(c == 1){ //약수 개수 1이면 ans++
                ans++;
            }

        }
        System.out.println(ans);
    }
}
