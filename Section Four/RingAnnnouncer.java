public class RingAnnnouncer {

    public static void main(String[] args) {

        achieve_records();
    }

    public static String[] achieve_records() {
        String[] records = { "Win", "Lose", "Draw", "Win", "Lose", "Win", "Draw", "Lose", "Win", "Draw", "Lose", "Win","Draw" };
        int result_count = 0;
        for (int i = 0; i < records.length; i++) {
            if (records[i].equals("Win")) {
                result_count++;
            }
        }
        System.out.println("With a professional record of " + result_count + " wins, he is the pride of the team.");

        return records;
    }

}
