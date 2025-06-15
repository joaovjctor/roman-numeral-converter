import org.example.RomanNumeralConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RomanNumeralConverterTest {

    RomanNumeralConverter converter = new RomanNumeralConverter();

    @Test
    public void testConvertOne() {
        assertEquals("I", converter.convert(1));
    }

    @Test
    public void testConvertFour() {
        assertEquals("IV", converter.convert(4));
    }

    @Test
    public void testConvertNine() {
        assertEquals("IX", converter.convert(9));
    }

    @Test
    public void testConvertFifty() {
        assertEquals("L", converter.convert(50));
    }

    @Test
    public void testConvertNinetyFour() {
        assertEquals("XCIV", converter.convert(94));
    }

    @Test
    public void testConvertFourHundredFortyFour() {
        assertEquals("CDXLIV", converter.convert(444));
    }

    @Test
    public void testConvertMaxValue() {
        assertEquals("MMMCMXCIX", converter.convert(3999));
    }

    @Test
    public void testConvertZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(0));
    }

    @Test
    public void testConvertNegativeThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(-5));
    }

    @Test
    public void testConvertAbove3999ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert(4000));
    }
}