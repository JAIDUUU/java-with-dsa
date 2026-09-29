package ops;

public class Student {

    // Attributes
    public int id;
    private int age;
    public String name;
    public int nos;
    private String gf;
    public String getGf(){
        return this.gf;
    }
    public void setAge(){
        return this.age;
    }

    // Methods / Behaviours
    public void study() {
        System.out.println(name + " Studying");
    }

    public void sleep() {
        System.out.println(name + " sleeping");
    }

    public void bunk() {
        System.out.println(name + " bunking");
    }

    private void gf_chatting(){
        System.out.println(name +" gf chatting");
    }

    // Parameterized Constructor
    public Student(int id, int age, String name, int nos,String gf) {
        System.out.println("Student parameterised constructor called");

        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf=gf;

    }
    //copy ctor
    public Student(Student scrob){
        System.out.println("Students parameterised ctor called");
        this.id =scrob.id;
        this.name=scrob.name;
        this.age= scrob.age;
        this.nos=scrob.nos;

    }
}