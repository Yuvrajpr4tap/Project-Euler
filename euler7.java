class prime
{
    public static void main(String[] args){
        int i =2;

        int c = 0;
        while(true){
            if(isPrime(i)){
                c++;
            }
            if(c==10001){
                System.out.println(i);
                break;
            }
            i++;

        }

    }

    public static boolean isPrime(int n){
        for(int i = 2;i<=n/2;i++){
            if(n%i==0){
                return false;
            } 
        }

        return true;
    }
}
