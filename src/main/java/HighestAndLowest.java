import java.util.Arrays;

public class HighestAndLowest {

    public static void main(String[] args) {
        System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String HighAndLow(String numbers) {
        // Code here or

        String[] num = numbers.split(" ");
        int[] tmp = {Integer.parseInt(num[0]),Integer.parseInt(num[0])};

//        System.out.println(Arrays.toString(num));

        for (String k : num) {
//            System.out.println("============================");
//            System.out.println("cur : "+k);
//            System.out.println("----------------------------");
////            System.out.println("max : "+result.substring(0,1));
////            System.out.println("min : "+result.substring(2));
//            System.out.println("max : "+tmp[0]);
//            System.out.println("min : "+tmp[1]);
//            System.out.println("----------------------------");
//
//            result = Integer.max(Integer.parseInt(k), Integer.parseInt(result.substring(0,1))) + " "
//                    + Integer.min(Integer.parseInt(k), Integer.parseInt(result.substring(2)));
//            //2자리수 때문에 안됨
            tmp[0] = Integer.max(tmp[0],Integer.parseInt(k));
            tmp[1] = Integer.min(tmp[1],Integer.parseInt(k));
//            System.out.println("============================");
//            System.out.println("result : "+tmp[0]+" "+tmp[1]);
        }
        return tmp[0]+" "+tmp[1];
    }
}
