import java.io.*;
import java.util.*;

public class Stack01  {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Integer> stack = new Stack<>(); //자바 스택 클래스 사용

        int num = Integer.parseInt(br.readLine());
        
        StringTokenizer st = null;
        

        for(int i = 0; i < num; i++){
            st = new StringTokenizer(br.readLine(), " ");

            switch(st.nextToken()){
                case "push" :
                stack.push(Integer.parseInt(st.nextToken()));
                break;

                case "pop" :
                if(stack.size() == 0){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(stack.pop() + "\n");
                }
                break;

                case "size" :
                bw.write(stack.size() + "\n");
                break;

                case "empty":
                if(stack.isEmpty()){
                    bw.write(1 + "\n");
                }
                else{
                    bw.write(0 + "\n");
                }
                break;

                case "top":
                if(stack.size() == 0){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(stack.peek() + "\n");  
                }
                break;
            }
        }
        bw.flush();
        bw.close();
    }
}