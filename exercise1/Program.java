class Program
static double findMaxDistance(ImList<Point> pts) { // note the static modifier
double maxDistance = 0.0;
for (int i = 0; i < pts.size() - 1; i++) {
for (int j = i + 1; j < pts.size(); j++) {
double distance = pts.get(i).distanceTo(pts.get(j));
if (distance > maxDistance) {
maxDistance = distance;
}
}
}
return maxDistance;
}
public static void main(String[] args) { // first method to run
ImList<Point> pts = new ImList<Point>();
pts = pts.add(new Point(0.0, 0.0))
.add(new Point(1.0, 1.0))
.add(new Point(2.0, 2.0));
double maxDistance = findMaxDistance(pts);
System.out.println(maxDistance);
}
}	
