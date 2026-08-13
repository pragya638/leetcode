class Solution {
    public int[] scoreValidator(String[] events) {
        int counter = 0, score = 0;
        int n = events.length;

        for (int i = 0; i < n && counter < 10; i++) {

            if (events[i].equals("W")) {
                counter++;
            }
            else if (events[i].equals("WD") || events[i].equals("NB")) {
                score += 1;
            }
            else {
                int k = Integer.parseInt(events[i]);
                score += k;
            }
        }

        return new int[]{score, counter};
    }
}