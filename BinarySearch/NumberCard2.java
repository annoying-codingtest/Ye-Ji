package BinarySearch;
import java.util.*;
import java.io.*;

public class NumberCard2 {
    public static void main(String[] args) throws IOException{
        HashMap<Integer, Integer> map = new HashMap<>();
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();

       
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1); //getOrDefault -> 찾는 키(num)가 존재하면 +1 반환 아니면 디퐅트 값 반환 -> 디폴트 0
        }//num이라는 키, num 값이 존재하면 num 넣어주고 없다면 0, 그리고 + 1



        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(num, 0) + " "); //sb에 이어서
        }
        System.out.println(sb);
    }
}
