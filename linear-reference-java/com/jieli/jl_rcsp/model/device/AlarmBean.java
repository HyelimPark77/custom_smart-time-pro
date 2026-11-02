package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class AlarmBean {
    private int bellCluster;
    private String bellName;
    private byte bellType;
    private byte devIndex;
    private byte hour;
    private byte index;
    private byte min;
    private String name;
    private boolean open;
    private byte repeatMode;
    private String reserved;
    private int version;

    public AlarmBean() {
    }

    public static AttrBean toAttrbean(AlarmBean r1, boolean r2) {
        ArrayList r0 = new ArrayList();
        r0.add(r1);
        return toAttrbean(r0, r2);
    }

    public AlarmBean copy() {
        return new AlarmBean().setIndex(getIndex()).setHour(getHour()).setMin(getMin()).setName(getName()).setRepeatMode(getRepeatMode()).setReserved(getReserved()).setBellType(this.bellType).setBellName(this.bellName).setBellCluster(this.bellCluster).setVersion(this.version).setDevIndex(this.devIndex).setOpen(isOpen());
    }

    public int getBellCluster() {
        return this.bellCluster;
    }

    public String getBellName() {
        return this.bellName;
    }

    public byte getBellType() {
        return this.bellType;
    }

    public byte getDevIndex() {
        return this.devIndex;
    }

    public byte getHour() {
        return this.hour;
    }

    public byte getIndex() {
        return this.index;
    }

    public byte getMin() {
        return this.min;
    }

    public String getName() {
        String r0 = this.name;
        if (r0 != null) goto L6;
        return "";
    L6:
        return r0;
    }

    public byte getRepeatMode() {
        return this.repeatMode;
    }

    public String getReserved() {
        return this.reserved;
    }

    public int getVersion() {
        return this.version;
    }

    public boolean isOpen() {
        return this.open;
    }

    public AlarmBean setBellCluster(int r1) {
        this.bellCluster = r1;
        return this;
    }

    public AlarmBean setBellName(String r1) {
        this.bellName = r1;
        return this;
    }

    public AlarmBean setBellType(byte r1) {
        this.bellType = r1;
        return this;
    }

    public AlarmBean setDevIndex(byte r1) {
        this.devIndex = r1;
        return this;
    }

    public AlarmBean setHour(byte r1) {
        this.hour = r1;
        return this;
    }

    public AlarmBean setIndex(byte r1) {
        this.index = r1;
        return this;
    }

    public AlarmBean setMin(byte r1) {
        this.min = r1;
        return this;
    }

    public AlarmBean setName(String r1) {
        this.name = r1;
        return this;
    }

    public AlarmBean setOpen(boolean r1) {
        this.open = r1;
        return this;
    }

    public AlarmBean setRepeatMode(byte r1) {
        this.repeatMode = r1;
        return this;
    }

    public AlarmBean setReserved(String r1) {
        this.reserved = r1;
        return this;
    }

    public AlarmBean setVersion(int r1) {
        this.version = r1;
        return this;
    }

    public String toString() {
        return "AlarmBean{index=" + this.index + ", name='" + this.name + "', hour=" + this.hour + ", min=" + this.min + ", repeatMode=" + this.repeatMode + ", reserved='" + this.reserved + "', open=" + this.open + ", bellType=" + this.bellType + ", bellCluster=" + this.bellCluster + ", bellName='" + this.bellName + "', devIndex='" + this.devIndex + "', version='" + this.version + '\'' + i0XO1.IO;
    }

    public static AttrBean toAttrbean(List<AlarmBean> r10, boolean r11) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 1);
        int r2 = 2;
        int r3 = 0;
        if (r11 == false) goto L8;
        byte[] r12 = new byte[r10.size() + 2];
        r12[0] = 1;
        r12[1] = (byte) r10.size();
        Iterator<AlarmBean> r13 = r10.iterator();
    L6:
        if (r13.hasNext() == false) goto L24;
        r12[r2] = r13.next().getIndex();
        r2 = r2 + 1;
    L24:
        r0.setAttrData(r12);
        return r0;
    L8:
        ArrayList r14 = new ArrayList();
        Iterator<AlarmBean> r4 = r10.iterator();
    L10:
        if (r4.hasNext() == false) goto L19;
        AlarmBean r5 = r4.next();
        r14.add(Byte.valueOf(r5.getIndex()));
        r14.add(Byte.valueOf(r5.isOpen() ? 1 : 0));
        r14.add(Byte.valueOf(r5.getRepeatMode()));
        r14.add(Byte.valueOf(r5.getHour()));
        r14.add(Byte.valueOf(r5.getMin()));
        byte[] r6 = r5.getName().getBytes();
        r14.add(Byte.valueOf((byte) r6.length));
        int r7 = r6.length;
        int r8 = 0;
    L12:
        if (r8 >= r7) goto L15;
        r14.add(Byte.valueOf(r6[r8]));
        r8 = r8 + 1;
        goto L12
    L15:
        if (r5.version != 1) goto L10;
        r14.add(Byte.valueOf(r5.bellType));
        r14.add(Byte.valueOf(r5.devIndex));
        r14.add(Byte.valueOf((byte) (r5.bellCluster >> 24)));
        r14.add(Byte.valueOf((byte) ((r5.bellCluster >> 16) & 255)));
        r14.add(Byte.valueOf((byte) ((r5.bellCluster >> 8) & 255)));
        r14.add(Byte.valueOf((byte) (r5.bellCluster & 255)));
        byte[] r9 = r5.getBellName().getBytes();
        r14.add(Byte.valueOf((byte) r9.length));
        int r15 = r9.length;
        int r16 = 0;
    L17:
        if (r16 >= r15) goto L10;
        r14.add(Byte.valueOf(r9[r16]));
        r16 = r16 + 1;
        goto L17
    L19:
        byte[] r17 = new byte[r14.size() + 2];
        r17[0] = 0;
        r17[1] = (byte) r10.size();
    L21:
        if (r3 >= r14.size()) goto L23;
        r17[r3 + 2] = ((Byte) r14.get(r3)).byteValue();
        r3 = r3 + 1;
        goto L21
    L23:
        r12 = r17;
        goto L24
    }
}
