import java.util.*;
public class BruteForceSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt(); 
        int result = 0;


        //1. 1 ~ N 까지 for문으로 대입 
        //2. 탐색하다가 생성자를 찾아 1번이랑 생성자랑 같으면 종료 ,찾지못하면 0 출력
       
        
        for(int i = 0; i < N; i++){
            int num = i;  //num에 i 대입해 비교 
            int sum = 0;

            while(num != 0){
                sum += num % 10; //각 자릿수 합
                num /= 10; //10을 나눈 몫
            }

            if(sum + i == N){ //자릿수의 합 + 생성자가 분해합이 같은지 확인 
                result = i;
                break;
            }
        }
        System.out.println(result);
        scan.close();
    }
}