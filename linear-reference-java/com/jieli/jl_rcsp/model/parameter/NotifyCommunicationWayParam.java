package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayParam extends BaseParameter {
    private final int reconnect;
    private final int way;

    public NotifyCommunicationWayParam(int r1, int r2) {
        this.way = r1;
        this.reconnect = r2;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.way, (byte) this.reconnect};
    }

    public int getReconnect() {
        return this.reconnect;
    }

    public int getWay() {
        return this.way;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "NotifyCommunicationWayParam{way=" + this.way + i0XO1.IO;
    }
}
