import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertCToKTest extends TemperatureConverterParamTest {
    @Parameterized.Parameters(name = "{index}: {0} degreesCelsius is {1} degreesKelvin  ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100,373.2},
                {200,473.2},
                {300,573.2},
                {400,673.2}
        });
    }

    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertCtoK(temperature);
    }
}
