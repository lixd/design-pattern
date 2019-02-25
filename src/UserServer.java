import java.util.concurrent.locks.ReentrantLock;

/**
 * Server层
 * 模拟ReentrantLock使用
 *
 * @author illusoryCloud
 */
public class UserServer {
    /**
     * 默认是非公平锁 传入参数true则创建的是公平锁
     */
    private static ReentrantLock reentrantLock = new ReentrantLock(true);

    public void updateUser() {
        //加锁 同一时刻只能有一个线程更新User
        reentrantLock.lock();
        try {

            //do something
        } finally {
            //释放锁放在finally代码块中 保证出现异常等情况也能释放锁
            reentrantLock.unlock();
        }
    }
}
