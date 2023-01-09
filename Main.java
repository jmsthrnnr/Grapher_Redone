
public class Main {
    public static void main(String[] args) {

        Graph graph01 = new Graph(-10, 10, -10, 10, 1);
        Point point01 = new Point(8, 5);
        
        graph01.createDisplay();

        graph01.graphPoint(point01);

        Point point02 = new Point(0, 10);
        // circle(graph01);
        graph01.graphPoint(point02);
        line(point01, point02, graph01);
        System.out.println(graph01.Display());
    }

    public static void circle(Graph graph1){
        int x;
        int y;
        int x2;
        int y2;
        for(double i = 0; i < (Math.PI * 2); i ++){
            x = (int) (Math.cos(i) * 10);
            y = (int) (Math.sin(i) * 10);
            System.out.println("from : " + x + ", " + y);
            x2 = (int) (Math.cos(i + 1) * 10);
            y2 = (int) (Math.sin(i + 1) * 10);
            System.out.println("to : " +  x2 + ", " + y2);
            line(new Point(x, y), new Point(x2, y2), graph1);
        }
    }

    public static void line(Point point1, Point point2, Graph graph1) {
        double ax;
        double ay;
        double bx;
        double by;

        if(point1.X() <= point2.X()){
            ax = point1.X();
            bx = point2.X();
            ay = point1.Y();
            by = point2.Y();

        }else{
            ax = point2.X();
            bx = point1.X();
            ay = point2.Y();
            by = point1.Y();
        }

        double xDisp = (bx - ax);
        double yDisp = (by - ay);

        if(xDisp == 0){
            for(int i = 0; i <= yDisp; i ++){
                graph1.graphPoint(new Point(ax, (ay + i)));
            }

        }else if(yDisp == 0){
            for(int i = 0; i <= xDisp; i ++){
                graph1.graphPoint(new Point((ax + i), ay));
            }

        }else{
            if(Math.abs(yDisp) == yDisp){
                if(xDisp >= Math.abs(yDisp)){
                    for(int i = 0; i < xDisp; i ++){
                        graph1.graphPoint(new Point((ax + i), ay));
                        ay += yDisp/xDisp;
                    }

                }else if(xDisp < Math.abs(yDisp)){
                    for(int i = 0; i < yDisp; i ++){
                        graph1.graphPoint(new Point(ax, (ay + i)));
                        ax += xDisp/yDisp;
                    }
                }
            }else if(Math.abs(yDisp) > yDisp){
                if(xDisp >= Math.abs(yDisp)){
                    for(int i = (int) (xDisp - 1); i >= 0; i --){
                        graph1.graphPoint(new Point((bx + i), ay));
                        ay -= yDisp/xDisp;
                    }

                }else if(xDisp < Math.abs(yDisp)){
                    for(int i = (int) (yDisp - 1); i >= 0; i --){
                        graph1.graphPoint(new Point(ax, (by - i)));
                        ax += xDisp/yDisp;
                    }
                }
            }
        } 
    }
}