import model.*;
import view.*;

public class Main {
    public static void main(String[] args) {

        User student1 = new Student("Петров Иван", 19,001);
        User student2 = new Student("Субочев Владислав", 19,002);
        User student3 = new Student("Картон Яна", 21,003);
        User student4 = new Student("Тверской Владимир", 20,003);
        User teacher1 = new Teacher("Стаф Никола", 57, "математика");
        User student5 = new Student("Гришин Семён", 21,004);
        User student6 = new Student("Валерина Евгения", 19,005);
        User student7 = new Student("Никифиров Сергей", 20,006);
        User student8 = new Student("Комаров Денис", 19,007);
        User student9 = new Student("Караськов Валерий", 20,010);
        User teacher2 = new Teacher("Кингфактор Роман", 60, "физика");


        StudyGroupView students1 = new StudyGroupView();
        students1.addStudent(student1);
        students1.addStudent(student2);
        students1.addStudent(student3);
        students1.addStudent(student4);
        StudyGroupView students2 = new StudyGroupView();
        students2.addStudent(student5);
        students2.addStudent(student6);
        students2.addStudent(student7);
        students2.addStudent(student8);
        students2.addStudent(student9);




        StudyGroupView studyGroupView = new StudyGroupView();
        StudyGroup studyGroup1 = studyGroupView.createStudyGroup("Галактика", (Teacher) teacher1, students1.getStudents());
        StudyGroup studyGroup2 = studyGroupView.createStudyGroup("Инферно", (Teacher) teacher2, students2.getStudents());
        studyGroupView.displayStudyGroup(studyGroup1);
        studyGroupView.displayStudyGroup(studyGroup2);
    }
}
