import java.util.*;
import java.io.*;

public class RotationQ{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        Deque<Integer> deque = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = 0; 

        for(int i = 0; i <= N; i++){
            deque.add(i);
        }
        for(int i = 0; i < M; i++){
            K = Integer.parseInt(st.nextToken());
        }

        while(true){
            
        }


    }
}