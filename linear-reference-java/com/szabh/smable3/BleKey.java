package com.szabh.smable3;

import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.OOOi0;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.z30;
import com.baidu.platform.comapi.UIMsg;
import com.blankj.utilcode.constant.PermissionConstants;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.goodix.ble.libble.center.BleCenter;
import com.goodix.ble.libcomx.task.TaskPipe;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.jieli.jl_rcsp.constant.Command;
import com.realsil.sdk.dfu.DfuConstants;
import com.realsil.sdk.dfu.DfuException;
import com.realsil.sdk.dfu.image.constants.SubBinId;
import com.realsil.sdk.dfu.utils.DfuAdapter;
import com.sifli.siflidfu.constants.General;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleKey\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
public final enum BleKey extends Enum<BleKey> {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ BleKey[] $VALUES = null;
    public static final BleKey ACTIVITY = null;
    public static final BleKey ACTIVITY_DETAIL = null;
    public static final BleKey ACTIVITY_REALTIME = null;
    public static final BleKey ACTIVITY_RECOGNIYION = null;
    public static final BleKey AEROBIC_EXERCISE = null;
    public static final BleKey AGPS_FILE = null;
    public static final BleKey AGPS_FILE2 = null;
    public static final BleKey AGPS_PREREQUISITE = null;
    public static final BleKey AIR_PRESSURE_CALIBRATION = null;
    public static final BleKey AI_COACH_PLAN = null;
    public static final BleKey AI_COACH_PLAN_V2 = null;
    public static final BleKey AI_COACH_PLAN_V2_READ = null;
    public static final BleKey AI_COMMAND = null;
    public static final BleKey ALARM = null;
    public static final BleKey ALIPAY_BIND_INFO = null;
    public static final BleKey ALIPAY_SET = null;
    public static final BleKey ANTI_LOST = null;
    public static final BleKey APP_API_VERSION = null;
    public static final BleKey APP_FILE = null;
    public static final BleKey APP_OP = null;
    public static final BleKey APP_SPORT_DATA = null;
    public static final BleKey APP_SPORT_STATE = null;
    public static final BleKey AUDIO_CONTROL = null;
    public static final BleKey AUDIO_TEXT = null;
    public static final BleKey AVG_HEART_RATE = null;
    public static final BleKey BAC = null;
    public static final BleKey BACK_LIGHT = null;
    public static final BleKey BAC_CALIBRATION = null;
    public static final BleKey BAC_RESULT = null;
    public static final BleKey BAC_RESULT_SET = null;
    public static final BleKey BAC_SET = null;
    public static final BleKey BAND_KEY = null;
    public static final BleKey BATTERY_USAGE = null;
    public static final BleKey BLE_ADDRESS = null;
    public static final BleKey BLE_ADDRESS_SET = null;
    public static final BleKey BLE_GOLF_EDITTEXT_DATA = null;
    public static final BleKey BLOOD_GLUCOSE = null;
    public static final BleKey BLOOD_OXYGEN = null;
    public static final BleKey BLOOD_OXYGEN_SET = null;
    public static final BleKey BLOOD_PRESSURE = null;
    public static final BleKey BLOOD_PRESSURE_CALIBRATION = null;
    public static final BleKey BODY_STATUS = null;
    public static final BleKey BRAND_INFO_FILE = null;
    public static final BleKey BT_NAME = null;
    public static final BleKey BW_NAVI_INFO = null;
    public static final BleKey CALIBRATION_DATA = null;
    public static final BleKey CALORIES_GOAL = null;
    public static final BleKey CALORIE_INTAKE = null;
    public static final BleKey CAMERA = null;
    public static final BleKey CHAT_APP = null;
    public static final BleKey CHAT_MESSAGE = null;
    public static final BleKey CHAT_VOICE = null;
    public static final BleKey CHECK_IN_EVERY_DAY = null;
    public static final BleKey CLASSIC_BLUETOOTH_STATE = null;
    public static final BleKey COACHING = null;
    public static final BleKey CONNECT_REMINDER = null;
    public static final BleKey CONTACT = null;
    public static final BleKey CONTACT_SORT = null;
    public static final BleKey CONTACT_US = null;
    public static final BleKey CP_ANNIVERSARY = null;
    public static final BleKey CP_AVATAR = null;
    public static final BleKey CP_CHAT = null;
    public static final BleKey CP_DISTANCE = null;
    public static final BleKey CP_GALLERY = null;
    public static final BleKey CP_GIFTS = null;
    public static final BleKey CP_GIFTS_INFO = null;
    public static final BleKey CP_LISTENER = null;
    public static final BleKey CP_MISS_YOU = null;
    public static final BleKey CP_NOTIFICATION = null;
    public static final BleKey CP_TODO = null;
    public static final BleKey CP_USER_INFO = null;
    public static final BleKey CP_WEATHER_FORECAST = null;
    public static final BleKey CP_WEATHER_REALTIME = null;

    @aa1
    public static final OXO1 Companion = null;
    public static final BleKey DAILY_POWER = null;
    public static final BleKey DATA_ALL = null;
    public static final BleKey DATE_FORMAT = null;
    public static final BleKey DEVICE_FILE = null;
    public static final BleKey DEVICE_INFO = null;
    public static final BleKey DEVICE_LANGUAGES = null;
    public static final BleKey DEVICE_LANGUAGES2 = null;
    public static final BleKey DEVICE_OP = null;
    public static final BleKey DEVICE_SMS_QUICK_REPLY = null;
    public static final BleKey DEVICE_SPORT_DATA = null;
    public static final BleKey DEVICE_UNIQUE_DATA_SET = null;
    public static final BleKey DISTANCE_GOAL = null;
    public static final BleKey DOUBLE_SCREEN = null;
    public static final BleKey DRINK_WATER = null;
    public static final BleKey EARPHONE_ANC_SET = null;
    public static final BleKey EARPHONE_CALL = null;
    public static final BleKey EARPHONE_INFO = null;
    public static final BleKey EARPHONE_KEY = null;
    public static final BleKey EARPHONE_POWER = null;
    public static final BleKey EARPHONE_SOUND_EFFECTS_SET = null;
    public static final BleKey EARPHONE_STATE = null;
    public static final BleKey ECG = null;
    public static final BleKey ECG_SET = null;
    public static final BleKey ECG_V2 = null;
    public static final BleKey ENERGY_RATING = null;
    public static final BleKey FACTORY_TEST = null;
    public static final BleKey FALL_SET = null;
    public static final BleKey FAT_BIN_FILE = null;
    public static final BleKey FILE_PATH = null;
    public static final BleKey FILE_TRANSFER = null;
    public static final BleKey FIND_EARPHONE = null;
    public static final BleKey FIND_PHONE = null;
    public static final BleKey FIND_WATCH = null;
    public static final BleKey FIRMWARE_VERSION = null;
    public static final BleKey FONT_FILE = null;
    public static final BleKey FOOD_BALANCE = null;
    public static final BleKey GAME_CONTROL = null;
    public static final BleKey GAME_SET = null;
    public static final BleKey GAME_TIME_REMINDER = null;
    public static final BleKey GESTURE_WAKE = null;
    public static final BleKey GESTURE_WAKE2 = null;
    public static final BleKey GET_WATCH_FACE_MAX_SIZE = null;
    public static final BleKey GIRL_CARE = null;
    public static final BleKey GIRL_CARE_MENSTRUATION_UPDATE = null;
    public static final BleKey GIRL_CARE_MONTHLY = null;
    public static final BleKey GOLF_IMAGE = null;
    public static final BleKey GOLF_LOCATION = null;
    public static final BleKey GOLF_MAP_CACHE = null;
    public static final BleKey GOLF_MAP_CACHE_INFO = null;
    public static final BleKey GOLF_SPORT_SWITCH = null;
    public static final BleKey GOLF_WATCH_MAP_INFO = null;
    public static final BleKey GOLF_WATCH_SCORE = null;
    public static final BleKey GOLF_WATCH_UPDATE_MAP_INFO = null;
    public static final BleKey GOLF_WATCH_VERSION = null;
    public static final BleKey GOMORE_SET = null;
    public static final BleKey GOOGLE_NAVI_INFO = null;
    public static final BleKey GPS_FIRMWARE_FILE = null;
    public static final BleKey GPS_FIRMWARE_VERSION = null;
    public static final BleKey GSENSOR_OUTPUT = null;
    public static final BleKey GSENSOR_RAW = null;
    public static final BleKey GSENSOR_SHSY = null;
    public static final BleKey HANBAO_SET = null;
    public static final BleKey HANBAO_VIBRATION = null;
    public static final BleKey HANBAO_VIBRATION_STATE = null;
    public static final BleKey HEALTH_INDEX = null;
    public static final BleKey HEART_RATE = null;
    public static final BleKey HID = null;
    public static final BleKey HIGH_ANTI_ASSIST = null;
    public static final BleKey HOUR_SYSTEM = null;
    public static final BleKey HRV = null;
    public static final BleKey HRV_BASELINE = null;
    public static final BleKey HRV_SET = null;
    public static final BleKey HR_ASSIST_SLEEP = null;
    public static final BleKey HR_MONITORING = null;
    public static final BleKey HR_MONITORING_V2 = null;
    public static final BleKey HR_RAW = null;
    public static final BleKey HR_WARNING_SET = null;
    public static final BleKey HYDRATION_SET = null;
    public static final BleKey IBEACON_SET = null;
    public static final BleKey IDENTITY = null;
    public static final BleKey INCOMING_CALL = null;
    public static final BleKey INCOMING_CALL_RING = null;
    public static final BleKey IPC_EXCEPTION = null;
    public static final BleKey IPC_INFO = null;
    public static final BleKey IPC_OTA_STATE = null;
    public static final BleKey IPC_STATE = null;
    public static final BleKey IPC_STORES_INFO = null;
    public static final BleKey IPC_VERSION = null;
    public static final BleKey IPC_WIFI_INFO = null;
    public static final BleKey LACTATE_THRESHOLD = null;
    public static final BleKey LANGUAGE = null;
    public static final BleKey LANGUAGE_FILE = null;
    public static final BleKey LANGUAGE_PACK_VERSION = null;
    public static final BleKey LOCATION = null;
    public static final BleKey LOCATION_GGA = null;
    public static final BleKey LOCATION_GSV = null;
    public static final BleKey LOG = null;
    public static final BleKey LOGIN_DAYS = null;
    public static final BleKey LOGO_FILE = null;
    public static final BleKey LOVE_TAP = null;
    public static final BleKey LOVE_TAP_USER = null;
    public static final BleKey MAC_QRCODE = null;
    public static final BleKey MATCH_RECORD = null;
    public static final BleKey MATCH_RECORD2 = null;
    public static final BleKey MATCH_RECORD3 = null;
    public static final BleKey MATCH_SET = null;
    public static final BleKey MEASUREMENT = null;
    public static final BleKey MEDICATION_ALARM = null;
    public static final BleKey MEDICATION_REMINDER = null;
    public static final BleKey MEETING_REMINDER_SET = null;
    public static final BleKey MIND_STATUS = null;
    public static final BleKey MOTION_DETECT = null;
    public static final BleKey MULTIPLE_FILES_CONTROLLER = null;
    public static final BleKey MUSIC_CONTROL = null;
    public static final BleKey NAVI_IMAGE = null;
    public static final BleKey NAVI_INFO = null;
    public static final BleKey NETWORK_FIRMWARE_VERSION = null;
    public static final BleKey NEWS_FEED = null;
    public static final BleKey NONE = null;
    public static final BleKey NOTIFICATION = null;
    public static final BleKey NOTIFICATION2 = null;
    public static final BleKey NOTIFICATION_LIGHT_SCREEN_SET = null;
    public static final BleKey NOTIFICATION_REMINDER = null;
    public static final BleKey NOTIFICATION_REMINDER2 = null;
    public static final BleKey NO_DISTURB_GLOBAL = null;
    public static final BleKey NO_DISTURB_RANGE = null;
    public static final BleKey OFFLINE_ASR_SET = null;
    public static final BleKey ONGOING_DIALOGUE = null;
    public static final BleKey OPTIONAL_MAP_AUTH_INFO = null;
    public static final BleKey OTA = null;
    public static final BleKey OTA_FILE = null;
    public static final BleKey PACKAGE_STATUS = null;
    public static final BleKey POWER = null;
    public static final BleKey POWER2 = null;
    public static final BleKey POWER_SAVE_MODE = null;
    public static final BleKey PPG_SHSY = null;
    public static final BleKey PRESSURE = null;
    public static final BleKey PRESSURE_TIMING_MEASUREMENT = null;
    public static final BleKey QIBLA_SET = null;
    public static final BleKey QRCODE = null;
    public static final BleKey QRCODE2 = null;
    public static final BleKey RAW_SLEEP = null;
    public static final BleKey READ_CY_WEE_UUID = null;
    public static final BleKey REALTIME_LOG = null;
    public static final BleKey REALTIME_MEASUREMENT = null;
    public static final BleKey REAL_TIME_BLOOD_PRESSURE = null;
    public static final BleKey REAL_TIME_HEART_RATE = null;
    public static final BleKey REAL_TIME_TEMPERATURE = null;
    public static final BleKey RECEIVE_DEVICE_FILE = null;
    public static final BleKey RECORD_AUDIO_SET = null;
    public static final BleKey RECORD_CONTROL = null;
    public static final BleKey RECORD_PACKET = null;
    public static final BleKey RELAX_REMINDER = null;
    public static final BleKey REQUEST_LOCATION = null;
    public static final BleKey RESPIRATORY_RATE = null;
    public static final BleKey RESTING_HEART_RATE = null;
    public static final BleKey RING_VIBRATION_SET = null;
    public static final BleKey RRI = null;
    public static final BleKey SAI_WEI_SPORT_LOCATION = null;
    public static final BleKey SCHEDULE = null;
    public static final BleKey SCREEN_BRIGHTNESS_SET = null;
    public static final BleKey SDCARD_INFO = null;
    public static final BleKey SEDENTARINESS = null;
    public static final BleKey SESSION = null;
    public static final BleKey SET_WATCH_PASSWORD = null;
    public static final BleKey SG_CAMERA_SET = null;
    public static final BleKey SG_EQ_SET = null;
    public static final BleKey SG_KEYWORD_AWAKE = null;
    public static final BleKey SG_KEY_SET = null;
    public static final BleKey SG_RGB_SET = null;
    public static final BleKey SG_SET = null;
    public static final BleKey SG_SLEEP_SET = null;
    public static final BleKey SG_TEST = null;
    public static final BleKey SG_TTS = null;
    public static final BleKey SHUTDOWN = null;
    public static final BleKey SLEEP = null;
    public static final BleKey SLEEP_DATA = null;
    public static final BleKey SLEEP_GOAL = null;
    public static final BleKey SLEEP_MONITORING = null;
    public static final BleKey SLEEP_MONITORING_MODE = null;
    public static final BleKey SLEEP_NOTIFY = null;
    public static final BleKey SLEEP_QUALITY = null;
    public static final BleKey SLEEP_QUALITY_SCORE = null;
    public static final BleKey SLEEP_RAW_DATA = null;
    public static final BleKey SLEEP_RESPIRATORY_RATE = null;
    public static final BleKey SLEEP_RISK_LEVEL = null;
    public static final BleKey SLEEP_SET = null;
    public static final BleKey SMS_QUICK_REPLY_CONTENT = null;
    public static final BleKey SOS_CALL_LOG = null;
    public static final BleKey SOS_CONTACT = null;
    public static final BleKey SOS_SET = null;
    public static final BleKey SPORT_DURATION_GOAL = null;
    public static final BleKey SPORT_END_NOTIFY = null;
    public static final BleKey STANDBY_SET = null;
    public static final BleKey STANDBY_WATCH_FACE_SET = null;
    public static final BleKey START_DEVICE_SPORT = null;
    public static final BleKey STEP_GOAL = null;
    public static final BleKey STOCK = null;
    public static final BleKey TARGET_COMPLETION = null;
    public static final BleKey TEMPERATURE = null;
    public static final BleKey TEMPERATURE_DETECTING = null;
    public static final BleKey TEMPERATURE_UNIT = null;
    public static final BleKey TEMPERATURE_VALUE = null;
    public static final BleKey TEST_INFO_SET = null;
    public static final BleKey THIRD_PARTY_DATA = null;
    public static final BleKey TIME = null;
    public static final BleKey TIME_ZONE = null;
    public static final BleKey TOUCH_SET = null;
    public static final BleKey TRAINING_STATUS = null;
    public static final BleKey TUYA_KEY_SET = null;
    public static final BleKey UI_FILE = null;
    public static final BleKey UI_PACK_VERSION = null;
    public static final BleKey UNIT_SET = null;
    public static final BleKey USER_PROFILE = null;
    public static final BleKey VIBRATION = null;
    public static final BleKey VIBRATION_LIGHT_SET = null;
    public static final BleKey VIBRATION_V2 = null;
    public static final BleKey VIDEO_CALL_INFO = null;
    public static final BleKey VITALITY = null;
    public static final BleKey VOICE_CONTROL = null;
    public static final BleKey WARNING_SET = null;
    public static final BleKey WASH_SET = null;
    public static final BleKey WATCHFACE_ID = null;
    public static final BleKey WATCHFACE_INDEX = null;
    public static final BleKey WATCH_FACE = null;
    public static final BleKey WATCH_FACE_SWITCH = null;
    public static final BleKey WEAR_STATE = null;
    public static final BleKey WEAR_WAY = null;
    public static final BleKey WEATHER_FORECAST = null;
    public static final BleKey WEATHER_FORECAST2 = null;
    public static final BleKey WEATHER_FORECAST3 = null;
    public static final BleKey WEATHER_REALTIME = null;
    public static final BleKey WEATHER_REALTIME2 = null;
    public static final BleKey WEATHER_REALTIME3 = null;
    public static final BleKey WECHAT_PAY_SET = null;
    public static final BleKey WORKOUT = null;
    public static final BleKey WORKOUT2 = null;
    public static final BleKey WORKOUT3 = null;
    public static final BleKey WORKOUT4 = null;
    public static final BleKey WORKOUT4_SEGMENTATION = null;
    public static final BleKey WORLD_CLOCK = null;
    public static final BleKey XMLY_BAND_SET = null;
    public static final BleKey XMODEM = null;
    public static final BleKey ZONES_HEART_RATE = null;
    private final int mKey;

