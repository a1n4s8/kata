public class MultiplesOfThreeFive {

    public static void main(String[] args) {
        int ipt = 10;
        System.out.println(solution(ipt));
    }

    public static int solution(int number) {

        int r = 0;

        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                r += i;
//                System.out.println("i : "+i);
//                System.out.println("r : "+r);
            }
        }

        return r;
    }
}
