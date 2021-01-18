
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HealthMetricObserverRunnableGauge {

    @SerializedName("value")
    @Expose
    private Value___ value;

    public Value___ getValue() {
        return value;
    }

    public void setValue(Value___ value) {
        this.value = value;
    }

}
