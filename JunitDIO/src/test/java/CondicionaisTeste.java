import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {
    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "wagner")
    //@DisabledIfEnvironmentVariable(named = "USER", matches = "wagner")
    //@EnabledOnOs(OS.LINUX)/
    //@EnabledOnOs({OS.LINUX, OS Mac})
    //@EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void validarAlgoSomenteDeWagner(){
        Assertions.assertEquals(10, 5 + 5);
    }
}
