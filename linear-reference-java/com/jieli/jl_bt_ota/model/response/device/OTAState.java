package com.jieli.jl_bt_ota.model.response.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class OTAState implements IDataOp {
    public static final int EXPAND_MODE_NONE = 0;
    public static final int EXPAND_MODE_REUSE_SPACE_OTA_ONLY_CODE = 3;
    public static final int EXPAND_MODE_REUSE_SPACE_OTA_ONLY_RESOURCE = 2;
    public static final int EXPAND_MODE_UPDATE_RESOURCE = 1;
    private int expandMode;
    private int mandatoryUpgradeFlag;
    private int requestOtaFlag;

    public OTAState() {
    }

    public int getExpandMode() {
        return this.expandMode;
    }

    public int getMandatoryUpgradeFlag() {
        return this.mandatoryUpgradeFlag;
    }

    public int getRequestOtaFlag() {
        return this.requestOtaFlag;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r3) {
        if (r3 != null) goto L4;
        return 0;
    L4:
        if (r3.length < 1) goto L16;
        ByteBuffer r4 = ByteBuffer.wrap(r3);
        this.mandatoryUpgradeFlag = CHexConver.byteToInt(r4.get());
        if (r4.hasRemaining() == false) goto L10;
        this.requestOtaFlag = CHexConver.byteToInt(r4.get());
    L10:
        if (r4.hasRemaining() == false) goto L13;
        this.expandMode = CHexConver.byteToInt(r4.get());
    L13:
        return r4.position();
    L16:
        return 0;
    }

    public OTAState setExpandMode(int r1) {
        this.expandMode = r1;
        return this;
    }

    public OTAState setMandatoryUpgradeFlag(int r1) {
        this.mandatoryUpgradeFlag = r1;
        return this;
    }

    public OTAState setRequestOtaFlag(int r1) {
        this.requestOtaFlag = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(this.mandatoryUpgradeFlag);
        r0.write(this.requestOtaFlag);
        r0.write(this.expandMode);
        return r0.toByteArray();
    }

    public String toString() {
        return "OTAState{mandatoryUpgradeFlag=" + this.mandatoryUpgradeFlag + ", requestOtaFlag=" + this.requestOtaFlag + ", expandMode=" + this.expandMode + i0XO1.IO;
    }
}
