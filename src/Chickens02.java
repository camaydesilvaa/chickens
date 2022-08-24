public class Chickens02 {
    public static void main(String[] args) {
        int day1 = 100;
        int day2 = 121;
        int day3 = 117;

        int dailyAverage = (day1 + day2 + day3)/3;
        int monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
    
}
