package proxy.cglibproxy;

import proxy.staticproxy.Human;

/**
 * @author illusoryCloud
 */
public class Dancer implements Human {
    @Override
    public void work() {
        System.out.println("跳舞者翩翩起舞~");
    }
}
