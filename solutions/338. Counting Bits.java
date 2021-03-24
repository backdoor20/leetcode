class Solution {
    int[] ans;
    public int[] countBits(int num) {
        ans=new int[num+1];
        Arrays.fill(ans,-1);
        for(int i=0;i<=num;i++){
            int counter=0,number=i;
            while(number!=0){
                if(ans[number]!=-1){
                    counter+=ans[number];
                    break;
                }
                if(number%2!=0){
                    counter++;
                }
                number/=2;
            }
            ans[i]=counter;
        }
        return ans;
    }
}
