import java.util.Arrays;

public class MyList<E> {

    private static final int DEFAULR_CAPAITY = 10;
    private int size = 0;
    private Object elements[];

    private void ensureCapa(){
        int newSize = elements.length *2;
        elements = Arrays.copyOf(elements,newSize);
    }
    public MyList(){
        elements = new Object[DEFAULR_CAPAITY];
    }

    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }
    public E get(int i) {
        if (i >= size || i <0){
            throw new IndexOutOfBoundsException("Index: " + i +", Size "+ i);
        }
        return (E) elements[i];
    }

}
