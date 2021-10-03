import java.util.*;

public class NnM3 {
    public static int[] arr;
    public static int n, m;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        //중복 조합

        Scanner scan = new Scanner(System.in);

         n = scan.nextInt(); //1부터 n 까지 조합
         m = scan.nextInt(); //m개 선택해서 조합

        arr = new int[m];


        dfs(0);
        System.out.print(sb);

        scan.close();
    }
    public static void dfs (int d){

        //깊이가 m이랑 같을 경우 출력
        //깊이가 최대일 경우 리턴. 
        if(d == m){
            for(int i : arr){
              //  System.out.print(i + " "); --> 시간초과 
              sb.append(i + " ");
            }
            sb.append("\n");           
            return;
        }

        for(int i = 1; i <= n; i++){
            arr[d] = i;
            dfs(d + 1);  
        }
    }
}
