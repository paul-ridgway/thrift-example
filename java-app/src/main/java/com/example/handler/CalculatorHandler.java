package com.example.handler;

import com.example.thrift.Calculator;
import com.example.thrift.InvalidOperation;
import com.example.thrift.Work;
import org.apache.thrift.TException;

public class CalculatorHandler implements Calculator.Iface {

    public void ping() throws TException {
        System.out.println("pong!");
    }

    public int add(final int num1, final int num2) throws TException {
        final int result = num1 + num2;
        System.out.println("Calculated " + num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int calculate(final int logid, final Work w) throws InvalidOperation, TException {
        return 0; //TODO: Implement
    }
}
