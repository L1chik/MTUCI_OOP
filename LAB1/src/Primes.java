public class Primes {
    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 100; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
        }
    public static boolean isPrime(int n){
        for (int j=2; j<n; j++){
            if (n % j ==0 ){
                return false;
            }
        }
        return true;
    }
    }
