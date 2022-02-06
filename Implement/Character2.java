package Implement;

import java.util.Scanner;
import java.util.*;

public class Character2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Stack<Character> stack = new Stack<>();

        //태그 안인지 밖인지 안이면 true 밖이면 false
        boolean inout = false;

        for(int i = 0 ; i < s.length(); i++){
            if(s.charAt(i) == '<'){ 
                inout = true;//태그 안이니까 true

                while(!stack.isEmpty()){
                    System.out.print(stack.pop());//스택에 있는거 꺼내면서 출력
                }
                System.out.print(s.charAt(i)); //<
            }

            else if(s.charAt(i) == '>'){
                inout = false;
                System.out.print(s.charAt(i));
            }

            else if(inout == true){
                System.out.print(s.charAt(i)); //태그 안에있으니까 출력
            }

            else if(inout == false){
                if(s.charAt(i) == ' '){//공백이면
                    while(!stack.isEmpty()){//스택에 있는거 다 출력
                        System.out.print(stack.pop());
                    }
                    System.out.print(s.charAt(i));
                }
                else{//공백아니면 스택에 넣음
                    stack.push(s.charAt(i));
                }
            }
        }
        
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }

    }
}
