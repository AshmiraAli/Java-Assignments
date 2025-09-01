class Node 
{
    int data;
    Node next;

    public Node(int data) 
	{
        this.data = data;
        this.next = null;
    }
}
class QueueADT 
{
    private Node front, rear; // front points to the first element, rear to the last
    private int size;

    public QueueADT() 
	{
        front = rear = null;
        size = 0;
    }

    // Check if the queue is empty
    public boolean isEmpty() 
	{
        return front == null;
    }

    // Add element to the queue (enqueue)
    public void enqueue(int data) 
	{
        Node newNode = new Node(data);
        if (rear != null) 
		{
            rear.next = newNode; // attach at the end
        }
        rear = newNode;
        if (front == null) 
		{
            front = rear; // first element
        }
        size++;
        //System.out.println(data + " enqueued to queue");
    }

    // Remove element from the queue (dequeue)
    public int dequeue() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) // queue became empty
		{ 
            rear = null;
        }
        size--;
        return value;
    }

    // Get the front element without removing
    public int peek() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty! Nothing to peek.");
            return -1;
        }
        return front.data;
    }

    // Get the current size of the queue
    public int getSize() 
	{
        return size;
    }

    // Display queue elements
    public void display() 
	{
        if (isEmpty()) 
		{
            System.out.println("Queue is empty!");
            return;
        }
        System.out.print("Queue elements: ");
        Node temp = front;
        while (temp != null) 
		{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class queueLinkedList 
{
	public static void interleave(QueueADT q) 
	{
        int n = q.getSize();
        if (n == 0 || n % 2 != 0) 
		{
            System.out.println("The queue must have an even number of elements for interleaving.");
            return;
        }

        // Move the first half of the elements to a temporary queue.
        int halfSize = n / 2;
        QueueADT tempQ = new QueueADT();
        for (int i = 0; i < halfSize; i++) 
		{
            tempQ.enqueue(q.dequeue());
        }

        // Interleave elements from both queues back into the original queue.
        while (!tempQ.isEmpty()) 
		{
            q.enqueue(tempQ.dequeue()); // Enqueue from the first half
            q.enqueue(q.dequeue());    // Enqueue from the second half
        }
    }
    public static void main(String[] args) 
	{
        QueueADT q = new QueueADT();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
		
        System.out.println("Before interleave: ");
        q.display(); // 1 2 3 4 5 6
		System.out.println();
		
		interleave(q);
		
		System.out.println("After interleave:  ");
        q.display();//1 4 2 5 3 6
		
		
		
		
        /*System.out.println("Dequeued: " + q.dequeue()); // 10
        q.display(); // 20 30

        System.out.println("Front element: " + q.peek()); // 20

        q.enqueue(40);
        q.enqueue(50);
        q.display(); // 20 30 40 50

        System.out.println("Queue size: " + q.getSize()); // 4*/
    }
}
