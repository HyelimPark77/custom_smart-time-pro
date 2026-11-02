package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class StartFileBrowseParam extends BaseParameter {
    private PathData pathData;

    public StartFileBrowseParam(PathData r1) {
        this.pathData = r1;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        PathData r0 = this.pathData;
        if (r0 != null) goto L7;
        return new byte[0];
    L7:
        return r0.toData();
    }

    public PathData getPathData() {
        return this.pathData;
    }

    public StartFileBrowseParam setPathData(PathData r1) {
        this.pathData = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "StartFileBrowseParam{pathData=" + this.pathData + i0XO1.IO;
    }
}
