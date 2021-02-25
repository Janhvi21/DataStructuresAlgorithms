package Arrays;

import java.util.Arrays;

public class MyArray {
    private int length;
    private Object[] data;
    private int capacity;

    public MyArray() {
        this.length = 0;
        this.data = new Object[1];
        this.capacity = 1;
    }

    public Object get(int index) {
        return this.data[index];
    }

    public int push(Object item) {
        if (this.length == this.capacity) {
            this.data = Arrays.copyOf(data, capacity * 2);
            capacity *= 2;
        }
        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    public Object pop() {
        Object lastItem = this.data[this.length - 1];
        this.data[this.length - 1] = null;
        this.length--;
        return lastItem;
    }

    public Object delete(int index) {
        Object item = this.data[index];
        this.shiftItems(index);
        this.length--;
        return item;
    }

    public void shiftItems(int index) {
        for (int i = index; i < this.length - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.data[this.length-1]=null;
    }

    public static void main(String[] args) {
        MyArray array = new MyArray();
        array.push("hi");
        array.push("you");
        array.push("are");
        array.push("nice!");
        array.pop();
        array.delete(0);
        System.out.println(array);
    }
}
