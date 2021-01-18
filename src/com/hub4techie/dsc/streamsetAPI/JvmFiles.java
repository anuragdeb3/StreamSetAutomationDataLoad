
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JvmFiles {

    @SerializedName("value")
    @Expose
    private Double value;

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
