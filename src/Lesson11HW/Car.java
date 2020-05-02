package Lesson11HW;

public abstract class Car {

    protected String name;
    protected String price;
    protected String height;
    protected String width;
    protected int length;



    public Car(String name, String price, String height, String width, int length) {
        this.name = name;
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString() {
        return "AutoShop has these cars" +
                " " + name + "" + "  price=" + price + " height=" + height + " width=" + width + " length=" + length;

    }

}
