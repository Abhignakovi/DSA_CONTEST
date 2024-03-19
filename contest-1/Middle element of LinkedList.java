class Solution
{
    int getMiddle(Node head)
    {
         int count=0;
         Node cur;
         for(cur=head;cur!=null;cur=cur.next){
             count++;
         }
         int midele=count/2;
         cur=head;
         for(int i=0;i<midele;i++){
             cur=cur.next;
         }
         return cur.data;
    }
}
