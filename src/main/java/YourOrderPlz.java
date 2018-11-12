import javax.websocket.Decoder;
import java.util.Arrays;

public class YourOrderPlz {

    public static void main(String[] args) {
        String or ="is2 Thi1s T4est 3a";
        System.out.println(order(or));
    }


    public static String order(String words) {

        String newWords[] = new String[words.split(" ").length];
//        System.out.println(Arrays.toString(newWords));
        for(String word : words.split(" ")){
//            System.out.println(word);
            int idx = Integer.parseInt(word.replaceAll("[^0-9]",""))-1;
//            System.out.println(idx);
            newWords[idx] = word;
        }

        return  String.join(" ",newWords);
    }
}


