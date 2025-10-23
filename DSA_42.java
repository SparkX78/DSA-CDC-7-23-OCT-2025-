public class DSA_42 {
    static class ArrayStack{
        private int[] stack;
        private int capacity;
        private int top;

        public ArrayStack(int size){
            capacity = size;
            stack = new int[capacity];
            top = -1;
        }
        public void push(int value){
            if(isFull()){
                System.out.println("THE STACK CAPACITY IS FULL");
                return;
            }
            stack[++top] = value;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("pop operation cannot be performed");
                return -1;
            }
            else{
                return stack[top--];
            }
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("THE STACK IS EMPTY");
                return -1;
            }
            else{
                return stack[top];
            }
        }
        public boolean isEmpty(){
            return top == -1;
        }
        public boolean isFull(){
            return top == capacity-1;
        }
        public void printStack(){
            if(isEmpty()){
                System.out.println("THE STACK IS EMPTY");
                return;
            }
            System.out.println("STACK CONTENTS");
            for(int i = 0; i <= top; i++){
                System.out.println(stack[i] + " ");
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        ArrayStack stack = new ArrayStack(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);
        stack.push(25);
        stack.push(26);
        stack.push(27);
        stack.push(28);
        stack.push(29);
        stack.push(30);

        stack.printStack();
        System.out.println("THE TOPMOST ELEMENT IN THE STACK : " + stack.peek());
        System.out.println("THE POPPED ELEMNT IN THE STACK  : " + stack.pop());

        stack.printStack();

    }
}
