#!/usr/bin/env ruby 
require 'thrift'
require_relative 'thrift/calculator'

transport = Thrift::BufferedTransport.new(Thrift::Socket.new('localhost', 9090))
protocol = Thrift::BinaryProtocol.new(transport)
client = Calculator::Client.new(protocol)

transport.open()

client.ping()
print "ping()\n"

sum = client.add(1,1)
print "1+1=", sum, "\n"

sum = client.add(1,4)
print "1+4=", sum, "\n"

