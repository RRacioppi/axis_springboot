package com.example.service;

import com.examples.www.wsdl.DownStreamService_wsdl.DownStream_PortType;
import com.examples.www.wsdl.DownStreamService_wsdl.DownStream_ServiceLocator;
import com.examples.www.wsdl.HelloService_wsdl.Hello_PortType;
import java.rmi.RemoteException;
import javax.xml.rpc.ServiceException;

public class Service_Hello_BindingImpl implements Hello_PortType {
    public Service_Hello_BindingImpl() {
    }

    public String sayHello(String firstName) throws RemoteException {
        DownStream_ServiceLocator downStream_Service = new DownStream_ServiceLocator();

        try {
            DownStream_PortType port = downStream_Service.getDownStream_Port();
            port.sayDownStream(firstName);
        } catch (ServiceException var4) {
            var4.printStackTrace();
        }

        return "Hello " + firstName;
    }
}
