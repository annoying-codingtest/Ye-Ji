//백트래킹 방법중 하나가 DFS(깊이우선탐색)
import java.util.*;

public class NnM1 {
    public static int[] arr;
    public static boolean[] visit;
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
      
      //  int arr[];
      //  boolean visit[];

        int n = scan.nextInt();
        int m = scan.nextInt();

        arr = new int[m];
        visit = new boolean[n];  //방문 상태를 판단하기 위한 visit[]

        
        //int arr[] = new int[m];
        //boolean visit = new boolean[n];
        //시간초과 에러

        dfs(n, m, 0);

        scan.close();
    }
    public static void dfs (int n, int m, int d){
      
        //재귀 깊이가 m과 같아지면 탐색과정에서 담았던 배열 출력
        //재귀 끝낼 조건
        if(d == m){
            for(int i : arr){
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        }

        //해당 i 사용 했는지
        for(int i = 0; i < n; i++){
            if(!visit[i]){  //방문하지 않는 노드 일 때 재귀 
                visit[i] = true;   //해당노드를 방문상태로 변경
                arr[d] = i + 1;    //깊이를 index로 하여 i+1 값 저장
                dfs(n, m , d + 1);  //다음 자식 노드 방문을 위해 깊이 1 증가시키며 재귀 호출
                visit[i] = false;  //자식노드 방문이 끝나고 돌아오면 방문노드 방문하지 않은 상태로 변경
            }
        }
    }
}