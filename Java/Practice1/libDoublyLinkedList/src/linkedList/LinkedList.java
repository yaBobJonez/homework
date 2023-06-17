package linkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
    protected ListNode<T> first, last;
    protected int length;

    public LinkedList(T v) {
        first = last = new ListNode<T>(v);
        length = 1;
    }
    public LinkedList() {
        length = 0;
    }

    protected void setLength(int length){ this.length = length; }
    public int getLength(){ return this.length; }
    public void PushBack(T v) {
        ListNode<T> newNode = new ListNode<T>(v);
        newNode.prev = last;
        if (last != null) last.next = newNode;
        if (first == null) first = last = newNode;
        last = newNode;
        length += 1;
    }
    public void Remove(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Елемент з індексом "+index+" не існує, довжина списку "+length+".");
        ListNode<T> current = first;
        for (int i = 0; i < index; i++) current = current.next;
        if (current.prev != null) current.prev.next = current.next;
        if (current.next != null) current.next.prev = current.prev;
        if (current == first) first = current.next;
        else if (current == last) last = current.prev;
        length -= 1;
    }
    public T get(int index) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Елемент з індексом "+index+" не існує, довжина списку "+length+".");
        ListNode<T> current = first;
        for (int i = 0; i < index; i++) current = current.next;
        return current.data;
    }
    public void set(int index, T value) {
        if (index < 0 || index >= length) throw new IllegalArgumentException("Елемент з індексом "+index+" не існує, довжина списку "+length+".");
        ListNode<T> current = first;
        for (int i = 0; i < index; i++) current = current.next;
        current.data = value;
    }
    public class ListIterator implements Iterator<T> {
        protected ListNode<T> cursor;
        public ListIterator(ListNode<T> tail){ this.cursor = tail; }
        @Override
        public boolean hasNext() {
            return this.cursor != null;
        }
        @Override
        public T next() {
            T data = this.cursor.data;
            if(this.hasNext()) this.cursor = this.cursor.prev;
            return data;
        }
    }
    public Iterator<T> iterator() {
        return new ListIterator(this.last);
    }
    public ListNode<T> getLast(){ return this.last; }
    public ListNode<T> getNext(ListNode<T> node){ return node.prev; }
    public void Sort(ListSorter<T> sorter) {
        ListNode<T> current = first;
        if (length == 0) return;
        for (int i = 0; i < length -1; i++) {
            for (int j = 0; j < length -i-1; j++) {
                if (sorter.compare(current.data, current.next.data)) {
                    T nextData = current.next.data;
                    current.next.data = current.data;
                    current.data = nextData;
                } current = current.next;
            } while (current.prev != null) current = current.prev;
        } while (current.next != null) current = current.next;
    }
    public LinkedList<T> Filter(ListFilter<T> criteria) {
        LinkedList<T> found = new LinkedList<T>();
        ListNode<T> current = first;
        while (current != null) {
            if (criteria.matches(current.data)) found.PushBack(current.data);
            current = current.next;
        } return found;
    }
}
