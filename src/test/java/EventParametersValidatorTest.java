import exceptions.FilePathParameterMissingException;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EventParametersValidatorTest {

    @Test
    public void shouldUseThreadPoolSizePassedAsParameter() {
        String[] vars = {"file", "2"};
        EventParametersValidator eventParametersValidator = new EventParametersValidator(vars);
        assertEquals(new Integer(2), eventParametersValidator.getEventParameters().getNumberOfThreads());
    }

    @Test
    public void shouldUseDefaultThreadPoolSizeIfTheNumberOfThreadsParameterIsNotPassed() {
        String[] vars = {"file"};
        EventParametersValidator eventParametersValidator = new EventParametersValidator(vars);
        assertEquals(
                EventParametersValidator.DEFAULT_THREAD_POOL_SIZE,
                eventParametersValidator.getEventParameters().getNumberOfThreads()
        );
    }

    @Test
    public void shouldUseDefaultThreadPoolSizeIfTheNumberOfThreadsHasWrongFormat() {
        String[] vars = {"file", "I am not a number"};
        EventParametersValidator eventParametersValidator = new EventParametersValidator(vars);
        assertEquals(
                EventParametersValidator.DEFAULT_THREAD_POOL_SIZE,
                eventParametersValidator.getEventParameters().getNumberOfThreads()
        );
    }

    @Test(expected = FilePathParameterMissingException.class)
    public void shouldThrowAnFilePathMissingExceptionWhenThereIsNotAnyParameter() {
        String[] vars = {};
        EventParametersValidator eventParametersValidator = new EventParametersValidator(vars);
        eventParametersValidator.getEventParameters();
    }
}
