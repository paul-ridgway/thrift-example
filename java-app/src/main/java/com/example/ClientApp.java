package com.example;

import com.example.thrift.Calculator;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class ClientApp {

    public static void main(final String[] args) throws Exception {
        final TTransport transport = new TSocket("localhost", 9090);

        transport.open();

        final TProtocol protocol = new TBinaryProtocol(transport);
        final Calculator.Client client = new Calculator.Client(protocol);

        client.ping();
        System.out.println(client.add(100, 200));

        transport.close();
    }

}
