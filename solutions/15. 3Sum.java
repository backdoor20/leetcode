class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                   if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        set.add(li);
                       j++;
                       k--;
                    }
                else if(nums[i]+nums[j]+nums[k]>0)
                    k--;
                else
                    j++;
                }
            }
        List<List<Integer>> list=new ArrayList<>(set);
        return list;
    }
}
