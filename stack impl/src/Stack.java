public class Stack {
    int[] stackArr;
    int maxSize;
    int top;

    // overloaded constructor
    public Stack(int size){
        this.maxSize = size;
        this.top = -1;
        stackArr = new int[maxSize];
    }

    // push method
    public void push(int value){
        if(top == maxSize -1){ // check whether stack is full
            System.out.println("Error : Stack is full");
        }
        else{
            top++;
            stackArr[top] = value;
            System.out.println("Inserted "+value);
        }
    }

    // pop method
    public int pop(){ // check weather stack is empty
        if(top == -1){
            System.out.println("Error : Stack is empty");
            return -1;
        }
        else {
            int value = stackArr[top];
            top--;
            return value;
        }
    }

    // peek method
    public int peek(){
        if(top == -1) {// check whether stack is empty
            System.out.println("Error : Stack is empty");
            return -1;
        }
        else{
            return stackArr[top];
        }
    }
}