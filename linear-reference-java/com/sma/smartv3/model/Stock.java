package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Stock extends JsonFieldContainer implements Serializable {

    @aa1
    private String code;

    @aa1
    private String country;

    @aa1
    private String currency;

    @aa1
    private String exchange;

    @aa1
    private String exchangeInfo;
    private int id;

    @aa1
    private String isin;

    @aa1
    private String name;
    private float previousClose;

    @aa1
    private String previousCloseDate;
    private float realTimeChange;
    private float realTimeChangePercentage;
    private float realTimeClose;
    private int realTimeGmtOffset;
    private float realTimeHigh;
    private float realTimeLow;
    private float realTimeOpen;
    private float realTimePreviousClose;
    private long realTimeStamp;

    @aa1
    private String realTimeStampRead;
    private long realTimeVolume;

    @aa1
    private String type;
    private long updateTime;

    public Stock() {
        int r1 = 0;
        float r2 = 0.0f;
        String r3 = null;
        long r4 = 0;
        String r6 = null;
        int r7 = 0;
        float r8 = 0.0f;
        float r9 = 0.0f;
        float r10 = 0.0f;
        float r11 = 0.0f;
        long r12 = 0;
        float r14 = 0.0f;
        float r15 = 0.0f;
        float r16 = 0.0f;
        long r17 = 0;
        String r19 = null;
        String r20 = null;
        String r21 = null;
        String r22 = null;
        String r23 = null;
        String r24 = null;
        String r25 = null;
        String r26 = null;
        this(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, 8388607, null);
    }

    public static /* synthetic */ Stock copy$default(Stock r17, int r18, float r19, String r20, long r21, String r23, int r24, float r25, float r26, float r27, float r28, long r29, float r31, float r32, float r33, long r34, String r36, String r37, String r38, String r39, String r40, String r41, String r42, String r43, int r44, Object r45) {
        if ((r44 & 1) == 0) goto L5;
        int r2 = r17.id;
    L7:
        if ((r44 & 2) == 0) goto L9;
        float r3 = r17.previousClose;
    L11:
        if ((r44 & 4) == 0) goto L13;
        String r4 = r17.previousCloseDate;
    L15:
        if ((r44 & 8) == 0) goto L17;
        long r5 = r17.realTimeStamp;
    L19:
        if ((r44 & 16) == 0) goto L21;
        String r7 = r17.realTimeStampRead;
    L23:
        if ((r44 & 32) == 0) goto L25;
        int r8 = r17.realTimeGmtOffset;
    L27:
        if ((r44 & 64) == 0) goto L29;
        float r9 = r17.realTimeOpen;
    L31:
        if ((r44 & 128) == 0) goto L33;
        float r10 = r17.realTimeHigh;
    L35:
        if ((r44 & 256) == 0) goto L37;
        float r11 = r17.realTimeLow;
    L39:
        if ((r44 & 512) == 0) goto L41;
        float r12 = r17.realTimeClose;
    L43:
        if ((r44 & 1024) == 0) goto L45;
        long r13 = r17.realTimeVolume;
    L47:
        if ((r44 & 2048) == 0) goto L49;
        float r15 = r17.realTimeChange;
    L50:
        int r110 = r2;
        if ((r44 & 4096) == 0) goto L53;
        float r6 = r17.realTimeChangePercentage;
    L54:
        float r111 = r6;
        if ((r44 & 8192) == 0) goto L57;
        float r14 = r17.realTimePreviousClose;
    L58:
        float r22 = r14;
        if ((r44 & 16384) == 0) goto L61;
        long r1 = r17.updateTime;
    L62:
        long r210 = r1;
        if ((r44 & 32768) == 0) goto L65;
        String r16 = r17.country;
    L67:
        if ((r44 & 65536) == 0) goto L69;
        String r30 = r17.currency;
    L70:
        String r211 = r16;
        if ((r44 & 131072) == 0) goto L73;
        String r35 = r17.name;
    L74:
        String r212 = r35;
        if ((r44 & 262144) == 0) goto L77;
        String r46 = r17.type;
    L78:
        String r213 = r46;
        if ((r44 & 524288) == 0) goto L81;
        String r47 = r17.code;
    L82:
        String r214 = r47;
        if ((r44 & 1048576) == 0) goto L85;
        String r48 = r17.exchange;
    L86:
        String r215 = r48;
        if ((r44 & 2097152) == 0) goto L89;
        String r49 = r17.exchangeInfo;
    L91:
        if ((r44 & 4194304) == 0) goto L94;
        String r216 = r49;
        String r410 = r216;
        String r411 = r17.isin;
    L96:
        return r17.copy(r110, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r15, r111, r22, r210, r211, r30, r212, r213, r214, r215, r410, r411);
    L94:
        r411 = r43;
        r410 = r49;
        goto L96
    L89:
        r49 = r42;
        goto L91
    L85:
        r48 = r41;
        goto L86
    L81:
        r47 = r40;
        goto L82
    L77:
        r46 = r39;
        goto L78
    L73:
        r35 = r38;
        goto L74
    L69:
        r30 = r37;
        goto L70
    L65:
        r16 = r36;
        goto L67
    L61:
        r1 = r34;
        goto L62
    L57:
        r14 = r33;
        goto L58
    L53:
        r6 = r32;
        goto L54
    L49:
        r15 = r31;
        goto L50
    L45:
        r13 = r29;
        goto L47
    L41:
        r12 = r28;
        goto L43
    L37:
        r11 = r27;
        goto L39
    L33:
        r10 = r26;
        goto L35
    L29:
        r9 = r25;
        goto L31
    L25:
        r8 = r24;
        goto L27
    L21:
        r7 = r23;
        goto L23
    L17:
        r5 = r21;
        goto L19
    L13:
        r4 = r20;
        goto L15
    L9:
        r3 = r19;
        goto L11
    L5:
        r2 = r18;
        goto L7
    }

    public final int component1() {
        return this.id;
    }

    public final float component10() {
        return this.realTimeClose;
    }

    public final long component11() {
        return this.realTimeVolume;
    }

    public final float component12() {
        return this.realTimeChange;
    }

    public final float component13() {
        return this.realTimeChangePercentage;
    }

    public final float component14() {
        return this.realTimePreviousClose;
    }

    public final long component15() {
        return this.updateTime;
    }

    @aa1
    public final String component16() {
        return this.country;
    }

    @aa1
    public final String component17() {
        return this.currency;
    }

    @aa1
    public final String component18() {
        return this.name;
    }

    @aa1
    public final String component19() {
        return this.type;
    }

    public final float component2() {
        return this.previousClose;
    }

    @aa1
    public final String component20() {
        return this.code;
    }

    @aa1
    public final String component21() {
        return this.exchange;
    }

    @aa1
    public final String component22() {
        return this.exchangeInfo;
    }

    @aa1
    public final String component23() {
        return this.isin;
    }

    @aa1
    public final String component3() {
        return this.previousCloseDate;
    }

    public final long component4() {
        return this.realTimeStamp;
    }

    @aa1
    public final String component5() {
        return this.realTimeStampRead;
    }

    public final int component6() {
        return this.realTimeGmtOffset;
    }

    public final float component7() {
        return this.realTimeOpen;
    }

    public final float component8() {
        return this.realTimeHigh;
    }

    public final float component9() {
        return this.realTimeLow;
    }

    @aa1
    public final Stock copy(int r29, float r30, @aa1 String r31, long r32, @aa1 String r34, int r35, float r36, float r37, float r38, float r39, long r40, float r42, float r43, float r44, long r45, @aa1 String r47, @aa1 String r48, @aa1 String r49, @aa1 String r50, @aa1 String r51, @aa1 String r52, @aa1 String r53, @aa1 String r54) {
        Intrinsics.X0O(r31, "previousCloseDate");
        Intrinsics.X0O(r34, "realTimeStampRead");
        Intrinsics.X0O(r47, "country");
        Intrinsics.X0O(r48, "currency");
        Intrinsics.X0O(r49, "name");
        Intrinsics.X0O(r50, "type");
        Intrinsics.X0O(r51, "code");
        Intrinsics.X0O(r52, "exchange");
        Intrinsics.X0O(r53, "exchangeInfo");
        Intrinsics.X0O(r54, "isin");
        return new Stock(r29, r30, r31, r32, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r47, r48, r49, r50, r51, r52, r53, r54);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Stock) == true) goto L8;
        return false;
    L8:
        Stock r9 = (Stock) r8;
        if (this.id == r9.id) goto L12;
        return false;
    L12:
        if (Float.compare(this.previousClose, r9.previousClose) == 0) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.previousCloseDate, r9.previousCloseDate) == true) goto L18;
        return false;
    L18:
        if (this.realTimeStamp == r9.realTimeStamp) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.realTimeStampRead, r9.realTimeStampRead) == true) goto L24;
        return false;
    L24:
        if (this.realTimeGmtOffset == r9.realTimeGmtOffset) goto L27;
        return false;
    L27:
        if (Float.compare(this.realTimeOpen, r9.realTimeOpen) == 0) goto L30;
        return false;
    L30:
        if (Float.compare(this.realTimeHigh, r9.realTimeHigh) == 0) goto L33;
        return false;
    L33:
        if (Float.compare(this.realTimeLow, r9.realTimeLow) == 0) goto L36;
        return false;
    L36:
        if (Float.compare(this.realTimeClose, r9.realTimeClose) == 0) goto L39;
        return false;
    L39:
        if (this.realTimeVolume == r9.realTimeVolume) goto L42;
        return false;
    L42:
        if (Float.compare(this.realTimeChange, r9.realTimeChange) == 0) goto L45;
        return false;
    L45:
        if (Float.compare(this.realTimeChangePercentage, r9.realTimeChangePercentage) == 0) goto L48;
        return false;
    L48:
        if (Float.compare(this.realTimePreviousClose, r9.realTimePreviousClose) == 0) goto L51;
        return false;
    L51:
        if (this.updateTime == r9.updateTime) goto L54;
        return false;
    L54:
        if (Intrinsics.XOO0ii0(this.country, r9.country) == true) goto L57;
        return false;
    L57:
        if (Intrinsics.XOO0ii0(this.currency, r9.currency) == true) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.name, r9.name) == true) goto L63;
        return false;
    L63:
        if (Intrinsics.XOO0ii0(this.type, r9.type) == true) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.code, r9.code) == true) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.exchange, r9.exchange) == true) goto L72;
        return false;
    L72:
        if (Intrinsics.XOO0ii0(this.exchangeInfo, r9.exchangeInfo) == true) goto L75;
        return false;
    L75:
        if (Intrinsics.XOO0ii0(this.isin, r9.isin) == true) goto L77;
        return false;
    L77:
        return true;
    }

    @aa1
    public final String getCode() {
        return this.code;
    }

    @aa1
    public final String getCountry() {
        return this.country;
    }

    @aa1
    public final String getCurrency() {
        return this.currency;
    }

    @aa1
    public final String getExchange() {
        return this.exchange;
    }

    @aa1
    public final String getExchangeInfo() {
        return this.exchangeInfo;
    }

    public final int getId() {
        return this.id;
    }

    @aa1
    public final String getIsin() {
        return this.isin;
    }

    @aa1
    public final String getName() {
        return this.name;
    }

    public final float getPreviousClose() {
        return this.previousClose;
    }

    @aa1
    public final String getPreviousCloseDate() {
        return this.previousCloseDate;
    }

    public final float getRealTimeChange() {
        return this.realTimeChange;
    }

    public final float getRealTimeChangePercentage() {
        return this.realTimeChangePercentage;
    }

    public final float getRealTimeClose() {
        return this.realTimeClose;
    }

    public final int getRealTimeGmtOffset() {
        return this.realTimeGmtOffset;
    }

    public final float getRealTimeHigh() {
        return this.realTimeHigh;
    }

    public final float getRealTimeLow() {
        return this.realTimeLow;
    }

    public final float getRealTimeOpen() {
        return this.realTimeOpen;
    }

    public final float getRealTimePreviousClose() {
        return this.realTimePreviousClose;
    }

    public final long getRealTimeStamp() {
        return this.realTimeStamp;
    }

    @aa1
    public final String getRealTimeStampRead() {
        return this.realTimeStampRead;
    }

    public final long getRealTimeVolume() {
        return this.realTimeVolume;
    }

    @aa1
    public final String getType() {
        return this.type;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Float.hashCode(this.previousClose)) * 31) + this.previousCloseDate.hashCode()) * 31) + Long.hashCode(this.realTimeStamp)) * 31) + this.realTimeStampRead.hashCode()) * 31) + Integer.hashCode(this.realTimeGmtOffset)) * 31) + Float.hashCode(this.realTimeOpen)) * 31) + Float.hashCode(this.realTimeHigh)) * 31) + Float.hashCode(this.realTimeLow)) * 31) + Float.hashCode(this.realTimeClose)) * 31) + Long.hashCode(this.realTimeVolume)) * 31) + Float.hashCode(this.realTimeChange)) * 31) + Float.hashCode(this.realTimeChangePercentage)) * 31) + Float.hashCode(this.realTimePreviousClose)) * 31) + Long.hashCode(this.updateTime)) * 31) + this.country.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.code.hashCode()) * 31) + this.exchange.hashCode()) * 31) + this.exchangeInfo.hashCode()) * 31) + this.isin.hashCode();
    }

    public final void setCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.code = r2;
    }

    public final void setCountry(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.country = r2;
    }

    public final void setCurrency(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.currency = r2;
    }

    public final void setExchange(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.exchange = r2;
    }

    public final void setExchangeInfo(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.exchangeInfo = r2;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setIsin(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.isin = r2;
    }

    public final void setName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.name = r2;
    }

    public final void setPreviousClose(float r1) {
        this.previousClose = r1;
    }

    public final void setPreviousCloseDate(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.previousCloseDate = r2;
    }

    public final void setRealTimeChange(float r1) {
        this.realTimeChange = r1;
    }

    public final void setRealTimeChangePercentage(float r1) {
        this.realTimeChangePercentage = r1;
    }

    public final void setRealTimeClose(float r1) {
        this.realTimeClose = r1;
    }

    public final void setRealTimeGmtOffset(int r1) {
        this.realTimeGmtOffset = r1;
    }

    public final void setRealTimeHigh(float r1) {
        this.realTimeHigh = r1;
    }

    public final void setRealTimeLow(float r1) {
        this.realTimeLow = r1;
    }

    public final void setRealTimeOpen(float r1) {
        this.realTimeOpen = r1;
    }

    public final void setRealTimePreviousClose(float r1) {
        this.realTimePreviousClose = r1;
    }

    public final void setRealTimeStamp(long r1) {
        this.realTimeStamp = r1;
    }

    public final void setRealTimeStampRead(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.realTimeStampRead = r2;
    }

    public final void setRealTimeVolume(long r1) {
        this.realTimeVolume = r1;
    }

    public final void setType(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.type = r2;
    }

    public final void setUpdateTime(long r1) {
        this.updateTime = r1;
    }

    @aa1
    public String toString() {
        return "Stock(id=" + this.id + ", previousClose=" + this.previousClose + ", previousCloseDate=" + this.previousCloseDate + ", realTimeStamp=" + this.realTimeStamp + ", realTimeStampRead=" + this.realTimeStampRead + ", realTimeGmtOffset=" + this.realTimeGmtOffset + ", realTimeOpen=" + this.realTimeOpen + ", realTimeHigh=" + this.realTimeHigh + ", realTimeLow=" + this.realTimeLow + ", realTimeClose=" + this.realTimeClose + ", realTimeVolume=" + this.realTimeVolume + ", realTimeChange=" + this.realTimeChange + ", realTimeChangePercentage=" + this.realTimeChangePercentage + ", realTimePreviousClose=" + this.realTimePreviousClose + ", updateTime=" + this.updateTime + ", country=" + this.country + ", currency=" + this.currency + ", name=" + this.name + ", type=" + this.type + ", code=" + this.code + ", exchange=" + this.exchange + ", exchangeInfo=" + this.exchangeInfo + ", isin=" + this.isin + I000IiI1O.iO.iO;
    }

    public Stock(int r11, float r12, @aa1 String r13, long r14, @aa1 String r16, int r17, float r18, float r19, float r20, float r21, long r22, float r24, float r25, float r26, long r27, @aa1 String r29, @aa1 String r30, @aa1 String r31, @aa1 String r32, @aa1 String r33, @aa1 String r34, @aa1 String r35, @aa1 String r36) {
        Intrinsics.X0O(r13, "previousCloseDate");
        Intrinsics.X0O(r16, "realTimeStampRead");
        Intrinsics.X0O(r29, "country");
        Intrinsics.X0O(r30, "currency");
        Intrinsics.X0O(r31, "name");
        Intrinsics.X0O(r32, "type");
        Intrinsics.X0O(r33, "code");
        Intrinsics.X0O(r34, "exchange");
        Intrinsics.X0O(r35, "exchangeInfo");
        Intrinsics.X0O(r36, "isin");
        this.id = r11;
        this.previousClose = r12;
        this.previousCloseDate = r13;
        this.realTimeStamp = r14;
        this.realTimeStampRead = r16;
        this.realTimeGmtOffset = r17;
        this.realTimeOpen = r18;
        this.realTimeHigh = r19;
        this.realTimeLow = r20;
        this.realTimeClose = r21;
        this.realTimeVolume = r22;
        this.realTimeChange = r24;
        this.realTimeChangePercentage = r25;
        this.realTimePreviousClose = r26;
        this.updateTime = r27;
        this.country = r29;
        this.currency = r30;
        this.name = r31;
        this.type = r32;
        this.code = r33;
        this.exchange = r34;
        this.exchangeInfo = r35;
        this.isin = r36;
    }

    public /* synthetic */ Stock(int r28, float r29, String r30, long r31, String r33, int r34, float r35, float r36, float r37, float r38, long r39, float r41, float r42, float r43, long r44, String r46, String r47, String r48, String r49, String r50, String r51, String r52, String r53, int r54, DefaultConstructorMarker r55) {
        int r2 = 0;
        if ((r54 & 1) == 0) goto L5;
        int r1 = 0;
    L7:
        if ((r54 & 2) == 0) goto L9;
        float r3 = 0.0f;
    L11:
        if ((r54 & 4) == 0) goto L13;
        String r5 = "";
    L15:
        if ((r54 & 8) == 0) goto L17;
        long r10 = 0;
    L19:
        if ((r54 & 16) == 0) goto L21;
        String r7 = "";
    L23:
        if ((r54 & 32) != 0) goto L27;
        r2 = r34;
    L27:
        if ((r54 & 64) == 0) goto L29;
        float r12 = 0.0f;
    L31:
        if ((r54 & 128) == 0) goto L33;
        float r13 = 0.0f;
    L35:
        if ((r54 & 256) == 0) goto L37;
        float r14 = 0.0f;
    L39:
        if ((r54 & 512) == 0) goto L41;
        float r15 = 0.0f;
    L43:
        if ((r54 & 1024) == 0) goto L45;
        long r16 = 0;
    L47:
        if ((r54 & 2048) == 0) goto L49;
        float r4 = 0.0f;
    L51:
        if ((r54 & 4096) == 0) goto L53;
        float r8 = 0.0f;
    L55:
        if ((r54 & 8192) == 0) goto L57;
        float r9 = 0.0f;
    L58:
        int r210 = r1;
        if ((r54 & 16384) == 0) goto L61;
        long r18 = 0;
    L63:
        if ((32768 & r54) == 0) goto L65;
        String r6 = "";
    L67:
        if ((r54 & 65536) == 0) goto L69;
        String r20 = "";
    L71:
        if ((r54 & 131072) == 0) goto L73;
        String r21 = "";
    L75:
        if ((r54 & 262144) == 0) goto L77;
        String r22 = "";
    L79:
        if ((r54 & 524288) == 0) goto L81;
        String r23 = "";
    L83:
        if ((r54 & 1048576) == 0) goto L85;
        String r24 = "";
    L87:
        if ((r54 & 2097152) == 0) goto L89;
        String r25 = "";
    L91:
        if ((r54 & 4194304) == 0) goto L94;
        String r56 = "";
    L95:
        this(r210, r3, r5, r10, r7, r2, r12, r13, r14, r15, r16, r4, r8, r9, r18, r6, r20, r21, r22, r23, r24, r25, r56);
        return;
    L94:
        r56 = r53;
        goto L95
    L89:
        r25 = r52;
        goto L91
    L85:
        r24 = r51;
        goto L87
    L81:
        r23 = r50;
        goto L83
    L77:
        r22 = r49;
        goto L79
    L73:
        r21 = r48;
        goto L75
    L69:
        r20 = r47;
        goto L71
    L65:
        r6 = r46;
        goto L67
    L61:
        r18 = r44;
        goto L63
    L57:
        r9 = r43;
        goto L58
    L53:
        r8 = r42;
        goto L55
    L49:
        r4 = r41;
        goto L51
    L45:
        r16 = r39;
        goto L47
    L41:
        r15 = r38;
        goto L43
    L37:
        r14 = r37;
        goto L39
    L33:
        r13 = r36;
        goto L35
    L29:
        r12 = r35;
        goto L31
    L21:
        r7 = r33;
        goto L23
    L17:
        r10 = r31;
        goto L19
    L13:
        r5 = r30;
        goto L15
    L9:
        r3 = r29;
        goto L11
    L5:
        r1 = r28;
        goto L7
    }
}
