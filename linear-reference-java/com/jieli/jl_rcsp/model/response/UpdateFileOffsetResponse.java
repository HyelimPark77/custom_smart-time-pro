package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class UpdateFileOffsetResponse extends CommonResponse {
    private int updateFileFlagLen;
    private int updateFileFlagOffset;

    public UpdateFileOffsetResponse() {
    }

    public int getUpdateFileFlagLen() {
        return this.updateFileFlagLen;
    }

    public int getUpdateFileFlagOffset() {
        return this.updateFileFlagOffset;
    }

    public UpdateFileOffsetResponse setUpdateFileFlagLen(int r1) {
        this.updateFileFlagLen = r1;
        return this;
    }

    public UpdateFileOffsetResponse setUpdateFileFlagOffset(int r1) {
        this.updateFileFlagOffset = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "UpdateFileOffsetResponse{updateFileFlagOffset=" + this.updateFileFlagOffset + ", updateFileFlagLen=" + this.updateFileFlagLen + i0XO1.IO;
    }
}
