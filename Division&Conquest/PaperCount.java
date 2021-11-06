import java.util.*;

public class PaperCount { //9x9사이즈
    public static int white = 0; //0
    public static int black = 0;  //1
    public static int gray = 0; //-1
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
        System.out.println(gray);
        System.out.println(white);
        System.out.println(black);
      

        scan.close();
    }
    public static void partition(int row, int col, int size){
        if(colorCheck(row, col, size)){
            if(board[row][col] == 0){
                white++;
            }
            else if(board[row][col] == -1){
                gray++;
            }
            else{
                black++;
            }
            return;
        }
        int newSize = size / 3; 
        
        //재귀
        partition(row, col, newSize); 
        partition(row, col + newSize, newSize); 
        partition(row, col + 2 * newSize, newSize);	

        partition(row + newSize, col, newSize); 
        partition(row + newSize, col + newSize, newSize); 
        partition(row + newSize, col + 2 * newSize, newSize);

        partition(row + 2 * newSize, col, newSize);					
		partition(row + 2 * newSize, col + newSize, newSize);		
		partition(row + 2 * newSize, col + 2 * newSize, newSize);

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