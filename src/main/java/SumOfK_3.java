import java.util.List;

public class SumOfK_3 {
    public  static Integer chooseBestSum(int t, int k, List<Integer> ls){

        int bestSum = 0;
        int n = ls.size();

//        System.out.println(n);

        for (int i = 0; i <= 3 ; i++) {
            for (int y = 0; y < n-k+1-i ; y++) {
                for (int x = 0; x < n-k+1-i; x++) {
                    if(i < n && i+1 < n && x+y+i+k-1< n ) {
//                        System.out.print("(" + i + " "); // p
//                        System.out.print((i + 1) + " "); //q
//                        System.out.print(x + y + i + k - 1 + ")"); //r

                        int tmp = ls.get(i) + ls.get(i + 1) + ls.get(x + y + i + k - 1);
//                        System.out.print(":"+tmp+", ");
                        if(tmp > bestSum && tmp <= t)
                            bestSum =(Integer)tmp;
                    }
                }
//                System.out.println(" ");
            }
//            System.out.println(" ");
        }
        return bestSum == 0 ? null : bestSum;
    }
}
