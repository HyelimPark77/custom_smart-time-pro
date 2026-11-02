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

    /* JADX INFO: renamed from: id */
    private int f51324id;

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
        this(0, 0.0f, null, 0L, null, 0, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0L, null, null, null, null, null, null, null, null, 8388607, null);
    }

    public static /* synthetic */ Stock copy$default(Stock stock, int i, float f, String str, long j, String str2, int i2, float f2, float f3, float f4, float f5, long j2, float f6, float f7, float f8, long j3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, Object obj) {
        String str11;
        String str12;
        int i4 = (i3 & 1) != 0 ? stock.f51324id : i;
        float f9 = (i3 & 2) != 0 ? stock.previousClose : f;
        String str13 = (i3 & 4) != 0 ? stock.previousCloseDate : str;
        long j4 = (i3 & 8) != 0 ? stock.realTimeStamp : j;
        String str14 = (i3 & 16) != 0 ? stock.realTimeStampRead : str2;
        int i5 = (i3 & 32) != 0 ? stock.realTimeGmtOffset : i2;
        float f10 = (i3 & 64) != 0 ? stock.realTimeOpen : f2;
        float f11 = (i3 & 128) != 0 ? stock.realTimeHigh : f3;
        float f12 = (i3 & 256) != 0 ? stock.realTimeLow : f4;
        float f13 = (i3 & 512) != 0 ? stock.realTimeClose : f5;
        long j5 = (i3 & 1024) != 0 ? stock.realTimeVolume : j2;
        float f14 = (i3 & 2048) != 0 ? stock.realTimeChange : f6;
        int i6 = i4;
        float f15 = (i3 & 4096) != 0 ? stock.realTimeChangePercentage : f7;
        float f16 = (i3 & 8192) != 0 ? stock.realTimePreviousClose : f8;
        long j6 = (i3 & 16384) != 0 ? stock.updateTime : j3;
        String str15 = (i3 & 32768) != 0 ? stock.country : str3;
        String str16 = (i3 & 65536) != 0 ? stock.currency : str4;
        String str17 = str15;
        String str18 = (i3 & 131072) != 0 ? stock.name : str5;
        String str19 = (i3 & 262144) != 0 ? stock.type : str6;
        String str20 = (i3 & 524288) != 0 ? stock.code : str7;
        String str21 = (i3 & 1048576) != 0 ? stock.exchange : str8;
        String str22 = (i3 & 2097152) != 0 ? stock.exchangeInfo : str9;
        if ((i3 & 4194304) != 0) {
            str12 = str22;
            str11 = stock.isin;
        } else {
            str11 = str10;
            str12 = str22;
        }
        return stock.copy(i6, f9, str13, j4, str14, i5, f10, f11, f12, f13, j5, f14, f15, f16, j6, str17, str16, str18, str19, str20, str21, str12, str11);
    }

    public final int component1() {
        return this.f51324id;
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
    public final Stock copy(int i, float f, @aa1 String previousCloseDate, long j, @aa1 String realTimeStampRead, int i2, float f2, float f3, float f4, float f5, long j2, float f6, float f7, float f8, long j3, @aa1 String country, @aa1 String currency, @aa1 String name, @aa1 String type, @aa1 String code, @aa1 String exchange, @aa1 String exchangeInfo, @aa1 String isin) {
        Intrinsics.X0O(previousCloseDate, "previousCloseDate");
        Intrinsics.X0O(realTimeStampRead, "realTimeStampRead");
        Intrinsics.X0O(country, "country");
        Intrinsics.X0O(currency, "currency");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(exchange, "exchange");
        Intrinsics.X0O(exchangeInfo, "exchangeInfo");
        Intrinsics.X0O(isin, "isin");
        return new Stock(i, f, previousCloseDate, j, realTimeStampRead, i2, f2, f3, f4, f5, j2, f6, f7, f8, j3, country, currency, name, type, code, exchange, exchangeInfo, isin);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stock)) {
            return false;
        }
        Stock stock = (Stock) obj;
        return this.f51324id == stock.f51324id && Float.compare(this.previousClose, stock.previousClose) == 0 && Intrinsics.XOO0ii0(this.previousCloseDate, stock.previousCloseDate) && this.realTimeStamp == stock.realTimeStamp && Intrinsics.XOO0ii0(this.realTimeStampRead, stock.realTimeStampRead) && this.realTimeGmtOffset == stock.realTimeGmtOffset && Float.compare(this.realTimeOpen, stock.realTimeOpen) == 0 && Float.compare(this.realTimeHigh, stock.realTimeHigh) == 0 && Float.compare(this.realTimeLow, stock.realTimeLow) == 0 && Float.compare(this.realTimeClose, stock.realTimeClose) == 0 && this.realTimeVolume == stock.realTimeVolume && Float.compare(this.realTimeChange, stock.realTimeChange) == 0 && Float.compare(this.realTimeChangePercentage, stock.realTimeChangePercentage) == 0 && Float.compare(this.realTimePreviousClose, stock.realTimePreviousClose) == 0 && this.updateTime == stock.updateTime && Intrinsics.XOO0ii0(this.country, stock.country) && Intrinsics.XOO0ii0(this.currency, stock.currency) && Intrinsics.XOO0ii0(this.name, stock.name) && Intrinsics.XOO0ii0(this.type, stock.type) && Intrinsics.XOO0ii0(this.code, stock.code) && Intrinsics.XOO0ii0(this.exchange, stock.exchange) && Intrinsics.XOO0ii0(this.exchangeInfo, stock.exchangeInfo) && Intrinsics.XOO0ii0(this.isin, stock.isin);
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
        return this.f51324id;
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
        return (((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.f51324id) * 31) + Float.hashCode(this.previousClose)) * 31) + this.previousCloseDate.hashCode()) * 31) + Long.hashCode(this.realTimeStamp)) * 31) + this.realTimeStampRead.hashCode()) * 31) + Integer.hashCode(this.realTimeGmtOffset)) * 31) + Float.hashCode(this.realTimeOpen)) * 31) + Float.hashCode(this.realTimeHigh)) * 31) + Float.hashCode(this.realTimeLow)) * 31) + Float.hashCode(this.realTimeClose)) * 31) + Long.hashCode(this.realTimeVolume)) * 31) + Float.hashCode(this.realTimeChange)) * 31) + Float.hashCode(this.realTimeChangePercentage)) * 31) + Float.hashCode(this.realTimePreviousClose)) * 31) + Long.hashCode(this.updateTime)) * 31) + this.country.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.code.hashCode()) * 31) + this.exchange.hashCode()) * 31) + this.exchangeInfo.hashCode()) * 31) + this.isin.hashCode();
    }

    public final void setCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.code = str;
    }

    public final void setCountry(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.country = str;
    }

    public final void setCurrency(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.currency = str;
    }

    public final void setExchange(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.exchange = str;
    }

    public final void setExchangeInfo(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.exchangeInfo = str;
    }

    public final void setId(int i) {
        this.f51324id = i;
    }

    public final void setIsin(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.isin = str;
    }

    public final void setName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.name = str;
    }

    public final void setPreviousClose(float f) {
        this.previousClose = f;
    }

    public final void setPreviousCloseDate(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.previousCloseDate = str;
    }

    public final void setRealTimeChange(float f) {
        this.realTimeChange = f;
    }

    public final void setRealTimeChangePercentage(float f) {
        this.realTimeChangePercentage = f;
    }

    public final void setRealTimeClose(float f) {
        this.realTimeClose = f;
    }

    public final void setRealTimeGmtOffset(int i) {
        this.realTimeGmtOffset = i;
    }

    public final void setRealTimeHigh(float f) {
        this.realTimeHigh = f;
    }

    public final void setRealTimeLow(float f) {
        this.realTimeLow = f;
    }

    public final void setRealTimeOpen(float f) {
        this.realTimeOpen = f;
    }

    public final void setRealTimePreviousClose(float f) {
        this.realTimePreviousClose = f;
    }

    public final void setRealTimeStamp(long j) {
        this.realTimeStamp = j;
    }

    public final void setRealTimeStampRead(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.realTimeStampRead = str;
    }

    public final void setRealTimeVolume(long j) {
        this.realTimeVolume = j;
    }

    public final void setType(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.type = str;
    }

    public final void setUpdateTime(long j) {
        this.updateTime = j;
    }

    @aa1
    public String toString() {
        return "Stock(id=" + this.f51324id + ", previousClose=" + this.previousClose + ", previousCloseDate=" + this.previousCloseDate + ", realTimeStamp=" + this.realTimeStamp + ", realTimeStampRead=" + this.realTimeStampRead + ", realTimeGmtOffset=" + this.realTimeGmtOffset + ", realTimeOpen=" + this.realTimeOpen + ", realTimeHigh=" + this.realTimeHigh + ", realTimeLow=" + this.realTimeLow + ", realTimeClose=" + this.realTimeClose + ", realTimeVolume=" + this.realTimeVolume + ", realTimeChange=" + this.realTimeChange + ", realTimeChangePercentage=" + this.realTimeChangePercentage + ", realTimePreviousClose=" + this.realTimePreviousClose + ", updateTime=" + this.updateTime + ", country=" + this.country + ", currency=" + this.currency + ", name=" + this.name + ", type=" + this.type + ", code=" + this.code + ", exchange=" + this.exchange + ", exchangeInfo=" + this.exchangeInfo + ", isin=" + this.isin + I000IiI1O.C2156iO.f1007iO;
    }

    public Stock(int i, float f, @aa1 String previousCloseDate, long j, @aa1 String realTimeStampRead, int i2, float f2, float f3, float f4, float f5, long j2, float f6, float f7, float f8, long j3, @aa1 String country, @aa1 String currency, @aa1 String name, @aa1 String type, @aa1 String code, @aa1 String exchange, @aa1 String exchangeInfo, @aa1 String isin) {
        Intrinsics.X0O(previousCloseDate, "previousCloseDate");
        Intrinsics.X0O(realTimeStampRead, "realTimeStampRead");
        Intrinsics.X0O(country, "country");
        Intrinsics.X0O(currency, "currency");
        Intrinsics.X0O(name, "name");
        Intrinsics.X0O(type, "type");
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(exchange, "exchange");
        Intrinsics.X0O(exchangeInfo, "exchangeInfo");
        Intrinsics.X0O(isin, "isin");
        this.f51324id = i;
        this.previousClose = f;
        this.previousCloseDate = previousCloseDate;
        this.realTimeStamp = j;
        this.realTimeStampRead = realTimeStampRead;
        this.realTimeGmtOffset = i2;
        this.realTimeOpen = f2;
        this.realTimeHigh = f3;
        this.realTimeLow = f4;
        this.realTimeClose = f5;
        this.realTimeVolume = j2;
        this.realTimeChange = f6;
        this.realTimeChangePercentage = f7;
        this.realTimePreviousClose = f8;
        this.updateTime = j3;
        this.country = country;
        this.currency = currency;
        this.name = name;
        this.type = type;
        this.code = code;
        this.exchange = exchange;
        this.exchangeInfo = exchangeInfo;
        this.isin = isin;
    }

    public /* synthetic */ Stock(int i, float f, String str, long j, String str2, int i2, float f2, float f3, float f4, float f5, long j2, float f6, float f7, float f8, long j3, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0.0f : f, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? "" : str2, (i3 & 32) == 0 ? i2 : 0, (i3 & 64) != 0 ? 0.0f : f2, (i3 & 128) != 0 ? 0.0f : f3, (i3 & 256) != 0 ? 0.0f : f4, (i3 & 512) != 0 ? 0.0f : f5, (i3 & 1024) != 0 ? 0L : j2, (i3 & 2048) != 0 ? 0.0f : f6, (i3 & 4096) != 0 ? 0.0f : f7, (i3 & 8192) != 0 ? 0.0f : f8, (i3 & 16384) != 0 ? 0L : j3, (32768 & i3) != 0 ? "" : str3, (i3 & 65536) != 0 ? "" : str4, (i3 & 131072) != 0 ? "" : str5, (i3 & 262144) != 0 ? "" : str6, (i3 & 524288) != 0 ? "" : str7, (i3 & 1048576) != 0 ? "" : str8, (i3 & 2097152) != 0 ? "" : str9, (i3 & 4194304) != 0 ? "" : str10);
    }
}
