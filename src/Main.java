import oop.Car;

public class Main {
    public static void main(String[] args) {
        Person piotr = new Person("Piotr", 21, "21.11.2017");
        Person agata = new Person("Agata", 25, "17.05.2017");

        System.out.println(piotr.getName());
        System.out.println(agata.isHappy());


        piotr.setHappy(false);


        Car my = new Car("nissan", "quasqai", 2000);
        Car yours = new Car("ford", "focus", 10000);

        my.show();
        yours.show();
    }
}
