public class AdjMatrixGraph
{
	int[][] graphArray;
	int currentSize;
	int maxSize;
	
	public AdjMatrixGraph(int maxSize)
	{
		this.maxSize = maxSize;
		this.graphArray =new int[maxSize][maxSize];
		this.currentSize=0;
	}
	public boolean isFull()
	{
		return currentSize == maxSize;
	}
	public boolean isEmpty()
	{
		return currentSize == 0;
	}
	public void insertVertex(int index)
	{
		if(isFull())
		{
			System.out.println("Graph is full");
			return;
		}
		if(index >= currentSize)
		{	
			currentSize++;
		}
	}
	public void insertEdge(int source,int destination,int weight)
	{
		if(source < 0 && source >= currentSize && destination < 0 && destination >= currentSize)
		{
			throw new IndexOutOfBoundsException("Invalid vertices.");
			//return;
		}
		else if (graphArray[source][destination] == 1 || graphArray[destination][source] == 1)
		{
			System.out.println("The edge is already inserted.");
		}
		else{
			insertVertex(source);
			insertVertex(destination);
			graphArray[source][destination]=weight;
			graphArray[destination][source]=weight;
			System.out.println("Successfully inserded.");
		}
	}
	public int searchVertex(int vertex)
	{
		for (int i=0;i<currentSize;i++)
		{
			if (i == vertex)
			{
				//System.out.println("we found the vertex " + vertex);
				return vertex;
			}
		}
		return -1;
	}
	public boolean searchEdge(int source,int destination)
	{
		if(graphArray[source][destination] == 1)
		{
			return true;
		}
		return false;
	}
	public void deleteEdge(int source,int destination)
	{
		if(source < 0 && source >= currentSize && destination < 0 && destination >= currentSize)
		{
			throw new IndexOutOfBoundsException("Invalid vertices.");
		}
		else{
			graphArray[source][destination] = 0;
			graphArray[destination][source] = 0;	
			System.out.println("Successfully deleted.");
		}
	}
	public void deleteVertex(int vertex)
	{
		if(isEmpty())
		{
			System.out.println("Grapgh is empty ");
			return;
		}
		for(int i=0;i<currentSize;i++)
		{
			if(searchVertex(vertex) > 0)
			{
				graphArray[i][vertex] = 0;
				graphArray[vertex][i] = 0;
			}else{
				System.out.println("Invalid vertex");
			}
		}
	}
	public void travercel()
	{
		if(isEmpty())
		{
			System.out.println("Grapgh is empty ");
			return;
		}
		for(int i=0;i<currentSize;i++)
		{
			System.out.println("Source : " + i);
		 	for(int j=0; j<currentSize;j++)
			{
				if(graphArray[i][j] != 0)
				{
					System.out.println("Destination : " + j + " , Weight : "+graphArray[i][j]);
				}
			}
		}
	}
	public static void main (String[] args)
	{
		AdjMatrixGraph M1= new AdjMatrixGraph(10);
		System.out.println("Empty : "+M1.isEmpty());
		System.out.println("Full : "+M1.isFull());
		M1.insertEdge(0,1,1);
		M1.insertEdge(0,2,1);
		M1.insertEdge(1,2,1);
		M1.insertEdge(2,3,1);
		M1.insertEdge(2,1,1);
		M1.insertEdge(3,4,1);
		M1.insertEdge(4,1,1);
		M1.insertEdge(4,3,1);
		System.out.println();
		
		M1.travercel();
		
		System.out.println(M1.searchEdge(0,1));
		System.out.println(M1.searchEdge(1,3));
		
		M1.deleteEdge(0,1);
		System.out.println();
		M1.travercel();
		
		M1.deleteVertex(3);
		System.out.println();
		M1.travercel();
		
		System.out.println("Empty : "+M1.isEmpty());
		System.out.println("Full : "+M1.isFull());
		
	}
}