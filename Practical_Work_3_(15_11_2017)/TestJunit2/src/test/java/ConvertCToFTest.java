import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

public class ConvertCToFTest extends TemperatureConverterParamTest {

    @Parameterized.Parameters(name = "{index}: {0} degreesCelsius is {1} degreesFahrenheit ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {100,212},
                {200,392},
                {300,572},
                {400,752}
        });
    }

    @Override
    public void setActualTemperature() {
        actualTemperature = temperatureConverter.convertCtoF(temperature);
    }

}
