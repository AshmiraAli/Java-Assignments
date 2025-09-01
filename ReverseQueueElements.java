import java.util.Stack;

class Queue
{
	int[] array;
	int capacity;
	int front;
	int rear;
	
	public Queue(int capacity)
	{
		this.capacity = capacity;
		this.array = new int[capacity];
		this.front = 0;
		this.rear = -1;
	}
	public boolean isFull()
	{
		return (rear == array.length - 1);
	}
	public boolean isEmpty()
	{
		return (rear == -1);
	}
	public void enQueue(int value)
	{
		if(isFull())
		{
			System.out.println("Queue overflow.");
			return;
		}
		array[++rear] = value;
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
			System.out.print(array[i] + ",");
		}
		System.out.print("]");
	}
	public int deQueue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue underflow.");
            return -1;
        }
        int item = array[front];
        
        // This loop shifts all elements to the left
        for (int i = front; i < rear; i++) {
            array[i] = array[i + 1];
        }
        rear--;
        return item;
    }
	public int getSize() 
	{
        return rear + 1;
    }
}
class ArrayStack
{
    int[] stackArray;
    int top;
    int capacity;

    public ArrayStack(int capacity) 
	{
        this.capacity = capacity;
        this.stackArray =new int[capacity];
        this.top = -1;
    }

    public void push(int item) 
	{
        if (top == capacity - 1) 
		{
            System.out.println("Stack is full.");
            return;
        }
        stackArray[++top] = item;
    }
	public int pop() 
	{
        if (isEmpty()) 
		{
            System.out.println("Stack is empty.");
			return -1;
        }
        return stackArray[top--];
    }
	public boolean isEmpty() 
	{
        return top == -1;
    }
}
public class ReverseQueueElements 
{
	
    public static void reverseFirstKElements(Queue queue, int k) 
	{
		//Queue queue = new Queue(10);
        if (queue.isEmpty() || k <= 0 || k > queue.capacity) 
		{
            System.out.println("Invalid input for reversing elements.");
            return;
        }
		
        ArrayStack stack = new ArrayStack(k);
		
		// Dequeue first K elements and push onto the stack
        for (int i = 0; i < k; i++) 
		{
            stack.push(queue.deQueue());
        }
		
		// Pop from stack and enqueue back into the queue
        while (!stack.isEmpty()) 
		{
            queue.enQueue(stack.pop());
        }
		
		// Move remaining elements from back to front
        for (int i = 0; i < queue.capacity - k; i++) 
		{
            int item = queue.deQueue();
            queue.enQueue(item);
        }
	}
	public static void main(String[] args) 
	{
        Queue queue = new Queue(10);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
        queue.enQueue(8);
        queue.enQueue(9);
        queue.enQueue(10);

        System.out.print("Original Queue: ");
        queue.display(); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println();
		
        int k = 5;
        System.out.println("Reversing the first " + k + " elements.");
        reverseFirstKElements(queue, k);

        System.out.print("Modified Queue: ");
        queue.display(); // Output: [5, 4, 3, 2, 1, 6, 7, 8, 9, 10]
    }
}