import java.util.*;


public class Statistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        double N[] = new double[num];
      
        double sum = 0;
        
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;

        for(int i = 0; i < num; i++){
            N[i] = scan.nextDouble();
        }

        Arrays.sort(N);

 
        for(int i = 0; i < num; i++){
            sum += N[i];

            int m = num / 2;
            second = (int)N[m];  //중앙값

            fourth = (int)(N[num - 1] - N[0]);  //범위           
        }

        first = (int)Math.round(sum/num); //산술평균 
                                          //math.round 소수 첫번째 자리 반올림
        
        int freq[] = new int[8001]; // 빈도 계산용 변수-4000~4000범위를 위해 사용 인덱스 4000을 0으로 사용 
        
        for (double  d : N) {
            freq[(int)d + 4000]++; // 빈도 입력
        } 
        
        int maxFreq = 0; // 최대 빈도 
        int maxIndex = 0; // 최대 빈도 값을 가진 인덱스 
        
        for (int i = 0; i < 8001; i++) // 최대 빈도 구하기 

        if (freq[i] > maxFreq) {
            maxFreq = freq[i];
        }
            
        boolean twice = false; // 두 번째를 구별하기 위한 변수 중복될때 한번 확인 . false 최빈값이 3이 최빈이면 0번째 3 1번째 3 2번째 3
        
        for (int i=0; i<8001; i++)
        { 
            if (freq[i] == maxFreq) { // 최빈값이면  몇번나왔냐가 freq 값들의 빈출 횟수 i 값 모드 
                if (twice){
                    maxIndex = i - 4000;
                    break; 
                } 
                maxIndex = i - 4000;
                twice = true; // 플래그 세우기 true 바꿔주면 반복된거 3번째 나오면 실행을 안한다.
            } 
        } 
        
        if(num == 1)
          third = (int)N[0];
        else
          third = maxIndex;


        System.out.println(first + "\n" + second + "\n" + third + "\n" + fourth + "\n");
        scan.close();
    }
}

