package bfs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ps2178 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                arr[i][j] = line.charAt(j)-'0';
            }
        }
		int[] dx = {-1,1,0,0};
		int[] dy = {0,0,-1,1};
		boolean[][] check = new boolean[N][M];
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {0,0});
		check[0][0] = true;
		while(!q.isEmpty()) {
			int[] loc = q.poll();
			int x = loc[0];
			int y = loc[1];
			for(int i=0; i<dx.length; i++) {
					if(x+dx[i]>=0&&x+dx[i]<arr.length&&y+dy[i]>=0&&y+dy[i]<arr[0].length) {
						if(arr[x+dx[i]][y+dy[i]]==1&&!check[x+dx[i]][y+dy[i]]) {
							q.offer(new int[] {x+dx[i], y+dy[i]});
							arr[x+dx[i]][y+dy[i]] = arr[x][y]+1;
							check[x+dx[i]][y+dy[i]] = true;
						}
					}
			}
		}
		System.out.println(arr[N-1][M-1]);
	}
}

