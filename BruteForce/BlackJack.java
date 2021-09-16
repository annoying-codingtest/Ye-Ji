import java.util.*;

public class BlackJack {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt(); //카드의 갯수
        int M = scan.nextInt(); //3개의 합이 넘지 않아야 하는 수
        int card[] = new int[N]; 

        for(int i = 0; i < N; i++)
        {
            card[i] = scan.nextInt();
        }

        System.out.println(Result(N, M, card));
       
        scan.close();
        
    }
    public static int Result(int N, int M, int[] card)
    {
       int sum = 0; //세 수의 합
       int result = 0;


        for(int i = 0; i < N - 2; i++){   //3개 선택 첫번째 카드 N - 2까지
            for(int j = i + 1; j < N - 1; j++){  //두번째 카드, 첫번째 다음카드부터 -> i + 1, N - 1까지
                for( int k = j + 1; k < N; k++){ //세번째 카드, 두번째 다음카드부터 -> j + 1, N까지
                    
                    sum = card[i] + card[j] + card[k];

                    if(M == sum){ //M과 세 카드의 합이 같을 때                     
                      return sum;
                       
                    }

                    if(result < sum && sum < M){ //세 카드의 합이 전 합보다 크면서 M보다 작으면 갱신
                        result = sum;
                    }
                }
            }
        }
        return result;
    }

}