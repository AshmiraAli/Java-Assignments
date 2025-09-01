public class genericQueueADTarray<T> 
{
    T[] queueArray;
    int front;
    int rear;
    int capacity;

	@SuppressWarnings("unchecked")
    public genericQueueADTarray(int capacity) 
	{
        this.capacity = capacity;
        this.queueArray = (T[]) new Object[capacity];
        this.front = 0;
        this.rear = -1;
    }

    public boolean isFull()
	{
		return (rear == queueArray.length - 1);
	}
	public boolean isEmpty()
	{
		return (rear == -1);
    }
    public void enQueue(T data) 
	{
        if (isFull()) 
		{
            System.out.println("Queue overflow.");
            return;
        }
        queueArray[++rear] = data;
    }
    public void deQueue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue underflow.");
        }
		
			T deletedValue = queueArray[front];
			System.out.println("Deleted " + deletedValue);
			/*
			it is u=done by moving the front.
			front++;
		
			if (front > rear)
			{
				front = 0;
				rear = -1;
				return;
			}*/
			for(int i = front+1; i<= rear; i++)
			{
				queueArray[front] = queueArray[i];
			}
			rear--;
		
    }
    public T peek() 
	{
        if (isEmpty()) 
		{
            throw new IndexOutOfBoundsException("Queue is empty. No element to peek.");
        }
        return (T) queueArray[front];
    }
	
	public void search(T data)
	{
		if (isEmpty()) 
		{
            throw new IndexOutOfBoundsException("Queue is empty. No element to peek.");
        }
		for(int i = front; i <= rear;i++)
		{
			if(queueArray[i] == data)
			{
				System.out.print("The data '"+data+"' in the "+i+" index.");
			}
			else
			{
				System.out.print("Element is not found.");
			}
		}
	}
	public void display()
	{
		if (isEmpty()) 
		{
            System.out.println("Queue is empty.");
            return;
        }
		
		System.out.print("[");
		for(int i = front; i <= rear;i++)
		{
			System.out.print(queueArray[i] + ",");
		}
		System.out.print("]");
	}
	public static void main(String[] args)
	{
		genericQueueADTarray<Integer> intQueue= new genericQueueADTarray<>(5);
	
		intQueue.enQueue(5);
		intQueue.enQueue(3);
		intQueue.enQueue(20);
		
		System.out.print("Integer Queue : ");
		intQueue.display();
		System.out.println();
		
		intQueue.deQueue();
		intQueue.display();
		System.out.println();
		
		System.out.println("Peek : "+ intQueue.peek());
		intQueue.search(3);
	}
}