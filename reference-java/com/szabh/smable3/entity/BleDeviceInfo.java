package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2229at;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.baseble.data.BleReadable;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.szabh.smable3.BleKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nBleDeviceInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BleDeviceInfo.kt\ncom/szabh/smable3/entity/BleDeviceInfo\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1714:1\n1563#2:1715\n1634#2,3:1716\n1563#2:1719\n1634#2,3:1720\n*S KotlinDebug\n*F\n+ 1 BleDeviceInfo.kt\ncom/szabh/smable3/entity/BleDeviceInfo\n*L\n859#1:1715\n859#1:1716,3\n1035#1:1719\n1035#1:1720,3\n*E\n"})
public final class BleDeviceInfo extends BleReadable {
    public static final int AGPS_6228 = 9;
    public static final int AGPS_AGNSS = 6;
    public static final int AGPS_EPO = 1;
    public static final int AGPS_EPO2 = 7;
    public static final int AGPS_LTO = 8;
    public static final int AGPS_NONE = 0;
    public static final int AGPS_S10 = 10;
    public static final int AGPS_UBLOX = 2;
    public static final int ANTI_LOST_HIDE = 0;
    public static final int ANTI_LOST_VISIBLE = 1;
    public static final int BLOCK_SWIMMING_REMINDERS_0 = 0;
    public static final int BLOCK_SWIMMING_REMINDERS_1 = 1;

    @aa1
    public static final Companion Companion = new Companion(null);
    public static final int DIGITAL_POWER_HIDE = 1;
    public static final int DIGITAL_POWER_VISIBLE = 0;

    @aa1
    public static final String ENERGY = "Energy";

    @aa1
    public static final String PLATFORM_ATS = "ATS";

    @aa1
    public static final String PLATFORM_BK = "BK";

    @aa1
    public static final String PLATFORM_GOODIX = "Goodix";

    @aa1
    public static final String PLATFORM_JL = "JL";

    @aa1
    public static final String PLATFORM_JL707 = "JL707";

    @aa1
    public static final String PLATFORM_JL707LITE = "JL707Lite";

    @aa1
    public static final String PLATFORM_MTK = "MTK";

    @aa1
    public static final String PLATFORM_NORDIC = "Nordic";

    @aa1
    public static final String PLATFORM_REALTEK = "Realtek";

    @aa1
    public static final String PLATFORM_SIFLI = "SIFLI";

    @aa1
    public static final String PLATFORM_ZKLX = "ZKLX";

    @aa1
    public static final String PROTOTYPE_10G = "SMA-10G";

    @aa1
    public static final String PROTOTYPE_A7 = "A7";

    @aa1
    public static final String PROTOTYPE_A8 = "A8";

    @aa1
    public static final String PROTOTYPE_A8_ULTRA_PRO = "A8_Ultra_Pro";

    @aa1
    public static final String PROTOTYPE_A9MINI = "A9mini";

    @aa1
    public static final String PROTOTYPE_AC05E_S1838B = "AC05E_S1838B";

    @aa1
    public static final String PROTOTYPE_AM01 = "AM01";

    @aa1
    public static final String PROTOTYPE_AM01J = "AM01J";

    @aa1
    public static final String PROTOTYPE_AM02J = "AM02J";

    @aa1
    public static final String PROTOTYPE_AM05 = "AM05";

    @aa1
    public static final String PROTOTYPE_AM08 = "AM08";

    @aa1
    public static final String PROTOTYPE_AM11 = "AM11";

    @aa1
    public static final String PROTOTYPE_AM22 = "AM22";

    @aa1
    public static final String PROTOTYPE_AM23_PRO = "AM23Pro";

    @aa1
    public static final String PROTOTYPE_AM25 = "AM25";

    @aa1
    public static final String PROTOTYPE_AM36 = "AM36";

    @aa1
    public static final String PROTOTYPE_AW37 = "AW37";

    @aa1
    public static final String PROTOTYPE_B10 = "B10";

    @aa1
    public static final String PROTOTYPE_B5CRT = "SMA-B5CRT";

    @aa1
    public static final String PROTOTYPE_B9 = "B9";

    @aa1
    public static final String PROTOTYPE_B9C_JL = "B9C_JL";

    @aa1
    public static final String PROTOTYPE_BC01 = "BC01";

    @aa1
    public static final String PROTOTYPE_BK01_G01 = "BK01_G01";

    @aa1
    public static final String PROTOTYPE_C31 = "C31";

    @aa1
    public static final String PROTOTYPE_EXPLORER = "Explorer";

    @aa1
    public static final String PROTOTYPE_F1 = "SMA-F1";

    @aa1
    public static final String PROTOTYPE_F11 = "F11";

    @aa1
    public static final String PROTOTYPE_F12 = "F12";

    @aa1
    public static final String PROTOTYPE_F12PRO = "F12Pro";

    @aa1
    public static final String PROTOTYPE_F13 = "SMA-F13";

    @aa1
    public static final String PROTOTYPE_F13A = "F13A";

    @aa1
    public static final String PROTOTYPE_F13B = "F13B";

    @aa1
    public static final String PROTOTYPE_F13J = "F13J";

    @aa1
    public static final String PROTOTYPE_F17 = "F17";

    @aa1
    public static final String PROTOTYPE_F1N = "SMA-F1N";

    @aa1
    public static final String PROTOTYPE_F1RT = "SMA-F1RT";

    @aa1
    public static final String PROTOTYPE_F1_DK = "F1";

    @aa1
    public static final String PROTOTYPE_F2 = "SMA-F2";

    @aa1
    public static final String PROTOTYPE_F2D = "SMA-F2D";

    @aa1
    public static final String PROTOTYPE_F2K = "F2K";

    @aa1
    public static final String PROTOTYPE_F2PRO = "F2Pro";

    @aa1
    public static final String PROTOTYPE_F2R = "SMA-F2R";

    @aa1
    public static final String PROTOTYPE_F2R_DK = "F2R";

    @aa1
    public static final String PROTOTYPE_F3 = "F3";

    @aa1
    public static final String PROTOTYPE_F35 = "F35";

    @aa1
    public static final String PROTOTYPE_F36 = "F36";

    @aa1
    public static final String PROTOTYPE_F36PRO = "F36Pro";

    @aa1
    public static final String PROTOTYPE_F3C = "SMA-F3C";

    @aa1
    public static final String PROTOTYPE_F3R = "SMA-F3R";

    @aa1
    public static final String PROTOTYPE_F3_LH = "F3-LH";

    @aa1
    public static final String PROTOTYPE_F5 = "F5";

    @aa1
    public static final String PROTOTYPE_F6 = "F6";

    @aa1
    public static final String PROTOTYPE_F7 = "F7";

    @aa1
    public static final String PROTOTYPE_FA86 = "SMA_FA_86";

    @aa1
    public static final String PROTOTYPE_FC1 = "FC1";

    @aa1
    public static final String PROTOTYPE_FC2 = "FC2";

    @aa1
    public static final String PROTOTYPE_FT5 = "FT5";

    @aa1
    public static final String PROTOTYPE_GB1 = "GB1";

    @aa1
    public static final String PROTOTYPE_GTM5 = "SMA-GTM5";

    @aa1
    public static final String PROTOTYPE_HW01 = "HW01";

    @aa1
    public static final String PROTOTYPE_JX621D = "JX621D";

    @aa1
    public static final String PROTOTYPE_K10 = "K10";

    @aa1
    public static final String PROTOTYPE_K18 = "K18";

    @aa1
    public static final String PROTOTYPE_K30 = "K30";

    @aa1
    public static final String PROTOTYPE_LG19T = "SMA-LG19T";

    @aa1
    public static final String PROTOTYPE_M100 = "M100";

    @aa1
    public static final String PROTOTYPE_M3 = "M3";

    @aa1
    public static final String PROTOTYPE_M4 = "M4";

    @aa1
    public static final String PROTOTYPE_M4C = "M4C";

    @aa1
    public static final String PROTOTYPE_M4S = "M4S";

    @aa1
    public static final String PROTOTYPE_M5C = "M5C";

    @aa1
    public static final String PROTOTYPE_M6 = "M6";

    @aa1
    public static final String PROTOTYPE_M6C = "M6C";

    @aa1
    public static final String PROTOTYPE_M7 = "M7";

    @aa1
    public static final String PROTOTYPE_M7C = "M7C";

    @aa1
    public static final String PROTOTYPE_M7S = "M7S";

    @aa1
    public static final String PROTOTYPE_MATCH_S1 = "Match_S1";

    @aa1
    public static final String PROTOTYPE_MC11 = "SMA_MC_11";

    @aa1
    public static final String PROTOTYPE_ND08 = "SMA-ND08";

    @aa1
    public static final String PROTOTYPE_ND09 = "SMA-ND09";

    @aa1
    public static final String PROTOTYPE_NY58 = "NY58";

    @aa1
    public static final String PROTOTYPE_R10 = "R10";

    @aa1
    public static final String PROTOTYPE_R10PRO = "R10Pro";

    @aa1
    public static final String PROTOTYPE_R11 = "R11";

    @aa1
    public static final String PROTOTYPE_R11S = "R11S";

    @aa1
    public static final String PROTOTYPE_R1386 = "R1386";

    @aa1
    public static final String PROTOTYPE_R16 = "R16";

    @aa1
    public static final String PROTOTYPE_R2 = "R2";

    @aa1
    public static final String PROTOTYPE_R3H = "R3H";

    @aa1
    public static final String PROTOTYPE_R3PRO = "R3Pro";

    @aa1
    public static final String PROTOTYPE_R3Q = "R3Q";

    @aa1
    public static final String PROTOTYPE_R4 = "SMA-R4";

    @aa1
    public static final String PROTOTYPE_R5 = "SMA-R5";

    @aa1
    public static final String PROTOTYPE_R6_PRO_DK = "R6_PRO_DK";

    @aa1
    public static final String PROTOTYPE_R7 = "SMA-R7";

    @aa1
    public static final String PROTOTYPE_R9 = "R9";

    @aa1
    public static final String PROTOTYPE_R9J = "R9J";

    @aa1
    public static final String PROTOTYPE_REALTEK_GTM5 = "REALTEK_GTM5";

    @aa1
    public static final String PROTOTYPE_RN01 = "RN01";

    @aa1
    public static final String PROTOTYPE_S03 = "SMA_S03";

    @aa1
    public static final String PROTOTYPE_S10 = "S10";

    @aa1
    public static final String PROTOTYPE_S13 = "S13";

    @aa1
    public static final String PROTOTYPE_S14 = "S14";

    @aa1
    public static final String PROTOTYPE_S2 = "S2";

    @aa1
    public static final String PROTOTYPE_S4 = "S4";

    @aa1
    public static final String PROTOTYPE_SF12 = "SF12";

    @aa1
    public static final String PROTOTYPE_SF15GUC = "SF15GUC";

    @aa1
    public static final String PROTOTYPE_SG02G = "SG02G";

    @aa1
    public static final String PROTOTYPE_SG02J = "SG02J";

    @aa1
    public static final String PROTOTYPE_SG02W = "SG02W";

    @aa1
    public static final String PROTOTYPE_SG03J = "SG03J";

    @aa1
    public static final String PROTOTYPE_SG_S1 = "SG_S1";

    @aa1
    public static final String PROTOTYPE_SG_S2 = "SG_S2";

    @aa1
    public static final String PROTOTYPE_SPORT4 = "Sport4";

    @aa1
    public static final String PROTOTYPE_SW01 = "SMA-SW01";

    @aa1
    public static final String PROTOTYPE_T78 = "T78";

    @aa1
    public static final String PROTOTYPE_UB6_MINI = "UB6Mini";

    @aa1
    public static final String PROTOTYPE_UB6_PRO = "UB6Pro";

    @aa1
    public static final String PROTOTYPE_V1 = "SMA-V1";

    @aa1
    public static final String PROTOTYPE_V2 = "V2";

    @aa1
    public static final String PROTOTYPE_V3 = "V3";

    @aa1
    public static final String PROTOTYPE_V5 = "V5";

    @aa1
    public static final String PROTOTYPE_V61 = "V61";

    @aa1
    public static final String PROTOTYPE_VJ02G = "VJ02G";

    @aa1
    public static final String PROTOTYPE_VJ02G_G08 = "VJ02G_G08";

    @aa1
    public static final String PROTOTYPE_W9 = "W9";

    @aa1
    public static final String PROTOTYPE_WS001 = "WS001";

    @aa1
    public static final String PROTOTYPE_X2 = "X2";

    @aa1
    public static final String PROTOTYPE_X3 = "X3";

    @aa1
    public static final String PROTOTYPE_X5L = "X5L";

    @aa1
    public static final String PROTOTYPE_X6 = "X6";

    @aa1
    public static final String PROTOTYPE_Y1 = "Y1";

    @aa1
    public static final String PROTOTYPE_Y2 = "Y2";

    @aa1
    public static final String PROTOTYPE_Y3 = "Y3";

