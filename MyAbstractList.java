import java.util.Iterator;

public abstract class MyAbstractList<E> implements MyList<E>, Iterable<E> {
    protected int listSize = 0;

    public abstract void add(E element);

    public abstract void remove(int index);

    public abstract E get(int index);

    public int size() {
        return listSize;
    }

    public String toString() {
        String toReturn = "";

        for (int i = 0; i < listSize; i++) {
            toReturn += this.get(i).toString();
        }

        return toReturn;
    }

    // Must have a iterator method that return a Iterator<E> object
    @Override
    public Iterator<E> iterator() {
        return new Itr<E>();
    }

    // The Iterator<E> object must have two method 1) hasNext() and next()
    class Itr<E> implements Iterator<E> {
        int index;

        @Override
        public boolean hasNext() {
            return index < listSize;
        }

        @Override
        public E next() {
            return MyAbstractList.this.get(index);

        }

    }
}
