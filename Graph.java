public class Graph {
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    private int width;
    private int height;
    private double resolution;
    private String display = "";

    public Graph(int minX, int maxX, int minY, int maxY, double resolution){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.resolution = resolution;
        width  = (int) ((this.maxX - this.minX) / this.resolution) + 1;
        height = (int) ((this.maxY - this.minY) / this.resolution) + 1;
    }

    public String createDisplay() {
        for(int a = 0; a < 2; a ++){

            for(int i = 0; i < (height / 2); i ++) {

                for(int b = 0; b < 2; b ++){

                    for(int j = 0; j < (width / 2); j ++) {
                        display += ". ";
                    }

                    if(b < 1) {
                        display += "| ";
                    }
                }

                display += "\n"; 
            }

            if(a < 1) {
                for(int b = 0; b < 2; b ++){

                    for(int j = 0; j < (width / 2); j ++) {
                        display += "- ";
                    }

                    if(b < 1) {
                        display += "+ ";
                    }
                }
            }
            display += "\n";
        }
        return display;
    }

    public String Display() {
        return display;
    }
    public int MinX() {
        return minX;
    }

    public int MaxX() {
        return maxX;
    }

    public int MinY() {
        return minY;
    }

    public int MaxY() {
        return maxY;
    }

    public int Width() {
        return width;
    }

    public int Height() {
        return height;
    }

    public String graphPoint(Point point1) {

        int x = (int) ((point1.X() / resolution) + (0.5 * (point1.X() / Math.abs(point1.X()))));
    
        int y = (int) ((point1.Y() / resolution) + (0.5 * (point1.Y() / Math.abs(point1.Y()))));
        // System.out.println("(" + x + ", " + y + ")");

        int index = (int) ((((height / 2) - y) * ((width * 2) + 1)) + ((width - 1) + (x * 2)));
        display = display.substring(0, index) + "#" + display.substring(index + 1, display.length());
        return display;
    }
}
