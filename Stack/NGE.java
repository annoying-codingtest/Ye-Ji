//스택 사용으로 비교 횟수 줄이기

import java.io.*;
import java.util.*;
public class NGE {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
    
        
        int dt[] = new int[num];
        int result[] = new int[num];
        
        String temp [] = br.readLine().split(" ");

      
        for(int i = 0; i < num; i++){  //string -> int
           dt[i] = Integer.parseInt(temp[i]);
        }
        stack.push(0);

        for(int i = 1; i < num; i++){
            if(stack.isEmpty()){
                stack.push(i);  //스택이 비어있으면 인덱스 푸쉬
            }
            while(stack.size() != 0 && dt[stack.peek()] < dt[i]){ //비어있지 않고 숫자가 인덱스 가장 위쪽 숫자보다 크면
                result[stack.pop()] = dt[i];//결과 배열 중 가장 위쪽 숫자와 같은 인덱스에 i번째 숫자
            }
            stack.push(i); //다음에 비교할 숫자 스택에
        }
        while(!stack.isEmpty()){ //스택 비어있지 않으면
            result[stack.pop()] = -1; //스택에 쌓인 index에 -1
        }
        for(int i = 0; i < num; i++){
            bw.write(result[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
    
}
    
 
