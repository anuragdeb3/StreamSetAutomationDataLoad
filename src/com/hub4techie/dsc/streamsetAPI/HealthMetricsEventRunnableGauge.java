
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HealthMetricsEventRunnableGauge {

    @SerializedName("value")
    @Expose
    private Value____ value;

    public Value____ getValue() {
        return value;
    }

    public void setValue(Value____ value) {
        this.value = value;
    }

}
