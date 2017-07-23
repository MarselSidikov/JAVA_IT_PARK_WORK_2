package ru.itis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;
import ru.itis.models.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Component("usersDaoJdbc")
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

    //language=SQL
    private final static String SQL_SELECT_BY_ID =
            "SELECT * FROM human WHERE id = ?";

    //language=SQL
    private final static String SQL_SELECT_COUNT_BY_ID =
            "SELECT COUNT(*) FROM human WHERE id = ?";

    private JdbcTemplate template;

    @Autowired
    public UsersDaoJdbcTemplateImpl(@Qualifier("itpark_db") DataSource dataSource) {
        this.template = new JdbcTemplate(dataSource);
    }

    public boolean isExistById(int userId) {
        int count = template.queryForObject(SQL_SELECT_COUNT_BY_ID, Integer.class, userId);
        return count == 1;
    }

    public List<User> findByName(String name) {
        return null;
    }

    public List<User> findByAge(int age) {
        return null;
    }

    public int save(User model) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(template);
        jdbcInsert.withTableName("human").usingGeneratedKeyColumns("id");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("name", model.getName());
        params.put("age", model.getAge());
        params.put("height", model.getHeight());
        int id = jdbcInsert.executeAndReturnKey(params).intValue();
        model.setId(id);
        return id;
    }

    public User find(int id) {
        return template.queryForObject(SQL_SELECT_BY_ID, userRowMapper, id);
    }

    public void update(User model) {
        template.update(SQL_UPDATE_USER, model.getName(), model.getHeight(), model.getAge(), model.getId());
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
