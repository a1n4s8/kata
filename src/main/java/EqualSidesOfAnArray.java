public class EqualSidesOfAnArray {

    public static void main(String[] args) {
//        int[] ar = {1,2,3,4,3,2,1};
//        int[] ar ={1,100,50,-51,1,1};
        int[] ar ={1,2,3,4,5,6};
        System.out.println(findEvenIndex(ar));
    }

    public static int findEvenIndex(int[] arr) {

        int len = arr.length;
//        System.out.println(len);

        for(int i =0; i < len ; i ++){
//            System.out.println("i : " + i);
               //i = idx
            int left =0;
            int right =0;

            for (int j = 0; j < i; j++) {
               left +=  arr[j];
               //leftside sum
//                System.out.println("left "+j+" : " +left);
            }
            for (int k = i+1; k < len ; k++) {
                right += arr[k];
                //rightside sum
//                System.out.println("right "+k+" : " + right);
            }
            if(left == right){
                return i;
            }
        }

        return -1;
    }
}
