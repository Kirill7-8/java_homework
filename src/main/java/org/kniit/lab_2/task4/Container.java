public class Container {
    private double free;

    public Container(double total)
    {
        this.free = total;
    }

    public void add(Shape shape)
    {
        double shapeVolume = shape.getVolume();
        if (free >= shapeVolume){
            free -= shapeVolume; 
            System.out.println("Фигура добавлена!"  );
            System.out.println("Свободно места: " + String.format("%.2f", free));
        }
        else{
            System.out.println("Фигура не добавлена!");
            System.out.println("Места не хватило: " + String.format("%.2f", shapeVolume - free));
        }
    }
}
