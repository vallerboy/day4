public class Task7 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,3,3,4,5,6,7,8};


        int localCounter = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int i1 = i; i1 < ints.length; i1++) {
                 if(ints[i] == ints[i1]){
                     localCounter++;
                 }
            }
            if(localCounter >= 3){
                System.out.println("TAK");
                break;
            }
        }
    }
}
