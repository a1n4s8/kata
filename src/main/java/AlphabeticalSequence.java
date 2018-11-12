public class AlphabeticalSequence {

    public static void main(String[] args) {
        System.out.println(alphaSeq("CaD"));
    }

    public static String alphaSeq(String s) {
        String ary[] = new String[s.length()];

        int i = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            ary[i++] = Character.toUpperCase(c) + new String(new char[c - 'a']).replace("\0", "" + c);
            System.out.println(c);
            System.out.println(c-'a');

            System.out.println(ary[0]);
            System.out.println(ary[1]);
            System.out.println(ary[2]);
        }
        java.util.Arrays.sort(ary);
        return String.join(",", ary);
    }
}
