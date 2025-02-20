class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            n[i]=Integer.parseInt(nums[i],2);
        }
        int res=0;
        Arrays.sort(n);
        if(nums.length==1){
            if(nums[0].equals("1")){
                return "0";
            }
            else{
                return "1";
            }
        }
        for (int i=0;i<n.length;i++){
            
            if((i!=n.length-1) && (n[i]+1 != n[i+1])){
                res=n[i]+1;
                break;
            }
            else{
                res=n[i]+1;
            }
        }
        if(n[0]!=0){
            res=0;
        }
        String str=Integer.toBinaryString(res);
        return String.format("%" + nums[0].length() + "s", str).replace(' ', '0');
    }
}