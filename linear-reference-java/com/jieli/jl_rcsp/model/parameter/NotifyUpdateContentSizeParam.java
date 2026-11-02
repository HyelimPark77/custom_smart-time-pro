package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyUpdateContentSizeParam extends BaseParameter {
    private int contentSize;
    private int currentProgress;

    public NotifyUpdateContentSizeParam(int r1) {
        this.contentSize = r1;
        this.currentProgress = 0;
    }

    public int getContentSize() {
        return this.contentSize;
    }

    public int getCurrentProgress() {
        return this.currentProgress;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        if (this.currentProgress <= 0) goto L5;
        byte[] r0 = new byte[8];
        byte[] r1 = CHexConver.intToBigBytes(this.contentSize);
        byte[] r2 = CHexConver.intToBigBytes(this.currentProgress);
        System.arraycopy(r1, 0, r0, 0, r1.length);
        System.arraycopy(r2, 0, r0, r1.length, r2.length);
        return r0;
    L5:
        return CHexConver.intToBigBytes(this.contentSize);
    }

    public NotifyUpdateContentSizeParam setContentSize(int r1) {
        this.contentSize = r1;
        return this;
    }

    public NotifyUpdateContentSizeParam setCurrentProgress(int r1) {
        this.currentProgress = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "NotifyUpdateContentSizeParam{contentSize=" + this.contentSize + ", currentProgress=" + this.currentProgress + "} " + super.toString();
    }
}
