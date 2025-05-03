class Solution {
    public int minDominoRotations(int[] t, int[] b) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int n = t.length,i=0;
        while(i<n){
            if(t[i]==b[i]){
                map.put(t[i],map.getOrDefault(t[i],0)+1);
            }
            else{
                map.put(t[i],map.getOrDefault(t[i],0)+1);
                map.put(b[i],map.getOrDefault(b[i],0)+1);
            }
            i++;
        }
        int num=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==n){
                num=e.getKey();
            }
        }
        if(num!=0){
            int Tcount = 0,Bcount=0;
            i=0;
            while(i<n){
                if(t[i]!=num) Tcount++;
                if(b[i]!=num) Bcount++;
                i++;
            }
            return Math.min(Tcount,Bcount);
        }
        return -1;
    }
}