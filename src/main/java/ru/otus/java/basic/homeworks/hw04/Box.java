package ru.otus.java.basic.homeworks.hw04;

public class Box {
    private final int size;
    private String color;
    private boolean isOpened;
    private String item;

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

    public void setColor(String color) {
        this.color = color;
        System.out.printf("The box has been repainted in %s color.\n\n", color);
    }

    public void printInfo() {
        System.out.printf("Box size: %d\nBox color: %s\nBox opened: %b\nItem in the box: %s\n\n", size, color, isOpened, item);

    }

    public void open() {
        isOpened = true;
        System.out.println("The box has been opened.\n");
    }

    public void close() {
        isOpened = false;
        System.out.println("The box has been closed.");
    }

    public boolean putItem(String item) {
        if (this.item != null) {
            System.out.println("The box is not empty. The following item is in the box: " + this.item + "\n");
            return  false;
        }
        if (!isOpened) {
            System.out.println("The box is closed.\n");
            return false;
        }
        this.item = item;
        System.out.println("We put the " + item + " in the box.\n");
        return true;
    }

    public void getItem() {
        if (item == null){
            System.out.println("The box is empty.");
            return;
        }
        if (!isOpened){
            System.out.println("The box is closed.");
            return;
        }
        System.out.println("We have taken the following item out of the box: " + item + "\n");
        item = null;
    }
}
