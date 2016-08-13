package java.progKievUa.javaOOP.home.lesson4.fileSystem;

/**
 * Created by Alexander on 8/6/2016.
 */
public abstract class AbstractFSItem implements FSItem {

    private String name;

    public AbstractFSItem() {
    }

    public AbstractFSItem(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}