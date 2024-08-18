package com.bushra.assignment;

public class Container {

}package com.bushra.assignment;

interface Container<T> {
    T get();
    void set(T value);
}

 class ContainerImpl<T> implements Container<T> {
    private T value;          

    public ContainerImpl(T value) {
        this.value = value;
    }

    @Override
    public T get() {
        return value;
    }       

    @Override
    public void set(T value) {
        this.value = value;
    }
}   
