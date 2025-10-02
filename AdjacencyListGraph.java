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
public class AdjacencyListGraph
 {
    Node[] adjList;
    int maxSize;
    int currentSize;
	
	public AdjacencyListGraph(int maxSize)
	{
		this.maxSize = maxSize;
		this.currentSize = 0;
		this.adjList = new Node[maxSize];
	}
	public boolean isEmpty()
	{
		return currentSize == 0;
	}
	public boolean isFull()
	{
		return currentSize == maxSize;
	}
	public void insertVertex()
	{
		if(isFull())
		{
			System.out.println("Graph is full.");
			return;
		}
		currentSize++;
	}
	public void addEdge(int source, int destination)
	{
		if(source >= 0 && source < currentSize && destination >= 0 && destination < currentSize) 
		{
			Node newNode1 = new Node(destination);
			newNode1.next = adjList[source];
            adjList[source] = newNode1;
			
			Node newNode2 = new Node(source);
			newNode2.next = adjList[destination];
            adjList[destination] = newNode2;
		}
		else
		{
			System.out.println("Invalid vertices.");
		}
	}
	public void traversel()
	{
		if(isEmpty())
		{
			System.out.println("Graph is empty.");
		}
		else
		{
			for (int i=0; i<currentSize;i++)
			{
				Node current = adjList[i];
				System.out.print("Source : " + i + " is connected to : ");
				while(current != null)
				{
					System.out.print(current.data + ",");
					current = current.next;
				}
				System.out.println();
			}
		}
	}
	public boolean searchEdge(int source,int destination)
	{
			Node current = adjList[source];
			while(current != null)
			{
				if(current.data == destination)
				{
					return true;
				}
			current = current.next;
			}
			return false;
	}
	public Node deleteNode(Node head, int data)
	{
		if(head == null)
		{
			return null;
		}
		if(head.data == data)
		{
			return head.next;
		}
		Node current = head;
		while(current.next != null)
		{
			if(current.next.data == data)
			{
				current.next = current.next.next;
				break;
			}
			current.next = current.next.next;
		}
		return head;
	}
	public void deleteEdge(int source, int destination)
	{
		if(source < 0 && source >= currentSize && destination < 0 && destination >= currentSize) 
		{
			System.out.println("Invalid vertices");
			return;
		}
		adjList[source] = deleteNode(adjList[source],destination);
		adjList[destination] = deleteNode(adjList[destination],source);
		
	}
	public void deleteVertex(int vertex)
	{
		if(isEmpty())
		{
			System.out.println("Graph is empty.");
			return;
		}
		else
		{
			adjList[vertex] = null;
			for(int i=0; i<currentSize; i++)
			{
				deleteEdge(i,vertex);
			}
		}
		//currentSize--;
	}
	public static void main (String[] args)
	{
		AdjacencyListGraph A1= new AdjacencyListGraph(5);
		System.out.println("Empty : "+A1.isEmpty());
		System.out.println("Full : "+A1.isFull());
		System.out.println();
		
		A1.insertVertex();
		A1.insertVertex();
		A1.insertVertex();
		A1.insertVertex();
		A1.insertVertex();
		A1.addEdge(0,1);
		A1.addEdge(0,2);
		A1.addEdge(1,2);
		A1.addEdge(2,3);
		A1.addEdge(2,1);
		A1.addEdge(3,4);
		A1.addEdge(4,1);
		A1.addEdge(4,3);
		
		A1.traversel();
		System.out.println(A1.searchEdge(0,1));
		System.out.println(A1.searchEdge(1,3));
		
		A1.deleteEdge(0,1);
		System.out.println("Delete the edge (0,1) : ");
		A1.traversel();
		
		A1.deleteVertex(3);
		System.out.println("Delete the Vertex 3 : ");
		A1.traversel();
		System.out.println();
		
		System.out.println("Empty : "+A1.isEmpty());
		System.out.println("Full : "+A1.isFull());
	}
 }