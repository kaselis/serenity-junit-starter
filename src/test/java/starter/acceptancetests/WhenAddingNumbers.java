package starter.acceptancetests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenAddingNumbers {

    @Steps
    MathWizSteps michael;

    @Test
    @ExtendWith(MyCustomCondition.class)
//    @DisabledForJreRange(max = JRE.JAVA_21)
//    @DisabledOnOs({OS.MAC, OS.LINUX})
    public void addingSums() {
        // Given
        michael.startsWith(1);

        // When
        michael.adds(2);

        // Then
        michael.shouldHave(3);
    }
}
