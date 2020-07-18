class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int maxGlobal = 0;
        int maxLocal = 0;
        
        for(int num : nums){
            
            if(num==1)
                maxLocal++;
            else
                maxLocal=0;
            
            if(maxLocal>maxGlobal){
                maxGlobal=maxLocal;
            }       
        }
        
        return maxGlobal;
    }
}
