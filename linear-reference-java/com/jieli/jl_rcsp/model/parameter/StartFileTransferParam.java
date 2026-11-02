package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes17.dex */
public class StartFileTransferParam extends BaseParameter {
    private byte flag;
    private String path;
    private int size;

    public StartFileTransferParam(String r2, int r3) {
        if (r2 == null) goto L9;
        if (r2.isEmpty() == true) goto L9;
        this.path = r2;
        this.size = r3;
        return;
    L9:
        throw new IllegalArgumentException("文件路径不能为空!!!");
    }

    public StartFileTransferParam enableDataNeedResponse(boolean r1) {
        if (r1 == false) goto L5;
        this.flag = (byte) (this.flag | 1);
        return this;
    L5:
        this.flag = (byte) (this.flag & 254);
        return this;
    }

    public byte getFlag() {
        return this.flag;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = this.path.getBytes(StandardCharsets.UTF_8);
        byte[] r1 = new byte[r0.length + 5];
        r1[0] = this.flag;
        System.arraycopy(CHexConver.intToBigBytes(this.size), 0, r1, 1, 4);
        System.arraycopy(r0, 0, r1, 5, r0.length);
        return r1;
    }

    public String getPath() {
        return this.path;
    }

    public int getSize() {
        return this.size;
    }

    public StartFileTransferParam setFlag(byte r1) {
        this.flag = r1;
        return this;
    }

    public StartFileTransferParam setPath(String r1) {
        this.path = r1;
        return this;
    }

    public StartFileTransferParam setSize(int r1) {
        this.size = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "StartFileTransferParam{flag=" + this.flag + ", path='" + this.path + "', size=" + this.size + i0XO1.IO + "\n" + super.toString();
    }
}
