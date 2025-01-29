package ru.hh.jetty;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.util.Callback;

public class MyHandler extends Handler.Abstract.NonBlocking {

    @Override
    public boolean handle(Request request, Response response, Callback callback) throws Exception {
        return false;
    }


}
