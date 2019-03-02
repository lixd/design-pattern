package observer;

/**
 * 具体观察者角色
 * 实现update方法
 *
 * @author illusoryCloud
 */
public class Client implements Observer {
    private String clientName;
    private int id;

    public Client(String clientName, int id) {
        this.clientName = clientName;
        this.id = id;
    }


    @Override
    public void update(Observable o, Message message) {
        System.out.println(id + "号" + clientName + "收到<" + ((Server)o).getName() + ">推送的消息：" + message.toString());
    }
}
