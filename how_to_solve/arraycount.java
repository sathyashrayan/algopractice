
class GenericBox<T> {
    final T x;
    GenericBox(T x) {
        this.x = x;
    }
}

class arraycount{

public static <T> T[] array(final T... values) {
        return (values);
    }

    public static <T> int myArrayCount(T[] array){
        int count = 0;
        if(array == null)
         count = 0;

        for(T arr : array){
            if(arr != null)
              count++;
        }
        return count;

    }
     public static void main(String[] args) {
                
        GenericBox<Integer> a = new GenericBox<>(2);
        GenericBox<Integer> b = new GenericBox<>(4);
        GenericBox<Integer> c = new GenericBox<>(6);
        GenericBox<Integer>[] abc = array(a, b, c);
        int arrayCount =  myArrayCount(abc);
        System.out.println(arrayCount);
        System.out.println(abc);
     }

}

//https://gist.github.com/sathyashrayan/0362f4a022f9622ad4122c9f3bc4aa42
