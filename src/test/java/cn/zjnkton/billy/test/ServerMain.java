package cn.zjnkton.billy.test;

import java.io.IOException;

/**
 * Created by zjnktion on 2016/3/12.
 */
public class ServerMain {

    public static void main(String[] args) throws IOException {
        SampleNioServer server = SampleNioServer.open();
        server.bind(9090);
    }

}
