package be.intecbrussel.Les1.Exercise04;

public interface Pair<E>{
    public E getLeft();
    public E getRight();

    public void setLeft(E left);
    public void setRight(E right);

    public default void swap(){
        E temp = getLeft();
        setLeft(getRight());
        setRight(temp);
    }
}

