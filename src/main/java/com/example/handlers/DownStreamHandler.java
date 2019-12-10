package com.example.handlers;

import com.example.utils.JWTThreadLocal;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class DownStreamHandler extends BasicHandler {
    public DownStreamHandler() {
    }

    public void invoke(MessageContext msgContext) throws AxisFault {
        String authorization_header = JWTThreadLocal.getJwt().get();
        msgContext.getMessage().getMimeHeaders().addHeader("Authorization", authorization_header);
        System.out.println("DownStreamHandler");
    }
}
