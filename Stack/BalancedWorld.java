import java.util.*;
import java.io.*;

public class BalancedWorld{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      
      
        while(true){
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            boolean balance = true;
           

            if(s.equals(".")){
                break;
            }
             
            for(int j = 0; j < s.length(); j++){
                char c = s.charAt(j); //String 갯수만큼 char.
                if(c == '(' || c == '[') {  // ( 들가면 넣고
                    stack.push(c);
                }
                else if(c == ')'){
                    if(stack.isEmpty() || stack.peek() == '[' ){
                        balance = false;
                    }
                    else if(!stack.isEmpty() && stack.peek() == '('){
                        stack.pop();
                    }
                }
                else if(c == ']') {
                    if(stack.isEmpty() || stack.peek() == '('){
                        balance = false;
                    }
                    else if(!stack.isEmpty() && stack.peek() == '['){
                        stack.pop();
                    }
                }
            }
            if(stack.isEmpty() &&  balance == true ){
                bw.write("yes" + "\n");
            }
            else {
                bw.write("no" + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
