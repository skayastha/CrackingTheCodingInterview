import java.util.LinkedList;

public class LearningLinkedLists {
    private LinkedList linkedList;

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList linkedList) {
        this.linkedList = linkedList;
    }

    public void basicLinkedListFunctions()
    {
        this.linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.get(1);
    }
}
