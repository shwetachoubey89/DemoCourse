public class Array {
    public static void main(String[] args) {
        int[] marks = new int[4];
        for (int i : marks) {
            i = (int) (Math.random() * 100);
            System.out.println(i);
        }

        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();

        Student xray[] = new Student[4];
        xray[0] = std1;
        xray[1] = std2;
        xray[2] = std3;
        xray[3] = std4;
        for (Student j : xray) {
            j.name = "Std" + (int) (Math.random() * 100);
            j.id = (int) (Math.random() * 10);
            j.marks = (int) (Math.random() * 100);
            System.out.println(j.name + " : " + j.id + " : " + j.marks);

        }
    }
}

class Student {
    int id, marks;
    String name;
}
