class Point {
    private final double x;
    private final double y;
    
    // new Point(0.0, 0.0)
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "point " + String.format("(%.3f, %.3f)", x, y);
    }
    
    // p.distanceTo(q)
    public double distanceTo(Point p) {
        double dx = this.x - p.x; 
        double dy = this.y - p.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point midPoint(Point p) {
        double midX = (this.x + p.x) / 2.0;
        double midY = (this.y + p.y) / 2.0;
        return new Point(midX, midY);
    }
   
    public double angleTo(Point p) {
        return Math.atan2(p.y - this.y, p.x - this.x);
    }

    public Point moveTo(double angle, double distance) {
        double newX = this.x + distance * Math.cos(angle);
        double newY = this.y + distance * Math.sin(angle);
        return new Point(newX, newY);
    }
}
