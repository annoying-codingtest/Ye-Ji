//x

import java.util.*;
public class StartNLink {
    static int N;
    static int map[][];
    static boolean visit[];

    static int MIN = Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        N = scan.nextInt();

        map = new int[N][N];
        visit = new boolean[N];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = scan.nextInt();
            }
        }
        combi(0, 0);
        System.out.println(MIN);

        scan.close();
    }
    //w는 인덱스, count는 조합 개수(=재귀 깊이)
    static void combi(int w, int count){
        //팀 조합이 완성될 경우
        if(count == N / 2){
            diff();
            return;
        }
        for(int i = w; i < N; i++){

            //방문하지 않았다면
            if(!visit[i]) {
                visit[i] = true; //방문으로 변경
                combi(i + 1, count + 1); //재귀 호출
                visit[i] = false; //재귀가 끝나면 다시 방문하지 않은걸로 바꾸기
            }
        }
    }
    //두팀의 능력치 차이를 계산하는 함수
    static void diff(){
        int team_start = 0;
        int team_link = 0;

        for(int i = 0; i < N - 1; i++){
            for(int j = i + 1; j < N; j++){
                //i 번째 사람과 j번째 사람이 true 라면 스타트팀으로 점수 플러스
                if(visit[i] == true && visit[j] == true){
                    team_start += map[i][j];
                    team_start += map[j][i];
                }
                //i 번째 사람과 j 번째 사람이 false라면 링크 팀으로 점수 플러스
                else if(visit[i] == false && visit[j] == false){
                    team_link += map[i][j];
                    team_link += map[j][i];
                }
            }
        }
            //두 팀의 점수 차이(절댓값)
            int val = Math.abs(team_start - team_link);

            if(val == 0){
                System.out.println(val);
                System.exit(0);
            }
            MIN = Math.min(val, MIN);
        }
    }
