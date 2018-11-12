public class SpeedControl {

    public static void main(String[] args) {
        double[] x = new double[] {0.0, 0.23, 0.46, 0.69, 0.92, 1.15, 1.38, 1.61};
        System.out.println(gps(20,x));
    }

    public static int gps(int s, double[] x) {
        // your code
        double max = 0;
        for(int i =0 ; i < x.length-1 ; i ++){
            double tmp = (x[i+1]-x[i])*3600/s;
            if(tmp > max){
                max = tmp;
            }
        }
        return (int)max;
    }
}
