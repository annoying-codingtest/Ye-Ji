import java.util.*;
public class AgeSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        String p[][] = new String[n][2];


        for(int i = 0; i < n; i ++){
            for(int j = 0; j < 2; j++){
                p[i][j] = scan.next(); //입력받기
            }
        }  // p[i][0] 과 p[i+1][0]만 비교하면 됨

        Arrays.sort(p, new Comparator<String[]>(){ //0 나이, 1 이름
            @Override
            public int compare(String[] s1, String s2[]){
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        for(int i = 0; i < n; i++){
            System.out.println(p[i][0] + " "+ p[i][1]);
        }

        scan.close();
    }
}
