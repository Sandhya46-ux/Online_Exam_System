package service;

import dao.*;
import model.*;
import java.util.*;

public class ExamService {
    public void startExam(String user) throws Exception {
        QuestionDAO qdao = new QuestionDAO();
        ResultDAO rdao = new ResultDAO();
        Scanner sc = new Scanner(System.in);

        int score = 0;
        long start = System.currentTimeMillis();

        for (Question q : qdao.getAllQuestions()) {
            if (System.currentTimeMillis() - start > 60000) {
                System.out.println("Time Over!");
                break;
            }

            System.out.println(q.q);
            System.out.println("A. " + q.a);
            System.out.println("B. " + q.b);
            System.out.println("C. " + q.c);
            System.out.println("D. " + q.d);

            char ans = sc.next().toUpperCase().charAt(0);
            if (ans == q.correct) score++;
        }

        rdao.saveResult(user, score);
        System.out.println("Final Score: " + score);
    }
}
