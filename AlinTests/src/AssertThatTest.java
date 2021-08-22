import static org.junit.Assert.*;
import static Alin.LessThanOrEqual.*;
import org.junit.Test;

public class AssertThatTest {

    @Test
    public void lessthanOrEquals_custom_matcher() throws Exception {
        int actualGoalScored = 2;
        assertThat(actualGoalScored, lessThanOrEqual(4));
        assertThat(actualGoalScored, lessThanOrEqual(2));

        double originalPI = 3.14;
        assertThat(originalPI, lessThanOrEqual(9.00));
        String authorName = "Alin";
        assertThat(authorName, lessThanOrEqual("Alin1"));

        int maxInt = Integer.MAX_VALUE;
        assertThat(maxInt, lessThanOrEqual(Integer.MIN_VALUE));
    }
}
