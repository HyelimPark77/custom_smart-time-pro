package com.jieli.jl_rcsp.model.device.health;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class EmergencyContact implements IHealthSettingToAttr {
    private String number;
    private int phoneLen;

    public EmergencyContact(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length == 0) goto L17;
        int r0 = CHexConver.byteToInt(r5[0]);
        this.phoneLen = r0;
        int r1 = Math.min(r5.length - 1, r0);
        this.phoneLen = r1;
        if (r5.length < (r1 + 1)) goto L16;
        this.number = new String(r5, 1, r1);     // Catch: Exception -> L10
        return;
    L10:
        e = move-exception;
        e.printStackTrace();
        return;
    L16:
        return;
    }

    private byte[] toData() {
        if (TextUtils.isEmpty(this.number) == true) goto L5;
        byte[] r0 = this.number.getBytes();
        int r2 = r0.length;
        ByteBuffer r1 = ByteBuffer.allocate(1 + r2);
        r1.put(CHexConver.intToByte(r2));
        r1.put(r0);
        return r1.array();
    L5:
        return new byte[]{0};
    }

    public String getNumber() {
        return this.number;
    }

    public int getPhoneLen() {
        return this.phoneLen;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 12;
    }

    public EmergencyContact setNumber(String r1) {
        this.number = r1;
        return this;
    }

    public EmergencyContact setPhoneLen(int r1) {
        this.phoneLen = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        AttrBean r0 = new AttrBean();
        r0.setAttrData(toData());
        r0.setType((byte) getType());
        return r0;
    }

    public String toString() {
        return "EmergencyContact{phoneLen=" + this.phoneLen + ", number='" + this.number + '\'' + i0XO1.IO;
    }
}
