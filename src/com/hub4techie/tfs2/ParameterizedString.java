package com.hub4techie.tfs2;

public class ParameterizedString
{
    private String isformatted;

    private String content;

    public String getIsformatted ()
    {
        return isformatted;
    }

    public void setIsformatted (String isformatted)
    {
        this.isformatted = isformatted;
    }

    public String getContent ()
    {
        return content;
    }

    public void setContent (String content)
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [isformatted = "+isformatted+", content = "+content+"]";
    }
}
