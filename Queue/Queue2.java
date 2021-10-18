import java.util.*;
import java.io.*;

public class Queue2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
        Queue<Integer> queue = new LinkedList<>();
 
         int num = Integer.parseInt(br.readLine());
         int last = 0; //큐의 마지막 값(최근에 넣은 값) 구하기 위한 변수

         StringTokenizer st = null;
         
 
         for(int i = 0; i < num; i++){
             st = new StringTokenizer(br.readLine(), " ");
 
             switch(st.nextToken()){
                 case "push" :
                 last = Integer.parseInt(st.nextToken());
                 queue.add(last);
                 break;
 
                 case "pop" :
                 if(queue.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(queue.remove() + "\n");
                 }
                 break;
 
                 case "size" :
                 bw.write(queue.size() + "\n");
                 break;
 
                 case "empty":
                 if(queue.isEmpty()){
                     bw.write(1 + "\n");
                 }
                 else{
                     bw.write(0 + "\n");
                 }
                 break;
                
                 case "front":
                 if(queue.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(queue.peek() + "\n");  
                 }
                 break;
                 
                 case "back":
                 if(queue.size() == 0){
                     bw.write(-1 + "\n");
                 }
                 else{
                     bw.write(last+"\n");
                     
                 }
                 break;
               
             }
         }
         bw.flush();
         bw.close();
     }
 }