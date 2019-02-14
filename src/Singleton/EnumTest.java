package Singleton;

import org.junit.jupiter.api.Test;

public class EnumTest {
    @Test
    public  void testEnum() {
        FiveSingleton instance = FiveSingleton.INSTANCE;
        instance.doSomeThing(instance);
    }

}