    @SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleKey$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @aa1
        public final BleKey OXO1(int r6) {
            BleKey[] r0 = BleKey.values();
            int r1 = r0.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L8;
            BleKey r3 = r0[r2];
            if (r3.getMKey() == r6) goto L9;
            r2 = r2 + 1;
        L9:
            if (r3 == null) goto L11;
            return r3;
        L11:
            return BleKey.NONE;
        L8:
            r3 = null;
            goto L9
        }

        public OXO1() {
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[BleKey.values().length];
            r0[BleKey.OTA.ordinal()] = 1;     // Catch: NoSuchFieldError -> L257
        L527:
            r0[BleKey.XMODEM.ordinal()] = 2;     // Catch: NoSuchFieldError -> L258
        L539:
            r0[BleKey.POWER.ordinal()] = 3;     // Catch: NoSuchFieldError -> L259
        L547:
            r0[BleKey.FIRMWARE_VERSION.ordinal()] = 4;     // Catch: NoSuchFieldError -> L260
        L551:
            r0[BleKey.BLE_ADDRESS.ordinal()] = 5;     // Catch: NoSuchFieldError -> L261
        L557:
            r0[BleKey.UI_PACK_VERSION.ordinal()] = 6;     // Catch: NoSuchFieldError -> L262
        L567:
            r0[BleKey.LANGUAGE_PACK_VERSION.ordinal()] = 7;     // Catch: NoSuchFieldError -> L263
        L585:
            r0[BleKey.DEVICE_FILE.ordinal()] = 8;     // Catch: NoSuchFieldError -> L264
        L595:
            r0[BleKey.RAW_SLEEP.ordinal()] = 9;     // Catch: NoSuchFieldError -> L265
        L597:
            r0[BleKey.DEVICE_INFO.ordinal()] = 10;     // Catch: NoSuchFieldError -> L266
        L607:
            r0[BleKey.PACKAGE_STATUS.ordinal()] = 11;     // Catch: NoSuchFieldError -> L267
        L625:
            r0[BleKey.DEVICE_LANGUAGES.ordinal()] = 12;     // Catch: NoSuchFieldError -> L268
        L635:
            r0[BleKey.SDCARD_INFO.ordinal()] = 13;     // Catch: NoSuchFieldError -> L269
        L885:
            r0[BleKey.ACTIVITY_DETAIL.ordinal()] = 14;     // Catch: NoSuchFieldError -> L270
        L895:
            r0[BleKey.EARPHONE_POWER.ordinal()] = 15;     // Catch: NoSuchFieldError -> L271
        L913:
            r0[BleKey.EARPHONE_STATE.ordinal()] = 16;     // Catch: NoSuchFieldError -> L272
        L923:
            r0[BleKey.EARPHONE_INFO.ordinal()] = 17;     // Catch: NoSuchFieldError -> L273
        L925:
            r0[BleKey.GPS_FIRMWARE_VERSION.ordinal()] = 18;     // Catch: NoSuchFieldError -> L274
        L935:
            r0[BleKey.NETWORK_FIRMWARE_VERSION.ordinal()] = 19;     // Catch: NoSuchFieldError -> L275
        L953:
            r0[BleKey.GIRL_CARE_MONTHLY.ordinal()] = 20;     // Catch: NoSuchFieldError -> L276
        L963:
            r0[BleKey.IPC_VERSION.ordinal()] = 21;     // Catch: NoSuchFieldError -> L277
        L965:
            r0[BleKey.IPC_STORES_INFO.ordinal()] = 22;     // Catch: NoSuchFieldError -> L278
        L975:
            r0[BleKey.SLEEP_QUALITY_SCORE.ordinal()] = 23;     // Catch: NoSuchFieldError -> L279
        L993:
            r0[BleKey.RELAX_REMINDER.ordinal()] = 24;     // Catch: NoSuchFieldError -> L280
        L1003:
            r0[BleKey.POWER2.ordinal()] = 25;     // Catch: NoSuchFieldError -> L281
        L1005:
            r0[BleKey.IPC_INFO.ordinal()] = 26;     // Catch: NoSuchFieldError -> L282
        L759:
            r0[BleKey.TIME.ordinal()] = 27;     // Catch: NoSuchFieldError -> L283
        L777:
            r0[BleKey.NOTIFICATION_REMINDER.ordinal()] = 28;     // Catch: NoSuchFieldError -> L284
        L787:
            r0[BleKey.SLEEP_QUALITY.ordinal()] = 29;     // Catch: NoSuchFieldError -> L285
        L789:
            r0[BleKey.TEMPERATURE_DETECTING.ordinal()] = 30;     // Catch: NoSuchFieldError -> L286
        L799:
            r0[BleKey.SHUTDOWN.ordinal()] = 31;     // Catch: NoSuchFieldError -> L287
        L817:
            r0[BleKey.APP_SPORT_DATA.ordinal()] = 32;     // Catch: NoSuchFieldError -> L288
        L827:
            r0[BleKey.REAL_TIME_HEART_RATE.ordinal()] = 33;     // Catch: NoSuchFieldError -> L289
        L829:
            r0[BleKey.IBEACON_SET.ordinal()] = 34;     // Catch: NoSuchFieldError -> L290
        L839:
            r0[BleKey.MAC_QRCODE.ordinal()] = 35;     // Catch: NoSuchFieldError -> L291
        L857:
            r0[BleKey.REAL_TIME_TEMPERATURE.ordinal()] = 36;     // Catch: NoSuchFieldError -> L292
        L867:
            r0[BleKey.REAL_TIME_BLOOD_PRESSURE.ordinal()] = 37;     // Catch: NoSuchFieldError -> L293
        L869:
            r0[BleKey.REALTIME_MEASUREMENT.ordinal()] = 38;     // Catch: NoSuchFieldError -> L294
        L879:
            r0[BleKey.BAC_SET.ordinal()] = 39;     // Catch: NoSuchFieldError -> L295
        L649:
            r0[BleKey.HR_WARNING_SET.ordinal()] = 40;     // Catch: NoSuchFieldError -> L296
        L659:
            r0[BleKey.SLEEP_MONITORING.ordinal()] = 41;     // Catch: NoSuchFieldError -> L297
        L661:
            r0[BleKey.BT_NAME.ordinal()] = 42;     // Catch: NoSuchFieldError -> L298
        L671:
            r0[BleKey.BAC_RESULT.ordinal()] = 43;     // Catch: NoSuchFieldError -> L299
        L689:
            r0[BleKey.BAC_RESULT_SET.ordinal()] = 44;     // Catch: NoSuchFieldError -> L300
        L699:
            r0[BleKey.MATCH_SET.ordinal()] = 45;     // Catch: NoSuchFieldError -> L301
        L701:
            r0[BleKey.BLE_ADDRESS_SET.ordinal()] = 46;     // Catch: NoSuchFieldError -> L302
        L711:
            r0[BleKey.NAVI_INFO.ordinal()] = 47;     // Catch: NoSuchFieldError -> L303
        L729:
            r0[BleKey.DEVICE_SPORT_DATA.ordinal()] = 48;     // Catch: NoSuchFieldError -> L304
        L735:
            r0[BleKey.FIND_PHONE.ordinal()] = 49;     // Catch: NoSuchFieldError -> L305
        L737:
            r0[BleKey.BW_NAVI_INFO.ordinal()] = 50;     // Catch: NoSuchFieldError -> L306
        L745:
            r0[BleKey.CONNECT_REMINDER.ordinal()] = 51;     // Catch: NoSuchFieldError -> L307
        L513:
            r0[BleKey.AIR_PRESSURE_CALIBRATION.ordinal()] = 52;     // Catch: NoSuchFieldError -> L308
        L521:
            r0[BleKey.ECG_SET.ordinal()] = 53;     // Catch: NoSuchFieldError -> L309
        L523:
            r0[BleKey.GIRL_CARE_MENSTRUATION_UPDATE.ordinal()] = 54;     // Catch: NoSuchFieldError -> L310
        L533:
            r0[BleKey.HEALTH_INDEX.ordinal()] = 55;     // Catch: NoSuchFieldError -> L311
        L555:
            r0[BleKey.WEAR_WAY.ordinal()] = 56;     // Catch: NoSuchFieldError -> L312
        L563:
            r0[BleKey.FIND_EARPHONE.ordinal()] = 57;     // Catch: NoSuchFieldError -> L313
        L565:
            r0[BleKey.TOUCH_SET.ordinal()] = 58;     // Catch: NoSuchFieldError -> L314
        L575:
            r0[BleKey.RECORD_PACKET.ordinal()] = 59;     // Catch: NoSuchFieldError -> L315
        L593:
            r0[BleKey.TEST_INFO_SET.ordinal()] = 60;     // Catch: NoSuchFieldError -> L316
        L603:
            r0[BleKey.WARNING_SET.ordinal()] = 61;     // Catch: NoSuchFieldError -> L317
        L605:
            r0[BleKey.VIDEO_CALL_INFO.ordinal()] = 62;     // Catch: NoSuchFieldError -> L318
        L615:
            r0[BleKey.GOOGLE_NAVI_INFO.ordinal()] = 63;     // Catch: NoSuchFieldError -> L319
        L633:
            r0[BleKey.TIME_ZONE.ordinal()] = 64;     // Catch: NoSuchFieldError -> L320
        L891:
            r0[BleKey.USER_PROFILE.ordinal()] = 65;     // Catch: NoSuchFieldError -> L321
        L893:
            r0[BleKey.STEP_GOAL.ordinal()] = 66;     // Catch: NoSuchFieldError -> L322
        L903:
            r0[BleKey.BACK_LIGHT.ordinal()] = 67;     // Catch: NoSuchFieldError -> L323
        L921:
            r0[BleKey.SEDENTARINESS.ordinal()] = 68;     // Catch: NoSuchFieldError -> L324
        L931:
            r0[BleKey.NO_DISTURB_RANGE.ordinal()] = 69;     // Catch: NoSuchFieldError -> L325
        L933:
            r0[BleKey.NO_DISTURB_GLOBAL.ordinal()] = 70;     // Catch: NoSuchFieldError -> L326
        L943:
            r0[BleKey.VIBRATION.ordinal()] = 71;     // Catch: NoSuchFieldError -> L327
        L961:
            r0[BleKey.GESTURE_WAKE.ordinal()] = 72;     // Catch: NoSuchFieldError -> L328
        L971:
            r0[BleKey.HR_ASSIST_SLEEP.ordinal()] = 73;     // Catch: NoSuchFieldError -> L329
        L973:
            r0[BleKey.HOUR_SYSTEM.ordinal()] = 74;     // Catch: NoSuchFieldError -> L330
        L983:
            r0[BleKey.LANGUAGE.ordinal()] = 75;     // Catch: NoSuchFieldError -> L331
        L1001:
            r0[BleKey.ANTI_LOST.ordinal()] = 76;     // Catch: NoSuchFieldError -> L332
        L1011:
            r0[BleKey.HR_MONITORING.ordinal()] = 77;     // Catch: NoSuchFieldError -> L333
        L757:
            r0[BleKey.AEROBIC_EXERCISE.ordinal()] = 78;     // Catch: NoSuchFieldError -> L334
        L767:
            r0[BleKey.TEMPERATURE_UNIT.ordinal()] = 79;     // Catch: NoSuchFieldError -> L335
        L785:
            r0[BleKey.DATE_FORMAT.ordinal()] = 80;     // Catch: NoSuchFieldError -> L336
        L795:
            r0[BleKey.WATCH_FACE_SWITCH.ordinal()] = 81;     // Catch: NoSuchFieldError -> L337
        L797:
            r0[BleKey.DRINK_WATER.ordinal()] = 82;     // Catch: NoSuchFieldError -> L338
        L807:
            r0[BleKey.WATCHFACE_ID.ordinal()] = 83;     // Catch: NoSuchFieldError -> L339
        L825:
            r0[BleKey.POWER_SAVE_MODE.ordinal()] = 84;     // Catch: NoSuchFieldError -> L340
        L835:
            r0[BleKey.CALORIES_GOAL.ordinal()] = 85;     // Catch: NoSuchFieldError -> L341
        L837:
            r0[BleKey.DISTANCE_GOAL.ordinal()] = 86;     // Catch: NoSuchFieldError -> L342
        L847:
            r0[BleKey.SLEEP_GOAL.ordinal()] = 87;     // Catch: NoSuchFieldError -> L343
        L865:
            r0[BleKey.UNIT_SET.ordinal()] = 88;     // Catch: NoSuchFieldError -> L344
        L875:
            r0[BleKey.STANDBY_SET.ordinal()] = 89;     // Catch: NoSuchFieldError -> L345
        L877:
            r0[BleKey.ALIPAY_SET.ordinal()] = 90;     // Catch: NoSuchFieldError -> L346
        L639:
            r0[BleKey.SET_WATCH_PASSWORD.ordinal()] = 91;     // Catch: NoSuchFieldError -> L347
        L657:
            r0[BleKey.SOS_SET.ordinal()] = 92;     // Catch: NoSuchFieldError -> L348
        L667:
            r0[BleKey.GIRL_CARE.ordinal()] = 93;     // Catch: NoSuchFieldError -> L349
        L669:
            r0[BleKey.GAME_TIME_REMINDER.ordinal()] = 94;     // Catch: NoSuchFieldError -> L350
        L679:
            r0[BleKey.PRESSURE_TIMING_MEASUREMENT.ordinal()] = 95;     // Catch: NoSuchFieldError -> L351
        L697:
            r0[BleKey.STANDBY_WATCH_FACE_SET.ordinal()] = 96;     // Catch: NoSuchFieldError -> L352
        L707:
            r0[BleKey.DOUBLE_SCREEN.ordinal()] = 97;     // Catch: NoSuchFieldError -> L353
        L709:
            r0[BleKey.BLOOD_OXYGEN_SET.ordinal()] = 98;     // Catch: NoSuchFieldError -> L354
        L719:
            r0[BleKey.NOTIFICATION_REMINDER2.ordinal()] = 99;     // Catch: NoSuchFieldError -> L355
        L733:
            r0[BleKey.FALL_SET.ordinal()] = 100;     // Catch: NoSuchFieldError -> L356
        L741:
            r0[BleKey.INCOMING_CALL_RING.ordinal()] = 101;     // Catch: NoSuchFieldError -> L357
        L743:
            r0[BleKey.NOTIFICATION_LIGHT_SCREEN_SET.ordinal()] = 102;     // Catch: NoSuchFieldError -> L358
        L753:
            r0[BleKey.BLOOD_PRESSURE_CALIBRATION.ordinal()] = 103;     // Catch: NoSuchFieldError -> L359
        L517:
            r0[BleKey.EARPHONE_ANC_SET.ordinal()] = 104;     // Catch: NoSuchFieldError -> L360
        L529:
            r0[BleKey.EARPHONE_SOUND_EFFECTS_SET.ordinal()] = 105;     // Catch: NoSuchFieldError -> L361
        L531:
            r0[BleKey.SCREEN_BRIGHTNESS_SET.ordinal()] = 106;     // Catch: NoSuchFieldError -> L362
        L543:
            r0[BleKey.EARPHONE_CALL.ordinal()] = 107;     // Catch: NoSuchFieldError -> L363
        L561:
            r0[BleKey.GOMORE_SET.ordinal()] = 108;     // Catch: NoSuchFieldError -> L364
        L571:
            r0[BleKey.RING_VIBRATION_SET.ordinal()] = 109;     // Catch: NoSuchFieldError -> L365
        L573:
            r0[BleKey.SPORT_DURATION_GOAL.ordinal()] = 110;     // Catch: NoSuchFieldError -> L366
        L583:
            r0[BleKey.SOS_CONTACT.ordinal()] = 111;     // Catch: NoSuchFieldError -> L367
        L601:
            r0[BleKey.CHECK_IN_EVERY_DAY.ordinal()] = 112;     // Catch: NoSuchFieldError -> L368
        L611:
            r0[BleKey.GESTURE_WAKE2.ordinal()] = 113;     // Catch: NoSuchFieldError -> L369
        L613:
            r0[BleKey.EARPHONE_KEY.ordinal()] = 114;     // Catch: NoSuchFieldError -> L370
        L623:
            r0[BleKey.HANBAO_SET.ordinal()] = 115;     // Catch: NoSuchFieldError -> L371
        L889:
            r0[BleKey.QIBLA_SET.ordinal()] = 116;     // Catch: NoSuchFieldError -> L372
        L899:
            r0[BleKey.CALIBRATION_DATA.ordinal()] = 117;     // Catch: NoSuchFieldError -> L373
        L901:
            r0[BleKey.DEVICE_UNIQUE_DATA_SET.ordinal()] = 118;     // Catch: NoSuchFieldError -> L374
        L911:
            r0[BleKey.CP_USER_INFO.ordinal()] = 119;     // Catch: NoSuchFieldError -> L375
        L929:
            r0[BleKey.HRV_SET.ordinal()] = 120;     // Catch: NoSuchFieldError -> L376
        L939:
            r0[BleKey.WATCHFACE_INDEX.ordinal()] = 121;     // Catch: NoSuchFieldError -> L377
        L941:
            r0[BleKey.ALARM.ordinal()] = 122;     // Catch: NoSuchFieldError -> L378
        L951:
            r0[BleKey.LOVE_TAP_USER.ordinal()] = 123;     // Catch: NoSuchFieldError -> L379
        L969:
            r0[BleKey.MEDICATION_REMINDER.ordinal()] = 124;     // Catch: NoSuchFieldError -> L380
        L979:
            r0[BleKey.MEDICATION_ALARM.ordinal()] = 125;     // Catch: NoSuchFieldError -> L381
        L981:
            r0[BleKey.COACHING.ordinal()] = 126;     // Catch: NoSuchFieldError -> L382
        L991:
            r0[BleKey.TUYA_KEY_SET.ordinal()] = 127;     // Catch: NoSuchFieldError -> L383
        L1009:
            r0[BleKey.BATTERY_USAGE.ordinal()] = 128;     // Catch: NoSuchFieldError -> L384
        L763:
            r0[BleKey.DEVICE_LANGUAGES2.ordinal()] = 129;     // Catch: NoSuchFieldError -> L385
        L765:
            r0[BleKey.IDENTITY.ordinal()] = 130;     // Catch: NoSuchFieldError -> L386
        L775:
            r0[BleKey.NOTIFICATION.ordinal()] = 131;     // Catch: NoSuchFieldError -> L387
        L793:
            r0[BleKey.WEATHER_REALTIME.ordinal()] = 132;     // Catch: NoSuchFieldError -> L388
        L803:
            r0[BleKey.WEATHER_FORECAST.ordinal()] = 133;     // Catch: NoSuchFieldError -> L389
        L805:
            r0[BleKey.NOTIFICATION2.ordinal()] = 134;     // Catch: NoSuchFieldError -> L390
        L815:
            r0[BleKey.NEWS_FEED.ordinal()] = 135;     // Catch: NoSuchFieldError -> L391
        L833:
            r0[BleKey.WEATHER_REALTIME2.ordinal()] = 136;     // Catch: NoSuchFieldError -> L392
        L843:
            r0[BleKey.WEATHER_FORECAST2.ordinal()] = 137;     // Catch: NoSuchFieldError -> L393
        L845:
            r0[BleKey.LOGIN_DAYS.ordinal()] = 138;     // Catch: NoSuchFieldError -> L394
        L855:
            r0[BleKey.TARGET_COMPLETION.ordinal()] = 139;     // Catch: NoSuchFieldError -> L395
        L873:
            r0[BleKey.AUDIO_TEXT.ordinal()] = 140;     // Catch: NoSuchFieldError -> L396
        L883:
            r0[BleKey.WEATHER_REALTIME3.ordinal()] = 141;     // Catch: NoSuchFieldError -> L397
        L637:
            r0[BleKey.WEATHER_FORECAST3.ordinal()] = 142;     // Catch: NoSuchFieldError -> L398
        L647:
            r0[BleKey.CHAT_MESSAGE.ordinal()] = 143;     // Catch: NoSuchFieldError -> L399
        L665:
            r0[BleKey.CP_GIFTS_INFO.ordinal()] = 144;     // Catch: NoSuchFieldError -> L400
        L675:
            r0[BleKey.CP_ANNIVERSARY.ordinal()] = 145;     // Catch: NoSuchFieldError -> L401
        L677:
            r0[BleKey.CP_WEATHER_REALTIME.ordinal()] = 146;     // Catch: NoSuchFieldError -> L402
        L687:
            r0[BleKey.CP_WEATHER_FORECAST.ordinal()] = 147;     // Catch: NoSuchFieldError -> L403
        L705:
            r0[BleKey.CP_NOTIFICATION.ordinal()] = 148;     // Catch: NoSuchFieldError -> L404
        L715:
            r0[BleKey.CP_DISTANCE.ordinal()] = 149;     // Catch: NoSuchFieldError -> L405
        L717:
            r0[BleKey.SLEEP_NOTIFY.ordinal()] = 150;     // Catch: NoSuchFieldError -> L406
        L727:
            r0[BleKey.BAND_KEY.ordinal()] = 151;     // Catch: NoSuchFieldError -> L407
        L739:
            r0[BleKey.XMLY_BAND_SET.ordinal()] = 152;     // Catch: NoSuchFieldError -> L408
        L749:
            r0[BleKey.SCHEDULE.ordinal()] = 153;     // Catch: NoSuchFieldError -> L409
        L751:
            r0[BleKey.SMS_QUICK_REPLY_CONTENT.ordinal()] = 154;     // Catch: NoSuchFieldError -> L410
        L511:
            r0[BleKey.HID.ordinal()] = 155;     // Catch: NoSuchFieldError -> L411
        L525:
            r0[BleKey.WORLD_CLOCK.ordinal()] = 156;     // Catch: NoSuchFieldError -> L412
        L537:
            r0[BleKey.STOCK.ordinal()] = 157;     // Catch: NoSuchFieldError -> L413
        L541:
            r0[BleKey.DATA_ALL.ordinal()] = 158;     // Catch: NoSuchFieldError -> L414
        L553:
            r0[BleKey.ACTIVITY_REALTIME.ordinal()] = 159;     // Catch: NoSuchFieldError -> L415
        L569:
            r0[BleKey.ACTIVITY.ordinal()] = 160;     // Catch: NoSuchFieldError -> L416
        L579:
            r0[BleKey.HEART_RATE.ordinal()] = 161;     // Catch: NoSuchFieldError -> L417
        L581:
            r0[BleKey.BLOOD_PRESSURE.ordinal()] = 162;     // Catch: NoSuchFieldError -> L418
        L591:
            r0[BleKey.SLEEP.ordinal()] = 163;     // Catch: NoSuchFieldError -> L419
        L609:
            r0[BleKey.WORKOUT.ordinal()] = 164;     // Catch: NoSuchFieldError -> L420
        L619:
            r0[BleKey.LOCATION.ordinal()] = 165;     // Catch: NoSuchFieldError -> L421
        L621:
            r0[BleKey.TEMPERATURE.ordinal()] = 166;     // Catch: NoSuchFieldError -> L422
        L631:
            r0[BleKey.BLOOD_OXYGEN.ordinal()] = 167;     // Catch: NoSuchFieldError -> L423
        L897:
            r0[BleKey.HRV.ordinal()] = 168;     // Catch: NoSuchFieldError -> L424
        L907:
            r0[BleKey.LOG.ordinal()] = 169;     // Catch: NoSuchFieldError -> L425
        L909:
            r0[BleKey.SLEEP_RAW_DATA.ordinal()] = 170;     // Catch: NoSuchFieldError -> L426
        L919:
            r0[BleKey.PRESSURE.ordinal()] = 171;     // Catch: NoSuchFieldError -> L427
        L937:
            r0[BleKey.WORKOUT2.ordinal()] = 172;     // Catch: NoSuchFieldError -> L428
        L947:
            r0[BleKey.BLOOD_GLUCOSE.ordinal()] = 173;     // Catch: NoSuchFieldError -> L429
        L949:
            r0[BleKey.BODY_STATUS.ordinal()] = 174;     // Catch: NoSuchFieldError -> L430
        L959:
            r0[BleKey.MIND_STATUS.ordinal()] = 175;     // Catch: NoSuchFieldError -> L431
        L977:
            r0[BleKey.CALORIE_INTAKE.ordinal()] = 176;     // Catch: NoSuchFieldError -> L432
        L987:
            r0[BleKey.FOOD_BALANCE.ordinal()] = 177;     // Catch: NoSuchFieldError -> L433
        L989:
            r0[BleKey.BAC.ordinal()] = 178;     // Catch: NoSuchFieldError -> L434
        L999:
            r0[BleKey.MATCH_RECORD2.ordinal()] = 179;     // Catch: NoSuchFieldError -> L435
        L761:
            r0[BleKey.AVG_HEART_RATE.ordinal()] = 180;     // Catch: NoSuchFieldError -> L436
        L771:
            r0[BleKey.ALIPAY_BIND_INFO.ordinal()] = 181;     // Catch: NoSuchFieldError -> L437
        L773:
            r0[BleKey.RRI.ordinal()] = 182;     // Catch: NoSuchFieldError -> L438
        L783:
            r0[BleKey.ECG.ordinal()] = 183;     // Catch: NoSuchFieldError -> L439
        L801:
            r0[BleKey.HANBAO_VIBRATION.ordinal()] = 184;     // Catch: NoSuchFieldError -> L440
        L811:
            r0[BleKey.SOS_CALL_LOG.ordinal()] = 185;     // Catch: NoSuchFieldError -> L441
        L813:
            r0[BleKey.WORKOUT3.ordinal()] = 186;     // Catch: NoSuchFieldError -> L442
        L823:
            r0[BleKey.WORKOUT4.ordinal()] = 187;     // Catch: NoSuchFieldError -> L443
        L841:
            r0[BleKey.DAILY_POWER.ordinal()] = 188;     // Catch: NoSuchFieldError -> L444
        L851:
            r0[BleKey.TRAINING_STATUS.ordinal()] = 189;     // Catch: NoSuchFieldError -> L445
        L853:
            r0[BleKey.RESPIRATORY_RATE.ordinal()] = 190;     // Catch: NoSuchFieldError -> L446
        L863:
            r0[BleKey.MATCH_RECORD3.ordinal()] = 191;     // Catch: NoSuchFieldError -> L447
        L881:
            r0[BleKey.CAMERA.ordinal()] = 192;     // Catch: NoSuchFieldError -> L448
        L643:
            r0[BleKey.REQUEST_LOCATION.ordinal()] = 193;     // Catch: NoSuchFieldError -> L449
        L645:
            r0[BleKey.DEVICE_SMS_QUICK_REPLY.ordinal()] = 194;     // Catch: NoSuchFieldError -> L450
        L655:
            r0[BleKey.INCOMING_CALL.ordinal()] = 195;     // Catch: NoSuchFieldError -> L451
        L673:
            r0[BleKey.APP_SPORT_STATE.ordinal()] = 196;     // Catch: NoSuchFieldError -> L452
        L683:
            r0[BleKey.LOVE_TAP.ordinal()] = 197;     // Catch: NoSuchFieldError -> L453
        L685:
            r0[BleKey.FACTORY_TEST.ordinal()] = 198;     // Catch: NoSuchFieldError -> L454
        L695:
            r0[BleKey.SPORT_END_NOTIFY.ordinal()] = 199;     // Catch: NoSuchFieldError -> L455
        L713:
            r0[BleKey.HANBAO_VIBRATION_STATE.ordinal()] = 200;     // Catch: NoSuchFieldError -> L456
        L723:
            r0[BleKey.MEASUREMENT.ordinal()] = 201;     // Catch: NoSuchFieldError -> L457
        L725:
            r0[BleKey.GAME_CONTROL.ordinal()] = 202;     // Catch: NoSuchFieldError -> L458
        L731:
            r0[BleKey.VIBRATION_V2.ordinal()] = 203;     // Catch: NoSuchFieldError -> L459
        L747:
            r0[BleKey.DEVICE_OP.ordinal()] = 204;     // Catch: NoSuchFieldError -> L460
        L755:
            r0[BleKey.RECEIVE_DEVICE_FILE.ordinal()] = 205;     // Catch: NoSuchFieldError -> L461
        L509:
            r0[BleKey.AI_COMMAND.ordinal()] = 206;     // Catch: NoSuchFieldError -> L462
        L515:
            r0[BleKey.SG_RGB_SET.ordinal()] = 207;     // Catch: NoSuchFieldError -> L463
        L535:
            r0[BleKey.SG_SLEEP_SET.ordinal()] = 208;     // Catch: NoSuchFieldError -> L464
        L545:
            r0[BleKey.SG_EQ_SET.ordinal()] = 209;     // Catch: NoSuchFieldError -> L465
        L549:
            r0[BleKey.SG_KEY_SET.ordinal()] = 210;     // Catch: NoSuchFieldError -> L466
        L559:
            r0[BleKey.SG_KEYWORD_AWAKE.ordinal()] = 211;     // Catch: NoSuchFieldError -> L467
        L577:
            r0[BleKey.CP_LISTENER.ordinal()] = 212;     // Catch: NoSuchFieldError -> L468
        L587:
            r0[BleKey.IPC_WIFI_INFO.ordinal()] = 213;     // Catch: NoSuchFieldError -> L469
        L589:
            r0[BleKey.IPC_EXCEPTION.ordinal()] = 214;     // Catch: NoSuchFieldError -> L470
        L599:
            r0[BleKey.IPC_OTA_STATE.ordinal()] = 215;     // Catch: NoSuchFieldError -> L471
        L617:
            r0[BleKey.RECORD_CONTROL.ordinal()] = 216;     // Catch: NoSuchFieldError -> L472
        L627:
            r0[BleKey.RECORD_AUDIO_SET.ordinal()] = 217;     // Catch: NoSuchFieldError -> L473
        L629:
            r0[BleKey.ACTIVITY_RECOGNIYION.ordinal()] = 218;     // Catch: NoSuchFieldError -> L474
        L887:
            r0[BleKey.VIBRATION_LIGHT_SET.ordinal()] = 219;     // Catch: NoSuchFieldError -> L475
        L905:
            r0[BleKey.CLASSIC_BLUETOOTH_STATE.ordinal()] = 220;     // Catch: NoSuchFieldError -> L476
        L915:
            r0[BleKey.APP_OP.ordinal()] = 221;     // Catch: NoSuchFieldError -> L477
        L917:
            r0[BleKey.IPC_STATE.ordinal()] = 222;     // Catch: NoSuchFieldError -> L478
        L927:
            r0[BleKey.AI_COACH_PLAN.ordinal()] = 223;     // Catch: NoSuchFieldError -> L479
        L945:
            r0[BleKey.FILE_PATH.ordinal()] = 224;     // Catch: NoSuchFieldError -> L480
        L955:
            r0[BleKey.APP_API_VERSION.ordinal()] = 225;     // Catch: NoSuchFieldError -> L481
        L957:
            r0[BleKey.WATCH_FACE.ordinal()] = 226;     // Catch: NoSuchFieldError -> L482
        L967:
            r0[BleKey.FILE_TRANSFER.ordinal()] = 227;     // Catch: NoSuchFieldError -> L483
        L985:
            r0[BleKey.AGPS_FILE.ordinal()] = 228;     // Catch: NoSuchFieldError -> L484
        L995:
            r0[BleKey.FONT_FILE.ordinal()] = 229;     // Catch: NoSuchFieldError -> L485
        L997:
            r0[BleKey.UI_FILE.ordinal()] = 230;     // Catch: NoSuchFieldError -> L486
        L1007:
            r0[BleKey.LANGUAGE_FILE.ordinal()] = 231;     // Catch: NoSuchFieldError -> L487
        L769:
            r0[BleKey.BRAND_INFO_FILE.ordinal()] = 232;     // Catch: NoSuchFieldError -> L488
        L779:
            r0[BleKey.QRCODE.ordinal()] = 233;     // Catch: NoSuchFieldError -> L489
        L781:
            r0[BleKey.THIRD_PARTY_DATA.ordinal()] = 234;     // Catch: NoSuchFieldError -> L490
        L791:
            r0[BleKey.QRCODE2.ordinal()] = 235;     // Catch: NoSuchFieldError -> L491
        L809:
            r0[BleKey.LOGO_FILE.ordinal()] = 236;     // Catch: NoSuchFieldError -> L492
        L819:
            r0[BleKey.OTA_FILE.ordinal()] = 237;     // Catch: NoSuchFieldError -> L493
        L821:
            r0[BleKey.GPS_FIRMWARE_FILE.ordinal()] = 238;     // Catch: NoSuchFieldError -> L494
        L831:
            r0[BleKey.CONTACT_SORT.ordinal()] = 239;     // Catch: NoSuchFieldError -> L495
        L849:
            r0[BleKey.NAVI_IMAGE.ordinal()] = 240;     // Catch: NoSuchFieldError -> L496
        L859:
            r0[BleKey.APP_FILE.ordinal()] = 241;     // Catch: NoSuchFieldError -> L497
        L861:
            r0[BleKey.FAT_BIN_FILE.ordinal()] = 242;     // Catch: NoSuchFieldError -> L498
        L871:
            r0[BleKey.AGPS_FILE2.ordinal()] = 243;     // Catch: NoSuchFieldError -> L499
        L641:
            r0[BleKey.CP_CHAT.ordinal()] = 244;     // Catch: NoSuchFieldError -> L500
        L651:
            r0[BleKey.CP_MISS_YOU.ordinal()] = 245;     // Catch: NoSuchFieldError -> L501
        L653:
            r0[BleKey.CP_TODO.ordinal()] = 246;     // Catch: NoSuchFieldError -> L502
        L663:
            r0[BleKey.CP_GALLERY.ordinal()] = 247;     // Catch: NoSuchFieldError -> L503
        L681:
            r0[BleKey.CP_GIFTS.ordinal()] = 248;     // Catch: NoSuchFieldError -> L504
        L691:
            r0[BleKey.CP_AVATAR.ordinal()] = 249;     // Catch: NoSuchFieldError -> L505
        L693:
            r0[BleKey.AI_COACH_PLAN_V2.ordinal()] = 250;     // Catch: NoSuchFieldError -> L506
        L703:
            r0[BleKey.SLEEP_DATA.ordinal()] = 251;     // Catch: NoSuchFieldError -> L507
        L721:
            r0[BleKey.CONTACT.ordinal()] = 252;     // Catch: NoSuchFieldError -> L508
        L255:
            OXO1 = r0;
        }
    }

    private static final /* synthetic */ BleKey[] $values() {
        return new BleKey[]{OTA, XMODEM, TIME, TIME_ZONE, POWER, FIRMWARE_VERSION, BLE_ADDRESS, USER_PROFILE, STEP_GOAL, BACK_LIGHT, SEDENTARINESS, NO_DISTURB_RANGE, VIBRATION, GESTURE_WAKE, HR_ASSIST_SLEEP, HOUR_SYSTEM, LANGUAGE, ALARM, UNIT_SET, COACHING, BLE_GOLF_EDITTEXT_DATA, FIND_PHONE, NOTIFICATION_REMINDER, ANTI_LOST, HR_MONITORING, UI_PACK_VERSION, LANGUAGE_PACK_VERSION, SLEEP_QUALITY, GIRL_CARE, TEMPERATURE_DETECTING, AEROBIC_EXERCISE, TEMPERATURE_UNIT, DATE_FORMAT, WATCH_FACE_SWITCH, AGPS_PREREQUISITE, DRINK_WATER, SHUTDOWN, APP_SPORT_DATA, REAL_TIME_HEART_RATE, BLOOD_OXYGEN_SET, WASH_SET, SLEEP_SET, VOICE_CONTROL, WATCHFACE_ID, IBEACON_SET, MAC_QRCODE, REAL_TIME_TEMPERATURE, REAL_TIME_BLOOD_PRESSURE, TEMPERATURE_VALUE, GAME_SET, FIND_WATCH, SET_WATCH_PASSWORD, REALTIME_MEASUREMENT, POWER_SAVE_MODE, BAC_SET, CALORIES_GOAL, DISTANCE_GOAL, SLEEP_GOAL, LOVE_TAP_USER, MEDICATION_REMINDER, DEVICE_INFO, HR_WARNING_SET, SLEEP_MONITORING, STANDBY_SET, BT_NAME, TUYA_KEY_SET, BAC_RESULT, BAC_RESULT_SET, MEDICATION_ALARM, MATCH_SET, PACKAGE_STATUS, NOTIFICATION_REMINDER2, ALIPAY_SET, WECHAT_PAY_SET, RECORD_PACKET, BLE_ADDRESS_SET, NAVI_INFO, SOS_SET, DEVICE_LANGUAGES, GAME_TIME_REMINDER, DEVICE_SPORT_DATA, PRESSURE_TIMING_MEASUREMENT, STANDBY_WATCH_FACE_SET, FALL_SET, BW_NAVI_INFO, CONNECT_REMINDER, SDCARD_INFO, ACTIVITY_DETAIL, NOTIFICATION_LIGHT_SCREEN_SET, BLOOD_PRESSURE_CALIBRATION, AIR_PRESSURE_CALIBRATION, HRV_SET, GOLF_MAP_CACHE_INFO, GOLF_MAP_CACHE, EARPHONE_POWER, EARPHONE_ANC_SET, EARPHONE_SOUND_EFFECTS_SET, SCREEN_BRIGHTNESS_SET, EARPHONE_INFO, EARPHONE_STATE, EARPHONE_CALL, GPS_FIRMWARE_VERSION, GOMORE_SET, RING_VIBRATION_SET, NETWORK_FIRMWARE_VERSION, ECG_SET, SPORT_DURATION_GOAL, WATCHFACE_INDEX, SOS_CONTACT, GIRL_CARE_MONTHLY, GIRL_CARE_MENSTRUATION_UPDATE, HEALTH_INDEX, CHECK_IN_EVERY_DAY, WEAR_WAY, GESTURE_WAKE2, EARPHONE_KEY, FIND_EARPHONE, HANBAO_SET, QIBLA_SET, CALIBRATION_DATA, BATTERY_USAGE, TOUCH_SET, DEVICE_UNIQUE_DATA_SET, IPC_VERSION, IPC_STORES_INFO, SLEEP_QUALITY_SCORE, RELAX_REMINDER, CP_USER_INFO, TEST_INFO_SET, POWER2, WARNING_SET, DEVICE_LANGUAGES2, IPC_INFO, HRV_BASELINE, VIBRATION_V2, HIGH_ANTI_ASSIST, HR_MONITORING_V2, SLEEP_MONITORING_MODE, SLEEP_RISK_LEVEL, SLEEP_RESPIRATORY_RATE, RESTING_HEART_RATE, ZONES_HEART_RATE, VIDEO_CALL_INFO, OPTIONAL_MAP_AUTH_INFO, GET_WATCH_FACE_MAX_SIZE, ACTIVITY_RECOGNIYION, START_DEVICE_SPORT, PPG_SHSY, GSENSOR_SHSY, LOCATION_GSV, HR_RAW, REALTIME_LOG, GSENSOR_OUTPUT, GSENSOR_RAW, MOTION_DETECT, LOCATION_GGA, RAW_SLEEP, NO_DISTURB_GLOBAL, GOLF_LOCATION, GOLF_SPORT_SWITCH, GOLF_WATCH_SCORE, GOLF_WATCH_VERSION, GOLF_WATCH_MAP_INFO, READ_CY_WEE_UUID, SAI_WEI_SPORT_LOCATION, HYDRATION_SET, MEETING_REMINDER_SET, IDENTITY, SESSION, NOTIFICATION, MUSIC_CONTROL, SCHEDULE, WEATHER_REALTIME, WEATHER_FORECAST, HID, WORLD_CLOCK, STOCK, SMS_QUICK_REPLY_CONTENT, NOTIFICATION2, NEWS_FEED, WEATHER_REALTIME2, WEATHER_FORECAST2, LOGIN_DAYS, TARGET_COMPLETION, AUDIO_TEXT, WEATHER_REALTIME3, WEATHER_FORECAST3, CHAT_MESSAGE, CHAT_VOICE, CP_ANNIVERSARY, CP_GIFTS_INFO, CP_WEATHER_REALTIME, CP_WEATHER_FORECAST, CP_NOTIFICATION, CP_DISTANCE, DATA_ALL, ACTIVITY_REALTIME, ACTIVITY, HEART_RATE, BLOOD_PRESSURE, SLEEP, WORKOUT, LOCATION, TEMPERATURE, BLOOD_OXYGEN, HRV, LOG, SLEEP_RAW_DATA, PRESSURE, WORKOUT2, MATCH_RECORD, BLOOD_GLUCOSE, BODY_STATUS, MIND_STATUS, CALORIE_INTAKE, FOOD_BALANCE, BAC, MATCH_RECORD2, AVG_HEART_RATE, ALIPAY_BIND_INFO, RRI, ECG, HANBAO_VIBRATION, SOS_CALL_LOG, WORKOUT3, WORKOUT4, DAILY_POWER, TRAINING_STATUS, RESPIRATORY_RATE, VITALITY, MATCH_RECORD3, WORKOUT4_SEGMENTATION, ENERGY_RATING, ECG_V2, CAMERA, REQUEST_LOCATION, INCOMING_CALL, APP_SPORT_STATE, CLASSIC_BLUETOOTH_STATE, DEVICE_SMS_QUICK_REPLY, LOVE_TAP, FACTORY_TEST, DOUBLE_SCREEN, BAC_CALIBRATION, INCOMING_CALL_RING, SPORT_END_NOTIFY, FILE_PATH, APP_OP, HANBAO_VIBRATION_STATE, MEASUREMENT, GAME_CONTROL, APP_API_VERSION, DEVICE_OP, RECEIVE_DEVICE_FILE, AI_COMMAND, SG_RGB_SET, SG_SLEEP_SET, SG_EQ_SET, SG_KEY_SET, SG_CAMERA_SET, IPC_STATE, SG_KEYWORD_AWAKE, IPC_WIFI_INFO, AI_COACH_PLAN, WEAR_STATE, SG_TEST, LACTATE_THRESHOLD, CHAT_APP, CP_LISTENER, IPC_EXCEPTION, IPC_OTA_STATE, AI_COACH_PLAN_V2_READ, MULTIPLE_FILES_CONTROLLER, RECORD_CONTROL, RECORD_AUDIO_SET, CONTACT_US, SG_SET, SG_TTS, ONGOING_DIALOGUE, AUDIO_CONTROL, VIBRATION_LIGHT_SET, SLEEP_NOTIFY, XMLY_BAND_SET, BAND_KEY, OFFLINE_ASR_SET, WATCH_FACE, AGPS_FILE, FONT_FILE, CONTACT, UI_FILE, DEVICE_FILE, LANGUAGE_FILE, BRAND_INFO_FILE, QRCODE, THIRD_PARTY_DATA, QRCODE2, LOGO_FILE, OTA_FILE, GPS_FIRMWARE_FILE, CONTACT_SORT, NAVI_IMAGE, APP_FILE, FAT_BIN_FILE, AGPS_FILE2, CP_CHAT, CP_MISS_YOU, CP_TODO, CP_GALLERY, CP_GIFTS, CP_AVATAR, AI_COACH_PLAN_V2, FILE_TRANSFER, GOLF_IMAGE, GOLF_WATCH_UPDATE_MAP_INFO, GOOGLE_NAVI_INFO, SLEEP_DATA, NONE};
    }

    static {
        OTA = new BleKey("OTA", 0, 257);
        XMODEM = new BleKey("XMODEM", 1, 258);
        TIME = new BleKey(q62.X0iO, 2, 513);
        TIME_ZONE = new BleKey("TIME_ZONE", 3, 514);
        POWER = new BleKey(q62.iO1XOi, 4, 515);
        FIRMWARE_VERSION = new BleKey("FIRMWARE_VERSION", 5, 516);
        BLE_ADDRESS = new BleKey("BLE_ADDRESS", 6, 517);
        USER_PROFILE = new BleKey("USER_PROFILE", 7, 518);
        STEP_GOAL = new BleKey("STEP_GOAL", 8, 519);
        BACK_LIGHT = new BleKey("BACK_LIGHT", 9, 520);
        SEDENTARINESS = new BleKey("SEDENTARINESS", 10, 521);
        NO_DISTURB_RANGE = new BleKey("NO_DISTURB_RANGE", 11, DfuConstants.PROGRESS_HAND_OVER_PROCESSING);
        VIBRATION = new BleKey("VIBRATION", 12, 523);
        GESTURE_WAKE = new BleKey("GESTURE_WAKE", 13, 524);
        HR_ASSIST_SLEEP = new BleKey("HR_ASSIST_SLEEP", 14, 525);
        HOUR_SYSTEM = new BleKey("HOUR_SYSTEM", 15, 526);
        LANGUAGE = new BleKey("LANGUAGE", 16, 527);
        ALARM = new BleKey("ALARM", 17, 528);
        UNIT_SET = new BleKey("UNIT_SET", 18, 529);
        COACHING = new BleKey("COACHING", 19, 530);
        BLE_GOLF_EDITTEXT_DATA = new BleKey("BLE_GOLF_EDITTEXT_DATA", 20, 673);
        FIND_PHONE = new BleKey("FIND_PHONE", 21, 531);
        NOTIFICATION_REMINDER = new BleKey("NOTIFICATION_REMINDER", 22, 532);
        ANTI_LOST = new BleKey("ANTI_LOST", 23, 533);
        HR_MONITORING = new BleKey("HR_MONITORING", 24, DfuAdapter.STATE_PREPARE_PAIRING_REQUEST);
        UI_PACK_VERSION = new BleKey("UI_PACK_VERSION", 25, DfuAdapter.STATE_PREPARE_CONNECTING);
        LANGUAGE_PACK_VERSION = new BleKey("LANGUAGE_PACK_VERSION", 26, DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE);
        SLEEP_QUALITY = new BleKey("SLEEP_QUALITY", 27, DfuAdapter.STATE_DISCOVERY_SERVICE);
        GIRL_CARE = new BleKey("GIRL_CARE", 28, 538);
        TEMPERATURE_DETECTING = new BleKey("TEMPERATURE_DETECTING", 29, 539);
        AEROBIC_EXERCISE = new BleKey("AEROBIC_EXERCISE", 30, 540);
        TEMPERATURE_UNIT = new BleKey("TEMPERATURE_UNIT", 31, DfuAdapter.STATE_SYNC_SUB_INFO);
        DATE_FORMAT = new BleKey("DATE_FORMAT", 32, DfuAdapter.STATE_READ_BATTERY_INFO);
        WATCH_FACE_SWITCH = new BleKey("WATCH_FACE_SWITCH", 33, DfuAdapter.STATE_READ_IMAGE_INFO);
        AGPS_PREREQUISITE = new BleKey("AGPS_PREREQUISITE", 34, 544);
        DRINK_WATER = new BleKey("DRINK_WATER", 35, 545);
        SHUTDOWN = new BleKey("SHUTDOWN", 36, 546);
        APP_SPORT_DATA = new BleKey("APP_SPORT_DATA", 37, 547);
        REAL_TIME_HEART_RATE = new BleKey("REAL_TIME_HEART_RATE", 38, General.SIFLI_DFU_PACKET_BODY_LEN_NOR);
        BLOOD_OXYGEN_SET = new BleKey("BLOOD_OXYGEN_SET", 39, 549);
        WASH_SET = new BleKey("WASH_SET", 40, 550);
        SLEEP_SET = new BleKey("SLEEP_SET", 41, 671);
        VOICE_CONTROL = new BleKey("VOICE_CONTROL", 42, 672);
        WATCHFACE_ID = new BleKey("WATCHFACE_ID", 43, UIMsg.MsgDefine.MSG_LOG_GESTURE);
        IBEACON_SET = new BleKey("IBEACON_SET", 44, 552);
        MAC_QRCODE = new BleKey("MAC_QRCODE", 45, 553);
        REAL_TIME_TEMPERATURE = new BleKey("REAL_TIME_TEMPERATURE", 46, 560);
        REAL_TIME_BLOOD_PRESSURE = new BleKey("REAL_TIME_BLOOD_PRESSURE", 47, 561);
        TEMPERATURE_VALUE = new BleKey("TEMPERATURE_VALUE", 48, TTAdConstant.STYLE_SIZE_RADIO_9_16);
        GAME_SET = new BleKey("GAME_SET", 49, 563);
        FIND_WATCH = new BleKey("FIND_WATCH", 50, 564);
        SET_WATCH_PASSWORD = new BleKey("SET_WATCH_PASSWORD", 51, 565);
        REALTIME_MEASUREMENT = new BleKey("REALTIME_MEASUREMENT", 52, 566);
        POWER_SAVE_MODE = new BleKey("POWER_SAVE_MODE", 53, 567);
        BAC_SET = new BleKey("BAC_SET", 54, 568);
        CALORIES_GOAL = new BleKey("CALORIES_GOAL", 55, 569);
        DISTANCE_GOAL = new BleKey("DISTANCE_GOAL", 56, 570);
        SLEEP_GOAL = new BleKey("SLEEP_GOAL", 57, 571);
        LOVE_TAP_USER = new BleKey("LOVE_TAP_USER", 58, 572);
        MEDICATION_REMINDER = new BleKey("MEDICATION_REMINDER", 59, 573);
        DEVICE_INFO = new BleKey("DEVICE_INFO", 60, 574);
        HR_WARNING_SET = new BleKey("HR_WARNING_SET", 61, 575);
        SLEEP_MONITORING = new BleKey("SLEEP_MONITORING", 62, 576);
        STANDBY_SET = new BleKey("STANDBY_SET", 63, 577);
        BT_NAME = new BleKey("BT_NAME", 64, 578);
        TUYA_KEY_SET = new BleKey("TUYA_KEY_SET", 65, 579);
        BAC_RESULT = new BleKey("BAC_RESULT", 66, 580);
        BAC_RESULT_SET = new BleKey("BAC_RESULT_SET", 67, 581);
        MEDICATION_ALARM = new BleKey("MEDICATION_ALARM", 68, 582);
        MATCH_SET = new BleKey("MATCH_SET", 69, 583);
        PACKAGE_STATUS = new BleKey("PACKAGE_STATUS", 70, 585);
        NOTIFICATION_REMINDER2 = new BleKey("NOTIFICATION_REMINDER2", 71, 592);
        ALIPAY_SET = new BleKey("ALIPAY_SET", 72, 586);
        WECHAT_PAY_SET = new BleKey("WECHAT_PAY_SET", 73, 650);
        RECORD_PACKET = new BleKey("RECORD_PACKET", 74, 587);
        BLE_ADDRESS_SET = new BleKey("BLE_ADDRESS_SET", 75, 588);
        NAVI_INFO = new BleKey("NAVI_INFO", 76, 589);
        SOS_SET = new BleKey("SOS_SET", 77, 590);
        DEVICE_LANGUAGES = new BleKey("DEVICE_LANGUAGES", 78, 591);
        GAME_TIME_REMINDER = new BleKey("GAME_TIME_REMINDER", 79, 593);
        DEVICE_SPORT_DATA = new BleKey("DEVICE_SPORT_DATA", 80, 594);
        PRESSURE_TIMING_MEASUREMENT = new BleKey("PRESSURE_TIMING_MEASUREMENT", 81, 595);
        STANDBY_WATCH_FACE_SET = new BleKey("STANDBY_WATCH_FACE_SET", 82, 596);
        FALL_SET = new BleKey("FALL_SET", 83, 597);
        BW_NAVI_INFO = new BleKey("BW_NAVI_INFO", 84, BleCenter.EVT_REMOVED);
        CONNECT_REMINDER = new BleKey("CONNECT_REMINDER", 85, CommonGatewayClient.CODE_599);
        SDCARD_INFO = new BleKey("SDCARD_INFO", 86, 600);
        ACTIVITY_DETAIL = new BleKey("ACTIVITY_DETAIL", 87, 601);
        NOTIFICATION_LIGHT_SCREEN_SET = new BleKey("NOTIFICATION_LIGHT_SCREEN_SET", 88, 602);
        BLOOD_PRESSURE_CALIBRATION = new BleKey("BLOOD_PRESSURE_CALIBRATION", 89, 603);
        AIR_PRESSURE_CALIBRATION = new BleKey("AIR_PRESSURE_CALIBRATION", 90, 604);
        HRV_SET = new BleKey("HRV_SET", 91, 668);
        GOLF_MAP_CACHE_INFO = new BleKey("GOLF_MAP_CACHE_INFO", 92, 689);
        GOLF_MAP_CACHE = new BleKey("GOLF_MAP_CACHE", 93, 681);
        EARPHONE_POWER = new BleKey("EARPHONE_POWER", 94, 605);
        EARPHONE_ANC_SET = new BleKey("EARPHONE_ANC_SET", 95, 606);
        EARPHONE_SOUND_EFFECTS_SET = new BleKey("EARPHONE_SOUND_EFFECTS_SET", 96, 607);
        SCREEN_BRIGHTNESS_SET = new BleKey("SCREEN_BRIGHTNESS_SET", 97, 608);
        EARPHONE_INFO = new BleKey("EARPHONE_INFO", 98, 609);
        EARPHONE_STATE = new BleKey("EARPHONE_STATE", 99, 610);
        EARPHONE_CALL = new BleKey("EARPHONE_CALL", 100, 611);
        GPS_FIRMWARE_VERSION = new BleKey("GPS_FIRMWARE_VERSION", 101, 612);
        GOMORE_SET = new BleKey("GOMORE_SET", 102, IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE);
        RING_VIBRATION_SET = new BleKey("RING_VIBRATION_SET", 103, IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND);
        NETWORK_FIRMWARE_VERSION = new BleKey("NETWORK_FIRMWARE_VERSION", 104, IronSourceError.ERROR_BN_LOAD_NO_CONFIG);
        ECG_SET = new BleKey("ECG_SET", 105, IronSourceError.ERROR_BN_UNSUPPORTED_SIZE);
        SPORT_DURATION_GOAL = new BleKey("SPORT_DURATION_GOAL", 106, IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL);
        WATCHFACE_INDEX = new BleKey("WATCHFACE_INDEX", 107, 618);
        SOS_CONTACT = new BleKey("SOS_CONTACT", 108, 619);
        GIRL_CARE_MONTHLY = new BleKey("GIRL_CARE_MONTHLY", 109, IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW);
        GIRL_CARE_MENSTRUATION_UPDATE = new BleKey("GIRL_CARE_MENSTRUATION_UPDATE", 110, 621);
        HEALTH_INDEX = new BleKey("HEALTH_INDEX", 111, IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL);
        CHECK_IN_EVERY_DAY = new BleKey("CHECK_IN_EVERY_DAY", 112, IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE);
        WEAR_WAY = new BleKey("WEAR_WAY", 113, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED);
        GESTURE_WAKE2 = new BleKey("GESTURE_WAKE2", 114, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK);
        EARPHONE_KEY = new BleKey("EARPHONE_KEY", 115, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID);
        FIND_EARPHONE = new BleKey("FIND_EARPHONE", 116, LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED);
        HANBAO_SET = new BleKey("HANBAO_SET", 117, LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK);
        QIBLA_SET = new BleKey("QIBLA_SET", 118, LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW);
        CALIBRATION_DATA = new BleKey("CALIBRATION_DATA", 119, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW);
        BATTERY_USAGE = new BleKey("BATTERY_USAGE", 120, LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD);
        TOUCH_SET = new BleKey("TOUCH_SET", 121, 632);
        DEVICE_UNIQUE_DATA_SET = new BleKey("DEVICE_UNIQUE_DATA_SET", 122, 633);
        IPC_VERSION = new BleKey("IPC_VERSION", 123, 636);
        IPC_STORES_INFO = new BleKey("IPC_STORES_INFO", 124, 637);
        SLEEP_QUALITY_SCORE = new BleKey("SLEEP_QUALITY_SCORE", 125, 639);
        RELAX_REMINDER = new BleKey("RELAX_REMINDER", 126, 640);
        CP_USER_INFO = new BleKey("CP_USER_INFO", 127, 641);
        TEST_INFO_SET = new BleKey("TEST_INFO_SET", 128, 642);
        POWER2 = new BleKey("POWER2", 129, 643);
        WARNING_SET = new BleKey("WARNING_SET", 130, 645);
        DEVICE_LANGUAGES2 = new BleKey("DEVICE_LANGUAGES2", 131, 646);
        IPC_INFO = new BleKey("IPC_INFO", 132, 647);
        HRV_BASELINE = new BleKey("HRV_BASELINE", 133, 648);
        VIBRATION_V2 = new BleKey("VIBRATION_V2", 134, 649);
        HIGH_ANTI_ASSIST = new BleKey("HIGH_ANTI_ASSIST", 135, 656);
        HR_MONITORING_V2 = new BleKey("HR_MONITORING_V2", 136, 658);
        SLEEP_MONITORING_MODE = new BleKey("SLEEP_MONITORING_MODE", 137, 659);
        SLEEP_RISK_LEVEL = new BleKey("SLEEP_RISK_LEVEL", 138, 660);
        SLEEP_RESPIRATORY_RATE = new BleKey("SLEEP_RESPIRATORY_RATE", 139, 661);
        RESTING_HEART_RATE = new BleKey("RESTING_HEART_RATE", 140, 662);
        ZONES_HEART_RATE = new BleKey("ZONES_HEART_RATE", 141, 664);
        VIDEO_CALL_INFO = new BleKey("VIDEO_CALL_INFO", 142, 665);
        OPTIONAL_MAP_AUTH_INFO = new BleKey("OPTIONAL_MAP_AUTH_INFO", 143, 666);
        GET_WATCH_FACE_MAX_SIZE = new BleKey("GET_WATCH_FACE_MAX_SIZE", 144, 669);
        ACTIVITY_RECOGNIYION = new BleKey("ACTIVITY_RECOGNIYION", 145, 667);
        START_DEVICE_SPORT = new BleKey("START_DEVICE_SPORT", 146, 670);
        PPG_SHSY = new BleKey("PPG_SHSY", 147, 757);
        GSENSOR_SHSY = new BleKey("GSENSOR_SHSY", 148, 758);
        LOCATION_GSV = new BleKey("LOCATION_GSV", 149, 759);
        HR_RAW = new BleKey("HR_RAW", 150, 760);
        REALTIME_LOG = new BleKey("REALTIME_LOG", 151, TaskPipe.EVT_BUSY);
        GSENSOR_OUTPUT = new BleKey("GSENSOR_OUTPUT", 152, 762);
        GSENSOR_RAW = new BleKey("GSENSOR_RAW", 153, 763);
        MOTION_DETECT = new BleKey("MOTION_DETECT", 154, 764);
        LOCATION_GGA = new BleKey("LOCATION_GGA", 155, 765);
        RAW_SLEEP = new BleKey("RAW_SLEEP", 156, DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED);
        NO_DISTURB_GLOBAL = new BleKey("NO_DISTURB_GLOBAL", 157, DfuException.ERROR_NOTIFICATION_NO_RESPONSE);
        GOLF_LOCATION = new BleKey("GOLF_LOCATION", 158, 674);
        GOLF_SPORT_SWITCH = new BleKey("GOLF_SPORT_SWITCH", 159, 675);
        GOLF_WATCH_SCORE = new BleKey("GOLF_WATCH_SCORE", 160, 676);
        GOLF_WATCH_VERSION = new BleKey("GOLF_WATCH_VERSION", 161, 677);
        GOLF_WATCH_MAP_INFO = new BleKey("GOLF_WATCH_MAP_INFO", 162, 679);
        READ_CY_WEE_UUID = new BleKey("READ_CY_WEE_UUID", 163, 678);
        SAI_WEI_SPORT_LOCATION = new BleKey("SAI_WEI_SPORT_LOCATION", 164, 690);
        HYDRATION_SET = new BleKey("HYDRATION_SET", 165, 692);
        MEETING_REMINDER_SET = new BleKey("MEETING_REMINDER_SET", 166, 693);
        IDENTITY = new BleKey("IDENTITY", 167, 769);
        SESSION = new BleKey("SESSION", 168, 770);
        NOTIFICATION = new BleKey("NOTIFICATION", 169, 1025);
        MUSIC_CONTROL = new BleKey("MUSIC_CONTROL", 170, 1026);
        SCHEDULE = new BleKey("SCHEDULE", 171, 1027);
        WEATHER_REALTIME = new BleKey("WEATHER_REALTIME", 172, 1028);
        WEATHER_FORECAST = new BleKey("WEATHER_FORECAST", 173, 1029);
        HID = new BleKey("HID", 174, 1030);
        WORLD_CLOCK = new BleKey("WORLD_CLOCK", 175, 1031);
        STOCK = new BleKey("STOCK", 176, 1032);
        SMS_QUICK_REPLY_CONTENT = new BleKey("SMS_QUICK_REPLY_CONTENT", 177, IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT);
        NOTIFICATION2 = new BleKey("NOTIFICATION2", 178, IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK);
        NEWS_FEED = new BleKey("NEWS_FEED", 179, IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES);
        WEATHER_REALTIME2 = new BleKey("WEATHER_REALTIME2", 180, 1036);
        WEATHER_FORECAST2 = new BleKey("WEATHER_FORECAST2", 181, IronSourceError.ERROR_IS_LOAD_DURING_SHOW);
        LOGIN_DAYS = new BleKey("LOGIN_DAYS", 182, IronSourceError.ERROR_RV_SHOW_EXCEPTION);
        TARGET_COMPLETION = new BleKey("TARGET_COMPLETION", 183, IronSourceError.ERROR_IS_SHOW_EXCEPTION);
        AUDIO_TEXT = new BleKey("AUDIO_TEXT", 184, 1040);
        WEATHER_REALTIME3 = new BleKey("WEATHER_REALTIME3", 185, IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED);
        WEATHER_FORECAST3 = new BleKey("WEATHER_FORECAST3", 186, IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED);
        CHAT_MESSAGE = new BleKey("CHAT_MESSAGE", 187, IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES);
        CHAT_VOICE = new BleKey("CHAT_VOICE", 188, IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES);
        CP_ANNIVERSARY = new BleKey("CP_ANNIVERSARY", 189, 1046);
        CP_GIFTS_INFO = new BleKey("CP_GIFTS_INFO", 190, 1047);
        CP_WEATHER_REALTIME = new BleKey("CP_WEATHER_REALTIME", 191, 1048);
        CP_WEATHER_FORECAST = new BleKey("CP_WEATHER_FORECAST", 192, 1049);
        CP_NOTIFICATION = new BleKey("CP_NOTIFICATION", 193, 1050);
        CP_DISTANCE = new BleKey("CP_DISTANCE", 194, IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW);
        DATA_ALL = new BleKey("DATA_ALL", 195, 1535);
        ACTIVITY_REALTIME = new BleKey("ACTIVITY_REALTIME", 196, 1281);
        ACTIVITY = new BleKey("ACTIVITY", 197, 1282);
        HEART_RATE = new BleKey("HEART_RATE", 198, 1283);
        BLOOD_PRESSURE = new BleKey("BLOOD_PRESSURE", 199, 1284);
        SLEEP = new BleKey("SLEEP", 200, 1285);
        WORKOUT = new BleKey("WORKOUT", 201, 1286);
        LOCATION = new BleKey(PermissionConstants.LOCATION, 202, 1287);
        TEMPERATURE = new BleKey("TEMPERATURE", 203, 1288);
        BLOOD_OXYGEN = new BleKey("BLOOD_OXYGEN", 204, 1289);
        HRV = new BleKey("HRV", 205, 1290);
        LOG = new BleKey("LOG", 206, 1291);
        SLEEP_RAW_DATA = new BleKey("SLEEP_RAW_DATA", 207, 1292);
        PRESSURE = new BleKey("PRESSURE", 208, 1293);
        WORKOUT2 = new BleKey("WORKOUT2", 209, 1294);
        MATCH_RECORD = new BleKey("MATCH_RECORD", 210, 1295);
        BLOOD_GLUCOSE = new BleKey("BLOOD_GLUCOSE", 211, 1296);
        BODY_STATUS = new BleKey("BODY_STATUS", 212, 1297);
        MIND_STATUS = new BleKey("MIND_STATUS", 213, 1298);
        CALORIE_INTAKE = new BleKey("CALORIE_INTAKE", 214, 1299);
        FOOD_BALANCE = new BleKey("FOOD_BALANCE", 215, 1300);
        BAC = new BleKey("BAC", 216, 1301);
        MATCH_RECORD2 = new BleKey("MATCH_RECORD2", 217, 1302);
        AVG_HEART_RATE = new BleKey("AVG_HEART_RATE", 218, 1303);
        ALIPAY_BIND_INFO = new BleKey("ALIPAY_BIND_INFO", 219, 1304);
        RRI = new BleKey("RRI", 220, 1305);
        ECG = new BleKey("ECG", 221, 1312);
        HANBAO_VIBRATION = new BleKey("HANBAO_VIBRATION", 222, 1313);
        SOS_CALL_LOG = new BleKey("SOS_CALL_LOG", 223, 1314);
        WORKOUT3 = new BleKey("WORKOUT3", 224, 1315);
        WORKOUT4 = new BleKey("WORKOUT4", 225, 1316);
        DAILY_POWER = new BleKey("DAILY_POWER", 226, 1317);
        TRAINING_STATUS = new BleKey("TRAINING_STATUS", 227, 1318);
        RESPIRATORY_RATE = new BleKey("RESPIRATORY_RATE", 228, 1321);
        VITALITY = new BleKey("VITALITY", 229, OOOi0.iX1O1);
        MATCH_RECORD3 = new BleKey("MATCH_RECORD3", 230, 1329);
        WORKOUT4_SEGMENTATION = new BleKey("WORKOUT4_SEGMENTATION", 231, 1330);
        ENERGY_RATING = new BleKey("ENERGY_RATING", 232, 1331);
        ECG_V2 = new BleKey("ECG_V2", 233, 1332);
        CAMERA = new BleKey(PermissionConstants.CAMERA, 234, 1537);
        REQUEST_LOCATION = new BleKey("REQUEST_LOCATION", 235, SubBinId.Bbpro.DSP_APP_IMAGE);
        INCOMING_CALL = new BleKey("INCOMING_CALL", 236, SubBinId.Bbpro.DSP_SCENARIO2);
        APP_SPORT_STATE = new BleKey("APP_SPORT_STATE", 237, 1540);
        CLASSIC_BLUETOOTH_STATE = new BleKey("CLASSIC_BLUETOOTH_STATE", 238, 1541);
        DEVICE_SMS_QUICK_REPLY = new BleKey("DEVICE_SMS_QUICK_REPLY", 239, 1543);
        LOVE_TAP = new BleKey("LOVE_TAP", 240, 1544);
        FACTORY_TEST = new BleKey("FACTORY_TEST", Command.CMD_PHONE_NUMBER_PLAY_MODE, 1545);
        DOUBLE_SCREEN = new BleKey("DOUBLE_SCREEN", Command.CMD_NOTIFY_FILE_STRUCTURE_CHANGE, 1546);
        BAC_CALIBRATION = new BleKey("BAC_CALIBRATION", 243, 1547);
        INCOMING_CALL_RING = new BleKey("INCOMING_CALL_RING", 244, 1548);
        SPORT_END_NOTIFY = new BleKey("SPORT_END_NOTIFY", 245, 1549);
        FILE_PATH = new BleKey("FILE_PATH", 246, 1550);
        APP_OP = new BleKey("APP_OP", 247, OOOi0.i0X000X0O);
        HANBAO_VIBRATION_STATE = new BleKey("HANBAO_VIBRATION_STATE", 248, 1552);
        MEASUREMENT = new BleKey("MEASUREMENT", 249, 1553);
        GAME_CONTROL = new BleKey("GAME_CONTROL", 250, 1554);
        APP_API_VERSION = new BleKey("APP_API_VERSION", IOiOOI0.O10IXXX0X, OOOi0.i11I);
        DEVICE_OP = new BleKey("DEVICE_OP", IOiOOI0.X0O, 1556);
        RECEIVE_DEVICE_FILE = new BleKey("RECEIVE_DEVICE_FILE", 253, 1557);
        AI_COMMAND = new BleKey("AI_COMMAND", 254, 1558);
        SG_RGB_SET = new BleKey("SG_RGB_SET", 255, 1559);
        SG_SLEEP_SET = new BleKey("SG_SLEEP_SET", 256, 1560);
        SG_EQ_SET = new BleKey("SG_EQ_SET", 257, OOOi0.XO0X10iO);
        SG_KEY_SET = new BleKey("SG_KEY_SET", 258, 1562);
        SG_CAMERA_SET = new BleKey("SG_CAMERA_SET", 259, 1563);
        IPC_STATE = new BleKey("IPC_STATE", 260, 1564);
        SG_KEYWORD_AWAKE = new BleKey("SG_KEYWORD_AWAKE", 261, 1565);
        IPC_WIFI_INFO = new BleKey("IPC_WIFI_INFO", 262, 1566);
        AI_COACH_PLAN = new BleKey("AI_COACH_PLAN", 263, OOOi0.Ii0X0X);
        WEAR_STATE = new BleKey("WEAR_STATE", 264, 1568);
        SG_TEST = new BleKey("SG_TEST", 265, 1569);
        LACTATE_THRESHOLD = new BleKey("LACTATE_THRESHOLD", 266, OOOi0.XXiIiX10);
        CHAT_APP = new BleKey("CHAT_APP", 267, 1571);
        CP_LISTENER = new BleKey("CP_LISTENER", 268, 1572);
        IPC_EXCEPTION = new BleKey("IPC_EXCEPTION", 269, 1574);
        IPC_OTA_STATE = new BleKey("IPC_OTA_STATE", 270, 1575);
        AI_COACH_PLAN_V2_READ = new BleKey("AI_COACH_PLAN_V2_READ", 271, 1576);
        MULTIPLE_FILES_CONTROLLER = new BleKey("MULTIPLE_FILES_CONTROLLER", 272, 1577);
        RECORD_CONTROL = new BleKey("RECORD_CONTROL", 273, 1584);
        RECORD_AUDIO_SET = new BleKey("RECORD_AUDIO_SET", 274, 1585);
        CONTACT_US = new BleKey("CONTACT_US", 275, 1586);
        SG_SET = new BleKey("SG_SET", 276, 1587);
        SG_TTS = new BleKey("SG_TTS", 277, 1588);
        ONGOING_DIALOGUE = new BleKey("ONGOING_DIALOGUE", z30.OiXI1OiX0, 1589);
        AUDIO_CONTROL = new BleKey("AUDIO_CONTROL", 279, 1590);
        VIBRATION_LIGHT_SET = new BleKey("VIBRATION_LIGHT_SET", 280, 1591);
        SLEEP_NOTIFY = new BleKey("SLEEP_NOTIFY", 281, 1592);
        XMLY_BAND_SET = new BleKey("XMLY_BAND_SET", 282, 1595);
        BAND_KEY = new BleKey("BAND_KEY", 283, 1597);
        OFFLINE_ASR_SET = new BleKey("OFFLINE_ASR_SET", 284, 1599);
        WATCH_FACE = new BleKey("WATCH_FACE", 285, 1793);
        AGPS_FILE = new BleKey("AGPS_FILE", 286, 1794);
        FONT_FILE = new BleKey("FONT_FILE", 287, 1795);
        CONTACT = new BleKey("CONTACT", 288, 1796);
        UI_FILE = new BleKey("UI_FILE", 289, 1797);
        DEVICE_FILE = new BleKey("DEVICE_FILE", 290, 1798);
        LANGUAGE_FILE = new BleKey("LANGUAGE_FILE", z30.I1OI, 1799);
        BRAND_INFO_FILE = new BleKey("BRAND_INFO_FILE", z30.iXOiXII, 1800);
        QRCODE = new BleKey("QRCODE", z30.X00110X, 1801);
        THIRD_PARTY_DATA = new BleKey("THIRD_PARTY_DATA", z30.iOXiO1O1I, 1802);
        QRCODE2 = new BleKey("QRCODE2", z30.ii0111XI, 1803);
        LOGO_FILE = new BleKey("LOGO_FILE", z30.IIII0iI, 1804);
        OTA_FILE = new BleKey("OTA_FILE", 297, 1805);
        GPS_FIRMWARE_FILE = new BleKey("GPS_FIRMWARE_FILE", 298, 1806);
        CONTACT_SORT = new BleKey("CONTACT_SORT", z30.O0, 1807);
        NAVI_IMAGE = new BleKey("NAVI_IMAGE", 300, 1808);
        APP_FILE = new BleKey("APP_FILE", 301, 1809);
        FAT_BIN_FILE = new BleKey("FAT_BIN_FILE", 302, 1810);
        AGPS_FILE2 = new BleKey("AGPS_FILE2", 303, 1811);
        CP_CHAT = new BleKey("CP_CHAT", 304, 1812);
        CP_MISS_YOU = new BleKey("CP_MISS_YOU", 305, 1813);
        CP_TODO = new BleKey("CP_TODO", 306, 1814);
        CP_GALLERY = new BleKey("CP_GALLERY", 307, 1815);
        CP_GIFTS = new BleKey("CP_GIFTS", 308, 1816);
        CP_AVATAR = new BleKey("CP_AVATAR", 309, 1817);
        AI_COACH_PLAN_V2 = new BleKey("AI_COACH_PLAN_V2", 310, 1820);
        FILE_TRANSFER = new BleKey("FILE_TRANSFER", 311, 1819);
        GOLF_IMAGE = new BleKey("GOLF_IMAGE", 312, OOOi0.IO0iXO0O);
        GOLF_WATCH_UPDATE_MAP_INFO = new BleKey("GOLF_WATCH_UPDATE_MAP_INFO", 313, OOOi0.XX00i10X);
        GOOGLE_NAVI_INFO = new BleKey("GOOGLE_NAVI_INFO", 314, NewHope.SENDA_BYTES);
        SLEEP_DATA = new BleKey("SLEEP_DATA", 315, 1825);
        NONE = new BleKey("NONE", 316, 65535);
        BleKey[] r0 = $values();
        $VALUES = r0;
        $ENTRIES = EnumEntriesKt.iO(r0);
        Companion = new OXO1(null);
    }

    private BleKey(String r1, int r2, int r3) {
        super(r1, r2);
        this.mKey = r3;
    }

    @aa1
    public static EnumEntries<BleKey> getEntries() {
        return $ENTRIES;
    }

    public static BleKey valueOf(String r1) {
        return (BleKey) Enum.valueOf(BleKey.class, r1);
    }

    public static BleKey[] values() {
        return (BleKey[]) $VALUES.clone();
    }

    @aa1
    public final List<BleKeyFlag> getBleKeyFlags() {
        switch(XIi00iiXO.OXO1[ordinal()]) {
            case 1: goto L55;
            case 2: goto L55;
            case 3: goto L53;
            case 4: goto L53;
            case 5: goto L53;
            case 6: goto L53;
            case 7: goto L53;
            case 8: goto L53;
            case 9: goto L53;
            case 10: goto L53;
            case 11: goto L53;
            case 12: goto L53;
            case 13: goto L53;
            case 14: goto L53;
            case 15: goto L53;
            case 16: goto L53;
            case 17: goto L53;
            case 18: goto L53;
            case 19: goto L53;
            case 20: goto L53;
            case 21: goto L53;
            case 22: goto L53;
            case 23: goto L53;
            case 24: goto L53;
            case 25: goto L53;
            case 26: goto L53;
            case 27: goto L51;
            case 28: goto L51;
            case 29: goto L51;
            case 30: goto L51;
            case 31: goto L51;
            case 32: goto L51;
            case 33: goto L51;
            case 34: goto L51;
            case 35: goto L51;
            case 36: goto L51;
            case 37: goto L51;
            case 38: goto L51;
            case 39: goto L51;
            case 40: goto L51;
            case 41: goto L51;
            case 42: goto L51;
            case 43: goto L51;
            case 44: goto L51;
            case 45: goto L51;
            case 46: goto L51;
            case 47: goto L51;
            case 48: goto L51;
            case 49: goto L51;
            case 50: goto L51;
            case 51: goto L51;
            case 52: goto L51;
            case 53: goto L51;
            case 54: goto L51;
            case 55: goto L51;
            case 56: goto L51;
            case 57: goto L51;
            case 58: goto L51;
            case 59: goto L51;
            case 60: goto L51;
            case 61: goto L51;
            case 62: goto L51;
            case 63: goto L51;
            case 64: goto L49;
            case 65: goto L49;
            case 66: goto L49;
            case 67: goto L49;
            case 68: goto L49;
            case 69: goto L49;
            case 70: goto L49;
            case 71: goto L49;
            case 72: goto L49;
            case 73: goto L49;
            case 74: goto L49;
            case 75: goto L49;
            case 76: goto L49;
            case 77: goto L49;
            case 78: goto L49;
            case 79: goto L49;
            case 80: goto L49;
            case 81: goto L49;
            case 82: goto L49;
            case 83: goto L49;
            case 84: goto L49;
            case 85: goto L49;
            case 86: goto L49;
            case 87: goto L49;
            case 88: goto L49;
            case 89: goto L49;
            case 90: goto L49;
            case 91: goto L49;
            case 92: goto L49;
            case 93: goto L49;
            case 94: goto L49;
            case 95: goto L49;
            case 96: goto L49;
            case 97: goto L49;
            case 98: goto L49;
            case 99: goto L49;
            case 100: goto L49;
            case 101: goto L49;
            case 102: goto L49;
            case 103: goto L49;
            case 104: goto L49;
            case 105: goto L49;
            case 106: goto L49;
            case 107: goto L49;
            case 108: goto L49;
            case 109: goto L49;
            case 110: goto L49;
            case 111: goto L49;
            case 112: goto L49;
            case 113: goto L49;
            case 114: goto L49;
            case 115: goto L49;
            case 116: goto L49;
            case 117: goto L49;
            case 118: goto L49;
            case 119: goto L49;
            case 120: goto L49;
            case 121: goto L47;
            case 122: goto L45;
            case 123: goto L45;
            case 124: goto L45;
            case 125: goto L45;
            case 126: goto L43;
            case 127: goto L41;
            case 128: goto L39;
            case 129: goto L39;
            case 130: goto L37;
            case 131: goto L35;
            case 132: goto L35;
            case 133: goto L35;
            case 134: goto L35;
            case 135: goto L35;
            case 136: goto L35;
            case 137: goto L35;
            case 138: goto L35;
            case 139: goto L35;
            case 140: goto L35;
            case 141: goto L35;
            case 142: goto L35;
            case 143: goto L35;
            case 144: goto L35;
            case 145: goto L35;
            case 146: goto L35;
            case 147: goto L35;
            case 148: goto L35;
            case 149: goto L35;
            case 150: goto L35;
            case 151: goto L35;
            case 152: goto L33;
            case 153: goto L31;
            case 154: goto L31;
            case 155: goto L29;
            case 156: goto L27;
            case 157: goto L27;
            case 158: goto L25;
            case 159: goto L25;
            case 160: goto L23;
            case 161: goto L23;
            case 162: goto L23;
            case 163: goto L23;
            case 164: goto L23;
            case 165: goto L23;
            case 166: goto L23;
            case 167: goto L23;
            case 168: goto L23;
            case 169: goto L23;
            case 170: goto L23;
            case 171: goto L23;
            case 172: goto L23;
            case 173: goto L23;
            case 174: goto L23;
            case 175: goto L23;
            case 176: goto L23;
            case 177: goto L23;
            case 178: goto L23;
            case 179: goto L23;
            case 180: goto L23;
            case 181: goto L23;
            case 182: goto L23;
            case 183: goto L23;
            case 184: goto L23;
            case 185: goto L23;
            case 186: goto L23;
            case 187: goto L23;
            case 188: goto L23;
            case 189: goto L23;
            case 190: goto L23;
            case 191: goto L23;
            case 192: goto L21;
            case 193: goto L19;
            case 194: goto L19;
            case 195: goto L17;
            case 196: goto L17;
            case 197: goto L17;
            case 198: goto L17;
            case 199: goto L17;
            case 200: goto L17;
            case 201: goto L17;
            case 202: goto L17;
            case 203: goto L17;
            case 204: goto L17;
            case 205: goto L17;
            case 206: goto L17;
            case 207: goto L17;
            case 208: goto L17;
            case 209: goto L17;
            case 210: goto L17;
            case 211: goto L17;
            case 212: goto L17;
            case 213: goto L17;
            case 214: goto L17;
            case 215: goto L17;
            case 216: goto L17;
            case 217: goto L17;
            case 218: goto L17;
            case 219: goto L17;
            case 220: goto L15;
            case 221: goto L15;
            case 222: goto L15;
            case 223: goto L15;
            case 224: goto L13;
            case 225: goto L11;
            case 226: goto L9;
            case 227: goto L9;
            case 228: goto L9;
            case 229: goto L9;
            case 230: goto L9;
            case 231: goto L9;
            case 232: goto L9;
            case 233: goto L9;
            case 234: goto L9;
            case 235: goto L9;
            case 236: goto L9;
            case 237: goto L9;
            case 238: goto L9;
            case 239: goto L9;
            case 240: goto L9;
            case 241: goto L9;
            case 242: goto L9;
            case 243: goto L9;
            case 244: goto L9;
            case 245: goto L9;
            case 246: goto L9;
            case 247: goto L9;
            case 248: goto L9;
            case 249: goto L9;
            case 250: goto L9;
            case 251: goto L9;
            case 252: goto L7;
            default: goto L5;
        };
    L5:
        return CollectionsKt__CollectionsKt.iI();
    L7:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.READ, BleKeyFlag.UPDATE});
    L9:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    L11:
        return X0iO1XX.I0iXXO(BleKeyFlag.READ);
    L13:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L15:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L17:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    L19:
        return X0iO1XX.I0iXXO(BleKeyFlag.CREATE);
    L21:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    L23:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.READ, BleKeyFlag.DELETE});
    L25:
        return X0iO1XX.I0iXXO(BleKeyFlag.READ);
    L27:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.RESET});
    L29:
        return X0iO1XX.I0iXXO(BleKeyFlag.READ);
    L31:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE});
    L33:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L35:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    L37:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.READ, BleKeyFlag.DELETE, BleKeyFlag.UPDATE});
    L39:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.READ, BleKeyFlag.DELETE});
    L41:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.DELETE});
    L43:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L45:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.RESET});
    L47:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.CREATE, BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L49:
        return CollectionsKt__CollectionsKt.iXiX011(new BleKeyFlag[]{BleKeyFlag.UPDATE, BleKeyFlag.READ});
    L51:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    L53:
        return X0iO1XX.I0iXXO(BleKeyFlag.READ);
    L55:
        return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
    }

    @aa1
    public final BleCommand getMBleCommand() {
        BleCommand[] r0 = BleCommand.values();
        int r1 = r0.length;
        int r2 = 0;
    L3:
        if (r2 >= r1) goto L8;
        BleCommand r3 = r0[r2];
        if (r3.getMBleCommand() == (this.mKey >>> 8)) goto L9;
        r2 = r2 + 1;
    L9:
        if (r3 == null) goto L11;
        return r3;
    L11:
        return BleCommand.NONE;
    L8:
        r3 = null;
        goto L9
    }

    public final byte getMCommandRawValue() {
        return (byte) (this.mKey >> 8);
    }

    public final int getMKey() {
        return this.mKey;
    }

    public final byte getMKeyRawValue() {
        return (byte) this.mKey;
    }

    public final boolean isIdObjectKey() {
        if (this != ALARM) goto L5;
        return true;
    L5:
        if (this != SCHEDULE) goto L7;
        return true;
    L7:
        if (this != COACHING) goto L9;
        return true;
    L9:
        if (this != WORLD_CLOCK) goto L11;
        return true;
    L11:
        if (this != STOCK) goto L13;
        return true;
    L13:
        if (this != SMS_QUICK_REPLY_CONTENT) goto L15;
        return true;
    L15:
        if (this != LOVE_TAP_USER) goto L17;
        return true;
    L17:
        if (this != MEDICATION_REMINDER) goto L19;
        return true;
    L19:
        if (this == MEDICATION_ALARM) goto L32;
        return false;
    L32:
        return true;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%04X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mKey)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(name());
        return r0.toString();
    }
}
