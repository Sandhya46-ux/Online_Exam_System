package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Question;

public class QuestionDAO {

    public List<Question> getAllQuestions() throws Exception {
        List<Question> list = new ArrayList<>();

        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM questions");

        while (rs.next()) {
            Question q = new Question();
            q.id = rs.getInt("id");
            q.q = rs.getString("question");
            q.a = rs.getString("option_a");
            q.b = rs.getString("option_b");
            q.c = rs.getString("option_c");
            q.d = rs.getString("option_d");
            q.correct = rs.getString("correct_option").charAt(0);
            list.add(q);
        }
        return list;
    }
}
