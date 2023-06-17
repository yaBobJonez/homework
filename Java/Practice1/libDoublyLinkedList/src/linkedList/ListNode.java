package linkedList;

public class ListNode<T> {
    protected T data;
    protected ListNode<T> next = null, prev = null;

    public ListNode(T v){ this.data = v; }
    public T getData(){ return this.data; }
    protected void setData(T data){ this.data = data; }
}
