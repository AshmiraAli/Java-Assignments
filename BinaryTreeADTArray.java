class BTreeADT
{
    String[] treeArray;
    int maxSize;
    int currentSize;

    public BTreeADT(int maxSize) 
	{
        this.maxSize = maxSize;
        this.treeArray = new String[maxSize];
        this.currentSize = 0;
    }

    public boolean isEmpty() 
	{
        return currentSize == 0;
    }

    public boolean isFull() 
	{
        return currentSize == maxSize;
    }

    public void insert(String data) 
	{
        if (isFull()) 
		{
            System.out.println("Tree is full.");
        } 
		else 
		{
            treeArray[currentSize] = data;
            currentSize++;
            System.out.println("Inserted " + data);
        }
    }

    public int search(String data) 
	{
        if (isEmpty())
		{
			System.out.println("Tree is empty.");			
        } 
		else 
		{
			for (int i = 0; i < currentSize; i++) 
			{
				if (treeArray[i] == data) 
				{
					return i;
				}
			}
        }
		return -1;
    }

    public boolean delete(String data) 
	{
        int index = search(data);        
        if (index == -1) 
		{
            System.out.println("Element not found.");
            return false;
        } 
		else 
		{
            treeArray[index] = treeArray[currentSize - 1];
            treeArray[currentSize - 1] = null;
            currentSize--;
            System.out.println("Deleted " + data + " from the tree.");
            return true;
        }
    }

    public void inorderTraversal(int index) 
	{
		if (isEmpty()) System.out.println("Tree is empty.");			
        else 
		{
			if (index < 0 || index >= currentSize)
			{
				System.out.println("Index is not correct!");
				return;
			} 
			else if (treeArray[index] == null) 
			{
				System.out.print("- ");
				return;
			} 
			else 
			{
				inorderTraversal(2 * index + 1);
				System.out.print(treeArray[index] + " ");
				inorderTraversal(2 * index + 2);
			}
		}
    }

    public void preorderTraversal(int index) 
	{
		if (isEmpty()) System.out.println("Tree is empty.");			
        else 
		{
			if (index < 0 || index >= currentSize)
			{
				System.out.println("Index is not correct!");
				return;
			} 
			else if (treeArray[index] == null) {
				System.out.print("- ");
				return;
			} 
			else {
				System.out.print(treeArray[index] + " ");
				preorderTraversal(2 * index + 1);
				preorderTraversal(2 * index + 2);
			} 
		}
    }

    public void postorderTraversal(int index) 
	{
		if (isEmpty()) System.out.println("Tree is empty.");			
        else 
		{
			if (index < 0 || index >= currentSize){
				System.out.println("Index is not correct!");
				return;
			} else if (treeArray[index] == null) {
				System.out.print("- ");
				return;
			} else {
				postorderTraversal(2 * index + 1);
				postorderTraversal(2 * index + 2);
				System.out.print(treeArray[index] + " ");
			} 
		}
    }
	
	public void levelOrderTraversal() {
		if (isEmpty()){
			System.out.println("Tree is empty.");			
        } else {
			for (int i = 0; i < currentSize; i++) {
				if (treeArray[i] != null) {
					System.out.print(treeArray[i] + " ");
				} else {
					System.out.print("- ");
				}
			}
		}
		System.out.println();
    }
	public void findChildren(String data)
	{
		int index = search(data);
		
		if (index >= currentSize-1)
		{
			System.out.println("No childrens.");
		}
		else
		{
		System.out.println(treeArray[2*index + 1]);
		System.out.println(treeArray[2*index + 2]);
		}
	}
	public void findParent(String data)
	{
		int index = search(data);
		if (index == -1 )
		{
			System.out.println("Element not found ");
			return;
		}
		if(index == 0 )
		{
			System.out .println("Element is the root value of the tree");
			return;
		}
		int parentIndex = (index-1) / 2;
		if(parentIndex % 2 != 0)
		{
			System.out.println(treeArray[parentIndex+1]);
		}
		
		System.out.println(treeArray[parentIndex]);
	}
	public void setRigthChild(String data , String rightChild)
	{
		int index = search(data);
		treeArray[2*index + 2] = rightChild;
	}
	public void setParent(String data , String parent)
	{
		int index = search(data);
		if (index == -1 )
		{
			System.out.println("Element not found ");
			return;
		}
		if(index == 0 )
		{
			System.out .println("Element is the root value of the tree");
			return;
		}
		int parentIndex = (index-1)/2;
		if(parentIndex % 2 != 0)
		{
			treeArray[parentIndex+1] = parent;
			return;
		}
		treeArray[parentIndex] = parent;
	}
	public int findHeight() {
        if (isEmpty()) 
		{
			System.out.println("Tree is empty.");
            return -1; 
        }
        // The formula is (log2(N)), where N is the number of nodes.
        // We use Math.log for natural log and convert it to base 2.
        int height = (int) Math.floor(Math.log(currentSize) / Math.log(2));
		System.out.println("Height : "+ height);
        return height;
    }
	public int getSize() 
	{
		System.out.println("Size : "+ this.currentSize);
        return this.currentSize;
    }
}
public class BinaryTreeADTArray 
{
    public static void main(String[] args) 
	{
        BTreeADT binaryTree = new BTreeADT(9);
		binaryTree.insert("b");
        binaryTree.insert("i");
        binaryTree.insert("n");
        binaryTree.insert(null);        
        binaryTree.insert("a");
        binaryTree.insert("r");
        binaryTree.insert(null);
        binaryTree.insert(null);
        binaryTree.insert("y");
		
		
		System.out.println("Levelorder Traversal:");
        binaryTree.levelOrderTraversal();
        System.out.println();
		
		System.out.print("The childrens of y : ");
		binaryTree.findChildren("y");
		System.out.println();
		
		System.out.print("The parent of r : ");
		binaryTree.findParent("r");
		
		System.out.print("The parent of y : ");
		binaryTree.findParent("y");
	
		binaryTree.setRigthChild("n" , "o");
		System.out.print("After Adding : ");
		binaryTree.levelOrderTraversal();
		System.out.println();
		
		binaryTree.setParent("y" , "g");
		System.out.print("After change : ");
		binaryTree.levelOrderTraversal();
		System.out.println();
		
		binaryTree.findHeight();
		binaryTree.getSize();
	}
}
