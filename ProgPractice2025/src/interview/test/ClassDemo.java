package interview.test;

public class ClassDemo {
    public static void main(String[] args) {

        // prime or not.
        int num = 2;
        boolean isPrime = false;

        for(int i = 2 ;i<= 9; i++) {
            if (num == 2) {
                isPrime = true;
            }
            else if(i != num && num % i != 0) {
                isPrime = true;
            }
            break;
        }

        if(isPrime) {
            System.out.println("Prime num!");
        } else {
            System.out.println(" Not a Prime num!");

        }
    }


}