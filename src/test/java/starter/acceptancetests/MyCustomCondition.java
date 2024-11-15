package starter.acceptancetests;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

public class MyCustomCondition implements ExecutionCondition {

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
        // have some logic here to determine if the test should be enabled or disabled
        return ConditionEvaluationResult.disabled("Disabled");
    }
}
