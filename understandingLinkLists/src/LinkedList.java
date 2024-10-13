public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        if(head == null)
            return true;
        else
            return false;
    }

    public void printOut(){
        Node position = head;

        while(position != null){
            System.out.println(position.getItemNumber() + position.getItem() 
            + position.getCount() + "\n");
            position = position.getLink();
        }
    }

    public void addToStart(String newItem, int newCount){
        Node addedNode = new Node(newItem, newCount, head);
        head = addedNode;
        addedNode.setItemNumber(1);
        Node position = head.getLink();

        while(position.getLink() != null){
                position.increaseItemNumber(1);
                position = position.getLink();
        }
    }

    public void addToEndWithoutTail(String newItem, int newCount){
        Node addedNode = new Node(newItem, newCount, null);
        Node position = head;

        if(position == null)
            head = addedNode;
        
        else{

            while(position.getLink() != null){
                position = position.getLink();
            }

            position.setLink(addedNode);
            position = addedNode;
        }
    }

    public void deleteHeadNode(){
        if(head != null){
            head = head.getLink();
            System.out.println("head deleted");

            Node position = head;

            while(position.getLink() != null){
                position.decreaseItemNumber(1);
                position = position.getLink();
            }

            position.decreaseItemNumber(1);
        }

        else
            System.out.println("the list is empty");
    }

    public Node findItem(String itemName){
        Node position = head;

        while(position != null){
            if(position.getItem().equals(itemName))
                return position;

        position = position.getLink();
        }

        return null;
    }

    public boolean contains(String itemName){
        return (findItem(itemName) != null);
    }
}

