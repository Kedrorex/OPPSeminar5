package view;

import controller.Controller;
import model.User;

import java.util.List;

public class StudentView {
    private Controller controller = new Controller();

    public void UserList(User user){
        controller.UserList(user);
        System.out.println("Студент" + user + " успешно добавлен");
    }
    public List<User> getUserList(){
        return controller.getUserList("student");
    }
}