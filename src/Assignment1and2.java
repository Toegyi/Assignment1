public class Assignment1and2 {
    public static void main(String[] args) {
        // Assignment1
        String name = "\u1010\u102D\u102F\u1038"; // UTF-16 encoding for "Toe" in Myanmar Language
        String waveEmoji = "\uD83D\uDC4B"; // waving hand emoji
        System.out.println("Hi"+ waveEmoji+",my name is "+ "\"" +name +"\""); // Toe

        // Assignment2
        System.out.println("Size of the String name is "+ name.length());
    }
}