package com.hub4techie.tfs2;

public class Steps
{
    private String last;

    private Step[] step;

    private String id;

    public String getLast ()
    {
        return last;
    }

    public void setLast (String last)
    {
        this.last = last;
    }

    public Step[] getStep ()
    {
        return step;
    }

    public void setStep (Step[] step)
    {
        this.step = step;
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
        return "ClassPojo [last = "+last+", step = "+step+", id = "+id+"]";
    }
}

