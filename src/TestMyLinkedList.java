public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TEST");
        MyLinkedList linkedList = new MyLinkedList(13);
        linkedList.addFirst(12);
        linkedList.addFirst(11);
        linkedList.addFirst(10);

        linkedList.add(4, 9);
        linkedList.add(4, 9);
        linkedList.printList();
    }
}
