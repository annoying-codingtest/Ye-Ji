package Implement;

import java.util.*;

public class ColoredPaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        int n = scan.nextInt();
        int map[][] = new int[100][100];
        int count = 0;

        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            //입력 받을때마다 10 x 10 확인 
            for(int j = x; j < x + 10; j++){
                for(int k = y; k < y + 10; k++) {
                if(map[j][k] == 0){
                     map[j][k] = 1;
                     count++;
                }
            }
        }
    }
    System.out.println(count);
}}


