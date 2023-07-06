class monotone{
    public voice monot(int a[], int n, int maxlength){
        int length[];
        int i,j , maxj , pmax =1;
        int current;
        length[1] = 1;
        maxlength = 1;
        for (i=2 ; i < n ; i++){
            current = a[i];
            if(current < a[pmax]){
                maxj = 1;
                for(j=2; j < i-1 ; j++){
                    if(a[j] < current){
                        if(maxj < length[j]){
                            maxj = length[j];
                        }
                    }
                }
                length[i] = maxj + 1;
                pmax = i; 
            }
            else{
                maxlength++;
                length[i] = maxlength;
                pmax = i;
            }
        }
    }
}