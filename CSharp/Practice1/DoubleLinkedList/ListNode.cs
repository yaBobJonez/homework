namespace libDoubleLinkedList;

public class ListNode<T>
{
    public T Data { internal set; get; }
    internal ListNode<T>? Next = null, Prev = null;
    public ListNode(T v)
    {
        Data = v;
    }
}
