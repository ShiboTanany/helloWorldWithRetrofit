package com.example.shibo.myapplication;

/**
 * Created by shibo on 29/11/17.
 */

public class Greeting
{
    private String content;

    private String id;

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [content = "+content+", id = "+id+"]";
    }
}