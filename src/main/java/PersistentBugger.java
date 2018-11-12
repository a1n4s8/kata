public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(39));
        System.out.println(persistence(5));
//        System.out.println(persistence(999));
//        System.out.println(persistence(4));
    }


    public static int getans(long n, int p) {

        int r = 1;

        String[] t = Long.toString(n).split("");
        p++;

        for(String a : t){
            r*=Integer.parseInt(a);
        }

        System.out.println(r);

        if(r>9) {
            getans(r,p);
        }

        return r;
    }


    public static int persistence(long n) {

        if(n < 10){
            return 0;
        }

        int result =1;

        getans(n,result);

        return result;
    }
}