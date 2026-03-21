public class SwitchStatement {

    public class NumberOfDaysInMonth {
        // write code here
        public static boolean isLeapYear(int year){
            if(year >= 1 && year <= 9999){
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }else {
                return false;
            }
        }

        public static int getDaysInMonth(int month, int year){
            if(month < 1 || month > 12){
                return -1;
            }if(year < 1 || year > 9999){
                return -1;
            }
            boolean isLeapYr = isLeapYear(year);
            if(isLeapYr == true){
                int days = switch(month){
                    case 1 -> { yield 31; }
                    case 2 -> 29;
                    case 3 -> 31;
                    case 4 -> 30;
                    case 5 -> 31;
                    case 6 -> 30;
                    case 7 -> 31;
                    case 8 -> 31;
                    case 9 -> 30;
                    case 10 -> 31;
                    case 11 -> 30;
                    case 12 -> 31;
                    default -> -1;

                };
                return days;
            }else{
                int days = switch(month){
                    case 1 -> { yield 31; }
                    case 2 -> 28;
                    case 3 -> 31;
                    case 4 -> 30;
                    case 5 -> 31;
                    case 6 -> 30;
                    case 7 -> 31;
                    case 8 -> 31;
                    case 9 -> 30;
                    case 10 -> 31;
                    case 11 -> 30;
                    case 12 -> 31;
                    default -> -1;

                };
                return days;

            }

        }
    }

    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";


        };

    }

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
