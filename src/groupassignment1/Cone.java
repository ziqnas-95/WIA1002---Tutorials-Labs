
package groupassignment1;

public class Cone implements Shape {
    double radius;
    double height;
    double volume;
    double surfaceArea;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    @Override
    public double calculateSurfaceArea() {
        surfaceArea = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
        return surfaceArea;
    }
}


