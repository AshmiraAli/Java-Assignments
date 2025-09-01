public class CircularQueueADTarray<T> 
{
    T[] queueArray;
    int front;
    int rear;
    int currentSize;
    int capacity;

    @SuppressWarnings("unchecked")
    public CircularQueueADTarray(int capacity) 
	{
        this.capacity = capacity;
        this.queueArray = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }
	public boolean isEmpty() 
	{
        return currentSize == 0;
    }

    public boolean isFull() 
	{
        return currentSize == capacity;
    }
	public void enQueue(T item) 
	{
        if (isFull()) 
		{
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        currentSize++;
    }
	public void deQueue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty. Cannot dequeue.");
        }
		System.out.println("deleted item : "+queueArray[front]);
        front = (front + 1) % capacity;
        currentSize--;
    }
	public void peek() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty.");
            
        }
		System.out.println("Peek : "+ queueArray[front]);
	}
    public void display()
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("[");
		for (int i = 0; i < currentSize; i++) 
		{	
			int index = (front + i) % capacity;
			System.out.print(queueArray[index] + ",");
		}
		System.out.println("]");
    }
	public static void main(String[] args) 
	{
        CircularQueueADTarray<Integer> intQueue= new CircularQueueADTarray<>(5);

        intQueue.enQueue(10);
        intQueue.enQueue(20);
        intQueue.enQueue(30);
        intQueue.enQueue(40);
        intQueue.display(); // Output: [10, 20, 30, 40]

        intQueue.deQueue(); // Dequeued item: 10
        intQueue.display(); // Output: [20, 30, 40]

        intQueue.enQueue(50);
        intQueue.enQueue(60); // This will wrap around and use the empty slot
        intQueue.display(); // Output: [20, 30, 40, 50, 60]

        System.out.println("Is the queue full? " + intQueue.isFull()); // true

        intQueue.enQueue(70); // Queue is full. Cannot enqueue.
    }
}
