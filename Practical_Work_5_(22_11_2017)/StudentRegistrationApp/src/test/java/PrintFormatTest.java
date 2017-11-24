import org.courses.model.StudentJournal;
import org.courses.model.StudentNote;
import org.courses.view.View;
import org.junit.Before;
import org.junit.Test;

public class PrintFormatTest {

    StudentNote studentNote1;
    StudentNote studentNote2;
    StudentJournal studentJournal;

    View view;

    @Before
    public void createStudentNote(){
        view = new View();

        studentNote1 = new StudentNote();
        studentNote1.setName("Dmitriy ");
        studentNote1.setSurName(" Onishchenko");
        studentNote1.setTelephone("+380964385593");
        studentNote1.setBirthDate("14-08-1993");

        studentNote2 = new StudentNote();
        studentNote2.setName("Ivan         ");
        studentNote2.setSurName("                Kushnir");
        studentNote2.setTelephone("+380956686311");
        studentNote2.setBirthDate("04-12-2017");

        studentJournal = new StudentJournal();
        studentJournal.add(studentNote1);
        studentJournal.add(studentNote2);
    }

    @Test
    public void toStringStudentJournal(){
        System.out.println("Journal:");
        view.displayElementsFromList(studentJournal.getStudentJournal());
    }
}
