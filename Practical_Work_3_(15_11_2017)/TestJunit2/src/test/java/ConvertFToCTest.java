import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertFToCTest extends TemperatureConverterParamTest {
    @Parameterized.Parameters(name = "{index}: {0} degreesFahrenheit is {1} degreesCelsius  ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100,37.777},
                {200,93.333},
                {300,148.888},
                {400,204.444}
        });
    }

    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertFtoC(temperature);
    }
}
