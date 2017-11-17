import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertFToKTest extends TemperatureConverterParamTest {
    @Parameterized.Parameters(name = "{index}: {0} degreesFahrenheit is {1} degreesKelvin  ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100,310.944},
                {200,366.5},
                {300,422.055},
                {400,477.611}
        });
    }

    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertFtoK(temperature);
    }
}
