import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GradeTest {
    @Test
    public void fiftyNineShoudReturnF() {
        Grade grader = new Grade();
        assertEquals('F', grader.deterineLetterGrade(59));
    }

    @Test
    public void sixtyNineShoudReturnD() {
        Grade grader = new Grade();
        assertEquals('D', grader.deterineLetterGrade(69));
    }

    @Test
    public void seventyNineShoudReturnC() {
        Grade grader = new Grade();
        assertEquals('C', grader.deterineLetterGrade(79));
    }

    @Test
    public void eightyNineShoudReturnB() {
        Grade grader = new Grade();
        assertEquals('B', grader.deterineLetterGrade(89));
    }

    @Test
    public void ninetyNineShoudReturnA() {
        Grade grader = new Grade();
        assertEquals('A', grader.deterineLetterGrade(99));
    }

    @Test
    public void eightyShoudReturnB() {
        Grade grader = new Grade();
        assertEquals('B', grader.deterineLetterGrade(80));
    }

    @Test
    public void ninetyShoudReturnA() {
        Grade grader = new Grade();
        assertEquals('A', grader.deterineLetterGrade(90));
    }

    @Test
    public void seventyShoudReturnC() {
        Grade grader = new Grade();
        assertEquals('C', grader.deterineLetterGrade(70));
    }

    @Test
    public void zeroShoudReturnF() {
        Grade grader = new Grade();
        assertEquals('F', grader.deterineLetterGrade(0));
    }

    @Test
    public void oneShoudReturnF() {
        Grade grader = new Grade();
        assertEquals('F', grader.deterineLetterGrade(1));
    }

    @Test
    public void negativeOneShoudReturnIllegalExeption() {
        Grade grader = new Grade();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.deterineLetterGrade(-1);
        });
    }
}