package com.hub4techie.dsc.streamsetAPI;

public class HistoryDetails
{
    private String finishTime;

    private String errorRecordCount;

    private String color;

    private String[] warnings;

    private String pipelineCommitLabel;

    private String errorMessage;

    private String[] sdcIds;

    private String[] errorInfos;

    private String upgradeStatus;

    private String lastReportedMetricTime;

    private String jobId;

    private String edge;

    private String outputRecordCount;

    private PipelineOffsets[] pipelineOffsets;

    private String[] ackTrackers;

    private String startTime;

    private String id;

    private String[] pipelineStatus;

    private String runCount;

    private String inputRecordCount;

    private String user;

    private String pipelineCommitId;

    private String status;

    public String getFinishTime ()
    {
        return finishTime;
    }

    public void setFinishTime (String finishTime)
    {
        this.finishTime = finishTime;
    }

    public String getErrorRecordCount ()
    {
        return errorRecordCount;
    }

    public void setErrorRecordCount (String errorRecordCount)
    {
        this.errorRecordCount = errorRecordCount;
    }

    public String getColor ()
    {
        return color;
    }

    public void setColor (String color)
    {
        this.color = color;
    }

    public String[] getWarnings ()
    {
        return warnings;
    }

    public void setWarnings (String[] warnings)
    {
        this.warnings = warnings;
    }

    public String getPipelineCommitLabel ()
    {
        return pipelineCommitLabel;
    }

    public void setPipelineCommitLabel (String pipelineCommitLabel)
    {
        this.pipelineCommitLabel = pipelineCommitLabel;
    }

    public String getErrorMessage ()
    {
        return errorMessage;
    }

    public void setErrorMessage (String errorMessage)
    {
        this.errorMessage = errorMessage;
    }

    public String[] getSdcIds ()
    {
        return sdcIds;
    }

    public void setSdcIds (String[] sdcIds)
    {
        this.sdcIds = sdcIds;
    }

    public String[] getErrorInfos ()
    {
        return errorInfos;
    }

    public void setErrorInfos (String[] errorInfos)
    {
        this.errorInfos = errorInfos;
    }

    public String getUpgradeStatus ()
    {
        return upgradeStatus;
    }

    public void setUpgradeStatus (String upgradeStatus)
    {
        this.upgradeStatus = upgradeStatus;
    }

    public String getLastReportedMetricTime ()
    {
        return lastReportedMetricTime;
    }

    public void setLastReportedMetricTime (String lastReportedMetricTime)
    {
        this.lastReportedMetricTime = lastReportedMetricTime;
    }

    public String getJobId ()
    {
        return jobId;
    }

    public void setJobId (String jobId)
    {
        this.jobId = jobId;
    }

    public String getEdge ()
    {
        return edge;
    }

    public void setEdge (String edge)
    {
        this.edge = edge;
    }

    public String getOutputRecordCount ()
    {
        return outputRecordCount;
    }

    public void setOutputRecordCount (String outputRecordCount)
    {
        this.outputRecordCount = outputRecordCount;
    }

    public PipelineOffsets[] getPipelineOffsets ()
    {
        return pipelineOffsets;
    }

    public void setPipelineOffsets (PipelineOffsets[] pipelineOffsets)
    {
        this.pipelineOffsets = pipelineOffsets;
    }

    public String[] getAckTrackers ()
    {
        return ackTrackers;
    }

    public void setAckTrackers (String[] ackTrackers)
    {
        this.ackTrackers = ackTrackers;
    }

    public String getStartTime ()
    {
        return startTime;
    }

    public void setStartTime (String startTime)
    {
        this.startTime = startTime;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getPipelineStatus ()
    {
        return pipelineStatus;
    }

    public void setPipelineStatus (String[] pipelineStatus)
    {
        this.pipelineStatus = pipelineStatus;
    }

    public String getRunCount ()
    {
        return runCount;
    }

    public void setRunCount (String runCount)
    {
        this.runCount = runCount;
    }

    public String getInputRecordCount ()
    {
        return inputRecordCount;
    }

    public void setInputRecordCount (String inputRecordCount)
    {
        this.inputRecordCount = inputRecordCount;
    }

    public String getUser ()
    {
        return user;
    }

    public void setUser (String user)
    {
        this.user = user;
    }

    public String getPipelineCommitId ()
    {
        return pipelineCommitId;
    }

    public void setPipelineCommitId (String pipelineCommitId)
    {
        this.pipelineCommitId = pipelineCommitId;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "HistoryDetails [finishTime = "+finishTime+", errorRecordCount = "+errorRecordCount+", color = "+color+", warnings = "+warnings+", pipelineCommitLabel = "+pipelineCommitLabel+", errorMessage = "+errorMessage+", sdcIds = "+sdcIds+", errorInfos = "+errorInfos+", upgradeStatus = "+upgradeStatus+", lastReportedMetricTime = "+lastReportedMetricTime+", jobId = "+jobId+", edge = "+edge+", outputRecordCount = "+outputRecordCount+", pipelineOffsets = "+pipelineOffsets+", ackTrackers = "+ackTrackers+", startTime = "+startTime+", id = "+id+", pipelineStatus = "+pipelineStatus+", runCount = "+runCount+", inputRecordCount = "+inputRecordCount+", user = "+user+", pipelineCommitId = "+pipelineCommitId+", status = "+status+"]";
    }
}
			
			