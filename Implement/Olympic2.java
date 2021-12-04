package Implement;
import java.util.*;

public class Olympic2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int result = 1;
        int m[][] = new int[n][4];
        long score_m[][] = new long[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                m[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            score_m[i][0] = m[i][0];
            score_m[i][1] = (m[i][1] * 1000000000000L) + (m[i][2] * 1000000) + (m[i][3] * 1);   //?????????????????????????????//
        }
        for(int i = 0; i < n; i++){
            if(score_m[i][0] == k){
                for(int j = 0; j < n; j++){
                    if(score_m[i][1] < score_m[j][1]){
                        result++;
                    }
                }
                break;
            }
        }
        System.out.println(result);
    }
}
