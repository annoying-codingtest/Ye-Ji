import java.util.*;
import java.io.*;

public class PrinterQ {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
       
        Queue<Integer> queue = new LinkedList<>();
        
        int C = Integer.parseInt(br.readLine()); //C개의 테스트 케이스
        int N = 0; //큐에 N개의 데이터가 들어간다.
        int M = 0; //M번째 원소에 있는 데이터가 출력되는 순서
        int V = 0;
        for(int i = 0; i < C; i++){
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i++){
            V = Integer.parseInt(st.nextToken());
            queue.add(i);
        }

        


    }
    
}
