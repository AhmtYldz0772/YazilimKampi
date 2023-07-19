import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet <Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
        students.add(new Student("Ahmet: ", 100));
        students.add(new Student("Mehmet: ", 23));
        students.add(new Student("Beyza: ", 67));
        students.add(new Student("Damla: ", 90));
        students.add(new Student("Cemre: ", 85));

        for (Student stu: students)
        {
            System.out.println(stu.getName() + stu.getNote());
        }

    }
}