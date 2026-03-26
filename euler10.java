import java.util.*;

class psum{
    public static boolean isPrime(long n){
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for(long i = 5; i * i <= n; i = i + 6){
            if(n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
        
    }
    
    public static void main(String[] args){
        long n = 2000000;
        long sum = 0;
        for(long i = 2; i < n; i++){
            if(isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
        
    }
    
}
//Output:142913828922
