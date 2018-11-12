import java.util.List;

//      https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa/train/java

public class SumOfK_2 {

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {



        //변수선언
        int bestSum = 0;
        int tmp;
        int lsNum = ls.size();

        System.out.println("t : " + t);
        System.out.println("k : " + k);
        System.out.println("lsNum "+lsNum);
        for (int z = 0; z <lsNum ; z++) {
            System.out.println("ls("+z+") : "+ls.get(z));
        }


        //예외 0 : 마을수가 이동갯수보다 적을경우
        if(lsNum < 3)
            return null;

        //예외 1: 마을간거리가 최대 이동거리보다 클경우
        for(int i = 0; i < lsNum ; i++) {
            //for (int i : ls){     ->    foreach
            if(ls.get(i) > t){
                return null;
            }
        }

        //숫자 조합
        for (int a = 0; a < lsNum ; a++) {
            for (int b = 0; b <  lsNum; b++) {
                for (int c = 0; c < lsNum; c++) {
                    //if(a!=b && b!=c && c!=a){
                        //System.out.println("a "+ a+", b "+b+", c "+c);
                        tmp = ls.get(a) + ls.get(b) + ls.get(c);
                        if(tmp == t){
                            return t;
                        } else if(tmp > bestSum && tmp < t){
                            bestSum = tmp;
                            System.out.println("bestSum C : "+bestSum);
                        }
                    //}
                }
            }
            tmp = 0;
        }

        System.out.println("bestSum : "+bestSum);
        return bestSum;
    }
}
