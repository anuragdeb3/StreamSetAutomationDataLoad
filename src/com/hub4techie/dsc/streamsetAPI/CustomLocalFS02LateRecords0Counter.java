
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomLocalFS02LateRecords0Counter {

    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
