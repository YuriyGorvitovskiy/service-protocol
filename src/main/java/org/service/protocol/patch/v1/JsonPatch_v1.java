package org.service.protocol.patch.v1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.service.common.util.Json;

import com.fasterxml.jackson.annotation.JsonFormat;

public abstract class JsonPatch_v1 extends org.service.protocol.patch.JsonPatch {
    public long   event_id;
    public String event_by;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = Json.DATE_PATTERN, timezone = Json.DATE_TIMEZONE)
    public Date         event_at;
    public List<String> target_ids = new ArrayList<>();
}
