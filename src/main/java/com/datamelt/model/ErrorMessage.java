package com.datamelt.model;

public class ErrorMessage
{
    private String message;
    private int errorCode;

    public ErrorMessage(String message, int errorCode, String documentation)
    {
        this.message = message;
        this.errorCode = errorCode;
        this.documentation = documentation;
    }

    private String documentation;

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public int getErrorCode()
    {
        return errorCode;
    }

    public void setErrorCode(int errorCode)
    {
        this.errorCode = errorCode;
    }

    public String getDocumentation()
    {
        return documentation;
    }

    public void setDocumentation(String documentation)
    {
        this.documentation = documentation;
    }
}
