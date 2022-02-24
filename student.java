package Encapsulation;

public class student {

    private String name;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Salman");
        s1.setId(14580);
        String sName = s1.getName();
        System.out.println("Name:" + sName);
        System.out.println("Id:" + s1.getId());

    }

}
