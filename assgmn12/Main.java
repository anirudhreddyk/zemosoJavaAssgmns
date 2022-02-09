package assgmn12;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> student_list = new ArrayList<>();

        student_list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        student_list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        student_list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        student_list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        student_list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        student_list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        student_list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        student_list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        student_list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        student_list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        student_list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        student_list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        student_list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        student_list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        student_list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        student_list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        student_list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));

        System.out.println("List of distinct departments : ");
        FilterStudents.getDistinctDepartments(student_list);
        System.out.println();

        System.out.println("List of students who enrolled after 2018 : ");
        FilterStudents.getStudentsEnrolledAfter2018(student_list);
        System.out.println();

        System.out.println("Details of male students in Computer Science department : ");
        FilterStudents.getMaleStudentsInCSE(student_list);
        System.out.println();

        FilterStudents.getCountOfMaleAndFemale(student_list);
        System.out.println();

        FilterStudents.getAverageAge(student_list);
        System.out.println();

        System.out.println("Student with highest percentage : ");
        FilterStudents.getStudentWithHighestPercentage(student_list);
        System.out.println();

        System.out.println("Number of students in each department : ");
        FilterStudents.getStudentsInEachDepartment(student_list);
        System.out.println();

        System.out.println("Average percentage achieved in each department");
        FilterStudents.getAvgPercentageInEachDepartment(student_list);
        System.out.println();

        System.out.println("Youngest male student in Electronic department : ");
        FilterStudents.getYoungMaleInElectronic(student_list);
        System.out.println();

        FilterStudents.getMaleFemaleInCSE(student_list);
        System.out.println();

    }
}
