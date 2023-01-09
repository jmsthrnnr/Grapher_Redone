
public class Main {
    public static void main(String[] args) {

        Graph graph01 = new Graph(-10, 10, -10, 10, 1);
        Point point01 = new Point(0, 0);
        
        graph01.createDisplay();
        // System.out.println(graph01.getDisplay());
        System.out.println("width is "  + graph01.getWidth());
        System.out.println("height is " + graph01.getHeight());
        
        graph01.graphPoint(point01);
        // System.out.println(graph01.getDisplay());
        // int x;
        // int y;
        // for(double a = 0; a < (Math.PI * 2); a += 0.05) {
        //     x = (int) (Math.cos(a) * 10);
        //     y = (int) (Math.sin(a) * 10);
        //     graph01.graphPoint(new Point(x, y));
        // }
        Point point02 = new Point(10, 7);
        graph01.graphPoint(point02);
        line(point01, point02, graph01);
        System.out.println(graph01.getDisplay());
    }

    public static void line(Point point1, Point point2, Graph graph1) {
        double ax;
        double ay;
        double bx;
        double by;
        if(point1.getX() <= point2.getX()){
            ax = point1.getX();
            bx = point2.getX();
        }else{
            ax = point2.getX();
            bx = point1.getX();
        }

        if(point1.getY() <= point2.getY()){
            ay = point1.getY();
            by = point2.getY();
        }else{
            ay = point2.getY();
            by = point1.getY();
        }

        int xDisp = (int) ((bx - ax));
        int yDisp = (int) ((by - ay));

        if(xDisp == 0){
            for(double i = 0; i <= yDisp; i ++){
                graph1.graphPoint(new Point(ax, (ay + i)));
                // System.out.println("Add point: (" + ax + ", " + i + ")");
            }

        }else if(yDisp == 0){
            for(double i = 0; i <= xDisp; i ++){
                graph1.graphPoint(new Point((ax + i), ay));
                // System.out.println("Add point: (" + i + ", " + ay + ")");
            }

        }else if(xDisp == yDisp){
            for(double i = 0; i <= xDisp; i ++){
                graph1.graphPoint(new Point((ax + i), (ay + i)));
                // System.out.println("Add point: (" + i + ", " + i + ")");
            }

        }else{
            int mx = (int) ((xDisp * 0.5));
            int my = (int) ((yDisp * 0.5));
            Point pointM = new Point(mx, my);
            // System.out.println("From: (" + ax + ", " + ay + ") to; (" + bx + ", " + by + ")");
            line(point1, pointM, graph1);
            // System.out.println("From: (" + ax + ", " + ay + ") to; (" + bx + ", " + by + ")");
            line(pointM, point2, graph1);
        }
        System.out.println("From: (" + ax + ", " + ay + ") to (" + bx + ", " + by + ")");
    }
}