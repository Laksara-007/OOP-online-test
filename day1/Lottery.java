public class Lottery {
    private int[] lotteryNumbers;

      public Lottery() {
        lotteryNumbers = new int[5];
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = (int)(Math.random() * 10);
            System.out.println(lotteryNumbers[i]);
        }

    }
    public int compareNumbers(int[] userNumbers) {
        int matches = 0;
        for (int i = 0; i < userNumbers.length; i++) {
                if (userNumbers[i] == lotteryNumbers[i]) {
                    matches++;
                }
        }
        return matches;
    }
}
