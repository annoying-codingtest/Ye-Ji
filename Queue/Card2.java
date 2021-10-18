import java.util.*;
import java.io.*;

public class Card2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        Queue<Integer> queue = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());
     
 
        for(int i = 1; i <= N; i++){
            queue.add(i);
        }
        
        while(true){
            if(queue.size() == 1){
                break;
            }
            queue.remove();
            queue.add(queue.poll());
         
        }
        bw.write(queue.peek() + "\n");
        bw.flush();
        bw.close();
    }
}
