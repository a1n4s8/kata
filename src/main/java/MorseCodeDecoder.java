import java.util.Arrays;

public class MorseCodeDecoder {

    public static void main(String[] args) {
        String st = ".... . -.--   .--- ..- -.. .";
        int p = st.length();
        System.out.println(p);
        decode(st);
    }

    public static String get(String p) {
        return null;
    }


    public static String decode(String morseCode) {

        System.out.println(morseCode);
        System.out.println();


        morseCode = morseCode.trim();

        System.out.println(morseCode);

        String[] word = morseCode.split("   ");
        String[] p = {};

        String result = "";


        for (int i = 0; i < word.length; i++) {

            String[] t = word[i].split(" ");

            for (int j = 0; j < t.length; j++) {
                t[j] = t[j].replace(" ", "");
                System.out.println(j + " : " + t[j]);

                result += MorseCodeDecoder.get(t[j]);
            }
            if (i < word.length - 1) {
                result += " ";
            }
        }

        return result;
    }


}
