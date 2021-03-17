package PW3_17Task6;

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }
    public static void processExceptions(Solution obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch(IOException | NoSuchFieldException e){
            System.err.println(e);
        }
    }
    public void method1() throws IOException {
        throw new IOException();
    }
    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
