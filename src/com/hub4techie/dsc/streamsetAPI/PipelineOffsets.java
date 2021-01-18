package com.hub4techie.dsc.streamsetAPI;
public class PipelineOffsets
{
    private String sdcId;

    private String pipelineId;

    private String offset;

    private boolean resetOffset;

    public void setSdcId(String sdcId){
        this.sdcId = sdcId;
    }
    public String getSdcId(){
        return this.sdcId;
    }
    public void setPipelineId(String pipelineId){
        this.pipelineId = pipelineId;
    }
    public String getPipelineId(){
        return this.pipelineId;
    }
    public void setOffset(String offset){
        this.offset = offset;
    }
    public String getOffset(){
        return this.offset;
    }
    public void setResetOffset(boolean resetOffset){
        this.resetOffset = resetOffset;
    }
    public boolean getResetOffset(){
        return this.resetOffset;
    }
}			