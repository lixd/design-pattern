package observer;

/**
 * 抽象观察者角色
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 *
 * @author illusoryCloud
 */
public interface Observer {
    /**
     * 更新消息 由被观察者调用
     *
     * @param o       被观察者 即消息来源
     * @param message 收到的消息
     */
    void update(Observable o, Message message);
}
