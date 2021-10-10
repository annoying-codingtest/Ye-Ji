import java.util.*;

public class Operator { 
    
    public static int MAX = Integer.MIN_VALUE; //최댓값
    public static int MIN = Integer.MAX_VALUE; //최솟값

    public static int N; //숫자 개수
    public static int number[]; //숫자
    public static int o[] = new int[4]; //연산자 개수

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      N = scan.nextInt();
      number = new int[N];

      //숫자 입력
      for(int i = 0; i < N; i++){
          number[i] = scan.nextInt();
      }
      
      //연산자 입력
      for(int i = 0; i < 4; i++){
          o[i] = scan.nextInt();
      }

      dfs(number[0],1);

      System.out.println(MAX);
      System.out.println(MIN);
      
      scan.close();
    }

    public static void dfs(int n, int w){
        if(w == N){
            MAX = Math.max(MAX, n); //두 인자 중 큰 값 리턴.
            MIN = Math.min(MIN, n);
            return;
        }

        for(int i = 0; i < 4; i ++){
            if(o[i] > 0){
                o[i] --;

                switch (i) {
                    case 0: dfs(n + number[w], w + 1);
                    break;
                    case 1: dfs(n - number[w], w + 1);
                    break;
                    case 2: dfs(n * number[w], w + 1);
                    break;
                    case 3: dfs(n / number[w], w + 1);
                    break;
                }
                //재귀 종료되면 다시 해당 연산자 개수 복구.
                o[i] ++;

            }
        }
    }
}
