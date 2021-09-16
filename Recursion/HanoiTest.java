import java.util.*;

//점화식 an = 2의 n제곱 -1
public class HanoiTest //백준제출 할 때 Main으로
{
    public static StringBuilder sb = new StringBuilder();  //StringBuilder -> 성능이 뛰어남
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        sb.append((int) (Math.pow(2, n) - 1)).append('\n'); //append는 기존 문자열의 뒤쪽에 문자열을 추가하는 기능, 2의 n제곱 - 1

        Hanoi(n, 1, 2, 3);
        System.out.println(sb);
        
    }
    public static void Hanoi(int n, int s, int m, int t) //n : 원판 갯수 , s : 시작 , m : 중간 , t : 목적지
    {
        
        //1개일 때
        if(n == 1)
        {
            sb.append(s + " " + t + "\n");
            return;
        }

        //A -> B로 n-1 개 옮기기
        Hanoi(n - 1, s, t, m);

        //A -> C로 가장 큰 원판 한개
        sb.append(s + " " + t + '\n');

        //B -> C로 n - 1 개 옮기기
        Hanoi(n - 1, m, s, t);
    }
    
}