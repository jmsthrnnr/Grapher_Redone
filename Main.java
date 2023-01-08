
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

        for(double a = 0; a < (Math.PI * 4); a += 0.5) {
            graph01.graphPoint(new Point(((int) (Math.cos(a) * 10)), ((int) (Math.sin(a) * 10))));
        }
        System.out.println(graph01.getDisplay());
    }
}