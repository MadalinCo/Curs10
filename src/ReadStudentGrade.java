import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



public class ReadStudentGrade {

    public static void main(String[] args) throws FileNotFoundException {
      List<StudentGrade> studentsArray =  readStudents("files/grades.txt");
        for(StudentGrade students: studentsArray){
            /*System.out.println(students.getName());
            System.out.println(students.getDiscipline());
            System.out.println(students.getGrade());
            System.out.println();
            List<StudentGrade> list = new ArrayList<>(students.getGrade());
            String[] tokens = {"aa"};*/



        }
    }

    private static List<StudentGrade> readStudents(String filePath) throws FileNotFoundException {
        List<StudentGrade> students = new ArrayList<>();
        Scanner scanner = new Scanner(new File(filePath));
        while (scanner.hasNext()){
            String line = scanner.nextLine();
            students.add(getStudentFromLine(students, line));

        }
        return students;
    }

    private static StudentGrade getStudentFromLine(List<StudentGrade> students, String line) {
        String[] tokens = line.split("\\|");
        return new StudentGrade(tokens[0],
                tokens[1],
                Integer.parseInt(tokens[2]) );


    }
}
