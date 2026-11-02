package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ExternalFlashIOCtrlParam extends BaseParameter {
    private short crc16;
    private byte[] data;
    private String filePath;
    private int flag;
    private boolean isFinalData;
    private boolean isOpEnd;
    private int offset;
    private int op;
    private int size;
    private int watchOp;

    public ExternalFlashIOCtrlParam() {
        this.isFinalData = true;
        this.isOpEnd = false;
        this.watchOp = 0;
    }

    private int getParamSize() {
        int r0 = this.op;
        if (r0 != 8) goto L5;
        return 4;
    L5:
        if (r0 != 11) goto L7;
        String r1 = this.filePath;
        if (r1 != null) goto L48;
    L49:
        return 2;
    L48:
        return r1.getBytes().length + 2;
    L7:
        if (r0 != 0) goto L9;
        byte[] r2 = this.data;
        if (r2 != null) goto L43;
        return 6;
    L43:
        return r2.length + 6;
    L9:
        if (r0 == 1) goto L39;
        if (r0 == 2) goto L33;
        if (r0 == 3) goto L22;
        if (r0 == 4) goto L39;
        if (r0 != 5) goto L49;
        if (this.isOpEnd == true) goto L49;
        String r3 = this.filePath;
        if (r3 == null) goto L49;
        return r3.getBytes().length + 2;
    L22:
        int r4 = this.watchOp;
        if (r4 == 1) goto L28;
        if (r4 == 2) goto L28;
        if (r4 == 3) goto L28;
        if (r4 == 4) goto L28;
        if (r4 != 5) goto L49;
    L28:
        String r5 = this.filePath;
        if (r5 == null) goto L49;
        return 2 + r5.getBytes().length;
    L33:
        if (this.isOpEnd == true) goto L49;
        String r6 = this.filePath;
        if (r6 != null) goto L37;
        return 6;
    L37:
        return r6.getBytes().length + 6;
    L39:
        return 8;
    }

    public short getCrc16() {
        return this.crc16;
    }

    public byte[] getData() {
        return this.data;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public int getFlag() {
        return this.flag;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getOp() {
        return this.op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[getParamSize()];
        r0[0] = CHexConver.intToByte(this.op);
        r0[1] = CHexConver.intToByte(this.flag);
        int r1 = this.op;
        if (r1 != 8) goto L5;
        System.arraycopy(CHexConver.shortToBigBytes(this.crc16), 0, r0, 2, 2);
        return r0;
    L5:
        if (r1 != 11) goto L7;
        String r2 = this.filePath;
        if (r2 != null) goto L54;
    L56:
        return r0;
    L54:
        if (r2.getBytes().length <= 0) goto L56;
        System.arraycopy(this.filePath.getBytes(), 0, r0, 2, this.filePath.getBytes().length);
        goto L56
    L7:
        if (r1 == 0) goto L45;
        if (r1 == 1) goto L43;
        if (r1 == 2) goto L36;
        if (r1 == 3) goto L23;
        if (r1 == 4) goto L43;
        if (r1 != 5) goto L56;
        if (this.isOpEnd == true) goto L56;
        String r3 = this.filePath;
        if (r3 == null) goto L56;
        if (r3.getBytes().length <= 0) goto L56;
        System.arraycopy(this.filePath.getBytes(), 0, r0, 2, this.filePath.getBytes().length);
        return r0;
    L23:
        int r4 = this.watchOp;
        if (r4 == 1) goto L29;
        if (r4 == 2) goto L29;
        if (r4 == 3) goto L29;
        if (r4 == 4) goto L29;
        if (r4 != 5) goto L56;
    L29:
        String r5 = this.filePath;
        if (r5 == null) goto L56;
        if (r5.getBytes().length <= 0) goto L56;
        System.arraycopy(this.filePath.getBytes(), 0, r0, 2, this.filePath.getBytes().length);
        return r0;
    L36:
        if (this.isOpEnd == true) goto L56;
        System.arraycopy(CHexConver.intToBigBytes(this.size), 0, r0, 2, 4);
        String r6 = this.filePath;
        if (r6 == null) goto L56;
        if (r6.getBytes().length <= 0) goto L56;
        System.arraycopy(this.filePath.getBytes(), 0, r0, 6, this.filePath.getBytes().length);
        return r0;
    L43:
        System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, r0, 2, 4);
        System.arraycopy(CHexConver.int2byte2(this.size), 0, r0, 6, 2);
        return r0;
    L45:
        System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, r0, 2, 4);
        byte[] r7 = this.data;
        if (r7 == null) goto L56;
        if (r7.length <= 0) goto L56;
        System.arraycopy(r7, 0, r0, 6, r7.length);
        return r0;
    }

    public int getSize() {
        return this.size;
    }

    public int getWatchOp() {
        return this.watchOp;
    }

    public boolean isFinalData() {
        return this.isFinalData;
    }

    public boolean isOpEnd() {
        return this.isOpEnd;
    }

    public ExternalFlashIOCtrlParam setCrc16(short r1) {
        this.crc16 = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setFilePath(String r1) {
        this.filePath = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setFinalData(boolean r1) {
        this.isFinalData = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setFlag(int r4) {
        this.flag = r4;
        if ((r4 & 1) != 0) goto L5;
        boolean r0 = true;
    L6:
        int r2 = this.op;
        if (r2 == 0) goto L26;
        if (r2 == 1) goto L26;
        if (r2 != 2) goto L12;
    L24:
        setOpEnd(r0);
        return this;
    L12:
        if (r2 != 3) goto L14;
        setWatchOp(r4);
        return this;
    L14:
        if (r2 == 5) goto L24;
        if (r2 == 6) goto L24;
        if (r2 == 7) goto L24;
        if (r2 == 9) goto L24;
        return this;
    L26:
        setFinalData(r0);
        return this;
    L5:
        r0 = false;
        goto L6
    }

    public ExternalFlashIOCtrlParam setOffset(int r1) {
        this.offset = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setOp(int r1) {
        this.op = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setOpEnd(boolean r1) {
        this.isOpEnd = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setSize(int r1) {
        this.size = r1;
        return this;
    }

    public ExternalFlashIOCtrlParam setWatchOp(int r1) {
        this.watchOp = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "ExternalFlashIOCtrlParam{op=" + this.op + ", flag=" + this.flag + ", offset=" + this.offset + ", size=" + this.size + ", filePath='" + this.filePath + "', isFinalData=" + this.isFinalData + ", isOpEnd=" + this.isOpEnd + ", watchOp=" + this.watchOp + ", crc16=" + CHexConver.byte2HexStr(CHexConver.shortToBigBytes(this.crc16)) + "} " + super.toString();
    }
}
