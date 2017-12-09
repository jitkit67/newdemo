class SigleLinkList<T>
{
	private Node<T> start=null;
	public void add(T value)
	{
		Node<T> node = new Node<T>();
		node.setValue(value);
		node.setRef(null);
		if(start==null)
		{
			start=node;
		}
		else
		{
			Node<T> temp=start;
			while(temp.getRef()==null)
			{
				temp=temp.getRef();
			}//while
			temp.setRef(node);
		}//else
	}//add()
	void display()
	{
		Node<T> temp=start;
		if(temp==null)
			System.out.println("No data is Link List");
		else
		{
			while(temp.getRef()==null)
			{
				System.out.println(temp.getValue()+" ");
				temp=temp.getRef();
			}//while
		}//else
	}//display()

}//SigleLinkList
class Node<T>
{
	T value;
	Node<T> ref;
	public void setValue(T value)
	{
		this.value=value;
	}
	public void setRef(Node<T> ref)
	{
		this.ref=ref;
	}
	public T getValue()
	{
		return value;
	}
	public Node<T> getRef()
	{
		return ref;
	}
}
class main
{
	public static void main(String[] args) 
	{
		SigleLinkList<Integer> sl = new SigleLinkList<Integer>();
        sl.add(3);
        sl.add(32);
        sl.add(54);
        sl.add(89);
		sl.display();
	}//main()
}
