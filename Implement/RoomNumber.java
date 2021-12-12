package Implement;

import java.util.Scanner;

public class RoomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine();
        s = s.replace('9', '6');

        int array[] = new int[9];
        int max = 0;

        for(int i = 0; i < s.length(); i++){
            int num = s.charAt(i) - '0';
            array[num]++;
        }
       // if(array[6] != 0){
       //     array[6] = Math.round(array[6] / 2.0f); //float
       // }

       //6, 9 바꿀 수 있으니까 2로 나눔 
       array[6] = array[6] / 2 + array[6] % 2;
       
        for(int i : array){
            max = Math.max(max, i);
        }

        System.out.println(max);
    }
}
