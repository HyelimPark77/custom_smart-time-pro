package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.util.CommonUtil;
import java.util.Objects;

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

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L15:
        return false;
    L8:
        if (getClass() != r5.getClass()) goto L15;
        CommandBase r6 = (CommandBase) r5;
        if (this.OpCodeSn != r6.OpCodeSn) goto L15;
        if (this.opCode != r6.opCode) goto L15;
        return true;
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

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.OpCodeSn), Integer.valueOf(this.opCode)});
    }

    public boolean isResponseCmd() {
        int r0 = this.type;
        if (r0 == 2) goto L14;
        if (r0 == 3) goto L8;
        return false;
    L8:
        if (this.param == null) goto L10;
    L12:
        return false;
    L10:
        if (this.response == null) goto L12;
        return true;
    L14:
        if (this.param != null) goto L16;
    L18:
        return false;
    L16:
        if (this.response == null) goto L18;
        return true;
    }

    public CommandBase setOpCodeSn(int r1) {
        this.OpCodeSn = r1;
        return this;
    }

    public CommandBase setParam(P r1) {
        this.param = r1;
        return this;
    }

    public CommandBase setResponse(R r1) {
        this.response = r1;
        return this;
    }

    public CommandBase setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public String toString() {
        return "CommandBase{OpCodeSn=" + CommonUtil.formatInt(this.OpCodeSn) + ", opCode=" + CommonUtil.formatInt(this.opCode) + ", name='" + this.name + "', type=" + this.type + ", status=" + this.status + ",\n param=" + this.param + ",\n response=" + this.response + i0XO1.IO;
    }

    public CommandBase(int r1, String r2, int r3) {
        this.opCode = r1;
        this.name = r2;
        this.type = r3;
    }
}
