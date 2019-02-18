package prototype;

import org.junit.jupiter.api.Test;

import java.util.Date;

/**
 * 原型模式测试类
 *
 * @author illusoryCloud
 */
public class PrototypeTest {
    @Test
    public void prototypeTest() {
        User zhangsan = new User("张三", 22);
        User lisi = new User("李四", 23);
        Message message = new Message();
        message.setTitle("hello");
        message.setContent("how are you~");
        message.setFrom(zhangsan);
        message.setTo(lisi);
        message.setTime(new Date());
        Message cloneOne = null;
        Message cloneTwo = null;
        try {
            cloneOne = (Message) message.clone();
            cloneTwo = message.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //false  克隆实现的是一个(和原对象相似的)新对象
        System.out.println(message == cloneOne);
        //false
        System.out.println(message == cloneTwo);
        //true 浅克隆 引用对象指向的还是原对象
        System.out.println(message.getFrom()==cloneOne.getFrom());
        //false 深克隆 引用对象也重新创建
        System.out.println(message.getFrom()==cloneTwo.getFrom());

    }

}
