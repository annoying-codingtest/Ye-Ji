import java.util.*;
import java.io.*;
public class OrganicCabbage {
        static int M, N, K; //가로 세로 위치의 개수
        static int[][] cabbage;
        static boolean[][] visit;
        static int count;
        static int[] dx = { 0, -1, 0, 1 }; //상하좌우
        static int[] dy = { 1, 0, -1, 0 };
    
        static void dfs(int x, int y) {
            visit[x][y] = true;
    
            for (int i = 0; i < 4; i++) {
                int cx = x + dx[i];
                int cy = y + dy[i];
    
                if (cx >= 0 && cy >= 0 && cx < M && cy < N) {
                    if (!visit[cx][cy] && cabbage[cx][cy] == 1) {
                        dfs(cx, cy);
                    }
                }
    
            }
    
        }
    
        public static void main(String[] args) throws NumberFormatException, IOException {
    
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int tc = Integer.parseInt(br.readLine());
    
            for (int i = 0; i < tc; i++) {
                count = 0; //구역수
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                M = Integer.parseInt(st.nextToken());
                N = Integer.parseInt(st.nextToken());
                cabbage = new int[M][N]; //배추밭
                visit = new boolean[M][N]; //방문 체크
    
                K = Integer.parseInt(st.nextToken());
               
                //배추밭에 배추 심어져 있는 곳 입력. 
                for (int j = 0; j < K; j++) {
                    st = new StringTokenizer(br.readLine(), " ");
                    int p1 = Integer.parseInt(st.nextToken());
                    int p2 = Integer.parseInt(st.nextToken());
                    cabbage[p1][p2] = 1;
                }
    
                //배추 있으면 dfs 탐색 , 구역수 증가
                for (int x = 0; x < M; x++) {
                    for (int y = 0; y < N; y++) {
                        //배추 있는데 방문 안했으면 탐색, 구역 수 증가 
                        if (cabbage[x][y] == 1 && !visit[x][y]) {
                            dfs(x, y);
                            count++;
                        }
                    }
                }
    
                System.out.println(count);
            }
    
        }
    
    }
