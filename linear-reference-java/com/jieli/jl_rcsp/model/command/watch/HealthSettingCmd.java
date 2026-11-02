package com.jieli.jl_rcsp.model.command.watch;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HealthSettingCmd extends CommandBase<Param, Response> {
    public static final byte OP_READ = 0;
    public static final byte OP_UPDATE = 2;
    public static final byte OP_WRITE = 1;

    public static class GetParam extends Param {
        public GetParam(int r2) {
            super((byte) 0, CHexConver.intToBigBytes(r2));
        }
    }

    public static class GetResponse extends Response {
        private final List<AttrBean> list;

        public GetResponse(List<AttrBean> r1) {
            this.list = r1;
        }

        public List<AttrBean> getList() {
            return this.list;
        }
    }

    public static class Param extends BaseParameter {
        private final byte[] data;
        private final byte op;

        public Param(byte r1, byte[] r2) {
            this.op = r1;
            this.data = r2;
        }

        public byte[] getData() {
            return this.data;
        }

        public byte getOp() {
            return this.op;
        }

        @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return ByteBuffer.allocate(this.data.length + 1).put(this.op).put(this.data).array();
        }
    }

    public static class Response extends CommonResponse {
        public Response() {
        }
    }

    public static class SetParam extends Param {
        private final List<AttrBean> list;

        public SetParam(List<AttrBean> r3) {
            super((byte) 1, RcspUtil.attrs2Bytes(r3));
            this.list = r3;
        }

        public List<AttrBean> getList() {
            return this.list;
        }
    }

    public static class UpdateParam extends Param {
        private final List<AttrBean> list;

        public UpdateParam(List<AttrBean> r3) {
            super((byte) 2, RcspUtil.attrs2Bytes(r3));
            this.list = r3;
        }

        public List<AttrBean> getList() {
            return this.list;
        }
    }

    public HealthSettingCmd(Param r2) {
        this(2, r2);
    }

    public HealthSettingCmd(int r3, Param r4) {
        super(165, HealthSettingCmd.class.getSimpleName(), r3);
        setParam(r4);
    }
}
