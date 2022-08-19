public class Main {
    public static void main(String[] args) {

        int[] userNumbers = {1, 2, 5, 9, 6};

        Lottery lottery = new Lottery();
        int match = lottery.compareNumbers(userNumbers);
        System.out.println("You matched " + match + " digits");


    }
}