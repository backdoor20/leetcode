class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     List<List<Integer>> list=new ArrayList<List<Integer>>();
     if(nums.length<4)
         return list;
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<len-3;i++){
            int minSum=nums[i]+nums[i+1]+nums[i+2]+nums[i+3];
            int maxSum=nums[i]+nums[len-3]+nums[len-2]+nums[len-1];
            if(minSum>target)
                break;
            for(int j=i+1;j<len-2;j++){
                int minSumJ=nums[i]+nums[j]+nums[j+1]+nums[i+2];
                int maxSumJ=nums[i]+nums[j]+nums[len-2]+nums[len-1];
                if(minSumJ>target)
                    break;
                int k=j+1;
                int l=len-1;
                while(k<l){
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        while(k<l&&nums[k]==nums[k+1])
                            k++;
                        while(k<l&&nums[l]==nums[l-1])
                            l--;
                        k++;
                        l--;
                    }else if(sum>target){
                        l--;
                    }else{
                        k++;
                    }
                }
                while(j<len-1&&nums[j]==nums[j+1])
                    j++;
            }
            while(i<len-1&&nums[i]==nums[i+1])
                i++;
        }
        List<List<Integer>> list2=new ArrayList<>(set);
        return list2;
    }
}
