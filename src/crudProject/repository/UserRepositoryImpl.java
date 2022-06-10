package crudProject.repository;

import crudProject.model.Gender;
import crudProject.model.User;

import java.util.ArrayList;

public class UserRepositoryImpl implements  UserRepository{
private ArrayList<User> users = new ArrayList<>();
    @Override
    public User createUser(String name, int age, Gender gender, String phoneNumber) {
        User user = new User(name, age, gender, phoneNumber);
        users.add(user);
        return user;
    }

    @Override
    public User findUserByNameAndPhone(String name, String phoneNumber) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (name.equals(user.getName()) && phoneNumber.equals(user.getPhoneNumber())){
                return user;
            }
        }
        return null;
    }

    @Override
    public int size() {
        return users.size();
    }

    @Override
    public void updateUserPhoneNumber(String name, String oldPhoneNumber, String newPhoneNumber) {
        if(isUserOnTheList(name,oldPhoneNumber)){
     User foundUser = findUserByNameAndPhone(name,oldPhoneNumber);
     foundUser.setPhoneNumber(newPhoneNumber);}
    }

    @Override
    public void removeUser(String name, String phoneNumber) {
        if(isUserOnTheList(name,phoneNumber)){
            User foundUser = findUserByNameAndPhone(name,phoneNumber);
            users.remove(foundUser);
        }
    }

    public boolean isUserOnTheList(String name, String phoneNumber){
        for (User user : users) {
            if (name.equals(user.getName()) && phoneNumber.equals(user.getPhoneNumber())) {
                return true;
            }
        }
        return false;
    }


}
