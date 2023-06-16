namespace libDoubleLinkedList;

public class LinkedList<T> : IEnumerable<T>
{
    protected ListNode<T>? First, Last;
    public int Length { protected set; get; }

    public LinkedList(T v)
    {
        First = Last = new ListNode<T>(v);
        Length = 1;
    }
    public LinkedList()
    {
        Length = 0;
    }

    public void PushBack(T v)
    {
        ListNode<T> newNode = new ListNode<T>(v);
        newNode.Prev = Last;
        if (Last != null) Last.Next = newNode;
        if (First == null) First = Last = newNode;
        Last = newNode;
        Length += 1;
    }
    public void Remove(int index)
    {
        if (index < 0 || index >= Length) throw new ArgumentException($"Елемент з індексом {index} не існує, довжина списку {Length}.");
        ListNode<T> current = First;
        for (int i = 0; i < index; i++) current = current.Next;
        if (current.Prev != null) current.Prev.Next = current.Next;
        if (current.Next != null) current.Next.Prev = current.Prev;
        if (current == First) First = current.Next;
        else if (current == Last) Last = current.Prev;
        Length -= 1;
    }
    public T this[int index]
    {
        get
        {
            if (index < 0 || index >= Length) throw new ArgumentException($"Елемент з індексом {index} не існує, довжина списку {Length}.");
            ListNode<T>? current = First;
            for (int i = 0; i < index; i++) current = current.Next;
            return current.Data;
        }
        set
        {
            if (index < 0 || index >= Length) throw new ArgumentException($"Елемент з індексом {index} не існує, довжина списку {Length}.");
            ListNode<T>? current = First;
            for (int i = 0; i < index; i++) current = current.Next;
            current.Data = value;
        }
    }
    public IEnumerator<T> GetEnumerator()
    {
        if (Length == 0) yield break;
        ListNode<T> current = Last;
        for (int i = 0; i < Length; i++)
        {
            yield return current.Data;
            current = current.Prev;
        }
    }
    System.Collections.IEnumerator System.Collections.IEnumerable.GetEnumerator()
    {
        return GetEnumerator();
    }
    public ListNode<T>? GetLast() => Last;
    public ListNode<T>? GetNext(ListNode<T> node) => node.Prev;
    public void Sort(Func<T, T, bool> sorter)
    {
        ListNode<T> current = First;
        if (Length == 0) return;
        for (int i = 0; i < Length-1; i++)
        {
            for (int j = 0; j < Length-i-1; j++)
            {
                if (sorter(current.Data, current.Next.Data))
                {
                    /*ListNode<T>? preCurr = current.Prev, postNext = current.Next.Next;
                    if (preCurr != null) preCurr.Next = current.Next;
                    if (postNext != null) postNext.Prev = current;
                    current.Next.Prev = preCurr;
                    current.Next.Next = current;
                    current.Prev = current.Next;
                    current.Next = postNext;*/
                    (current.Next.Data, current.Data) = (current.Data, current.Next.Data);
                }
                current = current.Next;
            }
            while (current.Prev != null) current = current.Prev;
        }
        while (current.Next != null) current = current.Next;
    }
    public LinkedList<T> Filter(Func<T, bool> criteria)
    {
        LinkedList<T> found = new LinkedList<T>();
        ListNode<T>? current = First;
        while (current != null)
        {
            if (criteria(current.Data)) found.PushBack(current.Data);
            current = current.Next;
        }
        return found;
    }
}