    @aa1
    public static final String RAW_NAME_SEPARATOR = "<>";
    public static final int SUPPORT_2D_ACCELERATION_0 = 0;
    public static final int SUPPORT_2D_ACCELERATION_1 = 1;
    public static final int SUPPORT_ACTIVITY_RECOGNITION_0 = 0;
    public static final int SUPPORT_ACTIVITY_RECOGNITION_1 = 1;
    public static final int SUPPORT_AI_COACH_0 = 0;
    public static final int SUPPORT_AI_COACH_1 = 1;
    public static final int SUPPORT_AI_COACH_V2_0 = 0;
    public static final int SUPPORT_AI_COACH_V2_1 = 1;
    public static final int SUPPORT_AI_TRANSLATION_0 = 0;
    public static final int SUPPORT_AI_TRANSLATION_1 = 1;
    public static final int SUPPORT_ALIPAY_0 = 0;
    public static final int SUPPORT_ALIPAY_1 = 1;
    public static final int SUPPORT_APP_PUSH_SWITCH_3_0 = 0;
    public static final int SUPPORT_APP_PUSH_SWITCH_3_1 = 1;
    public static final int SUPPORT_APP_PUSH_V2_0 = 0;
    public static final int SUPPORT_APP_PUSH_V2_1 = 1;
    public static final int SUPPORT_APP_SPORT_0 = 0;
    public static final int SUPPORT_APP_SPORT_1 = 1;
    public static final int SUPPORT_APP_STORE_0 = 0;
    public static final int SUPPORT_APP_STORE_1 = 1;
    public static final int SUPPORT_AUDIO_BOOKS_0 = 0;
    public static final int SUPPORT_AUDIO_BOOKS_1 = 1;
    public static final int SUPPORT_A_MAP_OFF_LINE_MAP_0 = 0;
    public static final int SUPPORT_A_MAP_OFF_LINE_MAP_1 = 1;
    public static final int SUPPORT_BATTERY_USAGE_0 = 0;
    public static final int SUPPORT_BATTERY_USAGE_1 = 1;
    public static final int SUPPORT_BLOOD_OXYGEN_0 = 0;
    public static final int SUPPORT_BLOOD_OXYGEN_1 = 1;
    public static final int SUPPORT_BLOOD_PRESSURE_CALIBRATION_0 = 0;
    public static final int SUPPORT_BLOOD_PRESSURE_CALIBRATION_1 = 1;
    public static final int SUPPORT_CHANGE_CLASSIC_BLUETOOTH_STATE_0 = 0;
    public static final int SUPPORT_CHANGE_CLASSIC_BLUETOOTH_STATE_1 = 1;
    public static final int SUPPORT_CHARGE_WHILE_USING_0 = 0;
    public static final int SUPPORT_CHARGE_WHILE_USING_1 = 1;
    public static final int SUPPORT_CONNECT_REMINDER_0 = 0;
    public static final int SUPPORT_CONNECT_REMINDER_1 = 1;
    public static final int SUPPORT_CONTACT_SORT_0 = 0;
    public static final int SUPPORT_CONTACT_SORT_1 = 1;
    public static final int SUPPORT_CROSS_APP_TRANSLATION_0 = 0;
    public static final int SUPPORT_CROSS_APP_TRANSLATION_1 = 1;
    public static final int SUPPORT_CUSTOM_LOGO_0 = 0;
    public static final int SUPPORT_CUSTOM_LOGO_1 = 1;
    public static final int SUPPORT_CYWEE_ALGORITHM_0 = 0;
    public static final int SUPPORT_CYWEE_ALGORITHM_1 = 1;
    public static final int SUPPORT_CYWEE_ALGORITHM_GPS_PUSH_0 = 0;
    public static final int SUPPORT_CYWEE_ALGORITHM_GPS_PUSH_1 = 1;
    public static final int SUPPORT_DATE_FORMAT_0 = 0;
    public static final int SUPPORT_DATE_FORMAT_1 = 1;
    public static final int SUPPORT_DEVICE_SPORT_DATA_0 = 0;
    public static final int SUPPORT_DEVICE_SPORT_DATA_1 = 1;
    public static final int SUPPORT_DOUBLE_SCREEN_0 = 0;
    public static final int SUPPORT_DOUBLE_SCREEN_1 = 1;
    public static final int SUPPORT_DRINK_WATER_0 = 0;
    public static final int SUPPORT_DRINK_WATER_1 = 1;
    public static final int SUPPORT_EBOOK_TRANSFER_0 = 0;
    public static final int SUPPORT_EBOOK_TRANSFER_1 = 1;
    public static final int SUPPORT_ENERGY_RATING_0 = 0;
    public static final int SUPPORT_ENERGY_RATING_1 = 1;
    public static final int SUPPORT_FALL_SET_0 = 0;
    public static final int SUPPORT_FALL_SET_1 = 1;
    public static final int SUPPORT_FIND_WATCH_0 = 0;
    public static final int SUPPORT_FIND_WATCH_1 = 1;
    public static final int SUPPORT_GAME_CONTROL_0 = 0;
    public static final int SUPPORT_GAME_CONTROL_1 = 1;
    public static final int SUPPORT_GAME_TIME_REMINDER_0 = 0;
    public static final int SUPPORT_GAME_TIME_REMINDER_1 = 1;
    public static final int SUPPORT_GESTUREWAKE2_0 = 0;
    public static final int SUPPORT_GESTUREWAKE2_1 = 1;
    public static final int SUPPORT_GET_WATCH_FACE_MAX_SIZE_0 = 0;
    public static final int SUPPORT_GET_WATCH_FACE_MAX_SIZE_1 = 1;
    public static final int SUPPORT_GIRLCARE_REMINDER_0 = 0;
    public static final int SUPPORT_GIRLCARE_REMINDER_1 = 1;
    public static final int SUPPORT_GIRL_CARE_MONTHLY_0 = 0;
    public static final int SUPPORT_GIRL_CARE_MONTHLY_1 = 1;
    public static final int SUPPORT_GOLF_MAP_0 = 0;
    public static final int SUPPORT_GOLF_MAP_1 = 1;
    public static final int SUPPORT_GOMORE_SET_0 = 0;
    public static final int SUPPORT_GOMORE_SET_1 = 1;
    public static final int SUPPORT_GOOGLE_NAVIGATION_DIALOGUE_0 = 0;
    public static final int SUPPORT_GOOGLE_NAVIGATION_DIALOGUE_1 = 1;
    public static final int SUPPORT_GPS_FIRMWARE_FILE_0 = 0;
    public static final int SUPPORT_GPS_FIRMWARE_FILE_1 = 1;
    public static final int SUPPORT_HID_0 = 0;
    public static final int SUPPORT_HID_1 = 1;
    public static final int SUPPORT_HIGH_ANTI_ASSIST_0 = 0;
    public static final int SUPPORT_HIGH_ANTI_ASSIST_1 = 1;
    public static final int SUPPORT_HRV_SET_0 = 0;
    public static final int SUPPORT_HRV_SET_1 = 1;
    public static final int SUPPORT_HR_DETECTION_MODE_0 = 0;
    public static final int SUPPORT_HR_DETECTION_MODE_1 = 1;
    public static final int SUPPORT_HR_WARN_SET_0 = 0;
    public static final int SUPPORT_HR_WARN_SET_1 = 1;
    public static final int SUPPORT_HYDRATION_REMINDER_0 = 0;
    public static final int SUPPORT_HYDRATION_REMINDER_1 = 1;
    public static final int SUPPORT_IBEACON_SET_0 = 0;
    public static final int SUPPORT_IBEACON_SET_1 = 1;
    public static final int SUPPORT_IBEACON_SET_2 = 2;
    public static final int SUPPORT_IMEI_SET_0 = 0;
    public static final int SUPPORT_IMEI_SET_1 = 1;
    public static final int SUPPORT_INCOMING_CALL_RING_0 = 0;
    public static final int SUPPORT_INCOMING_CALL_RING_1 = 1;
    public static final int SUPPORT_INHERITANCE_AGREEMENT_0 = 0;
    public static final int SUPPORT_INHERITANCE_AGREEMENT_1 = 1;
    public static final int SUPPORT_IPC_0 = 0;
    public static final int SUPPORT_IPC_1 = 1;
    public static final int SUPPORT_JL_TRANSPORT_0 = 0;
    public static final int SUPPORT_JL_TRANSPORT_1 = 1;
    public static final int SUPPORT_LAUNCH_DEVICE_SPORT_0 = 0;
    public static final int SUPPORT_LAUNCH_DEVICE_SPORT_1 = 1;
    public static final int SUPPORT_LOVE_TAP_0 = 0;
    public static final int SUPPORT_LOVE_TAP_1 = 1;
    public static final int SUPPORT_MATCH_V3_0 = 0;
    public static final int SUPPORT_MATCH_V3_1 = 1;
    public static final int SUPPORT_MEASUREMENT_BLOOD_GLUCOSE_0 = 0;
    public static final int SUPPORT_MEASUREMENT_BLOOD_GLUCOSE_1 = 1;
    public static final int SUPPORT_MEDICATION_ALARM_0 = 0;
    public static final int SUPPORT_MEDICATION_ALARM_1 = 1;
    public static final int SUPPORT_MEDICATION_REMINDER_0 = 0;
    public static final int SUPPORT_MEDICATION_REMINDER_1 = 1;
    public static final int SUPPORT_MEETING_REMINDER_0 = 0;
    public static final int SUPPORT_MEETING_REMINDER_1 = 1;
    public static final int SUPPORT_MUSIC_TRANSFER_0 = 0;
    public static final int SUPPORT_MUSIC_TRANSFER_1 = 1;
    public static final int SUPPORT_NAVIGATION_0 = 0;
    public static final int SUPPORT_NAVIGATION_1 = 1;
    public static final int SUPPORT_NAV_IMAGE_0 = 0;
    public static final int SUPPORT_NAV_IMAGE_1 = 1;
    public static final int SUPPORT_NETWORK_0 = 0;
    public static final int SUPPORT_NETWORK_1 = 1;
    public static final int SUPPORT_NEWS_FEED_0 = 0;
    public static final int SUPPORT_NEWS_FEED_1 = 1;
    public static final int SUPPORT_NEW_SLEEP_ALGORITHM_0 = 0;
    public static final int SUPPORT_NEW_SLEEP_ALGORITHM_1 = 1;
    public static final int SUPPORT_NOISE_SET_0 = 0;
    public static final int SUPPORT_NOISE_SET_1 = 1;
    public static final int SUPPORT_NOTIFICATION_LIGHT_SCREEN_SET_0 = 0;
    public static final int SUPPORT_NOTIFICATION_LIGHT_SCREEN_SET_1 = 1;
    public static final int SUPPORT_NOT_SAVE_SPORT_0 = 0;
    public static final int SUPPORT_NOT_SAVE_SPORT_1 = 1;
    public static final int SUPPORT_NO_DISTURB2_0 = 0;
    public static final int SUPPORT_NO_DISTURB2_1 = 1;
    public static final int SUPPORT_NO_DISTURB_0 = 0;
    public static final int SUPPORT_NO_DISTURB_1 = 1;
    public static final int SUPPORT_OFFLINE_ASR_AUTH_0 = 0;
    public static final int SUPPORT_OFFLINE_ASR_AUTH_1 = 1;
    public static final int SUPPORT_OFFLINE_MAP_0 = 0;
    public static final int SUPPORT_OFFLINE_MAP_1 = 1;
    public static final int SUPPORT_ONGOING_DIALOGUE_0 = 0;
    public static final int SUPPORT_ONGOING_DIALOGUE_1 = 1;
    public static final int SUPPORT_OTA_FILE_0 = 0;
    public static final int SUPPORT_OTA_FILE_1 = 1;
    public static final int SUPPORT_PHYSICAL_STRENGTH_0 = 0;
    public static final int SUPPORT_PHYSICAL_STRENGTH_1 = 1;
    public static final int SUPPORT_POWER2_0 = 0;
    public static final int SUPPORT_POWER2_1 = 1;
    public static final int SUPPORT_POWER_SAVE_MODE_0 = 0;
    public static final int SUPPORT_POWER_SAVE_MODE_1 = 1;
    public static final int SUPPORT_PRESSURE_TIMING_MEASUREMENT_0 = 0;
    public static final int SUPPORT_PRESSURE_TIMING_MEASUREMENT_1 = 1;
    public static final int SUPPORT_QIBLA_SET_0 = 0;
    public static final int SUPPORT_QIBLA_SET_1 = 1;
    public static final int SUPPORT_QRCODE_0 = 0;
    public static final int SUPPORT_QRCODE_1 = 1;
    public static final int SUPPORT_QURAN_0 = 0;
    public static final int SUPPORT_QURAN_1 = 1;
    public static final int SUPPORT_READ_DEVICE_INFO_0 = 0;
    public static final int SUPPORT_READ_DEVICE_INFO_1 = 1;
    public static final int SUPPORT_READ_LANGUAGES2_0 = 0;
    public static final int SUPPORT_READ_LANGUAGES2_1 = 1;
    public static final int SUPPORT_READ_LANGUAGES_0 = 0;
    public static final int SUPPORT_READ_LANGUAGES_1 = 1;
    public static final int SUPPORT_READ_PACKAGE_STATUS_0 = 0;
    public static final int SUPPORT_READ_PACKAGE_STATUS_1 = 1;
    public static final int SUPPORT_REALTIME_MEASUREMENT_0 = 0;
    public static final int SUPPORT_REALTIME_MEASUREMENT_1 = 1;
    public static final int SUPPORT_RECORD_AUDIO_0 = 0;
    public static final int SUPPORT_RECORD_AUDIO_1 = 1;
    public static final int SUPPORT_RECORD_NOTE_0 = 0;
    public static final int SUPPORT_RECORD_NOTE_1 = 1;
    public static final int SUPPORT_RELAX_REMINDER_0 = 0;
    public static final int SUPPORT_RELAX_REMINDER_1 = 1;
    public static final int SUPPORT_REQUEST_REALTIME_WEATHER_0 = 0;
    public static final int SUPPORT_REQUEST_REALTIME_WEATHER_1 = 1;
    public static final int SUPPORT_RESPIRATORY_RATE_0 = 0;
    public static final int SUPPORT_RESPIRATORY_RATE_1 = 1;
    public static final int SUPPORT_RESTORE_FACTORY_0 = 0;
    public static final int SUPPORT_RESTORE_FACTORY_1 = 1;
    public static final int SUPPORT_RING_VIBRATION_SET_0 = 0;
    public static final int SUPPORT_RING_VIBRATION_SET_1 = 1;
    public static final int SUPPORT_SDCARD_INFO_0 = 0;
    public static final int SUPPORT_SDCARD_INFO_1 = 1;
    public static final int SUPPORT_SET_WATCH_PASSWORD_0 = 0;
    public static final int SUPPORT_SET_WATCH_PASSWORD_1 = 1;
    public static final int SUPPORT_SHSY_ALGORITHM_0 = 0;
    public static final int SUPPORT_SHSY_ALGORITHM_1 = 1;
    public static final int SUPPORT_SIMULTANEOUS_TRANSLATION_0 = 0;
    public static final int SUPPORT_SIMULTANEOUS_TRANSLATION_1 = 1;
    public static final int SUPPORT_SLEEP_SCORE_0 = 0;
    public static final int SUPPORT_SLEEP_SCORE_1 = 1;
    public static final int SUPPORT_SLEEP_SET_0 = 0;
    public static final int SUPPORT_SLEEP_SET_1 = 1;
    public static final int SUPPORT_SMS_QUICK_REPLY_0 = 0;
    public static final int SUPPORT_SMS_QUICK_REPLY_1 = 1;
    public static final int SUPPORT_SN_0 = 0;
    public static final int SUPPORT_SN_1 = 1;
    public static final int SUPPORT_SOS_CONTACT_0 = 0;
    public static final int SUPPORT_SOS_CONTACT_1 = 1;
    public static final int SUPPORT_SOS_SET_0 = 0;
    public static final int SUPPORT_SOS_SET_1 = 1;
    public static final int SUPPORT_SPECIAL_SLEEP_STRUCTURE_0 = 0;
    public static final int SUPPORT_SPECIAL_SLEEP_STRUCTURE_1 = 1;
    public static final int SUPPORT_STANDBY_SET_0 = 0;
    public static final int SUPPORT_STANDBY_SET_1 = 1;
    public static final int SUPPORT_STOCK_0 = 0;
    public static final int SUPPORT_STOCK_1 = 1;
    public static final int SUPPORT_STRING_QRCODE_0 = 0;
    public static final int SUPPORT_STRING_QRCODE_1 = 1;
    public static final int SUPPORT_STUDY_CARDS_0 = 0;
    public static final int SUPPORT_STUDY_CARDS_1 = 1;
    public static final int SUPPORT_SWITCH_PHONE_ASSISTANT_0 = 0;
    public static final int SUPPORT_SWITCH_PHONE_ASSISTANT_1 = 1;
    public static final int SUPPORT_SYNC_AGPS_IN_BACKGROUND_0 = 0;
    public static final int SUPPORT_SYNC_AGPS_IN_BACKGROUND_1 = 1;
    public static final int SUPPORT_TEMPERATURE_UNIT_0 = 0;
    public static final int SUPPORT_TEMPERATURE_UNIT_1 = 1;
    public static final int SUPPORT_TIMER_STANDBYSET_0 = 0;
    public static final int SUPPORT_TIMER_STANDBYSET_1 = 1;
    public static final int SUPPORT_TIME_FORMAT_0 = 0;
    public static final int SUPPORT_TIME_FORMAT_1 = 1;
    public static final int SUPPORT_TOUCH_SET_0 = 0;
    public static final int SUPPORT_TOUCH_SET_1 = 1;
    public static final int SUPPORT_TUYA_KEY_0 = 0;
    public static final int SUPPORT_TUYA_KEY_1 = 1;
    public static final int SUPPORT_VIBRATION_INTENSITY_0 = 0;
    public static final int SUPPORT_VIBRATION_INTENSITY_1 = 1;
    public static final int SUPPORT_VIDEO_CALLS_0 = 0;
    public static final int SUPPORT_VIDEO_CALLS_1 = 1;
    public static final int SUPPORT_VITALITY_VALUE_0 = 0;
    public static final int SUPPORT_VITALITY_VALUE_1 = 1;
    public static final int SUPPORT_VOICE_0 = 0;
    public static final int SUPPORT_VOICE_1 = 1;
    public static final int SUPPORT_VOICE_CONTROL_0 = 0;
    public static final int SUPPORT_VOICE_CONTROL_1 = 1;
    public static final int SUPPORT_VOICE_MAX_LENGTH_0 = 0;
    public static final int SUPPORT_VOICE_MAX_LENGTH_1 = 1;
    public static final int SUPPORT_WALK_BIKE_0 = 0;
    public static final int SUPPORT_WALK_BIKE_1 = 1;
    public static final int SUPPORT_WASH_0 = 0;
    public static final int SUPPORT_WASH_1 = 1;
    public static final int SUPPORT_WATCHFACE2_0 = 0;
    public static final int SUPPORT_WATCHFACE2_1 = 1;
    public static final int SUPPORT_WATCHFACE_ID_0 = 0;
    public static final int SUPPORT_WATCHFACE_ID_1 = 1;
    public static final int SUPPORT_WATCHFACE_INDEX_0 = 0;
    public static final int SUPPORT_WATCHFACE_INDEX_1 = 1;
    public static final int SUPPORT_WEAR_DETECTION_0 = 0;
    public static final int SUPPORT_WEAR_DETECTION_1 = 1;
    public static final int SUPPORT_WEAR_WAY_0 = 0;
    public static final int SUPPORT_WEAR_WAY_1 = 1;
    public static final int SUPPORT_WEATHER2_0 = 0;
    public static final int SUPPORT_WEATHER2_1 = 1;
    public static final int SUPPORT_WECHAT_0 = 0;
    public static final int SUPPORT_WECHAT_1 = 1;
    public static final int SUPPORT_WECHAT_CALL_0 = 0;
    public static final int SUPPORT_WECHAT_CALL_1 = 1;
    public static final int SUPPORT_WECHAT_PAY_0 = 0;
    public static final int SUPPORT_WECHAT_PAY_1 = 1;
    public static final int SUPPORT_WHATSAPP_0 = 0;
    public static final int SUPPORT_WHATSAPP_1 = 1;
    public static final int SUPPORT_WORLD_CLOCK_0 = 0;
    public static final int SUPPORT_WORLD_CLOCK_1 = 1;

    @aa1
    public static final String VIBE_CADDIE_PRO = "Vibe Caddie PRO";
    public static final int WATCH_0 = 0;
    public static final int WATCH_1 = 1;
    public static final int WATCH_10 = 10;
    public static final int WATCH_11 = 11;
    public static final int WATCH_12 = 12;
    public static final int WATCH_13 = 13;
    public static final int WATCH_14 = 14;
    public static final int WATCH_15 = 15;
    public static final int WATCH_16 = 16;
    public static final int WATCH_17 = 17;
    public static final int WATCH_18 = 18;
    public static final int WATCH_19 = 19;
    public static final int WATCH_2 = 2;
    public static final int WATCH_20 = 20;
    public static final int WATCH_21 = 21;
    public static final int WATCH_3 = 3;
    public static final int WATCH_4 = 4;
    public static final int WATCH_5 = 5;
    public static final int WATCH_6 = 6;
    public static final int WATCH_7 = 7;
    public static final int WATCH_8 = 8;
    public static final int WATCH_9 = 9;
    public static final int WATCH_99 = 99;
    private int mAGpsType;

    @aa1
    private String mBleAddress;

    @aa1
    private String mBleCustomName;

    @aa1
    private String mBleDefaultName;

    @aa1
    private String mBleName;
    private int mBlockSwimmingReminders;

    @aa1
    private String mClassicAddress;

    @aa1
    private List<Integer> mDataKeys;

    @aa1
    private String mFirmwareFlag;
    private int mHideDigitalPower;
    private long mIOBufferSize;
    private int mId;

    @aa1
    private String mPlatform;

    @aa1
    private String mPrototype;
    private int mQrcodeContentSize;
    private int mQrcodeSize;
    private int mShowAntiLostSwitch;
    private int mSleepAlgorithmType;
    private int mSupport2DAcceleration;
    private int mSupportAICoach;
    private int mSupportAICoachV2;
    private int mSupportAITranslation;
    private int mSupportAMapOfflineMap;
    private int mSupportActivityRecognition;
    private int mSupportAiOngoingDialogue;
    private int mSupportAlipay;
    private int mSupportAppPushSwitch;
    private int mSupportAppPushSwitch3;
    private int mSupportAppSport;
    private int mSupportAppStore;
    private int mSupportAudioBooks;
    private int mSupportBatteryUsage;
    private int mSupportBloodOxyGenSet;
    private int mSupportBloodPressureCalibration;
    private int mSupportChangeClassicBluetoothState;
    private int mSupportChargeWhileUsing;
    private int mSupportConnectReminder;
    private int mSupportContactSize;
    private int mSupportContactSort;
    private int mSupportCrossAppTranslation;
    private int mSupportCustomLogo;
    private int mSupportCyWeeAlgorithm;
    private int mSupportCyWeeAlgorithmGpsPush;
    private int mSupportDateFormatSet;
    private int mSupportDeviceSportData;
    private int mSupportDoubleScreen;
    private int mSupportDrinkWaterSet;
    private int mSupportEbookTransfer;
    private int mSupportEnergyRating;
    private int mSupportFallSet;
    private int mSupportFindWatch;
    private int mSupportGPSFirmwareFile;
    private int mSupportGameControls;
    private int mSupportGameTimeReminder;
    private int mSupportGestureWake2;
    private int mSupportGetWatchFaceMaxSize;
    private int mSupportGirlCareMonthly;
    private int mSupportGirlCareReminder;
    private int mSupportGoMoreSet;
    private int mSupportGolfMapData;
    private int mSupportGoogleNavigation;
    private int mSupportHID;
    private int mSupportHRDetectionMode;
    private int mSupportHighAntiAssist;
    private int mSupportHrWarnSet;
    private int mSupportHrvSet;
    private int mSupportHydrationReminder;
    private int mSupportIBeaconSet;
    private int mSupportIMEISet;
    private int mSupportIPC;
    private int mSupportIncomingCallRing;
    private int mSupportInheritanceAgreement;
    private int mSupportJLTransport;
    private int mSupportLaunchDeviceSport;
    private int mSupportLoveTap;
    private int mSupportMatchV3;
    private int mSupportMeasurementBloodGlucose;
    private int mSupportMedicationAlarm;
    private int mSupportMedicationReminder;
    private int mSupportMeetingReminder;
    private int mSupportMusicTransfer;
    private int mSupportMyCardCodeSize;
    private int mSupportNavImage;
    private int mSupportNavigation;
    private int mSupportNetwork;
    private int mSupportNewTransportMode;
    private int mSupportNewsfeed;
    private int mSupportNoDisturbSet;
    private int mSupportNoDisturbSet2;
    private int mSupportNoiseSet;
    private int mSupportNotSaveAPPSport;
    private int mSupportNotificationLightScreenSet;
    private int mSupportOTAFile;
    private int mSupportOfflineAsrAuth;
    private int mSupportPhysicalStrength;
    private int mSupportPower2;
    private int mSupportPowerSaveMode;
    private int mSupportPressureTimingMeasurement;
    private int mSupportQiblaSet;
    private int mSupportQrcode;
    private int mSupportQuran;
    private int mSupportReadDeviceInfo;
    private int mSupportReadLanguages;
    private int mSupportReadLanguages2;
    private int mSupportReadOffLineMap;
    private int mSupportReadPackageStatus;
    private int mSupportRealTimeMeasurement;
    private int mSupportReceiptCodeSize;
    private int mSupportRecordAudio;
    private int mSupportRecordNote;
    private int mSupportRelaxReminder;
    private int mSupportRequestRealtimeWeather;
    private int mSupportRespiratoryRate;
    private int mSupportRestoreFactory;
    private int mSupportRingVibrationSet;
    private int mSupportSDCardInfo;
    private int mSupportSHSYAlgorithm;
    private int mSupportSMSQuickReply;
    private int mSupportSOSSet;
    private int mSupportSOSSet2;
    private int mSupportSetWatchPassword;

    @aa1
    private String mSupportShowSNNumber;
    private int mSupportSimultaneousTranslation;
    private int mSupportSleepScore;
    private int mSupportSleepSet;
    private int mSupportSosContact;
    private int mSupportSpecialSleepStructure;
    private int mSupportStandbySet;
    private int mSupportStock;
    private int mSupportStringQrcode;
    private int mSupportStudyCards;
    private int mSupportSwitchPhoneAssistant;
    private int mSupportSyncAGPSInBackground;
    private int mSupportTemperatureUnitSet;
    private int mSupportTimeFormat;
    private int mSupportTimerStandbySet;
    private int mSupportTouchSet;
    private int mSupportTuyaKey;
    private int mSupportVibrationIntensity;
    private int mSupportVideoCalls;
    private int mSupportVitalityValue;
    private int mSupportVoice;
    private int mSupportVoiceControl;
    private int mSupportVoiceMaxLength;
    private int mSupportWalkAndBike;
    private int mSupportWashSet;
    private int mSupportWatchFaceId;
    private int mSupportWatchFaceIndex;
    private int mSupportWatchface2;
    private int mSupportWeChat;
    private int mSupportWeChatCall;
    private int mSupportWearDetection;
    private int mSupportWearWay;
    private int mSupportWeather2;
    private int mSupportWechatPay;
    private int mSupportWhatsApp;
    private int mSupportWorldClock;
    private int mWatchFaceType;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public BleDeviceInfo() {
        this(0, null, null, null, null, null, null, null, 0, 0L, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -1, -1, -1, C2229at.f5560IO, null);
    }

