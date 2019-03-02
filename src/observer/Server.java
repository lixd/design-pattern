package observer;

/**
 * 具体被观察者角色
 *
 * @author illusoryCloud
 */
public class Server extends Observable {

    /**
     * 被观察者name 用于区分多个被观察者
     */
    private String name;

    public Server(String name) {
        this.name = name;
    }

    @Override
    public void notifyObservers(Message message) {
        //发送消息
        super.notifyObservers(message);
        //发送后取消change标志
        clearChanged();
    }
    public String getName(){
        return this.name;
    }
}
