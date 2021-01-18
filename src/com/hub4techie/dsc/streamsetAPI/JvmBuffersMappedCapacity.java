
package com.hub4techie.dsc.streamsetAPI;

import java.math.BigInteger;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JvmBuffersMappedCapacity {

    @SerializedName("value")
    @Expose
    private BigInteger value;

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

}
