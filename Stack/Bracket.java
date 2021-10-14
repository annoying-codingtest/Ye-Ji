import java.io.*;
import java.util.*;

public class Bracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num = Integer.parseInt(br.readLine());     
        

        for(int i = 0; i < num; i++){
            Stack<Character> stack = new Stack<>();
            String b = br.readLine();
            boolean vps = true;

            for(int j = 0; j < b.length(); j++){
                char c = b.charAt(j); //String 갯수만큼 char.
                if(c == '(') {  // ( 들가면 넣고
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty()){  //)가 들어왔는데 스택에 아무것도 없으면 vps -> false로 
                        vps = false;
                    }
                    else if(!stack.isEmpty()){   
                     stack.pop();
                   
                    }
                }   
            }
            if(stack.isEmpty() && vps == true ){
                bw.write("YES" + "\n");
       
            }
            else {
                bw.write("NO" + "\n");
            }
       
         }
       
         bw.flush();
         bw.close();
        
    }
}
