
package com.hub4techie.dsc.streamsetAPI;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JvmThreadsDeadlocks {

    @SerializedName("value")
    @Expose
    private List<Object> value = null;

    public List<Object> getValue() {
        return value;
    }

    public void setValue(List<Object> value) {
        this.value = value;
    }

}
