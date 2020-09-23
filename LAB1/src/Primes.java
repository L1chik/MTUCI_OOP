public class Primes {

    //Проход по диапазону, вывод нужных значений
    public static void main(String[] args) {
        int i;
        for (i = 2; i <= 100; i++) {
            if(isPrime(i))
                System.out.println(i);
        }
    }

    //Нахождение наименьшего делителя
    public static boolean isPrime(int n){
        boolean check = true;
        for (int j=2; j<n; j++){
            if (n % j ==0 ){
                check = false;
            }
        }
        return check;
    }
}
