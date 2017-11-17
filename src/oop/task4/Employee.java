package oop.task4;

public class Employee {
    private String name;
    private String lastname;
    private String birthday;
    private String exp;

    public Employee(String name, String lastname, String birthday, String exp) {
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday='" + birthday + '\'' +
                ", exp='" + exp + '\'' +
                '}';
    }
}
