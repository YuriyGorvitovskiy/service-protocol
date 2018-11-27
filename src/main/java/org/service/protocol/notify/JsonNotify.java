package org.service.protocol.notify;

import org.service.common.message.JsonMessage;
import org.service.protocol.notify.v1.JsonNotify_v1;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(property = "@notify_type", use = JsonTypeInfo.Id.NAME)
@JsonSubTypes({
                @Type(value = JsonNotify_v1.class, name = "patch.processed.v1"),
})
public class JsonNotify extends JsonMessage {
}
