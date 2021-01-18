
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Timers {

    @SerializedName("pipeline.batchProcessing.timer")
    @Expose
    private PipelineBatchProcessingTimer pipelineBatchProcessingTimer;
    @SerializedName("stage.KafkaConsumer_01.batchProcessing.timer")
    @Expose
    private StageKafkaConsumer01BatchProcessingTimer stageKafkaConsumer01BatchProcessingTimer;
    @SerializedName("stage.LocalFS_01.batchProcessing.timer")
    @Expose
    private StageLocalFS01BatchProcessingTimer stageLocalFS01BatchProcessingTimer;
    @SerializedName("stage.LocalFS_02.batchProcessing.timer")
    @Expose
    private StageLocalFS02BatchProcessingTimer stageLocalFS02BatchProcessingTimer;

    public PipelineBatchProcessingTimer getPipelineBatchProcessingTimer() {
        return pipelineBatchProcessingTimer;
    }

    public void setPipelineBatchProcessingTimer(PipelineBatchProcessingTimer pipelineBatchProcessingTimer) {
        this.pipelineBatchProcessingTimer = pipelineBatchProcessingTimer;
    }

    public StageKafkaConsumer01BatchProcessingTimer getStageKafkaConsumer01BatchProcessingTimer() {
        return stageKafkaConsumer01BatchProcessingTimer;
    }

    public void setStageKafkaConsumer01BatchProcessingTimer(StageKafkaConsumer01BatchProcessingTimer stageKafkaConsumer01BatchProcessingTimer) {
        this.stageKafkaConsumer01BatchProcessingTimer = stageKafkaConsumer01BatchProcessingTimer;
    }

    public StageLocalFS01BatchProcessingTimer getStageLocalFS01BatchProcessingTimer() {
        return stageLocalFS01BatchProcessingTimer;
    }

    public void setStageLocalFS01BatchProcessingTimer(StageLocalFS01BatchProcessingTimer stageLocalFS01BatchProcessingTimer) {
        this.stageLocalFS01BatchProcessingTimer = stageLocalFS01BatchProcessingTimer;
    }

    public StageLocalFS02BatchProcessingTimer getStageLocalFS02BatchProcessingTimer() {
        return stageLocalFS02BatchProcessingTimer;
    }

    public void setStageLocalFS02BatchProcessingTimer(StageLocalFS02BatchProcessingTimer stageLocalFS02BatchProcessingTimer) {
        this.stageLocalFS02BatchProcessingTimer = stageLocalFS02BatchProcessingTimer;
    }

}
