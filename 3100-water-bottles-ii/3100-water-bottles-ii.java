class Solution {
    public int maxBottlesDrunk(int nb, int ne) {
        int eb=0;
        int bd=0;
        //int con=eb+nb;
        while((eb+nb) >= ne){
            if(eb>=ne){
                nb++;
                eb-=ne;
                ne++;
            }
            else{
              eb+=nb;
              bd+=nb;
              nb=0;
            }
            System.out.println(nb+" "+eb+" "+ne+" "+bd);
        }
        
        return bd+nb;
    }
}