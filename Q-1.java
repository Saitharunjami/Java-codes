class Compute{
    
    static int getBits(Integer n){
        return Integer.bitCount(n);
    }
    
    public static class MyComparator implements Comparator<Integer>{
        public int compare(Integer a, Integer b){
            return getBits(b) - getBits(a);
        }
    }
    
    static void sortBySetBitCount(Integer arr[], int n){ 
        // Your code goes here
        Arrays.sort(arr,new MyComparator());
    } 
}
