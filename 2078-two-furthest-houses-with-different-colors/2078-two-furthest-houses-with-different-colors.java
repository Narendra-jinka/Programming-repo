class Solution {
    public int maxDistance(int[] colors) {
        int i=0, j = colors.length-1;
        int res =0 ;
        int left = 0;
        int right = j;
        while(i<=j){
            if(colors[i] != colors[j]){
                int temp = Math.abs(i-j);
                res = res < temp ? temp : res;
            }
            if(colors[left] != colors[j]){
                int temp = Math.abs(left-j);
                res = res < temp ? temp : res;
            }
            if(colors[right] != colors[i]){
                int temp = Math.abs(right-i);
                res = res < temp ? temp : res;
            }
            i++;
            j--;
        }

        return res;

    }
}