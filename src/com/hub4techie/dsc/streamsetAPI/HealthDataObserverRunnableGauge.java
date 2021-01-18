
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HealthDataObserverRunnableGauge {

    @SerializedName("value")
    @Expose
    private Value__ value;

    public Value__ getValue() {
        return value;
    }

    public void setValue(Value__ value) {
        this.value = value;
    }

}
