package epamMethodsProgramming.part2.chapter9_IOStreams.code.archiving;

/**
 * Created by Alexander on 9/6/2016.
 */
public class UnpackDemo {
    public static void main(String[] args) {
// расположение и имя архива
        String nameJar = "example.jar";
// куда файлы будут распакованы
        String destinationPath = "c:\\temp\\";
        new UnPackJar().unpack(destinationPath, nameJar);
    }
}
