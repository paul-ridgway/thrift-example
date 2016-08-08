package com.example;

import com.example.handler.CalculatorHandler;
import com.example.thrift.Calculator;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;

public class ServerApp {

    public static void main(final String[] args) throws Exception {
        final Calculator.Processor<CalculatorHandler> processor = new Calculator.Processor<CalculatorHandler>(new CalculatorHandler());
        final TServerTransport serverTransport = new TServerSocket(9090);
        final TServer server = new TSimpleServer(new TServer.Args(serverTransport).processor(processor));
        System.out.println("Starting the simple server...");
        server.serve();
    }

}
