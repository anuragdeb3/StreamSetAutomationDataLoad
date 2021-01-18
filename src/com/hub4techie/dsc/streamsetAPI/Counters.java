
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Counters {

    @SerializedName("custom.LocalFS_01.lateRecords.0.counter")
    @Expose
    private CustomLocalFS01LateRecords0Counter customLocalFS01LateRecords0Counter;
    @SerializedName("custom.LocalFS_01.toHdfsRecords.0.counter")
    @Expose
    private CustomLocalFS01ToHdfsRecords0Counter customLocalFS01ToHdfsRecords0Counter;
    @SerializedName("custom.LocalFS_02.lateRecords.0.counter")
    @Expose
    private CustomLocalFS02LateRecords0Counter customLocalFS02LateRecords0Counter;
    @SerializedName("custom.LocalFS_02.toHdfsRecords.0.counter")
    @Expose
    private CustomLocalFS02ToHdfsRecords0Counter customLocalFS02ToHdfsRecords0Counter;
    @SerializedName("pipeline.batchCount.counter")
    @Expose
    private PipelineBatchCountCounter pipelineBatchCountCounter;
    @SerializedName("pipeline.batchErrorMessages.counter")
    @Expose
    private PipelineBatchErrorMessagesCounter pipelineBatchErrorMessagesCounter;
    @SerializedName("pipeline.batchErrorRecords.counter")
    @Expose
    private PipelineBatchErrorRecordsCounter pipelineBatchErrorRecordsCounter;
    @SerializedName("pipeline.batchInputRecords.counter")
    @Expose
    private PipelineBatchInputRecordsCounter pipelineBatchInputRecordsCounter;
    @SerializedName("pipeline.batchOutputRecords.counter")
    @Expose
    private PipelineBatchOutputRecordsCounter pipelineBatchOutputRecordsCounter;
    @SerializedName("stage.KafkaConsumer_01.errorRecords.counter")
    @Expose
    private StageKafkaConsumer01ErrorRecordsCounter stageKafkaConsumer01ErrorRecordsCounter;
    @SerializedName("stage.KafkaConsumer_01.inputRecords.counter")
    @Expose
    private StageKafkaConsumer01InputRecordsCounter stageKafkaConsumer01InputRecordsCounter;
    @SerializedName("stage.KafkaConsumer_01.outputRecords.counter")
    @Expose
    private StageKafkaConsumer01OutputRecordsCounter stageKafkaConsumer01OutputRecordsCounter;
    @SerializedName("stage.KafkaConsumer_01.stageErrors.counter")
    @Expose
    private StageKafkaConsumer01StageErrorsCounter stageKafkaConsumer01StageErrorsCounter;
    @SerializedName("stage.KafkaConsumer_01:KafkaConsumer_01OutputLane15082376325530.outputRecords.counter")
    @Expose
    private StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter;
    @SerializedName("stage.LocalFS_01.errorRecords.counter")
    @Expose
    private StageLocalFS01ErrorRecordsCounter stageLocalFS01ErrorRecordsCounter;
    @SerializedName("stage.LocalFS_01.inputRecords.counter")
    @Expose
    private StageLocalFS01InputRecordsCounter stageLocalFS01InputRecordsCounter;
    @SerializedName("stage.LocalFS_01.outputRecords.counter")
    @Expose
    private StageLocalFS01OutputRecordsCounter stageLocalFS01OutputRecordsCounter;
    @SerializedName("stage.LocalFS_01.stageErrors.counter")
    @Expose
    private StageLocalFS01StageErrorsCounter stageLocalFS01StageErrorsCounter;
    @SerializedName("stage.LocalFS_01:LocalFS_01_EventLane.outputRecords.counter")
    @Expose
    private StageLocalFS01LocalFS01EventLaneOutputRecordsCounter stageLocalFS01LocalFS01EventLaneOutputRecordsCounter;
    @SerializedName("stage.LocalFS_02.errorRecords.counter")
    @Expose
    private StageLocalFS02ErrorRecordsCounter stageLocalFS02ErrorRecordsCounter;
    @SerializedName("stage.LocalFS_02.inputRecords.counter")
    @Expose
    private StageLocalFS02InputRecordsCounter stageLocalFS02InputRecordsCounter;
    @SerializedName("stage.LocalFS_02.outputRecords.counter")
    @Expose
    private StageLocalFS02OutputRecordsCounter stageLocalFS02OutputRecordsCounter;
    @SerializedName("stage.LocalFS_02.stageErrors.counter")
    @Expose
    private StageLocalFS02StageErrorsCounter stageLocalFS02StageErrorsCounter;

    public CustomLocalFS01LateRecords0Counter getCustomLocalFS01LateRecords0Counter() {
        return customLocalFS01LateRecords0Counter;
    }

    public void setCustomLocalFS01LateRecords0Counter(CustomLocalFS01LateRecords0Counter customLocalFS01LateRecords0Counter) {
        this.customLocalFS01LateRecords0Counter = customLocalFS01LateRecords0Counter;
    }

    public CustomLocalFS01ToHdfsRecords0Counter getCustomLocalFS01ToHdfsRecords0Counter() {
        return customLocalFS01ToHdfsRecords0Counter;
    }

    public void setCustomLocalFS01ToHdfsRecords0Counter(CustomLocalFS01ToHdfsRecords0Counter customLocalFS01ToHdfsRecords0Counter) {
        this.customLocalFS01ToHdfsRecords0Counter = customLocalFS01ToHdfsRecords0Counter;
    }

    public CustomLocalFS02LateRecords0Counter getCustomLocalFS02LateRecords0Counter() {
        return customLocalFS02LateRecords0Counter;
    }

    public void setCustomLocalFS02LateRecords0Counter(CustomLocalFS02LateRecords0Counter customLocalFS02LateRecords0Counter) {
        this.customLocalFS02LateRecords0Counter = customLocalFS02LateRecords0Counter;
    }

    public CustomLocalFS02ToHdfsRecords0Counter getCustomLocalFS02ToHdfsRecords0Counter() {
        return customLocalFS02ToHdfsRecords0Counter;
    }

    public void setCustomLocalFS02ToHdfsRecords0Counter(CustomLocalFS02ToHdfsRecords0Counter customLocalFS02ToHdfsRecords0Counter) {
        this.customLocalFS02ToHdfsRecords0Counter = customLocalFS02ToHdfsRecords0Counter;
    }

    public PipelineBatchCountCounter getPipelineBatchCountCounter() {
        return pipelineBatchCountCounter;
    }

    public void setPipelineBatchCountCounter(PipelineBatchCountCounter pipelineBatchCountCounter) {
        this.pipelineBatchCountCounter = pipelineBatchCountCounter;
    }

    public PipelineBatchErrorMessagesCounter getPipelineBatchErrorMessagesCounter() {
        return pipelineBatchErrorMessagesCounter;
    }

    public void setPipelineBatchErrorMessagesCounter(PipelineBatchErrorMessagesCounter pipelineBatchErrorMessagesCounter) {
        this.pipelineBatchErrorMessagesCounter = pipelineBatchErrorMessagesCounter;
    }

    public PipelineBatchErrorRecordsCounter getPipelineBatchErrorRecordsCounter() {
        return pipelineBatchErrorRecordsCounter;
    }

    public void setPipelineBatchErrorRecordsCounter(PipelineBatchErrorRecordsCounter pipelineBatchErrorRecordsCounter) {
        this.pipelineBatchErrorRecordsCounter = pipelineBatchErrorRecordsCounter;
    }

    public PipelineBatchInputRecordsCounter getPipelineBatchInputRecordsCounter() {
        return pipelineBatchInputRecordsCounter;
    }

    public void setPipelineBatchInputRecordsCounter(PipelineBatchInputRecordsCounter pipelineBatchInputRecordsCounter) {
        this.pipelineBatchInputRecordsCounter = pipelineBatchInputRecordsCounter;
    }

    public PipelineBatchOutputRecordsCounter getPipelineBatchOutputRecordsCounter() {
        return pipelineBatchOutputRecordsCounter;
    }

    public void setPipelineBatchOutputRecordsCounter(PipelineBatchOutputRecordsCounter pipelineBatchOutputRecordsCounter) {
        this.pipelineBatchOutputRecordsCounter = pipelineBatchOutputRecordsCounter;
    }

    public StageKafkaConsumer01ErrorRecordsCounter getStageKafkaConsumer01ErrorRecordsCounter() {
        return stageKafkaConsumer01ErrorRecordsCounter;
    }

    public void setStageKafkaConsumer01ErrorRecordsCounter(StageKafkaConsumer01ErrorRecordsCounter stageKafkaConsumer01ErrorRecordsCounter) {
        this.stageKafkaConsumer01ErrorRecordsCounter = stageKafkaConsumer01ErrorRecordsCounter;
    }

    public StageKafkaConsumer01InputRecordsCounter getStageKafkaConsumer01InputRecordsCounter() {
        return stageKafkaConsumer01InputRecordsCounter;
    }

    public void setStageKafkaConsumer01InputRecordsCounter(StageKafkaConsumer01InputRecordsCounter stageKafkaConsumer01InputRecordsCounter) {
        this.stageKafkaConsumer01InputRecordsCounter = stageKafkaConsumer01InputRecordsCounter;
    }

    public StageKafkaConsumer01OutputRecordsCounter getStageKafkaConsumer01OutputRecordsCounter() {
        return stageKafkaConsumer01OutputRecordsCounter;
    }

    public void setStageKafkaConsumer01OutputRecordsCounter(StageKafkaConsumer01OutputRecordsCounter stageKafkaConsumer01OutputRecordsCounter) {
        this.stageKafkaConsumer01OutputRecordsCounter = stageKafkaConsumer01OutputRecordsCounter;
    }

    public StageKafkaConsumer01StageErrorsCounter getStageKafkaConsumer01StageErrorsCounter() {
        return stageKafkaConsumer01StageErrorsCounter;
    }

    public void setStageKafkaConsumer01StageErrorsCounter(StageKafkaConsumer01StageErrorsCounter stageKafkaConsumer01StageErrorsCounter) {
        this.stageKafkaConsumer01StageErrorsCounter = stageKafkaConsumer01StageErrorsCounter;
    }

    public StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter getStageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter() {
        return stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter;
    }

    public void setStageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter(StageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter) {
        this.stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter = stageKafkaConsumer01KafkaConsumer01OutputLane15082376325530OutputRecordsCounter;
    }

    public StageLocalFS01ErrorRecordsCounter getStageLocalFS01ErrorRecordsCounter() {
        return stageLocalFS01ErrorRecordsCounter;
    }

    public void setStageLocalFS01ErrorRecordsCounter(StageLocalFS01ErrorRecordsCounter stageLocalFS01ErrorRecordsCounter) {
        this.stageLocalFS01ErrorRecordsCounter = stageLocalFS01ErrorRecordsCounter;
    }

    public StageLocalFS01InputRecordsCounter getStageLocalFS01InputRecordsCounter() {
        return stageLocalFS01InputRecordsCounter;
    }

    public void setStageLocalFS01InputRecordsCounter(StageLocalFS01InputRecordsCounter stageLocalFS01InputRecordsCounter) {
        this.stageLocalFS01InputRecordsCounter = stageLocalFS01InputRecordsCounter;
    }

    public StageLocalFS01OutputRecordsCounter getStageLocalFS01OutputRecordsCounter() {
        return stageLocalFS01OutputRecordsCounter;
    }

    public void setStageLocalFS01OutputRecordsCounter(StageLocalFS01OutputRecordsCounter stageLocalFS01OutputRecordsCounter) {
        this.stageLocalFS01OutputRecordsCounter = stageLocalFS01OutputRecordsCounter;
    }

    public StageLocalFS01StageErrorsCounter getStageLocalFS01StageErrorsCounter() {
        return stageLocalFS01StageErrorsCounter;
    }

    public void setStageLocalFS01StageErrorsCounter(StageLocalFS01StageErrorsCounter stageLocalFS01StageErrorsCounter) {
        this.stageLocalFS01StageErrorsCounter = stageLocalFS01StageErrorsCounter;
    }

    public StageLocalFS01LocalFS01EventLaneOutputRecordsCounter getStageLocalFS01LocalFS01EventLaneOutputRecordsCounter() {
        return stageLocalFS01LocalFS01EventLaneOutputRecordsCounter;
    }

    public void setStageLocalFS01LocalFS01EventLaneOutputRecordsCounter(StageLocalFS01LocalFS01EventLaneOutputRecordsCounter stageLocalFS01LocalFS01EventLaneOutputRecordsCounter) {
        this.stageLocalFS01LocalFS01EventLaneOutputRecordsCounter = stageLocalFS01LocalFS01EventLaneOutputRecordsCounter;
    }

    public StageLocalFS02ErrorRecordsCounter getStageLocalFS02ErrorRecordsCounter() {
        return stageLocalFS02ErrorRecordsCounter;
    }

    public void setStageLocalFS02ErrorRecordsCounter(StageLocalFS02ErrorRecordsCounter stageLocalFS02ErrorRecordsCounter) {
        this.stageLocalFS02ErrorRecordsCounter = stageLocalFS02ErrorRecordsCounter;
    }

    public StageLocalFS02InputRecordsCounter getStageLocalFS02InputRecordsCounter() {
        return stageLocalFS02InputRecordsCounter;
    }

    public void setStageLocalFS02InputRecordsCounter(StageLocalFS02InputRecordsCounter stageLocalFS02InputRecordsCounter) {
        this.stageLocalFS02InputRecordsCounter = stageLocalFS02InputRecordsCounter;
    }

    public StageLocalFS02OutputRecordsCounter getStageLocalFS02OutputRecordsCounter() {
        return stageLocalFS02OutputRecordsCounter;
    }

    public void setStageLocalFS02OutputRecordsCounter(StageLocalFS02OutputRecordsCounter stageLocalFS02OutputRecordsCounter) {
        this.stageLocalFS02OutputRecordsCounter = stageLocalFS02OutputRecordsCounter;
    }

    public StageLocalFS02StageErrorsCounter getStageLocalFS02StageErrorsCounter() {
        return stageLocalFS02StageErrorsCounter;
    }

    public void setStageLocalFS02StageErrorsCounter(StageLocalFS02StageErrorsCounter stageLocalFS02StageErrorsCounter) {
        this.stageLocalFS02StageErrorsCounter = stageLocalFS02StageErrorsCounter;
    }

}
