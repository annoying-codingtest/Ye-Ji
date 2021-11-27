package Implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class ReadingVertically {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String array [][] = new String[15][15];

        for(int i = 0; i < 5; i++){
            String str[] = br.readLine().split("");
           

            for(int j = 0; j < str.length; j++){
                array[i][j] = str[j];
            }
        }

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j][i] != null){
                    System.out.print(array[j][i]);
                }
            }
        }

    }
}
