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

     
        Arrays.sort(c, new Comparator<int[]>(){
            @Override
            public int compare(int[] c1, int[] c2){
                if(c1[0] == c2[0]){
                    return c1[1] - c2[1];
                }
                else{
                    return c1[0] - c2[0];
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