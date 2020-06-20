package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import java.sql.SQLException;

public class Main {

    public Main() {
    }

    public static void main(String[] args) throws SQLException {
        User user = new User();
        UserDao userDao = new UserDao();
        user= userDao.read(1);
        user.setUserName("jozek");
        user.setEmail("jozek@jozek.com");
        UserDao.update(user);






    }


}
