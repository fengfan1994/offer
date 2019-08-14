package Leetcode;

public class JumpGame {
    public boolean canReach(int[] arr){
        int n=arr.length;
        int reach=0;
        for(int i=0;i<n;i++){
            if(i>reach || reach>=n-1)
                break;
            reach=Math.max(reach,i+arr[i]);
        }
        return  reach>=n-1;
    }

    public boolean canJump(int[] A) {
        int position = 0;
        int jump = A[0];
        if (A.length <= 1) {
            return true;
        }
        while (jump > 0) {
            position += jump;
            if (position >= A.length - 1) {
                return true;
            } else {
                jump = A[position];
            }
        }
        return false;
    }

    public int jump(int[] A) {
        int jumps = 0, curEnd = 0, curFarthest = 0;
        for (int i = 0; i < A.length - 1; i++) {
            //跳到最远的地方
            curFarthest = Math.max(curFarthest, i + A[i]);
            //如果此处就是最有的地方
            if (i == curEnd) {
                jumps++;
                curEnd = curFarthest;
            }
        }
        return jumps;
    }
}
