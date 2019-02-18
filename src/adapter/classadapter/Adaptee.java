package adapter.classadapter;

/**
 * 被适配类
 * 只有Adaptee方法 但是目标接口要Target方法
 *
 * @author illusoryCloud
 */
public class Adaptee {
    public void Adaptee() {
        System.out.println("这是现有的方法");
    }
}
