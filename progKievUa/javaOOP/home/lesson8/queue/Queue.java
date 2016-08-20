package progKievUa.javaOOP.home.lesson8.queue;

import java.util.NoSuchElementException;

/**
 * Created by Alexander on 8/20/2016.
 */

public interface Queue<E> extends Iterable<E> {
    /**
     * Inserts the specified element into this Queue.
     *
     * @param e the element to add
     */
    void offer(E e);

    /**
     * Retrieves and removes the head of this Queue.  This method differs
     * from {@link #poll poll} only in that it throws an exception if this
     * Queue is empty.
     *
     * @return the head of this Queue
     * @throws NoSuchElementException if this Queue is empty
     */
    E remove();

    /**
     * Retrieves and removes the head of this Queue,
     * or returns {@code null} if this Queue is empty.
     *
     * @return the head of this Queue, or {@code null} if this Queue is empty
     */
    E poll();

    /**
     * Retrieves, but does not remove, the head of this Queue.  This method
     * differs from {@link #peek peek} only in that it throws an exception
     * if this Queue is empty.
     *
     * @return the head of this Queue
     * @throws NoSuchElementException if this Queue is empty
     */
    E element();

    /**
     * Retrieves, but does not remove, the head of this Queue,
     * or returns {@code null} if this Queue is empty.
     *
     * @return the head of this Queue, or {@code null} if this Queue is empty
     */
    E peek();

    /**
     * Returns the number of elements in this Queue.  If this Queue
     * contains more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this Queue
     */
    int size();

    /**
     * Returns <tt>true</tt> if this Queue contains no elements.
     *
     * @return <tt>true</tt> if this Queue contains no elements
     */
    boolean isEmpty();

    /**
     * Returns <tt>true</tt> if this Queue contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this Queue
     * contains at least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param elem element whose presence in this Queue is to be tested
     * @return <tt>true</tt> if this Queue contains the specified
     *         element
     */
    boolean contains(E elem);
}
