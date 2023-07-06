class Ktest{
public static void kthsmallest(int a[] , int k, int n){
    int i,j,l,u,t,x;    
    
    l=1;
    u=n;
    while(l<u){
        i=l;
        j=u;
        x = a[k];
        while(i <= k && j >= k){
            while(a[i] < x){
                i++;
            }
            while(x < a[j]){
                j--;

            }
            t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }

    if(j<k) 
      l=i;
    if(i>k)
      u=j;  

    }
   

}
}