// https://devcolibri.com/unit-%D1%82%D0%B5%D1%81%D1%82%D0%B8%D1%80%D0%BE%D0%B2%D0%B0%D0%BD%D0%B8%D0%B5-%D1%81-junit/

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculateTest {
    @Test
    public void testCalA() throws Exception {
        Calculate calculate = new Calculate();
        int n = calculate.calA(3, 2);

        assertEquals(5, n);
    }
}