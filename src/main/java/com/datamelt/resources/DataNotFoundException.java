package com.datamelt.resources;

public class DataNotFoundException extends RuntimeException
{
    public DataNotFoundException(String message)
    {
        super(message);
    }
}
