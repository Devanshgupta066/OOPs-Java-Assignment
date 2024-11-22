import java.util.Scanner;

abstract class Obj3D {
    public abstract double surface();
    public abstract double vol();
}

class Box extends Obj3D {
    private double l, w, h;
    public Box(double l, double w, double h) { this.l = l; this.w = w; this.h = h; }
    @Override public double surface() { return 2 * (l * w + w * h + h * l); }
    @Override public double vol() { return l * w * h; }
}

class Cube extends Obj3D {
    private double s;
    public Cube(double s) { this.s = s; }
    @Override public double surface() { return 6 * s * s; }
    @Override public double vol() { return s * s * s; }
}

class Cyl extends Obj3D {
    private double r, h;
    public Cyl(double r, double h) { this.r = r; this.h = h; }
    @Override public double surface() { return 2 * Math.PI * r * (r + h); }
    @Override public double vol() { return Math.PI * r * r * h; }
}

class Cone extends Obj3D {
    private double r, h;
    public Cone(double r, double h) { this.r = r; this.h = h; }
    @Override public double surface() { return Math.PI * r * (r + Math.sqrt(r * r + h * h)); }
    @Override public double vol() { return (Math.PI * r * r * h) / 3; }
}

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter l, w, h of Box: ");
        Box b = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        show("Box", b);

        System.out.print("Enter side of Cube: ");
        Cube c = new Cube(sc.nextDouble());
        show("Cube", c);

        System.out.print("Enter r, h of Cylinder: ");
        Cyl cyl = new Cyl(sc.nextDouble(), sc.nextDouble());
        show("Cylinder", cyl);

        System.out.print("Enter r, h of Cone: ");
        Cone cone = new Cone(sc.nextDouble(), sc.nextDouble());
        show("Cone", cone);

        sc.close();
    }

    private static void show(String name, Obj3D obj) {
        System.out.println(name + " Surface: " + obj.surface());
        System.out.println(name + " Volume: " + obj.vol());
    }
}
