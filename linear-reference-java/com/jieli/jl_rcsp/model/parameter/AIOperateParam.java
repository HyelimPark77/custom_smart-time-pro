package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class AIOperateParam extends BaseParameter {
    private Integer aiDialFunUIState;
    private String aiDialStyle;
    private int flag;
    private int op;
    private Integer scaleZoomHeight;
    private Integer scaleZoomWidth;
    private String thumbPath;

    public static class AIOperateResultParam extends AIOperateParam {
        private final int result;

        public AIOperateResultParam(int r1) {
            this.result = r1;
        }

        @Override // com.jieli.jl_rcsp.model.parameter.AIOperateParam, com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
        public byte[] getParamData() {
            return new byte[]{CHexConver.intToByte(this.result)};
        }

        public int getResult() {
            return this.result;
        }
    }

    public AIOperateParam() {
    }

    private int getParamSize() {
        if (this.op != 0) goto L23;
        int r0 = this.flag;
        if (r0 != 0) goto L13;
        String r1 = this.aiDialStyle;
        if (r1 == null) goto L23;
        int r2 = r1.getBytes().length;
    L11:
        return r2 + 2;
    L13:
        if (r0 != 1) goto L19;
        if (this.aiDialFunUIState == null) goto L23;
        return 3;
    L19:
        if (r0 != 4) goto L23;
        String r3 = this.thumbPath;
        if (r3 == null) goto L23;
        r2 = r3.getBytes().length;
    L23:
        return 2;
    }

    public Integer getAiDialFunUIState() {
        return this.aiDialFunUIState;
    }

    public String getAiDialStyle() {
        return this.aiDialStyle;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getOp() {
        return this.op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[getParamSize()];
        r0[0] = CHexConver.intToByte(this.op);
        r0[1] = CHexConver.intToByte(this.flag);
        if (this.op != 0) goto L21;
        int r1 = this.flag;
        if (r1 != 0) goto L11;
        String r2 = this.aiDialStyle;
        if (r2 == null) goto L21;
        byte[] r3 = r2.getBytes();
        System.arraycopy(r3, 0, r0, 2, r3.length);
        return r0;
    L11:
        if (r1 != 1) goto L17;
        Integer r4 = this.aiDialFunUIState;
        if (r4 == null) goto L21;
        r0[2] = CHexConver.intToByte(r4.intValue());
        return r0;
    L17:
        if (r1 != 4) goto L21;
        String r5 = this.thumbPath;
        if (r5 == null) goto L21;
        byte[] r6 = r5.getBytes();
        System.arraycopy(r6, 0, r0, 2, r6.length);
    L21:
        return r0;
    }

    public Integer getScaleZoomHeight() {
        return this.scaleZoomHeight;
    }

    public Integer getScaleZoomWidth() {
        return this.scaleZoomWidth;
    }

    public String getThumbPath() {
        return this.thumbPath;
    }

    public AIOperateParam setAiDialFunUIState(Integer r1) {
        this.aiDialFunUIState = r1;
        return this;
    }

    public AIOperateParam setAiDialStyle(String r1) {
        this.aiDialStyle = r1;
        return this;
    }

    public AIOperateParam setFlag(int r1) {
        this.flag = r1;
        return this;
    }

    public AIOperateParam setOp(int r1) {
        this.op = r1;
        return this;
    }

    public AIOperateParam setScaleZoomHeight(Integer r1) {
        this.scaleZoomHeight = r1;
        return this;
    }

    public AIOperateParam setScaleZoomWidth(Integer r1) {
        this.scaleZoomWidth = r1;
        return this;
    }

    public AIOperateParam setThumbPath(String r1) {
        this.thumbPath = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "AIOperateParam{op=" + this.op + ", flag=" + this.flag + ", aiDialStyle='" + this.aiDialStyle + "', aiDialFunUIState=" + this.aiDialFunUIState + ", thumbPath='" + this.thumbPath + '\'' + i0XO1.IO;
    }
}
