package com.example.handlers;

import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

public class JWTHandler extends BasicHandler {
    public JWTHandler() {
    }

    public void invoke(MessageContext msgContext) throws AxisFault {
        String[] authorization_header = msgContext.getMessage().getMimeHeaders().getHeader("Authorization");
        JWTThreadLocal.getJwt().set(authorization_header[0]);
    }
}
