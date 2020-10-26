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

    @Override
    public Iterator<E> iterator() {
        return new Itr<E>();
    }

    class Itr<E> implements Iterator<E> {
        int index;

        @Override
        public boolean hasNext() {
            return index < listSize;
        }

        // What should I return here for the method: next()?
        @Override
        public E next() {
            return MyAbstractList.get(index);

        }

    }
}
