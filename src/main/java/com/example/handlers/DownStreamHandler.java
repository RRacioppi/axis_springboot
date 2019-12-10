package com.example.handlers;

import com.example.utils.JWTThreadLocal;
import lombok.extern.slf4j.Slf4j;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;

@Slf4j
public class DownStreamHandler extends BasicHandler {
    public DownStreamHandler() {
    }

    public void invoke(MessageContext msgContext) throws AxisFault {
        log.info("Retrieving JWT for downstream");
        String authorization_header = JWTThreadLocal.getJwt().get();
        msgContext.getMessage().getMimeHeaders().addHeader("Authorization", authorization_header);
        log.info("Retrieved: JWT for downstream: " + authorization_header);
    }
}
