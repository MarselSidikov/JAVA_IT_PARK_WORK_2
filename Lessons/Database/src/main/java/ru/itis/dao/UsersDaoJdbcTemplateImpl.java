package ru.itis.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UsersDaoJdbcTemplateImpl implements UsersDao {

    //language=SQL
    private final static String SQL_SELECT_ALL_USERS =
            "SELECT * FROM human";
    //language=SQL
    private final static String SQL_SELECT_ALL_USERS_BY_AGE =
            "SELECT * FROM human WHERE age = ?";

    //language=SQL
    private final static String SQL_UPDATE_USER =
            "UPDATE human SET name = ?, age = ?, height = ? WHERE id = ?";

    //language=SQL
    private final static String SQL_INSERT_USER =
            "INSERT INTO human(name, age, height) VALUES(?, ?, ?)";

    private JdbcTemplate template;

    public UsersDaoJdbcTemplateImpl(DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public boolean isExistById(int userId) {
        return false;
    }

    public List<User> findByName(String name) {
        return null;
    }

    public List<User> findByAge(int age) {
        return null;
    }

    public int save(User model) {
        return 0;
    }

    public User find(int id) {
        return null;
    }

    public void update(User model) {

    }

    public void delete(int id) {

    }

    private RowMapper<User> userRowMapper = new RowMapper<User>() {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            int height = resultSet.getInt("height");
            return new User(id, name, age, height);
        }
    };

    public List<User> findAll() {
        return template.query(SQL_SELECT_ALL_USERS, userRowMapper);
    }
}
