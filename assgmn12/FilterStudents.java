package assgmn12;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterStudents {
    public static void getDistinctDepartments(List<Student> list) {
        list.stream()
                .map(Student::getEngDepartment)
                .distinct()
                .forEach(s -> System.out.println(s));
    }

    public static void getStudentsEnrolledAfter2018(List<Student> list) {
        list.stream()
                .filter(student -> student.getYear_of_enrollment() > 2018)
                .forEach(System.out::println);
    }

    public static void getMaleStudentsInCSE(List<Student> list) {
        list.stream()
                .filter(student -> { return student.getEngDepartment().equals("Computer Science") && student.getGender().equals("Male");})
                .forEach(System.out::println);
    }

    public static void getCountOfMaleAndFemale(List<Student> list) {
        long male_count = list.stream()
                .filter(student -> student.getGender().equals("Male"))
                .count();
        long female_count = list.size() - male_count;

        System.out.println("Male count is : " + male_count);
        System.out.println("Female count is : " + female_count);
    }

    public static void getAverageAge(List<Student> list) {

        List<Integer> female_students = list.stream()
                .filter(student -> student.getGender().equals("Female"))
                .map(Student::getAge)
                .collect(Collectors.toList());

        long female_age = female_students.stream()
                .reduce(0, Integer::sum);

        long female_avg = female_age / female_students.size();

        List<Integer> male_students = list.stream()
                .filter(student -> student.getGender().equals("Male"))
                .map(Student::getAge)
                .collect(Collectors.toList());

        long male_age = male_students.stream()
                .reduce(0, Integer::sum);

        long male_avg = male_age / male_students.size();

        System.out.println("Average of ages of female students : " + female_avg);
        System.out.println("Average of ages of male students : " + male_avg);

    }

    public static void getMaleFemaleInCSE(List<Student> list) {
        long male_count = list.stream()
                .filter(student -> student.getGender().equals("Male") && student.getEngDepartment().equals("Computer Science"))
                .count();

        long female_count = list.stream()
                .filter(student -> student.getGender().equals("Female") && student.getEngDepartment().equals("Computer Science"))
                .count();

        System.out.println("No of male students in CSE : " + male_count);
        System.out.println("No of female students in CSE : " + female_count);
    }

    public static void getStudentWithHighestPercentage(List<Student> list) {
        Student topper = list.stream()
                .max(Comparator.comparingDouble(Student::getPercentage))
                .orElse(null);

        System.out.println(topper.toString());
    }

    public static void getStudentsInEachDepartment(List<Student> list) {
        Map<String, Long> department_count = list.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.counting()));

        for(Map.Entry<String, Long> val : department_count.entrySet()) {
            System.out.println(val.getKey() + " : " + val.getValue());
        }
    }

    public static void getAvgPercentageInEachDepartment(List<Student> list) {
        Map<String, Double> departmentAverage = list.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment, Collectors.averagingDouble(Student::getPercentage)));

        for(Map.Entry<String, Double> department : departmentAverage.entrySet()) {
            System.out.println(department.getKey() + " : " + department.getValue());
        }
    }

    public static void getYoungMaleInElectronic(List<Student> list) {
        Student young_student = list.stream()
                .filter(student -> student.getEngDepartment().equals("Electronic") && student.getGender().equals("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)))
                .orElse(null);

        System.out.println(young_student.toString());
    }
}
