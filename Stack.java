public class Stack<T> {
    private int size = 0;
    private StackNode topNode = new StackNode();

    public Stack(){}

    void push(T data){
        StackNode temp = new StackNode();
        temp.setData(data);
        temp.setLowerStack(topNode);
        topNode = temp;
        size++;
    }

    public Object pop(){
        StackNode temp = topNode;
        if(size == 0) {
            topNode.setData(null);
        }
        else{
            topNode = topNode.getLowerNode();
        }
        size--;
        return temp.getData();
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public StackNode peek(){
        return topNode;
    }
}
