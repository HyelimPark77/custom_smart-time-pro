package com.jieli.jl_rcsp.tool.datahandles;

import com.jieli.jl_rcsp.model.DataInfo;
import com.jieli.jl_rcsp.model.base.BasePacket;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class DataInfoCache extends ArrayList<DataInfo> {
    public DataInfoCache() {
    }

    public DataInfo getDataInfo(BasePacket r5) {
        Iterator<DataInfo> r0 = iterator();
    L4:
        if (r0.hasNext() == false) goto L10;
        DataInfo r1 = r0.next();
        if (r1.getBasePacket().getOpCode() != r5.getOpCode()) goto L4;
        if (r1.getBasePacket().getOpCodeSn() != r5.getOpCodeSn()) goto L4;
        return r1;
    L10:
        return null;
    }
}
