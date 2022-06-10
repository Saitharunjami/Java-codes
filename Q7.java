//Given an  unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers. 

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int[] res = new int[2];
        int xy = 0;
        for(int a : arr){
            xy ^=a;
        
       }
        
        for(int a = 1; a <= n ; a++){
            xy ^=a;
            
        
        }
        
        int rmsb = xy & (~xy+1);
        int x = 0, y = 0;
        
        for(int a : arr){
            if((a & rmsb) == 0)
                x ^=a;
            else
                y ^=a;
        }
        
        
        for(int a = 1; a <=n; a++){
            if((a & rmsb) == 0)
                x ^=a;
            else
                y ^=a;
        }
        
        for(int a : arr){
            if(a == x){
                res[0] = x;
                res[1] = y;
            }
            if(a == y){
                 res[1] = x;
                res[0] = y;
            }
        }
       
        

            return res;
    }
}
