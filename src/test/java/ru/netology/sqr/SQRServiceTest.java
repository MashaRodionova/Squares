package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = {"/testdata.csv"})
    public void sqrInsideTheRange(int first, int last, int expected) {
        SQRService service = new SQRService();
        long actual = service.calculate(first, last);
        assertEquals(expected, actual);
    }
}
