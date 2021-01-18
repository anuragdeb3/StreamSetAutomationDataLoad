
package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PipelineBatchOutputRecordsCounter {

    @SerializedName("count")
    @Expose
    private BigInteger count;

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }

}
