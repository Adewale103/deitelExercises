package crudProject.repository;

import crudProject.model.Gender;
import crudProject.model.User;

public interface UserRepository {
    User createUser(String name, int age, Gender gender,String phoneNumber);
    User findUserByNameAndPhone(String name, String phoneNumber);

    int size();

    void updateUserPhoneNumber(String name, String oldPhoneNumber, String newPhoneNumber);

    void removeUser(String name, String phoneNumber);

    boolean isUserOnTheList(String name, String phoneNumber);
}
