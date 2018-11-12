import java.util.List;

public class RotationsF1 {


    public static boolean containAllRots(String strng, List<String> arr) {
        // your code

        //exception 1  -> strng == ""
        if(strng == ""){
            System.out.println("1. strng == \"\" !!!");
            return true;
        }

        int arrLen = arr.size();

        for (int i = 0; i < arrLen; i++) {
            //exception 2  -> strng > arr
            if(strng.length() > arr.get(i).length()){
                System.out.println("2. strng.length() > arr.get(i).length() !!!");
                return false;
            }

            int ct=0;
            for (int j = 0; j <  arr.get(i).length(); j++) {
                for (int k = 0; k < strng.length(); k++) {
                    if(strng.indexOf(k) == arr.get(i).indexOf(j)){
                        ct++;

                        break;
                    }
                }
                if(ct < strng.length()){
                    System.out.println("3. arr dosn't contain strng !!!");
                    return false;
                }
            }
        }
        System.out.println("true. arr contain strng !!");
        return true;
    }
}