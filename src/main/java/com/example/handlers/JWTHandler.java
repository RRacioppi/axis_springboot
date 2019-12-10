package com.example.handlers;

import com.example.utils.JWTThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

@Slf4j
public class JWTHandler extends BasicHandler {
    public JWTHandler() {
    }

    public void invoke(MessageContext msgContext) throws AxisFault {
        log.info("Received Request: "+msgContext.getMessage());
        String[] authorization_header = msgContext.getMessage().getMimeHeaders().getHeader("Authorization");
        if(authorization_header!=null) {
            JWTThreadLocal.getJwt().set(authorization_header[0]);
        }
    }
}