    private final String component53() {
        return this.mBleDefaultName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceInfo copy$default(BleDeviceInfo bleDeviceInfo, int i, List list, String str, String str2, String str3, String str4, String str5, String str6, int i2, long j, int i3, String str7, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, String str8, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, int i110, int i111, int i112, int i113, int i114, int i115, int i116, int i117, int i118, int i119, int i120, int i121, int i122, int i123, int i124, int i125, int i126, int i127, int i128, int i129, int i130, int i131, int i132, int i133, int i134, String str9, int i135, int i136, int i137, int i138, int i139, int i140, int i141, int i142, int i143, int i144, int i145, int i146, int i147, int i148, int i149, int i150, int i151, int i152, Object obj) {
        int i153 = (i148 & 1) != 0 ? bleDeviceInfo.mId : i;
        List list2 = (i148 & 2) != 0 ? bleDeviceInfo.mDataKeys : list;
        String str10 = (i148 & 4) != 0 ? bleDeviceInfo.mBleName : str;
        String str11 = (i148 & 8) != 0 ? bleDeviceInfo.mBleCustomName : str2;
        String str12 = (i148 & 16) != 0 ? bleDeviceInfo.mBleAddress : str3;
        String str13 = (i148 & 32) != 0 ? bleDeviceInfo.mPlatform : str4;
        String str14 = (i148 & 64) != 0 ? bleDeviceInfo.mPrototype : str5;
        String str15 = (i148 & 128) != 0 ? bleDeviceInfo.mFirmwareFlag : str6;
        int i154 = (i148 & 256) != 0 ? bleDeviceInfo.mAGpsType : i2;
        int i155 = i153;
        List list3 = list2;
        long j2 = (i148 & 512) != 0 ? bleDeviceInfo.mIOBufferSize : j;
        int i156 = (i148 & 1024) != 0 ? bleDeviceInfo.mWatchFaceType : i3;
        long j3 = j2;
        String str16 = (i148 & 2048) != 0 ? bleDeviceInfo.mClassicAddress : str7;
        int i157 = (i148 & 4096) != 0 ? bleDeviceInfo.mHideDigitalPower : i4;
        String str17 = str16;
        int i158 = (i148 & 8192) != 0 ? bleDeviceInfo.mShowAntiLostSwitch : i5;
        int i159 = (i148 & 16384) != 0 ? bleDeviceInfo.mSleepAlgorithmType : i6;
        int i160 = (i148 & 32768) != 0 ? bleDeviceInfo.mSupportDateFormatSet : i7;
        int i161 = (i148 & 65536) != 0 ? bleDeviceInfo.mSupportReadDeviceInfo : i8;
        int i162 = (i148 & 131072) != 0 ? bleDeviceInfo.mSupportTemperatureUnitSet : i9;
        int i163 = (i148 & 262144) != 0 ? bleDeviceInfo.mSupportDrinkWaterSet : i10;
        int i164 = (i148 & 524288) != 0 ? bleDeviceInfo.mSupportChangeClassicBluetoothState : i11;
        int i165 = (i148 & 1048576) != 0 ? bleDeviceInfo.mSupportAppSport : i12;
        int i166 = (i148 & 2097152) != 0 ? bleDeviceInfo.mSupportBloodOxyGenSet : i13;
        int i167 = (i148 & 4194304) != 0 ? bleDeviceInfo.mSupportWashSet : i14;
        int i168 = (i148 & 8388608) != 0 ? bleDeviceInfo.mSupportRequestRealtimeWeather : i15;
        int i169 = (i148 & 16777216) != 0 ? bleDeviceInfo.mSupportHID : i16;
        int i170 = (i148 & 33554432) != 0 ? bleDeviceInfo.mSupportIBeaconSet : i17;
        int i171 = (i148 & 67108864) != 0 ? bleDeviceInfo.mSupportWatchFaceId : i18;
        int i172 = (i148 & 134217728) != 0 ? bleDeviceInfo.mSupportNewTransportMode : i19;
        int i173 = (i148 & 268435456) != 0 ? bleDeviceInfo.mSupportJLTransport : i20;
        int i174 = (i148 & 536870912) != 0 ? bleDeviceInfo.mSupportFindWatch : i21;
        int i175 = (i148 & 1073741824) != 0 ? bleDeviceInfo.mSupportWorldClock : i22;
        int i176 = (i148 & Integer.MIN_VALUE) != 0 ? bleDeviceInfo.mSupportStock : i23;
        int i177 = (i149 & 1) != 0 ? bleDeviceInfo.mSupportSMSQuickReply : i24;
        int i178 = (i149 & 2) != 0 ? bleDeviceInfo.mSupportNoDisturbSet : i25;
        int i179 = (i149 & 4) != 0 ? bleDeviceInfo.mSupportSetWatchPassword : i26;
        int i180 = (i149 & 8) != 0 ? bleDeviceInfo.mSupportRealTimeMeasurement : i27;
        int i181 = (i149 & 16) != 0 ? bleDeviceInfo.mSupportPowerSaveMode : i28;
        int i182 = (i149 & 32) != 0 ? bleDeviceInfo.mSupportLoveTap : i29;
        int i183 = (i149 & 64) != 0 ? bleDeviceInfo.mSupportNewsfeed : i30;
        int i184 = (i149 & 128) != 0 ? bleDeviceInfo.mSupportMedicationReminder : i31;
        int i185 = (i149 & 256) != 0 ? bleDeviceInfo.mSupportQrcode : i32;
        int i186 = (i149 & 512) != 0 ? bleDeviceInfo.mSupportWeather2 : i33;
        int i187 = (i149 & 1024) != 0 ? bleDeviceInfo.mSupportAlipay : i34;
        int i188 = (i149 & 2048) != 0 ? bleDeviceInfo.mSupportStandbySet : i35;
        int i189 = (i149 & 4096) != 0 ? bleDeviceInfo.mSupport2DAcceleration : i36;
        int i190 = (i149 & 8192) != 0 ? bleDeviceInfo.mSupportTuyaKey : i37;
        int i191 = (i149 & 16384) != 0 ? bleDeviceInfo.mSupportMedicationAlarm : i38;
        int i192 = (i149 & 32768) != 0 ? bleDeviceInfo.mSupportReadPackageStatus : i39;
        int i193 = (i149 & 65536) != 0 ? bleDeviceInfo.mSupportContactSize : i40;
        int i194 = (i149 & 131072) != 0 ? bleDeviceInfo.mSupportVoice : i41;
        int i195 = (i149 & 262144) != 0 ? bleDeviceInfo.mSupportNavigation : i42;
        int i196 = (i149 & 524288) != 0 ? bleDeviceInfo.mSupportHrWarnSet : i43;
        String str18 = (i149 & 1048576) != 0 ? bleDeviceInfo.mBleDefaultName : str8;
        int i197 = (i149 & 2097152) != 0 ? bleDeviceInfo.mSupportMusicTransfer : i44;
        int i198 = (i149 & 4194304) != 0 ? bleDeviceInfo.mSupportNoDisturbSet2 : i45;
        int i199 = (i149 & 8388608) != 0 ? bleDeviceInfo.mSupportSOSSet : i46;
        int i200 = (i149 & 16777216) != 0 ? bleDeviceInfo.mSupportReadLanguages : i47;
        int i201 = (i149 & 33554432) != 0 ? bleDeviceInfo.mSupportGirlCareReminder : i48;
        int i202 = (i149 & 67108864) != 0 ? bleDeviceInfo.mSupportAppPushSwitch : i49;
        int i203 = (i149 & 134217728) != 0 ? bleDeviceInfo.mSupportReceiptCodeSize : i50;
        int i204 = (i149 & 268435456) != 0 ? bleDeviceInfo.mSupportGameTimeReminder : i51;
        int i205 = (i149 & 536870912) != 0 ? bleDeviceInfo.mSupportMyCardCodeSize : i52;
        int i206 = (i149 & 1073741824) != 0 ? bleDeviceInfo.mSupportDeviceSportData : i53;
        int i207 = (i149 & Integer.MIN_VALUE) != 0 ? bleDeviceInfo.mSupportEbookTransfer : i54;
        int i208 = i206;
        int i209 = (i150 & 1) != 0 ? bleDeviceInfo.mSupportDoubleScreen : i55;
        int i210 = (i150 & 2) != 0 ? bleDeviceInfo.mSupportCustomLogo : i56;
        int i211 = (i150 & 4) != 0 ? bleDeviceInfo.mSupportPressureTimingMeasurement : i57;
        int i212 = (i150 & 8) != 0 ? bleDeviceInfo.mSupportTimerStandbySet : i58;
        int i213 = (i150 & 16) != 0 ? bleDeviceInfo.mSupportSOSSet2 : i59;
        int i214 = (i150 & 32) != 0 ? bleDeviceInfo.mSupportFallSet : i60;
        int i215 = (i150 & 64) != 0 ? bleDeviceInfo.mSupportWalkAndBike : i61;
        int i216 = (i150 & 128) != 0 ? bleDeviceInfo.mSupportConnectReminder : i62;
        int i217 = (i150 & 256) != 0 ? bleDeviceInfo.mSupportSDCardInfo : i63;
        int i218 = (i150 & 512) != 0 ? bleDeviceInfo.mSupportIncomingCallRing : i64;
        int i219 = (i150 & 1024) != 0 ? bleDeviceInfo.mSupportNotificationLightScreenSet : i65;
        int i220 = (i150 & 2048) != 0 ? bleDeviceInfo.mSupportBloodPressureCalibration : i66;
        int i221 = (i150 & 4096) != 0 ? bleDeviceInfo.mSupportOTAFile : i67;
        int i222 = (i150 & 8192) != 0 ? bleDeviceInfo.mSupportGPSFirmwareFile : i68;
        int i223 = (i150 & 16384) != 0 ? bleDeviceInfo.mSupportGoMoreSet : i69;
        int i224 = (i150 & 32768) != 0 ? bleDeviceInfo.mSupportRingVibrationSet : i70;
        int i225 = (i150 & 65536) != 0 ? bleDeviceInfo.mSupportNetwork : i71;
        int i226 = (i150 & 131072) != 0 ? bleDeviceInfo.mSupportContactSort : i72;
        int i227 = (i150 & 262144) != 0 ? bleDeviceInfo.mQrcodeSize : i73;
        int i228 = (i150 & 524288) != 0 ? bleDeviceInfo.mQrcodeContentSize : i74;
        int i229 = (i150 & 1048576) != 0 ? bleDeviceInfo.mSupportStringQrcode : i75;
        int i230 = (i150 & 2097152) != 0 ? bleDeviceInfo.mSupportWatchFaceIndex : i76;
        int i231 = (i150 & 4194304) != 0 ? bleDeviceInfo.mSupportSosContact : i77;
        int i232 = (i150 & 8388608) != 0 ? bleDeviceInfo.mSupportGirlCareMonthly : i78;
        int i233 = (i150 & 16777216) != 0 ? bleDeviceInfo.mSupportWearWay : i79;
        int i234 = (i150 & 33554432) != 0 ? bleDeviceInfo.mSupportGestureWake2 : i80;
        int i235 = (i150 & 67108864) != 0 ? bleDeviceInfo.mSupportNavImage : i81;
        int i236 = (i150 & 134217728) != 0 ? bleDeviceInfo.mSupportVoiceMaxLength : i82;
        int i237 = (i150 & 268435456) != 0 ? bleDeviceInfo.mSupportAudioBooks : i83;
        int i238 = (i150 & 536870912) != 0 ? bleDeviceInfo.mSupportStudyCards : i84;
        int i239 = (i150 & 1073741824) != 0 ? bleDeviceInfo.mSupportAppStore : i85;
        return bleDeviceInfo.copy(i155, list3, str10, str11, str12, str13, str14, str15, i154, j3, i156, str17, i157, i158, i159, i160, i161, i162, i163, i164, i165, i166, i167, i168, i169, i170, i171, i172, i173, i174, i175, i176, i177, i178, i179, i180, i181, i182, i183, i184, i185, i186, i187, i188, i189, i190, i191, i192, i193, i194, i195, i196, str18, i197, i198, i199, i200, i201, i202, i203, i204, i205, i208, i207, i209, i210, i211, i212, i213, i214, i215, i216, i217, i218, i219, i220, i221, i222, i223, i224, i225, i226, i227, i228, i229, i230, i231, i232, i233, i234, i235, i236, i237, i238, i239, (i150 & Integer.MIN_VALUE) != 0 ? bleDeviceInfo.mSupportSHSYAlgorithm : i86, (i151 & 1) != 0 ? bleDeviceInfo.mSupportQiblaSet : i87, (i151 & 2) != 0 ? bleDeviceInfo.mSupportMeasurementBloodGlucose : i88, (i151 & 4) != 0 ? bleDeviceInfo.mSupportGameControls : i89, (i151 & 8) != 0 ? bleDeviceInfo.mSupportBatteryUsage : i90, (i151 & 16) != 0 ? bleDeviceInfo.mSupportAITranslation : i91, (i151 & 32) != 0 ? bleDeviceInfo.mSupportSimultaneousTranslation : i92, (i151 & 64) != 0 ? bleDeviceInfo.mSupportTouchSet : i93, (i151 & 128) != 0 ? bleDeviceInfo.mSupportIMEISet : i94, (i151 & 256) != 0 ? bleDeviceInfo.mSupportQuran : i95, (i151 & 512) != 0 ? bleDeviceInfo.mSupportSyncAGPSInBackground : i96, (i151 & 1024) != 0 ? bleDeviceInfo.mSupportRestoreFactory : i97, (i151 & 2048) != 0 ? bleDeviceInfo.mSupportRecordNote : i98, (i151 & 4096) != 0 ? bleDeviceInfo.mSupportSleepScore : i99, (i151 & 8192) != 0 ? bleDeviceInfo.mSupportWatchface2 : i100, (i151 & 16384) != 0 ? bleDeviceInfo.mSupportAICoach : i101, (i151 & 32768) != 0 ? bleDeviceInfo.mSupportCrossAppTranslation : i102, (i151 & 65536) != 0 ? bleDeviceInfo.mSupportRelaxReminder : i103, (i151 & 131072) != 0 ? bleDeviceInfo.mSupportPower2 : i104, (i151 & 262144) != 0 ? bleDeviceInfo.mSupportWeChat : i105, (i151 & 524288) != 0 ? bleDeviceInfo.mSupportWhatsApp : i106, (i151 & 1048576) != 0 ? bleDeviceInfo.mSupportReadLanguages2 : i107, (i151 & 2097152) != 0 ? bleDeviceInfo.mSupportTimeFormat : i108, (i151 & 4194304) != 0 ? bleDeviceInfo.mSupportVibrationIntensity : i109, (i151 & 8388608) != 0 ? bleDeviceInfo.mSupportHighAntiAssist : i110, (i151 & 16777216) != 0 ? bleDeviceInfo.mSupportWechatPay : i111, (i151 & 33554432) != 0 ? bleDeviceInfo.mSupportVitalityValue : i112, (i151 & 67108864) != 0 ? bleDeviceInfo.mSupportHRDetectionMode : i113, (i151 & 134217728) != 0 ? bleDeviceInfo.mSupportAICoachV2 : i114, (i151 & 268435456) != 0 ? bleDeviceInfo.mSupportRespiratoryRate : i115, (i151 & 536870912) != 0 ? bleDeviceInfo.mSupportPhysicalStrength : i116, (i151 & 1073741824) != 0 ? bleDeviceInfo.mSupportIPC : i117, (i151 & Integer.MIN_VALUE) != 0 ? bleDeviceInfo.mSupportVideoCalls : i118, (i152 & 1) != 0 ? bleDeviceInfo.mSupportRecordAudio : i119, (i152 & 2) != 0 ? bleDeviceInfo.mSupportActivityRecognition : i120, (i152 & 4) != 0 ? bleDeviceInfo.mSupportMatchV3 : i121, (i152 & 8) != 0 ? bleDeviceInfo.mSupportLaunchDeviceSport : i122, (i152 & 16) != 0 ? bleDeviceInfo.mSupportGetWatchFaceMaxSize : i123, (i152 & 32) != 0 ? bleDeviceInfo.mSupportHrvSet : i124, (i152 & 64) != 0 ? bleDeviceInfo.mSupportSleepSet : i125, (i152 & 128) != 0 ? bleDeviceInfo.mSupportVoiceControl : i126, (i152 & 256) != 0 ? bleDeviceInfo.mSupportSwitchPhoneAssistant : i127, (i152 & 512) != 0 ? bleDeviceInfo.mSupportWeChatCall : i128, (i152 & 1024) != 0 ? bleDeviceInfo.mSupportAiOngoingDialogue : i129, (i152 & 2048) != 0 ? bleDeviceInfo.mSupportGoogleNavigation : i130, (i152 & 4096) != 0 ? bleDeviceInfo.mSupportSpecialSleepStructure : i131, (i152 & 8192) != 0 ? bleDeviceInfo.mSupportInheritanceAgreement : i132, (i152 & 16384) != 0 ? bleDeviceInfo.mSupportChargeWhileUsing : i133, (i152 & 32768) != 0 ? bleDeviceInfo.mSupportCyWeeAlgorithm : i134, (i152 & 65536) != 0 ? bleDeviceInfo.mSupportShowSNNumber : str9, (i152 & 131072) != 0 ? bleDeviceInfo.mSupportReadOffLineMap : i135, (i152 & 262144) != 0 ? bleDeviceInfo.mSupportGolfMapData : i136, (i152 & 524288) != 0 ? bleDeviceInfo.mSupportNotSaveAPPSport : i137, (i152 & 1048576) != 0 ? bleDeviceInfo.mSupportNoiseSet : i138, (i152 & 2097152) != 0 ? bleDeviceInfo.mSupportWearDetection : i139, (i152 & 4194304) != 0 ? bleDeviceInfo.mBlockSwimmingReminders : i140, (i152 & 8388608) != 0 ? bleDeviceInfo.mSupportEnergyRating : i141, (i152 & 16777216) != 0 ? bleDeviceInfo.mSupportAMapOfflineMap : i142, (i152 & 33554432) != 0 ? bleDeviceInfo.mSupportCyWeeAlgorithmGpsPush : i143, (i152 & 67108864) != 0 ? bleDeviceInfo.mSupportAppPushSwitch3 : i144, (i152 & 134217728) != 0 ? bleDeviceInfo.mSupportHydrationReminder : i145, (i152 & 268435456) != 0 ? bleDeviceInfo.mSupportMeetingReminder : i146, (i152 & 536870912) != 0 ? bleDeviceInfo.mSupportOfflineAsrAuth : i147);
    }

    @Deprecated(message = "已废弃")
    public static /* synthetic */ void getMSupportSOSSet$annotations() {
    }

    public final int component1() {
        return this.mId;
    }

    public final long component10() {
        return this.mIOBufferSize;
    }

    public final int component100() {
        return this.mSupportBatteryUsage;
    }

    public final int component101() {
        return this.mSupportAITranslation;
    }

    public final int component102() {
        return this.mSupportSimultaneousTranslation;
    }

    public final int component103() {
        return this.mSupportTouchSet;
    }

    public final int component104() {
        return this.mSupportIMEISet;
    }

    public final int component105() {
        return this.mSupportQuran;
    }

    public final int component106() {
        return this.mSupportSyncAGPSInBackground;
    }

    public final int component107() {
        return this.mSupportRestoreFactory;
    }

    public final int component108() {
        return this.mSupportRecordNote;
    }

    public final int component109() {
        return this.mSupportSleepScore;
    }

    public final int component11() {
        return this.mWatchFaceType;
    }

    public final int component110() {
        return this.mSupportWatchface2;
    }

    public final int component111() {
        return this.mSupportAICoach;
    }

    public final int component112() {
        return this.mSupportCrossAppTranslation;
    }

    public final int component113() {
        return this.mSupportRelaxReminder;
    }

    public final int component114() {
        return this.mSupportPower2;
    }

    public final int component115() {
        return this.mSupportWeChat;
    }

    public final int component116() {
        return this.mSupportWhatsApp;
    }

    public final int component117() {
        return this.mSupportReadLanguages2;
    }

    public final int component118() {
        return this.mSupportTimeFormat;
    }

    public final int component119() {
        return this.mSupportVibrationIntensity;
    }

    @aa1
    public final String component12() {
        return this.mClassicAddress;
    }

    public final int component120() {
        return this.mSupportHighAntiAssist;
    }

    public final int component121() {
        return this.mSupportWechatPay;
    }

    public final int component122() {
        return this.mSupportVitalityValue;
    }

    public final int component123() {
        return this.mSupportHRDetectionMode;
    }

    public final int component124() {
        return this.mSupportAICoachV2;
    }

    public final int component125() {
        return this.mSupportRespiratoryRate;
    }

    public final int component126() {
        return this.mSupportPhysicalStrength;
    }

    public final int component127() {
        return this.mSupportIPC;
    }

    public final int component128() {
        return this.mSupportVideoCalls;
    }

    public final int component129() {
        return this.mSupportRecordAudio;
    }

    public final int component13() {
        return this.mHideDigitalPower;
    }

    public final int component130() {
        return this.mSupportActivityRecognition;
    }

    public final int component131() {
        return this.mSupportMatchV3;
    }

    public final int component132() {
        return this.mSupportLaunchDeviceSport;
    }

    public final int component133() {
        return this.mSupportGetWatchFaceMaxSize;
    }

    public final int component134() {
        return this.mSupportHrvSet;
    }

    public final int component135() {
        return this.mSupportSleepSet;
    }

    public final int component136() {
        return this.mSupportVoiceControl;
    }

    public final int component137() {
        return this.mSupportSwitchPhoneAssistant;
    }

    public final int component138() {
        return this.mSupportWeChatCall;
    }

    public final int component139() {
        return this.mSupportAiOngoingDialogue;
    }

    public final int component14() {
        return this.mShowAntiLostSwitch;
    }

    public final int component140() {
        return this.mSupportGoogleNavigation;
    }

    public final int component141() {
        return this.mSupportSpecialSleepStructure;
    }

    public final int component142() {
        return this.mSupportInheritanceAgreement;
    }

    public final int component143() {
        return this.mSupportChargeWhileUsing;
    }

    public final int component144() {
        return this.mSupportCyWeeAlgorithm;
    }

    @aa1
    public final String component145() {
        return this.mSupportShowSNNumber;
    }

    public final int component146() {
        return this.mSupportReadOffLineMap;
    }

    public final int component147() {
        return this.mSupportGolfMapData;
    }

    public final int component148() {
        return this.mSupportNotSaveAPPSport;
    }

    public final int component149() {
        return this.mSupportNoiseSet;
    }

    public final int component15() {
        return this.mSleepAlgorithmType;
    }

    public final int component150() {
        return this.mSupportWearDetection;
    }

    public final int component151() {
        return this.mBlockSwimmingReminders;
    }

    public final int component152() {
        return this.mSupportEnergyRating;
    }

    public final int component153() {
        return this.mSupportAMapOfflineMap;
    }

    public final int component154() {
        return this.mSupportCyWeeAlgorithmGpsPush;
    }

    public final int component155() {
        return this.mSupportAppPushSwitch3;
    }

    public final int component156() {
        return this.mSupportHydrationReminder;
    }

    public final int component157() {
        return this.mSupportMeetingReminder;
    }

    public final int component158() {
        return this.mSupportOfflineAsrAuth;
    }

    public final int component16() {
        return this.mSupportDateFormatSet;
    }

    public final int component17() {
        return this.mSupportReadDeviceInfo;
    }

    public final int component18() {
        return this.mSupportTemperatureUnitSet;
    }

    public final int component19() {
        return this.mSupportDrinkWaterSet;
    }

    @aa1
    public final List<Integer> component2() {
        return this.mDataKeys;
    }

    public final int component20() {
        return this.mSupportChangeClassicBluetoothState;
    }

    public final int component21() {
        return this.mSupportAppSport;
    }

    public final int component22() {
        return this.mSupportBloodOxyGenSet;
    }

    public final int component23() {
        return this.mSupportWashSet;
    }

    public final int component24() {
        return this.mSupportRequestRealtimeWeather;
    }

    public final int component25() {
        return this.mSupportHID;
    }

    public final int component26() {
        return this.mSupportIBeaconSet;
    }

    public final int component27() {
        return this.mSupportWatchFaceId;
    }

    public final int component28() {
        return this.mSupportNewTransportMode;
    }

    public final int component29() {
        return this.mSupportJLTransport;
    }

    @aa1
    public final String component3() {
        return this.mBleName;
    }

    public final int component30() {
        return this.mSupportFindWatch;
    }

    public final int component31() {
        return this.mSupportWorldClock;
    }

    public final int component32() {
        return this.mSupportStock;
    }

    public final int component33() {
        return this.mSupportSMSQuickReply;
    }

    public final int component34() {
        return this.mSupportNoDisturbSet;
    }

    public final int component35() {
        return this.mSupportSetWatchPassword;
    }

    public final int component36() {
        return this.mSupportRealTimeMeasurement;
    }

    public final int component37() {
        return this.mSupportPowerSaveMode;
    }

    public final int component38() {
        return this.mSupportLoveTap;
    }

    public final int component39() {
        return this.mSupportNewsfeed;
    }

    @aa1
    public final String component4() {
        return this.mBleCustomName;
    }

    public final int component40() {
        return this.mSupportMedicationReminder;
    }

    public final int component41() {
        return this.mSupportQrcode;
    }

    public final int component42() {
        return this.mSupportWeather2;
    }

    public final int component43() {
        return this.mSupportAlipay;
    }

    public final int component44() {
        return this.mSupportStandbySet;
    }

    public final int component45() {
        return this.mSupport2DAcceleration;
    }

    public final int component46() {
        return this.mSupportTuyaKey;
    }

    public final int component47() {
        return this.mSupportMedicationAlarm;
    }

    public final int component48() {
        return this.mSupportReadPackageStatus;
    }

    public final int component49() {
        return this.mSupportContactSize;
    }

    @aa1
    public final String component5() {
        return this.mBleAddress;
    }

    public final int component50() {
        return this.mSupportVoice;
    }

    public final int component51() {
        return this.mSupportNavigation;
    }

    public final int component52() {
        return this.mSupportHrWarnSet;
    }

    public final int component54() {
        return this.mSupportMusicTransfer;
    }

    public final int component55() {
        return this.mSupportNoDisturbSet2;
    }

    public final int component56() {
        return this.mSupportSOSSet;
    }

    public final int component57() {
        return this.mSupportReadLanguages;
    }

    public final int component58() {
        return this.mSupportGirlCareReminder;
    }

    public final int component59() {
        return this.mSupportAppPushSwitch;
    }

    @aa1
    public final String component6() {
        return this.mPlatform;
    }

    public final int component60() {
        return this.mSupportReceiptCodeSize;
    }

    public final int component61() {
        return this.mSupportGameTimeReminder;
    }

    public final int component62() {
        return this.mSupportMyCardCodeSize;
    }

    public final int component63() {
        return this.mSupportDeviceSportData;
    }

    public final int component64() {
        return this.mSupportEbookTransfer;
    }

    public final int component65() {
        return this.mSupportDoubleScreen;
    }

    public final int component66() {
        return this.mSupportCustomLogo;
    }

    public final int component67() {
        return this.mSupportPressureTimingMeasurement;
    }

    public final int component68() {
        return this.mSupportTimerStandbySet;
    }

    public final int component69() {
        return this.mSupportSOSSet2;
    }

    @aa1
    public final String component7() {
        return this.mPrototype;
    }

    public final int component70() {
        return this.mSupportFallSet;
    }

    public final int component71() {
        return this.mSupportWalkAndBike;
    }

    public final int component72() {
        return this.mSupportConnectReminder;
    }

    public final int component73() {
        return this.mSupportSDCardInfo;
    }

    public final int component74() {
        return this.mSupportIncomingCallRing;
    }

    public final int component75() {
        return this.mSupportNotificationLightScreenSet;
    }

    public final int component76() {
        return this.mSupportBloodPressureCalibration;
    }

    public final int component77() {
        return this.mSupportOTAFile;
    }

    public final int component78() {
        return this.mSupportGPSFirmwareFile;
    }

    public final int component79() {
        return this.mSupportGoMoreSet;
    }

    @aa1
    public final String component8() {
        return this.mFirmwareFlag;
    }

    public final int component80() {
        return this.mSupportRingVibrationSet;
    }

    public final int component81() {
        return this.mSupportNetwork;
    }

    public final int component82() {
        return this.mSupportContactSort;
    }

    public final int component83() {
        return this.mQrcodeSize;
    }

    public final int component84() {
        return this.mQrcodeContentSize;
    }

    public final int component85() {
        return this.mSupportStringQrcode;
    }

    public final int component86() {
        return this.mSupportWatchFaceIndex;
    }

    public final int component87() {
        return this.mSupportSosContact;
    }

    public final int component88() {
        return this.mSupportGirlCareMonthly;
    }

    public final int component89() {
        return this.mSupportWearWay;
    }

    public final int component9() {
        return this.mAGpsType;
    }

    public final int component90() {
        return this.mSupportGestureWake2;
    }

    public final int component91() {
        return this.mSupportNavImage;
    }

    public final int component92() {
        return this.mSupportVoiceMaxLength;
    }

    public final int component93() {
        return this.mSupportAudioBooks;
    }

    public final int component94() {
        return this.mSupportStudyCards;
    }

    public final int component95() {
        return this.mSupportAppStore;
    }

    public final int component96() {
        return this.mSupportSHSYAlgorithm;
    }

    public final int component97() {
        return this.mSupportQiblaSet;
    }

    public final int component98() {
        return this.mSupportMeasurementBloodGlucose;
    }

    public final int component99() {
        return this.mSupportGameControls;
    }

    @aa1
    public final BleDeviceInfo copy(int i, @aa1 List<Integer> mDataKeys, @aa1 String mBleName, @aa1 String mBleCustomName, @aa1 String mBleAddress, @aa1 String mPlatform, @aa1 String mPrototype, @aa1 String mFirmwareFlag, int i2, long j, int i3, @aa1 String mClassicAddress, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, @aa1 String mBleDefaultName, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, int i110, int i111, int i112, int i113, int i114, int i115, int i116, int i117, int i118, int i119, int i120, int i121, int i122, int i123, int i124, int i125, int i126, int i127, int i128, int i129, int i130, int i131, int i132, int i133, int i134, @aa1 String mSupportShowSNNumber, int i135, int i136, int i137, int i138, int i139, int i140, int i141, int i142, int i143, int i144, int i145, int i146, int i147) {
        Intrinsics.X0O(mDataKeys, "mDataKeys");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mBleCustomName, "mBleCustomName");
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mPlatform, "mPlatform");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mClassicAddress, "mClassicAddress");
        Intrinsics.X0O(mBleDefaultName, "mBleDefaultName");
        Intrinsics.X0O(mSupportShowSNNumber, "mSupportShowSNNumber");
        return new BleDeviceInfo(i, mDataKeys, mBleName, mBleCustomName, mBleAddress, mPlatform, mPrototype, mFirmwareFlag, i2, j, i3, mClassicAddress, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i36, i37, i38, i39, i40, i41, i42, i43, mBleDefaultName, i44, i45, i46, i47, i48, i49, i50, i51, i52, i53, i54, i55, i56, i57, i58, i59, i60, i61, i62, i63, i64, i65, i66, i67, i68, i69, i70, i71, i72, i73, i74, i75, i76, i77, i78, i79, i80, i81, i82, i83, i84, i85, i86, i87, i88, i89, i90, i91, i92, i93, i94, i95, i96, i97, i98, i99, i100, i101, i102, i103, i104, i105, i106, i107, i108, i109, i110, i111, i112, i113, i114, i115, i116, i117, i118, i119, i120, i121, i122, i123, i124, i125, i126, i127, i128, i129, i130, i131, i132, i133, i134, mSupportShowSNNumber, i135, i136, i137, i138, i139, i140, i141, i142, i143, i144, i145, i146, i147);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mId = BleReadable.readInt32$default(this, null, 1, null);
        List<List> listX10i = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(readBytesUtil((byte) 0)), 2);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(listX10i, 10));
        for (List list : listX10i) {
            arrayList.add(Integer.valueOf((((Number) list.get(1)).byteValue() & 255) | ((((Number) list.get(0)).byteValue() & 255) << 8)));
        }
        this.mDataKeys = arrayList;
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        String stringUtil$default = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale locale = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale, "getDefault(...)");
        String upperCase = stringUtil$default.toUpperCase(locale);
        Intrinsics.O10IXXX0X(upperCase, "toUpperCase(...)");
        this.mBleAddress = upperCase;
        this.mPlatform = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mPrototype = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mAGpsType = readInt8();
        this.mIOBufferSize = BleReadable.readUInt16$default(this, null, 1, null);
        this.mWatchFaceType = readInt8();
        String stringUtil$default2 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale locale2 = Locale.getDefault();
        Intrinsics.O10IXXX0X(locale2, "getDefault(...)");
        String upperCase2 = stringUtil$default2.toUpperCase(locale2);
        Intrinsics.O10IXXX0X(upperCase2, "toUpperCase(...)");
        this.mClassicAddress = upperCase2;
        this.mHideDigitalPower = readInt8();
        this.mShowAntiLostSwitch = readInt8();
        this.mSleepAlgorithmType = readInt8();
        this.mSupportDateFormatSet = readInt8();
        this.mSupportReadDeviceInfo = readInt8();
        this.mSupportTemperatureUnitSet = readInt8();
        this.mSupportDrinkWaterSet = readInt8();
        this.mSupportChangeClassicBluetoothState = readInt8();
        this.mSupportAppSport = readInt8();
        this.mSupportBloodOxyGenSet = readInt8();
        this.mSupportWashSet = readInt8();
        this.mSupportRequestRealtimeWeather = readInt8();
        this.mSupportHID = readInt8();
        this.mSupportIBeaconSet = readInt8();
        this.mSupportWatchFaceId = readInt8();
        this.mSupportNewTransportMode = readInt8();
        this.mSupportJLTransport = readInt8();
        this.mSupportFindWatch = readInt8();
        this.mSupportWorldClock = readInt8();
        this.mSupportStock = readInt8();
        this.mSupportSMSQuickReply = readInt8();
        this.mSupportNoDisturbSet = readInt8();
        this.mSupportSetWatchPassword = readInt8();
        this.mSupportRealTimeMeasurement = readInt8();
        this.mSupportPowerSaveMode = readInt8();
        this.mSupportLoveTap = readInt8();
        this.mSupportNewsfeed = readInt8();
        this.mSupportMedicationReminder = readInt8();
        this.mSupportQrcode = readInt8();
        this.mSupportWeather2 = readInt8();
        this.mSupportAlipay = readInt8();
        this.mSupportStandbySet = readInt8();
        this.mSupport2DAcceleration = readInt8();
        this.mSupportTuyaKey = readInt8();
        this.mSupportMedicationAlarm = readInt8();
        this.mSupportReadPackageStatus = readInt8();
        this.mSupportContactSize = readInt8() * 10;
        this.mSupportVoice = readInt8();
        this.mSupportNavigation = readInt8();
        this.mSupportHrWarnSet = readInt8();
        if (StringsKt__StringsKt.iIi011O(this.mFirmwareFlag, RAW_NAME_SEPARATOR, false, 2, null)) {
            String str = (String) StringsKt__StringsKt.i1I(this.mFirmwareFlag, new String[]{RAW_NAME_SEPARATOR}, false, 0, 6, null).get(1);
            if (!TextUtils.isEmpty(str) && !Intrinsics.XOO0ii0(str, this.mBleName)) {
                this.mBleCustomName = this.mBleName;
                this.mBleName = str;
            }
        }
        String stringUtil$default3 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mBleDefaultName = stringUtil$default3;
        if (!TextUtils.isEmpty(stringUtil$default3)) {
            this.mBleCustomName = this.mBleName;
            this.mBleName = this.mBleDefaultName;
        }
        this.mSupportMusicTransfer = readInt8();
        this.mSupportNoDisturbSet2 = readInt8();
        this.mSupportSOSSet = readInt8();
        this.mSupportReadLanguages = readInt8();
        this.mSupportGirlCareReminder = readInt8();
        this.mSupportAppPushSwitch = readInt8();
        this.mSupportReceiptCodeSize = readInt8();
        this.mSupportGameTimeReminder = readInt8();
        this.mSupportMyCardCodeSize = readInt8();
        this.mSupportDeviceSportData = readInt8();
        this.mSupportEbookTransfer = readInt8();
        this.mSupportDoubleScreen = readInt8();
        this.mSupportCustomLogo = readInt8();
        this.mSupportPressureTimingMeasurement = readInt8();
        this.mSupportTimerStandbySet = readInt8();
        this.mSupportSOSSet2 = readInt8();
        this.mSupportFallSet = readInt8();
        this.mSupportWalkAndBike = readInt8();
        this.mSupportConnectReminder = readInt8();
        this.mSupportSDCardInfo = readInt8();
        this.mSupportIncomingCallRing = readInt8();
        this.mSupportNotificationLightScreenSet = readInt8();
        this.mSupportBloodPressureCalibration = readInt8();
        this.mSupportOTAFile = readInt8();
        this.mSupportGPSFirmwareFile = readInt8();
        this.mSupportGoMoreSet = readInt8();
        this.mSupportRingVibrationSet = readInt8();
        this.mSupportNetwork = readInt8();
        this.mSupportContactSort = readInt8();
        this.mQrcodeSize = readInt8();
        this.mQrcodeContentSize = readUInt8();
        this.mSupportStringQrcode = readInt8();
        this.mSupportWatchFaceIndex = readInt8();
        this.mSupportSosContact = readInt8();
        this.mSupportGirlCareMonthly = readInt8();
        this.mSupportWearWay = readInt8();
        this.mSupportGestureWake2 = readInt8();
        this.mSupportNavImage = readInt8();
        this.mSupportVoiceMaxLength = readInt8();
        this.mSupportAudioBooks = readInt8();
        this.mSupportStudyCards = readInt8();
        this.mSupportAppStore = readInt8();
        this.mSupportSHSYAlgorithm = readInt8();
        this.mSupportQiblaSet = readInt8();
        this.mSupportMeasurementBloodGlucose = readInt8();
        this.mSupportGameControls = readInt8();
        this.mSupportBatteryUsage = readInt8();
        this.mSupportAITranslation = readInt8();
        this.mSupportSimultaneousTranslation = readInt8();
        this.mSupportTouchSet = readInt8();
        this.mSupportIMEISet = readInt8();
        this.mSupportQuran = readInt8();
        this.mSupportSyncAGPSInBackground = readInt8();
        this.mSupportRestoreFactory = readInt8();
        this.mSupportRecordNote = readInt8();
        this.mSupportSleepScore = readInt8();
        this.mSupportWatchface2 = readInt8();
        this.mSupportAICoach = readInt8();
        this.mSupportCrossAppTranslation = readInt8();
        this.mSupportRelaxReminder = readInt8();
        this.mSupportPower2 = readInt8();
        this.mSupportWeChat = readInt8();
        this.mSupportWhatsApp = readInt8();
        this.mSupportReadLanguages2 = readInt8();
        this.mSupportTimeFormat = readInt8();
        this.mSupportVibrationIntensity = readInt8();
        this.mSupportHighAntiAssist = readInt8();
        this.mSupportWechatPay = readInt8();
        this.mSupportVitalityValue = readInt8();
        this.mSupportHRDetectionMode = readInt8();
        this.mSupportAICoachV2 = readInt8();
        this.mSupportRespiratoryRate = readInt8();
        this.mSupportPhysicalStrength = readInt8();
        this.mSupportIPC = readInt8();
        this.mSupportVideoCalls = readInt8();
        this.mSupportRecordAudio = readInt8();
        this.mSupportActivityRecognition = readInt8();
        this.mSupportMatchV3 = readInt8();
        this.mSupportLaunchDeviceSport = readInt8();
        this.mSupportGetWatchFaceMaxSize = readInt8();
        this.mSupportHrvSet = readInt8();
        this.mSupportSleepSet = readInt8();
        this.mSupportVoiceControl = readInt8();
        this.mSupportSwitchPhoneAssistant = readInt8();
        this.mSupportWeChatCall = readInt8();
        this.mSupportAiOngoingDialogue = readInt8();
        this.mSupportGoogleNavigation = readInt8();
        this.mSupportSpecialSleepStructure = readInt8();
        this.mSupportInheritanceAgreement = readInt8();
        this.mSupportChargeWhileUsing = readInt8();
        this.mSupportCyWeeAlgorithm = readInt8();
        this.mSupportShowSNNumber = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mSupportReadOffLineMap = readInt8();
        this.mSupportGolfMapData = readInt8();
        this.mSupportNotSaveAPPSport = readInt8();
        this.mSupportNoiseSet = readInt8();
        this.mSupportWearDetection = readInt8();
        this.mBlockSwimmingReminders = readInt8();
        this.mSupportEnergyRating = readInt8();
        this.mSupportAMapOfflineMap = readInt8();
        this.mSupportCyWeeAlgorithmGpsPush = readInt8();
        this.mSupportAppPushSwitch3 = readInt8();
        this.mSupportHydrationReminder = readInt8();
        this.mSupportMeetingReminder = readInt8();
        this.mSupportOfflineAsrAuth = readInt8();
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleDeviceInfo)) {
            return false;
        }
        BleDeviceInfo bleDeviceInfo = (BleDeviceInfo) obj;
        return this.mId == bleDeviceInfo.mId && Intrinsics.XOO0ii0(this.mDataKeys, bleDeviceInfo.mDataKeys) && Intrinsics.XOO0ii0(this.mBleName, bleDeviceInfo.mBleName) && Intrinsics.XOO0ii0(this.mBleCustomName, bleDeviceInfo.mBleCustomName) && Intrinsics.XOO0ii0(this.mBleAddress, bleDeviceInfo.mBleAddress) && Intrinsics.XOO0ii0(this.mPlatform, bleDeviceInfo.mPlatform) && Intrinsics.XOO0ii0(this.mPrototype, bleDeviceInfo.mPrototype) && Intrinsics.XOO0ii0(this.mFirmwareFlag, bleDeviceInfo.mFirmwareFlag) && this.mAGpsType == bleDeviceInfo.mAGpsType && this.mIOBufferSize == bleDeviceInfo.mIOBufferSize && this.mWatchFaceType == bleDeviceInfo.mWatchFaceType && Intrinsics.XOO0ii0(this.mClassicAddress, bleDeviceInfo.mClassicAddress) && this.mHideDigitalPower == bleDeviceInfo.mHideDigitalPower && this.mShowAntiLostSwitch == bleDeviceInfo.mShowAntiLostSwitch && this.mSleepAlgorithmType == bleDeviceInfo.mSleepAlgorithmType && this.mSupportDateFormatSet == bleDeviceInfo.mSupportDateFormatSet && this.mSupportReadDeviceInfo == bleDeviceInfo.mSupportReadDeviceInfo && this.mSupportTemperatureUnitSet == bleDeviceInfo.mSupportTemperatureUnitSet && this.mSupportDrinkWaterSet == bleDeviceInfo.mSupportDrinkWaterSet && this.mSupportChangeClassicBluetoothState == bleDeviceInfo.mSupportChangeClassicBluetoothState && this.mSupportAppSport == bleDeviceInfo.mSupportAppSport && this.mSupportBloodOxyGenSet == bleDeviceInfo.mSupportBloodOxyGenSet && this.mSupportWashSet == bleDeviceInfo.mSupportWashSet && this.mSupportRequestRealtimeWeather == bleDeviceInfo.mSupportRequestRealtimeWeather && this.mSupportHID == bleDeviceInfo.mSupportHID && this.mSupportIBeaconSet == bleDeviceInfo.mSupportIBeaconSet && this.mSupportWatchFaceId == bleDeviceInfo.mSupportWatchFaceId && this.mSupportNewTransportMode == bleDeviceInfo.mSupportNewTransportMode && this.mSupportJLTransport == bleDeviceInfo.mSupportJLTransport && this.mSupportFindWatch == bleDeviceInfo.mSupportFindWatch && this.mSupportWorldClock == bleDeviceInfo.mSupportWorldClock && this.mSupportStock == bleDeviceInfo.mSupportStock && this.mSupportSMSQuickReply == bleDeviceInfo.mSupportSMSQuickReply && this.mSupportNoDisturbSet == bleDeviceInfo.mSupportNoDisturbSet && this.mSupportSetWatchPassword == bleDeviceInfo.mSupportSetWatchPassword && this.mSupportRealTimeMeasurement == bleDeviceInfo.mSupportRealTimeMeasurement && this.mSupportPowerSaveMode == bleDeviceInfo.mSupportPowerSaveMode && this.mSupportLoveTap == bleDeviceInfo.mSupportLoveTap && this.mSupportNewsfeed == bleDeviceInfo.mSupportNewsfeed && this.mSupportMedicationReminder == bleDeviceInfo.mSupportMedicationReminder && this.mSupportQrcode == bleDeviceInfo.mSupportQrcode && this.mSupportWeather2 == bleDeviceInfo.mSupportWeather2 && this.mSupportAlipay == bleDeviceInfo.mSupportAlipay && this.mSupportStandbySet == bleDeviceInfo.mSupportStandbySet && this.mSupport2DAcceleration == bleDeviceInfo.mSupport2DAcceleration && this.mSupportTuyaKey == bleDeviceInfo.mSupportTuyaKey && this.mSupportMedicationAlarm == bleDeviceInfo.mSupportMedicationAlarm && this.mSupportReadPackageStatus == bleDeviceInfo.mSupportReadPackageStatus && this.mSupportContactSize == bleDeviceInfo.mSupportContactSize && this.mSupportVoice == bleDeviceInfo.mSupportVoice && this.mSupportNavigation == bleDeviceInfo.mSupportNavigation && this.mSupportHrWarnSet == bleDeviceInfo.mSupportHrWarnSet && Intrinsics.XOO0ii0(this.mBleDefaultName, bleDeviceInfo.mBleDefaultName) && this.mSupportMusicTransfer == bleDeviceInfo.mSupportMusicTransfer && this.mSupportNoDisturbSet2 == bleDeviceInfo.mSupportNoDisturbSet2 && this.mSupportSOSSet == bleDeviceInfo.mSupportSOSSet && this.mSupportReadLanguages == bleDeviceInfo.mSupportReadLanguages && this.mSupportGirlCareReminder == bleDeviceInfo.mSupportGirlCareReminder && this.mSupportAppPushSwitch == bleDeviceInfo.mSupportAppPushSwitch && this.mSupportReceiptCodeSize == bleDeviceInfo.mSupportReceiptCodeSize && this.mSupportGameTimeReminder == bleDeviceInfo.mSupportGameTimeReminder && this.mSupportMyCardCodeSize == bleDeviceInfo.mSupportMyCardCodeSize && this.mSupportDeviceSportData == bleDeviceInfo.mSupportDeviceSportData && this.mSupportEbookTransfer == bleDeviceInfo.mSupportEbookTransfer && this.mSupportDoubleScreen == bleDeviceInfo.mSupportDoubleScreen && this.mSupportCustomLogo == bleDeviceInfo.mSupportCustomLogo && this.mSupportPressureTimingMeasurement == bleDeviceInfo.mSupportPressureTimingMeasurement && this.mSupportTimerStandbySet == bleDeviceInfo.mSupportTimerStandbySet && this.mSupportSOSSet2 == bleDeviceInfo.mSupportSOSSet2 && this.mSupportFallSet == bleDeviceInfo.mSupportFallSet && this.mSupportWalkAndBike == bleDeviceInfo.mSupportWalkAndBike && this.mSupportConnectReminder == bleDeviceInfo.mSupportConnectReminder && this.mSupportSDCardInfo == bleDeviceInfo.mSupportSDCardInfo && this.mSupportIncomingCallRing == bleDeviceInfo.mSupportIncomingCallRing && this.mSupportNotificationLightScreenSet == bleDeviceInfo.mSupportNotificationLightScreenSet && this.mSupportBloodPressureCalibration == bleDeviceInfo.mSupportBloodPressureCalibration && this.mSupportOTAFile == bleDeviceInfo.mSupportOTAFile && this.mSupportGPSFirmwareFile == bleDeviceInfo.mSupportGPSFirmwareFile && this.mSupportGoMoreSet == bleDeviceInfo.mSupportGoMoreSet && this.mSupportRingVibrationSet == bleDeviceInfo.mSupportRingVibrationSet && this.mSupportNetwork == bleDeviceInfo.mSupportNetwork && this.mSupportContactSort == bleDeviceInfo.mSupportContactSort && this.mQrcodeSize == bleDeviceInfo.mQrcodeSize && this.mQrcodeContentSize == bleDeviceInfo.mQrcodeContentSize && this.mSupportStringQrcode == bleDeviceInfo.mSupportStringQrcode && this.mSupportWatchFaceIndex == bleDeviceInfo.mSupportWatchFaceIndex && this.mSupportSosContact == bleDeviceInfo.mSupportSosContact && this.mSupportGirlCareMonthly == bleDeviceInfo.mSupportGirlCareMonthly && this.mSupportWearWay == bleDeviceInfo.mSupportWearWay && this.mSupportGestureWake2 == bleDeviceInfo.mSupportGestureWake2 && this.mSupportNavImage == bleDeviceInfo.mSupportNavImage && this.mSupportVoiceMaxLength == bleDeviceInfo.mSupportVoiceMaxLength && this.mSupportAudioBooks == bleDeviceInfo.mSupportAudioBooks && this.mSupportStudyCards == bleDeviceInfo.mSupportStudyCards && this.mSupportAppStore == bleDeviceInfo.mSupportAppStore && this.mSupportSHSYAlgorithm == bleDeviceInfo.mSupportSHSYAlgorithm && this.mSupportQiblaSet == bleDeviceInfo.mSupportQiblaSet && this.mSupportMeasurementBloodGlucose == bleDeviceInfo.mSupportMeasurementBloodGlucose && this.mSupportGameControls == bleDeviceInfo.mSupportGameControls && this.mSupportBatteryUsage == bleDeviceInfo.mSupportBatteryUsage && this.mSupportAITranslation == bleDeviceInfo.mSupportAITranslation && this.mSupportSimultaneousTranslation == bleDeviceInfo.mSupportSimultaneousTranslation && this.mSupportTouchSet == bleDeviceInfo.mSupportTouchSet && this.mSupportIMEISet == bleDeviceInfo.mSupportIMEISet && this.mSupportQuran == bleDeviceInfo.mSupportQuran && this.mSupportSyncAGPSInBackground == bleDeviceInfo.mSupportSyncAGPSInBackground && this.mSupportRestoreFactory == bleDeviceInfo.mSupportRestoreFactory && this.mSupportRecordNote == bleDeviceInfo.mSupportRecordNote && this.mSupportSleepScore == bleDeviceInfo.mSupportSleepScore && this.mSupportWatchface2 == bleDeviceInfo.mSupportWatchface2 && this.mSupportAICoach == bleDeviceInfo.mSupportAICoach && this.mSupportCrossAppTranslation == bleDeviceInfo.mSupportCrossAppTranslation && this.mSupportRelaxReminder == bleDeviceInfo.mSupportRelaxReminder && this.mSupportPower2 == bleDeviceInfo.mSupportPower2 && this.mSupportWeChat == bleDeviceInfo.mSupportWeChat && this.mSupportWhatsApp == bleDeviceInfo.mSupportWhatsApp && this.mSupportReadLanguages2 == bleDeviceInfo.mSupportReadLanguages2 && this.mSupportTimeFormat == bleDeviceInfo.mSupportTimeFormat && this.mSupportVibrationIntensity == bleDeviceInfo.mSupportVibrationIntensity && this.mSupportHighAntiAssist == bleDeviceInfo.mSupportHighAntiAssist && this.mSupportWechatPay == bleDeviceInfo.mSupportWechatPay && this.mSupportVitalityValue == bleDeviceInfo.mSupportVitalityValue && this.mSupportHRDetectionMode == bleDeviceInfo.mSupportHRDetectionMode && this.mSupportAICoachV2 == bleDeviceInfo.mSupportAICoachV2 && this.mSupportRespiratoryRate == bleDeviceInfo.mSupportRespiratoryRate && this.mSupportPhysicalStrength == bleDeviceInfo.mSupportPhysicalStrength && this.mSupportIPC == bleDeviceInfo.mSupportIPC && this.mSupportVideoCalls == bleDeviceInfo.mSupportVideoCalls && this.mSupportRecordAudio == bleDeviceInfo.mSupportRecordAudio && this.mSupportActivityRecognition == bleDeviceInfo.mSupportActivityRecognition && this.mSupportMatchV3 == bleDeviceInfo.mSupportMatchV3 && this.mSupportLaunchDeviceSport == bleDeviceInfo.mSupportLaunchDeviceSport && this.mSupportGetWatchFaceMaxSize == bleDeviceInfo.mSupportGetWatchFaceMaxSize && this.mSupportHrvSet == bleDeviceInfo.mSupportHrvSet && this.mSupportSleepSet == bleDeviceInfo.mSupportSleepSet && this.mSupportVoiceControl == bleDeviceInfo.mSupportVoiceControl && this.mSupportSwitchPhoneAssistant == bleDeviceInfo.mSupportSwitchPhoneAssistant && this.mSupportWeChatCall == bleDeviceInfo.mSupportWeChatCall && this.mSupportAiOngoingDialogue == bleDeviceInfo.mSupportAiOngoingDialogue && this.mSupportGoogleNavigation == bleDeviceInfo.mSupportGoogleNavigation && this.mSupportSpecialSleepStructure == bleDeviceInfo.mSupportSpecialSleepStructure && this.mSupportInheritanceAgreement == bleDeviceInfo.mSupportInheritanceAgreement && this.mSupportChargeWhileUsing == bleDeviceInfo.mSupportChargeWhileUsing && this.mSupportCyWeeAlgorithm == bleDeviceInfo.mSupportCyWeeAlgorithm && Intrinsics.XOO0ii0(this.mSupportShowSNNumber, bleDeviceInfo.mSupportShowSNNumber) && this.mSupportReadOffLineMap == bleDeviceInfo.mSupportReadOffLineMap && this.mSupportGolfMapData == bleDeviceInfo.mSupportGolfMapData && this.mSupportNotSaveAPPSport == bleDeviceInfo.mSupportNotSaveAPPSport && this.mSupportNoiseSet == bleDeviceInfo.mSupportNoiseSet && this.mSupportWearDetection == bleDeviceInfo.mSupportWearDetection && this.mBlockSwimmingReminders == bleDeviceInfo.mBlockSwimmingReminders && this.mSupportEnergyRating == bleDeviceInfo.mSupportEnergyRating && this.mSupportAMapOfflineMap == bleDeviceInfo.mSupportAMapOfflineMap && this.mSupportCyWeeAlgorithmGpsPush == bleDeviceInfo.mSupportCyWeeAlgorithmGpsPush && this.mSupportAppPushSwitch3 == bleDeviceInfo.mSupportAppPushSwitch3 && this.mSupportHydrationReminder == bleDeviceInfo.mSupportHydrationReminder && this.mSupportMeetingReminder == bleDeviceInfo.mSupportMeetingReminder && this.mSupportOfflineAsrAuth == bleDeviceInfo.mSupportOfflineAsrAuth;
    }

    public final int getMAGpsType() {
        return this.mAGpsType;
    }

    @aa1
    public final String getMBleAddress() {
        return this.mBleAddress;
    }

    @aa1
    public final String getMBleCustomName() {
        return this.mBleCustomName;
    }

    @aa1
    public final String getMBleName() {
        return this.mBleName;
    }

    public final int getMBlockSwimmingReminders() {
        return this.mBlockSwimmingReminders;
    }

    @aa1
    public final String getMClassicAddress() {
        return this.mClassicAddress;
    }

    @aa1
    public final List<Integer> getMDataKeys() {
        return this.mDataKeys;
    }

    @aa1
    public final String getMFirmwareFlag() {
        return this.mFirmwareFlag;
    }

    public final int getMHideDigitalPower() {
        return this.mHideDigitalPower;
    }

    public final long getMIOBufferSize() {
        return this.mIOBufferSize;
    }

    public final int getMId() {
        return this.mId;
    }

    @aa1
    public final String getMPlatform() {
        return this.mPlatform;
    }

    @aa1
    public final String getMPrototype() {
        return this.mPrototype;
    }

    public final int getMQrcodeContentSize() {
        return this.mQrcodeContentSize;
    }

    public final int getMQrcodeSize() {
        return this.mQrcodeSize;
    }

    public final int getMShowAntiLostSwitch() {
        return this.mShowAntiLostSwitch;
    }

    public final int getMSleepAlgorithmType() {
        return this.mSleepAlgorithmType;
    }

    public final int getMSupport2DAcceleration() {
        return this.mSupport2DAcceleration;
    }

    public final int getMSupportAICoach() {
        return this.mSupportAICoach;
    }

    public final int getMSupportAICoachV2() {
        return this.mSupportAICoachV2;
    }

    public final int getMSupportAITranslation() {
        return this.mSupportAITranslation;
    }

    public final int getMSupportAMapOfflineMap() {
        return this.mSupportAMapOfflineMap;
    }

    public final int getMSupportActivityRecognition() {
        return this.mSupportActivityRecognition;
    }

    public final int getMSupportAiOngoingDialogue() {
        return this.mSupportAiOngoingDialogue;
    }

    public final int getMSupportAlipay() {
        return this.mSupportAlipay;
    }

    public final int getMSupportAppPushSwitch() {
        return this.mSupportAppPushSwitch;
    }

    public final int getMSupportAppPushSwitch3() {
        return this.mSupportAppPushSwitch3;
    }

    public final int getMSupportAppSport() {
        return this.mSupportAppSport;
    }

    public final int getMSupportAppStore() {
        return this.mSupportAppStore;
    }

    public final int getMSupportAudioBooks() {
        return this.mSupportAudioBooks;
    }

    public final int getMSupportBatteryUsage() {
        return this.mSupportBatteryUsage;
    }

    public final int getMSupportBloodOxyGenSet() {
        return this.mSupportBloodOxyGenSet;
    }

    public final int getMSupportBloodPressureCalibration() {
        return this.mSupportBloodPressureCalibration;
    }

    public final int getMSupportChangeClassicBluetoothState() {
        return this.mSupportChangeClassicBluetoothState;
    }

    public final int getMSupportChargeWhileUsing() {
        return this.mSupportChargeWhileUsing;
    }

    public final int getMSupportConnectReminder() {
        return this.mSupportConnectReminder;
    }

    public final int getMSupportContactSize() {
        return this.mSupportContactSize;
    }

    public final int getMSupportContactSort() {
        return this.mSupportContactSort;
    }

    public final int getMSupportCrossAppTranslation() {
        return this.mSupportCrossAppTranslation;
    }

    public final int getMSupportCustomLogo() {
        return this.mSupportCustomLogo;
    }

    public final int getMSupportCyWeeAlgorithm() {
        return this.mSupportCyWeeAlgorithm;
    }

    public final int getMSupportCyWeeAlgorithmGpsPush() {
        return this.mSupportCyWeeAlgorithmGpsPush;
    }

    public final int getMSupportDateFormatSet() {
        return this.mSupportDateFormatSet;
    }

    public final int getMSupportDeviceSportData() {
        return this.mSupportDeviceSportData;
    }

    public final int getMSupportDoubleScreen() {
        return this.mSupportDoubleScreen;
    }

    public final int getMSupportDrinkWaterSet() {
        return this.mSupportDrinkWaterSet;
    }

    public final int getMSupportEbookTransfer() {
        return this.mSupportEbookTransfer;
    }

    public final int getMSupportEnergyRating() {
        return this.mSupportEnergyRating;
    }

    public final int getMSupportFallSet() {
        return this.mSupportFallSet;
    }

    public final int getMSupportFindWatch() {
        return this.mSupportFindWatch;
    }

    public final int getMSupportGPSFirmwareFile() {
        return this.mSupportGPSFirmwareFile;
    }

    public final int getMSupportGameControls() {
        return this.mSupportGameControls;
    }

    public final int getMSupportGameTimeReminder() {
        return this.mSupportGameTimeReminder;
    }

    public final int getMSupportGestureWake2() {
        return this.mSupportGestureWake2;
    }

    public final int getMSupportGetWatchFaceMaxSize() {
        return this.mSupportGetWatchFaceMaxSize;
    }

    public final int getMSupportGirlCareMonthly() {
        return this.mSupportGirlCareMonthly;
    }

    public final int getMSupportGirlCareReminder() {
        return this.mSupportGirlCareReminder;
    }

    public final int getMSupportGoMoreSet() {
        return this.mSupportGoMoreSet;
    }

    public final int getMSupportGolfMapData() {
        return this.mSupportGolfMapData;
    }

    public final int getMSupportGoogleNavigation() {
        return this.mSupportGoogleNavigation;
    }

    public final int getMSupportHID() {
        return this.mSupportHID;
    }

    public final int getMSupportHRDetectionMode() {
        return this.mSupportHRDetectionMode;
    }

    public final int getMSupportHighAntiAssist() {
        return this.mSupportHighAntiAssist;
    }

    public final int getMSupportHrWarnSet() {
        return this.mSupportHrWarnSet;
    }

    public final int getMSupportHrvSet() {
        return this.mSupportHrvSet;
    }

    public final int getMSupportHydrationReminder() {
        return this.mSupportHydrationReminder;
    }

    public final int getMSupportIBeaconSet() {
        return this.mSupportIBeaconSet;
    }

    public final int getMSupportIMEISet() {
        return this.mSupportIMEISet;
    }

    public final int getMSupportIPC() {
        return this.mSupportIPC;
    }

    public final int getMSupportIncomingCallRing() {
        return this.mSupportIncomingCallRing;
    }

    public final int getMSupportInheritanceAgreement() {
        return this.mSupportInheritanceAgreement;
    }

    public final int getMSupportJLTransport() {
        return this.mSupportJLTransport;
    }

    public final int getMSupportLaunchDeviceSport() {
        return this.mSupportLaunchDeviceSport;
    }

    public final int getMSupportLoveTap() {
        return this.mSupportLoveTap;
    }

    public final int getMSupportMatchV3() {
        return this.mSupportMatchV3;
    }

    public final int getMSupportMeasurementBloodGlucose() {
        return this.mSupportMeasurementBloodGlucose;
    }

    public final int getMSupportMedicationAlarm() {
        return this.mSupportMedicationAlarm;
    }

    public final int getMSupportMedicationReminder() {
        return this.mSupportMedicationReminder;
    }

    public final int getMSupportMeetingReminder() {
        return this.mSupportMeetingReminder;
    }

    public final int getMSupportMusicTransfer() {
        return this.mSupportMusicTransfer;
    }

    public final int getMSupportMyCardCodeSize() {
        return this.mSupportMyCardCodeSize;
    }

    public final int getMSupportNavImage() {
        return this.mSupportNavImage;
    }

    public final int getMSupportNavigation() {
        return this.mSupportNavigation;
    }

    public final int getMSupportNetwork() {
        return this.mSupportNetwork;
    }

    public final int getMSupportNewTransportMode() {
        return this.mSupportNewTransportMode;
    }

    public final int getMSupportNewsfeed() {
        return this.mSupportNewsfeed;
    }

    public final int getMSupportNoDisturbSet() {
        return this.mSupportNoDisturbSet;
    }

    public final int getMSupportNoDisturbSet2() {
        return this.mSupportNoDisturbSet2;
    }

    public final int getMSupportNoiseSet() {
        return this.mSupportNoiseSet;
    }

    public final int getMSupportNotSaveAPPSport() {
        return this.mSupportNotSaveAPPSport;
    }

    public final int getMSupportNotificationLightScreenSet() {
        return this.mSupportNotificationLightScreenSet;
    }

    public final int getMSupportOTAFile() {
        return this.mSupportOTAFile;
    }

    public final int getMSupportOfflineAsrAuth() {
        return this.mSupportOfflineAsrAuth;
    }

    public final int getMSupportPhysicalStrength() {
        return this.mSupportPhysicalStrength;
    }

    public final int getMSupportPower2() {
        return this.mSupportPower2;
    }

    public final int getMSupportPowerSaveMode() {
        return this.mSupportPowerSaveMode;
    }

    public final int getMSupportPressureTimingMeasurement() {
        return this.mSupportPressureTimingMeasurement;
    }

    public final int getMSupportQiblaSet() {
        return this.mSupportQiblaSet;
    }

    public final int getMSupportQrcode() {
        return this.mSupportQrcode;
    }

    public final int getMSupportQuran() {
        return this.mSupportQuran;
    }

    public final int getMSupportReadDeviceInfo() {
        return this.mSupportReadDeviceInfo;
    }

    public final int getMSupportReadLanguages() {
        return this.mSupportReadLanguages;
    }

    public final int getMSupportReadLanguages2() {
        return this.mSupportReadLanguages2;
    }

    public final int getMSupportReadOffLineMap() {
        return this.mSupportReadOffLineMap;
    }

    public final int getMSupportReadPackageStatus() {
        return this.mSupportReadPackageStatus;
    }

    public final int getMSupportRealTimeMeasurement() {
        return this.mSupportRealTimeMeasurement;
    }

    public final int getMSupportReceiptCodeSize() {
        return this.mSupportReceiptCodeSize;
    }

    public final int getMSupportRecordAudio() {
        return this.mSupportRecordAudio;
    }

    public final int getMSupportRecordNote() {
        return this.mSupportRecordNote;
    }

    public final int getMSupportRelaxReminder() {
        return this.mSupportRelaxReminder;
    }

    public final int getMSupportRequestRealtimeWeather() {
        return this.mSupportRequestRealtimeWeather;
    }

    public final int getMSupportRespiratoryRate() {
        return this.mSupportRespiratoryRate;
    }

    public final int getMSupportRestoreFactory() {
        return this.mSupportRestoreFactory;
    }

    public final int getMSupportRingVibrationSet() {
        return this.mSupportRingVibrationSet;
    }

    public final int getMSupportSDCardInfo() {
        return this.mSupportSDCardInfo;
    }

    public final int getMSupportSHSYAlgorithm() {
        return this.mSupportSHSYAlgorithm;
    }

    public final int getMSupportSMSQuickReply() {
        return this.mSupportSMSQuickReply;
    }

    public final int getMSupportSOSSet() {
        return this.mSupportSOSSet;
    }

    public final int getMSupportSOSSet2() {
        return this.mSupportSOSSet2;
    }

    public final int getMSupportSetWatchPassword() {
        return this.mSupportSetWatchPassword;
    }

    @aa1
    public final String getMSupportShowSNNumber() {
        return this.mSupportShowSNNumber;
    }

    public final int getMSupportSimultaneousTranslation() {
        return this.mSupportSimultaneousTranslation;
    }

    public final int getMSupportSleepScore() {
        return this.mSupportSleepScore;
    }

    public final int getMSupportSleepSet() {
        return this.mSupportSleepSet;
    }

    public final int getMSupportSosContact() {
        return this.mSupportSosContact;
    }

    public final int getMSupportSpecialSleepStructure() {
        return this.mSupportSpecialSleepStructure;
    }

    public final int getMSupportStandbySet() {
        return this.mSupportStandbySet;
    }

    public final int getMSupportStock() {
        return this.mSupportStock;
    }

    public final int getMSupportStringQrcode() {
        return this.mSupportStringQrcode;
    }

    public final int getMSupportStudyCards() {
        return this.mSupportStudyCards;
    }

    public final int getMSupportSwitchPhoneAssistant() {
        return this.mSupportSwitchPhoneAssistant;
    }

    public final int getMSupportSyncAGPSInBackground() {
        return this.mSupportSyncAGPSInBackground;
    }

    public final int getMSupportTemperatureUnitSet() {
        return this.mSupportTemperatureUnitSet;
    }

    public final int getMSupportTimeFormat() {
        return this.mSupportTimeFormat;
    }

    public final int getMSupportTimerStandbySet() {
        return this.mSupportTimerStandbySet;
    }

    public final int getMSupportTouchSet() {
        return this.mSupportTouchSet;
    }

    public final int getMSupportTuyaKey() {
        return this.mSupportTuyaKey;
    }

    public final int getMSupportVibrationIntensity() {
        return this.mSupportVibrationIntensity;
    }

    public final int getMSupportVideoCalls() {
        return this.mSupportVideoCalls;
    }

    public final int getMSupportVitalityValue() {
        return this.mSupportVitalityValue;
    }

    public final int getMSupportVoice() {
        return this.mSupportVoice;
    }

    public final int getMSupportVoiceControl() {
        return this.mSupportVoiceControl;
    }

    public final int getMSupportVoiceMaxLength() {
        return this.mSupportVoiceMaxLength;
    }

    public final int getMSupportWalkAndBike() {
        return this.mSupportWalkAndBike;
    }

    public final int getMSupportWashSet() {
        return this.mSupportWashSet;
    }

    public final int getMSupportWatchFaceId() {
        return this.mSupportWatchFaceId;
    }

    public final int getMSupportWatchFaceIndex() {
        return this.mSupportWatchFaceIndex;
    }

    public final int getMSupportWatchface2() {
        return this.mSupportWatchface2;
    }

    public final int getMSupportWeChat() {
        return this.mSupportWeChat;
    }

    public final int getMSupportWeChatCall() {
        return this.mSupportWeChatCall;
    }

    public final int getMSupportWearDetection() {
        return this.mSupportWearDetection;
    }

    public final int getMSupportWearWay() {
        return this.mSupportWearWay;
    }

    public final int getMSupportWeather2() {
        return this.mSupportWeather2;
    }

    public final int getMSupportWechatPay() {
        return this.mSupportWechatPay;
    }

    public final int getMSupportWhatsApp() {
        return this.mSupportWhatsApp;
    }

    public final int getMSupportWorldClock() {
        return this.mSupportWorldClock;
    }

    public final int getMWatchFaceType() {
        return this.mWatchFaceType;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.mId) * 31) + this.mDataKeys.hashCode()) * 31) + this.mBleName.hashCode()) * 31) + this.mBleCustomName.hashCode()) * 31) + this.mBleAddress.hashCode()) * 31) + this.mPlatform.hashCode()) * 31) + this.mPrototype.hashCode()) * 31) + this.mFirmwareFlag.hashCode()) * 31) + Integer.hashCode(this.mAGpsType)) * 31) + Long.hashCode(this.mIOBufferSize)) * 31) + Integer.hashCode(this.mWatchFaceType)) * 31) + this.mClassicAddress.hashCode()) * 31) + Integer.hashCode(this.mHideDigitalPower)) * 31) + Integer.hashCode(this.mShowAntiLostSwitch)) * 31) + Integer.hashCode(this.mSleepAlgorithmType)) * 31) + Integer.hashCode(this.mSupportDateFormatSet)) * 31) + Integer.hashCode(this.mSupportReadDeviceInfo)) * 31) + Integer.hashCode(this.mSupportTemperatureUnitSet)) * 31) + Integer.hashCode(this.mSupportDrinkWaterSet)) * 31) + Integer.hashCode(this.mSupportChangeClassicBluetoothState)) * 31) + Integer.hashCode(this.mSupportAppSport)) * 31) + Integer.hashCode(this.mSupportBloodOxyGenSet)) * 31) + Integer.hashCode(this.mSupportWashSet)) * 31) + Integer.hashCode(this.mSupportRequestRealtimeWeather)) * 31) + Integer.hashCode(this.mSupportHID)) * 31) + Integer.hashCode(this.mSupportIBeaconSet)) * 31) + Integer.hashCode(this.mSupportWatchFaceId)) * 31) + Integer.hashCode(this.mSupportNewTransportMode)) * 31) + Integer.hashCode(this.mSupportJLTransport)) * 31) + Integer.hashCode(this.mSupportFindWatch)) * 31) + Integer.hashCode(this.mSupportWorldClock)) * 31) + Integer.hashCode(this.mSupportStock)) * 31) + Integer.hashCode(this.mSupportSMSQuickReply)) * 31) + Integer.hashCode(this.mSupportNoDisturbSet)) * 31) + Integer.hashCode(this.mSupportSetWatchPassword)) * 31) + Integer.hashCode(this.mSupportRealTimeMeasurement)) * 31) + Integer.hashCode(this.mSupportPowerSaveMode)) * 31) + Integer.hashCode(this.mSupportLoveTap)) * 31) + Integer.hashCode(this.mSupportNewsfeed)) * 31) + Integer.hashCode(this.mSupportMedicationReminder)) * 31) + Integer.hashCode(this.mSupportQrcode)) * 31) + Integer.hashCode(this.mSupportWeather2)) * 31) + Integer.hashCode(this.mSupportAlipay)) * 31) + Integer.hashCode(this.mSupportStandbySet)) * 31) + Integer.hashCode(this.mSupport2DAcceleration)) * 31) + Integer.hashCode(this.mSupportTuyaKey)) * 31) + Integer.hashCode(this.mSupportMedicationAlarm)) * 31) + Integer.hashCode(this.mSupportReadPackageStatus)) * 31) + Integer.hashCode(this.mSupportContactSize)) * 31) + Integer.hashCode(this.mSupportVoice)) * 31) + Integer.hashCode(this.mSupportNavigation)) * 31) + Integer.hashCode(this.mSupportHrWarnSet)) * 31) + this.mBleDefaultName.hashCode()) * 31) + Integer.hashCode(this.mSupportMusicTransfer)) * 31) + Integer.hashCode(this.mSupportNoDisturbSet2)) * 31) + Integer.hashCode(this.mSupportSOSSet)) * 31) + Integer.hashCode(this.mSupportReadLanguages)) * 31) + Integer.hashCode(this.mSupportGirlCareReminder)) * 31) + Integer.hashCode(this.mSupportAppPushSwitch)) * 31) + Integer.hashCode(this.mSupportReceiptCodeSize)) * 31) + Integer.hashCode(this.mSupportGameTimeReminder)) * 31) + Integer.hashCode(this.mSupportMyCardCodeSize)) * 31) + Integer.hashCode(this.mSupportDeviceSportData)) * 31) + Integer.hashCode(this.mSupportEbookTransfer)) * 31) + Integer.hashCode(this.mSupportDoubleScreen)) * 31) + Integer.hashCode(this.mSupportCustomLogo)) * 31) + Integer.hashCode(this.mSupportPressureTimingMeasurement)) * 31) + Integer.hashCode(this.mSupportTimerStandbySet)) * 31) + Integer.hashCode(this.mSupportSOSSet2)) * 31) + Integer.hashCode(this.mSupportFallSet)) * 31) + Integer.hashCode(this.mSupportWalkAndBike)) * 31) + Integer.hashCode(this.mSupportConnectReminder)) * 31) + Integer.hashCode(this.mSupportSDCardInfo)) * 31) + Integer.hashCode(this.mSupportIncomingCallRing)) * 31) + Integer.hashCode(this.mSupportNotificationLightScreenSet)) * 31) + Integer.hashCode(this.mSupportBloodPressureCalibration)) * 31) + Integer.hashCode(this.mSupportOTAFile)) * 31) + Integer.hashCode(this.mSupportGPSFirmwareFile)) * 31) + Integer.hashCode(this.mSupportGoMoreSet)) * 31) + Integer.hashCode(this.mSupportRingVibrationSet)) * 31) + Integer.hashCode(this.mSupportNetwork)) * 31) + Integer.hashCode(this.mSupportContactSort)) * 31) + Integer.hashCode(this.mQrcodeSize)) * 31) + Integer.hashCode(this.mQrcodeContentSize)) * 31) + Integer.hashCode(this.mSupportStringQrcode)) * 31) + Integer.hashCode(this.mSupportWatchFaceIndex)) * 31) + Integer.hashCode(this.mSupportSosContact)) * 31) + Integer.hashCode(this.mSupportGirlCareMonthly)) * 31) + Integer.hashCode(this.mSupportWearWay)) * 31) + Integer.hashCode(this.mSupportGestureWake2)) * 31) + Integer.hashCode(this.mSupportNavImage)) * 31) + Integer.hashCode(this.mSupportVoiceMaxLength)) * 31) + Integer.hashCode(this.mSupportAudioBooks)) * 31) + Integer.hashCode(this.mSupportStudyCards)) * 31) + Integer.hashCode(this.mSupportAppStore)) * 31) + Integer.hashCode(this.mSupportSHSYAlgorithm)) * 31) + Integer.hashCode(this.mSupportQiblaSet)) * 31) + Integer.hashCode(this.mSupportMeasurementBloodGlucose)) * 31) + Integer.hashCode(this.mSupportGameControls)) * 31) + Integer.hashCode(this.mSupportBatteryUsage)) * 31) + Integer.hashCode(this.mSupportAITranslation)) * 31) + Integer.hashCode(this.mSupportSimultaneousTranslation)) * 31) + Integer.hashCode(this.mSupportTouchSet)) * 31) + Integer.hashCode(this.mSupportIMEISet)) * 31) + Integer.hashCode(this.mSupportQuran)) * 31) + Integer.hashCode(this.mSupportSyncAGPSInBackground)) * 31) + Integer.hashCode(this.mSupportRestoreFactory)) * 31) + Integer.hashCode(this.mSupportRecordNote)) * 31) + Integer.hashCode(this.mSupportSleepScore)) * 31) + Integer.hashCode(this.mSupportWatchface2)) * 31) + Integer.hashCode(this.mSupportAICoach)) * 31) + Integer.hashCode(this.mSupportCrossAppTranslation)) * 31) + Integer.hashCode(this.mSupportRelaxReminder)) * 31) + Integer.hashCode(this.mSupportPower2)) * 31) + Integer.hashCode(this.mSupportWeChat)) * 31) + Integer.hashCode(this.mSupportWhatsApp)) * 31) + Integer.hashCode(this.mSupportReadLanguages2)) * 31) + Integer.hashCode(this.mSupportTimeFormat)) * 31) + Integer.hashCode(this.mSupportVibrationIntensity)) * 31) + Integer.hashCode(this.mSupportHighAntiAssist)) * 31) + Integer.hashCode(this.mSupportWechatPay)) * 31) + Integer.hashCode(this.mSupportVitalityValue)) * 31) + Integer.hashCode(this.mSupportHRDetectionMode)) * 31) + Integer.hashCode(this.mSupportAICoachV2)) * 31) + Integer.hashCode(this.mSupportRespiratoryRate)) * 31) + Integer.hashCode(this.mSupportPhysicalStrength)) * 31) + Integer.hashCode(this.mSupportIPC)) * 31) + Integer.hashCode(this.mSupportVideoCalls)) * 31) + Integer.hashCode(this.mSupportRecordAudio)) * 31) + Integer.hashCode(this.mSupportActivityRecognition)) * 31) + Integer.hashCode(this.mSupportMatchV3)) * 31) + Integer.hashCode(this.mSupportLaunchDeviceSport)) * 31) + Integer.hashCode(this.mSupportGetWatchFaceMaxSize)) * 31) + Integer.hashCode(this.mSupportHrvSet)) * 31) + Integer.hashCode(this.mSupportSleepSet)) * 31) + Integer.hashCode(this.mSupportVoiceControl)) * 31) + Integer.hashCode(this.mSupportSwitchPhoneAssistant)) * 31) + Integer.hashCode(this.mSupportWeChatCall)) * 31) + Integer.hashCode(this.mSupportAiOngoingDialogue)) * 31) + Integer.hashCode(this.mSupportGoogleNavigation)) * 31) + Integer.hashCode(this.mSupportSpecialSleepStructure)) * 31) + Integer.hashCode(this.mSupportInheritanceAgreement)) * 31) + Integer.hashCode(this.mSupportChargeWhileUsing)) * 31) + Integer.hashCode(this.mSupportCyWeeAlgorithm)) * 31) + this.mSupportShowSNNumber.hashCode()) * 31) + Integer.hashCode(this.mSupportReadOffLineMap)) * 31) + Integer.hashCode(this.mSupportGolfMapData)) * 31) + Integer.hashCode(this.mSupportNotSaveAPPSport)) * 31) + Integer.hashCode(this.mSupportNoiseSet)) * 31) + Integer.hashCode(this.mSupportWearDetection)) * 31) + Integer.hashCode(this.mBlockSwimmingReminders)) * 31) + Integer.hashCode(this.mSupportEnergyRating)) * 31) + Integer.hashCode(this.mSupportAMapOfflineMap)) * 31) + Integer.hashCode(this.mSupportCyWeeAlgorithmGpsPush)) * 31) + Integer.hashCode(this.mSupportAppPushSwitch3)) * 31) + Integer.hashCode(this.mSupportHydrationReminder)) * 31) + Integer.hashCode(this.mSupportMeetingReminder)) * 31) + Integer.hashCode(this.mSupportOfflineAsrAuth);
    }

    public final void setMAGpsType(int i) {
        this.mAGpsType = i;
    }

    public final void setMBleAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleAddress = str;
    }

    public final void setMBleCustomName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleCustomName = str;
    }

    public final void setMBleName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mBleName = str;
    }

    public final void setMBlockSwimmingReminders(int i) {
        this.mBlockSwimmingReminders = i;
    }

    public final void setMClassicAddress(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mClassicAddress = str;
    }

    public final void setMDataKeys(@aa1 List<Integer> list) {
        Intrinsics.X0O(list, "<set-?>");
        this.mDataKeys = list;
    }

    public final void setMFirmwareFlag(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFirmwareFlag = str;
    }

    public final void setMHideDigitalPower(int i) {
        this.mHideDigitalPower = i;
    }

    public final void setMIOBufferSize(long j) {
        this.mIOBufferSize = j;
    }

    public final void setMId(int i) {
        this.mId = i;
    }

    public final void setMPlatform(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPlatform = str;
    }

    public final void setMPrototype(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPrototype = str;
    }

    public final void setMQrcodeContentSize(int i) {
        this.mQrcodeContentSize = i;
    }

    public final void setMQrcodeSize(int i) {
        this.mQrcodeSize = i;
    }

    public final void setMShowAntiLostSwitch(int i) {
        this.mShowAntiLostSwitch = i;
    }

    public final void setMSleepAlgorithmType(int i) {
        this.mSleepAlgorithmType = i;
    }

    public final void setMSupport2DAcceleration(int i) {
        this.mSupport2DAcceleration = i;
    }

    public final void setMSupportAICoach(int i) {
        this.mSupportAICoach = i;
    }

    public final void setMSupportAICoachV2(int i) {
        this.mSupportAICoachV2 = i;
    }

    public final void setMSupportAITranslation(int i) {
        this.mSupportAITranslation = i;
    }

    public final void setMSupportAMapOfflineMap(int i) {
        this.mSupportAMapOfflineMap = i;
    }

    public final void setMSupportActivityRecognition(int i) {
        this.mSupportActivityRecognition = i;
    }

    public final void setMSupportAiOngoingDialogue(int i) {
        this.mSupportAiOngoingDialogue = i;
    }

    public final void setMSupportAlipay(int i) {
        this.mSupportAlipay = i;
    }

    public final void setMSupportAppPushSwitch(int i) {
        this.mSupportAppPushSwitch = i;
    }

    public final void setMSupportAppPushSwitch3(int i) {
        this.mSupportAppPushSwitch3 = i;
    }

    public final void setMSupportAppSport(int i) {
        this.mSupportAppSport = i;
    }

    public final void setMSupportAppStore(int i) {
        this.mSupportAppStore = i;
    }

    public final void setMSupportAudioBooks(int i) {
        this.mSupportAudioBooks = i;
    }

    public final void setMSupportBatteryUsage(int i) {
        this.mSupportBatteryUsage = i;
    }

    public final void setMSupportBloodOxyGenSet(int i) {
        this.mSupportBloodOxyGenSet = i;
    }

    public final void setMSupportBloodPressureCalibration(int i) {
        this.mSupportBloodPressureCalibration = i;
    }

    public final void setMSupportChangeClassicBluetoothState(int i) {
        this.mSupportChangeClassicBluetoothState = i;
    }

    public final void setMSupportChargeWhileUsing(int i) {
        this.mSupportChargeWhileUsing = i;
    }

    public final void setMSupportConnectReminder(int i) {
        this.mSupportConnectReminder = i;
    }

    public final void setMSupportContactSize(int i) {
        this.mSupportContactSize = i;
    }

    public final void setMSupportContactSort(int i) {
        this.mSupportContactSort = i;
    }

    public final void setMSupportCrossAppTranslation(int i) {
        this.mSupportCrossAppTranslation = i;
    }

    public final void setMSupportCustomLogo(int i) {
        this.mSupportCustomLogo = i;
    }

    public final void setMSupportCyWeeAlgorithm(int i) {
        this.mSupportCyWeeAlgorithm = i;
    }

    public final void setMSupportCyWeeAlgorithmGpsPush(int i) {
        this.mSupportCyWeeAlgorithmGpsPush = i;
    }

    public final void setMSupportDateFormatSet(int i) {
        this.mSupportDateFormatSet = i;
    }

    public final void setMSupportDeviceSportData(int i) {
        this.mSupportDeviceSportData = i;
    }

    public final void setMSupportDoubleScreen(int i) {
        this.mSupportDoubleScreen = i;
    }

    public final void setMSupportDrinkWaterSet(int i) {
        this.mSupportDrinkWaterSet = i;
    }

    public final void setMSupportEbookTransfer(int i) {
        this.mSupportEbookTransfer = i;
    }

    public final void setMSupportEnergyRating(int i) {
        this.mSupportEnergyRating = i;
    }

    public final void setMSupportFallSet(int i) {
        this.mSupportFallSet = i;
    }

    public final void setMSupportFindWatch(int i) {
        this.mSupportFindWatch = i;
    }

    public final void setMSupportGPSFirmwareFile(int i) {
        this.mSupportGPSFirmwareFile = i;
    }

    public final void setMSupportGameControls(int i) {
        this.mSupportGameControls = i;
    }

    public final void setMSupportGameTimeReminder(int i) {
        this.mSupportGameTimeReminder = i;
    }

    public final void setMSupportGestureWake2(int i) {
        this.mSupportGestureWake2 = i;
    }

    public final void setMSupportGetWatchFaceMaxSize(int i) {
        this.mSupportGetWatchFaceMaxSize = i;
    }

    public final void setMSupportGirlCareMonthly(int i) {
        this.mSupportGirlCareMonthly = i;
    }

    public final void setMSupportGirlCareReminder(int i) {
        this.mSupportGirlCareReminder = i;
    }

    public final void setMSupportGoMoreSet(int i) {
        this.mSupportGoMoreSet = i;
    }

    public final void setMSupportGolfMapData(int i) {
        this.mSupportGolfMapData = i;
    }

    public final void setMSupportGoogleNavigation(int i) {
        this.mSupportGoogleNavigation = i;
    }

    public final void setMSupportHID(int i) {
        this.mSupportHID = i;
    }

    public final void setMSupportHRDetectionMode(int i) {
        this.mSupportHRDetectionMode = i;
    }

    public final void setMSupportHighAntiAssist(int i) {
        this.mSupportHighAntiAssist = i;
    }

    public final void setMSupportHrWarnSet(int i) {
        this.mSupportHrWarnSet = i;
    }

    public final void setMSupportHrvSet(int i) {
        this.mSupportHrvSet = i;
    }

    public final void setMSupportHydrationReminder(int i) {
        this.mSupportHydrationReminder = i;
    }

    public final void setMSupportIBeaconSet(int i) {
        this.mSupportIBeaconSet = i;
    }

    public final void setMSupportIMEISet(int i) {
        this.mSupportIMEISet = i;
    }

    public final void setMSupportIPC(int i) {
        this.mSupportIPC = i;
    }

    public final void setMSupportIncomingCallRing(int i) {
        this.mSupportIncomingCallRing = i;
    }

    public final void setMSupportInheritanceAgreement(int i) {
        this.mSupportInheritanceAgreement = i;
    }

    public final void setMSupportJLTransport(int i) {
        this.mSupportJLTransport = i;
    }

    public final void setMSupportLaunchDeviceSport(int i) {
        this.mSupportLaunchDeviceSport = i;
    }

    public final void setMSupportLoveTap(int i) {
        this.mSupportLoveTap = i;
    }

    public final void setMSupportMatchV3(int i) {
        this.mSupportMatchV3 = i;
    }

    public final void setMSupportMeasurementBloodGlucose(int i) {
        this.mSupportMeasurementBloodGlucose = i;
    }

    public final void setMSupportMedicationAlarm(int i) {
        this.mSupportMedicationAlarm = i;
    }

    public final void setMSupportMedicationReminder(int i) {
        this.mSupportMedicationReminder = i;
    }

    public final void setMSupportMeetingReminder(int i) {
        this.mSupportMeetingReminder = i;
    }

    public final void setMSupportMusicTransfer(int i) {
        this.mSupportMusicTransfer = i;
    }

    public final void setMSupportMyCardCodeSize(int i) {
        this.mSupportMyCardCodeSize = i;
    }

    public final void setMSupportNavImage(int i) {
        this.mSupportNavImage = i;
    }

    public final void setMSupportNavigation(int i) {
        this.mSupportNavigation = i;
    }

    public final void setMSupportNetwork(int i) {
        this.mSupportNetwork = i;
    }

    public final void setMSupportNewTransportMode(int i) {
        this.mSupportNewTransportMode = i;
    }

    public final void setMSupportNewsfeed(int i) {
        this.mSupportNewsfeed = i;
    }

    public final void setMSupportNoDisturbSet(int i) {
        this.mSupportNoDisturbSet = i;
    }

    public final void setMSupportNoDisturbSet2(int i) {
        this.mSupportNoDisturbSet2 = i;
    }

    public final void setMSupportNoiseSet(int i) {
        this.mSupportNoiseSet = i;
    }

    public final void setMSupportNotSaveAPPSport(int i) {
        this.mSupportNotSaveAPPSport = i;
    }

    public final void setMSupportNotificationLightScreenSet(int i) {
        this.mSupportNotificationLightScreenSet = i;
    }

    public final void setMSupportOTAFile(int i) {
        this.mSupportOTAFile = i;
    }

    public final void setMSupportOfflineAsrAuth(int i) {
        this.mSupportOfflineAsrAuth = i;
    }

    public final void setMSupportPhysicalStrength(int i) {
        this.mSupportPhysicalStrength = i;
    }

    public final void setMSupportPower2(int i) {
        this.mSupportPower2 = i;
    }

    public final void setMSupportPowerSaveMode(int i) {
        this.mSupportPowerSaveMode = i;
    }

    public final void setMSupportPressureTimingMeasurement(int i) {
        this.mSupportPressureTimingMeasurement = i;
    }

    public final void setMSupportQiblaSet(int i) {
        this.mSupportQiblaSet = i;
    }

    public final void setMSupportQrcode(int i) {
        this.mSupportQrcode = i;
    }

    public final void setMSupportQuran(int i) {
        this.mSupportQuran = i;
    }

    public final void setMSupportReadDeviceInfo(int i) {
        this.mSupportReadDeviceInfo = i;
    }

    public final void setMSupportReadLanguages(int i) {
        this.mSupportReadLanguages = i;
    }

    public final void setMSupportReadLanguages2(int i) {
        this.mSupportReadLanguages2 = i;
    }

    public final void setMSupportReadOffLineMap(int i) {
        this.mSupportReadOffLineMap = i;
    }

    public final void setMSupportReadPackageStatus(int i) {
        this.mSupportReadPackageStatus = i;
    }

    public final void setMSupportRealTimeMeasurement(int i) {
        this.mSupportRealTimeMeasurement = i;
    }

    public final void setMSupportReceiptCodeSize(int i) {
        this.mSupportReceiptCodeSize = i;
    }

    public final void setMSupportRecordAudio(int i) {
        this.mSupportRecordAudio = i;
    }

    public final void setMSupportRecordNote(int i) {
        this.mSupportRecordNote = i;
    }

    public final void setMSupportRelaxReminder(int i) {
        this.mSupportRelaxReminder = i;
    }

    public final void setMSupportRequestRealtimeWeather(int i) {
        this.mSupportRequestRealtimeWeather = i;
    }

    public final void setMSupportRespiratoryRate(int i) {
        this.mSupportRespiratoryRate = i;
    }

    public final void setMSupportRestoreFactory(int i) {
        this.mSupportRestoreFactory = i;
    }

    public final void setMSupportRingVibrationSet(int i) {
        this.mSupportRingVibrationSet = i;
    }

    public final void setMSupportSDCardInfo(int i) {
        this.mSupportSDCardInfo = i;
    }

    public final void setMSupportSHSYAlgorithm(int i) {
        this.mSupportSHSYAlgorithm = i;
    }

    public final void setMSupportSMSQuickReply(int i) {
        this.mSupportSMSQuickReply = i;
    }

    public final void setMSupportSOSSet(int i) {
        this.mSupportSOSSet = i;
    }

    public final void setMSupportSOSSet2(int i) {
        this.mSupportSOSSet2 = i;
    }

    public final void setMSupportSetWatchPassword(int i) {
        this.mSupportSetWatchPassword = i;
    }

    public final void setMSupportShowSNNumber(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSupportShowSNNumber = str;
    }

    public final void setMSupportSimultaneousTranslation(int i) {
        this.mSupportSimultaneousTranslation = i;
    }

    public final void setMSupportSleepScore(int i) {
        this.mSupportSleepScore = i;
    }

    public final void setMSupportSleepSet(int i) {
        this.mSupportSleepSet = i;
    }

    public final void setMSupportSosContact(int i) {
        this.mSupportSosContact = i;
    }

    public final void setMSupportSpecialSleepStructure(int i) {
        this.mSupportSpecialSleepStructure = i;
    }

    public final void setMSupportStandbySet(int i) {
        this.mSupportStandbySet = i;
    }

    public final void setMSupportStock(int i) {
        this.mSupportStock = i;
    }

    public final void setMSupportStringQrcode(int i) {
        this.mSupportStringQrcode = i;
    }

    public final void setMSupportStudyCards(int i) {
        this.mSupportStudyCards = i;
    }

    public final void setMSupportSwitchPhoneAssistant(int i) {
        this.mSupportSwitchPhoneAssistant = i;
    }

    public final void setMSupportSyncAGPSInBackground(int i) {
        this.mSupportSyncAGPSInBackground = i;
    }

    public final void setMSupportTemperatureUnitSet(int i) {
        this.mSupportTemperatureUnitSet = i;
    }

    public final void setMSupportTimeFormat(int i) {
        this.mSupportTimeFormat = i;
    }

    public final void setMSupportTimerStandbySet(int i) {
        this.mSupportTimerStandbySet = i;
    }

    public final void setMSupportTouchSet(int i) {
        this.mSupportTouchSet = i;
    }

    public final void setMSupportTuyaKey(int i) {
        this.mSupportTuyaKey = i;
    }

    public final void setMSupportVibrationIntensity(int i) {
        this.mSupportVibrationIntensity = i;
    }

    public final void setMSupportVideoCalls(int i) {
        this.mSupportVideoCalls = i;
    }

    public final void setMSupportVitalityValue(int i) {
        this.mSupportVitalityValue = i;
    }

    public final void setMSupportVoice(int i) {
        this.mSupportVoice = i;
    }

    public final void setMSupportVoiceControl(int i) {
        this.mSupportVoiceControl = i;
    }

    public final void setMSupportVoiceMaxLength(int i) {
        this.mSupportVoiceMaxLength = i;
    }

    public final void setMSupportWalkAndBike(int i) {
        this.mSupportWalkAndBike = i;
    }

    public final void setMSupportWashSet(int i) {
        this.mSupportWashSet = i;
    }

    public final void setMSupportWatchFaceId(int i) {
        this.mSupportWatchFaceId = i;
    }

    public final void setMSupportWatchFaceIndex(int i) {
        this.mSupportWatchFaceIndex = i;
    }

    public final void setMSupportWatchface2(int i) {
        this.mSupportWatchface2 = i;
    }

    public final void setMSupportWeChat(int i) {
        this.mSupportWeChat = i;
    }

    public final void setMSupportWeChatCall(int i) {
        this.mSupportWeChatCall = i;
    }

    public final void setMSupportWearDetection(int i) {
        this.mSupportWearDetection = i;
    }

    public final void setMSupportWearWay(int i) {
        this.mSupportWearWay = i;
    }

    public final void setMSupportWeather2(int i) {
        this.mSupportWeather2 = i;
    }

    public final void setMSupportWechatPay(int i) {
        this.mSupportWechatPay = i;
    }

    public final void setMSupportWhatsApp(int i) {
        this.mSupportWhatsApp = i;
    }

    public final void setMSupportWorldClock(int i) {
        this.mSupportWorldClock = i;
    }

    public final void setMWatchFaceType(int i) {
        this.mWatchFaceType = i;
    }

    @aa1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BleDeviceInfo(mId=");
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mId)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        sb.append(str);
        sb.append(", id=");
        sb.append(this.mId);
        sb.append(", mDataKeys=");
        List<Integer> list = this.mDataKeys;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(BleKey.Companion.OXO1(((Number) it.next()).intValue()));
        }
        sb.append(arrayList);
        sb.append(", mBleName='");
        sb.append(this.mBleName);
        sb.append("', mBleCustomName='");
        sb.append(this.mBleCustomName);
        sb.append("', mBleAddress='");
        sb.append(this.mBleAddress);
        sb.append("', mPlatform='");
        sb.append(this.mPlatform);
        sb.append("', mPrototype='");
        sb.append(this.mPrototype);
        sb.append("', mFirmwareFlag='");
        sb.append(this.mFirmwareFlag);
        sb.append("', mAGpsType=");
        sb.append(this.mAGpsType);
        sb.append(", mIOBufferSize=");
        sb.append(this.mIOBufferSize);
        sb.append(", mWatchFaceType=");
        sb.append(this.mWatchFaceType);
        sb.append(", mClassicAddress='");
        sb.append(this.mClassicAddress);
        sb.append("', mHideDigitalPower=");
        sb.append(this.mHideDigitalPower);
        sb.append(", mShowAntiLostSwitch=");
        sb.append(this.mShowAntiLostSwitch);
        sb.append(", mSleepAlgorithmType=");
        sb.append(this.mSleepAlgorithmType);
        sb.append(", mSupportDateFormatSet=");
        sb.append(this.mSupportDateFormatSet);
        sb.append(", mSupportReadDeviceInfo=");
        sb.append(this.mSupportReadDeviceInfo);
        sb.append(", mSupportTemperatureUnitSet=");
        sb.append(this.mSupportTemperatureUnitSet);
        sb.append(", mSupportDrinkWaterSet=");
        sb.append(this.mSupportDrinkWaterSet);
        sb.append(", mSupportChangeClassicBluetoothState=");
        sb.append(this.mSupportChangeClassicBluetoothState);
        sb.append(", mSupportAppSport=");
        sb.append(this.mSupportAppSport);
        sb.append(", mSupportBloodOxyGenSet=");
        sb.append(this.mSupportBloodOxyGenSet);
        sb.append(", mSupportWashSet=");
        sb.append(this.mSupportWashSet);
        sb.append(", mSupportRequestRealtimeWeather=");
        sb.append(this.mSupportRequestRealtimeWeather);
        sb.append(", mSupportHID=");
        sb.append(this.mSupportHID);
        sb.append(", mSupportIBeaconSet=");
        sb.append(this.mSupportIBeaconSet);
        sb.append(", mSupportWatchFaceId=");
        sb.append(this.mSupportWatchFaceId);
        sb.append(", mSupportNewTransportMode=");
        sb.append(this.mSupportNewTransportMode);
        sb.append(", mSupportJLTransport=");
        sb.append(this.mSupportJLTransport);
        sb.append(", mSupportFindWatch=");
        sb.append(this.mSupportFindWatch);
        sb.append(", mSupportWorldClock=");
        sb.append(this.mSupportWorldClock);
        sb.append(", mSupportStock=");
        sb.append(this.mSupportStock);
        sb.append(", mSupportSMSQuickReply=");
        sb.append(this.mSupportSMSQuickReply);
        sb.append(", mSupportNoDisturbSet=");
        sb.append(this.mSupportNoDisturbSet);
        sb.append(", mSupportSetWatchPassword=");
        sb.append(this.mSupportSetWatchPassword);
        sb.append(", mSupportRealTimeMeasurement=");
        sb.append(this.mSupportRealTimeMeasurement);
        sb.append(", mSupportPowerSaveMode=");
        sb.append(this.mSupportPowerSaveMode);
        sb.append(", mSupportLoveTap=");
        sb.append(this.mSupportLoveTap);
        sb.append(", mSupportNewsfeed=");
        sb.append(this.mSupportNewsfeed);
        sb.append(", mSupportMedicationReminder=");
        sb.append(this.mSupportMedicationReminder);
        sb.append(", mSupportQrcode=");
        sb.append(this.mSupportQrcode);
        sb.append(", mSupportWeather2=");
        sb.append(this.mSupportWeather2);
        sb.append(", mSupportAlipay=");
        sb.append(this.mSupportAlipay);
        sb.append(", mSupportStandbySet=");
        sb.append(this.mSupportStandbySet);
        sb.append(", mSupport2DAcceleration=");
        sb.append(this.mSupport2DAcceleration);
        sb.append(", mSupportTuyaKey=");
        sb.append(this.mSupportTuyaKey);
        sb.append(", mSupportMedicationAlarm=");
        sb.append(this.mSupportMedicationAlarm);
        sb.append(", mSupportReadPackageStatus=");
        sb.append(this.mSupportReadPackageStatus);
        sb.append(", mSupportContactSize=");
        sb.append(this.mSupportContactSize);
        sb.append(", mSupportVoice=");
        sb.append(this.mSupportVoice);
        sb.append(", mSupportNavigation=");
        sb.append(this.mSupportNavigation);
        sb.append(", mSupportHrWarnSet=");
        sb.append(this.mSupportHrWarnSet);
        sb.append(", mBleDefaultName='");
        sb.append(this.mBleDefaultName);
        sb.append("', mSupportMusicTransfer=");
        sb.append(this.mSupportMusicTransfer);
        sb.append(", mSupportNoDisturbSet2=");
        sb.append(this.mSupportNoDisturbSet2);
        sb.append(", mSupportSOSSet=");
        sb.append(this.mSupportSOSSet);
        sb.append(", mSupportReadLanguages=");
        sb.append(this.mSupportReadLanguages);
        sb.append(", mSupportGirlCareReminder=");
        sb.append(this.mSupportGirlCareReminder);
        sb.append(", mSupportAppPushSwitch=");
        sb.append(this.mSupportAppPushSwitch);
        sb.append(", mSupportReceiptCodeSize=");
        sb.append(this.mSupportReceiptCodeSize);
        sb.append(", mSupportGameTimeReminder=");
        sb.append(this.mSupportGameTimeReminder);
        sb.append(", mSupportMyCardCodeSize=");
        sb.append(this.mSupportMyCardCodeSize);
        sb.append(", mSupportDeviceSportData=");
        sb.append(this.mSupportDeviceSportData);
        sb.append(", mSupportEbookTransfer=");
        sb.append(this.mSupportEbookTransfer);
        sb.append(", mSupportDoubleScreen=");
        sb.append(this.mSupportDoubleScreen);
        sb.append(", mSupportCustomLogo=");
        sb.append(this.mSupportCustomLogo);
        sb.append(", mSupportPressureTimingMeasurement=");
        sb.append(this.mSupportPressureTimingMeasurement);
        sb.append(", mSupportTimerStandbySet=");
        sb.append(this.mSupportTimerStandbySet);
        sb.append(", mSupportSOSSet2=");
        sb.append(this.mSupportSOSSet2);
        sb.append(", mSupportFallSet=");
        sb.append(this.mSupportFallSet);
        sb.append(", mSupportWalkAndBike=");
        sb.append(this.mSupportWalkAndBike);
        sb.append(", mSupportConnectReminder=");
        sb.append(this.mSupportConnectReminder);
        sb.append(", mSupportSDCardInfo=");
        sb.append(this.mSupportSDCardInfo);
        sb.append(", mSupportIncomingCallRing=");
        sb.append(this.mSupportIncomingCallRing);
        sb.append(", mSupportNotificationLightScreenSet=");
        sb.append(this.mSupportNotificationLightScreenSet);
        sb.append(", mSupportBloodPressureCalibration=");
        sb.append(this.mSupportBloodPressureCalibration);
        sb.append(", mSupportOTAFile=");
        sb.append(this.mSupportOTAFile);
        sb.append(", mSupportGPSFirmwareFile=");
        sb.append(this.mSupportGPSFirmwareFile);
        sb.append(", mSupportGoMoreSet=");
        sb.append(this.mSupportGoMoreSet);
        sb.append(", mSupportRingVibrationSet=");
        sb.append(this.mSupportRingVibrationSet);
        sb.append(", mSupportNetwork=");
        sb.append(this.mSupportNetwork);
        sb.append(", mSupportContactSort=");
        sb.append(this.mSupportContactSort);
        sb.append(", mQrcodeSize=");
        sb.append(this.mQrcodeSize);
        sb.append(", mQrcodeContentSize=");
        sb.append(this.mQrcodeContentSize);
        sb.append(", mSupportStringQrcode=");
        sb.append(this.mSupportStringQrcode);
        sb.append(", mSupportWatchFaceIndex=");
        sb.append(this.mSupportWatchFaceIndex);
        sb.append(", mSupportSosContact=");
        sb.append(this.mSupportSosContact);
        sb.append(", mSupportGirlCareMonthly=");
        sb.append(this.mSupportGirlCareMonthly);
        sb.append(", mSupportWearWay=");
        sb.append(this.mSupportWearWay);
        sb.append(", mSupportGestureWake2=");
        sb.append(this.mSupportGestureWake2);
        sb.append(", mSupportNavImage=");
        sb.append(this.mSupportNavImage);
        sb.append(", mSupportVoiceMaxLength=");
        sb.append(this.mSupportVoiceMaxLength);
        sb.append(", mSupportAudioBooks=");
        sb.append(this.mSupportAudioBooks);
        sb.append(", mSupportStudyCards=");
        sb.append(this.mSupportStudyCards);
        sb.append(", mSupportAppStore=");
        sb.append(this.mSupportAppStore);
        sb.append(", mSupportSHSYAlgorithm=");
        sb.append(this.mSupportSHSYAlgorithm);
        sb.append(", mSupportQiblaSet=");
        sb.append(this.mSupportQiblaSet);
        sb.append(", mSupportMeasurementBloodGlucose=");
        sb.append(this.mSupportMeasurementBloodGlucose);
        sb.append(", mSupportGameControls=");
        sb.append(this.mSupportGameControls);
        sb.append(", mSupportBatteryUsage=");
        sb.append(this.mSupportBatteryUsage);
        sb.append(", mSupportAITranslation=");
        sb.append(this.mSupportAITranslation);
        sb.append(", mSupportSimultaneousTranslation=");
        sb.append(this.mSupportSimultaneousTranslation);
        sb.append(", mSupportTouchSet=");
        sb.append(this.mSupportTouchSet);
        sb.append(", mSupportIMEISet=");
        sb.append(this.mSupportIMEISet);
        sb.append(", mSupportQuran=");
        sb.append(this.mSupportQuran);
        sb.append(", mSupportSyncAGPSInBackground=");
        sb.append(this.mSupportSyncAGPSInBackground);
        sb.append(", mSupportRestoreFactory=");
        sb.append(this.mSupportRestoreFactory);
        sb.append(",mSupportRecordNote = ");
        sb.append(this.mSupportRecordNote);
        sb.append(", mSupportSleepScore=");
        sb.append(this.mSupportSleepScore);
        sb.append(", mSupportWatchface2=");
        sb.append(this.mSupportWatchface2);
        sb.append(",mSupportAICoach=");
        sb.append(this.mSupportAICoach);
        sb.append(",mSupportCrossAppTranslation=");
        sb.append(this.mSupportCrossAppTranslation);
        sb.append(", mSupportRelaxReminder=");
        sb.append(this.mSupportRelaxReminder);
        sb.append(", mSupportPower2=");
        sb.append(this.mSupportPower2);
        sb.append(", mSupportWeChat=");
        sb.append(this.mSupportWeChat);
        sb.append(", mSupportWhatsApp=");
        sb.append(this.mSupportWhatsApp);
        sb.append(", mSupportReadLanguages2=");
        sb.append(this.mSupportReadLanguages2);
        sb.append("mSupportTimeFormat=");
        sb.append(this.mSupportTimeFormat);
        sb.append(", mSupportVibrationIntensity=");
        sb.append(this.mSupportVibrationIntensity);
        sb.append(", mSupportHighAntiAssist=");
        sb.append(this.mSupportHighAntiAssist);
        sb.append(", mSupportWechatPay=");
        sb.append(this.mSupportWechatPay);
        sb.append(", mSupportVitalityValue=");
        sb.append(this.mSupportVitalityValue);
        sb.append(", mSupportHRDetectionMode=");
        sb.append(this.mSupportHRDetectionMode);
        sb.append(", mSupportAICoachV2=");
        sb.append(this.mSupportAICoachV2);
        sb.append(", mSupportRespiratoryRate=");
        sb.append(this.mSupportRespiratoryRate);
        sb.append(", mSupportPhysicalStrength=");
        sb.append(this.mSupportPhysicalStrength);
        sb.append(", mSupportIPC=");
        sb.append(this.mSupportIPC);
        sb.append(", mSupportVideoCalls=");
        sb.append(this.mSupportVideoCalls);
        sb.append(", mSupportRecordAudio=");
        sb.append(this.mSupportRecordAudio);
        sb.append(", mSupportActivityRecognition=");
        sb.append(this.mSupportActivityRecognition);
        sb.append(", mSupportMatchV3=");
        sb.append(this.mSupportMatchV3);
        sb.append(", mSupportLaunchDeviceSport=");
        sb.append(this.mSupportLaunchDeviceSport);
        sb.append(", mSupportGetWatchFaceMaxSize=");
        sb.append(this.mSupportGetWatchFaceMaxSize);
        sb.append(", mSupportHrvSet=");
        sb.append(this.mSupportHrvSet);
        sb.append(", mSupportSleepSet=");
        sb.append(this.mSupportSleepSet);
        sb.append(", mSupportVoiceControl=");
        sb.append(this.mSupportVoiceControl);
        sb.append(", mSupportSwitchPhoneAssistant=");
        sb.append(this.mSupportSwitchPhoneAssistant);
        sb.append(", mSupportWeChatCall=");
        sb.append(this.mSupportWeChatCall);
        sb.append(", mSupportAiOngoingDialogue=");
        sb.append(this.mSupportAiOngoingDialogue);
        sb.append(", mSupportChargeWhileUsing=");
        sb.append(this.mSupportChargeWhileUsing);
        sb.append(", mSupportGoogleNavigation=");
        sb.append(this.mSupportGoogleNavigation);
        sb.append(", mSupportSpecialSleepStructure=");
        sb.append(this.mSupportSpecialSleepStructure);
        sb.append(", mSupportInheritanceAgreement=");
        sb.append(this.mSupportInheritanceAgreement);
        sb.append(", mSupportCyWeeAlgorithm=");
        sb.append(this.mSupportCyWeeAlgorithm);
        sb.append(",mSupportSNNumber=");
        sb.append(this.mSupportShowSNNumber);
        sb.append(",mSupportReadOffLineMap=");
        sb.append(this.mSupportReadOffLineMap);
        sb.append(",mSupportGolfMapData=");
        sb.append(this.mSupportGolfMapData);
        sb.append(", mSupportNotSaveAPPStartSport=");
        sb.append(this.mSupportNotSaveAPPSport);
        sb.append(", mSupportNoiseSet=");
        sb.append(this.mSupportNoiseSet);
        sb.append(", mSupportWearDetection=");
        sb.append(this.mSupportWearDetection);
        sb.append(", mSupportBindWarnTipGuide=");
        sb.append(this.mBlockSwimmingReminders);
        sb.append(", mSupportEnergyRating=");
        sb.append(this.mSupportEnergyRating);
        sb.append(",mSupportAMapOfflineMap=");
        sb.append(this.mSupportAMapOfflineMap);
        sb.append(", mSupportCyWeeAlgorithmGpsPush=");
        sb.append(this.mSupportCyWeeAlgorithmGpsPush);
        sb.append(", mSupportAppPushSwitch3=");
        sb.append(this.mSupportAppPushSwitch3);
        sb.append(", mSupportHydrationReminder=");
        sb.append(this.mSupportHydrationReminder);
        sb.append(", mSupportMeetingReminder=");
        sb.append(this.mSupportMeetingReminder);
        sb.append(", mSupportOfflineAsrAuth=");
        sb.append(this.mSupportOfflineAsrAuth);
        sb.append(HexStringBuilder.COMMENT_END_CHAR);
        return sb.toString();
    }

    public BleDeviceInfo(int i, @aa1 List<Integer> mDataKeys, @aa1 String mBleName, @aa1 String mBleCustomName, @aa1 String mBleAddress, @aa1 String mPlatform, @aa1 String mPrototype, @aa1 String mFirmwareFlag, int i2, long j, int i3, @aa1 String mClassicAddress, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, @aa1 String mBleDefaultName, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, int i110, int i111, int i112, int i113, int i114, int i115, int i116, int i117, int i118, int i119, int i120, int i121, int i122, int i123, int i124, int i125, int i126, int i127, int i128, int i129, int i130, int i131, int i132, int i133, int i134, @aa1 String mSupportShowSNNumber, int i135, int i136, int i137, int i138, int i139, int i140, int i141, int i142, int i143, int i144, int i145, int i146, int i147) {
        Intrinsics.X0O(mDataKeys, "mDataKeys");
        Intrinsics.X0O(mBleName, "mBleName");
        Intrinsics.X0O(mBleCustomName, "mBleCustomName");
        Intrinsics.X0O(mBleAddress, "mBleAddress");
        Intrinsics.X0O(mPlatform, "mPlatform");
        Intrinsics.X0O(mPrototype, "mPrototype");
        Intrinsics.X0O(mFirmwareFlag, "mFirmwareFlag");
        Intrinsics.X0O(mClassicAddress, "mClassicAddress");
        Intrinsics.X0O(mBleDefaultName, "mBleDefaultName");
        Intrinsics.X0O(mSupportShowSNNumber, "mSupportShowSNNumber");
        this.mId = i;
        this.mDataKeys = mDataKeys;
        this.mBleName = mBleName;
        this.mBleCustomName = mBleCustomName;
        this.mBleAddress = mBleAddress;
        this.mPlatform = mPlatform;
        this.mPrototype = mPrototype;
        this.mFirmwareFlag = mFirmwareFlag;
        this.mAGpsType = i2;
        this.mIOBufferSize = j;
        this.mWatchFaceType = i3;
        this.mClassicAddress = mClassicAddress;
        this.mHideDigitalPower = i4;
        this.mShowAntiLostSwitch = i5;
        this.mSleepAlgorithmType = i6;
        this.mSupportDateFormatSet = i7;
        this.mSupportReadDeviceInfo = i8;
        this.mSupportTemperatureUnitSet = i9;
        this.mSupportDrinkWaterSet = i10;
        this.mSupportChangeClassicBluetoothState = i11;
        this.mSupportAppSport = i12;
        this.mSupportBloodOxyGenSet = i13;
        this.mSupportWashSet = i14;
        this.mSupportRequestRealtimeWeather = i15;
        this.mSupportHID = i16;
        this.mSupportIBeaconSet = i17;
        this.mSupportWatchFaceId = i18;
        this.mSupportNewTransportMode = i19;
        this.mSupportJLTransport = i20;
        this.mSupportFindWatch = i21;
        this.mSupportWorldClock = i22;
        this.mSupportStock = i23;
        this.mSupportSMSQuickReply = i24;
        this.mSupportNoDisturbSet = i25;
        this.mSupportSetWatchPassword = i26;
        this.mSupportRealTimeMeasurement = i27;
        this.mSupportPowerSaveMode = i28;
        this.mSupportLoveTap = i29;
        this.mSupportNewsfeed = i30;
        this.mSupportMedicationReminder = i31;
        this.mSupportQrcode = i32;
        this.mSupportWeather2 = i33;
        this.mSupportAlipay = i34;
        this.mSupportStandbySet = i35;
        this.mSupport2DAcceleration = i36;
        this.mSupportTuyaKey = i37;
        this.mSupportMedicationAlarm = i38;
        this.mSupportReadPackageStatus = i39;
        this.mSupportContactSize = i40;
        this.mSupportVoice = i41;
        this.mSupportNavigation = i42;
        this.mSupportHrWarnSet = i43;
        this.mBleDefaultName = mBleDefaultName;
        this.mSupportMusicTransfer = i44;
        this.mSupportNoDisturbSet2 = i45;
        this.mSupportSOSSet = i46;
        this.mSupportReadLanguages = i47;
        this.mSupportGirlCareReminder = i48;
        this.mSupportAppPushSwitch = i49;
        this.mSupportReceiptCodeSize = i50;
        this.mSupportGameTimeReminder = i51;
        this.mSupportMyCardCodeSize = i52;
        this.mSupportDeviceSportData = i53;
        this.mSupportEbookTransfer = i54;
        this.mSupportDoubleScreen = i55;
        this.mSupportCustomLogo = i56;
        this.mSupportPressureTimingMeasurement = i57;
        this.mSupportTimerStandbySet = i58;
        this.mSupportSOSSet2 = i59;
        this.mSupportFallSet = i60;
        this.mSupportWalkAndBike = i61;
        this.mSupportConnectReminder = i62;
        this.mSupportSDCardInfo = i63;
        this.mSupportIncomingCallRing = i64;
        this.mSupportNotificationLightScreenSet = i65;
        this.mSupportBloodPressureCalibration = i66;
        this.mSupportOTAFile = i67;
        this.mSupportGPSFirmwareFile = i68;
        this.mSupportGoMoreSet = i69;
        this.mSupportRingVibrationSet = i70;
        this.mSupportNetwork = i71;
        this.mSupportContactSort = i72;
        this.mQrcodeSize = i73;
        this.mQrcodeContentSize = i74;
        this.mSupportStringQrcode = i75;
        this.mSupportWatchFaceIndex = i76;
        this.mSupportSosContact = i77;
        this.mSupportGirlCareMonthly = i78;
        this.mSupportWearWay = i79;
        this.mSupportGestureWake2 = i80;
        this.mSupportNavImage = i81;
        this.mSupportVoiceMaxLength = i82;
        this.mSupportAudioBooks = i83;
        this.mSupportStudyCards = i84;
        this.mSupportAppStore = i85;
        this.mSupportSHSYAlgorithm = i86;
        this.mSupportQiblaSet = i87;
        this.mSupportMeasurementBloodGlucose = i88;
        this.mSupportGameControls = i89;
        this.mSupportBatteryUsage = i90;
        this.mSupportAITranslation = i91;
        this.mSupportSimultaneousTranslation = i92;
        this.mSupportTouchSet = i93;
        this.mSupportIMEISet = i94;
        this.mSupportQuran = i95;
        this.mSupportSyncAGPSInBackground = i96;
        this.mSupportRestoreFactory = i97;
        this.mSupportRecordNote = i98;
        this.mSupportSleepScore = i99;
        this.mSupportWatchface2 = i100;
        this.mSupportAICoach = i101;
        this.mSupportCrossAppTranslation = i102;
        this.mSupportRelaxReminder = i103;
        this.mSupportPower2 = i104;
        this.mSupportWeChat = i105;
        this.mSupportWhatsApp = i106;
        this.mSupportReadLanguages2 = i107;
        this.mSupportTimeFormat = i108;
        this.mSupportVibrationIntensity = i109;
        this.mSupportHighAntiAssist = i110;
        this.mSupportWechatPay = i111;
        this.mSupportVitalityValue = i112;
        this.mSupportHRDetectionMode = i113;
        this.mSupportAICoachV2 = i114;
        this.mSupportRespiratoryRate = i115;
        this.mSupportPhysicalStrength = i116;
        this.mSupportIPC = i117;
        this.mSupportVideoCalls = i118;
        this.mSupportRecordAudio = i119;
        this.mSupportActivityRecognition = i120;
        this.mSupportMatchV3 = i121;
        this.mSupportLaunchDeviceSport = i122;
        this.mSupportGetWatchFaceMaxSize = i123;
        this.mSupportHrvSet = i124;
        this.mSupportSleepSet = i125;
        this.mSupportVoiceControl = i126;
        this.mSupportSwitchPhoneAssistant = i127;
        this.mSupportWeChatCall = i128;
        this.mSupportAiOngoingDialogue = i129;
        this.mSupportGoogleNavigation = i130;
        this.mSupportSpecialSleepStructure = i131;
        this.mSupportInheritanceAgreement = i132;
        this.mSupportChargeWhileUsing = i133;
        this.mSupportCyWeeAlgorithm = i134;
        this.mSupportShowSNNumber = mSupportShowSNNumber;
        this.mSupportReadOffLineMap = i135;
        this.mSupportGolfMapData = i136;
        this.mSupportNotSaveAPPSport = i137;
        this.mSupportNoiseSet = i138;
        this.mSupportWearDetection = i139;
        this.mBlockSwimmingReminders = i140;
        this.mSupportEnergyRating = i141;
        this.mSupportAMapOfflineMap = i142;
        this.mSupportCyWeeAlgorithmGpsPush = i143;
        this.mSupportAppPushSwitch3 = i144;
        this.mSupportHydrationReminder = i145;
        this.mSupportMeetingReminder = i146;
        this.mSupportOfflineAsrAuth = i147;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ BleDeviceInfo(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, int i2, long j, int i3, String str7, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38, int i39, int i40, int i41, int i42, int i43, String str8, int i44, int i45, int i46, int i47, int i48, int i49, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57, int i58, int i59, int i60, int i61, int i62, int i63, int i64, int i65, int i66, int i67, int i68, int i69, int i70, int i71, int i72, int i73, int i74, int i75, int i76, int i77, int i78, int i79, int i80, int i81, int i82, int i83, int i84, int i85, int i86, int i87, int i88, int i89, int i90, int i91, int i92, int i93, int i94, int i95, int i96, int i97, int i98, int i99, int i100, int i101, int i102, int i103, int i104, int i105, int i106, int i107, int i108, int i109, int i110, int i111, int i112, int i113, int i114, int i115, int i116, int i117, int i118, int i119, int i120, int i121, int i122, int i123, int i124, int i125, int i126, int i127, int i128, int i129, int i130, int i131, int i132, int i133, int i134, String str9, int i135, int i136, int i137, int i138, int i139, int i140, int i141, int i142, int i143, int i144, int i145, int i146, int i147, int i148, int i149, int i150, int i151, int i152, DefaultConstructorMarker defaultConstructorMarker) {
        int i153 = (i148 & 1) != 0 ? 0 : i;
        List listM39402iI = (i148 & 2) != 0 ? CollectionsKt__CollectionsKt.m39402iI() : list;
        String str10 = (i148 & 4) != 0 ? "" : str;
        String str11 = (i148 & 8) != 0 ? "" : str2;
        String str12 = (i148 & 16) != 0 ? "" : str3;
        String str13 = (i148 & 32) != 0 ? "" : str4;
        String str14 = (i148 & 64) != 0 ? "" : str5;
        String str15 = (i148 & 128) != 0 ? "" : str6;
        int i154 = (i148 & 256) != 0 ? 0 : i2;
        long j2 = (i148 & 512) != 0 ? 0L : j;
        int i155 = (i148 & 1024) != 0 ? 0 : i3;
        int i156 = i153;
        String str16 = (i148 & 2048) != 0 ? "" : str7;
        int i157 = (i148 & 4096) != 0 ? 0 : i4;
        int i158 = (i148 & 8192) != 0 ? 0 : i5;
        int i159 = (i148 & 16384) != 0 ? 0 : i6;
        int i160 = (i148 & 32768) != 0 ? 0 : i7;
        int i161 = (i148 & 65536) != 0 ? 0 : i8;
        int i162 = (i148 & 131072) != 0 ? 0 : i9;
        int i163 = (i148 & 262144) != 0 ? 0 : i10;
        int i164 = (i148 & 524288) != 0 ? 0 : i11;
        int i165 = (i148 & 1048576) != 0 ? 0 : i12;
        int i166 = (i148 & 2097152) != 0 ? 0 : i13;
        int i167 = (i148 & 4194304) != 0 ? 0 : i14;
        int i168 = (i148 & 8388608) != 0 ? 0 : i15;
        int i169 = (i148 & 16777216) != 0 ? 0 : i16;
        int i170 = (i148 & 33554432) != 0 ? 0 : i17;
        int i171 = (i148 & 67108864) != 0 ? 0 : i18;
        int i172 = (i148 & 134217728) != 0 ? 0 : i19;
        int i173 = (i148 & 268435456) != 0 ? 0 : i20;
        int i174 = (i148 & 536870912) != 0 ? 0 : i21;
        int i175 = (i148 & 1073741824) != 0 ? 0 : i22;
        int i176 = (i148 & Integer.MIN_VALUE) != 0 ? 0 : i23;
        int i177 = (i149 & 1) != 0 ? 0 : i24;
        int i178 = (i149 & 2) != 0 ? 0 : i25;
        int i179 = (i149 & 4) != 0 ? 0 : i26;
        int i180 = (i149 & 8) != 0 ? 0 : i27;
        int i181 = (i149 & 16) != 0 ? 0 : i28;
        int i182 = (i149 & 32) != 0 ? 0 : i29;
        int i183 = (i149 & 64) != 0 ? 0 : i30;
        int i184 = i176;
        int i185 = (i149 & 128) != 0 ? 0 : i31;
        int i186 = (i149 & 256) != 0 ? 0 : i32;
        int i187 = (i149 & 512) != 0 ? 0 : i33;
        int i188 = (i149 & 1024) != 0 ? 0 : i34;
        int i189 = (i149 & 2048) != 0 ? 0 : i35;
        int i190 = (i149 & 4096) != 0 ? 0 : i36;
        int i191 = (i149 & 8192) != 0 ? 0 : i37;
        int i192 = (i149 & 16384) != 0 ? 0 : i38;
        int i193 = (i149 & 32768) != 0 ? 0 : i39;
        int i194 = (i149 & 65536) != 0 ? 0 : i40;
        int i195 = (i149 & 131072) != 0 ? 0 : i41;
        int i196 = (i149 & 262144) != 0 ? 0 : i42;
        int i197 = (i149 & 524288) != 0 ? 0 : i43;
        String str17 = (i149 & 1048576) != 0 ? "" : str8;
        int i198 = (i149 & 2097152) != 0 ? 0 : i44;
        int i199 = (i149 & 4194304) != 0 ? 0 : i45;
        int i200 = (i149 & 8388608) != 0 ? 0 : i46;
        int i201 = (i149 & 16777216) != 0 ? 0 : i47;
        int i202 = (i149 & 33554432) != 0 ? 0 : i48;
        int i203 = (i149 & 67108864) != 0 ? 0 : i49;
        int i204 = (i149 & 134217728) != 0 ? 0 : i50;
        int i205 = (i149 & 268435456) != 0 ? 0 : i51;
        int i206 = (i149 & 536870912) != 0 ? 0 : i52;
        int i207 = (i149 & 1073741824) != 0 ? 0 : i53;
        int i208 = (i149 & Integer.MIN_VALUE) != 0 ? 0 : i54;
        int i209 = (i150 & 1) != 0 ? 0 : i55;
        int i210 = (i150 & 2) != 0 ? 0 : i56;
        int i211 = (i150 & 4) != 0 ? 0 : i57;
        int i212 = (i150 & 8) != 0 ? 0 : i58;
        int i213 = (i150 & 16) != 0 ? 0 : i59;
        int i214 = (i150 & 32) != 0 ? 0 : i60;
        int i215 = (i150 & 64) != 0 ? 0 : i61;
        int i216 = i192;
        int i217 = (i150 & 128) != 0 ? 0 : i62;
        int i218 = (i150 & 256) != 0 ? 0 : i63;
        int i219 = (i150 & 512) != 0 ? 0 : i64;
        int i220 = (i150 & 1024) != 0 ? 0 : i65;
        int i221 = (i150 & 2048) != 0 ? 0 : i66;
        int i222 = (i150 & 4096) != 0 ? 0 : i67;
        int i223 = (i150 & 8192) != 0 ? 0 : i68;
        int i224 = (i150 & 16384) != 0 ? 0 : i69;
        this(i156, listM39402iI, str10, str11, str12, str13, str14, str15, i154, j2, i155, str16, i157, i158, i159, i160, i161, i162, i163, i164, i165, i166, i167, i168, i169, i170, i171, i172, i173, i174, i175, i184, i177, i178, i179, i180, i181, i182, i183, i185, i186, i187, i188, i189, i190, i191, i216, i193, i194, i195, i196, i197, str17, i198, i199, i200, i201, i202, i203, i204, i205, i206, i207, i208, i209, i210, i211, i212, i213, i214, i215, i217, i218, i219, i220, i221, i222, i223, i224, (i150 & 32768) != 0 ? 0 : i70, (i150 & 65536) != 0 ? 0 : i71, (i150 & 131072) != 0 ? 0 : i72, (i150 & 262144) != 0 ? 0 : i73, (i150 & 524288) != 0 ? 0 : i74, (i150 & 1048576) != 0 ? 0 : i75, (i150 & 2097152) != 0 ? 0 : i76, (i150 & 4194304) != 0 ? 0 : i77, (i150 & 8388608) != 0 ? 0 : i78, (i150 & 16777216) != 0 ? 0 : i79, (i150 & 33554432) != 0 ? 0 : i80, (i150 & 67108864) != 0 ? 0 : i81, (i150 & 134217728) != 0 ? 0 : i82, (i150 & 268435456) != 0 ? 0 : i83, (i150 & 536870912) != 0 ? 0 : i84, (i150 & 1073741824) != 0 ? 0 : i85, (i150 & Integer.MIN_VALUE) != 0 ? 0 : i86, (i151 & 1) != 0 ? 0 : i87, (i151 & 2) != 0 ? 0 : i88, (i151 & 4) != 0 ? 0 : i89, (i151 & 8) != 0 ? 0 : i90, (i151 & 16) != 0 ? 0 : i91, (i151 & 32) != 0 ? 0 : i92, (i151 & 64) != 0 ? 0 : i93, (i151 & 128) != 0 ? 0 : i94, (i151 & 256) != 0 ? 0 : i95, (i151 & 512) != 0 ? 0 : i96, (i151 & 1024) != 0 ? 0 : i97, (i151 & 2048) != 0 ? 0 : i98, (i151 & 4096) != 0 ? 0 : i99, (i151 & 8192) != 0 ? 0 : i100, (i151 & 16384) != 0 ? 0 : i101, (i151 & 32768) != 0 ? 0 : i102, (i151 & 65536) != 0 ? 0 : i103, (i151 & 131072) != 0 ? 0 : i104, (i151 & 262144) != 0 ? 0 : i105, (i151 & 524288) != 0 ? 0 : i106, (i151 & 1048576) != 0 ? 0 : i107, (i151 & 2097152) != 0 ? 0 : i108, (i151 & 4194304) != 0 ? 0 : i109, (i151 & 8388608) != 0 ? 0 : i110, (i151 & 16777216) != 0 ? 0 : i111, (i151 & 33554432) != 0 ? 0 : i112, (i151 & 67108864) != 0 ? 0 : i113, (i151 & 134217728) != 0 ? 0 : i114, (i151 & 268435456) != 0 ? 0 : i115, (i151 & 536870912) != 0 ? 0 : i116, (i151 & 1073741824) != 0 ? 0 : i117, (i151 & Integer.MIN_VALUE) != 0 ? 0 : i118, (i152 & 1) != 0 ? 0 : i119, (i152 & 2) != 0 ? 0 : i120, (i152 & 4) != 0 ? 0 : i121, (i152 & 8) != 0 ? 0 : i122, (i152 & 16) != 0 ? 0 : i123, (i152 & 32) != 0 ? 0 : i124, (i152 & 64) != 0 ? 0 : i125, (i152 & 128) != 0 ? 0 : i126, (i152 & 256) != 0 ? 0 : i127, (i152 & 512) != 0 ? 0 : i128, (i152 & 1024) != 0 ? 0 : i129, (i152 & 2048) != 0 ? 0 : i130, (i152 & 4096) != 0 ? 0 : i131, (i152 & 8192) != 0 ? 0 : i132, (i152 & 16384) != 0 ? 0 : i133, (i152 & 32768) != 0 ? 0 : i134, (i152 & 65536) == 0 ? str9 : "", (i152 & 131072) != 0 ? 0 : i135, (i152 & 262144) != 0 ? 0 : i136, (i152 & 524288) != 0 ? 0 : i137, (i152 & 1048576) != 0 ? 0 : i138, (i152 & 2097152) != 0 ? 0 : i139, (i152 & 4194304) != 0 ? 0 : i140, (i152 & 8388608) != 0 ? 0 : i141, (i152 & 16777216) != 0 ? 0 : i142, (i152 & 33554432) != 0 ? 0 : i143, (i152 & 67108864) != 0 ? 0 : i144, (i152 & 134217728) != 0 ? 0 : i145, (i152 & 268435456) != 0 ? 0 : i146, (i152 & 536870912) != 0 ? 0 : i147);
    }
}
