import java.util.*;

public class Colorpaper {
    public static int white = 0;
    public static int blue = 0;
    public static int [][] board;
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        board = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                board[i][j] = scan.nextInt();
            }
        }

        partition(0, 0, N);
        System.out.println(white);
        System.out.println(blue);

        scan.close();
    }
    public static void partition(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(board[row][col] == 0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }
        int newSize = size / 2; 
        
        //재귀
        partition(row, col, newSize); //2사분면
        partition(row, col + newSize, newSize); //1사분면
        partition(row + newSize, col, newSize); //3사분면
        partition(row + newSize, col + newSize, newSize); //4사분면

    }
    
    //현재 파티션의 컬러가 같은지 체크
    public static boolean colorCheck(int row, int col, int size){
        
        int color = board[row][col];

        for(int i = row; i < row + size; i++){
            for(int j = col; j < col + size; j++){

                if(board[i][j] != color){
                    return false;
                }
            }
            
        }
        return true;
    }
    
}
