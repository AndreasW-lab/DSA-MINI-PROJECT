public class DailyStatistics {

    public static void displayStatistics(int[] serviceTimes) {

        if (serviceTimes.length == 0) {
            System.out.println("No students have been served.");
            return;
        }

        int totalStudents = serviceTimes.length;
        int totalTime = 0;
        int highestTime = serviceTimes[0];
        int lowestTime = serviceTimes[0];
        int longerThanTen = 0;

        for (int i = 0; i < serviceTimes.length; i++) {

            int currentTime = serviceTimes[i];

            totalTime = totalTime + currentTime;

            if (currentTime > highestTime) {
                highestTime = currentTime;
            }

            if (currentTime < lowestTime) {
                lowestTime = currentTime;
            }

            if (currentTime > 10) {
                longerThanTen++;
            }
        }

        double averageTime =
            (double) totalTime / totalStudents;

        System.out.println("\n--- DAILY STATISTICS ---");
        System.out.println("Total students served: " + totalStudents);
        System.out.println("Total service time: " + totalTime + " minutes");
        System.out.println("Average service time: " + averageTime + " minutes");
        System.out.println("Highest service time: " + highestTime + " minutes");
        System.out.println("Lowest service time: " + lowestTime + " minutes");
        System.out.println("Services longer than 10 minutes: " + longerThanTen);
    }
}