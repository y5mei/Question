public interface MyList<F> {
    //This is the MyList interface that defines the list methods we will use

    public void add(F element);

    public void remove(int index);

    public F get(int index);

    public int size();

    public String toString();

}
