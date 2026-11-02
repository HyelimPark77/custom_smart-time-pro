package com.jieli.jl_rcsp.model.device.health;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.util.CHexConver;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes17.dex */
public class UserInfo implements IHealthSettingToAttr {
    public static final int SEX_MAN = 1;
    public static final int SEX_WOMAN = 0;
    private byte birthDay;
    private byte birthMonth;
    private int birthYear;
    private short height;
    private byte sex;
    private short weight;

    public UserInfo(byte[] r1) {
        parseData(r1);
    }

    private void parseData(byte[] r4) {
        if (r4 != null) goto L4;
        return;
    L4:
        if (r4.length == 0) goto L28;
        int r1 = 2;
        if (r4.length < 2) goto L9;
        this.height = CHexConver.bytesToShort(r4[0], r4[1]);
    L10:
        int r2 = r1 + 2;
        if (r4.length < r2) goto L13;
        this.weight = CHexConver.bytesToShort(r4[r1], r4[r1 + 1]);
        r1 = r2;
    L13:
        int r3 = r1 + 2;
        if (r4.length < r3) goto L16;
        this.birthYear = CHexConver.bytesToInt(r4[r1], r4[r1 + 1]);
        r1 = r3;
    L16:
        int r5 = r1 + 1;
        if (r4.length < r5) goto L19;
        this.birthMonth = r4[r1];
        r1 = r5;
    L19:
        int r6 = r1 + 1;
        if (r4.length < r6) goto L23;
        this.birthDay = r4[r1];
        r1 = r6;
    L23:
        if (r4.length < (r1 + 1)) goto L27;
        this.sex = r4[r1];
        return;
    L27:
        return;
    L9:
        r1 = 0;
        goto L10
    }

    private byte[] toData() {
        return ByteBuffer.allocate(9).putShort(this.height).putShort(this.weight).putShort((short) this.birthYear).put(this.birthMonth).put(this.birthDay).put(this.sex).array();
    }

    public byte getBirthDay() {
        return this.birthDay;
    }

    public byte getBirthMonth() {
        return this.birthMonth;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public short getHeight() {
        return this.height;
    }

    public byte getSex() {
        return this.sex;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public int getType() {
        return 9;
    }

    public short getWeight() {
        return this.weight;
    }

    public UserInfo setBirthDay(byte r1) {
        this.birthDay = r1;
        return this;
    }

    public UserInfo setBirthMonth(byte r1) {
        this.birthMonth = r1;
        return this;
    }

    public UserInfo setBirthYear(int r1) {
        this.birthYear = r1;
        return this;
    }

    public UserInfo setHeight(short r1) {
        this.height = r1;
        return this;
    }

    public UserInfo setSex(byte r1) {
        this.sex = r1;
        return this;
    }

    public UserInfo setWeight(short r1) {
        this.weight = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr
    public AttrBean toAttr() {
        return new AttrBean().setType((byte) getType()).setAttrData(toData());
    }

    public String toString() {
        return "UserInfo{height=" + this.height + ", weight=" + this.weight + ", year=" + this.birthYear + ", month=" + this.birthMonth + ", day=" + this.birthDay + ", sex=" + this.sex + i0XO1.IO;
    }
}
