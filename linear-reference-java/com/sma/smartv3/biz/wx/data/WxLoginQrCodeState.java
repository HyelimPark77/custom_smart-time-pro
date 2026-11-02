package com.sma.smartv3.biz.wx.data;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: loaded from: classes18.dex */
public final enum WxLoginQrCodeState extends Enum<WxLoginQrCodeState> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ WxLoginQrCodeState[] $VALUES = null;
    public static final WxLoginQrCodeState Error = null;
    public static final WxLoginQrCodeState ExitScanning = null;
    public static final WxLoginQrCodeState NotScanned = null;
    public static final WxLoginQrCodeState Scanned = null;
    public static final WxLoginQrCodeState Scanning = null;
    public static final WxLoginQrCodeState TimeOut = null;
    public static final WxLoginQrCodeState Unknown = null;
    public static final WxLoginQrCodeState Verification = null;
    private int value;

    private static final /* synthetic */ WxLoginQrCodeState[] $values() {
        return new WxLoginQrCodeState[]{NotScanned, Scanning, Scanned, ExitScanning, Verification, TimeOut, Unknown, Error};
    }

    static {
        NotScanned = new WxLoginQrCodeState("NotScanned", 0, 0);
        Scanning = new WxLoginQrCodeState("Scanning", 1, 1);
        Scanned = new WxLoginQrCodeState("Scanned", 2, 2);
        ExitScanning = new WxLoginQrCodeState("ExitScanning", 3, 4);
        Verification = new WxLoginQrCodeState("Verification", 4, 10);
        TimeOut = new WxLoginQrCodeState("TimeOut", 5, 200);
        Unknown = new WxLoginQrCodeState(AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN, 6, 201);
        Error = new WxLoginQrCodeState("Error", 7, 202);
        WxLoginQrCodeState[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
    }

    private WxLoginQrCodeState(String r1, int r2, int r3) {
        super(r1, r2);
        this.value = r3;
    }

    @aa1
    public static EnumEntries<WxLoginQrCodeState> getEntries() {
        return $ENTRIES;
    }

    public static WxLoginQrCodeState valueOf(String r1) {
        return (WxLoginQrCodeState) Enum.valueOf(WxLoginQrCodeState.class, r1);
    }

    public static WxLoginQrCodeState[] values() {
        return (WxLoginQrCodeState[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }

    public final void setValue(int r1) {
        this.value = r1;
    }
}
