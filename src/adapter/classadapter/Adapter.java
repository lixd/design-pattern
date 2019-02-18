package adapter.classadapter;

/**
 * 适配器类
 * 继承Adaptee类 使得此类保留了Adaptee方法
 * 实现Target接口 使得此类同时也拥有Target方法
 * 适配完成
 *
 * @author illusoryCloud
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void Target() {
        System.out.println("这是目标方法");
    }
}
