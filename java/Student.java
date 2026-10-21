public class Student {
    private final String name;
    private final int mark;
    public Student(String name, int mark) { this.name=name; this.mark=mark; }
    public void display() { System.out.println(name + " scored " + mark); }
    public static void main(String[] args) { new Student("Asha", 92).display(); }
}