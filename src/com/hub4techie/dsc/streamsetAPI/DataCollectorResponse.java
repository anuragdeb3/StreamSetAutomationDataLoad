
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataCollectorResponse {

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("gauges")
    @Expose
    private Gauges gauges;
    @SerializedName("counters")
    @Expose
    private Counters counters;
    @SerializedName("histograms")
    @Expose
    private Histograms histograms;
    @SerializedName("meters")
    @Expose
    private Meters meters;
    @SerializedName("timers")
    @Expose
    private Timers timers;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Gauges getGauges() {
        return gauges;
    }

    public void setGauges(Gauges gauges) {
        this.gauges = gauges;
    }

    public Counters getCounters() {
        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    public Histograms getHistograms() {
        return histograms;
    }

    public void setHistograms(Histograms histograms) {
        this.histograms = histograms;
    }

    public Meters getMeters() {
        return meters;
    }

    public void setMeters(Meters meters) {
        this.meters = meters;
    }

    public Timers getTimers() {
        return timers;
    }

    public void setTimers(Timers timers) {
        this.timers = timers;
    }

}
