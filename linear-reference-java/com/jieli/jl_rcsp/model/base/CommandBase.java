package com.jieli.jl_rcsp.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class CommandBase<P extends BaseParameter, R extends CommonResponse> {
    public static final int FLAG_HAVE_PARAMETER_AND_RESPONSE = 2;
    public static final int FLAG_HAVE_PARAMETER_NO_RESPONSE = 1;
    public static final int FLAG_NO_PARAMETER_AND_RESPONSE = 0;
    public static final int FLAG_NO_PARAMETER_HAVE_RESPONSE = 3;
    private int OpCodeSn;
    private final String name;
    private final int opCode;
    private P param;
    private R response;
    private int status;
    private final int type;

    public CommandBase(int r2, String r3) {
        this(r2, r3, 0);
    }

    public boolean equal(CommandBase r3) {
        if (r3 != null) goto L4;
        return false;
    L4:
        if (this.OpCodeSn == r3.OpCodeSn) goto L6;
        return false;
    L6:
        if (this.opCode != r3.opCode) goto L12;
        return true;
    L12:
        return false;
    }

    public int getId() {
        return this.opCode;
    }

    public String getName() {
        return this.name;
    }

    public int getOpCodeSn() {
        return this.OpCodeSn;
    }

    public P getParam() {
        return this.param;
    }

    public R getResponse() {
        return this.response;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public CommandBase setOpCodeSn(int r1) {
        this.OpCodeSn = r1;
        return this;
    }

    public void setParam(P r1) {
        this.param = r1;
    }

    public void setResponse(R r1) {
        this.response = r1;
    }

    public CommandBase setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public String toString() {
        return "CommandBase{OpCodeSn=" + this.OpCodeSn + ", opCode=" + this.opCode + ", name='" + this.name + "', type=" + this.type + ", status=" + this.status + ", param=" + this.param + ", response=" + this.response + i0XO1.IO;
    }

    public CommandBase(int r1, String r2, int r3) {
        this.opCode = r1;
        this.name = r2;
        this.type = r3;
    }
}
