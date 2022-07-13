public class WorkShift
{
    public static void main(String[] args)
    {
    
        //20 hours, 42 minutes, and 16 seconds
        //Convert to seconds
        
        int totalHours = 20;
        int totalMinutes = 42;
        int totalSeconds = 16;
        totalHours *= 60;
        totalHours *= 60;
        //totalHours is now totalSeconds
        
        totalMinutes *= 60;
        //totalMinutes is now totalSeconds
        
        int totalTime = totalHours + totalMinutes + totalSeconds;
        System.out.println(totalTime);
    }
}
