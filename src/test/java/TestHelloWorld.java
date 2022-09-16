import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by LaunchCode
 */
public class TestHelloWorld {

    @Test
    public void testSayHello() {
        assertEquals("Hello, World!", HelloWorld.sayHello());
    }

}
