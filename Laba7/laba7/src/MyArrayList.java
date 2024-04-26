import java.util.Arrays;
import java.util.Random;
public class MyArrayList<T> {
    private T[] _data;
    private int _size;
    private int _capacity;

    //задание 1
    public MyArrayList(int capacity) {
        _data = (T[]) new Object[capacity];
        _size = 0;
        if(capacity<0)
        {
            try {
                _capacity = capacity;
                throw  new Exception("Емкость не может быть отрицательной");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public MyArrayList() {
        _capacity=10;
        _size=0;
        _data = (T[]) new Object[_capacity];
    }
    public int GetSize() {
        return _size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < _size; i++) {
            sb.append(_data[i]);
            sb.append(" ");
        }
        return sb.toString();
    }

    private void EnsureCapacity(int minCapacity) {
        if (minCapacity > _capacity) {
            int newCapacity = _capacity + (_capacity >> 1) + 1;
            //_capacity >> 1 сдвиг битов на 1 позицию, что позволяет увелить емкость на 50%(деление на 2)
            _data = Arrays.copyOf(_data, newCapacity);
            _capacity = newCapacity;
        }
    }
    public void pushBack(T element) {
        EnsureCapacity(_size + 1);
        _data[_size++] = element;
    }

    public void popFront() {
        if (_size > 0) {
            System.arraycopy(_data, 1, _data, 0, _size - 1);
            _data[--_size] = null;
        }
    }

    public void pushFront(T element) {
        EnsureCapacity(_size + 1);
        System.arraycopy(_data, 0, _data, 1, _size);
        _data[0] = element;
        _size++;
    }

    public void insert(T element, int index) {
        if (index < 0 || index > _size)
            throw new IndexOutOfBoundsException("Индекс в пределах недопустимых значений.");

        EnsureCapacity(_size + 1);
        System.arraycopy(_data, index, _data, index + 1, _size - index);
        _data[index] = element;
        _size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= _size)
            throw new IndexOutOfBoundsException("Индекс в пределах недопустимых значений.");

        System.arraycopy(_data, index + 1, _data, index, _size - index - 1);
        _data[--_size] = null;
    }

    public void remove(T element) {
        for (int i = 0; i < _size; i++) {
            if (_data[i].equals(element)) {
                removeAt(i);
                break;
            }
        }
    }

    public void removeAll(T element) {
        int writeIndex = 0;
        for (int readIndex = 0; readIndex < _size; readIndex++) {
            if (!_data[readIndex].equals(element)) {
                _data[writeIndex++] = _data[readIndex];
            }
        }
        Arrays.fill(_data, writeIndex, _size, null);
        _size = writeIndex;
    }

    public void popBack() {
        if (_size > 0) {
            _data[--_size] = null;
        }

    }

    public void clear() {
        Arrays.fill(_data, 0, _size, null);
        _size = 0;
    }
    public MyArrayList<T> reverse() {
        MyArrayList<T> reversedList = new MyArrayList<>(_size);
        for (int i = _size - 1; i >= 0; i--) {
            reversedList.pushBack(_data[i]);
        }
        return reversedList;
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = _size - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            T temp = _data[i];
            _data[i] = _data[j];
            _data[j] = temp;
        }
    }

    public boolean equals(MyArrayList<T> otherList) {
        if (_size != otherList.GetSize()) {
            return false;
        }

        for (int i = 0; i < _size; i++) {
            if (!_data[i].equals(otherList.getElementAt(i))) {
                return false;
            }
        }

        return true;
    }

    public T getElementAt(int index) {
        if (index < 0 || index >= _size)
            throw new IndexOutOfBoundsException("Индекс в пределах недопустимых значений.");

        return _data[index];
    }

    @Override
    public MyArrayList<T> clone() {
        MyArrayList<T> clonedList = new MyArrayList<>(_size);
        clonedList._size = _size;
        clonedList._capacity = _capacity;
        clonedList._data = Arrays.copyOf(_data, _capacity);
        return clonedList;
    }



}
