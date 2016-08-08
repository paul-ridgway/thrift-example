#!/bin/bash

cd $( dirname "${BASH_SOURCE[0]}" )
cd ..

rm -Rvf java-app/src/main/java/com/example/thrift
rm -Rvf ruby-app/thrift
mkdir -p ruby-app/thrift

thrift -out java-app/src/main/java --gen java example.thrift
thrift -out ruby-app/thrift --gen rb example.thrift
