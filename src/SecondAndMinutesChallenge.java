public class SecondAndMinutesChallenge {
    public static String getDurationString(int seconds){
        if(seconds < 0){
            return  "Invalid input";
        }
        int minutes = seconds / 60;
        String durationString = getDurationString(minutes, seconds % 60);
        return durationString;
    }
    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            return  hours + "h " + remainingMinutes + "m " + seconds + "s";

        } else {
            return "Invalid Inputs";
        }
    }


    public static void main(String[] args) {
        System.out.println(getDurationString(-4945));
        System.out.println(getDurationString(65, 60));


    }

}
