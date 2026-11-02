package com.szabh.smable3;

import com.android.mltcode.paycertificationapi.IOiOOI0;
import com.android.mltcode.paycertificationapi.OOOi0;
import com.android.mltcode.paycertificationapi.X0iO1XX;
import com.android.mltcode.paycertificationapi.aa1;
import com.baidu.platform.comapi.UIMsg;
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
public enum BleKey {
    OTA(257),
    XMODEM(258),
    TIME(513),
    TIME_ZONE(514),
    POWER(515),
    FIRMWARE_VERSION(516),
    BLE_ADDRESS(517),
    USER_PROFILE(518),
    STEP_GOAL(519),
    BACK_LIGHT(520),
    SEDENTARINESS(521),
    NO_DISTURB_RANGE(DfuConstants.PROGRESS_HAND_OVER_PROCESSING),
    VIBRATION(523),
    GESTURE_WAKE(524),
    HR_ASSIST_SLEEP(525),
    HOUR_SYSTEM(526),
    LANGUAGE(527),
    ALARM(528),
    UNIT_SET(529),
    COACHING(530),
    BLE_GOLF_EDITTEXT_DATA(673),
    FIND_PHONE(531),
    NOTIFICATION_REMINDER(532),
    ANTI_LOST(533),
    HR_MONITORING(DfuAdapter.STATE_PREPARE_PAIRING_REQUEST),
    UI_PACK_VERSION(DfuAdapter.STATE_PREPARE_CONNECTING),
    LANGUAGE_PACK_VERSION(DfuAdapter.STATE_PENDDING_DISCOVERY_SERVICE),
    SLEEP_QUALITY(DfuAdapter.STATE_DISCOVERY_SERVICE),
    GIRL_CARE(538),
    TEMPERATURE_DETECTING(539),
    AEROBIC_EXERCISE(540),
    TEMPERATURE_UNIT(DfuAdapter.STATE_SYNC_SUB_INFO),
    DATE_FORMAT(DfuAdapter.STATE_READ_BATTERY_INFO),
    WATCH_FACE_SWITCH(DfuAdapter.STATE_READ_IMAGE_INFO),
    AGPS_PREREQUISITE(544),
    DRINK_WATER(545),
    SHUTDOWN(546),
    APP_SPORT_DATA(547),
    REAL_TIME_HEART_RATE(General.SIFLI_DFU_PACKET_BODY_LEN_NOR),
    BLOOD_OXYGEN_SET(549),
    WASH_SET(550),
    SLEEP_SET(671),
    VOICE_CONTROL(672),
    WATCHFACE_ID(UIMsg.MsgDefine.MSG_LOG_GESTURE),
    IBEACON_SET(552),
    MAC_QRCODE(553),
    REAL_TIME_TEMPERATURE(560),
    REAL_TIME_BLOOD_PRESSURE(561),
    TEMPERATURE_VALUE(TTAdConstant.STYLE_SIZE_RADIO_9_16),
    GAME_SET(563),
    FIND_WATCH(564),
    SET_WATCH_PASSWORD(565),
    REALTIME_MEASUREMENT(566),
    POWER_SAVE_MODE(567),
    BAC_SET(568),
    CALORIES_GOAL(569),
    DISTANCE_GOAL(570),
    SLEEP_GOAL(571),
    LOVE_TAP_USER(572),
    MEDICATION_REMINDER(573),
    DEVICE_INFO(574),
    HR_WARNING_SET(575),
    SLEEP_MONITORING(576),
    STANDBY_SET(577),
    BT_NAME(578),
    TUYA_KEY_SET(579),
    BAC_RESULT(580),
    BAC_RESULT_SET(581),
    MEDICATION_ALARM(582),
    MATCH_SET(583),
    PACKAGE_STATUS(585),
    NOTIFICATION_REMINDER2(592),
    ALIPAY_SET(586),
    WECHAT_PAY_SET(650),
    RECORD_PACKET(587),
    BLE_ADDRESS_SET(588),
    NAVI_INFO(589),
    SOS_SET(590),
    DEVICE_LANGUAGES(591),
    GAME_TIME_REMINDER(593),
    DEVICE_SPORT_DATA(594),
    PRESSURE_TIMING_MEASUREMENT(595),
    STANDBY_WATCH_FACE_SET(596),
    FALL_SET(597),
    BW_NAVI_INFO(BleCenter.EVT_REMOVED),
    CONNECT_REMINDER(CommonGatewayClient.CODE_599),
    SDCARD_INFO(600),
    ACTIVITY_DETAIL(601),
    NOTIFICATION_LIGHT_SCREEN_SET(602),
    BLOOD_PRESSURE_CALIBRATION(603),
    AIR_PRESSURE_CALIBRATION(604),
    HRV_SET(668),
    GOLF_MAP_CACHE_INFO(689),
    GOLF_MAP_CACHE(681),
    EARPHONE_POWER(605),
    EARPHONE_ANC_SET(606),
    EARPHONE_SOUND_EFFECTS_SET(607),
    SCREEN_BRIGHTNESS_SET(608),
    EARPHONE_INFO(609),
    EARPHONE_STATE(610),
    EARPHONE_CALL(611),
    GPS_FIRMWARE_VERSION(612),
    GOMORE_SET(IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE),
    RING_VIBRATION_SET(IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND),
    NETWORK_FIRMWARE_VERSION(IronSourceError.ERROR_BN_LOAD_NO_CONFIG),
    ECG_SET(IronSourceError.ERROR_BN_UNSUPPORTED_SIZE),
    SPORT_DURATION_GOAL(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL),
    WATCHFACE_INDEX(618),
    SOS_CONTACT(619),
    GIRL_CARE_MONTHLY(IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW),
    GIRL_CARE_MENSTRUATION_UPDATE(621),
    HEALTH_INDEX(IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL),
    CHECK_IN_EVERY_DAY(IronSourceError.ERROR_BN_BINDING_SKIP_INVISIBLE),
    WEAR_WAY(LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED),
    GESTURE_WAKE2(LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK),
    EARPHONE_KEY(LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID),
    FIND_EARPHONE(LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED),
    HANBAO_SET(LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK),
    QIBLA_SET(LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW),
    CALIBRATION_DATA(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_SHOW),
    BATTERY_USAGE(LevelPlayAdError.ERROR_CODE_SHOW_WHILE_LOAD),
    TOUCH_SET(632),
    DEVICE_UNIQUE_DATA_SET(633),
    IPC_VERSION(636),
    IPC_STORES_INFO(637),
    SLEEP_QUALITY_SCORE(639),
    RELAX_REMINDER(640),
    CP_USER_INFO(641),
    TEST_INFO_SET(642),
    POWER2(643),
    WARNING_SET(645),
    DEVICE_LANGUAGES2(646),
    IPC_INFO(647),
    HRV_BASELINE(648),
    VIBRATION_V2(649),
    HIGH_ANTI_ASSIST(656),
    HR_MONITORING_V2(658),
    SLEEP_MONITORING_MODE(659),
    SLEEP_RISK_LEVEL(660),
    SLEEP_RESPIRATORY_RATE(661),
    RESTING_HEART_RATE(662),
    ZONES_HEART_RATE(664),
    VIDEO_CALL_INFO(665),
    OPTIONAL_MAP_AUTH_INFO(666),
    GET_WATCH_FACE_MAX_SIZE(669),
    ACTIVITY_RECOGNIYION(667),
    START_DEVICE_SPORT(670),
    PPG_SHSY(757),
    GSENSOR_SHSY(758),
    LOCATION_GSV(759),
    HR_RAW(760),
    REALTIME_LOG(TaskPipe.EVT_BUSY),
    GSENSOR_OUTPUT(762),
    GSENSOR_RAW(763),
    MOTION_DETECT(764),
    LOCATION_GGA(765),
    RAW_SLEEP(DfuException.ERROR_OPCODE_RESPONSE_NOT_SUPPORTED),
    NO_DISTURB_GLOBAL(DfuException.ERROR_NOTIFICATION_NO_RESPONSE),
    GOLF_LOCATION(674),
    GOLF_SPORT_SWITCH(675),
    GOLF_WATCH_SCORE(676),
    GOLF_WATCH_VERSION(677),
    GOLF_WATCH_MAP_INFO(679),
    READ_CY_WEE_UUID(678),
    SAI_WEI_SPORT_LOCATION(690),
    HYDRATION_SET(692),
    MEETING_REMINDER_SET(693),
    IDENTITY(769),
    SESSION(770),
    NOTIFICATION(1025),
    MUSIC_CONTROL(1026),
    SCHEDULE(1027),
    WEATHER_REALTIME(1028),
    WEATHER_FORECAST(1029),
    HID(1030),
    WORLD_CLOCK(1031),
    STOCK(1032),
    SMS_QUICK_REPLY_CONTENT(IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT),
    NOTIFICATION2(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK),
    NEWS_FEED(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES),
    WEATHER_REALTIME2(1036),
    WEATHER_FORECAST2(IronSourceError.ERROR_IS_LOAD_DURING_SHOW),
    LOGIN_DAYS(IronSourceError.ERROR_RV_SHOW_EXCEPTION),
    TARGET_COMPLETION(IronSourceError.ERROR_IS_SHOW_EXCEPTION),
    AUDIO_TEXT(1040),
    WEATHER_REALTIME3(IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED),
    WEATHER_FORECAST3(IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED),
    CHAT_MESSAGE(IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES),
    CHAT_VOICE(IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES),
    CP_ANNIVERSARY(1046),
    CP_GIFTS_INFO(1047),
    CP_WEATHER_REALTIME(1048),
    CP_WEATHER_FORECAST(1049),
    CP_NOTIFICATION(1050),
    CP_DISTANCE(IronSourceError.ERROR_DO_IS_CALL_LOAD_BEFORE_SHOW),
    DATA_ALL(1535),
    ACTIVITY_REALTIME(1281),
    ACTIVITY(1282),
    HEART_RATE(1283),
    BLOOD_PRESSURE(1284),
    SLEEP(1285),
    WORKOUT(1286),
    LOCATION(1287),
    TEMPERATURE(1288),
    BLOOD_OXYGEN(1289),
    HRV(1290),
    LOG(1291),
    SLEEP_RAW_DATA(1292),
    PRESSURE(1293),
    WORKOUT2(1294),
    MATCH_RECORD(1295),
    BLOOD_GLUCOSE(1296),
    BODY_STATUS(1297),
    MIND_STATUS(1298),
    CALORIE_INTAKE(1299),
    FOOD_BALANCE(1300),
    BAC(1301),
    MATCH_RECORD2(1302),
    AVG_HEART_RATE(1303),
    ALIPAY_BIND_INFO(1304),
    RRI(1305),
    ECG(1312),
    HANBAO_VIBRATION(1313),
    SOS_CALL_LOG(1314),
    WORKOUT3(1315),
    WORKOUT4(1316),
    DAILY_POWER(1317),
    TRAINING_STATUS(1318),
    RESPIRATORY_RATE(1321),
    VITALITY(OOOi0.iX1O1),
    MATCH_RECORD3(1329),
    WORKOUT4_SEGMENTATION(1330),
    ENERGY_RATING(1331),
    ECG_V2(1332),
    CAMERA(1537),
    REQUEST_LOCATION(SubBinId.Bbpro.DSP_APP_IMAGE),
    INCOMING_CALL(SubBinId.Bbpro.DSP_SCENARIO2),
    APP_SPORT_STATE(1540),
    CLASSIC_BLUETOOTH_STATE(1541),
    DEVICE_SMS_QUICK_REPLY(1543),
    LOVE_TAP(1544),
    FACTORY_TEST(1545),
    DOUBLE_SCREEN(1546),
    BAC_CALIBRATION(1547),
    INCOMING_CALL_RING(1548),
    SPORT_END_NOTIFY(1549),
    FILE_PATH(1550),
    APP_OP(OOOi0.i0X000X0O),
    HANBAO_VIBRATION_STATE(1552),
    MEASUREMENT(1553),
    GAME_CONTROL(1554),
    APP_API_VERSION(OOOi0.i11I),
    DEVICE_OP(1556),
    RECEIVE_DEVICE_FILE(1557),
    AI_COMMAND(1558),
    SG_RGB_SET(1559),
    SG_SLEEP_SET(1560),
    SG_EQ_SET(OOOi0.XO0X10iO),
    SG_KEY_SET(1562),
    SG_CAMERA_SET(1563),
    IPC_STATE(1564),
    SG_KEYWORD_AWAKE(1565),
    IPC_WIFI_INFO(1566),
    AI_COACH_PLAN(OOOi0.Ii0X0X),
    WEAR_STATE(1568),
    SG_TEST(1569),
    LACTATE_THRESHOLD(OOOi0.XXiIiX10),
    CHAT_APP(1571),
    CP_LISTENER(1572),
    IPC_EXCEPTION(1574),
    IPC_OTA_STATE(1575),
    AI_COACH_PLAN_V2_READ(1576),
    MULTIPLE_FILES_CONTROLLER(1577),
    RECORD_CONTROL(1584),
    RECORD_AUDIO_SET(1585),
    CONTACT_US(1586),
    SG_SET(1587),
    SG_TTS(1588),
    ONGOING_DIALOGUE(1589),
    AUDIO_CONTROL(1590),
    VIBRATION_LIGHT_SET(1591),
    SLEEP_NOTIFY(1592),
    XMLY_BAND_SET(1595),
    BAND_KEY(1597),
    OFFLINE_ASR_SET(1599),
    WATCH_FACE(1793),
    AGPS_FILE(1794),
    FONT_FILE(1795),
    CONTACT(1796),
    UI_FILE(1797),
    DEVICE_FILE(1798),
    LANGUAGE_FILE(1799),
    BRAND_INFO_FILE(1800),
    QRCODE(1801),
    THIRD_PARTY_DATA(1802),
    QRCODE2(1803),
    LOGO_FILE(1804),
    OTA_FILE(1805),
    GPS_FIRMWARE_FILE(1806),
    CONTACT_SORT(1807),
    NAVI_IMAGE(1808),
    APP_FILE(1809),
    FAT_BIN_FILE(1810),
    AGPS_FILE2(1811),
    CP_CHAT(1812),
    CP_MISS_YOU(1813),
    CP_TODO(1814),
    CP_GALLERY(1815),
    CP_GIFTS(1816),
    CP_AVATAR(1817),
    AI_COACH_PLAN_V2(1820),
    FILE_TRANSFER(1819),
    GOLF_IMAGE(OOOi0.IO0iXO0O),
    GOLF_WATCH_UPDATE_MAP_INFO(OOOi0.XX00i10X),
    GOOGLE_NAVI_INFO(NewHope.SENDA_BYTES),
    SLEEP_DATA(1825),
    NONE(65535);

