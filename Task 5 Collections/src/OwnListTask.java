import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;

public class OwnListTask {
    public static void main(String[] args) {
        LimitedArrayList<Integer> list = new LimitedArrayList<>();
        list.add(5);
        list.add(98);
        list.add(103);

        System.out.println(list);

        list.set(1, 67);
    }
}
class LimitedArrayList<E> extends ArrayList<E>{

    private E[] list;

    public LimitedArrayList() {
        list = (E[]) new Object[0];
    }

    @Override
    public int size() {
        return list.length;
    }

    @Override
    public E get(int index) {
        return list[index];
    }

    @Override
    public boolean add(E e) {
        try {
            list = Arrays.copyOf(list, list.length + 1);
            list[list.length - 1] = e;
            return true;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return new OwnIterator<>(list);
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Operation 'set' is not available in this list");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Operation 'remove' is not available in this list");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Operation 'remove' is not available in this list");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation 'clear' is not available in this list");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Operation 'removeAll' is not available in this list");
    }

    class OwnIterator<E> implements Iterator<E> {

        private int index = 0;
        private E[] list;

        OwnIterator(E[] list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.length;
        }

        @Override
        public E next() {
            return list[index++];
        }
    }
}
