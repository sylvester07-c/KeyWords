public class Looping {

    // write code here
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int original = number;

        while(number != 0 || number > 0){
            int lastNumber = number % 10;
            reverse = reverse * 10;
            reverse += lastNumber;
            number = number / 10;
            if(original == reverse){
                return true;
            }

        }

        return false;
    }


    public static int sumDigits(int number){
        if (number < 0) {
            return -1;
        }
        int n = 0;
        while (number > 9) {
            n += number % 10;
            number = number / 10;

        }
        n += number;

        return n;

    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }

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
        return false;
    }

    public static void main(String[] args) {
//        calculateInterest(1000 );
//        System.out.println("8 is " + (isPrime(8)? "" : "NOT") + " a prime number");
//
//        int counter = 0;
//        for(int i = 100; i <= 150; i++){
//
//            boolean checker = isPrime(i);
//            if(checker == true){
//                System.out.println(i);
//                counter += 1;
//            }if (counter == 3){
//                break;
//        }
//        }
//
//        int count = 0;
//        int sum = 0;
//        for(int i = 1; i <= 1000; i++){
//
//            if(i % 3 == 0 && i % 5 == 0){
//                count++;
//                sum += i;
//                System.out.println(i);
//
//            }if(count == 5){
//                break;
//            }
//
//        }
//        System.out.println(sum);
//
//
//        int ji = 0;
//        while( ji <= 5 ){
//            System.out.println(ji);
//            ji++;
//        }
//        return true;


        int startValue = 4;
        int endValue = 20;
        int totalEven = 0;
        int totalOdd = 0;

        while(startValue <= endValue){
            startValue++;
            if(isEvenNumber(startValue)){
                System.out.println("Even number is " + startValue);
                totalEven++;

            }else{

                totalOdd++;
            }
            if(totalEven == 5){
                break;
            }
        }
        System.out.println("Total number of even number is: "+ totalEven);
        System.out.println(sumDigits(1234567));
        System.out.println(2/3);


    }
}
