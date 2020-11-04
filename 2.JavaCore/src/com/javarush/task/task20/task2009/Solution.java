package com.javarush.task.task20.task2009;

import java.io.*;

/*
Как сериализовать static?
*/
public class Solution {
    public static class ClassWithStatic implements Serializable{
        public static String staticString = "it's test static string";
        public int i;
        public int j;

        public static void serializableStatic(ObjectOutputStream objectOutputStream) throws Exception{
            objectOutputStream.writeBytes(staticString);
        }

        public static void deserializableStatic(ObjectInputStream objectInputStream) throws Exception{
            staticString = objectInputStream.readUTF();
        }
    }

    public static void main(String[] args) throws Exception {
    }
}