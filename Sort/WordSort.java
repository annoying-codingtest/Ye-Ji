import java.util.*;

//※Array.sort에서 인자로 사용되는 Comparator 객체 !!!
public class WordSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();  //몇 개 입력 받을건지
        String[] arr = new String[n];

        for(int i = 0; i < n; i++){
            arr[i] = scan.next();  //문자 입력 받기
        }
        
        //Arrays.sort()의 Comparator 재정의
        Arrays.sort(arr, new Comparator<String>(){
            @Override //compare 오버라이딩 
            public int compare(String s1, String s2){ //String s1, s2, -> 인덱스 01, 12, 23 이렇게
                if(s1.length() == s2.length()){ //단어의 길이가 같으면, 문자열 길이 정렬
                    return s1.compareTo(s2); //compareTo -> Comparator 내부에 있는 메서드, String 문자열을 사전 순으로 정렬해줌.
                }
                else { //그 외 
                    return s1.length() - s2.length();
                }
            }
        });

        System.out.println(arr[0]); //문자열 맨 앞 꺼 출력

        for(int i = 1; i < n; i++){
            if(!arr[i].equals(arr[i - 1])){ //인덱스 1부터 이전거랑 문자열 비교해서 같지 않으면 충력
                System.out.println(arr[i]);
            }
        }
        scan.close();

    }
    
}
