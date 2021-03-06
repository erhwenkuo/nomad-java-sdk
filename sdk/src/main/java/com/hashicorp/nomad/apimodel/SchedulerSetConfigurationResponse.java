package com.hashicorp.nomad.apimodel;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hashicorp.nomad.javasdk.ApiObject;
import com.hashicorp.nomad.javasdk.NomadJson;

import java.io.IOException;
import java.util.List;

/**
 * This is a generated JavaBean representing a request or response structure.
 *
 * @see <a href="https://www.nomadproject.io/docs/http/index.html">Nomad HTTP API</a> documentation associated with the endpoint you are using.
 */
public final class SchedulerSetConfigurationResponse extends ApiObject {
    private boolean updated;

    @JsonProperty("Updated")
    public boolean getUpdated() {
        return updated;
    }

    public SchedulerSetConfigurationResponse setUpdated(boolean updated) {
        this.updated = updated;
        return this;
    }

    @Override
    public String toString() {
        return NomadJson.serialize(this);
    }

    public static SchedulerSetConfigurationResponse fromJson(String json) throws IOException {
        return NomadJson.deserialize(json, SchedulerSetConfigurationResponse.class);
    }

    public static List<SchedulerSetConfigurationResponse> fromJsonArray(String json) throws IOException {
        return NomadJson.deserializeList(json, SchedulerSetConfigurationResponse.class);
    }
}
