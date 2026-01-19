package otus.java.basic.hw4;

public class Box {
    private int width;
    private int height;
    private String color;
    private boolean isEmpty = true;
    private boolean isClosed = true;

    public Box(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWeight() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void closeBox(){
        isClosed = true;
        System.out.println("Коробка закрыта");
    }
    public void openBox(){
        isClosed = false;
        System.out.println("Коробка открыта");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void putItem() {
        if (this.isClosed){
            System.out.println("Коробка закрыта, чтобы положить чего-либо в коробку откройте ее.");
            return;
        }
        if (this.isEmpty) {
            System.out.println("Поместили предмет в коробку");
            this.isEmpty = false;
        }
        else System.out.println("Коробка не пустая ");
    }
    public void extractItem() {
        if (this.isClosed){
            System.out.println("Коробка закрыта, для извлечения чего-либо из коробки откройте ее.");
            return;
        }
        if (!this.isEmpty) {
            this.isEmpty = true;
            System.out.println("Извлекли предмет из коробки");
        }
        else System.out.println("Коробка пустая ");
    }

    public void info() {
        System.out.println("Высота: " + height);
        System.out.println("Ширина: " + width);
        System.out.println("Цвет: " + color);
        System.out.println("Пустая ли сейчас? : " + isEmpty);
        System.out.println("Открыта ли? : " + !isClosed);
    }
}
