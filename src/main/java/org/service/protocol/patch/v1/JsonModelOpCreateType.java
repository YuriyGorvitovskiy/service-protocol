package org.service.protocol.patch.v1;

import java.util.ArrayList;
import java.util.List;

public class JsonModelOpCreateType extends JsonModelOp {
    public JsonModelAttribute       id;
    public List<JsonModelAttribute> attrs = new ArrayList<>();
}
