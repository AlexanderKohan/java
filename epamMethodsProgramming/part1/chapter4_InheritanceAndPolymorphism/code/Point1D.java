package epamMethodsProgramming.part1.chapter4_InheritanceAndPolymorphism.code;

/**
 * Created by Alexander on 9/1/2016.
 */
public class Point1D {
    private int x;

    public Point1D(int x) {
        this.x = x;
    }
}

class Point2D extends Point1D {
    private int y;

    public Point2D(int x, int y) {
        super(x);
        this.y = y;
    }
}

class Point3D extends Point2D {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(-1, -1, -1); // вызов конструктора Point3D с параметрами
    }
}
