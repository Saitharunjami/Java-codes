/*Given an array of integers, sort the array (in descending order) according to count of set bits in binary representation of array elements. 

Note: For integers having same number of set bits in their binary representation, sort according to their position in the original array i.e., a stable sort.
Input: 
arr[] = {5, 2, 3, 9, 4, 6, 7, 15, 32};
Output:
15 7 5 3 9 6 2 4 32
Explanation:
The integers in their binary
representation are:
15 - 1111
7  - 0111
5  - 0101
3  - 0011
9  - 1001
6  - 0110
2  - 0010
4  - 0100
32 - 10000
hence the non-increasing sorted order is:
{15}, {7}, {5, 3, 9, 6}, {2, 4, 32} */

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
