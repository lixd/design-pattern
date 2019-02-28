package template;

import org.junit.jupiter.api.Test;

/**
 * 模板方法模式 测试类
 *
 * @author illusoryCloud
 */
public class TemplateTest {
    @Test
    public void templateTest() {
        System.out.println("-------茶-------");
        CreatTea tea = new CreatTea();
        tea.doCreate();
        System.out.println("-------咖啡-------");
        CreatCoffee coffee = new CreatCoffee();
        coffee.doCreate();
        System.out.println("-------纯茶-------");
        CreatPureTea pureTea = new CreatPureTea();
        pureTea.doCreate();
    }
}
