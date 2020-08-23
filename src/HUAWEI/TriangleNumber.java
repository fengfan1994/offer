package HUAWEI;
//杨辉三角
public class TriangleNumber {

    public static int getFirstPlaceEven(int n){
        int[][] map = new int[n + 1][2*n];
        map[1][1] = 1;
        for(int i = 2; i <= n; i++){
            map[i][1] = 1;
            for(int j = 2; j <= 2 * i - 1; j++)
                map[i][j] = map[i - 1][j - 1] + map[i - 1][j - 2] + map[i - 1][j];
        }
        for(int i = 1; i <= n; i++)
            if(map[n][i] % 2 == 0)
                return i;
        return -1;
    }
}
