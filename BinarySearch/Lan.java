//BigO : O(log N)
//정렬된 자료를 반으로 나누어 탐색하는 방법
//주의점 : 자료는 오름차순 으로 정렬된 자료여야 한다.
//이진트리, 바이너리서치는 코딩 인터뷰 단골문제

package BinarySearch;

import java.util.*;
import java.io.*;

public class Lan {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 
		int K = Integer.parseInt(st.nextToken()); //영식이 갖고있는 랜선
		int N = Integer.parseInt(st.nextToken());  //필요한 랜선 
 
		int[] arr = new int[K]; //랜선길이 배열 
		
		
		
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		


        //이분 탐색 -> 정렬 필수 . 
        Arrays.sort(arr);

        
        long high = arr[K - 1];
        long low = 1;
        long mid = 0;
 
        //이분탐색.
		while (low <= high) { 

			long count = 0;
			

            // 중간 길이
			mid = (low + high) / 2;

			// 구해진 중간 길이로 잘라서 몇 개 만들어지는지

			for (int i = 0; i < arr.length; i++) {
				count += (arr[i] / mid);
			}
			
			/*
			 *  [upper bound 형식]
			 *  
			 *  mid길이로 잘랐을 때의 개수가 만들고자 하는 랜선의 개수보다 작다면
			 *  자르고자 하는 길이를 줄이기 위해 최대 길이를 줄인다.
			 *  그 외에는 자르고자 하는 길이를 늘려야 하므로 최소 길이를 늘린다.
			 */
			if(count < N) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
			
 
		}
		
	
		System.out.println(high);
	}
}



