package com.jieli.jl_rcsp.model.command.double_connect;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.device.double_connect.ConnectedBtInfo;
import com.jieli.jl_rcsp.model.device.double_connect.DeviceBtInfo;

/* JADX INFO: loaded from: classes17.dex */
public class QueryPhoneBtInfoCmd extends CommandBase<Param, Response> {

    public static class NotifyParam extends Param {
        private final ConnectedBtInfo connectedBtInfo;

        public NotifyParam() {
            this.connectedBtInfo = new ConnectedBtInfo();
        }

        public ConnectedBtInfo getConnectedBtInfo() {
            return this.connectedBtInfo;
        }

        @Override // com.jieli.jl_rcsp.model.command.double_connect.QueryPhoneBtInfoCmd.Param, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return this.connectedBtInfo.toData();
        }

        @Override // com.jieli.jl_rcsp.model.command.double_connect.QueryPhoneBtInfoCmd.Param
        public int parseData(byte[] r2) {
            return this.connectedBtInfo.parseConnectedDeviceBtData(r2);
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter
        public String toString() {
            return "NotifyParam{connectedBtInfo=" + this.connectedBtInfo + "} ";
        }
    }

    public static class Param extends BaseParameter {
        private DeviceBtInfo deviceBtInfo;

        public Param() {
        }

        public DeviceBtInfo getDeviceBtInfo() {
            return this.deviceBtInfo;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            DeviceBtInfo r0 = this.deviceBtInfo;
            if (r0 == null) goto L7;
            return r0.toData();
        L7:
            return new byte[0];
        }

        public int parseData(byte[] r2) {
            if (r2 != null) goto L4;
            return 0;
        L4:
            if (r2.length == 0) goto L12;
            DeviceBtInfo r0 = new DeviceBtInfo();
            int r3 = r0.parseData(r2);
            if (r3 <= 0) goto L9;
            setDeviceBtInfo(r0);
        L9:
            return r3;
        L12:
            return 0;
        }

        public Param setDeviceBtInfo(DeviceBtInfo r1) {
            this.deviceBtInfo = r1;
            return this;
        }
    }

    public static class Response extends CommonResponse {
        private final ConnectedBtInfo connectedBtInfo;

        public Response() {
            this.connectedBtInfo = new ConnectedBtInfo();
        }

        public ConnectedBtInfo getConnectedBtInfo() {
            return this.connectedBtInfo;
        }

        public int parseData(byte[] r2) {
            return this.connectedBtInfo.parseConnectedDeviceBtData(r2);
        }
    }

    public QueryPhoneBtInfoCmd(Param r2) {
        this(2, r2);
    }

    public QueryPhoneBtInfoCmd(int r3, Param r4) {
        super(49, "QueryPhoneBtInfoCmd", r3);
        setParam(r4);
    }
}
