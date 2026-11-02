package com.szabh.smable3.component;

import android.bluetooth.BluetoothAdapter;
import android.util.SparseArray;
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
import com.szabh.smable3.component.BaseBleCache;
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
import kotlin.jvm.functions.Function0;
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
    public static final Companion Companion = new Companion(null);

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
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @aa1
        public final BaseBleCache create(@aa1 String deviceAddress) {
            Intrinsics.X0O(deviceAddress, "deviceAddress");
            return new BaseBleCache(deviceAddress);
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BleCommand.values().length];
            try {
                iArr[BleCommand.SET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleCommand.PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleCommand.CONTROL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BleKey.values().length];
            try {
                iArr2[BleKey.ALARM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BleKey.SCHEDULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BleKey.COACHING.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BleKey.WORLD_CLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BleKey.STOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BleKey.SMS_QUICK_REPLY_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BleKey.LOVE_TAP_USER.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BleKey.MEDICATION_REMINDER.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BleKey.MEDICATION_ALARM.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBleCache() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ boolean getBoolean$default(BaseBleCache baseBleCache, BleKey bleKey, boolean z, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getBoolean(bleKey, z, bleKeyFlag);
    }

    public static /* synthetic */ int getInt$default(BaseBleCache baseBleCache, BleKey bleKey, int i, BleKeyFlag bleKeyFlag, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getInt(bleKey, i, bleKeyFlag);
    }

    private final String getKey(BleKey bleKey, BleKeyFlag bleKeyFlag) {
        if (bleKeyFlag == null) {
            return String.valueOf(bleKey);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bleKey);
        sb.append('_');
        sb.append(bleKeyFlag);
        return sb.toString();
    }

    public static /* synthetic */ List getList$default(BaseBleCache baseBleCache, BleKey bleKey, Class cls, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getList");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getList(bleKey, cls, bleKeyFlag);
    }

    public static /* synthetic */ long getLong$default(BaseBleCache baseBleCache, BleKey bleKey, long j, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
        }
        if ((i & 2) != 0) {
            j = 0;
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getLong(bleKey, j, bleKeyFlag);
    }

    private final SPUtils getMSpUtils() {
        Object value = this.mSpUtils$delegate.getValue();
        Intrinsics.O10IXXX0X(value, "getValue(...)");
        return (SPUtils) value;
    }

    public static /* synthetic */ Object getObject$default(BaseBleCache baseBleCache, BleKey bleKey, Class cls, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObject");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getObject(bleKey, cls, bleKeyFlag);
    }

    public static /* synthetic */ Object getObjectNotNull$default(BaseBleCache baseBleCache, BleKey bleKey, Class cls, Object obj, BleKeyFlag bleKeyFlag, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getObjectNotNull");
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        if ((i & 8) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getObjectNotNull(bleKey, cls, obj, bleKeyFlag);
    }

    public static /* synthetic */ String getString$default(BaseBleCache baseBleCache, BleKey bleKey, String str, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str = "";
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        return baseBleCache.getString(bleKey, str, bleKeyFlag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SPUtils mSpUtils_delegate$lambda$0(BaseBleCache baseBleCache) {
        return SPUtils.getInstance("sma_ble_sdk3" + baseBleCache.mDeviceAddress);
    }

    public static /* synthetic */ void putBoolean$default(BaseBleCache baseBleCache, BleKey bleKey, boolean z, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putBoolean");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putBoolean(bleKey, z, bleKeyFlag);
    }

    public static /* synthetic */ void putInt$default(BaseBleCache baseBleCache, BleKey bleKey, int i, BleKeyFlag bleKeyFlag, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putInt");
        }
        if ((i2 & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putInt(bleKey, i, bleKeyFlag);
    }

    public static /* synthetic */ void putList$default(BaseBleCache baseBleCache, BleKey bleKey, List list, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putList");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putList(bleKey, list, bleKeyFlag);
    }

    public static /* synthetic */ void putLong$default(BaseBleCache baseBleCache, BleKey bleKey, long j, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putLong");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putLong(bleKey, j, bleKeyFlag);
    }

    public static /* synthetic */ void putObject$default(BaseBleCache baseBleCache, BleKey bleKey, Object obj, BleKeyFlag bleKeyFlag, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putObject");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putObject(bleKey, obj, bleKeyFlag);
    }

    public static /* synthetic */ void putString$default(BaseBleCache baseBleCache, BleKey bleKey, String str, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: putString");
        }
        if ((i & 4) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.putString(bleKey, str, bleKeyFlag);
    }

    public static /* synthetic */ void remove$default(BaseBleCache baseBleCache, BleKey bleKey, BleKeyFlag bleKeyFlag, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: remove");
        }
        if ((i & 2) != 0) {
            bleKeyFlag = null;
        }
        baseBleCache.remove(bleKey, bleKeyFlag);
    }

    public void clear() {
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache clear");
        getMSpUtils().clear();
    }

    public boolean getBoolean(@aa1 BleKey bleKey, boolean z, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        boolean z2 = getMSpUtils().getBoolean(getKey(bleKey, bleKeyFlag), z);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getBoolean " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + z2);
        return z2;
    }

    @aa1
    public List<BleIdObject> getIdObjects(@aa1 BleKey bleKey) {
        List list$default;
        Intrinsics.X0O(bleKey, "bleKey");
        switch (WhenMappings.$EnumSwitchMapping$1[bleKey.ordinal()]) {
            case 1:
                list$default = getList$default(this, bleKey, BleAlarm.class, null, 4, null);
                break;
            case 2:
                list$default = getList$default(this, bleKey, BleSchedule.class, null, 4, null);
                break;
            case 3:
                list$default = getList$default(this, bleKey, BleCoaching.class, null, 4, null);
                break;
            case 4:
                list$default = getList$default(this, bleKey, BleWorldClock.class, null, 4, null);
                break;
            case 5:
                list$default = getList$default(this, bleKey, BleStock.class, null, 4, null);
                break;
            case 6:
                list$default = getList$default(this, bleKey, BleSMSQuickReplyContent.class, null, 4, null);
                break;
            case 7:
                list$default = getList$default(this, bleKey, BleLoveTapUser.class, null, 4, null);
                break;
            case 8:
                list$default = getList$default(this, bleKey, BleMedicationReminder.class, null, 4, null);
                break;
            case 9:
                list$default = getList$default(this, bleKey, BleMedicationAlarm.class, null, 4, null);
                break;
            default:
                list$default = CollectionsKt__CollectionsKt.m39402iI();
                break;
        }
        return CollectionsKt___CollectionsKt.OO0Oi10(list$default);
    }

    public int getInt(@aa1 BleKey bleKey, int i, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        int i2 = getMSpUtils().getInt(getKey(bleKey, bleKeyFlag), i);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getInt " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + i2);
        return i2;
    }

    @aa1
    public <T> List<T> getList(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        ArrayList arrayList = new ArrayList();
        String string = getMSpUtils().getString(getKey(bleKey, bleKeyFlag));
        Intrinsics.O10IXXX0X(string, "getString(...)");
        if (!StringsKt__StringsKt.i0XI0(string)) {
            try {
                JsonArray asJsonArray = JsonParser.parseString(getMSpUtils().getString(getKey(bleKey, bleKeyFlag))).getAsJsonArray();
                if (asJsonArray != null) {
                    Iterator<JsonElement> it = asJsonArray.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Gson().fromJson(it.next(), (Class) clazz));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getList " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + arrayList);
        return arrayList;
    }

    public long getLong(@aa1 BleKey bleKey, long j, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        long j2 = getMSpUtils().getLong(getKey(bleKey, bleKeyFlag), j);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getLong " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + j2);
        return j2;
    }

    @aa1
    public final String getMAGpsFileUrl() {
        String str = this.mAGpsFileUrls.get(getMAGpsType());
        return str == null ? "" : str;
    }

    public final int getMAGpsType() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMAGpsType();
        }
        return 0;
    }

    @aa1
    public final String getMBleAddress() {
        String mBleAddress;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mBleAddress = mDeviceInfo.getMBleAddress()) == null) ? "" : mBleAddress;
    }

    @aa1
    public final String getMBleCustomName() {
        String mBleCustomName;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mBleCustomName = mDeviceInfo.getMBleCustomName()) == null) ? "" : mBleCustomName;
    }

    @aa1
    public final String getMBleName() {
        String mBleName;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mBleName = mDeviceInfo.getMBleName()) == null) ? "" : mBleName;
    }

    public final int getMBlockSwimmingReminders() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMBlockSwimmingReminders();
        }
        return 0;
    }

    @aa1
    public final String getMClassicAddress() {
        String mClassicAddress;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mClassicAddress = mDeviceInfo.getMClassicAddress()) == null) ? "" : mClassicAddress;
    }

    @aa1
    public final List<Integer> getMDataKeys() {
        List<Integer> mDataKeys;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mDataKeys = mDeviceInfo.getMDataKeys()) == null) ? CollectionsKt__CollectionsKt.m39402iI() : mDataKeys;
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
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo == null || !BluetoothAdapter.checkBluetoothAddress(mDeviceInfo.getMBleAddress())) {
            return "";
        }
        if (!Intrinsics.XOO0ii0(mDeviceInfo.getMPlatform(), BleDeviceInfo.PLATFORM_JL) && !Intrinsics.XOO0ii0(mDeviceInfo.getMPlatform(), BleDeviceInfo.PLATFORM_JL707) && !Intrinsics.XOO0ii0(mDeviceInfo.getMPlatform(), BleDeviceInfo.PLATFORM_JL707LITE) && !Intrinsics.XOO0ii0(mDeviceInfo.getMPlatform(), BleDeviceInfo.PLATFORM_NORDIC) && (!Intrinsics.XOO0ii0(mDeviceInfo.getMPlatform(), BleDeviceInfo.PLATFORM_GOODIX) || !Intrinsics.XOO0ii0(mDeviceInfo.getMPrototype(), BleDeviceInfo.PROTOTYPE_R3Q))) {
            return mDeviceInfo.getMBleAddress();
        }
        long j = Long.parseLong(oe5.IXO0OOi(mDeviceInfo.getMBleAddress(), CertificateUtil.DELIMITER, "", false, 4, null), OXO1.OXO1(16)) + 1;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%012X", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        return CollectionsKt___CollectionsKt.XOiXXOO(StringsKt___StringsKt.OXO(str, 2), CertificateUtil.DELIMITER, null, null, 0, null, null, 62, null);
    }

    @aa1
    public final String getMFirmwareFlag() {
        String mFirmwareFlag;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mFirmwareFlag = mDeviceInfo.getMFirmwareFlag()) == null) ? "" : mFirmwareFlag;
    }

    public final int getMHideDigitalPower() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMHideDigitalPower();
        }
        return 0;
    }

    @aa1
    public final String getMID() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return String.valueOf(mDeviceInfo != null ? Integer.valueOf(mDeviceInfo.getMId()) : null);
    }

    public final long getMIOBufferSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        Long lValueOf = mDeviceInfo != null ? Long.valueOf(mDeviceInfo.getMIOBufferSize()) : null;
        if (lValueOf == null || lValueOf.longValue() == 0) {
            lValueOf = Long.valueOf(BleStreamPacket.Companion.getBUFFER_MAX_SIZE());
        }
        return lValueOf.longValue();
    }

    @aa1
    public final String getMPlatform() {
        String mPlatform;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mPlatform = mDeviceInfo.getMPlatform()) == null) ? "" : mPlatform;
    }

    @aa1
    public final String getMPrototype() {
        String mPrototype;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mPrototype = mDeviceInfo.getMPrototype()) == null) ? "" : mPrototype;
    }

    public final int getMQrcodeContentSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMQrcodeContentSize();
        }
        return 0;
    }

    public final int getMQrcodeSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMQrcodeSize();
        }
        return 0;
    }

    @aa1
    public final String getMSN() {
        String mSupportShowSNNumber;
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        return (mDeviceInfo == null || (mSupportShowSNNumber = mDeviceInfo.getMSupportShowSNNumber()) == null) ? "" : mSupportShowSNNumber;
    }

    public final int getMShowAntiLostSwitch() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMShowAntiLostSwitch();
        }
        return 0;
    }

    public final int getMSleepAlgorithmType() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSleepAlgorithmType();
        }
        return 0;
    }

    public final int getMSupport2DAcceleration() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupport2DAcceleration();
        }
        return 0;
    }

    public final int getMSupportAICoach() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAICoach();
        }
        return 0;
    }

    public final int getMSupportAITranslation() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAITranslation();
        }
        return 0;
    }

    public final int getMSupportAMapOfflineMap() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAMapOfflineMap();
        }
        return 0;
    }

    public final int getMSupportActivityRecognition() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportActivityRecognition();
        }
        return 0;
    }

    public final int getMSupportAiCoachV2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAICoachV2();
        }
        return 0;
    }

    public final int getMSupportAiOngoingDialogue() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAiOngoingDialogue();
        }
        return 0;
    }

    public final int getMSupportAlipay() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAlipay();
        }
        return 0;
    }

    public final int getMSupportAppPushSwitch() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAppPushSwitch();
        }
        return 0;
    }

    public final int getMSupportAppSport() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAppSport();
        }
        return 0;
    }

    public final int getMSupportAppStore() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAppStore();
        }
        return 0;
    }

    public final int getMSupportAudioBooks() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportAudioBooks();
        }
        return 0;
    }

    public final int getMSupportBloodOxyGenSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportBloodOxyGenSet();
        }
        return 0;
    }

    public final int getMSupportBloodPressureCalibration() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportBloodPressureCalibration();
        }
        return 0;
    }

    public final int getMSupportChangeClassicBluetoothState() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportChangeClassicBluetoothState();
        }
        return 0;
    }

    public final int getMSupportChargeWhileUsing() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportChargeWhileUsing();
        }
        return 0;
    }

    public final int getMSupportConnectReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportConnectReminder();
        }
        return 0;
    }

    public final int getMSupportContactSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportContactSize();
        }
        return 0;
    }

    public final int getMSupportContactSort() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportContactSort();
        }
        return 0;
    }

    public final int getMSupportCrossAppTranslation() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportCrossAppTranslation();
        }
        return 0;
    }

    public final int getMSupportCustomLogo() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportCustomLogo();
        }
        return 0;
    }

    public final int getMSupportCyWeeAlgorithm() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportCyWeeAlgorithm();
        }
        return 0;
    }

    public final int getMSupportCyWeeAlgorithmGpsPush() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportCyWeeAlgorithmGpsPush();
        }
        return 0;
    }

    public final int getMSupportDateFormatSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportDateFormatSet();
        }
        return 0;
    }

    public final int getMSupportDeviceSportData() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportDeviceSportData();
        }
        return 0;
    }

    public final int getMSupportDoubleScreen() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportDoubleScreen();
        }
        return 0;
    }

    public final int getMSupportDrinkWaterSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportDrinkWaterSet();
        }
        return 0;
    }

    public final int getMSupportEbookTransfer() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportEbookTransfer();
        }
        return 0;
    }

    public final int getMSupportEnergyRating() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportEnergyRating();
        }
        return 0;
    }

    public final int getMSupportFallSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportFallSet();
        }
        return 0;
    }

    public final int getMSupportFindWatch() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportFindWatch();
        }
        return 0;
    }

    public final int getMSupportGPSFirmwareFile() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGPSFirmwareFile();
        }
        return 0;
    }

    public final int getMSupportGameControl() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGameControls();
        }
        return 0;
    }

    public final int getMSupportGameTimeReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGameTimeReminder();
        }
        return 0;
    }

    public final int getMSupportGestureWake2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGestureWake2();
        }
        return 0;
    }

    public final int getMSupportGetWatchFaceMaxSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGetWatchFaceMaxSize();
        }
        return 0;
    }

    public final int getMSupportGirlCareMonthly() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGirlCareMonthly();
        }
        return 0;
    }

    public final int getMSupportGirlCareReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGirlCareReminder();
        }
        return 0;
    }

    public final int getMSupportGoMoreSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGoMoreSet();
        }
        return 0;
    }

    public final int getMSupportGolfMapData() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGolfMapData();
        }
        return 0;
    }

    public final int getMSupportGoogleNavigation() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportGoogleNavigation();
        }
        return 0;
    }

    public final int getMSupportHID() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportHID();
        }
        return 0;
    }

    public final int getMSupportHighAntiAssist() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportHighAntiAssist();
        }
        return 0;
    }

    public final int getMSupportHrWarnSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportHrWarnSet();
        }
        return 0;
    }

    public final int getMSupportHrvSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportHrvSet();
        }
        return 0;
    }

    public final int getMSupportHydrationReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportHydrationReminder();
        }
        return 0;
    }

    public final int getMSupportIBeaconSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportIBeaconSet();
        }
        return 0;
    }

    public final int getMSupportIPC() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportIPC();
        }
        return 0;
    }

    public final int getMSupportIncomingCallRing() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportIncomingCallRing();
        }
        return 0;
    }

    public final int getMSupportJLTransport() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportJLTransport();
        }
        return 0;
    }

    public final int getMSupportLaunchDeviceSport() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportLaunchDeviceSport();
        }
        return 0;
    }

    public final int getMSupportLoveTap() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportLoveTap();
        }
        return 0;
    }

    public final int getMSupportMatchV3() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMatchV3();
        }
        return 0;
    }

    public final int getMSupportMeasurementBloodGlucose() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMeasurementBloodGlucose();
        }
        return 0;
    }

    public final int getMSupportMedicationAlarm() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMedicationAlarm();
        }
        return 0;
    }

    public final int getMSupportMedicationReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMedicationReminder();
        }
        return 0;
    }

    public final int getMSupportMeetingReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMeetingReminder();
        }
        return 0;
    }

    public final int getMSupportMusicTransfer() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMusicTransfer();
        }
        return 0;
    }

    public final int getMSupportMyCardCodeSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportMyCardCodeSize();
        }
        return 0;
    }

    public final int getMSupportNavImage() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNavImage();
        }
        return 0;
    }

    public final int getMSupportNavigation() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNavigation();
        }
        return 0;
    }

    public final int getMSupportNetwork() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNetwork();
        }
        return 0;
    }

    public final int getMSupportNewsfeed() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNewsfeed();
        }
        return 0;
    }

    public final int getMSupportNoDisturbSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNoDisturbSet();
        }
        return 0;
    }

    public final int getMSupportNoDisturbSet2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNoDisturbSet2();
        }
        return 0;
    }

    public final int getMSupportNoiseSet() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNoiseSet();
        }
        return 0;
    }

    public final int getMSupportNotSaveAPPSport() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNotSaveAPPSport();
        }
        return 0;
    }

    public final int getMSupportNotificationLightScreenSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportNotificationLightScreenSet();
        }
        return 0;
    }

    public final int getMSupportOTAFile() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportOTAFile();
        }
        return 0;
    }

    public final int getMSupportOfflineAsrAuth() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportOfflineAsrAuth();
        }
        return 0;
    }

    public final int getMSupportOfflineMap() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReadOffLineMap();
        }
        return 0;
    }

    public final int getMSupportPhysicalStrength() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportPhysicalStrength();
        }
        return 0;
    }

    public final int getMSupportPower2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportPower2();
        }
        return 0;
    }

    public final int getMSupportPowerSaveMode() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportPowerSaveMode();
        }
        return 0;
    }

    public final int getMSupportPressureTimingMeasurement() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportPressureTimingMeasurement();
        }
        return 0;
    }

    public final int getMSupportQcyProtocol() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportInheritanceAgreement();
        }
        return 0;
    }

    public final int getMSupportQiblaSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportQiblaSet();
        }
        return 0;
    }

    public final int getMSupportQrcode() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportQrcode();
        }
        return 0;
    }

    public final int getMSupportQuran() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportQuran();
        }
        return 0;
    }

    public final int getMSupportReadDeviceInfo() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReadDeviceInfo();
        }
        return 0;
    }

    public final int getMSupportReadLanguages() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReadLanguages();
        }
        return 0;
    }

    public final int getMSupportReadLanguages2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReadLanguages2();
        }
        return 0;
    }

    public final int getMSupportReadPackageStatus() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReadPackageStatus();
        }
        return 0;
    }

    public final int getMSupportRealTimeMeasurement() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRealTimeMeasurement();
        }
        return 0;
    }

    public final int getMSupportReceiptCodeSize() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportReceiptCodeSize();
        }
        return 0;
    }

    public final int getMSupportRecordAudio() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRecordAudio();
        }
        return 0;
    }

    public final int getMSupportRecordNote() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRecordNote();
        }
        return 0;
    }

    public final int getMSupportRelaxReminder() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRelaxReminder();
        }
        return 0;
    }

    public final int getMSupportRequestRealtimeWeather() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRequestRealtimeWeather();
        }
        return 0;
    }

    public final int getMSupportRespiratoryRate() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRespiratoryRate();
        }
        return 0;
    }

    public final int getMSupportRestoreFactory() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRestoreFactory();
        }
        return 0;
    }

    public final int getMSupportRingVibrationSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportRingVibrationSet();
        }
        return 0;
    }

    public final int getMSupportSDCardInfo() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSDCardInfo();
        }
        return 0;
    }

    public final int getMSupportSHSYAlgorithm() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSHSYAlgorithm();
        }
        return 0;
    }

    public final int getMSupportSMSQuickReply() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSMSQuickReply();
        }
        return 0;
    }

    public final int getMSupportSOSSet2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSOSSet2();
        }
        return 0;
    }

    public final int getMSupportSetWatchPassword() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSetWatchPassword();
        }
        return 0;
    }

    public final int getMSupportSimultaneousTranslation() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSimultaneousTranslation();
        }
        return 0;
    }

    public final int getMSupportSleepScore() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSleepScore();
        }
        return 0;
    }

    public final int getMSupportSleepSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSleepSet();
        }
        return 0;
    }

    public final int getMSupportSosContact() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSosContact();
        }
        return 0;
    }

    public final int getMSupportStandbySet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportStandbySet();
        }
        return 0;
    }

    public final int getMSupportStock() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportStock();
        }
        return 0;
    }

    public final int getMSupportStringQrcode() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportStringQrcode();
        }
        return 0;
    }

    public final int getMSupportStudyCards() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportStudyCards();
        }
        return 0;
    }

    public final int getMSupportSwitchPhoneAssistant() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSwitchPhoneAssistant();
        }
        return 0;
    }

    public final int getMSupportSyncAGPSInBackground() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportSyncAGPSInBackground();
        }
        return 0;
    }

    public final int getMSupportTemperatureUnitSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportTemperatureUnitSet();
        }
        return 0;
    }

    public final int getMSupportTimeFormat() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportTimeFormat();
        }
        return 0;
    }

    public final int getMSupportTimerStandbySet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportTimerStandbySet();
        }
        return 0;
    }

    public final int getMSupportTouchSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportTouchSet();
        }
        return 0;
    }

    public final int getMSupportTuyaKey() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportTuyaKey();
        }
        return 0;
    }

    public final int getMSupportVibrationIntensity() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVibrationIntensity();
        }
        return 0;
    }

    public final int getMSupportVideoCalls() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVideoCalls();
        }
        return 0;
    }

    public final int getMSupportVitalityValue() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVitalityValue();
        }
        return 0;
    }

    public final int getMSupportVoice() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVoice();
        }
        return 0;
    }

    public final int getMSupportVoiceControl() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVoiceControl();
        }
        return 0;
    }

    public final int getMSupportVoiceMaxLength() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportVoiceMaxLength();
        }
        return 0;
    }

    public final int getMSupportWalkAndBike() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWalkAndBike();
        }
        return 0;
    }

    public final int getMSupportWashSet() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWashSet();
        }
        return 0;
    }

    public final int getMSupportWatchFaceId() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWatchFaceId();
        }
        return 0;
    }

    public final int getMSupportWatchFaceIndex() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWatchFaceIndex();
        }
        return 0;
    }

    public final int getMSupportWatchface2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWatchface2();
        }
        return 0;
    }

    public final int getMSupportWeChat() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWeChat();
        }
        return 0;
    }

    public final int getMSupportWeChatCall() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWeChatCall();
        }
        return 0;
    }

    public final int getMSupportWearDetection() {
        BleDeviceInfo mDeviceInfo = BleCache.INSTANCE.getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWearDetection();
        }
        return 0;
    }

    public final int getMSupportWearWay() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWearWay();
        }
        return 0;
    }

    public final int getMSupportWeather2() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWeather2();
        }
        return 0;
    }

    public final int getMSupportWechatPay() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWechatPay();
        }
        return 0;
    }

    public final int getMSupportWhatsApp() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWhatsApp();
        }
        return 0;
    }

    public final int getMSupportWorldClock() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMSupportWorldClock();
        }
        return 0;
    }

    public final int getMWatchFaceType() {
        BleDeviceInfo mDeviceInfo = getMDeviceInfo();
        if (mDeviceInfo != null) {
            return mDeviceInfo.getMWatchFaceType();
        }
        return 0;
    }

    @aa1
    public final String getMtkOtaMeta() {
        String string = getMSpUtils().getString(MTK_OTA_META);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getMtkOtaMeta -> " + string);
        Intrinsics.O10IXXX0X(string, "also(...)");
        return string;
    }

    @aa1
    public final String getMultiDeviceAddress() {
        return this.mDeviceAddress;
    }

    @tb1
    public <T> T getObject(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        T t = (T) new Gson().fromJson(getMSpUtils().getString(getKey(bleKey, bleKeyFlag)), (Class) clazz);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getObject " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + t);
        return t;
    }

    public <T> T getObjectNotNull(@aa1 BleKey bleKey, @aa1 Class<T> clazz, @tb1 T t, @tb1 BleKeyFlag bleKeyFlag) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(clazz, "clazz");
        T t2 = (T) getObject$default(this, bleKey, clazz, null, 4, null);
        if (t2 != null) {
            return t2;
        }
        if (t == null) {
            t = clazz.newInstance();
        }
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getObjectNotNull " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + t);
        return t;
    }

    @aa1
    public String getString(@aa1 BleKey bleKey, @aa1 String def, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(def, "def");
        String string = getMSpUtils().getString(getKey(bleKey, bleKeyFlag), def);
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache getString " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + string);
        Intrinsics.O10IXXX0X(string, "also(...)");
        return string;
    }

    public void putBoolean(@aa1 BleKey bleKey, boolean z, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putBoolean " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + z);
        getMSpUtils().put(getKey(bleKey, bleKeyFlag), z);
    }

    public void putInt(@aa1 BleKey bleKey, int i, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putInt " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + i);
        getMSpUtils().put(getKey(bleKey, bleKeyFlag), i);
    }

    public <T> void putList(@aa1 BleKey bleKey, @tb1 List<? extends T> list, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putList " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + list);
        if (list == null || list.isEmpty()) {
            remove$default(this, bleKey, null, 2, null);
        } else {
            getMSpUtils().put(getKey(bleKey, bleKeyFlag), new Gson().toJson(list));
        }
    }

    public void putLong(@aa1 BleKey bleKey, long j, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putLong " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + j);
        getMSpUtils().put(getKey(bleKey, bleKeyFlag), j);
    }

    public final void putMtkOtaMeta(@aa1 String meta) {
        Intrinsics.X0O(meta, "meta");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putMtkOtaMeta  -> " + meta);
        getMSpUtils().put(MTK_OTA_META, meta);
    }

    public <T> void putObject(@aa1 BleKey bleKey, @tb1 T t, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putObject " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + t);
        if (t == null) {
            remove$default(this, bleKey, null, 2, null);
        } else {
            getMSpUtils().put(getKey(bleKey, bleKeyFlag), new Gson().toJson(t));
        }
    }

    public void putString(@aa1 BleKey bleKey, @aa1 String value, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(value, "value");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache putString " + getKey(bleKey, bleKeyFlag) + i1iXIO.XO0O10 + value);
        getMSpUtils().put(getKey(bleKey, bleKeyFlag), value);
    }

    public void remove(@aa1 BleKey bleKey, @tb1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        i1O0OXO1O.OXO1.IiI10X("BaseBleCache remove " + getKey(bleKey, bleKeyFlag));
        getMSpUtils().remove(getKey(bleKey, bleKeyFlag));
    }

    public boolean requireCache(@aa1 BleKey bleKey, @aa1 BleKeyFlag bleKeyFlag) {
        Intrinsics.X0O(bleKey, "bleKey");
        Intrinsics.X0O(bleKeyFlag, "bleKeyFlag");
        int i = WhenMappings.$EnumSwitchMapping$0[bleKey.getMBleCommand().ordinal()];
        if (i == 1) {
            return bleKeyFlag == BleKeyFlag.CREATE || bleKeyFlag == BleKeyFlag.DELETE || bleKeyFlag == BleKeyFlag.UPDATE || bleKeyFlag == BleKeyFlag.RESET;
        }
        if (i == 2) {
            return bleKeyFlag == BleKeyFlag.CREATE || bleKeyFlag == BleKeyFlag.DELETE || bleKeyFlag == BleKeyFlag.UPDATE || bleKeyFlag == BleKeyFlag.RESET;
        }
        if (i != 3) {
            return false;
        }
        return bleKeyFlag == BleKeyFlag.CREATE || bleKeyFlag == BleKeyFlag.DELETE || bleKeyFlag == BleKeyFlag.UPDATE || bleKeyFlag == BleKeyFlag.RESET;
    }

    public void setMDeviceInfo(@tb1 BleDeviceInfo bleDeviceInfo) {
        this.mDeviceInfo = bleDeviceInfo;
    }

    public BaseBleCache(@aa1 String mDeviceAddress) {
        Intrinsics.X0O(mDeviceAddress, "mDeviceAddress");
        this.mDeviceAddress = mDeviceAddress;
        this.mSpUtils$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.I10O
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return BaseBleCache.mSpUtils_delegate$lambda$0(this.f1311IO);
            }
        });
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.append(1, "http://wepodownload.mediatek.com/EPO_GR_3_1.DAT");
        sparseArray.append(2, "https://alp.u-blox.com/current_1d.alp");
        sparseArray.append(6, "https://api.smawatch.cn/epo/ble_epo_offline.bin");
        sparseArray.append(7, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/file_info_3335_epo.DAT");
        sparseArray.append(8, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/file_info_7dv5_lto.brm");
        sparseArray.append(9, "https://api-oss.iot-solution.net/a-gps/f1e1G7C7J7.pgl");
        sparseArray.append(10, "https://sma-product.oss-accelerate.aliyuncs.com/a-gps/f1e1G7R7C7E7J7.pgl");
        this.mAGpsFileUrls = sparseArray;
    }

    public /* synthetic */ BaseBleCache(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
