package observer;

import java.util.Vector;

/**
 * 抽象被观察者接口
 * 声明了添加、删除、通知观察者方法
 *
 * @author illusoryCloud
 */
public class Observable {
    /**
     * 被观察者是否有变化
     * 在通知观察者时做判断 若没有发生变化则不通知
     */
    private boolean changed = false;
    /**
     * Vector集合 线程安全的
     * 用于存放已注册的观察者
     */
    private Vector<Observer> obs;

    public Observable() {
        obs = new Vector<>();
    }

    /**
     * 注册观察者
     *
     * @param o 需要注册的观察者
     */
    public synchronized void addObserver(Observer o) {
        if (o == null) {
            throw new NullPointerException();
        }
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * 移除观察者
     *
     * @param o 被移除的观察者
     */
    public synchronized void deleteObserver(java.util.Observer o) {
        obs.removeElement(o);
    }

    /**
     * 发通知
     */
    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 循环遍历 通知注册的所有的观察者
     *
     * @param message 发送的消息
     */
    public void notifyObservers(Message message) {
        Object[] arrLocal;

        synchronized (this) {
            //判断若没有变化则直接返回
            if (!changed) {
                return;
            }
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length - 1; i >= 0; i--) {
            ((Observer) arrLocal[i]).update(this, message);
        }
    }

    /**
     * 移除所有观察者
     */
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    /**
     * set clear has 设置 清除 获取
     * 观察者状态是否变化 true/false
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    protected synchronized void clearChanged() {
        changed = false;
    }

    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * 已注册观察者的个数
     *
     * @return count
     */
    public synchronized int countObservers() {
        return obs.size();
    }

}
