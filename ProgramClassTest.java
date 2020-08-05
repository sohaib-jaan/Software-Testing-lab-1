import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramClassTest {

    ProgramClass obj;
    public ProgramClassTest() {
        obj = new ProgramClass();
    }

    @Test
    void primenumbertestcase()
    {
        int inputValue = 6;
        boolean expectedResult = false;
        boolean actualResult = this.obj.primenumber(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void evenoddtestcase()
    {
        int inputValue = 3;
        boolean expectedResult = false;
        boolean actualResult = this.obj.evenodd(inputValue);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void arrayaveragetestcase()
    {
        int[] inputArray = {7, 5, 6};
        int expectedResult = 6;
        int actualResult = this.obj.arrayaverage(inputArray);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void celsiusfahrenheitkelvintestcase()
    {
        double celsiusDegree = 15.0;
        double[] expectedValue = {59.0, 288.15};
        double[] actualValue = this.obj.celsiusfahrenheitkelvin(celsiusDegree);
        assertArrayEquals(expectedValue, actualValue);
    }

    @Test
    void stringpalindrometestcase()
    {
        String inputValue = "student";
        boolean expectedValue = false;
        boolean actualValue = this.obj.stringpalindrome(inputValue);
        assertEquals(expectedValue, actualValue);
    }
}