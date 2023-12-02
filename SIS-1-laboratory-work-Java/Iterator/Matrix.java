package Iterator;

import java.util.Iterator;


import java.util.Iterator;

class Matrix<T> implements Iterable<T> {
    private T[][] array;

    public Matrix(T[][] array) {
        this.array = array;
    }

    @Override
    public Iterator<T> iterator() {
        return new TwoDimArrayIterator();
    }

    public class TwoDimArrayIterator implements Iterator<T> {
        private int row = 0;
        private int col = 0;

        @Override
        public boolean hasNext() {
            return row < array.length && col < array[row].length;
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            T value = array[row][col];
            col++;
            if (col >= array[row].length) {
                col = 0;
                row++;
            }
            return value;
        }
    }
}
