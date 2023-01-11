
public class Main {
    public static void main(String[] args) {
        int size = 10;
        Graph graph01 = new Graph(-size, size, -size, size, 1);

        graph01.createDisplay();
        circle(graph01, 8);
        System.out.println(graph01.Display());
    }

    public static void circle(Graph graph1, int radius) {
        double x;
        double y;
        double x2;
        double y2;
        double step = Math.PI / 3.5;
        for (double i = 0; i <= (Math.PI * 2); i += step) {
            x = Math.cos(i) * radius;
            y = Math.sin(i) * radius;
            x2 = Math.cos(i + step) * radius;
            y2 = Math.sin(i + step) * radius;
            line(new Point(x, y), new Point(x2, y2), graph1);
            // graph1.graphPoint(new Point(x, y));
        }
    }

    public static void line(Point point1, Point point2, Graph graph1) {

        double ax = point1.x;
        double bx = point2.x;
        double ay = point1.y;
        double by = point2.y;

        double xDisp = Math.abs(bx - ax);

        double yDisp = Math.abs(by - ay);

        if (xDisp == 0) {
            if (ay < by) {
                for (int i = 0; i <= Math.abs(yDisp); i++) {
                    graph1.graphPoint(new Point(ax, (ay + i)));
                }
            } else {
                for (int i = 0; i <= Math.abs(yDisp); i++) {
                    graph1.graphPoint(new Point(ax, (ay - i)));
                }
            }
        } else if (yDisp == 0) {
            if (ax < bx) {
                for (int i = 0; i <= Math.abs(xDisp); i++) {
                    graph1.graphPoint(new Point((ax + i), ay));
                }
            } else {
                for (int i = 0; i <= Math.abs(xDisp); i++) {
                    graph1.graphPoint(new Point((ax - i), ay));
                }
            }
        } else {

            double riseRun = Math.abs(yDisp / xDisp);
            double runRise = Math.abs(xDisp / yDisp);

            if (ax < bx) {
                if (ay < by) {
                    if (xDisp > yDisp) {
                        for (int i = 0; i <= Math.abs(xDisp); i++) {
                            graph1.graphPoint(new Point((ax + i), (ay + (riseRun * i))));
                        }
                    } else if (xDisp < yDisp) {
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax + (runRise * i)), (ay + i)));
                        }
                    } else {
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax + i), (ay + i)));
                        }
                    }
                } else {
                    if (xDisp > yDisp) {
                        for (int i = 0; i <= Math.abs(xDisp); i++) {
                            graph1.graphPoint(new Point((ax + i), (ay - (riseRun * i))));
                        }
                    } else if (xDisp < yDisp) {
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax + (runRise * i)), (ay - i)));
                        }

                    } else { // xDisp == yDisp
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax + i), (ay - i)));
                        }
                    }
                }
            } else {
                if (ay < by) {
                    if (xDisp > yDisp) {
                        for (int i = 0; i <= Math.abs(xDisp); i++) {
                            graph1.graphPoint(new Point((ax - i), (ay + (riseRun * i))));
                        }
                    } else if (xDisp < yDisp) {
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax - (runRise * i)), (ay + i)));
                        }

                    } else { // xDisp == yDisp
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax - i), (ay + i)));
                        }
                    }
                } else {
                    if (xDisp > yDisp) {
                        for (int i = 0; i <= Math.abs(xDisp); i++) {
                            graph1.graphPoint(new Point((ax - i), (ay - (riseRun * i))));
                        }
                    } else if (xDisp < yDisp) {
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax - (runRise * i)), (ay - i)));
                        }
                    } else { // xDisp == yDisp
                        for (int i = 0; i <= Math.abs(yDisp); i++) {
                            graph1.graphPoint(new Point((ax - i), (ay - i)));
                        }
                    }
                }
            }
        }
    }
}