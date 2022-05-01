import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSkillDemo() {
        assertEquals("Check if this works", 2, SkillDemo.subtract(4, 2));
    }
}