import java.util.*;

public class QuadTree {
    public static StringBuilder sb = new StringBuilder();
    public static int img[][];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        img = new int[N][N];

        for(int i = 0; i < N; i++){
            String str = scan.next();

            for(int j = 0; j < N; j ++){
                img[i][j] = str.charAt(j) - '0';
            }
        }
        quadTree(0, 0, N);
        System.out.println(sb);
    }

    public static void quadTree(int x, int y, int size){
      
            if(isPossible(x, y, size)){
                sb.append(img[x][y]);
                return;
            }
            int newSize = size / 2; 
            
            sb.append('('); //레벨마다 연다
            //재귀
           quadTree(x, y, newSize);
           quadTree(x, y + newSize, newSize);
           quadTree(x + newSize, y, newSize);
           quadTree(x + newSize, y + newSize, newSize);

           sb.append(')');
        }
        
        //현재 파티션의 컬러가 같은지 체크
        public static boolean isPossible(int x, int y, int size){
            
            int value = img[x][y];
    
            for(int i = x; i < x + size; i++){
                for(int j = y; j < y + size; j++){
    
                    if(value != img[i][j]){
                        return false;
                    }
                }
            }
            return true;
        }
        
    }

