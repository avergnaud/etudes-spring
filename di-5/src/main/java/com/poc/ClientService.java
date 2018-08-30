package com.poc;
/*
Dependency injection (DI) is a process whereby objects define their dependencies (that is, the other objects with which they work) only through 
- constructor arguments, 
- arguments to a factory method, 
- or properties that are set on the object instance after it is constructed or returned from a factory method
*/
public class ClientService {

    public static Client createInstance(int i) {
        return new Client(i);
    }
}