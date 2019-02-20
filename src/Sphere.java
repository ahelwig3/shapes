public class Sphere extends Shape {
    // Set radius to zero
    private float radius = 0;

    // Create super constructor
    public Sphere(float radius) {
        super();
        this.radius = radius;

    }

    // make and set variables to public
    public float getRadius() {
        return radius;
    }


    public void setRadius(float radius) {
        this.radius = radius;
    }

    // Creates a formula for surface area of a sphere.
    @Override
    public float surfaceArea() {
        float surface = (float) (4 * Math.PI * (radius * radius));
        return surface;
    }

    // Creates a formula for volume of a sphere.
    @Override
    public float volume() {
        float volume = (float) (4/3 * Math.PI * (radius * radius * radius));
        return volume;
    }

    // Print outcome of surface area and volume of a sphere.
    @Override
    public void render() {
        System.out.println("The surface area of your sphere is:" + surfaceArea());
        System.out.println("The volume of your sphere is:" + volume());
        System.out.println("");

    }

}
