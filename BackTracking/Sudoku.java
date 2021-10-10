import java.util.*;

public class Sudoku {
    public static int arr[][] = new int[9][9];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        sudoku(0,0);
        scan.close();
    }
    public static void sudoku(int row, int col){
       //해당 행이 다 채워졌으면 다음행의 첫번째 열부터 시작
        if(col == 9){
            sudoku(row + 1, 0);
            return;
        }
        //행과 열이 모두 채워지면 종료
        if(row == 9){
            for(int i = 0; i < 9; i++){
                for(int j = 0; j < 9; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            //출력 뒤 시스템 종료
            System.exit(0);
        }
        //해당 위치가 0이면 1~9 까지 가능한 수 탐색
        if(arr[row][col] == 0){
            for(int i = 1; i <= 9; i++){

                //i값 중복 안되는지 검사
                if(possibility(row, col, i)){
                    arr[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            arr[row][col] = 0;
            return;
        }
        sudoku(row, col + 1);
    }
    public static boolean possibility(int row, int col, int value) {
 
		// 같은 행에 있는 원소들 중 겹치는 열 원소가 있는지 
		for (int i = 0; i < 9; i++) {
			if (arr[row][i] == value) {
				return false;
			}
		}
 
		// 같은 열에 있는 원소들 중 겹치는 행 원소가 있는지 
		for (int i = 0; i < 9; i++) {
			if (arr[i][col] == value) {
				return false;
			}
		}
 
		// 3 3 칸에 중복되는 원소가 있는지
		int set_row = (row / 3) * 3; // value가 속한 3 3의 행의 첫 위치
		int set_col = (col / 3) * 3; // value가 속한 3 3의 열의 첫 위치
 
		for (int i = set_row; i < set_row + 3; i++) {
			for (int j = set_col; j < set_col + 3; j++) {
				if (arr[i][j] == value) {
					return false;
				}
			}
		}
 
		return true; // 중복되는 것이 없을 경우 true 반환
	}
 
}
