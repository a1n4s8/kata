public class DecodeResistorColors {

    public enum Colour {
        black, brown, red, orange, yellow, green, blue, violet, gray, white
    };

    public static String decodeResistorColors(String bands) {

//parsing1
        String tmp[] = bands.split(" ");
        String result;
        String tpA = tmp[0];
        String tpB = tmp[1];
        String tpC = tmp[2];


        int ohms;
        double ohm;
        int ohmA = (Colour.valueOf(tpA).ordinal() * 10 + Colour.valueOf(tpB).ordinal());
        int ohmB = (int)Math.pow(10.0, Colour.valueOf(tpC).ordinal());
        ohms =  ohmA * ohmB;

        String tol;

        if (tmp.length == 4) {
            tol = tmp[3];
            tol = (tol.equals("gold")) ? "5" : "10";
        } else {
            tol = "20";
        }

//get ohms + result
        if (ohms < 1000) {
            result = Integer.toString(ohms) + " ohms, " + tol + "%";
        } else if (1000000 <= ohms) {
            ohm = ohms / (double)1000000;
            result = ohm + "M ohms, " + tol + "%";
            if(ohms%1000000 == 0){
                result = ohms/1000000 + "M ohms, " + tol + "%";
            }
        } else {
            ohm = ohms / (double) 1000;
            result = ohm + "k ohms, " + tol + "%";
            if(ohms%1000 == 0){
                result = ohms/1000 + "k ohms, " + tol + "%";
            }
        }

        return result;
    }
}