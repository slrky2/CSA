public class MathEx{
    public static void main(String[] args){
        System.out.println(swap(123));
        System.out.println(swap(421));
        System.out.println(swap(534));

        TimeLeft(1, 30, 4, 40);
        TimeLeft(3, 40, 10, 14);

         System.out.println(DayOftheWeek(4,18));

    }
    public static int swap(int x){
        int answer2 = (x/10)%10;
        int answer = x/100;
        int answer3 = x%10;
        int result = (answer3*100) + (answer2*10) + answer;
        return result;
    }
    

    public static void TimeLeft(int a, int b, int c, int d){
        int curHour = a*60;
        int depHour = c*60;
        int curMin = curHour + b;
        int depMin = depHour + d;

        int bub = depMin - curMin;
        int yay = bub/60;
        int yay2 = bub%60;
        System.out.println(yay + (" hours and ") + yay2 + (" mins"));
        
    }
    public static int DayOftheWeek(int y, int z){
        int date = (y+z-1)%7;
        return date;

    }

}