import erm_project.BloodGroup;
import erm_project.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static erm_project.BloodGroup.A;
import static erm_project.Gender.MALE;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class UserTest {
    User user;

    @BeforeEach
    void setUp() {
        User.setUniqueId();
        user = new User("Somolu", "YabaLeft", "09066655534","somolu@gmail.com","No 34, Ikeja");
    }

    @Test
    void testThatUserProfileCanBeCreated(){
        assertEquals("Somolu YabaLeft", user.getName());
        assertEquals("09066655534", user.getMobile());
        assertEquals("somolu@gmail.com", user.getEmail());
        assertEquals("No 34, Ikeja", user.getAddress());
    }

    @Test
    void testThatUserNameCanBeEdited(){
        user.editUserName("Somolu", "Thomson");
        assertEquals("Somolu Thomson", user.getName());
    }

    @Test
    void testThatUserHasId(){
        assertEquals(1, user.getUserId());
        user = new User("Loyal", "Thomson", "09061234534","kangi@gmail.com","No 34, Bariga");
        assertEquals(2, user.getUserId());
        System.out.println(user.getUserId());
    }

    @Test
    void testTheUserCanInputBloodGroup(){
        user.setBloodGroup(A);
        assertSame(A, user.getBloodGroup());
    }

    @Test
    void testTheUserCanInputGender(){
        user.setGender(MALE);
        assertSame(MALE, user.getGender());
    }

}
