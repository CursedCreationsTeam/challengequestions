#!/usr/bin/env bash

if [ ! -d "./jdk-21/" ]; then
    rm -v openjdk-21-ea+30_linux-x64_bin.tar.gz
    wget https://download.java.net/java/early_access/jdk21/30/GPL/openjdk-21-ea+30_linux-x64_bin.tar.gz
    tar -xzvf openjdk-21-ea+30_linux-x64_bin.tar.gz
fi
if [ -z $1 ]; then
    echo "Please select which program you would like to compile and run!"
    exit
fi
export PATH=$(pwd)/jdk-21/bin/:$PATH
javac --release 21 --enable-preview c$1.java
#echo $@
java --enable-preview c$1 $@