package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class DeviceConfigInfo extends JsonFieldContainer {
    private int alarmWithTag;

    @tb1
    private CustomConfigInfo customConfig;
    private int defHeartRateMonitoringSwitch;

    @aa1
    private String deviceImage;

    @aa1
    private String deviceImage2;

    @aa1
    private String devicePlatform;

    @aa1
    private String devicePrototype;
    private int firmwareId;
    private int id;

    @tb1
    private MacConfig macConfig;
    private int projectId;
    private int requireReadAlarm;
    private int requireReadNoDisturb;
    private int scheduleMax;
    private int supWarnTipGuide;
    private int supWf;

    @aa1
    private String supportBackLightTimeArrays;
    private int supportGirlCare;
    private int supportMusic;
    private int supportNFC;
    private int supportPeriodicHeartRateMonitoring;
    private int supportSyncContact;

    public DeviceConfigInfo(int r4, int r5, int r6, @aa1 String r7, @aa1 String r8, @aa1 String r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, @aa1 String r18, int r19, int r20, int r21, int r22, @tb1 CustomConfigInfo r23, @aa1 String r24, @tb1 MacConfig r25) {
        Intrinsics.X0O(r7, "devicePrototype");
        Intrinsics.X0O(r8, "devicePlatform");
        Intrinsics.X0O(r9, "deviceImage");
        Intrinsics.X0O(r18, "supportBackLightTimeArrays");
        Intrinsics.X0O(r24, "deviceImage2");
        this.id = r4;
        this.projectId = r5;
        this.firmwareId = r6;
        this.devicePrototype = r7;
        this.devicePlatform = r8;
        this.deviceImage = r9;
        this.supportSyncContact = r10;
        this.requireReadAlarm = r11;
        this.alarmWithTag = r12;
        this.scheduleMax = r13;
        this.requireReadNoDisturb = r14;
        this.supportPeriodicHeartRateMonitoring = r15;
        this.defHeartRateMonitoringSwitch = r16;
        this.supportGirlCare = r17;
        this.supportBackLightTimeArrays = r18;
        this.supportMusic = r19;
        this.supportNFC = r20;
        this.supWf = r21;
        this.supWarnTipGuide = r22;
        this.customConfig = r23;
        this.deviceImage2 = r24;
        this.macConfig = r25;
    }

    public static /* synthetic */ DeviceConfigInfo copy$default(DeviceConfigInfo r17, int r18, int r19, int r20, String r21, String r22, String r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, String r32, int r33, int r34, int r35, int r36, CustomConfigInfo r37, String r38, MacConfig r39, int r40, Object r41) {
        if ((r40 & 1) == 0) goto L5;
        int r2 = r17.id;
    L7:
        if ((r40 & 2) == 0) goto L9;
        int r3 = r17.projectId;
    L11:
        if ((r40 & 4) == 0) goto L13;
        int r4 = r17.firmwareId;
    L15:
        if ((r40 & 8) == 0) goto L17;
        String r5 = r17.devicePrototype;
    L19:
        if ((r40 & 16) == 0) goto L21;
        String r6 = r17.devicePlatform;
    L23:
        if ((r40 & 32) == 0) goto L25;
        String r7 = r17.deviceImage;
    L27:
        if ((r40 & 64) == 0) goto L29;
        int r8 = r17.supportSyncContact;
    L31:
        if ((r40 & 128) == 0) goto L33;
        int r9 = r17.requireReadAlarm;
    L35:
        if ((r40 & 256) == 0) goto L37;
        int r10 = r17.alarmWithTag;
    L39:
        if ((r40 & 512) == 0) goto L41;
        int r11 = r17.scheduleMax;
    L43:
        if ((r40 & 1024) == 0) goto L45;
        int r12 = r17.requireReadNoDisturb;
    L47:
        if ((r40 & 2048) == 0) goto L49;
        int r13 = r17.supportPeriodicHeartRateMonitoring;
    L51:
        if ((r40 & 4096) == 0) goto L53;
        int r14 = r17.defHeartRateMonitoringSwitch;
    L55:
        if ((r40 & 8192) == 0) goto L57;
        int r15 = r17.supportGirlCare;
    L58:
        int r110 = r2;
        if ((r40 & 16384) == 0) goto L61;
        String r16 = r17.supportBackLightTimeArrays;
    L63:
        if ((r40 & 32768) == 0) goto L65;
        int r1 = r17.supportMusic;
    L66:
        int r111 = r1;
        if ((r40 & 65536) == 0) goto L69;
        int r42 = r17.supportNFC;
    L70:
        int r210 = r42;
        if ((r40 & 131072) == 0) goto L73;
        int r43 = r17.supWf;
    L74:
        int r211 = r43;
        if ((r40 & 262144) == 0) goto L77;
        int r44 = r17.supWarnTipGuide;
    L78:
        int r212 = r44;
        if ((r40 & 524288) == 0) goto L81;
        CustomConfigInfo r45 = r17.customConfig;
    L82:
        CustomConfigInfo r213 = r45;
        if ((r40 & 1048576) == 0) goto L85;
        String r46 = r17.deviceImage2;
    L87:
        if ((r40 & 2097152) == 0) goto L90;
        String r214 = r46;
        String r310 = r214;
        MacConfig r47 = r17.macConfig;
    L92:
        return r17.copy(r110, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r111, r210, r211, r212, r213, r310, r47);
    L90:
        r47 = r39;
        r310 = r46;
        goto L92
    L85:
        r46 = r38;
        goto L87
    L81:
        r45 = r37;
        goto L82
    L77:
        r44 = r36;
        goto L78
    L73:
        r43 = r35;
        goto L74
    L69:
        r42 = r34;
        goto L70
    L65:
        r1 = r33;
        goto L66
    L61:
        r16 = r32;
        goto L63
    L57:
        r15 = r31;
        goto L58
    L53:
        r14 = r30;
        goto L55
    L49:
        r13 = r29;
        goto L51
    L45:
        r12 = r28;
        goto L47
    L41:
        r11 = r27;
        goto L43
    L37:
        r10 = r26;
        goto L39
    L33:
        r9 = r25;
        goto L35
    L29:
        r8 = r24;
        goto L31
    L25:
        r7 = r23;
        goto L27
    L21:
        r6 = r22;
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

    public final int component10() {
        return this.scheduleMax;
    }

    public final int component11() {
        return this.requireReadNoDisturb;
    }

    public final int component12() {
        return this.supportPeriodicHeartRateMonitoring;
    }

    public final int component13() {
        return this.defHeartRateMonitoringSwitch;
    }

    public final int component14() {
        return this.supportGirlCare;
    }

    @aa1
    public final String component15() {
        return this.supportBackLightTimeArrays;
    }

    public final int component16() {
        return this.supportMusic;
    }

    public final int component17() {
        return this.supportNFC;
    }

    public final int component18() {
        return this.supWf;
    }

    public final int component19() {
        return this.supWarnTipGuide;
    }

    public final int component2() {
        return this.projectId;
    }

    @tb1
    public final CustomConfigInfo component20() {
        return this.customConfig;
    }

    @aa1
    public final String component21() {
        return this.deviceImage2;
    }

    @tb1
    public final MacConfig component22() {
        return this.macConfig;
    }

    public final int component3() {
        return this.firmwareId;
    }

    @aa1
    public final String component4() {
        return this.devicePrototype;
    }

    @aa1
    public final String component5() {
        return this.devicePlatform;
    }

    @aa1
    public final String component6() {
        return this.deviceImage;
    }

    public final int component7() {
        return this.supportSyncContact;
    }

    public final int component8() {
        return this.requireReadAlarm;
    }

    public final int component9() {
        return this.alarmWithTag;
    }

    @aa1
    public final DeviceConfigInfo copy(int r25, int r26, int r27, @aa1 String r28, @aa1 String r29, @aa1 String r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, @aa1 String r39, int r40, int r41, int r42, int r43, @tb1 CustomConfigInfo r44, @aa1 String r45, @tb1 MacConfig r46) {
        Intrinsics.X0O(r28, "devicePrototype");
        Intrinsics.X0O(r29, "devicePlatform");
        Intrinsics.X0O(r30, "deviceImage");
        Intrinsics.X0O(r39, "supportBackLightTimeArrays");
        Intrinsics.X0O(r45, "deviceImage2");
        return new DeviceConfigInfo(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof DeviceConfigInfo) == true) goto L8;
        return false;
    L8:
        DeviceConfigInfo r6 = (DeviceConfigInfo) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (this.projectId == r6.projectId) goto L15;
        return false;
    L15:
        if (this.firmwareId == r6.firmwareId) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.devicePrototype, r6.devicePrototype) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.devicePlatform, r6.devicePlatform) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.deviceImage, r6.deviceImage) == true) goto L27;
        return false;
    L27:
        if (this.supportSyncContact == r6.supportSyncContact) goto L30;
        return false;
    L30:
        if (this.requireReadAlarm == r6.requireReadAlarm) goto L33;
        return false;
    L33:
        if (this.alarmWithTag == r6.alarmWithTag) goto L36;
        return false;
    L36:
        if (this.scheduleMax == r6.scheduleMax) goto L39;
        return false;
    L39:
        if (this.requireReadNoDisturb == r6.requireReadNoDisturb) goto L42;
        return false;
    L42:
        if (this.supportPeriodicHeartRateMonitoring == r6.supportPeriodicHeartRateMonitoring) goto L45;
        return false;
    L45:
        if (this.defHeartRateMonitoringSwitch == r6.defHeartRateMonitoringSwitch) goto L48;
        return false;
    L48:
        if (this.supportGirlCare == r6.supportGirlCare) goto L51;
        return false;
    L51:
        if (Intrinsics.XOO0ii0(this.supportBackLightTimeArrays, r6.supportBackLightTimeArrays) == true) goto L54;
        return false;
    L54:
        if (this.supportMusic == r6.supportMusic) goto L57;
        return false;
    L57:
        if (this.supportNFC == r6.supportNFC) goto L60;
        return false;
    L60:
        if (this.supWf == r6.supWf) goto L63;
        return false;
    L63:
        if (this.supWarnTipGuide == r6.supWarnTipGuide) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.customConfig, r6.customConfig) == true) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.deviceImage2, r6.deviceImage2) == true) goto L72;
        return false;
    L72:
        if (Intrinsics.XOO0ii0(this.macConfig, r6.macConfig) == true) goto L74;
        return false;
    L74:
        return true;
    }

    public final int getAlarmWithTag() {
        return this.alarmWithTag;
    }

    @tb1
    public final CustomConfigInfo getCustomConfig() {
        return this.customConfig;
    }

    public final int getDefHeartRateMonitoringSwitch() {
        return this.defHeartRateMonitoringSwitch;
    }

    @aa1
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    @aa1
    public final String getDeviceImage2() {
        return this.deviceImage2;
    }

    @aa1
    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    @aa1
    public final String getDevicePrototype() {
        return this.devicePrototype;
    }

    public final int getFirmwareId() {
        return this.firmwareId;
    }

    public final int getId() {
        return this.id;
    }

    @tb1
    public final MacConfig getMacConfig() {
        return this.macConfig;
    }

    public final int getProjectId() {
        return this.projectId;
    }

    public final int getRequireReadAlarm() {
        return this.requireReadAlarm;
    }

    public final int getRequireReadNoDisturb() {
        return this.requireReadNoDisturb;
    }

    public final int getScheduleMax() {
        return this.scheduleMax;
    }

    public final int getSupWarnTipGuide() {
        return this.supWarnTipGuide;
    }

    public final int getSupWf() {
        return this.supWf;
    }

    @aa1
    public final String getSupportBackLightTimeArrays() {
        return this.supportBackLightTimeArrays;
    }

    public final int getSupportGirlCare() {
        return this.supportGirlCare;
    }

    public final int getSupportMusic() {
        return this.supportMusic;
    }

    public final int getSupportNFC() {
        return this.supportNFC;
    }

    public final int getSupportPeriodicHeartRateMonitoring() {
        return this.supportPeriodicHeartRateMonitoring;
    }

    public final int getSupportSyncContact() {
        return this.supportSyncContact;
    }

    public int hashCode() {
        int r0 = ((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.projectId)) * 31) + Integer.hashCode(this.firmwareId)) * 31) + this.devicePrototype.hashCode()) * 31) + this.devicePlatform.hashCode()) * 31) + this.deviceImage.hashCode()) * 31) + Integer.hashCode(this.supportSyncContact)) * 31) + Integer.hashCode(this.requireReadAlarm)) * 31) + Integer.hashCode(this.alarmWithTag)) * 31) + Integer.hashCode(this.scheduleMax)) * 31) + Integer.hashCode(this.requireReadNoDisturb)) * 31) + Integer.hashCode(this.supportPeriodicHeartRateMonitoring)) * 31) + Integer.hashCode(this.defHeartRateMonitoringSwitch)) * 31) + Integer.hashCode(this.supportGirlCare)) * 31) + this.supportBackLightTimeArrays.hashCode()) * 31) + Integer.hashCode(this.supportMusic)) * 31) + Integer.hashCode(this.supportNFC)) * 31) + Integer.hashCode(this.supWf)) * 31) + Integer.hashCode(this.supWarnTipGuide)) * 31;
        CustomConfigInfo r1 = this.customConfig;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r3 = 0;
    L6:
        int r4 = (((r0 + r3) * 31) + this.deviceImage2.hashCode()) * 31;
        MacConfig r5 = this.macConfig;
        if (r5 == null) goto L11;
        r2 = r5.hashCode();
    L11:
        return r4 + r2;
    L5:
        r3 = r1.hashCode();
        goto L6
    }

    public final void setAlarmWithTag(int r1) {
        this.alarmWithTag = r1;
    }

    public final void setCustomConfig(@tb1 CustomConfigInfo r1) {
        this.customConfig = r1;
    }

    public final void setDefHeartRateMonitoringSwitch(int r1) {
        this.defHeartRateMonitoringSwitch = r1;
    }

    public final void setDeviceImage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.deviceImage = r2;
    }

    public final void setDeviceImage2(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.deviceImage2 = r2;
    }

    public final void setDevicePlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.devicePlatform = r2;
    }

    public final void setDevicePrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.devicePrototype = r2;
    }

    public final void setFirmwareId(int r1) {
        this.firmwareId = r1;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setMacConfig(@tb1 MacConfig r1) {
        this.macConfig = r1;
    }

    public final void setProjectId(int r1) {
        this.projectId = r1;
    }

    public final void setRequireReadAlarm(int r1) {
        this.requireReadAlarm = r1;
    }

    public final void setRequireReadNoDisturb(int r1) {
        this.requireReadNoDisturb = r1;
    }

    public final void setScheduleMax(int r1) {
        this.scheduleMax = r1;
    }

    public final void setSupWarnTipGuide(int r1) {
        this.supWarnTipGuide = r1;
    }

    public final void setSupWf(int r1) {
        this.supWf = r1;
    }

    public final void setSupportBackLightTimeArrays(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.supportBackLightTimeArrays = r2;
    }

    public final void setSupportGirlCare(int r1) {
        this.supportGirlCare = r1;
    }

    public final void setSupportMusic(int r1) {
        this.supportMusic = r1;
    }

    public final void setSupportNFC(int r1) {
        this.supportNFC = r1;
    }

    public final void setSupportPeriodicHeartRateMonitoring(int r1) {
        this.supportPeriodicHeartRateMonitoring = r1;
    }

    public final void setSupportSyncContact(int r1) {
        this.supportSyncContact = r1;
    }

    @aa1
    public String toString() {
        return "DeviceConfigInfo(id=" + this.id + ", projectId=" + this.projectId + ", firmwareId=" + this.firmwareId + ", devicePrototype=" + this.devicePrototype + ", devicePlatform=" + this.devicePlatform + ", deviceImage=" + this.deviceImage + ", supportSyncContact=" + this.supportSyncContact + ", requireReadAlarm=" + this.requireReadAlarm + ", alarmWithTag=" + this.alarmWithTag + ", scheduleMax=" + this.scheduleMax + ", requireReadNoDisturb=" + this.requireReadNoDisturb + ", supportPeriodicHeartRateMonitoring=" + this.supportPeriodicHeartRateMonitoring + ", defHeartRateMonitoringSwitch=" + this.defHeartRateMonitoringSwitch + ", supportGirlCare=" + this.supportGirlCare + ", supportBackLightTimeArrays=" + this.supportBackLightTimeArrays + ", supportMusic=" + this.supportMusic + ", supportNFC=" + this.supportNFC + ", supWf=" + this.supWf + ", supWarnTipGuide=" + this.supWarnTipGuide + ", customConfig=" + this.customConfig + ", deviceImage2=" + this.deviceImage2 + ", macConfig=" + this.macConfig + I000IiI1O.iO.iO;
    }

    public /* synthetic */ DeviceConfigInfo(int r27, int r28, int r29, String r30, String r31, String r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, String r41, int r42, int r43, int r44, int r45, CustomConfigInfo r46, String r47, MacConfig r48, int r49, DefaultConstructorMarker r50) {
        if ((r49 & 1) == 0) goto L5;
        int r4 = 0;
    L7:
        if ((r49 & 2) == 0) goto L9;
        int r5 = 0;
    L11:
        if ((r49 & 4) == 0) goto L13;
        int r6 = 0;
    L15:
        if ((r49 & 8) == 0) goto L17;
        String r7 = "";
    L19:
        if ((r49 & 16) == 0) goto L21;
        String r8 = "";
    L23:
        if ((r49 & 32) == 0) goto L25;
        String r9 = "";
    L27:
        if ((r49 & 64) == 0) goto L29;
        int r10 = 0;
    L31:
        if ((r49 & 128) == 0) goto L33;
        int r11 = 0;
    L35:
        if ((r49 & 256) == 0) goto L37;
        int r12 = 0;
    L39:
        if ((r49 & 512) == 0) goto L41;
        int r13 = 0;
    L43:
        if ((r49 & 1024) == 0) goto L45;
        int r14 = 0;
    L47:
        if ((r49 & 2048) == 0) goto L49;
        int r15 = 0;
    L51:
        if ((r49 & 4096) == 0) goto L53;
        int r16 = 0;
    L55:
        if ((r49 & 8192) == 0) goto L57;
        int r17 = 0;
    L59:
        if ((r49 & 16384) == 0) goto L61;
        String r18 = "";
    L63:
        if ((32768 & r49) == 0) goto L65;
        int r19 = 0;
    L67:
        if ((65536 & r49) == 0) goto L69;
        int r20 = 0;
    L71:
        if ((131072 & r49) == 0) goto L73;
        int r21 = 0;
    L75:
        if ((262144 & r49) == 0) goto L77;
        int r22 = 0;
    L79:
        if ((r49 & 1048576) == 0) goto L81;
        String r24 = "";
    L82:
        this(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r46, r24, r48);
        return;
    L81:
        r24 = r47;
        goto L82
    L77:
        r22 = r45;
        goto L79
    L73:
        r21 = r44;
        goto L75
    L69:
        r20 = r43;
        goto L71
    L65:
        r19 = r42;
        goto L67
    L61:
        r18 = r41;
        goto L63
    L57:
        r17 = r40;
        goto L59
    L53:
        r16 = r39;
        goto L55
    L49:
        r15 = r38;
        goto L51
    L45:
        r14 = r37;
        goto L47
    L41:
        r13 = r36;
        goto L43
    L37:
        r12 = r35;
        goto L39
    L33:
        r11 = r34;
        goto L35
    L29:
        r10 = r33;
        goto L31
    L25:
        r9 = r32;
        goto L27
    L21:
        r8 = r31;
        goto L23
    L17:
        r7 = r30;
        goto L19
    L13:
        r6 = r29;
        goto L15
    L9:
        r5 = r28;
        goto L11
    L5:
        r4 = r27;
        goto L7
    }
}
