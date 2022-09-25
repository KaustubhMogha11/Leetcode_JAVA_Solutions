class MyCircularQueue {
 
    private int data[];
    private int front;
    private int rear;
    private int size;
    
    public MyCircularQueue(int k) {
        data=new int [k];
        front=-1;
            rear=-1;
            size=0;
    }
    
    public boolean enQueue(int value) {
        if(size==0){
            front=0;
        }
        if(size==data.length){
            return false;
        }
        size++;
        //Circular queue condition
        // rear=(rear+1)%data.length;
        rear++;
        if(rear==data.length){
            rear=0;
        }
        data[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0){
            return false;
        }
          //Circular queue condition
        // front=(front+1)%data.length;
        front++;
        if(front==data.length){
            front=0;
        }
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return true;
    }
    
    public int Front() {
         if(size==0){
            return -1;
        }
        return data[front];
    }
    
    public int Rear() {
        if(size==0)
        {
            return -1;
        }
        return data[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size==data.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */