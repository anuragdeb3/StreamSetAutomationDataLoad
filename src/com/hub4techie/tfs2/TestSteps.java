package com.hub4techie.tfs2;

public class TestSteps {
	
	private Steps steps;

    public Steps getSteps ()
    {
        return steps;
    }

    public void setSteps (Steps steps)
    {
        this.steps = steps;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [steps = "+steps+"]";
    }


}
