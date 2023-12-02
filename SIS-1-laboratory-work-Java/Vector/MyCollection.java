package Vector;

public abstract class MyCollection {
    abstract void add(int el);

    abstract void remove(int index, int el);

    abstract void clear();

    abstract boolean contains(int o);

    abstract int get(int index);

    abstract int indexOf(int o);

    abstract void insertElementAt(int el, int index);

    abstract boolean isEmpty();

    abstract void removeAt(int index);

    abstract void remove(int el);

    abstract void removeAll(int el);

    abstract void reverse();

    abstract void set(int index, int el);

    abstract int size();

    abstract void sort();

    abstract int[] toArray();

    abstract void toStringValue();
}
