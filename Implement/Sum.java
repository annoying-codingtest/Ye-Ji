package Implement;

import java.util.*;
public class Sum {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         
         long n = scan.nextLong();
         long count = 0;
         long sum = 0;

         while(sum < n){
            count++;
            sum += count;
             
         }
         if(sum > n){
             count--;
         }
        System.out.println(count);
    }
}