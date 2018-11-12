import java.util.Arrays;

public class ScalingSquaredStrings {

    public static void main(String[] args) {

        String a ="abcd\nefgh\nijkl\nmnop";

        scale(a,2,3);
    }

    public static String scale(String strng, int k, int v) {

        String[] tmp = strng.split("\\n");

        String finResult ="";

//        System.out.println(Arrays.toString(tmp));

        for (int p = 0; p < tmp.length; p++) {

            String resultA = "";
            String resultB = "";
            for (int j = 0; j < tmp[p].length(); j++) {
                for (int i = 0; i < k; i++) {
                    resultA += tmp[p].charAt(j);
//                System.out.println(resultA);
                }
            }

//            System.out.println(resultA);
//
            for (int i = 0; i < v; i++) {
                resultB += resultA+"\n";
            }
//            System.out.println("resultB \n" + resultB);
            finResult += resultB;
        }

//        System.out.println(finResult.trim());
        return finResult.trim();
    }

}
