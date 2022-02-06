package Implement;
import java.util.*;

public class TurnOnOff {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int array[] = new int[count];

        for(int i = 0; i < count; i++){
            array[i] = scan.nextInt(); //스위치 저장
        }

        int student = scan.nextInt();

        for(int i = 0; i < student; i++){
            int gender = scan.nextInt();
            int number = scan.nextInt();

            if(gender == 1){ //남
                for(int j = 0; j < count; j++){
                    if((j + 1) % number == 0){
                        array[j] = array[j] == 0 ? 1 : 0;
                    }
                }
            }
            else if(gender == 2){
                array[number - 1] = array[number - 1] == 0 ? 1 : 0;  //주어진 문자 스위치 바꾸기
                for(int j = 1; j < count / 2; j++){ //대칭
                    if(number - j - 1 < 0 || number + j - 1 >= count){ //범위 벗어나면
                        break;
                    }
                    if(array[number - j - 1] == array[number + j - 1]){ //양쪽 값 같을때
                        array[number - j - 1] = array[number - j - 1] == 0 ? 1 : 0;  // 맞으면 1 아니면 0 
                        array[number + j - 1] = array[number + j - 1] == 0 ? 1 : 0;
                    }
                    else {
                        break;
                    }
                }
            }

        }
        for(int i = 0 ; i < count; i++){
            System.out.print(array[i] + " ");
            if((i + 1) % 20 == 0){
                System.out.println();
            }
        }
    }
}
