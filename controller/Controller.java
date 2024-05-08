package controller;

import model.User;
import service.DataService;

import java.util.List;

public class Controller {
    DataService service = new DataService();
    public void UserList(User user){
        service.UserList(user);
    }
    public List<User> getUserList(String type){
        return service.getUserList(type);
    }
}
