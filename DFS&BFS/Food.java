//주어진 배열에서, 한 곳에 모여있는 최대 음식물 쓰레기의 수
//음식물의 좌표들을 저장한 후, 반복문을 돌면서 음식물을 발견한다. 
//발견한 음식물이, 이전에 큰 음식물로 합치는데 방문하지 않았다면 방문해서 DFS를 통해 큰 음식물로



import java.util.*;
import java.io.*;

public class Food {
    public static int[][] move = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public static boolean[][] room; 
    public static boolean[][] visit; 
    public static int height, width;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(br.readLine()); 
        
        int trashNum = 0, r = 0, c = 0, answer = 0; 

        height = Integer.parseInt(st.nextToken()); 
        width = Integer.parseInt(st.nextToken()); 
        trashNum = Integer.parseInt(st.nextToken());

        room = new boolean[height + 1][width + 1];   //음식물 
        visit = new boolean[height + 1][width + 1];  //방문 확인

        

        for (int x = 0; x < trashNum; x++) {
             st = new StringTokenizer(br.readLine()); 
             r = Integer.parseInt(st.nextToken());
             c = Integer.parseInt(st.nextToken()); 
             room[r][c] = true; 
         } 
         
         for(int x = 1; x <= height; x++) { 
             for (int y = 1; y <= width; y++) {
                  if (room[x][y] && !visit[x][y]) { // 음식물이 있고, 방문하지 않았으면 탐색
                       answer = Math.max(answer, dfs(x, y) + 1); //가장큰거
                } 
            } 
        } 
        System.out.println(answer); 
    } 
    public static int dfs(int x,int y){ 
        visit[x][y] = true; int next_x = 0, next_y = 0, ret = 0; 
        
        for (int i = 0; i < 4; i++) {
            next_x = x + move[i][0]; 
            next_y = y + move[i][1];

            if(next_x<=0 || next_y<=0 || next_x>height || next_y>width) 
                continue; 
            

            //현재 위치에서 상, 하, 좌, 우 중에 이전에 방문하지 않고, 음식물이 있다면 dfs(next_x, next_y)+1 한 것을 ret에 더해준다.
            if(room[next_x][next_y] && !visit[next_x][next_y]) {  
                ret += dfs(next_x, next_y) + 1; 
            } 
        } 
        return ret; 
   }
}
