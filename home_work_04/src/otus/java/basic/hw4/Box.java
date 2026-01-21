package otus.java.basic.hw4;

public class Box {
    private int size;
    private String color;
    private boolean isEmpty = true;
    private boolean isClosed = true;

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public boolean isEmpty() {
        return this.isEmpty;
    }

    public void close(){
        isClosed = true;
        System.out.println("Коробка закрыта");
    }
    public void open(){
        isClosed = false;
        System.out.println("Коробка открыта");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void putItem() {
        if (this.isClosed) {
            System.out.println("Коробка закрыта, чтобы положить чего-либо в коробку откройте ее.");
            return;
        }
        if (!this.isEmpty) {
            System.out.println("Коробка не пустая ");
            return;
        }
        System.out.println("Поместили предмет в коробку");
        this.isEmpty = false;
    }

    public void extractItem() {
        if (this.isClosed){
            System.out.println("Коробка закрыта, для извлечения чего-либо из коробки откройте ее.");
            return;
        }
        if (this.isEmpty) {
            System.out.println("Коробка пустая ");
            return;
        }
        System.out.println("Извлекли предмет из коробки");
        this.isEmpty = true;
    }

    public void info() {
        System.out.println("Размер: " + size);
        System.out.println("Цвет: " + color);
        switch (isEmpty){
            case true:
                System.out.println("Коробка пустая");
                break;
            case  false:
                System.out.println("Коробка заполнена");
                break;

        }
        switch (isClosed){
            case true:
                System.out.println("Коробка закрыта.");
                break;
            case  false:
                System.out.println("Коробка открыта");
                break;
        }
    }
}
