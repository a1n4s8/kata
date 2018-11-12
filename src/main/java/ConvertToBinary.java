public class ConvertToBinary {

    public static void main(String[] args) {
        System.out.println(toBinary(8));

    }

    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }

}


