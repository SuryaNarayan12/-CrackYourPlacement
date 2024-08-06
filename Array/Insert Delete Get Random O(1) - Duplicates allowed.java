class RandomizedCollection {

    int[] arr;
    int ind ;
    Map<Integer,LinkedList<Integer>> mp;
    Random random;

    public RandomizedCollection() {
        arr = new int[200001];
        ind = 0;
        mp = new HashMap<>();

        random = new Random();
    }
    
    public boolean insert(int val) {
        
        boolean isPresent = mp.containsKey(val);

        arr[ind] = val;

        LinkedList<Integer> st = mp.getOrDefault(val, new LinkedList<>());

        st.add(ind);

        mp.put(val, st);

         ind ++;


        return !isPresent;

    }
    
    public boolean remove(int val) {
        
           if(!mp.containsKey(val)) return false;

        //    System.out.println(mp);

           LinkedList<Integer> st = mp.get(val);

           int pos = st.getLast();

           int lastValue = arr[ind - 1];

           st.pollLast();

         if(lastValue != val){
           
           LinkedList<Integer> lastValueSet = mp.get(lastValue);

           int temp = lastValueSet.pollLast();

           int min = Math.min(pos,temp);

           if(lastValueSet.isEmpty() || min < lastValueSet.getFirst()){
            lastValueSet.addFirst(min);
           }
           else{

           lastValueSet.addLast(min);
        
           }
           mp.put(lastValue, lastValueSet);
           }
           arr[pos] = lastValue;

           if(st.size() == 0){
            mp.remove(val);
           }
           else mp.put(val , st);

           ind --;

           return true;

    }
    
    public int getRandom() {
        
        int pos = random.nextInt(ind);

        return arr[pos];
    }
}
