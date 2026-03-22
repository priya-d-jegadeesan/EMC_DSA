package BasicPrograms;

public class StringRotation {

    public static boolean isRotated(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }
        int n = s1.length();

        for (int i = 0; i < n; i++) {
            String rotated = s1.substring(i) + s1.substring(0, i);

            if (rotated.equals(s2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "cdeab";

        if (isRotated(s1, s2)) {
            System.out.println("Rotation");
        } else {
            System.out.println("Not rotated");
        }

    }
}
