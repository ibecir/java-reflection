package ba.edu.ibu.reflection;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void meow() {
        System.out.println("meow");
    }

    public void saySomething(String something) {
        System.out.println("THE METHOD saySomething SAID -> " + something);
    }

    private void heyThisIsPrivate() {
        System.out.println("How did you call this??");
    }
}
