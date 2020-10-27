public class StackNode<T> {
    private T data;
    private StackNode lowerStack;

    public StackNode(){}

    public void setData(T Data){
        data = Data;
    }

    public void setLowerStack(StackNode node){
        lowerStack = node;
    }

    public T getData() {
        return data;
    }

    public StackNode getLowerNode(){
        return lowerStack;
    }
}
