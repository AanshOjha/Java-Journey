package LeetCode.Arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static public int[] runningSum(int[] nums) {
        int sum[]= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum[i]=Sum(i,sum,nums);
        }
        return sum;
    }

    static public int Sum(int n,int[] sum, int[] num) {
        if(n==0){
            return num[0];
        }
        return sum[n-1]+num[n];
    }
}
