package epamMethodsProgramming.part2.chapter9_IOStreams.code.archiving;

import java.io.FileNotFoundException;

/**
 * Created by Alexander on 9/6/2016.
 */
public class PackDemo {
    public static void main(String[] args) {
        String dirName = "путь_к_директории";
        PackJar pj = new PackJar("example.jar");
        try {
            pj.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
