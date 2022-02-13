package Implement;

import java.util.*;

public class War {
    public static Character map[][];
    public static boolean visit[][];
    public static int dy[] = {1, 0, -1, 0};
    public static int dx[] = {0, 1, 0, -1};
    public static int b = 0, w = 0, n, m, c;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        m = scan.nextInt();
        n = scan.nextInt();
        map = new Character[n][m];
        visit = new boolean[n][m];

        for(int i = 0; i < n; i++){
            String str = scan.next();
            for(int j = 0; j < m; j++){
                char ch = str.charAt(j); 
                map[i][j] = ch;           
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visit[i][j]){
                    c = 1;
                    dfs(map[i][j], i, j);
                    if(map[i][j] == 'W'){
                        w += (c * c);
                    }
                    else{
                        b += (c * c);
                    }
                }
            }
        }
        System.out.println(w + " " + b);
    }
    public static void dfs(char ch, int row, int col){
        visit[row][col] = true;

        for(int i = 0; i < dx.length; i++){
            int nx = row + dx[i];
            int ny = col + dy[i];

            if(nx >= n || nx < 0 || ny >= m || ny < 0){
                continue;
            }
            if(visit[nx][ny]){
                continue;
            }
            if(map[nx][ny] != ch){
                continue;
            }

            c++;
            dfs(ch, nx, ny);
        }
    }
}
