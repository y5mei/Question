public class MyConcreteList<E>
        extends MyAbstractList<E>
        implements MyList<E>, Iterable<E> {
    private Object[] myList;

    public MyConcreteList() {
        myList = new Object[100];
    }

    public MyConcreteList(int size) {
        myList = new Object[size];
    }

    public void add(E element) {
        myList[listSize] = element;
        listSize++;
    }

    public void remove(int index) {
        listSize--;
        for (int i = index; i < listSize; i++) {
            myList[i] = myList[i + 1];
        }
    }

    public E get(int index) {
        return (E) myList[index];
    }

//    // Must have a iterator method that return a Iterator<E> object
//    @Override
//    public Iterator<E> iterator() {
//        return new Itr();
//    }
//
//    // The Iterator<E> object must have two method 1) hasNext() and next()
//    class Itr<E> implements Iterator<Object> {
//        int cur;
//
//        @Override
//        public boolean hasNext() {
//            return myList[cur] != null;
//        }
//
//        @Override
//        public Object next() {
//            return myList[cur++];
//
//        }
//
//    }
}
