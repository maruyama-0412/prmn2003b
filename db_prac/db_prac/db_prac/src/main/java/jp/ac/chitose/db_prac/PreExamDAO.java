package jp.ac.chitose.db_prac;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PreExamDAO {

    // ↓学籍番号（XXXXXXXX）は、Part.01で設定したあなたの学籍番号の値に書き換えること
    // メンター用ではDBを動かすために担当の学籍番号を使用しています
    private static final String URL = "jdbc:h2:~/h2db/db_prac;AUTO_SERVER=true;MODE=PostgreSQL";
    private static final String USER_NAME = "b2222200";
    private static final String USER_PASS = "b2222200";

    public List<PreExam> selectPreExams(int lessThan) throws SQLException {
        List<PreExam> returning = new ArrayList<>();
        String SQL = "select * from 学生情報 where 得点 < ?";

        try (Connection conn = DriverManager.getConnection(URL, USER_NAME, USER_PASS);
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, lessThan);
            ResultSet result = stmt.executeQuery();
            while (result.next()) {
                String col1 = result.getString("学生コード");
                String col2 = "null";
                String col3 = "null";
                int cor4 = result.getInt("得点");
                PreExam preExam = new PreExam(col1, col2, col3, cor4);
                returning.add(preExam);
            }
        }
        return returning;
    }

}