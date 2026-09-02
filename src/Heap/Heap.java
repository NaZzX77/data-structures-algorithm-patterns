package Heap;

public class Heap {
    int size;
    int[] heap;
    int count;
    public Heap(int size){
        this.size=size;
        heap=new int[this.size];
    }
    public boolean insert(int value){
        if(count==size){
            return false;
        }
        int index=count;
        heap[index]=value;
        while(true){
            if(index>0 && heap[(index-1)/2]>value){
                int temp=heap[(index-1)/2];
                heap[(index-1)/2]=value;
                heap[index]=temp;
                index=(index-1)/2;

            }
            else{

                break;
            }
        }
        count++;
        return true;
    }
    public boolean isEmpty(){
        return count==0;
    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return heap[0];
    }
    public int deletion(){
        if(isEmpty()){
            return -1;
        }
        int deleted=heap[0];
        int index=count-1;
        int temp=heap[0];
        heap[0]=heap[index];
        heap[index]=temp;
        count--;
        heap[index]=0;
        index=0;
        while(true){
            int childIndex=-1;
            if(index*2+1<count && index*2+2<count){
                 if(heap[index*2+1]<=heap[index*2+2]){
                     childIndex=index*2+1;
                 }
                 else{
                     childIndex=index*2+2;
                 }
            }
            else if(index*2+1<count ){
                childIndex=index*2+1;
            }
            else if(index*2+2<count){
                childIndex=index*2+2;
            }
            if(childIndex != -1 &&  heap[index]>heap[childIndex]){
                temp=heap[childIndex];
                heap[childIndex]=heap[index];
                heap[index]=temp;
                index=childIndex;
            }
            else{
                break;
            }
        }
        return deleted;
    }
}
