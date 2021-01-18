
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Meters {

    @SerializedName("custom.LocalFS_01.lateRecords.0.meter")
    @Expose
    private CustomLocalFS01LateRecords0Meter customLocalFS01LateRecords0Meter;
    @SerializedName("custom.LocalFS_01.toHdfsRecords.0.meter")
    @Expose
    private CustomLocalFS01ToHdfsRecords0Meter customLocalFS01ToHdfsRecords0Meter;
    @SerializedName("custom.LocalFS_02.lateRecords.0.meter")
    @Expose
    private CustomLocalFS02LateRecords0Meter customLocalFS02LateRecords0Meter;
    @SerializedName("custom.LocalFS_02.toHdfsRecords.0.meter")
    @Expose
    private CustomLocalFS02ToHdfsRecords0Meter customLocalFS02ToHdfsRecords0Meter;
    @SerializedName("pipeline.batchCount.meter")
    @Expose
    private PipelineBatchCountMeter pipelineBatchCountMeter;
    @SerializedName("pipeline.batchErrorMessages.meter")
    @Expose
    private PipelineBatchErrorMessagesMeter pipelineBatchErrorMessagesMeter;
    @SerializedName("pipeline.batchErrorRecords.meter")
    @Expose
    private PipelineBatchErrorRecordsMeter pipelineBatchErrorRecordsMeter;
    @SerializedName("pipeline.batchInputRecords.meter")
    @Expose
    private PipelineBatchInputRecordsMeter pipelineBatchInputRecordsMeter;
    @SerializedName("pipeline.batchOutputRecords.meter")
    @Expose
    private PipelineBatchOutputRecordsMeter pipelineBatchOutputRecordsMeter;
    @SerializedName("stage.KafkaConsumer_01.errorRecords.meter")
    @Expose
    private StageKafkaConsumer01ErrorRecordsMeter stageKafkaConsumer01ErrorRecordsMeter;
    @SerializedName("stage.KafkaConsumer_01.inputRecords.meter")
    @Expose
    private StageKafkaConsumer01InputRecordsMeter stageKafkaConsumer01InputRecordsMeter;
    @SerializedName("stage.KafkaConsumer_01.outputRecords.meter")
    @Expose
    private StageKafkaConsumer01OutputRecordsMeter stageKafkaConsumer01OutputRecordsMeter;
    @SerializedName("stage.KafkaConsumer_01.stageErrors.meter")
    @Expose
    private StageKafkaConsumer01StageErrorsMeter stageKafkaConsumer01StageErrorsMeter;
    @SerializedName("stage.KafkaConsumer_01:KafkaConsumer_01OutputLane15082376325530.outputRecords.meter")
    @Expose
    private StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter;
    @SerializedName("stage.LocalFS_01.errorRecords.meter")
    @Expose
    private StageLocalFS01ErrorRecordsMeter stageLocalFS01ErrorRecordsMeter;
    @SerializedName("stage.LocalFS_01.inputRecords.meter")
    @Expose
    private StageLocalFS01InputRecordsMeter stageLocalFS01InputRecordsMeter;
    @SerializedName("stage.LocalFS_01.outputRecords.meter")
    @Expose
    private StageLocalFS01OutputRecordsMeter stageLocalFS01OutputRecordsMeter;
    @SerializedName("stage.LocalFS_01.stageErrors.meter")
    @Expose
    private StageLocalFS01StageErrorsMeter stageLocalFS01StageErrorsMeter;
    @SerializedName("stage.LocalFS_01:LocalFS_01_EventLane.outputRecords.meter")
    @Expose
    private StageLocalFS01LocalFS01EventLaneOutputRecordsMeter stageLocalFS01LocalFS01EventLaneOutputRecordsMeter;
    @SerializedName("stage.LocalFS_02.errorRecords.meter")
    @Expose
    private StageLocalFS02ErrorRecordsMeter stageLocalFS02ErrorRecordsMeter;
    @SerializedName("stage.LocalFS_02.inputRecords.meter")
    @Expose
    private StageLocalFS02InputRecordsMeter stageLocalFS02InputRecordsMeter;
    @SerializedName("stage.LocalFS_02.outputRecords.meter")
    @Expose
    private StageLocalFS02OutputRecordsMeter stageLocalFS02OutputRecordsMeter;
    @SerializedName("stage.LocalFS_02.stageErrors.meter")
    @Expose
    private StageLocalFS02StageErrorsMeter stageLocalFS02StageErrorsMeter;

    public CustomLocalFS01LateRecords0Meter getCustomLocalFS01LateRecords0Meter() {
        return customLocalFS01LateRecords0Meter;
    }

    public void setCustomLocalFS01LateRecords0Meter(CustomLocalFS01LateRecords0Meter customLocalFS01LateRecords0Meter) {
        this.customLocalFS01LateRecords0Meter = customLocalFS01LateRecords0Meter;
    }

    public CustomLocalFS01ToHdfsRecords0Meter getCustomLocalFS01ToHdfsRecords0Meter() {
        return customLocalFS01ToHdfsRecords0Meter;
    }

    public void setCustomLocalFS01ToHdfsRecords0Meter(CustomLocalFS01ToHdfsRecords0Meter customLocalFS01ToHdfsRecords0Meter) {
        this.customLocalFS01ToHdfsRecords0Meter = customLocalFS01ToHdfsRecords0Meter;
    }

    public CustomLocalFS02LateRecords0Meter getCustomLocalFS02LateRecords0Meter() {
        return customLocalFS02LateRecords0Meter;
    }

    public void setCustomLocalFS02LateRecords0Meter(CustomLocalFS02LateRecords0Meter customLocalFS02LateRecords0Meter) {
        this.customLocalFS02LateRecords0Meter = customLocalFS02LateRecords0Meter;
    }

    public CustomLocalFS02ToHdfsRecords0Meter getCustomLocalFS02ToHdfsRecords0Meter() {
        return customLocalFS02ToHdfsRecords0Meter;
    }

    public void setCustomLocalFS02ToHdfsRecords0Meter(CustomLocalFS02ToHdfsRecords0Meter customLocalFS02ToHdfsRecords0Meter) {
        this.customLocalFS02ToHdfsRecords0Meter = customLocalFS02ToHdfsRecords0Meter;
    }

    public PipelineBatchCountMeter getPipelineBatchCountMeter() {
        return pipelineBatchCountMeter;
    }

    public void setPipelineBatchCountMeter(PipelineBatchCountMeter pipelineBatchCountMeter) {
        this.pipelineBatchCountMeter = pipelineBatchCountMeter;
    }

    public PipelineBatchErrorMessagesMeter getPipelineBatchErrorMessagesMeter() {
        return pipelineBatchErrorMessagesMeter;
    }

    public void setPipelineBatchErrorMessagesMeter(PipelineBatchErrorMessagesMeter pipelineBatchErrorMessagesMeter) {
        this.pipelineBatchErrorMessagesMeter = pipelineBatchErrorMessagesMeter;
    }

    public PipelineBatchErrorRecordsMeter getPipelineBatchErrorRecordsMeter() {
        return pipelineBatchErrorRecordsMeter;
    }

    public void setPipelineBatchErrorRecordsMeter(PipelineBatchErrorRecordsMeter pipelineBatchErrorRecordsMeter) {
        this.pipelineBatchErrorRecordsMeter = pipelineBatchErrorRecordsMeter;
    }

    public PipelineBatchInputRecordsMeter getPipelineBatchInputRecordsMeter() {
        return pipelineBatchInputRecordsMeter;
    }

    public void setPipelineBatchInputRecordsMeter(PipelineBatchInputRecordsMeter pipelineBatchInputRecordsMeter) {
        this.pipelineBatchInputRecordsMeter = pipelineBatchInputRecordsMeter;
    }

    public PipelineBatchOutputRecordsMeter getPipelineBatchOutputRecordsMeter() {
        return pipelineBatchOutputRecordsMeter;
    }

    public void setPipelineBatchOutputRecordsMeter(PipelineBatchOutputRecordsMeter pipelineBatchOutputRecordsMeter) {
        this.pipelineBatchOutputRecordsMeter = pipelineBatchOutputRecordsMeter;
    }

    public StageKafkaConsumer01ErrorRecordsMeter getStageKafkaConsumer01ErrorRecordsMeter() {
        return stageKafkaConsumer01ErrorRecordsMeter;
    }

    public void setStageKafkaConsumer01ErrorRecordsMeter(StageKafkaConsumer01ErrorRecordsMeter stageKafkaConsumer01ErrorRecordsMeter) {
        this.stageKafkaConsumer01ErrorRecordsMeter = stageKafkaConsumer01ErrorRecordsMeter;
    }

    public StageKafkaConsumer01InputRecordsMeter getStageKafkaConsumer01InputRecordsMeter() {
        return stageKafkaConsumer01InputRecordsMeter;
    }

    public void setStageKafkaConsumer01InputRecordsMeter(StageKafkaConsumer01InputRecordsMeter stageKafkaConsumer01InputRecordsMeter) {
        this.stageKafkaConsumer01InputRecordsMeter = stageKafkaConsumer01InputRecordsMeter;
    }

    public StageKafkaConsumer01OutputRecordsMeter getStageKafkaConsumer01OutputRecordsMeter() {
        return stageKafkaConsumer01OutputRecordsMeter;
    }

    public void setStageKafkaConsumer01OutputRecordsMeter(StageKafkaConsumer01OutputRecordsMeter stageKafkaConsumer01OutputRecordsMeter) {
        this.stageKafkaConsumer01OutputRecordsMeter = stageKafkaConsumer01OutputRecordsMeter;
    }

    public StageKafkaConsumer01StageErrorsMeter getStageKafkaConsumer01StageErrorsMeter() {
        return stageKafkaConsumer01StageErrorsMeter;
    }

    public void setStageKafkaConsumer01StageErrorsMeter(StageKafkaConsumer01StageErrorsMeter stageKafkaConsumer01StageErrorsMeter) {
        this.stageKafkaConsumer01StageErrorsMeter = stageKafkaConsumer01StageErrorsMeter;
    }

    public StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter getStageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter() {
        return stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter;
    }

    public void setStageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter(StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter) {
        this.stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter = stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsMeter;
    }

    public StageLocalFS01ErrorRecordsMeter getStageLocalFS01ErrorRecordsMeter() {
        return stageLocalFS01ErrorRecordsMeter;
    }

    public void setStageLocalFS01ErrorRecordsMeter(StageLocalFS01ErrorRecordsMeter stageLocalFS01ErrorRecordsMeter) {
        this.stageLocalFS01ErrorRecordsMeter = stageLocalFS01ErrorRecordsMeter;
    }

    public StageLocalFS01InputRecordsMeter getStageLocalFS01InputRecordsMeter() {
        return stageLocalFS01InputRecordsMeter;
    }

    public void setStageLocalFS01InputRecordsMeter(StageLocalFS01InputRecordsMeter stageLocalFS01InputRecordsMeter) {
        this.stageLocalFS01InputRecordsMeter = stageLocalFS01InputRecordsMeter;
    }

    public StageLocalFS01OutputRecordsMeter getStageLocalFS01OutputRecordsMeter() {
        return stageLocalFS01OutputRecordsMeter;
    }

    public void setStageLocalFS01OutputRecordsMeter(StageLocalFS01OutputRecordsMeter stageLocalFS01OutputRecordsMeter) {
        this.stageLocalFS01OutputRecordsMeter = stageLocalFS01OutputRecordsMeter;
    }

    public StageLocalFS01StageErrorsMeter getStageLocalFS01StageErrorsMeter() {
        return stageLocalFS01StageErrorsMeter;
    }

    public void setStageLocalFS01StageErrorsMeter(StageLocalFS01StageErrorsMeter stageLocalFS01StageErrorsMeter) {
        this.stageLocalFS01StageErrorsMeter = stageLocalFS01StageErrorsMeter;
    }

    public StageLocalFS01LocalFS01EventLaneOutputRecordsMeter getStageLocalFS01LocalFS01EventLaneOutputRecordsMeter() {
        return stageLocalFS01LocalFS01EventLaneOutputRecordsMeter;
    }

    public void setStageLocalFS01LocalFS01EventLaneOutputRecordsMeter(StageLocalFS01LocalFS01EventLaneOutputRecordsMeter stageLocalFS01LocalFS01EventLaneOutputRecordsMeter) {
        this.stageLocalFS01LocalFS01EventLaneOutputRecordsMeter = stageLocalFS01LocalFS01EventLaneOutputRecordsMeter;
    }

    public StageLocalFS02ErrorRecordsMeter getStageLocalFS02ErrorRecordsMeter() {
        return stageLocalFS02ErrorRecordsMeter;
    }

    public void setStageLocalFS02ErrorRecordsMeter(StageLocalFS02ErrorRecordsMeter stageLocalFS02ErrorRecordsMeter) {
        this.stageLocalFS02ErrorRecordsMeter = stageLocalFS02ErrorRecordsMeter;
    }

    public StageLocalFS02InputRecordsMeter getStageLocalFS02InputRecordsMeter() {
        return stageLocalFS02InputRecordsMeter;
    }

    public void setStageLocalFS02InputRecordsMeter(StageLocalFS02InputRecordsMeter stageLocalFS02InputRecordsMeter) {
        this.stageLocalFS02InputRecordsMeter = stageLocalFS02InputRecordsMeter;
    }

    public StageLocalFS02OutputRecordsMeter getStageLocalFS02OutputRecordsMeter() {
        return stageLocalFS02OutputRecordsMeter;
    }

    public void setStageLocalFS02OutputRecordsMeter(StageLocalFS02OutputRecordsMeter stageLocalFS02OutputRecordsMeter) {
        this.stageLocalFS02OutputRecordsMeter = stageLocalFS02OutputRecordsMeter;
    }

    public StageLocalFS02StageErrorsMeter getStageLocalFS02StageErrorsMeter() {
        return stageLocalFS02StageErrorsMeter;
    }

    public void setStageLocalFS02StageErrorsMeter(StageLocalFS02StageErrorsMeter stageLocalFS02StageErrorsMeter) {
        this.stageLocalFS02StageErrorsMeter = stageLocalFS02StageErrorsMeter;
    }

}
