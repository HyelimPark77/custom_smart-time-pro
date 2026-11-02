package com.jieli.jl_rcsp.model.device.health;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class FallDetection implements IHealthSettingToAttr {
    public static final byte MODE_BRIGHT = 0;
    public static final byte MODE_CALL = 2;
    public static final byte MODE_SHAKE = 1;
    private String contact;
    private boolean enable;
    private byte mode;

    public FallDetection(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r5) {
        if (r5 != null) goto L4;
        return;
    L4:
        if (r5.length == 0) goto L24;
        int r0 = 0;
        int r2 = 1;
        if (CHexConver.byteToInt(r5[0]) != 1) goto L9;
        boolean r1 = true;
    L10:
        this.enable = r1;
        if (r5.length < 2) goto L13;
        this.mode = r5[1];
        r2 = 2;
    L13:
        this.contact = "";
        int r3 = r2 + 1;
        if (r5.length < r3) goto L16;
        r0 = Math.min(CHexConver.byteToInt(r5[r2]), r5.length - r3);
        r2 = r3;
    L16:
        if (r0 > 0) goto L18;
        return;
    L18:
        if (r5.length < (r2 + r0)) goto L23;
        this.contact = new String(r5, r2, r0).trim();
        return;
    L23:
        return;
    L9:
        r1 = false;
        goto L10
    }

    private byte[] toData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(new byte[]{this.enable ? 1 : 0, this.mode});     // Catch: IOException -> L5
    L8:
        if (this.mode != 2) goto L17;
        if (TextUtils.isEmpty(this.contact) == true) goto L17;
        r0.write(this.contact.getBytes().length);     // Catch: IOException -> L14
        r0.write(this.contact.getBytes());     // Catch: IOException -> L14
    L14:
        e = move-exception;
        e.printStackTrace();
    L17:
        return r0.toByteArray();
    L5:
        e = move-exception;
        e.printStackTrace();
        goto L8
    }

    public String getContact() {
        return this.contact;
    }

    public byte getMode() {
        return this.mode;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 7;
    }

    public boolean isEnable() {
        return this.enable;
    }

    public FallDetection setContact(String r1) {
        this.contact = r1;
        return this;
    }

    public FallDetection setEnable(boolean r1) {
        this.enable = r1;
        return this;
    }

    public FallDetection setMode(byte r1) {
        this.mode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setAttrData(toData()).setType((byte) getType());
    }

    public String toString() {
        return "FallDetection{contact='" + this.contact + "', enable=" + this.enable + ", mode=" + this.mode + i0XO1.IO;
    }
}
