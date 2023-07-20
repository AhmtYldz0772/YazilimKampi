import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
       /// burada TreeSet kullanımına örnek bakabilirsiniz
       /* TreeSet <Student> students = new TreeSet<>(new OrderNoteComparator().reversed());
        students.add(new Student("Ahmet: ", 100));
        students.add(new Student("Mehmet: ", 23));
        students.add(new Student("Beyza: ", 67));
        students.add(new Student("Damla: ", 90));
        students.add(new Student("Cemre: ", 85));

        for (Student stu: students)
        {
            System.out.println(stu.getName() + stu.getNote());
        }*/
        /// **********************************************

        /// burada ArrayList örneği bulunmaktadır. hangi sıra ile girdiyse o sıra ile çıkar. aynı elemandan birden fazla tutabilir.


        List<Integer> arl = new ArrayList<>();
        arl.add(99);
        arl.add(99);
        arl.add(49);
        arl.add(79);
        arl.add(69);
        arl.add(89);
        arl.add(90);
        System.out.println(arl);
        System.out.println(arl.size());// size ilekaç eleman olduğunu yani boyutunu öğrenebiliriz
        System.out.println("************");
        System.out.println(arl.indexOf(69)); // belitilen değer hangi indexte onu öğrenebilirsin
        Iterator<Integer> itl = arl.iterator();// ıterator ile arryliste dönebilrsin 
        while (itl.hasNext())
        {
            System.out.println(itl.next());
        }
    }
}