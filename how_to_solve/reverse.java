class reverse{

    public static int dereverse(int n){
        int reverse=0;
        do{
            reverse = reverse * 10 + n % 10;
            n = n / 10;

        }while(n> 0);
        return reverse;

    }
    public static void main(String[] args) {
        System.out.println(dereverse(27953));
    }
}