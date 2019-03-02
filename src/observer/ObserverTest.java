package observer;

import org.junit.jupiter.api.Test;

/**
 * 观察者模式 测试类
 *
 * @author illusoryCloud
 */
public class ObserverTest {
    @Test
    void observerTest() {
        //发送的消息对象
        Message message = null;
        //1个被观察者
        Server s1 = new Server("幻境");
        Server s2 = new Server("云图");
        //4个观察者
        Client c1 = new Client("大佬", 1);
        Client c2 = new Client("萌新", 2);
        Client c3 = new Client("菜鸟", 3);
        Client c4 = new Client("咸鱼", 4);
        //将4个观察者分别注册到两个被观察者上
        s1.addObserver(c1);
        s1.addObserver(c2);
        s2.addObserver(c3);
        s2.addObserver(c4);
        message = Message.newBuilder().setTitle("欢迎")
                .setContent("欢迎关注 <幻境云图>")
                .build();
        //消息变化后 将被观察者设置为已变化状态
        s1.setChanged();
        s2.setChanged();
        //发送消息
        s1.notifyObservers(message);
        s2.notifyObservers(message);
        //再次发送消息无效 因为change=false
        s1.notifyObservers(message);
        s2.notifyObservers(message);
    }
}
