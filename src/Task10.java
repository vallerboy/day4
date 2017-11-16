public class Task10 {
    public static void main(String[] args) {
        String a = "";
        a += 5;
        a += 'a';
        a += false;

        if(a.intern() == "5afalse")
            System.out.println("jest == ");

        if(a.equals("5afalse"))
            System.out.println("jest equals");
    }
}
