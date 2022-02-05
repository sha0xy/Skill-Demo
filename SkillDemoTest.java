import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void percentageTest() {
        assertEquals("Test 100 percent", 100, SkillDemo.percentage(1, 1));
    }
}
