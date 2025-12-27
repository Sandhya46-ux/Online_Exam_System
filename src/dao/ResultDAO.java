package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ResultDAO {

    public void saveResult(String username, int score) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO results(username, score) VALUES (?, ?)"
        );
        ps.setString(1, username);
        ps.setInt(2, score);
        ps.executeUpdate();
    }
}
