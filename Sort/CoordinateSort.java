import java.util.*;

public class CoordinateSort{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int c [][] = new int[n][2];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
            c[i][j] = scan.nextInt();
            }
        }

     
        Arrays.sort(c, new Comparator<int[]>(){ //Comparator 인터페이스 재정의
            @Override
            public int compare(int[] c1, int[] c2){
                if(c1[0] == c2[0]){   //x좌표 값이 같다면 y좌표 기준으로 정렬
                    return c1[1] - c2[1]; //c1이 다음 행이므로 다음행의 y좌표가 기준 c2행의 y좌표보다 작으면 -1 리턴 -> 두 행의 위치를 바꿈
                }
                else{
                    return c1[0] - c2[0]; //나머지 x좌표 기준 정렬
                }
            }
        });

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(c[i][j] + " ");
                
            }
            System.out.println();
        }
      /* StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            sb.append(c[i][0] + " " + c[i][1]).append("\n");
        }
        System.out.print(sb);*/
        scan.close();
    }
}