package filemanipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testUser() {
        User user = new User("Péter", "1971", "hadik@gmail");
        System.out.println(user.getUserName());
        System.out.println(user.getBirthday());
        System.out.println(user.getEmail());
    }

}