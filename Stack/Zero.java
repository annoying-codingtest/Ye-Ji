import java.io.*;
import java.util.*;

public class Zero{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Stack<Integer> stack = new Stack<>(); //자바 스택 클래스 사용
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
       

        for(int i = 0; i < num; i++){
            int a = Integer.parseInt(br.readLine());
            if(a == 0){
                stack.pop();
            }
            else{
                stack.push(a);
            }
        }
        while(!stack.isEmpty()){
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}