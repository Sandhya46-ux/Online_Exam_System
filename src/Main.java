import dao.UserDAO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import service.ExamService;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new FileReader("files/instructions.txt")
        );
        br.lines().forEach(System.out::println);

        Scanner sc = new Scanner(System.in);

        System.out.print("Username: ");
        String username = sc.next();

        System.out.print("Password: ");
        String password = sc.next();

        UserDAO dao = new UserDAO();
        if (dao.login(username, password)) {
            new ExamService().startExam(username);
        } else {
            System.out.println("Invalid Login");
        }
    }
}
