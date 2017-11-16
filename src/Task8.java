public class Task8 {
    public static void main(String[] args) {
        int[] ints  = {1,2,3,4,5,6,7,9, 1, 2};

        StringBuilder stringBuilder = new StringBuilder();

        for (int anInt : ints) {
            int rest = anInt % 37;
            if(!stringBuilder.toString().contains(rest+"")){
                stringBuilder.append(rest).append(";");
            }
        }


        System.out.println("Ilosc roznych reszt: ");
        System.out.println(stringBuilder.toString().split(";").length);
    }
}
