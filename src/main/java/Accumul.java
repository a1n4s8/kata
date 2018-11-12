public class Accumul {

    public static String accum(String s) {
        String ac = "";


        for (int i = 0; i < s.length(); i++) {
            s = s.toUpperCase();
            ac += s.charAt(i);

            s=s.toLowerCase();
            for (int j = 0; j < i; j++) {
                ac += s.charAt(i);
            }
            if(i+1 < s.length())
                ac += "-";
        }

        return ac;
    }
}