import java.util.*;
import java.io.*;
public class StackSequence {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        
 
        int last = 0; //마지막 위치
        Stack<Integer> stack = new Stack<>();


        while (num-- > 0)
        {
            int input = Integer.parseInt(br.readLine());  //수 입력 받고.
            
            if(input > last){
            for(int i = last + 1; i <= input; i++){
                 stack.push(i);   //스택에 넣는다
                 sb.append("+\n");
                }
            last = input;
            }
            else if(stack.peek() != input){
                System.out.println("NO");
                return;
            }
        stack.pop();
        sb.append("-\n");
    }    
    System.out.println(sb);

    }
}       