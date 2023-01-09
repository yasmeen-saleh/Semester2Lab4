public class SinglyLinkedList <E>{
    //list doesn't need an arranged placement doesn't need to be sequentail
    private Node<E>head=null;//because there is no node
    private Node<E>tail=null;//because there is no node
    private int size=0;
    public SinglyLinkedList() {
    }

    public boolean isEmpty(){
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if(isEmpty()) return null;
        return head.element;
    }

    public E last()
    {
        if(isEmpty()) return null;
        return tail.element;
    }

    public void addFirst(E element)
    { head = new Node<>(element,head);
        if(isEmpty())
            tail= head;
        size++;

    }
    public void addLast(E element)
    { Node<E> newest= new Node<>(element,null);
        if(isEmpty())
        {
            head=newest;
        }else
            tail.setNext(newest);
        tail= newest;
        size++;
    }

    public E remove()
    { if (isEmpty()) return null;
        E removed= head.getElement();
        head= head.next;
        size--;
        if(size==0)
            tail=null;
        return removed;
    }

     public boolean equals (SinglyLinkedList list){//done
         if(isEmpty()||list.isEmpty())return false;
         Node<E> i= list.head;
         Node <E> j = head;
         while(i.next!=null&&j.next!=null){
             if(i.element!=j.element)
               return false;
             else
             {i= i.next;
                j=j.next;
             size--;}
         }
        return true;
     }

    public E secondToLast (){//done
        if(!isEmpty()){
        Node<E> i= head;
        while(i.next.next!=null){
         i=i.next;
        }
        return i.getElement();}
        return null;
    }
    public int countSize(){//done
        Node<E> i;
        int listSize=0;
        if(!isEmpty()) {
            i = head;
             listSize=1;
        while(i.next!=null){
            i=i.next;
            listSize++;
        }}
        return listSize;
    }

    public void rotate(){//done
        if(!isEmpty()){
       tail.next=head;
       tail=tail.next;
        head= head.next;
        tail.next=null;}
        else
            System.out.println("list is empty");
    }
    public void concat(SinglyLinkedList m){//done
//     l.tail.setNext(m.head);
//       l.tail=m.tail;
        //tail.next=m.head;
        //tail=m.tail;
        Node<E> i;
        if(!isEmpty()) {
            i = m.head;
            while(i.next!=null){
                i=i.next;
                addLast(i.getElement());
                }
        }

    }

  public   void reverse()
    { if(!isEmpty()){
        Node previous = null;
        Node curr = head;
        Node next = null;
        while (curr != null)
        {
            next = curr.next;
            curr.next = previous;
            previous = curr;
            curr = next;
        }
        head = previous;}
    }



    private static class Node<E>{
        E element; //generic
        Node<E> next;//reference to the next element

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }//node


}

