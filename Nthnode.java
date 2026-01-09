class Solution
{
    public ListNode removeNthFromEnd(ListNode head,int n)
    {
        ListNode first = head;
        ListNode last = head;
        for(int i = 0;i<n;i++)
        {
            first = first.next;
        }
        if(first == null)
        {
            return head.next;
        }
        while(first.next!=null)
        {
            first = first.next;
            last = last.next;
        }
        last.next = last.next.next;
        return head;
    }
}