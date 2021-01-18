
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Histograms {

    @SerializedName("custom.KafkaConsumer_01.Rebalance Time.0.histogramM5")
    @Expose
    private CustomKafkaConsumer01RebalanceTime0HistogramM5 customKafkaConsumer01RebalanceTime0HistogramM5;
    @SerializedName("pipeline.errorRecordsPerBatch.histogramM5")
    @Expose
    private PipelineErrorRecordsPerBatchHistogramM5 pipelineErrorRecordsPerBatchHistogramM5;
    @SerializedName("pipeline.errorsPerBatch.histogramM5")
    @Expose
    private PipelineErrorsPerBatchHistogramM5 pipelineErrorsPerBatchHistogramM5;
    @SerializedName("pipeline.inputRecordsPerBatch.histogramM5")
    @Expose
    private PipelineInputRecordsPerBatchHistogramM5 pipelineInputRecordsPerBatchHistogramM5;
    @SerializedName("pipeline.outputRecordsPerBatch.histogramM5")
    @Expose
    private PipelineOutputRecordsPerBatchHistogramM5 pipelineOutputRecordsPerBatchHistogramM5;
    @SerializedName("pipeline.runners.histogramM5")
    @Expose
    private PipelineRunnersHistogramM5 pipelineRunnersHistogramM5;
    @SerializedName("stage.KafkaConsumer_01.errorRecords.histogramM5")
    @Expose
    private StageKafkaConsumer01ErrorRecordsHistogramM5 stageKafkaConsumer01ErrorRecordsHistogramM5;
    @SerializedName("stage.KafkaConsumer_01.inputRecords.histogramM5")
    @Expose
    private StageKafkaConsumer01InputRecordsHistogramM5 stageKafkaConsumer01InputRecordsHistogramM5;
    @SerializedName("stage.KafkaConsumer_01.outputRecords.histogramM5")
    @Expose
    private StageKafkaConsumer01OutputRecordsHistogramM5 stageKafkaConsumer01OutputRecordsHistogramM5;
    @SerializedName("stage.KafkaConsumer_01.stageErrors.histogramM5")
    @Expose
    private StageKafkaConsumer01StageErrorsHistogramM5 stageKafkaConsumer01StageErrorsHistogramM5;
    @SerializedName("stage.LocalFS_01.errorRecords.histogramM5")
    @Expose
    private StageLocalFS01ErrorRecordsHistogramM5 stageLocalFS01ErrorRecordsHistogramM5;
    @SerializedName("stage.LocalFS_01.inputRecords.histogramM5")
    @Expose
    private StageLocalFS01InputRecordsHistogramM5 stageLocalFS01InputRecordsHistogramM5;
    @SerializedName("stage.LocalFS_01.outputRecords.histogramM5")
    @Expose
    private StageLocalFS01OutputRecordsHistogramM5 stageLocalFS01OutputRecordsHistogramM5;
    @SerializedName("stage.LocalFS_01.stageErrors.histogramM5")
    @Expose
    private StageLocalFS01StageErrorsHistogramM5 stageLocalFS01StageErrorsHistogramM5;
    @SerializedName("stage.LocalFS_02.errorRecords.histogramM5")
    @Expose
    private StageLocalFS02ErrorRecordsHistogramM5 stageLocalFS02ErrorRecordsHistogramM5;
    @SerializedName("stage.LocalFS_02.inputRecords.histogramM5")
    @Expose
    private StageLocalFS02InputRecordsHistogramM5 stageLocalFS02InputRecordsHistogramM5;
    @SerializedName("stage.LocalFS_02.outputRecords.histogramM5")
    @Expose
    private StageLocalFS02OutputRecordsHistogramM5 stageLocalFS02OutputRecordsHistogramM5;
    @SerializedName("stage.LocalFS_02.stageErrors.histogramM5")
    @Expose
    private StageLocalFS02StageErrorsHistogramM5 stageLocalFS02StageErrorsHistogramM5;

    public CustomKafkaConsumer01RebalanceTime0HistogramM5 getCustomKafkaConsumer01RebalanceTime0HistogramM5() {
        return customKafkaConsumer01RebalanceTime0HistogramM5;
    }

    public void setCustomKafkaConsumer01RebalanceTime0HistogramM5(CustomKafkaConsumer01RebalanceTime0HistogramM5 customKafkaConsumer01RebalanceTime0HistogramM5) {
        this.customKafkaConsumer01RebalanceTime0HistogramM5 = customKafkaConsumer01RebalanceTime0HistogramM5;
    }

    public PipelineErrorRecordsPerBatchHistogramM5 getPipelineErrorRecordsPerBatchHistogramM5() {
        return pipelineErrorRecordsPerBatchHistogramM5;
    }

    public void setPipelineErrorRecordsPerBatchHistogramM5(PipelineErrorRecordsPerBatchHistogramM5 pipelineErrorRecordsPerBatchHistogramM5) {
        this.pipelineErrorRecordsPerBatchHistogramM5 = pipelineErrorRecordsPerBatchHistogramM5;
    }

    public PipelineErrorsPerBatchHistogramM5 getPipelineErrorsPerBatchHistogramM5() {
        return pipelineErrorsPerBatchHistogramM5;
    }

    public void setPipelineErrorsPerBatchHistogramM5(PipelineErrorsPerBatchHistogramM5 pipelineErrorsPerBatchHistogramM5) {
        this.pipelineErrorsPerBatchHistogramM5 = pipelineErrorsPerBatchHistogramM5;
    }

    public PipelineInputRecordsPerBatchHistogramM5 getPipelineInputRecordsPerBatchHistogramM5() {
        return pipelineInputRecordsPerBatchHistogramM5;
    }

    public void setPipelineInputRecordsPerBatchHistogramM5(PipelineInputRecordsPerBatchHistogramM5 pipelineInputRecordsPerBatchHistogramM5) {
        this.pipelineInputRecordsPerBatchHistogramM5 = pipelineInputRecordsPerBatchHistogramM5;
    }

    public PipelineOutputRecordsPerBatchHistogramM5 getPipelineOutputRecordsPerBatchHistogramM5() {
        return pipelineOutputRecordsPerBatchHistogramM5;
    }

    public void setPipelineOutputRecordsPerBatchHistogramM5(PipelineOutputRecordsPerBatchHistogramM5 pipelineOutputRecordsPerBatchHistogramM5) {
        this.pipelineOutputRecordsPerBatchHistogramM5 = pipelineOutputRecordsPerBatchHistogramM5;
    }

    public PipelineRunnersHistogramM5 getPipelineRunnersHistogramM5() {
        return pipelineRunnersHistogramM5;
    }

    public void setPipelineRunnersHistogramM5(PipelineRunnersHistogramM5 pipelineRunnersHistogramM5) {
        this.pipelineRunnersHistogramM5 = pipelineRunnersHistogramM5;
    }

    public StageKafkaConsumer01ErrorRecordsHistogramM5 getStageKafkaConsumer01ErrorRecordsHistogramM5() {
        return stageKafkaConsumer01ErrorRecordsHistogramM5;
    }

    public void setStageKafkaConsumer01ErrorRecordsHistogramM5(StageKafkaConsumer01ErrorRecordsHistogramM5 stageKafkaConsumer01ErrorRecordsHistogramM5) {
        this.stageKafkaConsumer01ErrorRecordsHistogramM5 = stageKafkaConsumer01ErrorRecordsHistogramM5;
    }

    public StageKafkaConsumer01InputRecordsHistogramM5 getStageKafkaConsumer01InputRecordsHistogramM5() {
        return stageKafkaConsumer01InputRecordsHistogramM5;
    }

    public void setStageKafkaConsumer01InputRecordsHistogramM5(StageKafkaConsumer01InputRecordsHistogramM5 stageKafkaConsumer01InputRecordsHistogramM5) {
        this.stageKafkaConsumer01InputRecordsHistogramM5 = stageKafkaConsumer01InputRecordsHistogramM5;
    }

    public StageKafkaConsumer01OutputRecordsHistogramM5 getStageKafkaConsumer01OutputRecordsHistogramM5() {
        return stageKafkaConsumer01OutputRecordsHistogramM5;
    }

    public void setStageKafkaConsumer01OutputRecordsHistogramM5(StageKafkaConsumer01OutputRecordsHistogramM5 stageKafkaConsumer01OutputRecordsHistogramM5) {
        this.stageKafkaConsumer01OutputRecordsHistogramM5 = stageKafkaConsumer01OutputRecordsHistogramM5;
    }

    public StageKafkaConsumer01StageErrorsHistogramM5 getStageKafkaConsumer01StageErrorsHistogramM5() {
        return stageKafkaConsumer01StageErrorsHistogramM5;
    }

    public void setStageKafkaConsumer01StageErrorsHistogramM5(StageKafkaConsumer01StageErrorsHistogramM5 stageKafkaConsumer01StageErrorsHistogramM5) {
        this.stageKafkaConsumer01StageErrorsHistogramM5 = stageKafkaConsumer01StageErrorsHistogramM5;
    }

    public StageLocalFS01ErrorRecordsHistogramM5 getStageLocalFS01ErrorRecordsHistogramM5() {
        return stageLocalFS01ErrorRecordsHistogramM5;
    }

    public void setStageLocalFS01ErrorRecordsHistogramM5(StageLocalFS01ErrorRecordsHistogramM5 stageLocalFS01ErrorRecordsHistogramM5) {
        this.stageLocalFS01ErrorRecordsHistogramM5 = stageLocalFS01ErrorRecordsHistogramM5;
    }

    public StageLocalFS01InputRecordsHistogramM5 getStageLocalFS01InputRecordsHistogramM5() {
        return stageLocalFS01InputRecordsHistogramM5;
    }

    public void setStageLocalFS01InputRecordsHistogramM5(StageLocalFS01InputRecordsHistogramM5 stageLocalFS01InputRecordsHistogramM5) {
        this.stageLocalFS01InputRecordsHistogramM5 = stageLocalFS01InputRecordsHistogramM5;
    }

    public StageLocalFS01OutputRecordsHistogramM5 getStageLocalFS01OutputRecordsHistogramM5() {
        return stageLocalFS01OutputRecordsHistogramM5;
    }

    public void setStageLocalFS01OutputRecordsHistogramM5(StageLocalFS01OutputRecordsHistogramM5 stageLocalFS01OutputRecordsHistogramM5) {
        this.stageLocalFS01OutputRecordsHistogramM5 = stageLocalFS01OutputRecordsHistogramM5;
    }

    public StageLocalFS01StageErrorsHistogramM5 getStageLocalFS01StageErrorsHistogramM5() {
        return stageLocalFS01StageErrorsHistogramM5;
    }

    public void setStageLocalFS01StageErrorsHistogramM5(StageLocalFS01StageErrorsHistogramM5 stageLocalFS01StageErrorsHistogramM5) {
        this.stageLocalFS01StageErrorsHistogramM5 = stageLocalFS01StageErrorsHistogramM5;
    }

    public StageLocalFS02ErrorRecordsHistogramM5 getStageLocalFS02ErrorRecordsHistogramM5() {
        return stageLocalFS02ErrorRecordsHistogramM5;
    }

    public void setStageLocalFS02ErrorRecordsHistogramM5(StageLocalFS02ErrorRecordsHistogramM5 stageLocalFS02ErrorRecordsHistogramM5) {
        this.stageLocalFS02ErrorRecordsHistogramM5 = stageLocalFS02ErrorRecordsHistogramM5;
    }

    public StageLocalFS02InputRecordsHistogramM5 getStageLocalFS02InputRecordsHistogramM5() {
        return stageLocalFS02InputRecordsHistogramM5;
    }

    public void setStageLocalFS02InputRecordsHistogramM5(StageLocalFS02InputRecordsHistogramM5 stageLocalFS02InputRecordsHistogramM5) {
        this.stageLocalFS02InputRecordsHistogramM5 = stageLocalFS02InputRecordsHistogramM5;
    }

    public StageLocalFS02OutputRecordsHistogramM5 getStageLocalFS02OutputRecordsHistogramM5() {
        return stageLocalFS02OutputRecordsHistogramM5;
    }

    public void setStageLocalFS02OutputRecordsHistogramM5(StageLocalFS02OutputRecordsHistogramM5 stageLocalFS02OutputRecordsHistogramM5) {
        this.stageLocalFS02OutputRecordsHistogramM5 = stageLocalFS02OutputRecordsHistogramM5;
    }

    public StageLocalFS02StageErrorsHistogramM5 getStageLocalFS02StageErrorsHistogramM5() {
        return stageLocalFS02StageErrorsHistogramM5;
    }

    public void setStageLocalFS02StageErrorsHistogramM5(StageLocalFS02StageErrorsHistogramM5 stageLocalFS02StageErrorsHistogramM5) {
        this.stageLocalFS02StageErrorsHistogramM5 = stageLocalFS02StageErrorsHistogramM5;
    }

}
