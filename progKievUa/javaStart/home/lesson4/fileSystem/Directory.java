package progKievUa.javaOOP.home.lesson4.fileSystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 8/6/2016.
 */
public class Directory extends AbstractFSItem {

    private List<FSItem> items = new ArrayList<>();

    public Directory() {
    }

    public Directory(String name) {
        super(name);
    }

    public Directory add(FSItem item) {
        checkCyclicDependency(item);

        items.add(item);
        return this;
    }

    private void checkCyclicDependency(FSItem item) {
        if (isCreateCyclicDependency(item)) {
            throw new IllegalArgumentException("Cyclic dependency");
        }
    }

    private boolean isCreateCyclicDependency(FSItem item) {
        // TODO: реализовать проверку на зацыкливание
        return false;
    }

    @Override
    public int getSize() {
        int sizeSum = 0;

        for (FSItem item : items) {
            sizeSum += item.getSize();
        }

        return sizeSum;
    }

    @Override
    public String toString() {
        // TODO: релизовать красивый выовод файловых элементов в виде дерева
        return "d" + items + "";
    }
}