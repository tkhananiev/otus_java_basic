package otus.java.basic.hw4;

public class Box {
    private int weight;
    private int height;
    private String color;
    private boolean isEmpty = true;

    public Box(int weight, int height, String color) {
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    public int getWeight() {
        return weight;
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

    public void setColor(String color) {
        this.color = color;
    }
    public void putItem() {
        if (this.isEmpty) {
            System.out.println("Поместили предмет в коробку");
            this.isEmpty = false;
        }
        else System.out.println("Коробка не пустая ");
    }
    public void extractItem() {
        if (!this.isEmpty) {
            this.isEmpty = true;
            System.out.println("Извлекли предмет из коробки");
        }
        else System.out.println("Коробка пустая ");
    }
}
