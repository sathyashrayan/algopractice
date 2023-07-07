import java.util.*;
class amax{
    public  static <T> int myArrayCount(T[] array){
        int count = 0;
        if(array == null)
         count = 0;

        for(T arr : array){
            if(arr != null)
              count++;
        }
        return count;

    }
    public static int arrayMax(Integer arr[]){

        Integer i = 0,
        max = arr[i],
        n = myArrayCount(arr);
        for (i=1; i < n ; i++ )
            if(arr[i] > max)
              max = arr[i];
        return max;        
    }

    public static int arrayMinExcr4_3_1(Integer arr[]){

        Integer i = 0,
        min = arr[i],
        n = myArrayCount(arr);
        for (i=1; i < n ; i++ )
            if(arr[i] < min)
              min = arr[i];
        return min;        
    }

    public static int arrayMinExcr4_3_2(Integer arr[]){
        Integer i = 0,
        max = arr[i],
        counter = 0,
        n = myArrayCount(arr);
        for (i=1; i < n ; i++ ){            
            if(arr[i] > max){
              max = arr[i];   
              counter++; 
              System.out.println(" Counter check "+max);          
            }
        }
        return counter;        
    }

    public static void main(String[] args) {

        Integer [] arr = {8,6,5,13,15,7,9,21,6,13,21,21,21};  
        Integer result = arrayMax(arr);
        System.out.println("Max number is "+result);
        int counts = arrayMinExcr4_3_2(arr);
        System.out.println("Total repeted max number count is "+counts);

    }
}