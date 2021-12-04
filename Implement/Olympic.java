package Implement;
import java.io.*;
import java.util.StringTokenizer;

public class Olympic {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int array[][] = new int[n][4];

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());

            for(int j = 0; j < 3; j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.print(solve(array, k));
    }
    
    public static int solve(int array[][], int k){
        
        int rank = 1;
        int check = 0;
    
        for(int i = 0; i < array.length; i++){
            if(array[i][0] == k){
                check = i;
            }
        }
        for(int arr[] : array){
            if(arr[1] > array[check][1]){
                rank++;
            }
            else if(arr[1] == array[check][1]){
                if(arr[2] > array[check][2]){
                    rank++;;
                }
                else if(arr[2] == array[check][2] && arr[3] > array[check][3]){
                    rank++;
                }
            }
        }
        return rank;
    }
}
