import java.util.*;

public class SortNumber02 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        StringBuilder s = new StringBuilder(); //효율을 위해

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < num; i++){
            list.add(scan.nextInt());
        }
        
        Collections.sort(list); //Arrays.sort() -> 시간초과

        for(int i : list){
             s.append(i).append('\n');
        }
        System.out.println(s);
    
        scan.close();
    }
}