package crudProject.repository;

import crudProject.model.Gender;
import crudProject.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryImplTest {
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        userRepository = new UserRepositoryImpl();
    }

    @Test
    public void userRepositoryCanBeCreatedTest() {
        assertNotNull(userRepository);
    }

    @Test
    public void userCanBeCreatedTest() {
        User user = userRepository.createUser("Wale", 30, Gender.M, "0810185250");
        assertEquals(1, userRepository.size());
        assertEquals(user.getName(), "Wale");

    }

    @Test
    public void userDetailsCanBeRetrieved() {
        userRepository.createUser("Wale", 30, Gender.M, "0810185250");
        User found = userRepository.findUserByNameAndPhone("Wale", "0810185250");
        assertEquals("""
                name = Wale
                age = 30
                gender = M
                phone-number = 0810185250""", found.toString());
    }

    @Test
    public void userDetailsCanBeUpdated() {
        userRepository.createUser("Wale", 30, Gender.M, "0810185250");
        userRepository.updateUserPhoneNumber("Wale", "0810185250", "09021806462");
        User found = userRepository.findUserByNameAndPhone("Wale", "09021806462");
        assertEquals("""
                name = Wale
                age = 30
                gender = M
                phone-number = 09021806462""", found.toString());
    }

    @Test
    public void userCanBeRemoved() {
        userRepository.createUser("Wale", 30, Gender.M, "0810185250");
        userRepository.createUser("Johanna", 15, Gender.F, "09023456789");
        userRepository.createUser("Peace", 41, Gender.M, "08124590865");
        assertEquals(3, userRepository.size());
        userRepository.removeUser("Johanna", "09023456789");
        assertEquals(2, userRepository.size());
        assertFalse(userRepository.isUserOnTheList("Johanna", "09023456789"));

    }
}