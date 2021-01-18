package com.hub4techie.tfs2;

public class Step
{
    private String description;

    private String id;

    private ParameterizedString[] parameterizedString;

    private String type;

    public String getDescription ()
    {
        return description;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public ParameterizedString[] getParameterizedString ()
    {
        return parameterizedString;
    }

    public void setParameterizedString (ParameterizedString[] parameterizedString)
    {
        this.parameterizedString = parameterizedString;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [description = "+description+", id = "+id+", parameterizedString = "+parameterizedString+", type = "+type+"]";
    }
}
