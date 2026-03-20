public class SwitchStatement {
    public static void main(String[] args) {
        int switchValue = 2;
        switch (switchValue) {
            case 1 -> System.out.println("The Value is 1");
            case 2 -> System.out.println("The value is 2");
            case 3 -> System.out.println("The value is 3");
            default -> System.out.println("Was not any of the cases");
        }

        char alphabet = 'A';
        switch(alphabet){
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.println("Charlie");
                break;
            case 'D':
                System.out.println("Dog");
                break;
            case 'E':
                System.out.println("Easy");
                break;
            default:
                System.out.println("Char not in range");
                break;
        }

    }
}
