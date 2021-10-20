import java.util.*;
import java.io.*;

public class Josephus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine() + " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();


        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        sb.append("<");
        while(queue.size() != 0){
            for(int i = 1; i < K; i++){
                int back = queue.poll();
                queue.add(back);
            }
            if(queue.size() == 1){
                sb.append(queue.poll());
            }
            else{ sb.append(queue.poll()).append(", ");}
           
        }
        sb.append(">");
        System.out.print(sb);
    }
    
}
