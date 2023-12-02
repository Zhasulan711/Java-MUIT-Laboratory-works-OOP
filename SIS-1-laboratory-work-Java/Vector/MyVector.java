package Vector;

public class MyVector extends MyCollection {
    private int[] arr;

    public MyVector() {
        arr = new int[] { 2, 7, 3, 1, 5, 6, 7, 2, 9, 0, 2 };
    }

    public MyVector(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void add(int el) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = el;
        arr = newArr;
    }

    @Override
    public void remove(int index, int el) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void clear() {
        arr = new int[0];
    }

    @Override
    public boolean contains(int o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == o) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int indexOf(int o) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == o) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insertElementAt(int el, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = el;
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        arr = newArr;
    }

    @Override
    public boolean isEmpty() {
        return arr.length == 0;
    }

    @Override
    public void removeAt(int index) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public void remove(int el) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != el) {
                newArr[i] = arr[i];
            }
        }
        arr = newArr;
    }

    @Override
    public void removeAll(int el) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != el) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != el) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        arr = newArr;
    }

    @Override
    public void reverse() {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        arr = newArr;
    }

    @Override
    public void set(int index, int el) {
        arr[index] = el;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    @Override
    public int[] toArray() {
        return arr;
    }

    @Override
    public void toStringValue() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