    private final int mKey;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    @SourceDebugExtension({"SMAP\nBleCommand.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleCommand.kt\ncom/szabh/smable3/BleKey$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,519:1\n1#2:520\n*E\n"})
    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0017  */
        /* JADX WARN: Code duplicated, block: B:12:0x001a A[RETURN] */
        @aa1
        public final BleKey OXO1(int i) {
            for (BleKey bleKey : BleKey.values()) {
                if (bleKey.getMKey() == i) {
                    if (bleKey == null) {
                        return BleKey.NONE;
                    }
                    return bleKey;
                }
            }
            bleKey = null;
            if (bleKey == null) {
                return BleKey.NONE;
            }
            return bleKey;
        }

        public OXO1() {
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[BleKey.values().length];
            try {
                iArr[BleKey.OTA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BleKey.XMODEM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BleKey.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BleKey.FIRMWARE_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BleKey.BLE_ADDRESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BleKey.UI_PACK_VERSION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BleKey.LANGUAGE_PACK_VERSION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BleKey.DEVICE_FILE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BleKey.RAW_SLEEP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BleKey.DEVICE_INFO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BleKey.PACKAGE_STATUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BleKey.DEVICE_LANGUAGES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BleKey.SDCARD_INFO.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BleKey.ACTIVITY_DETAIL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BleKey.EARPHONE_POWER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BleKey.EARPHONE_STATE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[BleKey.EARPHONE_INFO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[BleKey.GPS_FIRMWARE_VERSION.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[BleKey.NETWORK_FIRMWARE_VERSION.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[BleKey.GIRL_CARE_MONTHLY.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[BleKey.IPC_VERSION.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[BleKey.IPC_STORES_INFO.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[BleKey.SLEEP_QUALITY_SCORE.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[BleKey.RELAX_REMINDER.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[BleKey.POWER2.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[BleKey.IPC_INFO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[BleKey.TIME.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[BleKey.NOTIFICATION_REMINDER.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[BleKey.SLEEP_QUALITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[BleKey.TEMPERATURE_DETECTING.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[BleKey.SHUTDOWN.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[BleKey.APP_SPORT_DATA.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[BleKey.REAL_TIME_HEART_RATE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[BleKey.IBEACON_SET.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[BleKey.MAC_QRCODE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[BleKey.REAL_TIME_TEMPERATURE.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[BleKey.REAL_TIME_BLOOD_PRESSURE.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[BleKey.REALTIME_MEASUREMENT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[BleKey.BAC_SET.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[BleKey.HR_WARNING_SET.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[BleKey.SLEEP_MONITORING.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[BleKey.BT_NAME.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[BleKey.BAC_RESULT.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[BleKey.BAC_RESULT_SET.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[BleKey.MATCH_SET.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[BleKey.BLE_ADDRESS_SET.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[BleKey.NAVI_INFO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[BleKey.DEVICE_SPORT_DATA.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[BleKey.FIND_PHONE.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                iArr[BleKey.BW_NAVI_INFO.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                iArr[BleKey.CONNECT_REMINDER.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                iArr[BleKey.AIR_PRESSURE_CALIBRATION.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                iArr[BleKey.ECG_SET.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                iArr[BleKey.GIRL_CARE_MENSTRUATION_UPDATE.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                iArr[BleKey.HEALTH_INDEX.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                iArr[BleKey.WEAR_WAY.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                iArr[BleKey.FIND_EARPHONE.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                iArr[BleKey.TOUCH_SET.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                iArr[BleKey.RECORD_PACKET.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                iArr[BleKey.TEST_INFO_SET.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                iArr[BleKey.WARNING_SET.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                iArr[BleKey.VIDEO_CALL_INFO.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                iArr[BleKey.GOOGLE_NAVI_INFO.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                iArr[BleKey.TIME_ZONE.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                iArr[BleKey.USER_PROFILE.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                iArr[BleKey.STEP_GOAL.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                iArr[BleKey.BACK_LIGHT.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                iArr[BleKey.SEDENTARINESS.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                iArr[BleKey.NO_DISTURB_RANGE.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                iArr[BleKey.NO_DISTURB_GLOBAL.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                iArr[BleKey.VIBRATION.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                iArr[BleKey.GESTURE_WAKE.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                iArr[BleKey.HR_ASSIST_SLEEP.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                iArr[BleKey.HOUR_SYSTEM.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                iArr[BleKey.LANGUAGE.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                iArr[BleKey.ANTI_LOST.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                iArr[BleKey.HR_MONITORING.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                iArr[BleKey.AEROBIC_EXERCISE.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                iArr[BleKey.TEMPERATURE_UNIT.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                iArr[BleKey.DATE_FORMAT.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                iArr[BleKey.WATCH_FACE_SWITCH.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                iArr[BleKey.DRINK_WATER.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                iArr[BleKey.WATCHFACE_ID.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                iArr[BleKey.POWER_SAVE_MODE.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                iArr[BleKey.CALORIES_GOAL.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                iArr[BleKey.DISTANCE_GOAL.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                iArr[BleKey.SLEEP_GOAL.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                iArr[BleKey.UNIT_SET.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                iArr[BleKey.STANDBY_SET.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                iArr[BleKey.ALIPAY_SET.ordinal()] = 90;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                iArr[BleKey.SET_WATCH_PASSWORD.ordinal()] = 91;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                iArr[BleKey.SOS_SET.ordinal()] = 92;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                iArr[BleKey.GIRL_CARE.ordinal()] = 93;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                iArr[BleKey.GAME_TIME_REMINDER.ordinal()] = 94;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                iArr[BleKey.PRESSURE_TIMING_MEASUREMENT.ordinal()] = 95;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                iArr[BleKey.STANDBY_WATCH_FACE_SET.ordinal()] = 96;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                iArr[BleKey.DOUBLE_SCREEN.ordinal()] = 97;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                iArr[BleKey.BLOOD_OXYGEN_SET.ordinal()] = 98;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                iArr[BleKey.NOTIFICATION_REMINDER2.ordinal()] = 99;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                iArr[BleKey.FALL_SET.ordinal()] = 100;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                iArr[BleKey.INCOMING_CALL_RING.ordinal()] = 101;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                iArr[BleKey.NOTIFICATION_LIGHT_SCREEN_SET.ordinal()] = 102;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                iArr[BleKey.BLOOD_PRESSURE_CALIBRATION.ordinal()] = 103;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                iArr[BleKey.EARPHONE_ANC_SET.ordinal()] = 104;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                iArr[BleKey.EARPHONE_SOUND_EFFECTS_SET.ordinal()] = 105;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                iArr[BleKey.SCREEN_BRIGHTNESS_SET.ordinal()] = 106;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                iArr[BleKey.EARPHONE_CALL.ordinal()] = 107;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                iArr[BleKey.GOMORE_SET.ordinal()] = 108;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                iArr[BleKey.RING_VIBRATION_SET.ordinal()] = 109;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                iArr[BleKey.SPORT_DURATION_GOAL.ordinal()] = 110;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                iArr[BleKey.SOS_CONTACT.ordinal()] = 111;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                iArr[BleKey.CHECK_IN_EVERY_DAY.ordinal()] = 112;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                iArr[BleKey.GESTURE_WAKE2.ordinal()] = 113;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                iArr[BleKey.EARPHONE_KEY.ordinal()] = 114;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                iArr[BleKey.HANBAO_SET.ordinal()] = 115;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                iArr[BleKey.QIBLA_SET.ordinal()] = 116;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                iArr[BleKey.CALIBRATION_DATA.ordinal()] = 117;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                iArr[BleKey.DEVICE_UNIQUE_DATA_SET.ordinal()] = 118;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                iArr[BleKey.CP_USER_INFO.ordinal()] = 119;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                iArr[BleKey.HRV_SET.ordinal()] = 120;
            } catch (NoSuchFieldError unused120) {
            }
            try {
                iArr[BleKey.WATCHFACE_INDEX.ordinal()] = 121;
            } catch (NoSuchFieldError unused121) {
            }
            try {
                iArr[BleKey.ALARM.ordinal()] = 122;
            } catch (NoSuchFieldError unused122) {
            }
            try {
                iArr[BleKey.LOVE_TAP_USER.ordinal()] = 123;
            } catch (NoSuchFieldError unused123) {
            }
            try {
                iArr[BleKey.MEDICATION_REMINDER.ordinal()] = 124;
            } catch (NoSuchFieldError unused124) {
            }
            try {
                iArr[BleKey.MEDICATION_ALARM.ordinal()] = 125;
            } catch (NoSuchFieldError unused125) {
            }
            try {
                iArr[BleKey.COACHING.ordinal()] = 126;
            } catch (NoSuchFieldError unused126) {
            }
            try {
                iArr[BleKey.TUYA_KEY_SET.ordinal()] = 127;
            } catch (NoSuchFieldError unused127) {
            }
            try {
                iArr[BleKey.BATTERY_USAGE.ordinal()] = 128;
            } catch (NoSuchFieldError unused128) {
            }
            try {
                iArr[BleKey.DEVICE_LANGUAGES2.ordinal()] = 129;
            } catch (NoSuchFieldError unused129) {
            }
            try {
                iArr[BleKey.IDENTITY.ordinal()] = 130;
            } catch (NoSuchFieldError unused130) {
            }
            try {
                iArr[BleKey.NOTIFICATION.ordinal()] = 131;
            } catch (NoSuchFieldError unused131) {
            }
            try {
                iArr[BleKey.WEATHER_REALTIME.ordinal()] = 132;
            } catch (NoSuchFieldError unused132) {
            }
            try {
                iArr[BleKey.WEATHER_FORECAST.ordinal()] = 133;
            } catch (NoSuchFieldError unused133) {
            }
            try {
                iArr[BleKey.NOTIFICATION2.ordinal()] = 134;
            } catch (NoSuchFieldError unused134) {
            }
            try {
                iArr[BleKey.NEWS_FEED.ordinal()] = 135;
            } catch (NoSuchFieldError unused135) {
            }
            try {
                iArr[BleKey.WEATHER_REALTIME2.ordinal()] = 136;
            } catch (NoSuchFieldError unused136) {
            }
            try {
                iArr[BleKey.WEATHER_FORECAST2.ordinal()] = 137;
            } catch (NoSuchFieldError unused137) {
            }
            try {
                iArr[BleKey.LOGIN_DAYS.ordinal()] = 138;
            } catch (NoSuchFieldError unused138) {
            }
            try {
                iArr[BleKey.TARGET_COMPLETION.ordinal()] = 139;
            } catch (NoSuchFieldError unused139) {
            }
            try {
                iArr[BleKey.AUDIO_TEXT.ordinal()] = 140;
            } catch (NoSuchFieldError unused140) {
            }
            try {
                iArr[BleKey.WEATHER_REALTIME3.ordinal()] = 141;
            } catch (NoSuchFieldError unused141) {
            }
            try {
                iArr[BleKey.WEATHER_FORECAST3.ordinal()] = 142;
            } catch (NoSuchFieldError unused142) {
            }
            try {
                iArr[BleKey.CHAT_MESSAGE.ordinal()] = 143;
            } catch (NoSuchFieldError unused143) {
            }
            try {
                iArr[BleKey.CP_GIFTS_INFO.ordinal()] = 144;
            } catch (NoSuchFieldError unused144) {
            }
            try {
                iArr[BleKey.CP_ANNIVERSARY.ordinal()] = 145;
            } catch (NoSuchFieldError unused145) {
            }
            try {
                iArr[BleKey.CP_WEATHER_REALTIME.ordinal()] = 146;
            } catch (NoSuchFieldError unused146) {
            }
            try {
                iArr[BleKey.CP_WEATHER_FORECAST.ordinal()] = 147;
            } catch (NoSuchFieldError unused147) {
            }
            try {
                iArr[BleKey.CP_NOTIFICATION.ordinal()] = 148;
            } catch (NoSuchFieldError unused148) {
            }
            try {
                iArr[BleKey.CP_DISTANCE.ordinal()] = 149;
            } catch (NoSuchFieldError unused149) {
            }
            try {
                iArr[BleKey.SLEEP_NOTIFY.ordinal()] = 150;
            } catch (NoSuchFieldError unused150) {
            }
            try {
                iArr[BleKey.BAND_KEY.ordinal()] = 151;
            } catch (NoSuchFieldError unused151) {
            }
            try {
                iArr[BleKey.XMLY_BAND_SET.ordinal()] = 152;
            } catch (NoSuchFieldError unused152) {
            }
            try {
                iArr[BleKey.SCHEDULE.ordinal()] = 153;
            } catch (NoSuchFieldError unused153) {
            }
            try {
                iArr[BleKey.SMS_QUICK_REPLY_CONTENT.ordinal()] = 154;
            } catch (NoSuchFieldError unused154) {
            }
            try {
                iArr[BleKey.HID.ordinal()] = 155;
            } catch (NoSuchFieldError unused155) {
            }
            try {
                iArr[BleKey.WORLD_CLOCK.ordinal()] = 156;
            } catch (NoSuchFieldError unused156) {
            }
            try {
                iArr[BleKey.STOCK.ordinal()] = 157;
            } catch (NoSuchFieldError unused157) {
            }
            try {
                iArr[BleKey.DATA_ALL.ordinal()] = 158;
            } catch (NoSuchFieldError unused158) {
            }
            try {
                iArr[BleKey.ACTIVITY_REALTIME.ordinal()] = 159;
            } catch (NoSuchFieldError unused159) {
            }
            try {
                iArr[BleKey.ACTIVITY.ordinal()] = 160;
            } catch (NoSuchFieldError unused160) {
            }
            try {
                iArr[BleKey.HEART_RATE.ordinal()] = 161;
            } catch (NoSuchFieldError unused161) {
            }
            try {
                iArr[BleKey.BLOOD_PRESSURE.ordinal()] = 162;
            } catch (NoSuchFieldError unused162) {
            }
            try {
                iArr[BleKey.SLEEP.ordinal()] = 163;
            } catch (NoSuchFieldError unused163) {
            }
            try {
                iArr[BleKey.WORKOUT.ordinal()] = 164;
            } catch (NoSuchFieldError unused164) {
            }
            try {
                iArr[BleKey.LOCATION.ordinal()] = 165;
            } catch (NoSuchFieldError unused165) {
            }
            try {
                iArr[BleKey.TEMPERATURE.ordinal()] = 166;
            } catch (NoSuchFieldError unused166) {
            }
            try {
                iArr[BleKey.BLOOD_OXYGEN.ordinal()] = 167;
            } catch (NoSuchFieldError unused167) {
            }
            try {
                iArr[BleKey.HRV.ordinal()] = 168;
            } catch (NoSuchFieldError unused168) {
            }
            try {
                iArr[BleKey.LOG.ordinal()] = 169;
            } catch (NoSuchFieldError unused169) {
            }
            try {
                iArr[BleKey.SLEEP_RAW_DATA.ordinal()] = 170;
            } catch (NoSuchFieldError unused170) {
            }
            try {
                iArr[BleKey.PRESSURE.ordinal()] = 171;
            } catch (NoSuchFieldError unused171) {
            }
            try {
                iArr[BleKey.WORKOUT2.ordinal()] = 172;
            } catch (NoSuchFieldError unused172) {
            }
            try {
                iArr[BleKey.BLOOD_GLUCOSE.ordinal()] = 173;
            } catch (NoSuchFieldError unused173) {
            }
            try {
                iArr[BleKey.BODY_STATUS.ordinal()] = 174;
            } catch (NoSuchFieldError unused174) {
            }
            try {
                iArr[BleKey.MIND_STATUS.ordinal()] = 175;
            } catch (NoSuchFieldError unused175) {
            }
            try {
                iArr[BleKey.CALORIE_INTAKE.ordinal()] = 176;
            } catch (NoSuchFieldError unused176) {
            }
            try {
                iArr[BleKey.FOOD_BALANCE.ordinal()] = 177;
            } catch (NoSuchFieldError unused177) {
            }
            try {
                iArr[BleKey.BAC.ordinal()] = 178;
            } catch (NoSuchFieldError unused178) {
            }
            try {
                iArr[BleKey.MATCH_RECORD2.ordinal()] = 179;
            } catch (NoSuchFieldError unused179) {
            }
            try {
                iArr[BleKey.AVG_HEART_RATE.ordinal()] = 180;
            } catch (NoSuchFieldError unused180) {
            }
            try {
                iArr[BleKey.ALIPAY_BIND_INFO.ordinal()] = 181;
            } catch (NoSuchFieldError unused181) {
            }
            try {
                iArr[BleKey.RRI.ordinal()] = 182;
            } catch (NoSuchFieldError unused182) {
            }
            try {
                iArr[BleKey.ECG.ordinal()] = 183;
            } catch (NoSuchFieldError unused183) {
            }
            try {
                iArr[BleKey.HANBAO_VIBRATION.ordinal()] = 184;
            } catch (NoSuchFieldError unused184) {
            }
            try {
                iArr[BleKey.SOS_CALL_LOG.ordinal()] = 185;
            } catch (NoSuchFieldError unused185) {
            }
            try {
                iArr[BleKey.WORKOUT3.ordinal()] = 186;
            } catch (NoSuchFieldError unused186) {
            }
            try {
                iArr[BleKey.WORKOUT4.ordinal()] = 187;
            } catch (NoSuchFieldError unused187) {
            }
            try {
                iArr[BleKey.DAILY_POWER.ordinal()] = 188;
            } catch (NoSuchFieldError unused188) {
            }
            try {
                iArr[BleKey.TRAINING_STATUS.ordinal()] = 189;
            } catch (NoSuchFieldError unused189) {
            }
            try {
                iArr[BleKey.RESPIRATORY_RATE.ordinal()] = 190;
            } catch (NoSuchFieldError unused190) {
            }
            try {
                iArr[BleKey.MATCH_RECORD3.ordinal()] = 191;
            } catch (NoSuchFieldError unused191) {
            }
            try {
                iArr[BleKey.CAMERA.ordinal()] = 192;
            } catch (NoSuchFieldError unused192) {
            }
            try {
                iArr[BleKey.REQUEST_LOCATION.ordinal()] = 193;
            } catch (NoSuchFieldError unused193) {
            }
            try {
                iArr[BleKey.DEVICE_SMS_QUICK_REPLY.ordinal()] = 194;
            } catch (NoSuchFieldError unused194) {
            }
            try {
                iArr[BleKey.INCOMING_CALL.ordinal()] = 195;
            } catch (NoSuchFieldError unused195) {
            }
            try {
                iArr[BleKey.APP_SPORT_STATE.ordinal()] = 196;
            } catch (NoSuchFieldError unused196) {
            }
            try {
                iArr[BleKey.LOVE_TAP.ordinal()] = 197;
            } catch (NoSuchFieldError unused197) {
            }
            try {
                iArr[BleKey.FACTORY_TEST.ordinal()] = 198;
            } catch (NoSuchFieldError unused198) {
            }
            try {
                iArr[BleKey.SPORT_END_NOTIFY.ordinal()] = 199;
            } catch (NoSuchFieldError unused199) {
            }
            try {
                iArr[BleKey.HANBAO_VIBRATION_STATE.ordinal()] = 200;
            } catch (NoSuchFieldError unused200) {
            }
            try {
                iArr[BleKey.MEASUREMENT.ordinal()] = 201;
            } catch (NoSuchFieldError unused201) {
            }
            try {
                iArr[BleKey.GAME_CONTROL.ordinal()] = 202;
            } catch (NoSuchFieldError unused202) {
            }
            try {
                iArr[BleKey.VIBRATION_V2.ordinal()] = 203;
            } catch (NoSuchFieldError unused203) {
            }
            try {
                iArr[BleKey.DEVICE_OP.ordinal()] = 204;
            } catch (NoSuchFieldError unused204) {
            }
            try {
                iArr[BleKey.RECEIVE_DEVICE_FILE.ordinal()] = 205;
            } catch (NoSuchFieldError unused205) {
            }
            try {
                iArr[BleKey.AI_COMMAND.ordinal()] = 206;
            } catch (NoSuchFieldError unused206) {
            }
            try {
                iArr[BleKey.SG_RGB_SET.ordinal()] = 207;
            } catch (NoSuchFieldError unused207) {
            }
            try {
                iArr[BleKey.SG_SLEEP_SET.ordinal()] = 208;
            } catch (NoSuchFieldError unused208) {
            }
            try {
                iArr[BleKey.SG_EQ_SET.ordinal()] = 209;
            } catch (NoSuchFieldError unused209) {
            }
            try {
                iArr[BleKey.SG_KEY_SET.ordinal()] = 210;
            } catch (NoSuchFieldError unused210) {
            }
            try {
                iArr[BleKey.SG_KEYWORD_AWAKE.ordinal()] = 211;
            } catch (NoSuchFieldError unused211) {
            }
            try {
                iArr[BleKey.CP_LISTENER.ordinal()] = 212;
            } catch (NoSuchFieldError unused212) {
            }
            try {
                iArr[BleKey.IPC_WIFI_INFO.ordinal()] = 213;
            } catch (NoSuchFieldError unused213) {
            }
            try {
                iArr[BleKey.IPC_EXCEPTION.ordinal()] = 214;
            } catch (NoSuchFieldError unused214) {
            }
            try {
                iArr[BleKey.IPC_OTA_STATE.ordinal()] = 215;
            } catch (NoSuchFieldError unused215) {
            }
            try {
                iArr[BleKey.RECORD_CONTROL.ordinal()] = 216;
            } catch (NoSuchFieldError unused216) {
            }
            try {
                iArr[BleKey.RECORD_AUDIO_SET.ordinal()] = 217;
            } catch (NoSuchFieldError unused217) {
            }
            try {
                iArr[BleKey.ACTIVITY_RECOGNIYION.ordinal()] = 218;
            } catch (NoSuchFieldError unused218) {
            }
            try {
                iArr[BleKey.VIBRATION_LIGHT_SET.ordinal()] = 219;
            } catch (NoSuchFieldError unused219) {
            }
            try {
                iArr[BleKey.CLASSIC_BLUETOOTH_STATE.ordinal()] = 220;
            } catch (NoSuchFieldError unused220) {
            }
            try {
                iArr[BleKey.APP_OP.ordinal()] = 221;
            } catch (NoSuchFieldError unused221) {
            }
            try {
                iArr[BleKey.IPC_STATE.ordinal()] = 222;
            } catch (NoSuchFieldError unused222) {
            }
            try {
                iArr[BleKey.AI_COACH_PLAN.ordinal()] = 223;
            } catch (NoSuchFieldError unused223) {
            }
            try {
                iArr[BleKey.FILE_PATH.ordinal()] = 224;
            } catch (NoSuchFieldError unused224) {
            }
            try {
                iArr[BleKey.APP_API_VERSION.ordinal()] = 225;
            } catch (NoSuchFieldError unused225) {
            }
            try {
                iArr[BleKey.WATCH_FACE.ordinal()] = 226;
            } catch (NoSuchFieldError unused226) {
            }
            try {
                iArr[BleKey.FILE_TRANSFER.ordinal()] = 227;
            } catch (NoSuchFieldError unused227) {
            }
            try {
                iArr[BleKey.AGPS_FILE.ordinal()] = 228;
            } catch (NoSuchFieldError unused228) {
            }
            try {
                iArr[BleKey.FONT_FILE.ordinal()] = 229;
            } catch (NoSuchFieldError unused229) {
            }
            try {
                iArr[BleKey.UI_FILE.ordinal()] = 230;
            } catch (NoSuchFieldError unused230) {
            }
            try {
                iArr[BleKey.LANGUAGE_FILE.ordinal()] = 231;
            } catch (NoSuchFieldError unused231) {
            }
            try {
                iArr[BleKey.BRAND_INFO_FILE.ordinal()] = 232;
            } catch (NoSuchFieldError unused232) {
            }
            try {
                iArr[BleKey.QRCODE.ordinal()] = 233;
            } catch (NoSuchFieldError unused233) {
            }
            try {
                iArr[BleKey.THIRD_PARTY_DATA.ordinal()] = 234;
            } catch (NoSuchFieldError unused234) {
            }
            try {
                iArr[BleKey.QRCODE2.ordinal()] = 235;
            } catch (NoSuchFieldError unused235) {
            }
            try {
                iArr[BleKey.LOGO_FILE.ordinal()] = 236;
            } catch (NoSuchFieldError unused236) {
            }
            try {
                iArr[BleKey.OTA_FILE.ordinal()] = 237;
            } catch (NoSuchFieldError unused237) {
            }
            try {
                iArr[BleKey.GPS_FIRMWARE_FILE.ordinal()] = 238;
            } catch (NoSuchFieldError unused238) {
            }
            try {
                iArr[BleKey.CONTACT_SORT.ordinal()] = 239;
            } catch (NoSuchFieldError unused239) {
            }
            try {
                iArr[BleKey.NAVI_IMAGE.ordinal()] = 240;
            } catch (NoSuchFieldError unused240) {
            }
            try {
                iArr[BleKey.APP_FILE.ordinal()] = 241;
            } catch (NoSuchFieldError unused241) {
            }
            try {
                iArr[BleKey.FAT_BIN_FILE.ordinal()] = 242;
            } catch (NoSuchFieldError unused242) {
            }
            try {
                iArr[BleKey.AGPS_FILE2.ordinal()] = 243;
            } catch (NoSuchFieldError unused243) {
            }
            try {
                iArr[BleKey.CP_CHAT.ordinal()] = 244;
            } catch (NoSuchFieldError unused244) {
            }
            try {
                iArr[BleKey.CP_MISS_YOU.ordinal()] = 245;
            } catch (NoSuchFieldError unused245) {
            }
            try {
                iArr[BleKey.CP_TODO.ordinal()] = 246;
            } catch (NoSuchFieldError unused246) {
            }
            try {
                iArr[BleKey.CP_GALLERY.ordinal()] = 247;
            } catch (NoSuchFieldError unused247) {
            }
            try {
                iArr[BleKey.CP_GIFTS.ordinal()] = 248;
            } catch (NoSuchFieldError unused248) {
            }
            try {
                iArr[BleKey.CP_AVATAR.ordinal()] = 249;
            } catch (NoSuchFieldError unused249) {
            }
            try {
                iArr[BleKey.AI_COACH_PLAN_V2.ordinal()] = 250;
            } catch (NoSuchFieldError unused250) {
            }
            try {
                iArr[BleKey.SLEEP_DATA.ordinal()] = 251;
            } catch (NoSuchFieldError unused251) {
            }
            try {
                iArr[BleKey.CONTACT.ordinal()] = 252;
            } catch (NoSuchFieldError unused252) {
            }
            OXO1 = iArr;
        }
    }

    BleKey(int i) {
        this.mKey = i;
    }

    @aa1
    public static EnumEntries<BleKey> getEntries() {
        return $ENTRIES;
    }

    @aa1
    public final List<BleKeyFlag> getBleKeyFlags() {
        switch (XIi00iiXO.OXO1[ordinal()]) {
            case 1:
            case 2:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
                return X0iO1XX.I0iXXO(BleKeyFlag.READ);
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 102:
            case 103:
            case 104:
            case 105:
            case 106:
            case 107:
            case 108:
            case 109:
            case 110:
            case 111:
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 121:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 122:
            case 123:
            case 124:
            case 125:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.RESET);
            case 126:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 127:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.DELETE);
            case 128:
            case 129:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.READ, BleKeyFlag.DELETE);
            case 130:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.READ, BleKeyFlag.DELETE, BleKeyFlag.UPDATE);
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case 152:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 153:
            case 154:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE);
            case 155:
                return X0iO1XX.I0iXXO(BleKeyFlag.READ);
            case 156:
            case 157:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ, BleKeyFlag.RESET);
            case 158:
            case 159:
                return X0iO1XX.I0iXXO(BleKeyFlag.READ);
            case 160:
            case 161:
            case 162:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
            case 185:
            case 186:
            case 187:
            case 188:
            case 189:
            case 190:
            case 191:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.READ, BleKeyFlag.DELETE);
            case 192:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case 193:
            case 194:
                return X0iO1XX.I0iXXO(BleKeyFlag.CREATE);
            case 195:
            case 196:
            case 197:
            case 198:
            case 199:
            case 200:
            case 201:
            case 202:
            case 203:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case 220:
            case 221:
            case 222:
            case 223:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 224:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.CREATE, BleKeyFlag.DELETE, BleKeyFlag.UPDATE, BleKeyFlag.READ);
            case 225:
                return X0iO1XX.I0iXXO(BleKeyFlag.READ);
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case Command.CMD_PHONE_NUMBER_PLAY_MODE /* 241 */:
            case Command.CMD_NOTIFY_FILE_STRUCTURE_CHANGE /* 242 */:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case IOiOOI0.O10IXXX0X /* 251 */:
                return X0iO1XX.I0iXXO(BleKeyFlag.UPDATE);
            case IOiOOI0.X0O /* 252 */:
                return CollectionsKt__CollectionsKt.iXiX011(BleKeyFlag.READ, BleKeyFlag.UPDATE);
            default:
                return CollectionsKt__CollectionsKt.m39402iI();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001b  */
    /* JADX WARN: Code duplicated, block: B:12:0x001e A[RETURN] */
    @aa1
    public final BleCommand getMBleCommand() {
        for (BleCommand bleCommand : BleCommand.values()) {
            if (bleCommand.getMBleCommand() == (this.mKey >>> 8)) {
                if (bleCommand == null) {
                    return BleCommand.NONE;
                }
                return bleCommand;
            }
        }
        bleCommand = null;
        if (bleCommand == null) {
            return BleCommand.NONE;
        }
        return bleCommand;
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
        return this == ALARM || this == SCHEDULE || this == COACHING || this == WORLD_CLOCK || this == STOCK || this == SMS_QUICK_REPLY_CONTENT || this == LOVE_TAP_USER || this == MEDICATION_REMINDER || this == MEDICATION_ALARM;
    }

    @Override // java.lang.Enum
    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%04X_", Arrays.copyOf(new Object[]{Integer.valueOf(this.mKey)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(name());
        return sb.toString();
    }
}
