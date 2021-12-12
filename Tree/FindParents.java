package Tree;

import java.io.*;
import java.util.*;

public class FindParents {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        List<Integer> list[] = new ArrayList[n + 1];

        for(int i = 0; i < list.length; i++){
            list[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < n - 1; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        boolean visit[] = new boolean[n + 1];
        int parents[] = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        visit[1] = true;

        while(!q.isEmpty()){
            int j = q.poll();
            for(int i : list[j]){
                if(!visit[i]){
                    q.offer(i);
                    visit[i] = true;
                    parents[i] = j;
                }
            }
        }


        for(int i = 2; i < parents.length; i++){
            System.out.println(parents[i]);
        }
    }
}