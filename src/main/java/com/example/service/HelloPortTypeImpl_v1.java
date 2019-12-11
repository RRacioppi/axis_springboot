package com.example.service;

import com.examples.www.wsdl.HelloService.v1.HelloPortType_v1;
import com.examples.www.wsdl.HelloService.v1.HelloService_v1Locator;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class HelloPortTypeImpl_v1 implements HelloPortType_v1 {
    public HelloPortTypeImpl_v1() {
    }

    @Override
    public String sayHello(String firstName) throws RemoteException {
        HelloService_v1Locator helloServiceDownstream = new HelloService_v1Locator();
        HelloPortType_v1 port = null;
        try {
            port = helloServiceDownstream.getHelloServicePort();
        } catch (ServiceException e) {
            e.printStackTrace();
        }
        return port.sayEcho("Hello, "+firstName);
    }

    @Override
    public String sayEcho(String firstName) throws RemoteException {
        return firstName;
    }
}
