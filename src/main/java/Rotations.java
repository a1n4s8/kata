import java.util.ArrayList;
import java.util.List;

public class Rotations {

    public static boolean containAllRots(String strng, List<String> arr) {

        //exception 1  -> strng == ""
        //isNull(strng);

        int arrLen = arr.size();
        int strLen = strng.length();

        //make rotatedStrng


        //System.out.println("false will be returned!!");
        return false;
    }

    public boolean isNull(String strng) {
        if (strng == "") {
            //System.out.println("1. strng == \"\" !!!");
            return true;
        }
        return false;
    }

    public void createRot(String strng, int strLen) {
        List<String> rotatedStrng = new ArrayList<>();
        String tmp = strng;

        for (int i = 0; i < strLen; i++) {
            tmp = tmp.substring(1, strLen) + tmp.substring(0, 1);
            //System.out.println(tmp);
            rotatedStrng.add(tmp);
        }
    }

    public void cmpStrArr(int strLen, int arrLen, List<String> rotatedStrng, List<String> arr) {
        //cmp rotated Str, arr[j]
        int ct = strLen;
        for (int j = 0; j < arrLen; j++) {
            for (int k = 0; k < rotatedStrng.size(); k++) {
                if (arr.get(j).equals(rotatedStrng.get(k))) {
                    //System.out.println("remove : " + rotatedStrng.get(k));

                    rotatedStrng.remove(k);
                    k--;
                    if (rotatedStrng.isEmpty()) {
                        //System.out.println("rotatedStrng is empty!!");
                        //return true;
                    }
                }
            }
        }
    }


}