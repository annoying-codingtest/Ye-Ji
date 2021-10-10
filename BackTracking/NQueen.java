//////////////////////////////////////////////////////보완. 

import java.util.*;

public class NQueen {
    
    public static int[] arr;      
    public static int N;          //체스판의 크기
    public static int count = 0;  //방법의 개수
//가로 세로 대각선 모두 백트래킹 -> 가지치기 해서 풀기
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();        
        arr = new int[N];          //arr[1] -> 1열 

        nQueen(0);
        System.out.println(count);

        scan.close();
    }
    public static void nQueen(int d){ 
        //다 채우면 카운트 + 1, 리턴  
        if(d == N){
            count ++; //경우의 수 증가
            return;
        }
  
        for(int i = 0; i < N; i++){  
            arr[d] = i;
            //해당 열에서 i번째 행에 놓을 수 있는 지 체크
            if(Possibility(d)){  //이 위치에 퀸을 놓을 수 있다면 
                nQueen(d + 1);   //다시 dfs 로 다음 퀸을 놓으러 간다.
            }
        }
    }
    //퀸 배치 가능 여부 검사
    public static boolean Possibility(int c){
        
        for(int i = 0; i < c; i++){
           
            //해당 열의 행과 i열의 행이 일치할 경우(같은 행에 존재) 배치할 수 없음 -> false
            if(arr[c] == arr[i]){
                return false;
            }
       
        //대각선 (열의 차와 행의 차가 같을 경우)
        else if(Math.abs(c - i) == Math.abs(arr[c] - arr[i])){
            return false; //서로 대각선에 위치하고 있으면 퀸을 배치할 수 없으므로 false
            }
         }
    return true;
    }
}