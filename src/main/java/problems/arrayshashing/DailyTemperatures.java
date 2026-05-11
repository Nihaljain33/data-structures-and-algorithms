package problems.arrayshashing;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int hottest = 0;
        int answer[] = new int[n];

        for (int currDay = n - 1; currDay >= 0; currDay--) {
            int currentTemp = temperatures[currDay];
            if (currentTemp >= hottest) {
                hottest = currentTemp;
                continue;
            }

            int days = 1;
            while (temperatures[currDay + days] <= currentTemp) {
                days += answer[currDay + days];
            }
            answer[currDay] = days;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] temps = {73,74,75,71,69,72,76,73};

        int[] res = dailyTemperatures(temps);
        System.out.println(res.toString());
    }
}
