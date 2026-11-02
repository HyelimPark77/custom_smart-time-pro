package com.szabh.smable3.component;

import android.bluetooth.BluetoothAdapter;
import android.util.SparseArray;
import com.android.mltcode.paycertificationapi.I10O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iXIO;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SPUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.szabh.smable3.BleCommand;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.entity.BleAlarm;
import com.szabh.smable3.entity.BleCoaching;
import com.szabh.smable3.entity.BleDeviceInfo;
import com.szabh.smable3.entity.BleIdObject;
import com.szabh.smable3.entity.BleLoveTapUser;
import com.szabh.smable3.entity.BleMedicationAlarm;
import com.szabh.smable3.entity.BleMedicationReminder;
import com.szabh.smable3.entity.BleSMSQuickReplyContent;
import com.szabh.smable3.entity.BleSchedule;
import com.szabh.smable3.entity.BleStock;
import com.szabh.smable3.entity.BleStreamPacket;
import com.szabh.smable3.entity.BleWorldClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.OXO1;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBaseBleCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseBleCache.kt\ncom/szabh/smable3/component/BaseBleCache\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,777:1\n1869#2,2:778\n*S KotlinDebug\n*F\n+ 1 BaseBleCache.kt\ncom/szabh/smable3/component/BaseBleCache\n*L\n684#1:778,2\n*E\n"})
public class BaseBleCache {

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String MTK_OTA_META = "mtk_ota_meta";

    @aa1
    public static final String TAG = "BaseBleCache";

    @aa1
    private final SparseArray<String> mAGpsFileUrls;

    @aa1
    private final String mDeviceAddress;

    @tb1
    private BleDeviceInfo mDeviceInfo;

