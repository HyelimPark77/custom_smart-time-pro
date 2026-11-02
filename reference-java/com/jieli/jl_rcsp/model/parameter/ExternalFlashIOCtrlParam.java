package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class ExternalFlashIOCtrlParam extends BaseParameter {
    private short crc16;
    private byte[] data;
    private String filePath;
    private int flag;
    private int offset;

    /* JADX INFO: renamed from: op */
    private int f38032op;
    private int size;
    private boolean isFinalData = true;
    private boolean isOpEnd = false;
    private int watchOp = 0;

    private int getParamSize() {
        String str;
        String str2;
        int i = this.f38032op;
        if (i == 8) {
            return 4;
        }
        if (i != 11) {
            if (i == 0) {
                byte[] bArr = this.data;
                if (bArr != null) {
                    return bArr.length + 6;
                }
                return 6;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int i2 = this.watchOp;
                        if ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) && (str = this.filePath) != null) {
                            return 2 + str.getBytes().length;
                        }
                    } else if (i != 4) {
                        if (i == 5 && !this.isOpEnd && (str2 = this.filePath) != null) {
                            return str2.getBytes().length + 2;
                        }
                    }
                } else if (!this.isOpEnd) {
                    String str3 = this.filePath;
                    if (str3 != null) {
                        return str3.getBytes().length + 6;
                    }
                    return 6;
                }
            }
            return 8;
        }
        String str4 = this.filePath;
        if (str4 != null) {
            return str4.getBytes().length + 2;
        }
        return 2;
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
        return this.f38032op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        String str;
        String str2;
        byte[] bArr = new byte[getParamSize()];
        bArr[0] = CHexConver.intToByte(this.f38032op);
        bArr[1] = CHexConver.intToByte(this.flag);
        int i = this.f38032op;
        if (i == 8) {
            System.arraycopy(CHexConver.shortToBigBytes(this.crc16), 0, bArr, 2, 2);
            return bArr;
        }
        if (i == 11) {
            String str3 = this.filePath;
            if (str3 != null && str3.getBytes().length > 0) {
                System.arraycopy(this.filePath.getBytes(), 0, bArr, 2, this.filePath.getBytes().length);
            }
        } else {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int i2 = this.watchOp;
                            if ((i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) && (str = this.filePath) != null && str.getBytes().length > 0) {
                                System.arraycopy(this.filePath.getBytes(), 0, bArr, 2, this.filePath.getBytes().length);
                                return bArr;
                            }
                        } else if (i != 4) {
                            if (i == 5 && !this.isOpEnd && (str2 = this.filePath) != null && str2.getBytes().length > 0) {
                                System.arraycopy(this.filePath.getBytes(), 0, bArr, 2, this.filePath.getBytes().length);
                                return bArr;
                            }
                        }
                    } else if (!this.isOpEnd) {
                        System.arraycopy(CHexConver.intToBigBytes(this.size), 0, bArr, 2, 4);
                        String str4 = this.filePath;
                        if (str4 != null && str4.getBytes().length > 0) {
                            System.arraycopy(this.filePath.getBytes(), 0, bArr, 6, this.filePath.getBytes().length);
                            return bArr;
                        }
                    }
                }
                System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, bArr, 2, 4);
                System.arraycopy(CHexConver.int2byte2(this.size), 0, bArr, 6, 2);
                return bArr;
            }
            System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, bArr, 2, 4);
            byte[] bArr2 = this.data;
            if (bArr2 != null && bArr2.length > 0) {
                System.arraycopy(bArr2, 0, bArr, 6, bArr2.length);
                return bArr;
            }
        }
        return bArr;
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

    public ExternalFlashIOCtrlParam setCrc16(short s) {
        this.crc16 = s;
        return this;
    }

    public ExternalFlashIOCtrlParam setData(byte[] bArr) {
        this.data = bArr;
        return this;
    }

    public ExternalFlashIOCtrlParam setFilePath(String str) {
        this.filePath = str;
        return this;
    }

    public ExternalFlashIOCtrlParam setFinalData(boolean z) {
        this.isFinalData = z;
        return this;
    }

    public ExternalFlashIOCtrlParam setFlag(int i) {
        this.flag = i;
        boolean z = (i & 1) == 0;
        int i2 = this.f38032op;
        if (i2 == 0 || i2 == 1) {
            setFinalData(z);
            return this;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                setWatchOp(i);
                return this;
            }
            if (i2 != 5 && i2 != 6 && i2 != 7 && i2 != 9) {
                return this;
            }
        }
        setOpEnd(z);
        return this;
    }

    public ExternalFlashIOCtrlParam setOffset(int i) {
        this.offset = i;
        return this;
    }

    public ExternalFlashIOCtrlParam setOp(int i) {
        this.f38032op = i;
        return this;
    }

    public ExternalFlashIOCtrlParam setOpEnd(boolean z) {
        this.isOpEnd = z;
        return this;
    }

    public ExternalFlashIOCtrlParam setSize(int i) {
        this.size = i;
        return this;
    }

    public ExternalFlashIOCtrlParam setWatchOp(int i) {
        this.watchOp = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "ExternalFlashIOCtrlParam{op=" + this.f38032op + ", flag=" + this.flag + ", offset=" + this.offset + ", size=" + this.size + ", filePath='" + this.filePath + "', isFinalData=" + this.isFinalData + ", isOpEnd=" + this.isOpEnd + ", watchOp=" + this.watchOp + ", crc16=" + CHexConver.byte2HexStr(CHexConver.shortToBigBytes(this.crc16)) + "} " + super.toString();
    }
}
