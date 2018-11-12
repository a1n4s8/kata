import java.util.List;

public class SumOfK {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {

        //변수선언
        int bestSum = 0;
        int lsNum = ls.size();

        for(int i = 0; i < lsNum ; i++) {
        //for (int i : ls){     ->    foreach
            if(ls.get(i) > t){
                return -1;
            }
        }

        for (int j = 0; j < lsNum-k ; j++) {
            int tmp = 0;
            tmp += ls.get(j);
            System.out.println("i = " + j);
            for (int a = j+1; a < k+j ; a++) {
                tmp += ls.get(a);
                System.out.println("a = "+ a);
            }
            if(tmp == t)
                return t;

            System.out.println(tmp);
            if((tmp > bestSum) && (tmp < t)){
                bestSum = tmp;
            }
        }

        return bestSum;
    }
}
