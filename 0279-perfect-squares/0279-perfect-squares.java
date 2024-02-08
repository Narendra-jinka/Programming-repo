class Solution {
    public int numSquares(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=100;i++){
            int num = i*i;
            if(num>n) break;
            list.add(num);
        }

        int num;
        int final_num = Integer.MAX_VALUE;
        int temp_num = 0;

        for(int i = list.size()-1;i>=0;i--){
            
            for(int j = i;j>=0;j--){ 

                temp_num = 0;
                num = n;
                num = num- list.get(i);
                temp_num++;   
                int index = j;

                while(num!=0){
                    if(list.get(index) > num){
                        index--;
                        continue;
                    }
                    if(index==0){
                        temp_num += num;
                        break;
                    }
                    num = num-list.get(index);
                    temp_num++;
           
                }

                final_num = Math.min(final_num,temp_num);
            }

        }
        return final_num;
    }
}