package com.sma.smartv3.biz.p607wx.data;

import com.android.mltcode.paycertificationapi.aa1;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes18.dex */
public enum WxLoginQrCodeState {
    NotScanned(0),
    Scanning(1),
    Scanned(2),
    ExitScanning(4),
    Verification(10),
    TimeOut(200),
    Unknown(201),
    Error(202);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());
    private int value;

    WxLoginQrCodeState(int i) {
        this.value = i;
    }

    @aa1
    public static EnumEntries<WxLoginQrCodeState> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int i) {
        this.value = i;
    }
}
