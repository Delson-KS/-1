public class Point {
    private double x;
    private double y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double distanceTo(Point secondPoint){
        double d;
        d=Math.sqrt((secondPoint.x-this.x)*(secondPoint.x-this.x) +(secondPoint.y-this.y)*(secondPoint.y-this.y));
        return d;
    }
    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
