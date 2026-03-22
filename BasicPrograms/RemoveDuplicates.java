package BasicPrograms;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s = "abaabbc";
        String result = "";

        boolean visited[] = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (visited[c] == false) {
                result = result + c;
                visited[c] = true;
            }
        }
        System.out.println(result);
    }

}
