import java.util.Arrays;

public class NumAndIpAdd {
    public static void main(String[] args) {
//        String hasDot =  "10.0.3.193";
        String hasDot =  "255.255.255.255";
//        String noDot =  "4294967295";
//        String pepe =  "2457717041";

        System.out.println(numberAndIPaddress(hasDot));
//        System.out.println(numberAndIPaddress(noDot));
//        System.out.println(numberAndIPaddress(pepe));
    }

    public static String numberAndIPaddress(String s) {
        String result;

        if(s.contains(".")){
            result = toDeci(s);
        } else{
            result = toBina(s);
        }
        return result;
    }

    public static String toDeci(String s){
        String binaStr = "";

//        System.out.println("s ; "+ s);

        for(String parsed : s.split("\\.")){
            String zeros = "";
            int addedZeros = Integer.numberOfLeadingZeros(Integer.parseInt(parsed))-24;

//            System.out.println("parsed :" + Integer.toBinaryString(Integer.parseInt(parsed)));


            if(Integer.parseInt(parsed)==0){
                addedZeros -= 1;
            }
//            System.out.println("addedZeros: " + addedZeros);

            for (int i = 0; i < addedZeros; i++) {
                zeros += "0";
            }
//            System.out.println(zeros+Integer.toBinaryString(Integer.parseInt(parsed)));
            binaStr += zeros+Integer.toBinaryString(Integer.parseInt(parsed));
        }

//        System.out.println("binaStr :" + binaStr);
//        String rr = Long.toString(Long.parseLong(binaStr,2));
//        System.out.println(rr);
//        System.out.println("rr : " +rr);
//4294967295
        return Long.toString(Long.parseLong(binaStr,2));
    }


    public static String toBina(String s){

        String[] deciArr = new String[4];
        String binaString = "";
        String parsed = Integer.toBinaryString(Integer.parseUnsignedInt(s));
//        System.out.println(parsed);

        int addedZeros =32- parsed.length();
//        System.out.println("addedZeros : " +addedZeros);

        for (int i = 0; i < addedZeros; i++) {
            binaString += "0";
        }

        binaString += parsed;


//        System.out.println("deciArr:"+ "0000"+Integer.toBinaryString(Integer.parseInt(s)));
//        System.out.println("binaString:" +binaString);
        for (int i = 0; i < deciArr.length; i++) {
            deciArr[i] = binaString.substring(i*8,i*8+8);
            deciArr[i] = Integer.toString(Integer.parseInt(deciArr[i],2));
        }
//        System.out.println(String.join(".",deciArr));

//        System.out.println(Arrays.toString(deciArr));

        return String.join(".",deciArr);
    }

}
