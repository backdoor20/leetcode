class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        common(text1,text2,text1.length(),text2.length());
        return dp[text1.length()][text2.length()];
    }
    int common(String x,String y,int n,int m){
        if(n==0||m==0)
            return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(x.charAt(n-1)==y.charAt(m-1)){
            return dp[n][m]=1+common(x,y,n-1,m-1);
        }else{
            return dp[n][m]=Math.max(common(x,y,n-1,m),common(x,y,n,m-1));
        }
    }
}
