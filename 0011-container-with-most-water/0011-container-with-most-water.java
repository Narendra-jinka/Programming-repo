class Solution {
    public int maxArea(int[] h) {
        int area =0, i=0,n=h.length,j=n-1;
        while(i<j){
            if(h[i]<h[j]){
                area = Math.max(area, (j-i)*h[i]);
                i++;
            }else if(h[i]>h[j]){
                area = Math.max(area, (j-i)*h[j]);
                j--;
            }else{
                area = Math.max(area, (j-i)*h[i]);
                i++;j--;
            }
        }

        return area;
    }
}