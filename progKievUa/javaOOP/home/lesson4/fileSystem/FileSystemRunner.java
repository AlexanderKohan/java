package progKievUa.javaOOP.home.lesson4.fileSystem;

/**
 * Created by Alexander on 8/6/2016.
 */
public class FileSystemRunner {
    public static void main(String[] args) {
        Directory root = new Directory()
                .add(new Directory()
                        .add(new File(10))
                        .add(new File(20))
                )
                .add(new Directory()
                        .add(new Directory()
                                .add(new File(30))
                        )
                )
                .add(new File(50))
                .add(new SymLink(new File(10)));

        System.out.println(root);
        System.out.println("size = " + root.getSize());
    }
}
