import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int wybor;
    System.out.println(" 0 - zakonczenie programu, 1-wprowadz nowego studenta, 2-wypisac wszystkich studentow");
    wybor = scan.nextInt();
    switch(wybor) {
      case 0:
        System.exit(0);
      case 1:

        System.out.println("Podaj imie:");
        String name = scan.next();
        System.out.println("Podaj nazwisko:");
        String secondname = scan.next();
        System.out.println("Podaj wiek:");
        int age = scan.nextInt();
        try {
          Service s = new Service();
          s.addStudent(new Student(name, secondname, age));
          var students = s.getStudents();
          for (Student current : students){
            System.out.println(current.ToString());
          }
        } catch (IOExcetion e){
          
        }
      case 2:
        try {
          Service s = new Service();
          var students = s.getStudents();
          for (Student current : students){
            System.out.println(current.ToString());
          }
        } catch (IOException e){
          
        }
    }
  }
}