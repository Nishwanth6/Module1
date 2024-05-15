import java.util.Scanner;
public class TimeComp{
    public static void main(String args[]) {
        Scanner nish = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = nish.nextInt();
        
        // 60min=60min*60seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.println(totalSeconds + " seconds is equivalent to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
