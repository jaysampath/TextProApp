package textgen;

import java.util.AbstractList;


/** A class that implements a doubly linked list
 * 
 * @author UC San Diego Intermediate Programming MOOC team
 *
 * @param <E> The type of the elements stored in the list
 */
public class MyLinkedList<E> extends AbstractList<E> {
	LLNode<E> head;
	LLNode<E> tail;
	int size;
	E data;

	/** Create a new empty LinkedList */
	public MyLinkedList() {
		// TODO: Implement this method
	//	LLNode<E> next;
	//	LLNode<E> prev;
		/*head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		
		head.next=tail;
		tail.prev = head;
		size=0;*/
		size = 0;
		head = new LLNode<E>(null);
		tail = new LLNode<E>(null);
		head.next = tail;
		tail.prev = head;
	}

	/**
	 * Appends an element to the end of the list
	 * @param element The element to add
	 */
	public boolean add(E element ) 
	{
		// TODO: Implement this method
		
		/*LLNode<E> node = new LLNode<E>(element);
		
		tail.next = node;
		node.prev = tail;
		node.next = null;
		
		
		
		return false;*/
		if (element == null) {
			throw new NullPointerException();
		}
        LLNode<E> n = new LLNode<E>(element);
        tail.prev.next = n;
        n.prev = tail.prev;
        n.next = tail;
        tail.prev = n;
        size++;
		return true;
	}

	/** Get the element at position index 
	 * @throws IndexOutOfBoundsException if the index is out of bounds. */
	public E get(int index) 
	{
		// TODO: Implement this method.
		/*if(index>size())
		{
			throw new IndexOutOfBoundsException(" Index is Out of Bounds") ;
		}
		E element;
		LLNode<E> temp = head;
		for(int i =0; i< size(); i++)
		{
			if(i==index)
			{
				element = temp.data;
				return element;
			}
			temp = temp.next;
		}
		
		return null;*/
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		for (int i = 0; i <= index; i++) {
			n = n.next;
		}
		return n.data;
	}

	/**
	 * Add an element to the list at the specified index
	 * @param The index where the element should be added
	 * @param element The element to add
	 */
	public void add(int index, E element ) 
	{
		// TODO: Implement this method
		/*LLNode<E> node = new LLNode<E>(element);
		LLNode<E> temp = head;
		for(int i =0; i< size(); i++)
		{
			if(i==index-1)
			{
				node.next = temp.next;
				temp.next = node;
			}
			if(i==index+1)
			{
				node.prev= temp.prev;
				temp.prev=node;
			}
			temp = temp.next;
		}*/
		if (element == null) {
			throw new NullPointerException();
		}
		if ((index < 0 || index >= size)&& size != 0) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> prev = head;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		LLNode<E> node = new LLNode<E>(element);
	
		node.next = prev.next;
		prev.next = node;
		node.next.prev = node;
		node.prev = prev;
		size++;
		
	}


	/** Return the size of the list */
	public int size() 
	{
		/*int res=0;
		// TODO: Implement this method
		LLNode<E> temp = head;
		while(temp.next!= null)
		{
			res++;
			temp = temp.next;
		}
		
		return res;*/
		return size;
	}

	/** Remove a node at the specified index and return its data element.
	 * @param index The index of the element to remove
	 * @return The data element removed
	 * @throws IndexOutOfBoundsException If index is outside the bounds of the list
	 * 
	 */
	public E remove(int index) 
	{
		// TODO: Implement this method
		/*LLNode<E> temp = head;
		for(int i =0; i< size(); i++)
		{*/
		/*	if(i==index-1)
			{
				LLNode<E> next1 = temp.next;
			}
			if(i==index+1)
			{
				LLNode<E> prev1 = temp.prev;
			}*/
			
		/*	if(i==index)
			{*/
				/*LLNode<E> next2 = temp.next;
				LLNode<E> prev2 = temp.prev;*/
				
			/*	temp.prev.next = temp.next;
				temp.next.prev = temp.prev;
				temp.next = null;
				temp.prev= null;
				
			}
			temp = temp.next;
			
		}
		
		return null;*/
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		LLNode<E> n = head;
		for (int i = 0; i <= index; i++) {
			n = n.next;
		}
		n.prev.next = n.next;
		n.next.prev = n.prev;
		size--;
		return n.data;
		
		
	}

	/**
	 * Set an index position in the list to a new element
	 * @param index The index of the element to change
	 * @param element The new element
	 * @return The element that was replaced
	 * @throws IndexOutOfBoundsException if the index is out of bounds.
	 */
	public E set(int index, E element) 
	{
		// TODO: Implement this method
	/*	LLNode<E> temp = head;
		for(int i =0; i< size(); i++)
		{
			if(i==index)
			{
				 temp.data = element ;
				
			}
			temp = temp.next;
		}
		return null;*/
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		if (element == null) {
			throw new NullPointerException();
		}
		LLNode<E> n = head;
		for (int i = 0; i <= index; i++) {
			n = n.next;
		}
		n.data = element;
		return element;
	}
	public static void main(String[] args)
	{
		MyLinkedList<Integer> lst = new MyLinkedList<Integer>();
		int nums[] = {1, 2, 3, 4, 5};
		for (int i : nums) {
			lst.add(i);
                }
		System.out.println(lst);
	}
}

class LLNode<E> 
{
	LLNode<E> prev;
	LLNode<E> next;
	E data;

	// TODO: Add any other methods you think are useful here
	// E.g. you might want to add another constructor

	public LLNode(E e) 
	{
		this.data = e;
		this.prev = null;
		this.next = null;
	}

}
