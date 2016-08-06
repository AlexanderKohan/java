package progKievUa.javaOOP.home.lesson4.fileSystem;

/**
 * Created by Alexander on 8/6/2016.
 */
public class SymLink extends AbstractFSItem {

    private FSItem item;

    public SymLink(String name, FSItem item) {
        super(name);
        this.item = item;
    }

    public SymLink(FSItem item) {
        this.item = item;
    }

    @Override
    public int getSize() {
        return 1;
    }

    @Override
    public String toString() {
        return "s->" + item;
    }
}
