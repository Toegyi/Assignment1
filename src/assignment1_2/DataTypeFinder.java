package assignment1_2;

public class DataTypeFinder {
    public static void main(String[] args) {
        // Use RandomNumbers.java to get random number between 0 to 2 billion
        RandomNumbers rn = new RandomNumbers();
        long number = rn.getRandomInt(0, 2000000000);
        System.out.println("Random Number is "+ number);

        // Find suitable data type to store data
        if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
            System.out.println("Use byte to store " + number);
        } else if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
            System.out.println("Use short to store " + number);
        } else if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
            System.out.println("Use int to store " + number);
        } else {
            System.out.println("Use long to store " + number);
        }
    }
}
