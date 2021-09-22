import java.util.*;

public class SortInside {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number = scan.next();
        //toCharArray() -> String 을 char형 배열로
        char array[] = number.toCharArray();

        Arrays.sort(array); //오름차순

        //System.out.println(array);

        for(int i = (array.length) - 1; i >= 0; i--){
            System.out.print(array[i]);
        } //거꾸로 출력
       

        scan.close();

    }
    
}
