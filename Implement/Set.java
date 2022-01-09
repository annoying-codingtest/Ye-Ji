package Implement;

import java.io.*;
import java.util.*;

public class Set {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
      
     
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());;
       
        int M = Integer.parseInt(br.readLine());
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < M; i++){
            String c = st.nextToken();
            int x = 0;

            switch(c){
                case "add" :
                    x = Integer.parseInt(st.nextToken());
                    set.add(x);
                    break;
                
                case "remove":
                    x = Integer.parseInt(st.nextToken());
                    set.remove(x);
                    break;
                
                case "check" :
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x)){
                        sb.append("1\n");
                    }
                    else{
                        sb.append("0\n");
                    }
                    break;

                case "toggle" :
                    x = Integer.parseInt(st.nextToken());
                    if(set.contains(x)){
                        set.remove(x);
                    }
                    else {
                        set.add(x);
                    }
                    break; 


                case "all" :
                    for(int j = 0; j < 20; j++){
                        set.add(j + 1);
                    }
                    break;

                case "empty" :
                    set.clear();
                    break;
            }

        }
        System.out.print(sb.toString());
    }
}