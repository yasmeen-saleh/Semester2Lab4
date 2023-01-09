public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list= new SinglyLinkedList<Integer>();
        SinglyLinkedList<Integer> list1= new SinglyLinkedList<Integer>();

        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list1.addFirst(5);
        list1.addLast(6);
        list1.addLast(7);
        list1.addLast(8);
        list1.addLast(9);

//        System.out.println("The first list before any changes: ");
//                while (!list.isEmpty())
//        {
//            System.out.print(list.remove()+" ");
//        }
//        System.out.println("The second list before any changes: ");
//        while (!list1.isEmpty())
//        {
//            System.out.print(list1.remove()+" ");
//        }
//        System.out.println("1-equals");
//        System.out.println(list.equals(list1));

//        System.out.println("2-SecondToLast");
//        System.out.println("The expected result is: 3 ");
//        System.out.println("The actual result is: "+list.secondToLast());

//        System.out.println("3-Size");
//        System.out.println("The expected result:  "+list1.size());
//        System.out.println("The actual result: "+list1.countSize());

//       System.out.println("4-rotate");
//          list1.rotate();
//        System.out.println("The list after rotating the first and last element:");
//        while (!list1.isEmpty())
//        {
//            System.out.print(list1.remove()+" ");
//        }

//        System.out.println("5-concat");
//        System.out.println("The lists after concatenation:");
//        list.concat(list1);
//        while (!list.isEmpty())
//        {
//            System.out.print(list.remove()+" ");
//        }

//      System.out.println("6-reverse");
//        System.out.println("The list after reversing:");
//       list.reverse();
//        while (!list.isEmpty())
//        {
//            System.out.print(list.remove()+" ");
//        }


    }
}