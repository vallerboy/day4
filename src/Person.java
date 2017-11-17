public class Person {
    private String name;
    private int age;
    private String date;
    private boolean isHappy;


    public Person(String name, int age, String date){
        this(name, age, date, true);
    }

    public Person(String name, int age, String date, boolean isHappy){
        this.name = name;
        this.age = age;
        this.date = date;
        this.isHappy = isHappy;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public void setHappy(boolean happy) {
        isHappy = happy;
    }
}
