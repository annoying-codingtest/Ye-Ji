import java.util.*;

public class NnM2 {
    public static int[] arr;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        arr = new int[m];


        dfs(n, m, 1, 0);

        scan.close();
    }
    public static void dfs (int n, int m, int a, int d){

        //깊이가 m이랑 같을 경우 출력
        if(d == m){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        //i ->  a부터 탐색.
        for(int i = a; i <= n; i++){
            arr[d] = i; //현재 깊이를 i로 하여 해당 위치에 i값을 담는다.
            dfs(n, m, i + 1, d + 1);    //재귀호출, 현재 i값보다 다음 재귀에서 커야 하므로 i + 1 넘겨줌. 깊이도 + 1 증가시켜서 재귀호출
        }
    }
}
