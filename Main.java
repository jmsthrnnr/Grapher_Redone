
public class Main {
    public static void main(String[] args) {

        Graph graph01 = new Graph(-10, 10, -10, 10, 1);
        
        graph01.createDisplay();
        // Point a01 = new Point(8, 0);
        // Point a02 = new Point(7, 4);
        // Point a03 = new Point(4, 7);
        // Point a04 = new Point(1, 8);
        // Point a05 = new Point(-3, 7);
        // Point a06 = new Point(-6, 5);
        // Point a07 = new Point(-8, 1);
        // Point a08 = new Point(-7, -3);
        // Point a09 = new Point(-5, -6);
        // Point a10 = new Point(-2, -8);
        // Point a11 = new Point(2, -8);
        // Point a12 = new Point(6, -6);
        // Point a13 = new Point(8, -2);
        // line(a01, a02, graph01);
        // line(a02, a03, graph01);
        // line(a03, a04, graph01); // didn't graph
        // line(a04, a05, graph01); // didn't graph
        // line(a05, a06, graph01); // didn't graph all the way
        // line(a06, a07, graph01); // didn't graph all the way
        // line(a07, a08, graph01); // didn't graph
        // line(a08, a09, graph01); // didn't graph all the way
        // line(a09, a10, graph01); 
        // line(a10, a11, graph01);
        // line(a11, a12, graph01);
        // line(a12, a13, graph01);
        // line(a13, a01, graph01);
        circle(graph01);
        System.out.println(graph01.Display());
    }

    public static void circle(Graph graph1){
        double x;
        double y;
        // double x2;
        // double y2;
        double step = 0.2;
        for(double i = 0; i <= (Math.PI * 2); i += step){
            x = Math.cos(i) * 8;
            y = Math.sin(i) * 8;
            // System.out.println("from : " + (int) x + ", " + (int) y);
            // x2 = Math.cos(i + step) * 8;
            // y2 = Math.sin(i + step) * 8;
            // System.out.println("to : " +  (int) x2 + ", " + (int) y2);
            // line(new Point(x, y), new Point(x2, y2), graph1);
            graph1.graphPoint(new Point(x, y));
        }
    }

    public static void line(Point point1, Point point2, Graph graph1) {
        // Point a07 = new Point(-8, 1);
        // Point a08 = new Point(-7, -3);

        double ax = point1.X();
        double bx = point2.X();
        double ay = point1.Y();
        double by = point2.Y();
        //     1        -7 - -8
        double xDisp = Math.abs(bx - ax);
        //     -4       -3 - 1
        double yDisp = Math.abs(by - ay);
        /*
        if(xDisp == 0){
            for(int i = 0; i <= yDisp; i ++) {
                graph1.graphPoint(new Point(ax, (ay + i)));
            }

        }else if(yDisp == 0){
            for(int i = 0; i <= xDisp; i ++) {
                graph1.graphPoint(new Point((ax + i), ay));
            }

        }else{
            
            if(Math.abs(yDisp) == yDisp) {

                if(xDisp >= yDisp) {

                    for(int i = 0; i < xDisp; i ++) {
                        graph1.graphPoint(new Point((ax + i), ay));
                        ay += yDisp/xDisp;
                    }

                }else if(xDisp < Math.abs(yDisp)) {

                    for(int i = 0; i < yDisp; i ++) {
                        graph1.graphPoint(new Point(ax, (ay + i)));
                        ax += xDisp/yDisp;

                    }
                }

            }else {

                if(xDisp >= Math.abs(yDisp)) {
                    for(int i = (int) (xDisp); i >= 0; i --) {
                        graph1.graphPoint(new Point((bx - i), ay));
                        // System.out.println("ay: " + ay);
                        ay += yDisp/xDisp;
                    }   

                }else if(xDisp < Math.abs(yDisp)){
                    for(int i = (int) Math.abs(yDisp); i >= 0; i --){
                        graph1.graphPoint(new Point(ax, (by + i)));
                        // System.out.println("ax: " + ax);
                        ax -= xDisp/yDisp;
                    }
                }
            }
        } 
        */
        if(xDisp == 0) {
            if(ay < by) {
                for(int i = 0; i <= Math.abs(yDisp); i ++) {
                    graph1.graphPoint(new Point(ax, (ay + i)));
                }
            }else {
                for(int i = 0; i <= Math.abs(yDisp); i ++) {
                    graph1.graphPoint(new Point(ax, (ay - i)));
                }
            }
        }else if(yDisp == 0) {
            if(ax < bx) {
                for(int i = 0; i <= Math.abs(xDisp); i ++) {
                    graph1.graphPoint(new Point((ax + i), ay));
                }
            }else {
                for(int i = 0; i <= Math.abs(xDisp); i ++) {
                    graph1.graphPoint(new Point((ax - i), ay));
                }
            }
        } else {
            //     4                  -4      1 
            double riseRun = Math.abs(yDisp / xDisp);
            //     0.25               1       -4
            double runRise = Math.abs(xDisp / yDisp);
            
            // Point a07 = new Point(-8, 1);
            // Point a08 = new Point(-7, -3);
            if(ax < bx){
                // System.out.println("146");
                if(ay < by){
                    // System.out.println("148");
                    if(xDisp > yDisp){
                        // System.out.println("150");
                        for(int i = 0; i <= Math.abs(xDisp); i ++) {
                            graph1.graphPoint(new Point((ax + i), (ay + (riseRun * i))));
                        }
                    }else if(xDisp < yDisp){
                        // System.out.println("155");
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax + (runRise * i)), (ay + i)));
                        }
                    }else {
                        // System.out.println("160");
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax + i), (ay + i)));
                        }
                    }
                }else {
                    // System.out.println("166");
                    if(xDisp > yDisp){
                        // System.out.println("168");
                        for(int i = 0; i <= Math.abs(xDisp); i ++) {
                            graph1.graphPoint(new Point((ax + i), (ay - (riseRun * i))));
                        }
                    }else if(xDisp < yDisp){
                        //                  4        -4
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            //                           -8    0.25    * i     1 - i
                            graph1.graphPoint(new Point((ax + (runRise * i)), (ay - i)));
                        }

                        // 0: (-8, 1)
                        // 1: (-8 + 0.25, 0)
                        // 2: (-8 + 0.5, -1)
                        // 3: (-8 + 0.75, -2)
                        // 4: (-8 + 1.0, -3)
                    }else { // xDisp == yDisp
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax + i), (ay - i)));
                        }
                    }
                }
            }else{
                if(ay < by){
                    if(xDisp > yDisp){
                        for(int i = 0; i <= Math.abs(xDisp); i ++) {
                            graph1.graphPoint(new Point((ax - i), (ay + (riseRun * i))));
                        }
                    }else if(xDisp < yDisp){
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax - (runRise * i)), (ay + i)));
                        }

                    }else { // xDisp == yDisp
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax - i), (ay + i)));
                        }
                    }
                }else {
                    if(xDisp > yDisp){
                        for(int i = 0; i <= Math.abs(xDisp); i ++) {
                            graph1.graphPoint(new Point((ax - i), (ay - (riseRun * i))));
                        }
                    }else if(xDisp < yDisp){
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax - (runRise * i)), (ay - i)));
                        }
                    }else { // xDisp == yDisp
                        for(int i = 0; i <= Math.abs(yDisp); i ++) {
                            graph1.graphPoint(new Point((ax - i), (ay - i)));
                        }
                    }
                }
            }
        } 
    }
}