package adapter.objectadapter;

import adapter.classadapter.Adaptee;
import adapter.classadapter.Target;

/**
 * 适配器类 持有Adaptee对象来代替继承Adaptee类
 * 传入Adaptee对象 使得此类同样拥有Adaptee方法
 * 实现Target接口 使得此类同时也拥有Target方法
 * 适配完成
 *
 * @author illusoryCloud
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void Target() {
        System.out.println("这是目标方法");
    }

    public void Adaptee() {
        adaptee.Adaptee();
    }
}
