import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfKTest {

    public static void main(String[] args) {


        List<Integer> ts = new ArrayList<>(Arrays.asList(50));

        Integer m = SumOfK_3.chooseBestSum(163, 3, ts);

        System.out.println("bestSum : " +m);

    }
}
