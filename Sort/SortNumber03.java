import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class SortNumber03 {
    public static void main (String[] args) throws IOException  {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        
        int num = Integer.parseInt(bf.readLine()); //In
        int list[] = new int[num];
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < num; i++)
        {
            list[i] = Integer.parseInt(bf.readLine());
        }
       Arrays.sort(list); //좋지 않은 성능이 될 수도 있음
		
        for(int i : list){
          s.append(i).append('\n');
       }
       System.out.println(s);

    }
}
