
package groupassignment1;

public class Sphere implements Shape {
    double radius;
    double volume;
    double surfaceArea;

    Sphere(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateVolume() {
        volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3);
        return volume;
    }
    @Override
    public double calculateSurfaceArea() {
        surfaceArea = 4*Math.PI*Math.pow(radius, 2);
        return surfaceArea;
    }

}
