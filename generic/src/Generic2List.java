import java.util.Iterator;

public class Generic2List<T> implements Iterable<T> {
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            private int index = 0;
            @Override
            public boolean hasNext() {
                return( index < count);
            }

            @Override
            public T next() {
                return items[index++];
            }
        };
    }
}
