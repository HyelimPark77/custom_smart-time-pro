package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StartFileBrowseResponse extends CommonResponse {
    private int totalFile;

    public int getTotalFile() {
        return this.totalFile;
    }

    public StartFileBrowseResponse setTotalFile(int i) {
        this.totalFile = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "StartFileBrowseResponse{totalFile" + this.totalFile + i0XO1.f7442IO;
    }
}
