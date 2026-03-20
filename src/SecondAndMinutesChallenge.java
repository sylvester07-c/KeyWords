public class SecondAndMinutesChallenge {
    public static String getDurationString(int seconds){
        int hours = seconds /3600;
        if (seconds % 3600 == 0) {
            return hours + "h" + "0m 0s";
        }
        else if(seconds % 3600 >= 60){
            int mins = (seconds % 3600) / 60;
            int secs = seconds % 3600 - 60;
            return hours + "h " + mins + "m " + secs + "s";
        }
        else {
            return hours + "h " + "0m " + seconds % 3600 + "s";
        }

    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            if (minutes % 60 == 0) {
                return hours + "h" + "0m 0s";
            } else {
                return hours + "h " + minutes % 60 + "m " + seconds + "s";
            }
        } else {
            return "Invalid Inputs";
        }
    }


    public static void main(String[] args) {
        System.out.println(getDurationString(3675));
        System.out.println(getDurationString(450, 10));


    }

}
