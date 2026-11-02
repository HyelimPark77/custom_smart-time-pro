package com.jieli.jl_rcsp.model.device;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import com.jieli.jl_rcsp.util.RcspUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: loaded from: classes17.dex */
public class NfcMsg {
    public static final int LIMIT_NFC_FILE_NAME = 6;
    public static final int LIMIT_NICKNAME = 24;
    private short crc16;
    private int devHandler;
    private short id;
    private String nfcFileName;
    private int nfcHeadLen;
    private byte[] nfcID;
    private String nickname;
    private byte[] reserve;
    private long updateTime;

    public NfcMsg() {
    }

    public static NfcMsg parseNfcMsg(byte[] r11) {
        String r0 = null;
        if (r11 != null) goto L5;
    L25:
        return null;
    L5:
        if (r11.length < 44) goto L25;
        int r1 = CHexConver.bytesToInt(r11, 42, 2);
        JL_Log.e("NfcMsg", "parseNfcMsg", "nfcHeadLen = " + r1 + ", data.len = " + r11.length);
        if (r11.length == (r1 + 44)) goto L10;
        return null;
    L10:
        ByteBuffer r12 = ByteBuffer.wrap(r11);
        r12.order(ByteOrder.BIG_ENDIAN);
        short r2 = r12.getShort();
        byte[] r3 = new byte[2];
        r12.get(r3);
        int r4 = r12.getInt();
        long r5 = RcspUtil.intToTime(r12.getInt());
        byte[] r7 = new byte[6];
        r12.get(r7);
        String r8 = new String(r7);     // Catch: Exception -> L13
    L15:
        byte[] r9 = new byte[24];
        r12.get(r9);
        r0 = new String(r9).trim();     // Catch: Exception -> L18
    L20:
        short r10 = r12.getShort();
        short r13 = 0;
        byte[] r14 = new byte[0];
        if (r10 <= 2) goto L24;
        r13 = r12.getShort();
        r14 = new byte[r10 - 2];
        r12.get(r14);
    L24:
        return new NfcMsg().setId(r2).setReserve(r3).setDevHandler(r4).setUpdateTime(r5).setNfcFileName(r8).setNickname(r0).setNfcHeadLen(r10).setCrc16(r13).setNfcID(r14);
    L18:
        e = move-exception;
        e.printStackTrace();
    L13:
        e = move-exception;
        e.printStackTrace();
        r8 = null;
        goto L15
    }

    public byte[] convertRawData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        r0.write(CHexConver.shortToBigBytes(this.id));     // Catch: Exception -> L6
        if (this.reserve != null) goto L8;
        this.reserve = new byte[2];     // Catch: Exception -> L6
    L8:
        r0.write(this.reserve);     // Catch: Exception -> L6
        r0.write(CHexConver.intToBigBytes(this.devHandler));     // Catch: Exception -> L6
        r0.write(CHexConver.intToBigBytes(RcspUtil.time2Int(this.updateTime)));     // Catch: Exception -> L6
        String r1 = this.nfcFileName;     // Catch: Exception -> L6
        if (r1 == null) goto L11;
        byte[] r5 = new byte[6];     // Catch: Exception -> L6
        byte[] r2 = r1.getBytes();     // Catch: Exception -> L6
        System.arraycopy(r2, 0, r5, 0, Math.min(24, r2.length));     // Catch: Exception -> L6
        r0.write(r5);     // Catch: Exception -> L6
    L11:
        String r3 = this.nickname;     // Catch: Exception -> L6
        if (r3 == null) goto L15;
        byte[] r6 = new byte[24];     // Catch: Exception -> L6
        byte[] r4 = r3.getBytes();     // Catch: Exception -> L6
        System.arraycopy(r4, 0, r6, 0, Math.min(24, r4.length));     // Catch: Exception -> L6
        r0.write(r6);     // Catch: Exception -> L6
    L15:
        if (this.nfcHeadLen != 0) goto L17;
        this.nfcHeadLen = this.nfcID.length + 2;     // Catch: Exception -> L6
    L17:
        r0.write(CHexConver.int2byte2(this.nfcHeadLen));     // Catch: Exception -> L6
        r0.write(CHexConver.shortToBigBytes(this.crc16));     // Catch: Exception -> L6
        r0.write(this.nfcID);     // Catch: Exception -> L6
    L21:
        return r0.toByteArray();
    L6:
        e = move-exception;
        e.printStackTrace();
        goto L21
    }

    public short getCrc16() {
        return this.crc16;
    }

    public int getDevHandler() {
        return this.devHandler;
    }

    public short getId() {
        return this.id;
    }

    public String getNfcFileName() {
        return this.nfcFileName;
    }

    public int getNfcHeadLen() {
        return this.nfcHeadLen;
    }

    public byte[] getNfcID() {
        return this.nfcID;
    }

    public String getNickname() {
        return this.nickname;
    }

    public byte[] getReserve() {
        return this.reserve;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public NfcMsg setCrc16(short r1) {
        this.crc16 = r1;
        return this;
    }

    public NfcMsg setDevHandler(int r1) {
        this.devHandler = r1;
        return this;
    }

    public NfcMsg setId(short r1) {
        this.id = r1;
        return this;
    }

    public NfcMsg setNfcFileName(String r1) {
        this.nfcFileName = r1;
        return this;
    }

    public NfcMsg setNfcHeadLen(int r1) {
        this.nfcHeadLen = r1;
        return this;
    }

    public NfcMsg setNfcID(byte[] r1) {
        this.nfcID = r1;
        return this;
    }

    public NfcMsg setNickname(String r1) {
        this.nickname = r1;
        return this;
    }

    public NfcMsg setReserve(byte[] r1) {
        this.reserve = r1;
        return this;
    }

    public NfcMsg setUpdateTime(long r1) {
        this.updateTime = r1;
        return this;
    }

    public String toString() {
        return "NfcMsg{id=" + this.id + ", reserve=" + Arrays.toString(this.reserve) + ", devHandler=" + this.devHandler + ", updateTime=" + this.updateTime + ", nfcFileName='" + this.nfcFileName + "', nickname='" + this.nickname + "', nfcHeadLen=" + this.nfcHeadLen + ", crc16=" + this.crc16 + ", nfcID=" + Arrays.toString(this.nfcID) + i0XO1.IO;
    }
}
