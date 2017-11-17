import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemperatureConverter {

    TemperatureConverter temperatureConverter;

    @Before
    public void createTempConverter(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void testConvertFtoC(){
        assertEquals(37.777, temperatureConverter.convertFtoC(100), 0.001);
    }

    @Test
    public void testConvertCtoF(){
        assertEquals(212, temperatureConverter.convertCtoF(100), 0.001);
    }

    @Test
    public void testConvertCtoK(){
        assertEquals(373.2, temperatureConverter.convertCtoK(100), 0.001);
    }

    @Test
    public void testConvertKtoC(){
        assertEquals(-173.2, temperatureConverter.convertKtoC(100), 0.001);
    }

    @Test
    public void testConvertFtoK(){
        assertEquals(310.944, temperatureConverter.convertFtoK(100), 0.001);
    }

    @Test
    public void testConvertKtoF(){
        assertEquals(-279.7, temperatureConverter.convertKtoF(100), 0.001);
    }

    @After
    public void deleteTempConverter(){
        temperatureConverter = null;
    }

}
