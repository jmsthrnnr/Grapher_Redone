public class Graph {
    private int minX;
    private int maxX;
    private int minY;
    private int maxY;
    private int width;
    private int height;
    private String display = "";
    private int resolution;

    public Graph(int minX, int maxX, int minY, int maxY, int resolution){
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        width  = this.maxX - this.minX;
        height = this.maxY - this.minY;
        this.resolution = resolution;
    }

    public String createDisplay() {
        for(int a = 0; a < 2; a ++){

            for(int i = 0; i < ((height * resolution) / 2); i ++) {

                for(int b = 0; b < 2; b ++){

                    for(int j = 0; j < ((width * resolution) / 2); j ++) {
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

                    for(int j = 0; j < ((width * resolution) / 2); j ++) {
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
        double x = point1.getX();
        double y = point1.getY();
        
        
        return "hello world";
    }
}
