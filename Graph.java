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

    public String getDisplay() {
        return display;
    }
    public int getMinX() {
        return minX;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMinY() {
        return minY;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String graphPoint(Point point1) {
        int x = (int) ((point1.getX() / resolution) + 0.5);
        int y = (int) ((point1.getY() / resolution) + 0.5);
        int index = (int) ((((height / 2) - y) * ((width * 2) + 1)) + ((width - 1) + (x * 2)));
        display = display.substring(0, index) + "#" + display.substring(index + 1, display.length());
        return display;
    }
}
