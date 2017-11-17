import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertKToCTest extends TemperatureConverterParamTest {
    @Parameterized.Parameters(name = "{index}: {0} degreesKelvin is {1} degreesCelsius ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {373.2,100},
                {473.2,200},
                {573.2,300},
                {673.2,400}
        });
    }
    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertKtoC(temperature);
    }
}
