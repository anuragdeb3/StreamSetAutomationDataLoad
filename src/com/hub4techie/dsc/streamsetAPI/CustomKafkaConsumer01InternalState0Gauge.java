
package com.hub4techie.dsc.streamsetAPI;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CustomKafkaConsumer01InternalState0Gauge {

	@SerializedName("value")
	@Expose
	private Value_ value;

	public Value_ getValue() {
		return value;
	}

	public void setValue(Value_ value) {
		this.value = value;
	}

}
