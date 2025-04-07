
package groupassignment1;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Sphere sphere = new Sphere(5);
        System.out.printf("Sphere Volume: %.4f", sphere.calculateVolume());
        System.out.printf("\nSphere Surface Area: %.4f", sphere.calculateSurfaceArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.printf("\nCylinder Volume: %.4f", cylinder.calculateVolume());
        System.out.printf("\nCylinder Surface Area: %.4f", cylinder.calculateSurfaceArea());

        Cone cone = new Cone(5, 10);
        System.out.printf("\nCone Volume: %.4f", cone.calculateVolume());
        System.out.printf("\nCone Surface Area: %.4f", cone.calculateSurfaceArea());

    }


}
