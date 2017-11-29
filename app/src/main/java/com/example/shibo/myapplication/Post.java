package com.example.shibo.myapplication;

/**
 * Created by shibo on 29/11/17.
 */

public class Post
{
    private String post_content;

    public String getPost_content ()
    {
        return post_content;
    }

    public void setPost_content (String post_content)
    {
        this.post_content = post_content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [post_content = "+post_content+"]";
    }
}
