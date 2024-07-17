class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max =0;
        int currentMax =0;
        int n = cardPoints.length;
        for(int i=0;i<k;i++){
            max += cardPoints[i];
        }
        currentMax = max;
        int r =k-1;
        while(r>=0){
            currentMax = currentMax + cardPoints[n-(k-r)]  - cardPoints[r] ;
            if(currentMax>max){
                max=currentMax;
            }
            r--;
        }
        return max;
    }

}
