class Circle {
    private final Point centre;
    private final double radius;
    
    Circle(Point centre, double radius) {
        this.centre = centre;
        this.radius = radius;
    }
    
    public String toString() {
        return "circle of radius " + this.radius + " centred at " + this.centre;
    }
    
    public boolean contains(Point p) {
        return this.centre.distanceTo(p) <= this.radius;
    }

    public boolean containsPoint(Point p, double epsilon) {
        return this.centre.distanceTo(p) <= this.radius + epsilon;
    }
}
