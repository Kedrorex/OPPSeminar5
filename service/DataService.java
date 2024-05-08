package service;
import model.Student;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> studentList = new ArrayList<>();
    private List<User > techerList = new ArrayList<>();

    public void UserList(User user){
        if(user instanceof Student){
            studentList.add(user);
        } else if (user instanceof Teacher){
            techerList.add(user);
        }

    }

    public List<User> getUserList(String type){
        if(type.equals("student")){
            return studentList;
        }else if (type.equals("techer")) {
            return techerList;
        }
        return null;
    }
}