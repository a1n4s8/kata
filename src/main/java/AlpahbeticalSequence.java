import java.util.Arrays;

public class AlpahbeticalSequence {

    public static void main(String[] args) {
        System.out.println((int)'a'-(int)'A');
        System.out.println(alphaSeq("bcdzxq"));


    }


    public static String alphaSeq(String s) {
        // your code here
        s = s.toLowerCase();

        char[] array = s.toCharArray();

        Arrays.sort(array);

        s = "";

        for (int i = 0; i < array.length ; i++) {
            s+=(char)(array[i]-32);
            for (int j = 0; j < (int)(array[i])-97; j++) {
                s+=array[i];
            }
            s+=",";
        }

        return s.substring(0,s.length()-1);
    }
}

