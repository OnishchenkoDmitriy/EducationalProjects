import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TemperatureConverterParamTest {

    public TemperatureConverter temperatureConverter;
    public double delta = 0.1;

    @Parameterized.Parameter
    public double temperatureInCelsius;
    @Parameterized.Parameter(1)
    public double temperatureInFahrenheit;
    @Parameterized.Parameter(2)
    public double temperatureInKelvin;

    @Parameterized.Parameters(name = "{index}: {0}-degreesCelsius;{1}-degreesFahrenheit;{2}-degreesKelvin ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100, 212, 373.2},
                {200, 392, 473.2},
                {300, 572, 573.2},
                {400, 752, 673.2}
        });
    }

    @Before
    public void createTempConverter(){
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void convertCtoFTest(){
        assertEquals(temperatureConverter.convertCtoF(temperatureInCelsius), temperatureInFahrenheit, delta);
    }

    @Test
    public void convertCtoKTest(){
        assertEquals(temperatureConverter.convertCtoK(temperatureInCelsius), temperatureInKelvin, delta);
    }

    @Test
    public void convertFtoCTest(){
        assertEquals(temperatureConverter.convertFtoC(temperatureInFahrenheit), temperatureInCelsius, delta);
    }

    @Test
    public void convertFtoKTest(){
        assertEquals(temperatureConverter.convertFtoK(temperatureInFahrenheit), temperatureInKelvin, delta);
    }

    @Test
    public void convertKtoFTest(){
        assertEquals(temperatureConverter.convertKtoF(temperatureInKelvin), temperatureInFahrenheit , delta);
    }

    @Test
    public void convertKtoCTest(){
        assertEquals(temperatureConverter.convertKtoC(temperatureInKelvin),temperatureInCelsius, delta);
    }

}


