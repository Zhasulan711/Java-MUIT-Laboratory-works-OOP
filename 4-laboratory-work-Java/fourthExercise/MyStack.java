package fourthExercise;

import java.util.ArrayList;

public class MyStack<T> extends ArrayList<T> {
    public MyStack() {
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    public T peek() {
        if (getSize() > 0) {
            return super.get(getSize() - 1);

        } else {
            return null;
        }
    }

    public T pop() {
        if (getSize() > 0) {
            T o = super.get(getSize() - 1);
            super.remove(getSize() -1);
            return o;
        }
        else {
            return null;
        }
    }

    public void push(T o) {
        super.add(o);
    }

    public String toString() {
        return super.toString();
    }
}
