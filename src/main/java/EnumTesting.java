import java.util.Arrays;
import java.util.List;

public class EnumTesting {

    //public static String bands = "green blue blue gold";
    //public static String bandt = "white yellow yellow silver";

    public static void main(String[] args) {
        //DecodeResistorColors.decodeResistorColors(bands);
        //DecodeResistorColors.decodeResistorColors(bandt);


        List<String> a = Arrays.asList("TzYxlgfnhf", "yqVAuoLjMLy", "BhRXjYA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        List<String> b = Arrays.asList("TzYx", "yqVAuoLjMLy", "BhRXjA", "YABhRXj", "hRXjYAB", "jYABhRX", "XjYABhR", "ABhRXjY");
        List<String> c = Arrays.asList("abc", "bca", "cab", "twZNsslC", "jqbs");

        //System.out.println(" ");
        System.out.println("result1 = " + Rotations.containAllRots("", a));
        System.out.println("result2 = " + Rotations.containAllRots("XjYABhR", b));
        System.out.println("result3 = " + Rotations.containAllRots("abc", c));

        //System.out.println("XjYABhR".equals("XjYABhR"));
    }
}