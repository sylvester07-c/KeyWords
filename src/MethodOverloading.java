public class MethodOverloading {
    public static double convertToCentimeters(int heightInInches){
        double heightInCentimeters = heightInInches * 2.54;
        return heightInCentimeters;
    }

    public  static void convertToCentimeters(int heightInFeet, int heightInInches){
        int heightInInchesOnly = (heightInFeet * 12) + heightInInches;
         System.out.println(convertToCentimeters(heightInInchesOnly));

    }

    public static void main(String[] args) {
        System.out.println(convertToCentimeters(45));
        convertToCentimeters(6, 0);
    }
}
