package Stack;

public class stackCustom {
    int[] stack;
    int top=-1;
    public stackCustom(int size) {
        this.stack=new int[size];
    }
    public stackCustom() {
        this.stack = new int[10];
    }
    public void insert(int x){
        if(top==stack.length-1){
            int[] stacknew=new int[stack.length*2];
            for (int i = 0; i < stack.length ; i++) {
                stacknew[i]=stack[i];
            }
            stack=stacknew;
        }

            stack[++top]=x;
    }
    public boolean isFull(){
        if(top==stack.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public int peek(){
        if(top!=-1){
            return stack[top];
        }
        else{
            return -1;
        }
    }
    public int pop(){
        if(top!=-1){
            return stack[top--];
        }
        else{
            return -1;
        }
    }
}

