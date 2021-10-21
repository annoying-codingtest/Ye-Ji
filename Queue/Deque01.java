import java.util.*;
import java.io.*;

public class Deque01 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        Deque<Integer> deque = new LinkedList<>();
 
         int num = Integer.parseInt(br.readLine());

         StringTokenizer st = null;
         
 
         for(int i = 0; i < num; i++){
             st = new StringTokenizer(br.readLine(), " ");
 
             switch(st.nextToken()){
                 case "push_front" :
                 deque.addFirst(Integer.parseInt(st.nextToken()));
                 break;

                 case "push_back" :
                 deque.addLast(Integer.parseInt(st.nextToken()));
                 break;
 

                 case "pop_front" :
                 if(deque.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(deque.removeFirst() + "\n");
                 }
                 break;

                 case "pop_back" :
                 if(deque.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(deque.removeLast() + "\n");
                 }
                 break;
 
                 case "size" :
                 bw.write(deque.size() + "\n");
                 break;
 
                 case "empty":
                 if(deque.isEmpty()){
                     bw.write(1 + "\n");
                 }
                 else{
                     bw.write(0 + "\n");
                 }
                 break;
                
                 case "front":
                 if(deque.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(deque.getFirst() + "\n");  
                 }
                 break;
                 
                 case "back":
                 if(deque.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(deque.getLast()+"\n");
                     
                 }
                 break;
               
             }
         }
         bw.flush();
         bw.close();
     }
 }