    @aa1
    private final Lazy mSpUtils$delegate;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BaseBleCache create(@aa1 String r2) {
            Intrinsics.X0O(r2, "deviceAddress");
            return new BaseBleCache(r2);
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1 = null;

        static {
            int[] r0 = new int[BleCommand.values().length];
            r0[BleCommand.SET.ordinal()] = 1;     // Catch: NoSuchFieldError -> L20
        L36:
            r0[BleCommand.PUSH.ordinal()] = 2;     // Catch: NoSuchFieldError -> L21
        L50:
            r0[BleCommand.CONTROL.ordinal()] = 3;     // Catch: NoSuchFieldError -> L22
        L8:
            $EnumSwitchMapping$0 = r0;
            int[] r1 = new int[BleKey.values().length];
            r1[BleKey.ALARM.ordinal()] = 1;     // Catch: NoSuchFieldError -> L23
        L40:
            r1[BleKey.SCHEDULE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L24
        L52:
            r1[BleKey.COACHING.ordinal()] = 3;     // Catch: NoSuchFieldError -> L25
        L32:
            r1[BleKey.WORLD_CLOCK.ordinal()] = 4;     // Catch: NoSuchFieldError -> L26
        L42:
            r1[BleKey.STOCK.ordinal()] = 5;     // Catch: NoSuchFieldError -> L27
        L34:
            r1[BleKey.SMS_QUICK_REPLY_CONTENT.ordinal()] = 6;     // Catch: NoSuchFieldError -> L28
        L44:
            r1[BleKey.LOVE_TAP_USER.ordinal()] = 7;     // Catch: NoSuchFieldError -> L29
        L48:
            r1[BleKey.MEDICATION_REMINDER.ordinal()] = 8;     // Catch: NoSuchFieldError -> L30
        L38:
            r1[BleKey.MEDICATION_ALARM.ordinal()] = 9;     // Catch: NoSuchFieldError -> L31
        L18:
            $EnumSwitchMapping$1 = r1;
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBleCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SPUtils OXO1(BaseBleCache r0) {
        return mSpUtils_delegate$lambda$0(r0);
    }

    public static /* synthetic */ boolean getBoolean$default(BaseBleCache r0, BleKey r1, boolean r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = false;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = null;
    L10:
        return r0.getBoolean(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
    }

    public static /* synthetic */ int getInt$default(BaseBleCache r0, BleKey r1, int r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = null;
    L10:
        return r0.getInt(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
    }

    private final String getKey(BleKey r2, BleKeyFlag r3) {
        if (r3 == null) goto L4;
        StringBuilder r0 = new StringBuilder();
        r0.append(r2);
        r0.append('_');
        r0.append(r3);
        return r0.toString();
    L4:
        return String.valueOf(r2);
    }

    public static /* synthetic */ List getList$default(BaseBleCache r0, BleKey r1, Class r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = null;
    L7:
        return r0.getList(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getList");
    }

    public static /* synthetic */ long getLong$default(BaseBleCache r0, BleKey r1, long r2, BleKeyFlag r4, int r5, Object r6) {
        if (r6 != null) goto L12;
        if ((r5 & 2) == 0) goto L7;
        r2 = 0;
    L7:
        if ((r5 & 4) == 0) goto L10;
        r4 = null;
    L10:
        return r0.getLong(r1, r2, r4);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
    }

    private final SPUtils getMSpUtils() {
        Object r0 = getValue();
        Intrinsics.O10IXXX0X(r0, "getValue(...)");
        return (SPUtils) r0;
    }

    public static /* synthetic */ Object getObject$default(BaseBleCache r0, BleKey r1, Class r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L7;
        r3 = null;
    L7:
        return r0.getObject(r1, r2, r3);
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObject");
    }

    public static /* synthetic */ Object getObjectNotNull$default(BaseBleCache r1, BleKey r2, Class r3, Object r4, BleKeyFlag r5, int r6, Object r7) {
        if (r7 != null) goto L12;
        if ((r6 & 4) == 0) goto L7;
        r4 = null;
    L7:
        if ((r6 & 8) == 0) goto L10;
        r5 = null;
    L10:
        return r1.getObjectNotNull(r2, r3, r4, r5);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObjectNotNull");
    }

    public static /* synthetic */ String getString$default(BaseBleCache r0, BleKey r1, String r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L12;
        if ((r4 & 2) == 0) goto L7;
        r2 = "";
    L7:
        if ((r4 & 4) == 0) goto L10;
        r3 = null;
    L10:
        return r0.getString(r1, r2, r3);
    L12:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
    }

    private static final SPUtils mSpUtils_delegate$lambda$0(BaseBleCache r2) {
        return SPUtils.getInstance("sma_ble_sdk3" + r2.mDeviceAddress);
    }

    public static /* synthetic */ void putBoolean$default(BaseBleCache r0, BleKey r1, boolean r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.putBoolean(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putBoolean");
    }

    public static /* synthetic */ void putInt$default(BaseBleCache r0, BleKey r1, int r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.putInt(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putInt");
    }

    public static /* synthetic */ void putList$default(BaseBleCache r0, BleKey r1, List r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.putList(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putList");
    }

    public static /* synthetic */ void putLong$default(BaseBleCache r0, BleKey r1, long r2, BleKeyFlag r4, int r5, Object r6) {
        if (r6 != null) goto L9;
        if ((r5 & 4) == 0) goto L6;
        r4 = null;
    L6:
        r0.putLong(r1, r2, r4);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putLong");
    }

    public static /* synthetic */ void putObject$default(BaseBleCache r0, BleKey r1, Object r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.putObject(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putObject");
    }

    public static /* synthetic */ void putString$default(BaseBleCache r0, BleKey r1, String r2, BleKeyFlag r3, int r4, Object r5) {
        if (r5 != null) goto L9;
        if ((r4 & 4) == 0) goto L6;
        r3 = null;
    L6:
        r0.putString(r1, r2, r3);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putString");
    }

    public static /* synthetic */ void remove$default(BaseBleCache r0, BleKey r1, BleKeyFlag r2, int r3, Object r4) {
        if (r4 != null) goto L9;
        if ((r3 & 2) == 0) goto L6;
        r2 = null;
    L6:
        r0.remove(r1, r2);
        return;
    L9:
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
    }

    public void clear() {
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache clear");
        getMSpUtils().clear();
    }

    public boolean getBoolean(@aa1 BleKey r4, boolean r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        boolean r7 = getMSpUtils().getBoolean(getKey(r4, r6), r5);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getBoolean " + getKey(r4, r6) + i1iXIO.XO0O10 + r7);
        return r7;
    }

    @aa1
    public List<BleIdObject> getIdObjects(@aa1 BleKey r7) {
        Intrinsics.X0O(r7, "bleKey");
        switch(WhenMappings.$EnumSwitchMapping$1[r7.ordinal()]) {
            case 1: goto L13;
            case 2: goto L12;
            case 3: goto L11;
            case 4: goto L10;
            case 5: goto L9;
            case 6: goto L8;
            case 7: goto L7;
            case 8: goto L6;
            case 9: goto L5;
            default: goto L4;
        };
    L4:
        List r8 = CollectionsKt__CollectionsKt.iI();
    L15:
        return CollectionsKt___CollectionsKt.OO0Oi10(r8);
    L5:
        r8 = getList$default(this, r7, BleMedicationAlarm.class, null, 4, null);
        goto L15
    L6:
        r8 = getList$default(this, r7, BleMedicationReminder.class, null, 4, null);
        goto L15
    L7:
        r8 = getList$default(this, r7, BleLoveTapUser.class, null, 4, null);
        goto L15
    L8:
        r8 = getList$default(this, r7, BleSMSQuickReplyContent.class, null, 4, null);
        goto L15
    L9:
        r8 = getList$default(this, r7, BleStock.class, null, 4, null);
        goto L15
    L10:
        r8 = getList$default(this, r7, BleWorldClock.class, null, 4, null);
        goto L15
    L11:
        r8 = getList$default(this, r7, BleCoaching.class, null, 4, null);
        goto L15
    L12:
        r8 = getList$default(this, r7, BleSchedule.class, null, 4, null);
        goto L15
    L13:
        r8 = getList$default(this, r7, BleAlarm.class, null, 4, null);
        goto L15
    }

    public int getInt(@aa1 BleKey r4, int r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        int r7 = getMSpUtils().getInt(getKey(r4, r6), r5);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getInt " + getKey(r4, r6) + i1iXIO.XO0O10 + r7);
        return r7;
    }

    @aa1
    public <T> List<T> getList(@aa1 BleKey r5, @aa1 Class<T> r6, @tb1 BleKeyFlag r7) {
        Intrinsics.X0O(r5, "bleKey");
        Intrinsics.X0O(r6, "clazz");
        ArrayList r0 = new ArrayList();
        String r1 = getMSpUtils().getString(getKey(r5, r7));
        Intrinsics.O10IXXX0X(r1, "getString(...)");
        if (StringsKt__StringsKt.i0XI0(r1) == false) goto L15;
    L13:
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getList " + getKey(r5, r7) + i1iXIO.XO0O10 + r0);
        return r0;
    L15:
        JsonArray r2 = JsonParser.parseString(getMSpUtils().getString(getKey(r5, r7))).getAsJsonArray();     // Catch: Exception -> L11
        if (r2 == null) goto L13;
        Iterator<JsonElement> r3 = r2.iterator();     // Catch: Exception -> L11
    L8:
        if (r3.hasNext() == false) goto L13;
        r0.add(new Gson().fromJson(r3.next(), r6));     // Catch: Exception -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
        goto L13
    }

    public long getLong(@aa1 BleKey r4, long r5, @tb1 BleKeyFlag r7) {
        Intrinsics.X0O(r4, "bleKey");
        long r6 = getMSpUtils().getLong(getKey(r4, r7), r5);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getLong " + getKey(r4, r7) + i1iXIO.XO0O10 + r6);
        return r6;
    }

    @aa1
    public final String getMAGpsFileUrl() {
        String r0 = this.mAGpsFileUrls.get(getMAGpsType());
        if (r0 != null) goto L6;
        return "";
    L6:
        return r0;
    }

    public final int getMAGpsType() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMAGpsType();
    }

    @aa1
    public final String getMBleAddress() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMBleAddress();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    @aa1
    public final String getMBleCustomName() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMBleCustomName();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    @aa1
    public final String getMBleName() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMBleName();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    public final int getMBlockSwimmingReminders() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMBlockSwimmingReminders();
    }

    @aa1
    public final String getMClassicAddress() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMClassicAddress();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    @aa1
    public final List<Integer> getMDataKeys() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L9;
        List<Integer> r1 = r0.getMDataKeys();
        if (r1 == null) goto L9;
        return r1;
    L9:
        return CollectionsKt__CollectionsKt.iI();
    }

    @aa1
    public final String getMDeviceAddress() {
        return this.mDeviceAddress;
    }

    @tb1
    public BleDeviceInfo getMDeviceInfo() {
        return this.mDeviceInfo;
    }

    @aa1
    public final String getMDfuAddress() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return "";
    L5:
        if (BluetoothAdapter.checkBluetoothAddress(r0.getMBleAddress()) == true) goto L8;
        return "";
    L8:
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL) == false) goto L10;
    L22:
        long r1 = Long.parseLong(oe5.IXO0OOi(r0.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), OXO1.OXO1(16)) + 1;
        StringCompanionObject r2 = StringCompanionObject.OXO1;
        String r3 = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(r1)}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        return CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(r3, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
    L10:
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) == true) goto L22;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) == true) goto L22;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_NORDIC) == true) goto L22;
        if (Intrinsics.XOO0ii0(r0.getMPlatform(), BleDeviceInfo.PLATFORM_GOODIX) == false) goto L21;
        if (Intrinsics.XOO0ii0(r0.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q) == true) goto L22;
    L21:
        return r0.getMBleAddress();
    }

    @aa1
    public final String getMFirmwareFlag() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMFirmwareFlag();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    public final int getMHideDigitalPower() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMHideDigitalPower();
    }

    @aa1
    public final String getMID() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L5;
        Integer r1 = Integer.valueOf(r0.getMId());
    L7:
        return String.valueOf(r1);
    L5:
        r1 = null;
        goto L7
    }

    public final long getMIOBufferSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L5;
        Long r1 = Long.valueOf(r0.getMIOBufferSize());
    L6:
        if (r1 != null) goto L8;
    L9:
        r1 = Long.valueOf(BleStreamPacket.Companion.getBUFFER_MAX_SIZE());
    L11:
        return r1.longValue();
    L8:
        if (r1.longValue() != 0) goto L11;
    L5:
        r1 = null;
        goto L6
    }

    @aa1
    public final String getMPlatform() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMPlatform();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    @aa1
    public final String getMPrototype() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMPrototype();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    public final int getMQrcodeContentSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMQrcodeContentSize();
    }

    public final int getMQrcodeSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMQrcodeSize();
    }

    @aa1
    public final String getMSN() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 == null) goto L8;
        String r1 = r0.getMSupportShowSNNumber();
        if (r1 == null) goto L10;
        return r1;
    L10:
        return "";
    L8:
        return "";
    }

    public final int getMShowAntiLostSwitch() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMShowAntiLostSwitch();
    }

    public final int getMSleepAlgorithmType() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSleepAlgorithmType();
    }

    public final int getMSupport2DAcceleration() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupport2DAcceleration();
    }

    public final int getMSupportAICoach() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAICoach();
    }

    public final int getMSupportAITranslation() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAITranslation();
    }

    public final int getMSupportAMapOfflineMap() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAMapOfflineMap();
    }

    public final int getMSupportActivityRecognition() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportActivityRecognition();
    }

    public final int getMSupportAiCoachV2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAICoachV2();
    }

    public final int getMSupportAiOngoingDialogue() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAiOngoingDialogue();
    }

    public final int getMSupportAlipay() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAlipay();
    }

    public final int getMSupportAppPushSwitch() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAppPushSwitch();
    }

    public final int getMSupportAppSport() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAppSport();
    }

    public final int getMSupportAppStore() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAppStore();
    }

    public final int getMSupportAudioBooks() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportAudioBooks();
    }

    public final int getMSupportBloodOxyGenSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportBloodOxyGenSet();
    }

    public final int getMSupportBloodPressureCalibration() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportBloodPressureCalibration();
    }

    public final int getMSupportChangeClassicBluetoothState() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportChangeClassicBluetoothState();
    }

    public final int getMSupportChargeWhileUsing() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportChargeWhileUsing();
    }

    public final int getMSupportConnectReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportConnectReminder();
    }

    public final int getMSupportContactSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportContactSize();
    }

    public final int getMSupportContactSort() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportContactSort();
    }

    public final int getMSupportCrossAppTranslation() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportCrossAppTranslation();
    }

    public final int getMSupportCustomLogo() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportCustomLogo();
    }

    public final int getMSupportCyWeeAlgorithm() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportCyWeeAlgorithm();
    }

    public final int getMSupportCyWeeAlgorithmGpsPush() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportCyWeeAlgorithmGpsPush();
    }

    public final int getMSupportDateFormatSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportDateFormatSet();
    }

    public final int getMSupportDeviceSportData() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportDeviceSportData();
    }

    public final int getMSupportDoubleScreen() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportDoubleScreen();
    }

    public final int getMSupportDrinkWaterSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportDrinkWaterSet();
    }

    public final int getMSupportEbookTransfer() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportEbookTransfer();
    }

    public final int getMSupportEnergyRating() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportEnergyRating();
    }

    public final int getMSupportFallSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportFallSet();
    }

    public final int getMSupportFindWatch() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportFindWatch();
    }

    public final int getMSupportGPSFirmwareFile() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGPSFirmwareFile();
    }

    public final int getMSupportGameControl() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGameControls();
    }

    public final int getMSupportGameTimeReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGameTimeReminder();
    }

    public final int getMSupportGestureWake2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGestureWake2();
    }

    public final int getMSupportGetWatchFaceMaxSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGetWatchFaceMaxSize();
    }

    public final int getMSupportGirlCareMonthly() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGirlCareMonthly();
    }

    public final int getMSupportGirlCareReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGirlCareReminder();
    }

    public final int getMSupportGoMoreSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGoMoreSet();
    }

    public final int getMSupportGolfMapData() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGolfMapData();
    }

    public final int getMSupportGoogleNavigation() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportGoogleNavigation();
    }

    public final int getMSupportHID() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportHID();
    }

    public final int getMSupportHighAntiAssist() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportHighAntiAssist();
    }

    public final int getMSupportHrWarnSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportHrWarnSet();
    }

    public final int getMSupportHrvSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportHrvSet();
    }

    public final int getMSupportHydrationReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportHydrationReminder();
    }

    public final int getMSupportIBeaconSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportIBeaconSet();
    }

    public final int getMSupportIPC() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportIPC();
    }

    public final int getMSupportIncomingCallRing() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportIncomingCallRing();
    }

    public final int getMSupportJLTransport() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportJLTransport();
    }

    public final int getMSupportLaunchDeviceSport() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportLaunchDeviceSport();
    }

    public final int getMSupportLoveTap() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportLoveTap();
    }

    public final int getMSupportMatchV3() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMatchV3();
    }

    public final int getMSupportMeasurementBloodGlucose() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMeasurementBloodGlucose();
    }

    public final int getMSupportMedicationAlarm() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMedicationAlarm();
    }

    public final int getMSupportMedicationReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMedicationReminder();
    }

    public final int getMSupportMeetingReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMeetingReminder();
    }

    public final int getMSupportMusicTransfer() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMusicTransfer();
    }

    public final int getMSupportMyCardCodeSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportMyCardCodeSize();
    }

    public final int getMSupportNavImage() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNavImage();
    }

    public final int getMSupportNavigation() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNavigation();
    }

    public final int getMSupportNetwork() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNetwork();
    }

    public final int getMSupportNewsfeed() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNewsfeed();
    }

    public final int getMSupportNoDisturbSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNoDisturbSet();
    }

    public final int getMSupportNoDisturbSet2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNoDisturbSet2();
    }

    public final int getMSupportNoiseSet() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNoiseSet();
    }

    public final int getMSupportNotSaveAPPSport() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNotSaveAPPSport();
    }

    public final int getMSupportNotificationLightScreenSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportNotificationLightScreenSet();
    }

    public final int getMSupportOTAFile() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportOTAFile();
    }

    public final int getMSupportOfflineAsrAuth() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportOfflineAsrAuth();
    }

    public final int getMSupportOfflineMap() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReadOffLineMap();
    }

    public final int getMSupportPhysicalStrength() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportPhysicalStrength();
    }

    public final int getMSupportPower2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportPower2();
    }

    public final int getMSupportPowerSaveMode() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportPowerSaveMode();
    }

    public final int getMSupportPressureTimingMeasurement() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportPressureTimingMeasurement();
    }

    public final int getMSupportQcyProtocol() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportInheritanceAgreement();
    }

    public final int getMSupportQiblaSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportQiblaSet();
    }

    public final int getMSupportQrcode() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportQrcode();
    }

    public final int getMSupportQuran() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportQuran();
    }

    public final int getMSupportReadDeviceInfo() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReadDeviceInfo();
    }

    public final int getMSupportReadLanguages() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReadLanguages();
    }

    public final int getMSupportReadLanguages2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReadLanguages2();
    }

    public final int getMSupportReadPackageStatus() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReadPackageStatus();
    }

    public final int getMSupportRealTimeMeasurement() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRealTimeMeasurement();
    }

    public final int getMSupportReceiptCodeSize() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportReceiptCodeSize();
    }

    public final int getMSupportRecordAudio() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRecordAudio();
    }

    public final int getMSupportRecordNote() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRecordNote();
    }

    public final int getMSupportRelaxReminder() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRelaxReminder();
    }

    public final int getMSupportRequestRealtimeWeather() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRequestRealtimeWeather();
    }

    public final int getMSupportRespiratoryRate() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRespiratoryRate();
    }

    public final int getMSupportRestoreFactory() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRestoreFactory();
    }

    public final int getMSupportRingVibrationSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportRingVibrationSet();
    }

    public final int getMSupportSDCardInfo() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSDCardInfo();
    }

    public final int getMSupportSHSYAlgorithm() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSHSYAlgorithm();
    }

    public final int getMSupportSMSQuickReply() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSMSQuickReply();
    }

    public final int getMSupportSOSSet2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSOSSet2();
    }

    public final int getMSupportSetWatchPassword() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSetWatchPassword();
    }

    public final int getMSupportSimultaneousTranslation() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSimultaneousTranslation();
    }

    public final int getMSupportSleepScore() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSleepScore();
    }

    public final int getMSupportSleepSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSleepSet();
    }

    public final int getMSupportSosContact() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSosContact();
    }

    public final int getMSupportStandbySet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportStandbySet();
    }

    public final int getMSupportStock() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportStock();
    }

    public final int getMSupportStringQrcode() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportStringQrcode();
    }

    public final int getMSupportStudyCards() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportStudyCards();
    }

    public final int getMSupportSwitchPhoneAssistant() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSwitchPhoneAssistant();
    }

    public final int getMSupportSyncAGPSInBackground() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportSyncAGPSInBackground();
    }

    public final int getMSupportTemperatureUnitSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportTemperatureUnitSet();
    }

    public final int getMSupportTimeFormat() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportTimeFormat();
    }

    public final int getMSupportTimerStandbySet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportTimerStandbySet();
    }

    public final int getMSupportTouchSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportTouchSet();
    }

    public final int getMSupportTuyaKey() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportTuyaKey();
    }

    public final int getMSupportVibrationIntensity() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVibrationIntensity();
    }

    public final int getMSupportVideoCalls() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVideoCalls();
    }

    public final int getMSupportVitalityValue() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVitalityValue();
    }

    public final int getMSupportVoice() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVoice();
    }

    public final int getMSupportVoiceControl() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVoiceControl();
    }

    public final int getMSupportVoiceMaxLength() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportVoiceMaxLength();
    }

    public final int getMSupportWalkAndBike() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWalkAndBike();
    }

    public final int getMSupportWashSet() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWashSet();
    }

    public final int getMSupportWatchFaceId() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWatchFaceId();
    }

    public final int getMSupportWatchFaceIndex() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWatchFaceIndex();
    }

    public final int getMSupportWatchface2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWatchface2();
    }

    public final int getMSupportWeChat() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWeChat();
    }

    public final int getMSupportWeChatCall() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWeChatCall();
    }

    public final int getMSupportWearDetection() {
        BleDeviceInfo r0 = BleCache.INSTANCE.getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWearDetection();
    }

    public final int getMSupportWearWay() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWearWay();
    }

    public final int getMSupportWeather2() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWeather2();
    }

    public final int getMSupportWechatPay() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWechatPay();
    }

    public final int getMSupportWhatsApp() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWhatsApp();
    }

    public final int getMSupportWorldClock() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMSupportWorldClock();
    }

    public final int getMWatchFaceType() {
        BleDeviceInfo r0 = getMDeviceInfo();
        if (r0 != null) goto L5;
        return 0;
    L5:
        return r0.getMWatchFaceType();
    }

    @aa1
    public final String getMtkOtaMeta() {
        String r0 = getMSpUtils().getString(MTK_OTA_META);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getMtkOtaMeta -> " + r0);
        Intrinsics.O10IXXX0X(r0, "also(...)");
        return r0;
    }

    @aa1
    public final String getMultiDeviceAddress() {
        return this.mDeviceAddress;
    }

    @tb1
    public <T> T getObject(@aa1 BleKey r4, @aa1 Class<T> r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        Intrinsics.X0O(r5, "clazz");
        T r7 = (T) new Gson().fromJson(getMSpUtils().getString(getKey(r4, r6)), r5);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getObject " + getKey(r4, r6) + i1iXIO.XO0O10 + r7);
        return r7;
    }

    public <T> T getObjectNotNull(@aa1 BleKey r8, @aa1 Class<T> r9, @tb1 T r10, @tb1 BleKeyFlag r11) {
        Intrinsics.X0O(r8, "bleKey");
        Intrinsics.X0O(r9, "clazz");
        T r12 = (T) getObject$default(this, r8, r9, null, 4, null);
        if (r12 != null) goto L8;
        if (r10 != null) goto L6;
        r10 = r9.newInstance();
    L6:
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getObjectNotNull " + getKey(r8, r11) + i1iXIO.XO0O10 + r10);
        return r10;
    L8:
        return r12;
    }

    @aa1
    public String getString(@aa1 BleKey r4, @aa1 String r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        Intrinsics.X0O(r5, "def");
        String r7 = getMSpUtils().getString(getKey(r4, r6), r5);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getString " + getKey(r4, r6) + i1iXIO.XO0O10 + r7);
        Intrinsics.O10IXXX0X(r7, "also(...)");
        return r7;
    }

    public void putBoolean(@aa1 BleKey r4, boolean r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putBoolean " + getKey(r4, r6) + i1iXIO.XO0O10 + r5);
        getMSpUtils().put(getKey(r4, r6), r5);
    }

    public void putInt(@aa1 BleKey r4, int r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putInt " + getKey(r4, r6) + i1iXIO.XO0O10 + r5);
        getMSpUtils().put(getKey(r4, r6), r5);
    }

    public <T> void putList(@aa1 BleKey r4, @tb1 List<? extends T> r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putList " + getKey(r4, r6) + i1iXIO.XO0O10 + r5);
        if (r5 != null) goto L5;
    L9:
        remove$default(this, r4, null, 2, null);
        return;
    L5:
        if (r5.isEmpty() == true) goto L9;
        getMSpUtils().put(getKey(r4, r6), new Gson().toJson(r5));
    }

    public void putLong(@aa1 BleKey r4, long r5, @tb1 BleKeyFlag r7) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putLong " + getKey(r4, r7) + i1iXIO.XO0O10 + r5);
        getMSpUtils().put(getKey(r4, r7), r5);
    }

    public final void putMtkOtaMeta(@aa1 String r4) {
        Intrinsics.X0O(r4, "meta");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putMtkOtaMeta  -> " + r4);
        getMSpUtils().put(MTK_OTA_META, r4);
    }

    public <T> void putObject(@aa1 BleKey r4, @tb1 T r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putObject " + getKey(r4, r6) + i1iXIO.XO0O10 + r5);
        if (r5 != null) goto L6;
        remove$default(this, r4, null, 2, null);
        return;
    L6:
        getMSpUtils().put(getKey(r4, r6), new Gson().toJson(r5));
    }

    public void putString(@aa1 BleKey r4, @aa1 String r5, @tb1 BleKeyFlag r6) {
        Intrinsics.X0O(r4, "bleKey");
        Intrinsics.X0O(r5, "value");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putString " + getKey(r4, r6) + i1iXIO.XO0O10 + r5);
        getMSpUtils().put(getKey(r4, r6), r5);
    }

    public void remove(@aa1 BleKey r4, @tb1 BleKeyFlag r5) {
        Intrinsics.X0O(r4, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache remove " + getKey(r4, r5));
        getMSpUtils().remove(getKey(r4, r5));
    }

    public boolean requireCache(@aa1 BleKey r4, @aa1 BleKeyFlag r5) {
        Intrinsics.X0O(r4, "bleKey");
        Intrinsics.X0O(r5, "bleKeyFlag");
        BleCommand r6 = r4.getMBleCommand();
        int r7 = WhenMappings.$EnumSwitchMapping$0[r6.ordinal()];
        if (r7 == 1) goto L32;
        if (r7 == 2) goto L21;
        if (r7 == 3) goto L10;
        return false;
    L10:
        if (r5 != BleKeyFlag.CREATE) goto L12;
    L19:
        return true;
    L12:
        if (r5 == BleKeyFlag.DELETE) goto L19;
        if (r5 == BleKeyFlag.UPDATE) goto L19;
        if (r5 == BleKeyFlag.RESET) goto L19;
        return false;
    L21:
        if (r5 != BleKeyFlag.CREATE) goto L23;
    L30:
        return true;
    L23:
        if (r5 == BleKeyFlag.DELETE) goto L30;
        if (r5 == BleKeyFlag.UPDATE) goto L30;
        if (r5 == BleKeyFlag.RESET) goto L30;
        return false;
    L32:
        if (r5 != BleKeyFlag.CREATE) goto L34;
    L41:
        return true;
    L34:
        if (r5 == BleKeyFlag.DELETE) goto L41;
        if (r5 == BleKeyFlag.UPDATE) goto L41;
        if (r5 == BleKeyFlag.RESET) goto L41;
        return false;
    }

    public void setMDeviceInfo(@tb1 BleDeviceInfo r1) {
        this.mDeviceInfo = r1;
    }

    public BaseBleCache(@aa1 String r3) {
        Intrinsics.X0O(r3, "mDeviceAddress");
        this.mDeviceAddress = r3;
        this.mSpUtils$delegate = LazyKt__LazyJVMKt.iO(new I10O(this));
        SparseArray<String> r4 = new SparseArray();
        r4.append(1, "http://wepodownload.mediatek.com/EPO_GR_3_1.DAT");
        r4.append(2, "https://alp.u-blox.com/current_1d.alp");
        r4.append(6, "https://api.smawatch.cn/epo/ble_epo_offline.bin");
        r4.append(7, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/file_info_3335_epo.DAT");
        r4.append(8, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/file_info_7dv5_lto.brm");
        r4.append(9, "https://api-oss.iot-solution.net/a-gps/f1e1G7C7J7.pgl");
        r4.append(10, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/f1e1G7R7C7E7J7.pgl");
        this.mAGpsFileUrls = r4;
    }

    public /* synthetic */ BaseBleCache(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
