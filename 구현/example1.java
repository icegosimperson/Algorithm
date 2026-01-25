//boolean visited = new boolean[N][K];
//
//for(int i=0; i<N; i++){
//	int k = Integer.parseInt(br.readLine());
//	int[] index = new int[k];
//	st = new StringTokenizer(st.nextToken());
//	for(int j=0; j<k; j++){
//	   index[j] = Integer.parseInt(st.nextToken());
//	   visited[i][index[j]-1] = true;
//	}
//}
//
//int ans = 0;
//for (int j = 0; j < K; j++) {
//       int cnt = 0;
//       for (int i = 0; i < N; i++) {
//           if (visited[i][j]==false) { // !visited[i][j]
//                    cnt++;
//            }
//            if(cnt==N){
//                ans++;
//             }
//      }
//}
//
//System.out.println(ans);
