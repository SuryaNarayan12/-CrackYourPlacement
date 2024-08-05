class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int [] dif =  new int[heights.length-1];
        for(int i=0;i<heights.length -1;i++){
            dif[i] = heights[i+1] - heights[i];
        }
        int max =0 ,cnt =0,sum=0;
        for(int i=0;i<dif.length;i++){
            if(dif[i]<0){
                cnt++; 
                continue;
            }
            if(dif[i] > max){
                max =dif[i];
            }
            sum+=dif[i];
            if(sum>bricks && ladders ==0 ) break;
            if(sum>bricks && ladders !=0){
                ladders--;
                sum-=max;
                max = dif[i];
            }
            if(dif[i]>max){
                max =dif[i];
            }
            cnt++;
        }
        return cnt;
    }
}
