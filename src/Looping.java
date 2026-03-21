public class Looping {

    public static void calculateInterest(int amount){
        for(double rate = 7.5; rate <= 10; rate+=0.25){
            double interest = amount * (rate/100);
            System.out.println("Interest: " + interest);

        }

    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <= 2){
            return wholeNumber == 2;
        }
        for(int i = 2; i < wholeNumber; i++){
            if(wholeNumber % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        calculateInterest(1000 );
        System.out.println("8 is " + (isPrime(8)? "" : "NOT") + " a prime number");

        int counter = 0;
        for(int i = 100; i <= 150; i++){

            boolean checker = isPrime(i);
            if(checker == true){
                System.out.println(i);
                counter += 1;
            }if (counter == 3){
                break;
            }
        }

    }
}
