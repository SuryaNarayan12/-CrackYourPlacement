class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = 0;
        int max = 0;
        for(int i :nums){
            if(min>i)
                min =i;
            if(max<i)
                max=i;
        }  
        int offset = -min;
        int[] freq = new int[max-min+1];     

        for(int i:nums){
            freq[i+offset]++;
        } 

        ArrayList<Integer>[] freqarr = new ArrayList[freq.length+1];
        for(int i=0;i<freq.length;i++){
            if(freq[i]>0){
            if(freqarr[freq[i]]==null)
                freqarr[freq[i]]=new ArrayList<Integer>();

            freqarr[freq[i]].add(i-offset);
        }
        }
        int index = 0;
        int ans[]=new int[k];
        for(int i=freqarr.length-1;i>=0 && index<k;i--){
            if(freqarr[i]!=null){
                for(int a:freqarr[i]){
                    ans[index++]=a;
                    if(index==k)
                        break;
                }
            }
        }
        return ans;
    }
}
