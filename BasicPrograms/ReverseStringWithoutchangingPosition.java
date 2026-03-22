package BasicPrograms;
public class ReverseStringWithoutchangingPosition {

    public static void main(String[] args) {

        String s = "Priya Dharshini";
        String result = "";

        String words[] = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverse = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reverse = reverse + word.charAt(j);
            }
            result = result + reverse + " ";
        }
        System.out.println(result.trim());

    }
}
