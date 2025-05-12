class Solution {
    public int[][] solution(int n) {
        int[][] result = new int[n][n];
        
        // 방향: 오른쪽, 아래, 왼쪽, 위쪽 순서
        int[] dx = {0, 1, 0, -1};  // 행 변화
        int[] dy = {1, 0, -1, 0};  // 열 변화
        
        int x = 0, y = 0, dir = 0; // 시작 위치와 방향
        int num = 1;               // 시작 숫자
        
        for (int i = 0; i < n * n; i++) {
            result[x][y] = num++;  // 현재 위치에 숫자 채우기
            
            // 다음 위치 계산
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            // 범위 벗어나거나 이미 값이 채워진 경우 방향 전환
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || result[nx][ny] != 0) {
                dir = (dir + 1) % 4; // 방향 전환 (시계방향)
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            // 다음 위치로 이동
            x = nx;
            y = ny;
        }
        
        return result;
    }
}
