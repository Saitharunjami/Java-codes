/*
The first line will contain an integer T (number of test cases). First line of each test case will contain one integer c. Next line will contain a string if c is equal to 1 or will contain a integer if c is equal to 2.

Output: 
Print the type of the given data and the given value in new line.

Constraints: 
1 < = T < = 100
1 < = c < = 2
1<= Length of strings, integers<=103
*/


public class GenericClass<T> {
    
     private T res;
    
    GenericClass(T res)
    {
        this.res = res;
    }
    
    void showType()
    {
        System.out.println(res.getClass().getSimpleName());
        System.out.println(res);
 } 
 }
