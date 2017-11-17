import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public abstract class TemperatureConverterParamTest {

    public TemperatureConverter temperatureConverter;
    public double actualTemperature;
    public double delta = 0.001;

    @Parameterized.Parameter
    public double temperature;
    @Parameterized.Parameter(1)
    public double expectedTemperature;

    @Before
    public void createTempConverter(){
        temperatureConverter = new TemperatureConverter();
    }

    public abstract void setActualTemperature();

    @Test
    public void doTest(){
        setActualTemperature();
        assertEquals(expectedTemperature, actualTemperature, delta);
    }
}


