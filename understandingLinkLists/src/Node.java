public class Node {
    private String item;
    private int count;
    private Node link;
    private int itemNumber;
    protected static int itemCount = 0;

    public Node(){
        itemCount++;
        item = null;
        count = 0;
        link = null;
        itemNumber = itemCount;
    }

    public Node(String newItem, int newCount, Node newLink){
        itemCount++;
        setData(newItem,newCount);
        setLink(newLink);
        itemNumber = itemCount;
    }

    public void setData(String newItem, int newCount){
        item = newItem;
        count = newCount;
    }

    public void setLink(Node newLink){
        link = newLink;
    }

    public void setItemNumber(int newItemNumber){
        itemNumber = newItemNumber;
    }

    public void increaseItemNumber(int increaseCounter){
        itemNumber = itemNumber + increaseCounter;
    }

    public void decreaseItemNumber(int decreaseCounter){
        itemNumber = itemNumber - decreaseCounter;
    }

    public String getItem(){
        return item;
    }

    public int getCount(){
        return count;
    }

    public Node getLink(){
        return link;
    }

    public int getItemNumber(){
        return itemNumber;
    }

    public int getItemCount(){
        return itemCount;
    }
}

