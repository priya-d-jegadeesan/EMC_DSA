package BasicPrograms;

public class WordCount {

    public static void main(String[] args) {

        String s = "I love java program";
        String words[] = s.split(" ");

        System.out.println("Words count = " + words.length);
    }

}
