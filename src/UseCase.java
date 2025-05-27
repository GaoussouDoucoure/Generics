public class UseCase {
    /*
    GENERICS SAVE YOU FROM REWRITING THE SAME CLASS FOR EACH DATA TYPE.
    AN EXAMPLE BELOW.
     */
}

class StringBox {
    String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

class IntegerBox {
    Integer item;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }
}

// USING GENERIC WILL SIMPLIFY THE 2 CLASSES ABOVE: STRINGBOX & INTEGERBOX
class Box<T> {
    T item; // T means "any type", and we can name T anything we want

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}