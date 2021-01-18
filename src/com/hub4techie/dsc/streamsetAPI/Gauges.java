
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Gauges {

    @SerializedName("RuntimeStatsGauge.gauge")
    @Expose
    private RuntimeStatsGaugeGauge runtimeStatsGaugeGauge;
    @SerializedName("custom.KafkaConsumer_01.Internal state.0.gauge")
    @Expose
    private CustomKafkaConsumer01InternalState0Gauge customKafkaConsumer01InternalState0Gauge;
    @SerializedName("health.DataObserverRunnable.gauge")
    @Expose
    private HealthDataObserverRunnableGauge healthDataObserverRunnableGauge;
    @SerializedName("health.MetricObserverRunnable.gauge")
    @Expose
    private HealthMetricObserverRunnableGauge healthMetricObserverRunnableGauge;
    @SerializedName("health.MetricsEventRunnable.gauge")
    @Expose
    private HealthMetricsEventRunnableGauge healthMetricsEventRunnableGauge;
    @SerializedName("health.ProductionPipelineRunnable.gauge")
    @Expose
    private HealthProductionPipelineRunnableGauge healthProductionPipelineRunnableGauge;
    @SerializedName("health.RulesConfigLoaderRunnable.gauge")
    @Expose
    private HealthRulesConfigLoaderRunnableGauge healthRulesConfigLoaderRunnableGauge;
    @SerializedName("jvm.buffers.direct.capacity")
    @Expose
    private JvmBuffersDirectCapacity jvmBuffersDirectCapacity;
    @SerializedName("jvm.buffers.direct.count")
    @Expose
    private JvmBuffersDirectCount jvmBuffersDirectCount;
    @SerializedName("jvm.buffers.direct.used")
    @Expose
    private JvmBuffersDirectUsed jvmBuffersDirectUsed;
    @SerializedName("jvm.buffers.mapped.capacity")
    @Expose
    private JvmBuffersMappedCapacity jvmBuffersMappedCapacity;
    @SerializedName("jvm.buffers.mapped.count")
    @Expose
    private JvmBuffersMappedCount jvmBuffersMappedCount;
    @SerializedName("jvm.buffers.mapped.used")
    @Expose
    private JvmBuffersMappedUsed jvmBuffersMappedUsed;
    @SerializedName("jvm.files")
    @Expose
    private JvmFiles jvmFiles;
    @SerializedName("jvm.garbage.G1-Old-Generation.count")
    @Expose
    private JvmGarbageG1OldGenerationCount jvmGarbageG1OldGenerationCount;
    @SerializedName("jvm.garbage.G1-Old-Generation.time")
    @Expose
    private JvmGarbageG1OldGenerationTime jvmGarbageG1OldGenerationTime;
    @SerializedName("jvm.garbage.G1-Young-Generation.count")
    @Expose
    private JvmGarbageG1YoungGenerationCount jvmGarbageG1YoungGenerationCount;
    @SerializedName("jvm.garbage.G1-Young-Generation.time")
    @Expose
    private JvmGarbageG1YoungGenerationTime jvmGarbageG1YoungGenerationTime;
    @SerializedName("jvm.memory.heap.committed")
    @Expose
    private JvmMemoryHeapCommitted jvmMemoryHeapCommitted;
    @SerializedName("jvm.memory.heap.init")
    @Expose
    private JvmMemoryHeapInit jvmMemoryHeapInit;
    @SerializedName("jvm.memory.heap.max")
    @Expose
    private JvmMemoryHeapMax jvmMemoryHeapMax;
    @SerializedName("jvm.memory.heap.usage")
    @Expose
    private JvmMemoryHeapUsage jvmMemoryHeapUsage;
    @SerializedName("jvm.memory.heap.used")
    @Expose
    private JvmMemoryHeapUsed jvmMemoryHeapUsed;
    @SerializedName("jvm.memory.non-heap.committed")
    @Expose
    private JvmMemoryNonHeapCommitted jvmMemoryNonHeapCommitted;
    @SerializedName("jvm.memory.non-heap.init")
    @Expose
    private JvmMemoryNonHeapInit jvmMemoryNonHeapInit;
    @SerializedName("jvm.memory.non-heap.max")
    @Expose
    private JvmMemoryNonHeapMax jvmMemoryNonHeapMax;
    @SerializedName("jvm.memory.non-heap.usage")
    @Expose
    private JvmMemoryNonHeapUsage jvmMemoryNonHeapUsage;
    @SerializedName("jvm.memory.non-heap.used")
    @Expose
    private JvmMemoryNonHeapUsed jvmMemoryNonHeapUsed;
    @SerializedName("jvm.memory.pools.Code-Cache.committed")
    @Expose
    private JvmMemoryPoolsCodeCacheCommitted jvmMemoryPoolsCodeCacheCommitted;
    @SerializedName("jvm.memory.pools.Code-Cache.init")
    @Expose
    private JvmMemoryPoolsCodeCacheInit jvmMemoryPoolsCodeCacheInit;
    @SerializedName("jvm.memory.pools.Code-Cache.max")
    @Expose
    private JvmMemoryPoolsCodeCacheMax jvmMemoryPoolsCodeCacheMax;
    @SerializedName("jvm.memory.pools.Code-Cache.usage")
    @Expose
    private JvmMemoryPoolsCodeCacheUsage jvmMemoryPoolsCodeCacheUsage;
    @SerializedName("jvm.memory.pools.Code-Cache.used")
    @Expose
    private JvmMemoryPoolsCodeCacheUsed jvmMemoryPoolsCodeCacheUsed;
    @SerializedName("jvm.memory.pools.Compressed-Class-Space.committed")
    @Expose
    private JvmMemoryPoolsCompressedClassSpaceCommitted jvmMemoryPoolsCompressedClassSpaceCommitted;
    @SerializedName("jvm.memory.pools.Compressed-Class-Space.init")
    @Expose
    private JvmMemoryPoolsCompressedClassSpaceInit jvmMemoryPoolsCompressedClassSpaceInit;
    @SerializedName("jvm.memory.pools.Compressed-Class-Space.max")
    @Expose
    private JvmMemoryPoolsCompressedClassSpaceMax jvmMemoryPoolsCompressedClassSpaceMax;
    @SerializedName("jvm.memory.pools.Compressed-Class-Space.usage")
    @Expose
    private JvmMemoryPoolsCompressedClassSpaceUsage jvmMemoryPoolsCompressedClassSpaceUsage;
    @SerializedName("jvm.memory.pools.Compressed-Class-Space.used")
    @Expose
    private JvmMemoryPoolsCompressedClassSpaceUsed jvmMemoryPoolsCompressedClassSpaceUsed;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.committed")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceCommitted jvmMemoryPoolsG1EdenSpaceCommitted;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.init")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceInit jvmMemoryPoolsG1EdenSpaceInit;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.max")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceMax jvmMemoryPoolsG1EdenSpaceMax;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.usage")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceUsage jvmMemoryPoolsG1EdenSpaceUsage;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.used")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceUsed jvmMemoryPoolsG1EdenSpaceUsed;
    @SerializedName("jvm.memory.pools.G1-Eden-Space.used-after-gc")
    @Expose
    private JvmMemoryPoolsG1EdenSpaceUsedAfterGc jvmMemoryPoolsG1EdenSpaceUsedAfterGc;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.committed")
    @Expose
    private JvmMemoryPoolsG1OldGenCommitted jvmMemoryPoolsG1OldGenCommitted;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.init")
    @Expose
    private JvmMemoryPoolsG1OldGenInit jvmMemoryPoolsG1OldGenInit;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.max")
    @Expose
    private JvmMemoryPoolsG1OldGenMax jvmMemoryPoolsG1OldGenMax;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.usage")
    @Expose
    private JvmMemoryPoolsG1OldGenUsage jvmMemoryPoolsG1OldGenUsage;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.used")
    @Expose
    private JvmMemoryPoolsG1OldGenUsed jvmMemoryPoolsG1OldGenUsed;
    @SerializedName("jvm.memory.pools.G1-Old-Gen.used-after-gc")
    @Expose
    private JvmMemoryPoolsG1OldGenUsedAfterGc jvmMemoryPoolsG1OldGenUsedAfterGc;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.committed")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceCommitted jvmMemoryPoolsG1SurvivorSpaceCommitted;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.init")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceInit jvmMemoryPoolsG1SurvivorSpaceInit;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.max")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceMax jvmMemoryPoolsG1SurvivorSpaceMax;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.usage")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceUsage jvmMemoryPoolsG1SurvivorSpaceUsage;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.used")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceUsed jvmMemoryPoolsG1SurvivorSpaceUsed;
    @SerializedName("jvm.memory.pools.G1-Survivor-Space.used-after-gc")
    @Expose
    private JvmMemoryPoolsG1SurvivorSpaceUsedAfterGc jvmMemoryPoolsG1SurvivorSpaceUsedAfterGc;
    @SerializedName("jvm.memory.pools.Metaspace.committed")
    @Expose
    private JvmMemoryPoolsMetaspaceCommitted jvmMemoryPoolsMetaspaceCommitted;
    @SerializedName("jvm.memory.pools.Metaspace.init")
    @Expose
    private JvmMemoryPoolsMetaspaceInit jvmMemoryPoolsMetaspaceInit;
    @SerializedName("jvm.memory.pools.Metaspace.max")
    @Expose
    private JvmMemoryPoolsMetaspaceMax jvmMemoryPoolsMetaspaceMax;
    @SerializedName("jvm.memory.pools.Metaspace.usage")
    @Expose
    private JvmMemoryPoolsMetaspaceUsage jvmMemoryPoolsMetaspaceUsage;
    @SerializedName("jvm.memory.pools.Metaspace.used")
    @Expose
    private JvmMemoryPoolsMetaspaceUsed jvmMemoryPoolsMetaspaceUsed;
    @SerializedName("jvm.memory.total.committed")
    @Expose
    private JvmMemoryTotalCommitted jvmMemoryTotalCommitted;
    @SerializedName("jvm.memory.total.init")
    @Expose
    private JvmMemoryTotalInit jvmMemoryTotalInit;
    @SerializedName("jvm.memory.total.max")
    @Expose
    private JvmMemoryTotalMax jvmMemoryTotalMax;
    @SerializedName("jvm.memory.total.used")
    @Expose
    private JvmMemoryTotalUsed jvmMemoryTotalUsed;
    @SerializedName("jvm.threads.blocked.count")
    @Expose
    private JvmThreadsBlockedCount jvmThreadsBlockedCount;
    @SerializedName("jvm.threads.count")
    @Expose
    private JvmThreadsCount jvmThreadsCount;
    @SerializedName("jvm.threads.daemon.count")
    @Expose
    private JvmThreadsDaemonCount jvmThreadsDaemonCount;
    @SerializedName("jvm.threads.deadlock.count")
    @Expose
    private JvmThreadsDeadlockCount jvmThreadsDeadlockCount;
    @SerializedName("jvm.threads.deadlocks")
    @Expose
    private JvmThreadsDeadlocks jvmThreadsDeadlocks;
    @SerializedName("jvm.threads.new.count")
    @Expose
    private JvmThreadsNewCount jvmThreadsNewCount;
    @SerializedName("jvm.threads.runnable.count")
    @Expose
    private JvmThreadsRunnableCount jvmThreadsRunnableCount;
    @SerializedName("jvm.threads.terminated.count")
    @Expose
    private JvmThreadsTerminatedCount jvmThreadsTerminatedCount;
    @SerializedName("jvm.threads.timed_waiting.count")
    @Expose
    private JvmThreadsTimedWaitingCount jvmThreadsTimedWaitingCount;
    @SerializedName("jvm.threads.waiting.count")
    @Expose
    private JvmThreadsWaitingCount jvmThreadsWaitingCount;
    @SerializedName("runner.0.gauge")
    @Expose
    private Runner0Gauge runner0Gauge;

    public RuntimeStatsGaugeGauge getRuntimeStatsGaugeGauge() {
        return runtimeStatsGaugeGauge;
    }

    public void setRuntimeStatsGaugeGauge(RuntimeStatsGaugeGauge runtimeStatsGaugeGauge) {
        this.runtimeStatsGaugeGauge = runtimeStatsGaugeGauge;
    }

    public CustomKafkaConsumer01InternalState0Gauge getCustomKafkaConsumer01InternalState0Gauge() {
        return customKafkaConsumer01InternalState0Gauge;
    }

    public void setCustomKafkaConsumer01InternalState0Gauge(CustomKafkaConsumer01InternalState0Gauge customKafkaConsumer01InternalState0Gauge) {
        this.customKafkaConsumer01InternalState0Gauge = customKafkaConsumer01InternalState0Gauge;
    }

    public HealthDataObserverRunnableGauge getHealthDataObserverRunnableGauge() {
        return healthDataObserverRunnableGauge;
    }

    public void setHealthDataObserverRunnableGauge(HealthDataObserverRunnableGauge healthDataObserverRunnableGauge) {
        this.healthDataObserverRunnableGauge = healthDataObserverRunnableGauge;
    }

    public HealthMetricObserverRunnableGauge getHealthMetricObserverRunnableGauge() {
        return healthMetricObserverRunnableGauge;
    }

    public void setHealthMetricObserverRunnableGauge(HealthMetricObserverRunnableGauge healthMetricObserverRunnableGauge) {
        this.healthMetricObserverRunnableGauge = healthMetricObserverRunnableGauge;
    }

    public HealthMetricsEventRunnableGauge getHealthMetricsEventRunnableGauge() {
        return healthMetricsEventRunnableGauge;
    }

    public void setHealthMetricsEventRunnableGauge(HealthMetricsEventRunnableGauge healthMetricsEventRunnableGauge) {
        this.healthMetricsEventRunnableGauge = healthMetricsEventRunnableGauge;
    }

    public HealthProductionPipelineRunnableGauge getHealthProductionPipelineRunnableGauge() {
        return healthProductionPipelineRunnableGauge;
    }

    public void setHealthProductionPipelineRunnableGauge(HealthProductionPipelineRunnableGauge healthProductionPipelineRunnableGauge) {
        this.healthProductionPipelineRunnableGauge = healthProductionPipelineRunnableGauge;
    }

    public HealthRulesConfigLoaderRunnableGauge getHealthRulesConfigLoaderRunnableGauge() {
        return healthRulesConfigLoaderRunnableGauge;
    }

    public void setHealthRulesConfigLoaderRunnableGauge(HealthRulesConfigLoaderRunnableGauge healthRulesConfigLoaderRunnableGauge) {
        this.healthRulesConfigLoaderRunnableGauge = healthRulesConfigLoaderRunnableGauge;
    }

    public JvmBuffersDirectCapacity getJvmBuffersDirectCapacity() {
        return jvmBuffersDirectCapacity;
    }

    public void setJvmBuffersDirectCapacity(JvmBuffersDirectCapacity jvmBuffersDirectCapacity) {
        this.jvmBuffersDirectCapacity = jvmBuffersDirectCapacity;
    }

    public JvmBuffersDirectCount getJvmBuffersDirectCount() {
        return jvmBuffersDirectCount;
    }

    public void setJvmBuffersDirectCount(JvmBuffersDirectCount jvmBuffersDirectCount) {
        this.jvmBuffersDirectCount = jvmBuffersDirectCount;
    }

    public JvmBuffersDirectUsed getJvmBuffersDirectUsed() {
        return jvmBuffersDirectUsed;
    }

    public void setJvmBuffersDirectUsed(JvmBuffersDirectUsed jvmBuffersDirectUsed) {
        this.jvmBuffersDirectUsed = jvmBuffersDirectUsed;
    }

    public JvmBuffersMappedCapacity getJvmBuffersMappedCapacity() {
        return jvmBuffersMappedCapacity;
    }

    public void setJvmBuffersMappedCapacity(JvmBuffersMappedCapacity jvmBuffersMappedCapacity) {
        this.jvmBuffersMappedCapacity = jvmBuffersMappedCapacity;
    }

    public JvmBuffersMappedCount getJvmBuffersMappedCount() {
        return jvmBuffersMappedCount;
    }

    public void setJvmBuffersMappedCount(JvmBuffersMappedCount jvmBuffersMappedCount) {
        this.jvmBuffersMappedCount = jvmBuffersMappedCount;
    }

    public JvmBuffersMappedUsed getJvmBuffersMappedUsed() {
        return jvmBuffersMappedUsed;
    }

    public void setJvmBuffersMappedUsed(JvmBuffersMappedUsed jvmBuffersMappedUsed) {
        this.jvmBuffersMappedUsed = jvmBuffersMappedUsed;
    }

    public JvmFiles getJvmFiles() {
        return jvmFiles;
    }

    public void setJvmFiles(JvmFiles jvmFiles) {
        this.jvmFiles = jvmFiles;
    }

    public JvmGarbageG1OldGenerationCount getJvmGarbageG1OldGenerationCount() {
        return jvmGarbageG1OldGenerationCount;
    }

    public void setJvmGarbageG1OldGenerationCount(JvmGarbageG1OldGenerationCount jvmGarbageG1OldGenerationCount) {
        this.jvmGarbageG1OldGenerationCount = jvmGarbageG1OldGenerationCount;
    }

    public JvmGarbageG1OldGenerationTime getJvmGarbageG1OldGenerationTime() {
        return jvmGarbageG1OldGenerationTime;
    }

    public void setJvmGarbageG1OldGenerationTime(JvmGarbageG1OldGenerationTime jvmGarbageG1OldGenerationTime) {
        this.jvmGarbageG1OldGenerationTime = jvmGarbageG1OldGenerationTime;
    }

    public JvmGarbageG1YoungGenerationCount getJvmGarbageG1YoungGenerationCount() {
        return jvmGarbageG1YoungGenerationCount;
    }

    public void setJvmGarbageG1YoungGenerationCount(JvmGarbageG1YoungGenerationCount jvmGarbageG1YoungGenerationCount) {
        this.jvmGarbageG1YoungGenerationCount = jvmGarbageG1YoungGenerationCount;
    }

    public JvmGarbageG1YoungGenerationTime getJvmGarbageG1YoungGenerationTime() {
        return jvmGarbageG1YoungGenerationTime;
    }

    public void setJvmGarbageG1YoungGenerationTime(JvmGarbageG1YoungGenerationTime jvmGarbageG1YoungGenerationTime) {
        this.jvmGarbageG1YoungGenerationTime = jvmGarbageG1YoungGenerationTime;
    }

    public JvmMemoryHeapCommitted getJvmMemoryHeapCommitted() {
        return jvmMemoryHeapCommitted;
    }

    public void setJvmMemoryHeapCommitted(JvmMemoryHeapCommitted jvmMemoryHeapCommitted) {
        this.jvmMemoryHeapCommitted = jvmMemoryHeapCommitted;
    }

    public JvmMemoryHeapInit getJvmMemoryHeapInit() {
        return jvmMemoryHeapInit;
    }

    public void setJvmMemoryHeapInit(JvmMemoryHeapInit jvmMemoryHeapInit) {
        this.jvmMemoryHeapInit = jvmMemoryHeapInit;
    }

    public JvmMemoryHeapMax getJvmMemoryHeapMax() {
        return jvmMemoryHeapMax;
    }

    public void setJvmMemoryHeapMax(JvmMemoryHeapMax jvmMemoryHeapMax) {
        this.jvmMemoryHeapMax = jvmMemoryHeapMax;
    }

    public JvmMemoryHeapUsage getJvmMemoryHeapUsage() {
        return jvmMemoryHeapUsage;
    }

    public void setJvmMemoryHeapUsage(JvmMemoryHeapUsage jvmMemoryHeapUsage) {
        this.jvmMemoryHeapUsage = jvmMemoryHeapUsage;
    }

    public JvmMemoryHeapUsed getJvmMemoryHeapUsed() {
        return jvmMemoryHeapUsed;
    }

    public void setJvmMemoryHeapUsed(JvmMemoryHeapUsed jvmMemoryHeapUsed) {
        this.jvmMemoryHeapUsed = jvmMemoryHeapUsed;
    }

    public JvmMemoryNonHeapCommitted getJvmMemoryNonHeapCommitted() {
        return jvmMemoryNonHeapCommitted;
    }

    public void setJvmMemoryNonHeapCommitted(JvmMemoryNonHeapCommitted jvmMemoryNonHeapCommitted) {
        this.jvmMemoryNonHeapCommitted = jvmMemoryNonHeapCommitted;
    }

    public JvmMemoryNonHeapInit getJvmMemoryNonHeapInit() {
        return jvmMemoryNonHeapInit;
    }

    public void setJvmMemoryNonHeapInit(JvmMemoryNonHeapInit jvmMemoryNonHeapInit) {
        this.jvmMemoryNonHeapInit = jvmMemoryNonHeapInit;
    }

    public JvmMemoryNonHeapMax getJvmMemoryNonHeapMax() {
        return jvmMemoryNonHeapMax;
    }

    public void setJvmMemoryNonHeapMax(JvmMemoryNonHeapMax jvmMemoryNonHeapMax) {
        this.jvmMemoryNonHeapMax = jvmMemoryNonHeapMax;
    }

    public JvmMemoryNonHeapUsage getJvmMemoryNonHeapUsage() {
        return jvmMemoryNonHeapUsage;
    }

    public void setJvmMemoryNonHeapUsage(JvmMemoryNonHeapUsage jvmMemoryNonHeapUsage) {
        this.jvmMemoryNonHeapUsage = jvmMemoryNonHeapUsage;
    }

    public JvmMemoryNonHeapUsed getJvmMemoryNonHeapUsed() {
        return jvmMemoryNonHeapUsed;
    }

    public void setJvmMemoryNonHeapUsed(JvmMemoryNonHeapUsed jvmMemoryNonHeapUsed) {
        this.jvmMemoryNonHeapUsed = jvmMemoryNonHeapUsed;
    }

    public JvmMemoryPoolsCodeCacheCommitted getJvmMemoryPoolsCodeCacheCommitted() {
        return jvmMemoryPoolsCodeCacheCommitted;
    }

    public void setJvmMemoryPoolsCodeCacheCommitted(JvmMemoryPoolsCodeCacheCommitted jvmMemoryPoolsCodeCacheCommitted) {
        this.jvmMemoryPoolsCodeCacheCommitted = jvmMemoryPoolsCodeCacheCommitted;
    }

    public JvmMemoryPoolsCodeCacheInit getJvmMemoryPoolsCodeCacheInit() {
        return jvmMemoryPoolsCodeCacheInit;
    }

    public void setJvmMemoryPoolsCodeCacheInit(JvmMemoryPoolsCodeCacheInit jvmMemoryPoolsCodeCacheInit) {
        this.jvmMemoryPoolsCodeCacheInit = jvmMemoryPoolsCodeCacheInit;
    }

    public JvmMemoryPoolsCodeCacheMax getJvmMemoryPoolsCodeCacheMax() {
        return jvmMemoryPoolsCodeCacheMax;
    }

    public void setJvmMemoryPoolsCodeCacheMax(JvmMemoryPoolsCodeCacheMax jvmMemoryPoolsCodeCacheMax) {
        this.jvmMemoryPoolsCodeCacheMax = jvmMemoryPoolsCodeCacheMax;
    }

    public JvmMemoryPoolsCodeCacheUsage getJvmMemoryPoolsCodeCacheUsage() {
        return jvmMemoryPoolsCodeCacheUsage;
    }

    public void setJvmMemoryPoolsCodeCacheUsage(JvmMemoryPoolsCodeCacheUsage jvmMemoryPoolsCodeCacheUsage) {
        this.jvmMemoryPoolsCodeCacheUsage = jvmMemoryPoolsCodeCacheUsage;
    }

    public JvmMemoryPoolsCodeCacheUsed getJvmMemoryPoolsCodeCacheUsed() {
        return jvmMemoryPoolsCodeCacheUsed;
    }

    public void setJvmMemoryPoolsCodeCacheUsed(JvmMemoryPoolsCodeCacheUsed jvmMemoryPoolsCodeCacheUsed) {
        this.jvmMemoryPoolsCodeCacheUsed = jvmMemoryPoolsCodeCacheUsed;
    }

    public JvmMemoryPoolsCompressedClassSpaceCommitted getJvmMemoryPoolsCompressedClassSpaceCommitted() {
        return jvmMemoryPoolsCompressedClassSpaceCommitted;
    }

    public void setJvmMemoryPoolsCompressedClassSpaceCommitted(JvmMemoryPoolsCompressedClassSpaceCommitted jvmMemoryPoolsCompressedClassSpaceCommitted) {
        this.jvmMemoryPoolsCompressedClassSpaceCommitted = jvmMemoryPoolsCompressedClassSpaceCommitted;
    }

    public JvmMemoryPoolsCompressedClassSpaceInit getJvmMemoryPoolsCompressedClassSpaceInit() {
        return jvmMemoryPoolsCompressedClassSpaceInit;
    }

    public void setJvmMemoryPoolsCompressedClassSpaceInit(JvmMemoryPoolsCompressedClassSpaceInit jvmMemoryPoolsCompressedClassSpaceInit) {
        this.jvmMemoryPoolsCompressedClassSpaceInit = jvmMemoryPoolsCompressedClassSpaceInit;
    }

    public JvmMemoryPoolsCompressedClassSpaceMax getJvmMemoryPoolsCompressedClassSpaceMax() {
        return jvmMemoryPoolsCompressedClassSpaceMax;
    }

    public void setJvmMemoryPoolsCompressedClassSpaceMax(JvmMemoryPoolsCompressedClassSpaceMax jvmMemoryPoolsCompressedClassSpaceMax) {
        this.jvmMemoryPoolsCompressedClassSpaceMax = jvmMemoryPoolsCompressedClassSpaceMax;
    }

    public JvmMemoryPoolsCompressedClassSpaceUsage getJvmMemoryPoolsCompressedClassSpaceUsage() {
        return jvmMemoryPoolsCompressedClassSpaceUsage;
    }

    public void setJvmMemoryPoolsCompressedClassSpaceUsage(JvmMemoryPoolsCompressedClassSpaceUsage jvmMemoryPoolsCompressedClassSpaceUsage) {
        this.jvmMemoryPoolsCompressedClassSpaceUsage = jvmMemoryPoolsCompressedClassSpaceUsage;
    }

    public JvmMemoryPoolsCompressedClassSpaceUsed getJvmMemoryPoolsCompressedClassSpaceUsed() {
        return jvmMemoryPoolsCompressedClassSpaceUsed;
    }

    public void setJvmMemoryPoolsCompressedClassSpaceUsed(JvmMemoryPoolsCompressedClassSpaceUsed jvmMemoryPoolsCompressedClassSpaceUsed) {
        this.jvmMemoryPoolsCompressedClassSpaceUsed = jvmMemoryPoolsCompressedClassSpaceUsed;
    }

    public JvmMemoryPoolsG1EdenSpaceCommitted getJvmMemoryPoolsG1EdenSpaceCommitted() {
        return jvmMemoryPoolsG1EdenSpaceCommitted;
    }

    public void setJvmMemoryPoolsG1EdenSpaceCommitted(JvmMemoryPoolsG1EdenSpaceCommitted jvmMemoryPoolsG1EdenSpaceCommitted) {
        this.jvmMemoryPoolsG1EdenSpaceCommitted = jvmMemoryPoolsG1EdenSpaceCommitted;
    }

    public JvmMemoryPoolsG1EdenSpaceInit getJvmMemoryPoolsG1EdenSpaceInit() {
        return jvmMemoryPoolsG1EdenSpaceInit;
    }

    public void setJvmMemoryPoolsG1EdenSpaceInit(JvmMemoryPoolsG1EdenSpaceInit jvmMemoryPoolsG1EdenSpaceInit) {
        this.jvmMemoryPoolsG1EdenSpaceInit = jvmMemoryPoolsG1EdenSpaceInit;
    }

    public JvmMemoryPoolsG1EdenSpaceMax getJvmMemoryPoolsG1EdenSpaceMax() {
        return jvmMemoryPoolsG1EdenSpaceMax;
    }

    public void setJvmMemoryPoolsG1EdenSpaceMax(JvmMemoryPoolsG1EdenSpaceMax jvmMemoryPoolsG1EdenSpaceMax) {
        this.jvmMemoryPoolsG1EdenSpaceMax = jvmMemoryPoolsG1EdenSpaceMax;
    }

    public JvmMemoryPoolsG1EdenSpaceUsage getJvmMemoryPoolsG1EdenSpaceUsage() {
        return jvmMemoryPoolsG1EdenSpaceUsage;
    }

    public void setJvmMemoryPoolsG1EdenSpaceUsage(JvmMemoryPoolsG1EdenSpaceUsage jvmMemoryPoolsG1EdenSpaceUsage) {
        this.jvmMemoryPoolsG1EdenSpaceUsage = jvmMemoryPoolsG1EdenSpaceUsage;
    }

    public JvmMemoryPoolsG1EdenSpaceUsed getJvmMemoryPoolsG1EdenSpaceUsed() {
        return jvmMemoryPoolsG1EdenSpaceUsed;
    }

    public void setJvmMemoryPoolsG1EdenSpaceUsed(JvmMemoryPoolsG1EdenSpaceUsed jvmMemoryPoolsG1EdenSpaceUsed) {
        this.jvmMemoryPoolsG1EdenSpaceUsed = jvmMemoryPoolsG1EdenSpaceUsed;
    }

    public JvmMemoryPoolsG1EdenSpaceUsedAfterGc getJvmMemoryPoolsG1EdenSpaceUsedAfterGc() {
        return jvmMemoryPoolsG1EdenSpaceUsedAfterGc;
    }

    public void setJvmMemoryPoolsG1EdenSpaceUsedAfterGc(JvmMemoryPoolsG1EdenSpaceUsedAfterGc jvmMemoryPoolsG1EdenSpaceUsedAfterGc) {
        this.jvmMemoryPoolsG1EdenSpaceUsedAfterGc = jvmMemoryPoolsG1EdenSpaceUsedAfterGc;
    }

    public JvmMemoryPoolsG1OldGenCommitted getJvmMemoryPoolsG1OldGenCommitted() {
        return jvmMemoryPoolsG1OldGenCommitted;
    }

    public void setJvmMemoryPoolsG1OldGenCommitted(JvmMemoryPoolsG1OldGenCommitted jvmMemoryPoolsG1OldGenCommitted) {
        this.jvmMemoryPoolsG1OldGenCommitted = jvmMemoryPoolsG1OldGenCommitted;
    }

    public JvmMemoryPoolsG1OldGenInit getJvmMemoryPoolsG1OldGenInit() {
        return jvmMemoryPoolsG1OldGenInit;
    }

    public void setJvmMemoryPoolsG1OldGenInit(JvmMemoryPoolsG1OldGenInit jvmMemoryPoolsG1OldGenInit) {
        this.jvmMemoryPoolsG1OldGenInit = jvmMemoryPoolsG1OldGenInit;
    }

    public JvmMemoryPoolsG1OldGenMax getJvmMemoryPoolsG1OldGenMax() {
        return jvmMemoryPoolsG1OldGenMax;
    }

    public void setJvmMemoryPoolsG1OldGenMax(JvmMemoryPoolsG1OldGenMax jvmMemoryPoolsG1OldGenMax) {
        this.jvmMemoryPoolsG1OldGenMax = jvmMemoryPoolsG1OldGenMax;
    }

    public JvmMemoryPoolsG1OldGenUsage getJvmMemoryPoolsG1OldGenUsage() {
        return jvmMemoryPoolsG1OldGenUsage;
    }

    public void setJvmMemoryPoolsG1OldGenUsage(JvmMemoryPoolsG1OldGenUsage jvmMemoryPoolsG1OldGenUsage) {
        this.jvmMemoryPoolsG1OldGenUsage = jvmMemoryPoolsG1OldGenUsage;
    }

    public JvmMemoryPoolsG1OldGenUsed getJvmMemoryPoolsG1OldGenUsed() {
        return jvmMemoryPoolsG1OldGenUsed;
    }

    public void setJvmMemoryPoolsG1OldGenUsed(JvmMemoryPoolsG1OldGenUsed jvmMemoryPoolsG1OldGenUsed) {
        this.jvmMemoryPoolsG1OldGenUsed = jvmMemoryPoolsG1OldGenUsed;
    }

    public JvmMemoryPoolsG1OldGenUsedAfterGc getJvmMemoryPoolsG1OldGenUsedAfterGc() {
        return jvmMemoryPoolsG1OldGenUsedAfterGc;
    }

    public void setJvmMemoryPoolsG1OldGenUsedAfterGc(JvmMemoryPoolsG1OldGenUsedAfterGc jvmMemoryPoolsG1OldGenUsedAfterGc) {
        this.jvmMemoryPoolsG1OldGenUsedAfterGc = jvmMemoryPoolsG1OldGenUsedAfterGc;
    }

    public JvmMemoryPoolsG1SurvivorSpaceCommitted getJvmMemoryPoolsG1SurvivorSpaceCommitted() {
        return jvmMemoryPoolsG1SurvivorSpaceCommitted;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceCommitted(JvmMemoryPoolsG1SurvivorSpaceCommitted jvmMemoryPoolsG1SurvivorSpaceCommitted) {
        this.jvmMemoryPoolsG1SurvivorSpaceCommitted = jvmMemoryPoolsG1SurvivorSpaceCommitted;
    }

    public JvmMemoryPoolsG1SurvivorSpaceInit getJvmMemoryPoolsG1SurvivorSpaceInit() {
        return jvmMemoryPoolsG1SurvivorSpaceInit;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceInit(JvmMemoryPoolsG1SurvivorSpaceInit jvmMemoryPoolsG1SurvivorSpaceInit) {
        this.jvmMemoryPoolsG1SurvivorSpaceInit = jvmMemoryPoolsG1SurvivorSpaceInit;
    }

    public JvmMemoryPoolsG1SurvivorSpaceMax getJvmMemoryPoolsG1SurvivorSpaceMax() {
        return jvmMemoryPoolsG1SurvivorSpaceMax;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceMax(JvmMemoryPoolsG1SurvivorSpaceMax jvmMemoryPoolsG1SurvivorSpaceMax) {
        this.jvmMemoryPoolsG1SurvivorSpaceMax = jvmMemoryPoolsG1SurvivorSpaceMax;
    }

    public JvmMemoryPoolsG1SurvivorSpaceUsage getJvmMemoryPoolsG1SurvivorSpaceUsage() {
        return jvmMemoryPoolsG1SurvivorSpaceUsage;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceUsage(JvmMemoryPoolsG1SurvivorSpaceUsage jvmMemoryPoolsG1SurvivorSpaceUsage) {
        this.jvmMemoryPoolsG1SurvivorSpaceUsage = jvmMemoryPoolsG1SurvivorSpaceUsage;
    }

    public JvmMemoryPoolsG1SurvivorSpaceUsed getJvmMemoryPoolsG1SurvivorSpaceUsed() {
        return jvmMemoryPoolsG1SurvivorSpaceUsed;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceUsed(JvmMemoryPoolsG1SurvivorSpaceUsed jvmMemoryPoolsG1SurvivorSpaceUsed) {
        this.jvmMemoryPoolsG1SurvivorSpaceUsed = jvmMemoryPoolsG1SurvivorSpaceUsed;
    }

    public JvmMemoryPoolsG1SurvivorSpaceUsedAfterGc getJvmMemoryPoolsG1SurvivorSpaceUsedAfterGc() {
        return jvmMemoryPoolsG1SurvivorSpaceUsedAfterGc;
    }

    public void setJvmMemoryPoolsG1SurvivorSpaceUsedAfterGc(JvmMemoryPoolsG1SurvivorSpaceUsedAfterGc jvmMemoryPoolsG1SurvivorSpaceUsedAfterGc) {
        this.jvmMemoryPoolsG1SurvivorSpaceUsedAfterGc = jvmMemoryPoolsG1SurvivorSpaceUsedAfterGc;
    }

    public JvmMemoryPoolsMetaspaceCommitted getJvmMemoryPoolsMetaspaceCommitted() {
        return jvmMemoryPoolsMetaspaceCommitted;
    }

    public void setJvmMemoryPoolsMetaspaceCommitted(JvmMemoryPoolsMetaspaceCommitted jvmMemoryPoolsMetaspaceCommitted) {
        this.jvmMemoryPoolsMetaspaceCommitted = jvmMemoryPoolsMetaspaceCommitted;
    }

    public JvmMemoryPoolsMetaspaceInit getJvmMemoryPoolsMetaspaceInit() {
        return jvmMemoryPoolsMetaspaceInit;
    }

    public void setJvmMemoryPoolsMetaspaceInit(JvmMemoryPoolsMetaspaceInit jvmMemoryPoolsMetaspaceInit) {
        this.jvmMemoryPoolsMetaspaceInit = jvmMemoryPoolsMetaspaceInit;
    }

    public JvmMemoryPoolsMetaspaceMax getJvmMemoryPoolsMetaspaceMax() {
        return jvmMemoryPoolsMetaspaceMax;
    }

    public void setJvmMemoryPoolsMetaspaceMax(JvmMemoryPoolsMetaspaceMax jvmMemoryPoolsMetaspaceMax) {
        this.jvmMemoryPoolsMetaspaceMax = jvmMemoryPoolsMetaspaceMax;
    }

    public JvmMemoryPoolsMetaspaceUsage getJvmMemoryPoolsMetaspaceUsage() {
        return jvmMemoryPoolsMetaspaceUsage;
    }

    public void setJvmMemoryPoolsMetaspaceUsage(JvmMemoryPoolsMetaspaceUsage jvmMemoryPoolsMetaspaceUsage) {
        this.jvmMemoryPoolsMetaspaceUsage = jvmMemoryPoolsMetaspaceUsage;
    }

    public JvmMemoryPoolsMetaspaceUsed getJvmMemoryPoolsMetaspaceUsed() {
        return jvmMemoryPoolsMetaspaceUsed;
    }

    public void setJvmMemoryPoolsMetaspaceUsed(JvmMemoryPoolsMetaspaceUsed jvmMemoryPoolsMetaspaceUsed) {
        this.jvmMemoryPoolsMetaspaceUsed = jvmMemoryPoolsMetaspaceUsed;
    }

    public JvmMemoryTotalCommitted getJvmMemoryTotalCommitted() {
        return jvmMemoryTotalCommitted;
    }

    public void setJvmMemoryTotalCommitted(JvmMemoryTotalCommitted jvmMemoryTotalCommitted) {
        this.jvmMemoryTotalCommitted = jvmMemoryTotalCommitted;
    }

    public JvmMemoryTotalInit getJvmMemoryTotalInit() {
        return jvmMemoryTotalInit;
    }

    public void setJvmMemoryTotalInit(JvmMemoryTotalInit jvmMemoryTotalInit) {
        this.jvmMemoryTotalInit = jvmMemoryTotalInit;
    }

    public JvmMemoryTotalMax getJvmMemoryTotalMax() {
        return jvmMemoryTotalMax;
    }

    public void setJvmMemoryTotalMax(JvmMemoryTotalMax jvmMemoryTotalMax) {
        this.jvmMemoryTotalMax = jvmMemoryTotalMax;
    }

    public JvmMemoryTotalUsed getJvmMemoryTotalUsed() {
        return jvmMemoryTotalUsed;
    }

    public void setJvmMemoryTotalUsed(JvmMemoryTotalUsed jvmMemoryTotalUsed) {
        this.jvmMemoryTotalUsed = jvmMemoryTotalUsed;
    }

    public JvmThreadsBlockedCount getJvmThreadsBlockedCount() {
        return jvmThreadsBlockedCount;
    }

    public void setJvmThreadsBlockedCount(JvmThreadsBlockedCount jvmThreadsBlockedCount) {
        this.jvmThreadsBlockedCount = jvmThreadsBlockedCount;
    }

    public JvmThreadsCount getJvmThreadsCount() {
        return jvmThreadsCount;
    }

    public void setJvmThreadsCount(JvmThreadsCount jvmThreadsCount) {
        this.jvmThreadsCount = jvmThreadsCount;
    }

    public JvmThreadsDaemonCount getJvmThreadsDaemonCount() {
        return jvmThreadsDaemonCount;
    }

    public void setJvmThreadsDaemonCount(JvmThreadsDaemonCount jvmThreadsDaemonCount) {
        this.jvmThreadsDaemonCount = jvmThreadsDaemonCount;
    }

    public JvmThreadsDeadlockCount getJvmThreadsDeadlockCount() {
        return jvmThreadsDeadlockCount;
    }

    public void setJvmThreadsDeadlockCount(JvmThreadsDeadlockCount jvmThreadsDeadlockCount) {
        this.jvmThreadsDeadlockCount = jvmThreadsDeadlockCount;
    }

    public JvmThreadsDeadlocks getJvmThreadsDeadlocks() {
        return jvmThreadsDeadlocks;
    }

    public void setJvmThreadsDeadlocks(JvmThreadsDeadlocks jvmThreadsDeadlocks) {
        this.jvmThreadsDeadlocks = jvmThreadsDeadlocks;
    }

    public JvmThreadsNewCount getJvmThreadsNewCount() {
        return jvmThreadsNewCount;
    }

    public void setJvmThreadsNewCount(JvmThreadsNewCount jvmThreadsNewCount) {
        this.jvmThreadsNewCount = jvmThreadsNewCount;
    }

    public JvmThreadsRunnableCount getJvmThreadsRunnableCount() {
        return jvmThreadsRunnableCount;
    }

    public void setJvmThreadsRunnableCount(JvmThreadsRunnableCount jvmThreadsRunnableCount) {
        this.jvmThreadsRunnableCount = jvmThreadsRunnableCount;
    }

    public JvmThreadsTerminatedCount getJvmThreadsTerminatedCount() {
        return jvmThreadsTerminatedCount;
    }

    public void setJvmThreadsTerminatedCount(JvmThreadsTerminatedCount jvmThreadsTerminatedCount) {
        this.jvmThreadsTerminatedCount = jvmThreadsTerminatedCount;
    }

    public JvmThreadsTimedWaitingCount getJvmThreadsTimedWaitingCount() {
        return jvmThreadsTimedWaitingCount;
    }

    public void setJvmThreadsTimedWaitingCount(JvmThreadsTimedWaitingCount jvmThreadsTimedWaitingCount) {
        this.jvmThreadsTimedWaitingCount = jvmThreadsTimedWaitingCount;
    }

    public JvmThreadsWaitingCount getJvmThreadsWaitingCount() {
        return jvmThreadsWaitingCount;
    }

    public void setJvmThreadsWaitingCount(JvmThreadsWaitingCount jvmThreadsWaitingCount) {
        this.jvmThreadsWaitingCount = jvmThreadsWaitingCount;
    }

    public Runner0Gauge getRunner0Gauge() {
        return runner0Gauge;
    }

    public void setRunner0Gauge(Runner0Gauge runner0Gauge) {
        this.runner0Gauge = runner0Gauge;
    }

}
