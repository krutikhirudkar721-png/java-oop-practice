// Q8: Demonstrate interface Filterable.

interface Filterable {
    void applyFilter(String type);
    void resetFilter();
}

class ImageProcessor implements Filterable {
    public void applyFilter(String type) {
        System.out.println("Image filter: " + type);
    }
    public void resetFilter() {}
}

class DataAnalyzer implements Filterable {
    public void applyFilter(String type) {
        System.out.println("Data filter: " + type);
    }
    public void resetFilter() {}

    public static void main(String[] args) {
        new ImageProcessor().applyFilter("Blur");
        new DataAnalyzer().applyFilter("Noise");
    }
}
