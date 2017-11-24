import org.courses.view.ResourceManager;
import org.courses.view.TextConstants;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;

@RunWith(Parameterized.class)
public class RegexTest{

    @Parameterized.Parameter
    public String language;
    @Parameterized.Parameter(1)
    public String name;
    @Parameterized.Parameter(2)
    public String surname;
    @Parameterized.Parameter(3)
    public String telephone;
    @Parameterized.Parameter(4)
    public String birthDate;

    public String RESOURCE_BUNDLE_NAME;
    public ResourceManager resourceManager;

    @Parameterized.Parameters(name = "{index}: check {0} - locale")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"en", "Dmitriy", "Onishchenko", "+380964385593","14-08-1993"},
                {"ru", "Дмитрий", "Онищенко", "+380964385593", "14-08-1993"},
                {"uk", "Дмитро", "Оніщен’ко", "+380964385593", "14-08-1993"},
        });
    }

    @Before
    public void init(){
        RESOURCE_BUNDLE_NAME = "messages";
        resourceManager = ResourceManager.INSTANCE;
        resourceManager.changeResource(language);
    }

    @Test
    public void regexNameTest(){
        assertTrue(name.matches(resourceManager.getString(TextConstants.RegexContainer.REGEX_NAME)));
    }

    @Test
    public void regexSurnameTest(){
        assertTrue(surname.matches(resourceManager.getString(TextConstants.RegexContainer.REGEX_SURNAME)));
    }

    @Test
    public void regexTelephoneTest(){
        assertTrue(telephone.matches(resourceManager.getString(TextConstants.RegexContainer.REGEX_TELEPHONE)));
    }

    @Test
    public void regexBithDateTest(){
        assertTrue(birthDate.matches(resourceManager.getString(TextConstants.RegexContainer.REGEX_BIRTH_DATE)));
    }
}


