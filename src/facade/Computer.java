package facade;

/**
 * 外观角色
 * 电脑
 * 用户通过操作当前类即可达到操作所有子系统的目的
 *
 * @author illusoryCloud
 */
public class Computer {
    private CPU cpu;
    private Disk disk;
    private Memory memory;

    public Computer() {
        cpu = new CPU();
        disk = new Disk();
        memory = new Memory();
    }

    public void startUp() {
        cpu.startUp();
        disk.startUp();
        memory.startUp();
    }

    public void shutDown() {
        cpu.shutDown();
        disk.shutDown();
        memory.shutDown();
    }
}
