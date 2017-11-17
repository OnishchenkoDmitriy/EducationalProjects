import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertKtoFTest extends TemperatureConverterParamTest {
    @Parameterized.Parameters(name = "{index}: {0} degreesKelvin is {1} degreesFahrenheit ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100,-279.7},
                {200,-99.7},
                {300,80.3},
                {400,260.3}
        });
    }

    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertKtoF(temperature);
    }
}
