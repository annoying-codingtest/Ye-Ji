import java.util.*;
public class CompressionOfCoordinates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(); //System.out.print -> 시간초과

        int n = scan.nextInt();
        int arr[] = new int[n];
        int arrClone[];  //복사할 배열 -> 정렬된 배열과 입력 그대로 받은 배열 2개 필요
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();
        

        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        arrClone = arr.clone();  //복사한 배열
        Arrays.sort(arrClone);   //복사한 배열 오름차순으로 

        for(int i = 0; i < n; i++){
            if(!map.containsKey(arrClone[i])){  //constainKey -> hashmap 메소드, key 값이 arrayClone[i]와 같은게 있으면 true 없으면 false
                map.put(arrClone[i], count++); //array[i] 가 key, count++ 이 value
            }
        }

        for(int i = 0; i < n; i++){
            sb.append(map.get(arr[i])).append(" ");  //get -> 해당 key에 있는 value 가져옴
        }
        System.out.println(sb);

        scan.close();      
    }
}

