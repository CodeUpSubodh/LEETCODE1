class Solution {
    public void moveZeroes(int[] nums) {

        int j=0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                arr.add(i);
            }
            if(arr.size()==0){
                continue;
            }
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i]= nums[arr.get(j)];
                nums[arr.get(j)]=temp;
                arr.add(i);
                j++;
            }
        }

    }
}