package com.szabh.smable3.entity;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.at;
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
    public static final Companion Companion = null;
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
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    public BleDeviceInfo() {
        int r1 = 0;
        List r2 = null;
        String r3 = null;
        String r4 = null;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        String r8 = null;
        int r9 = 0;
        long r10 = 0;
        int r12 = 0;
        String r13 = null;
        int r14 = 0;
        int r15 = 0;
        int r16 = 0;
        int r17 = 0;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        int r22 = 0;
        int r23 = 0;
        int r24 = 0;
        int r25 = 0;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        int r30 = 0;
        int r31 = 0;
        int r32 = 0;
        int r33 = 0;
        int r34 = 0;
        int r35 = 0;
        int r36 = 0;
        int r37 = 0;
        int r38 = 0;
        int r39 = 0;
        int r40 = 0;
        int r41 = 0;
        int r42 = 0;
        int r43 = 0;
        int r44 = 0;
        int r45 = 0;
        int r46 = 0;
        int r47 = 0;
        int r48 = 0;
        int r49 = 0;
        int r50 = 0;
        int r51 = 0;
        int r52 = 0;
        int r53 = 0;
        String r54 = null;
        int r55 = 0;
        int r56 = 0;
        int r57 = 0;
        int r58 = 0;
        int r59 = 0;
        int r60 = 0;
        int r61 = 0;
        int r62 = 0;
        int r63 = 0;
        int r64 = 0;
        int r65 = 0;
        int r66 = 0;
        int r67 = 0;
        int r68 = 0;
        int r69 = 0;
        int r70 = 0;
        int r71 = 0;
        int r72 = 0;
        int r73 = 0;
        int r74 = 0;
        int r75 = 0;
        int r76 = 0;
        int r77 = 0;
        int r78 = 0;
        int r79 = 0;
        int r80 = 0;
        int r81 = 0;
        int r82 = 0;
        int r83 = 0;
        int r84 = 0;
        int r85 = 0;
        int r86 = 0;
        int r87 = 0;
        int r88 = 0;
        int r89 = 0;
        int r90 = 0;
        int r91 = 0;
        int r92 = 0;
        int r93 = 0;
        int r94 = 0;
        int r95 = 0;
        int r96 = 0;
        int r97 = 0;
        int r98 = 0;
        int r99 = 0;
        int r100 = 0;
        int r101 = 0;
        int r102 = 0;
        int r103 = 0;
        int r104 = 0;
        int r105 = 0;
        int r106 = 0;
        int r107 = 0;
        int r108 = 0;
        int r109 = 0;
        int r110 = 0;
        int r111 = 0;
        int r112 = 0;
        int r113 = 0;
        int r114 = 0;
        int r115 = 0;
        int r116 = 0;
        int r117 = 0;
        int r118 = 0;
        int r119 = 0;
        int r120 = 0;
        int r121 = 0;
        int r122 = 0;
        int r123 = 0;
        int r124 = 0;
        int r125 = 0;
        int r126 = 0;
        int r127 = 0;
        int r128 = 0;
        int r129 = 0;
        int r130 = 0;
        int r131 = 0;
        int r132 = 0;
        int r133 = 0;
        int r134 = 0;
        int r135 = 0;
        int r136 = 0;
        int r137 = 0;
        int r138 = 0;
        int r139 = 0;
        int r140 = 0;
        int r141 = 0;
        int r142 = 0;
        int r143 = 0;
        int r144 = 0;
        int r145 = 0;
        String r146 = null;
        int r147 = 0;
        int r148 = 0;
        int r149 = 0;
        int r150 = 0;
        int r151 = 0;
        int r152 = 0;
        int r153 = 0;
        int r154 = 0;
        int r155 = 0;
        int r156 = 0;
        int r157 = 0;
        int r158 = 0;
        int r159 = 0;
        int r160 = -1;
        int r161 = -1;
        int r162 = -1;
        int r163 = -1;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r117, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132, r133, r134, r135, r136, r137, r138, r139, r140, r141, r142, r143, r144, r145, r146, r147, r148, r149, r150, r151, r152, r153, r154, r155, r156, r157, r158, r159, r160, r161, r162, r163, at.IO, null);
    }

    private final String component53() {
        return this.mBleDefaultName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleDeviceInfo copy$default(BleDeviceInfo r24, int r25, List r26, String r27, String r28, String r29, String r30, String r31, String r32, int r33, long r34, int r36, String r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, int r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, int r71, int r72, int r73, int r74, int r75, int r76, int r77, String r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, int r86, int r87, int r88, int r89, int r90, int r91, int r92, int r93, int r94, int r95, int r96, int r97, int r98, int r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, int r107, int r108, int r109, int r110, int r111, int r112, int r113, int r114, int r115, int r116, int r117, int r118, int r119, int r120, int r121, int r122, int r123, int r124, int r125, int r126, int r127, int r128, int r129, int r130, int r131, int r132, int r133, int r134, int r135, int r136, int r137, int r138, int r139, int r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, int r149, int r150, int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, int r163, int r164, int r165, int r166, int r167, int r168, int r169, String r170, int r171, int r172, int r173, int r174, int r175, int r176, int r177, int r178, int r179, int r180, int r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, Object r189) {
        if ((r184 & 1) == 0) goto L5;
        int r6 = r24.mId;
    L7:
        if ((r184 & 2) == 0) goto L9;
        List r7 = r24.mDataKeys;
    L11:
        if ((r184 & 4) == 0) goto L13;
        String r8 = r24.mBleName;
    L15:
        if ((r184 & 8) == 0) goto L17;
        String r9 = r24.mBleCustomName;
    L19:
        if ((r184 & 16) == 0) goto L21;
        String r10 = r24.mBleAddress;
    L23:
        if ((r184 & 32) == 0) goto L25;
        String r11 = r24.mPlatform;
    L27:
        if ((r184 & 64) == 0) goto L29;
        String r12 = r24.mPrototype;
    L31:
        if ((r184 & 128) == 0) goto L33;
        String r13 = r24.mFirmwareFlag;
    L35:
        if ((r184 & 256) == 0) goto L37;
        int r14 = r24.mAGpsType;
    L38:
        int r210 = r6;
        List r211 = r7;
        if ((r184 & 512) == 0) goto L41;
        long r15 = r24.mIOBufferSize;
    L43:
        if ((r184 & 1024) == 0) goto L45;
        int r16 = r24.mWatchFaceType;
    L46:
        long r212 = r15;
        if ((r184 & 2048) == 0) goto L49;
        String r17 = r24.mClassicAddress;
    L51:
        if ((r184 & 4096) == 0) goto L53;
        int r18 = r24.mHideDigitalPower;
    L54:
        String r213 = r17;
        if ((r184 & 8192) == 0) goto L57;
        int r19 = r24.mShowAntiLostSwitch;
    L58:
        int r35 = r19;
        if ((r184 & 16384) == 0) goto L61;
        int r20 = r24.mSleepAlgorithmType;
    L63:
        if ((r184 & 32768) == 0) goto L65;
        int r1 = r24.mSupportDateFormatSet;
    L66:
        int r310 = r1;
        if ((r184 & 65536) == 0) goto L69;
        int r2 = r24.mSupportReadDeviceInfo;
    L70:
        int r311 = r2;
        if ((r184 & 131072) == 0) goto L73;
        int r3 = r24.mSupportTemperatureUnitSet;
    L74:
        int r312 = r3;
        if ((r184 & 262144) == 0) goto L77;
        int r4 = r24.mSupportDrinkWaterSet;
    L78:
        int r313 = r4;
        if ((r184 & 524288) == 0) goto L81;
        int r5 = r24.mSupportChangeClassicBluetoothState;
    L82:
        int r314 = r5;
        if ((r184 & 1048576) == 0) goto L85;
        int r21 = r24.mSupportAppSport;
    L86:
        int r315 = r21;
        if ((r184 & 2097152) == 0) goto L89;
        int r22 = r24.mSupportBloodOxyGenSet;
    L90:
        int r316 = r22;
        if ((r184 & 4194304) == 0) goto L93;
        int r23 = r24.mSupportWashSet;
    L94:
        int r317 = r23;
        if ((r184 & 8388608) == 0) goto L97;
        int r190 = r24.mSupportRequestRealtimeWeather;
    L98:
        int r318 = r190;
        if ((r184 & 16777216) == 0) goto L101;
        int r191 = r24.mSupportHID;
    L102:
        int r410 = r191;
        if ((r184 & 33554432) == 0) goto L105;
        int r192 = r24.mSupportIBeaconSet;
    L106:
        int r411 = r192;
        if ((r184 & 67108864) == 0) goto L109;
        int r193 = r24.mSupportWatchFaceId;
    L110:
        int r412 = r193;
        if ((r184 & 134217728) == 0) goto L113;
        int r194 = r24.mSupportNewTransportMode;
    L114:
        int r413 = r194;
        if ((r184 & 268435456) == 0) goto L117;
        int r195 = r24.mSupportJLTransport;
    L118:
        int r414 = r195;
        if ((r184 & 536870912) == 0) goto L121;
        int r196 = r24.mSupportFindWatch;
    L122:
        int r415 = r196;
        if ((r184 & 1073741824) == 0) goto L125;
        int r197 = r24.mSupportWorldClock;
    L126:
        int r416 = r197;
        if ((r184 & Integer.MIN_VALUE) == 0) goto L129;
        int r198 = r24.mSupportStock;
    L130:
        int r417 = r198;
        if ((r185 & 1) == 0) goto L133;
        int r199 = r24.mSupportSMSQuickReply;
    L134:
        int r418 = r199;
        if ((r185 & 2) == 0) goto L137;
        int r200 = r24.mSupportNoDisturbSet;
    L138:
        int r419 = r200;
        if ((r185 & 4) == 0) goto L141;
        int r201 = r24.mSupportSetWatchPassword;
    L142:
        int r510 = r201;
        if ((r185 & 8) == 0) goto L145;
        int r202 = r24.mSupportRealTimeMeasurement;
    L146:
        int r511 = r202;
        if ((r185 & 16) == 0) goto L149;
        int r203 = r24.mSupportPowerSaveMode;
    L150:
        int r512 = r203;
        if ((r185 & 32) == 0) goto L153;
        int r204 = r24.mSupportLoveTap;
    L154:
        int r513 = r204;
        if ((r185 & 64) == 0) goto L157;
        int r205 = r24.mSupportNewsfeed;
    L158:
        int r514 = r205;
        if ((r185 & 128) == 0) goto L161;
        int r206 = r24.mSupportMedicationReminder;
    L162:
        int r515 = r206;
        if ((r185 & 256) == 0) goto L165;
        int r207 = r24.mSupportQrcode;
    L166:
        int r516 = r207;
        if ((r185 & 512) == 0) goto L169;
        int r208 = r24.mSupportWeather2;
    L170:
        int r517 = r208;
        if ((r185 & 1024) == 0) goto L173;
        int r209 = r24.mSupportAlipay;
    L174:
        int r518 = r209;
        if ((r185 & 2048) == 0) goto L177;
        int r214 = r24.mSupportStandbySet;
    L178:
        int r519 = r214;
        if ((r185 & 4096) == 0) goto L181;
        int r215 = r24.mSupport2DAcceleration;
    L182:
        int r610 = r215;
        if ((r185 & 8192) == 0) goto L185;
        int r216 = r24.mSupportTuyaKey;
    L186:
        int r611 = r216;
        if ((r185 & 16384) == 0) goto L189;
        int r217 = r24.mSupportMedicationAlarm;
    L190:
        int r612 = r217;
        if ((r185 & 32768) == 0) goto L193;
        int r218 = r24.mSupportReadPackageStatus;
    L194:
        int r613 = r218;
        if ((r185 & 65536) == 0) goto L197;
        int r219 = r24.mSupportContactSize;
    L198:
        int r614 = r219;
        if ((r185 & 131072) == 0) goto L201;
        int r220 = r24.mSupportVoice;
    L202:
        int r615 = r220;
        if ((r185 & 262144) == 0) goto L205;
        int r221 = r24.mSupportNavigation;
    L206:
        int r616 = r221;
        if ((r185 & 524288) == 0) goto L209;
        int r222 = r24.mSupportHrWarnSet;
    L210:
        int r617 = r222;
        if ((r185 & 1048576) == 0) goto L213;
        String r223 = r24.mBleDefaultName;
    L214:
        String r618 = r223;
        if ((r185 & 2097152) == 0) goto L217;
        int r224 = r24.mSupportMusicTransfer;
    L218:
        int r619 = r224;
        if ((r185 & 4194304) == 0) goto L221;
        int r225 = r24.mSupportNoDisturbSet2;
    L222:
        int r710 = r225;
        if ((r185 & 8388608) == 0) goto L225;
        int r226 = r24.mSupportSOSSet;
    L226:
        int r711 = r226;
        if ((r185 & 16777216) == 0) goto L229;
        int r227 = r24.mSupportReadLanguages;
    L230:
        int r712 = r227;
        if ((r185 & 33554432) == 0) goto L233;
        int r228 = r24.mSupportGirlCareReminder;
    L234:
        int r713 = r228;
        if ((r185 & 67108864) == 0) goto L237;
        int r229 = r24.mSupportAppPushSwitch;
    L238:
        int r714 = r229;
        if ((r185 & 134217728) == 0) goto L241;
        int r230 = r24.mSupportReceiptCodeSize;
    L242:
        int r715 = r230;
        if ((r185 & 268435456) == 0) goto L245;
        int r231 = r24.mSupportGameTimeReminder;
    L246:
        int r716 = r231;
        if ((r185 & 536870912) == 0) goto L249;
        int r232 = r24.mSupportMyCardCodeSize;
    L250:
        int r717 = r232;
        if ((r185 & 1073741824) == 0) goto L253;
        int r233 = r24.mSupportDeviceSportData;
    L255:
        if ((r185 & Integer.MIN_VALUE) == 0) goto L257;
        int r234 = r24.mSupportEbookTransfer;
    L258:
        int r718 = r233;
        if ((r186 & 1) == 0) goto L261;
        int r235 = r24.mSupportDoubleScreen;
    L262:
        int r719 = r235;
        if ((r186 & 2) == 0) goto L265;
        int r236 = r24.mSupportCustomLogo;
    L266:
        int r810 = r236;
        if ((r186 & 4) == 0) goto L269;
        int r237 = r24.mSupportPressureTimingMeasurement;
    L270:
        int r811 = r237;
        if ((r186 & 8) == 0) goto L273;
        int r238 = r24.mSupportTimerStandbySet;
    L274:
        int r812 = r238;
        if ((r186 & 16) == 0) goto L277;
        int r239 = r24.mSupportSOSSet2;
    L278:
        int r813 = r239;
        if ((r186 & 32) == 0) goto L281;
        int r240 = r24.mSupportFallSet;
    L282:
        int r814 = r240;
        if ((r186 & 64) == 0) goto L285;
        int r241 = r24.mSupportWalkAndBike;
    L286:
        int r815 = r241;
        if ((r186 & 128) == 0) goto L289;
        int r242 = r24.mSupportConnectReminder;
    L290:
        int r816 = r242;
        if ((r186 & 256) == 0) goto L293;
        int r243 = r24.mSupportSDCardInfo;
    L294:
        int r817 = r243;
        if ((r186 & 512) == 0) goto L297;
        int r244 = r24.mSupportIncomingCallRing;
    L298:
        int r818 = r244;
        if ((r186 & 1024) == 0) goto L301;
        int r245 = r24.mSupportNotificationLightScreenSet;
    L302:
        int r819 = r245;
        if ((r186 & 2048) == 0) goto L305;
        int r246 = r24.mSupportBloodPressureCalibration;
    L306:
        int r910 = r246;
        if ((r186 & 4096) == 0) goto L309;
        int r247 = r24.mSupportOTAFile;
    L310:
        int r911 = r247;
        if ((r186 & 8192) == 0) goto L313;
        int r248 = r24.mSupportGPSFirmwareFile;
    L314:
        int r912 = r248;
        if ((r186 & 16384) == 0) goto L317;
        int r249 = r24.mSupportGoMoreSet;
    L318:
        int r913 = r249;
        if ((r186 & 32768) == 0) goto L321;
        int r250 = r24.mSupportRingVibrationSet;
    L322:
        int r914 = r250;
        if ((r186 & 65536) == 0) goto L325;
        int r251 = r24.mSupportNetwork;
    L326:
        int r915 = r251;
        if ((r186 & 131072) == 0) goto L329;
        int r252 = r24.mSupportContactSort;
    L330:
        int r916 = r252;
        if ((r186 & 262144) == 0) goto L333;
        int r253 = r24.mQrcodeSize;
    L334:
        int r917 = r253;
        if ((r186 & 524288) == 0) goto L337;
        int r254 = r24.mQrcodeContentSize;
    L338:
        int r918 = r254;
        if ((r186 & 1048576) == 0) goto L341;
        int r255 = r24.mSupportStringQrcode;
    L342:
        int r919 = r255;
        if ((r186 & 2097152) == 0) goto L345;
        int r256 = r24.mSupportWatchFaceIndex;
    L346:
        int r1010 = r256;
        if ((r186 & 4194304) == 0) goto L349;
        int r257 = r24.mSupportSosContact;
    L350:
        int r1011 = r257;
        if ((r186 & 8388608) == 0) goto L353;
        int r258 = r24.mSupportGirlCareMonthly;
    L354:
        int r1012 = r258;
        if ((r186 & 16777216) == 0) goto L357;
        int r259 = r24.mSupportWearWay;
    L358:
        int r1013 = r259;
        if ((r186 & 33554432) == 0) goto L361;
        int r260 = r24.mSupportGestureWake2;
    L362:
        int r1014 = r260;
        if ((r186 & 67108864) == 0) goto L365;
        int r261 = r24.mSupportNavImage;
    L366:
        int r1015 = r261;
        if ((r186 & 134217728) == 0) goto L369;
        int r262 = r24.mSupportVoiceMaxLength;
    L370:
        int r1016 = r262;
        if ((r186 & 268435456) == 0) goto L373;
        int r263 = r24.mSupportAudioBooks;
    L374:
        int r1017 = r263;
        if ((r186 & 536870912) == 0) goto L377;
        int r264 = r24.mSupportStudyCards;
    L378:
        int r1018 = r264;
        if ((r186 & 1073741824) == 0) goto L381;
        int r265 = r24.mSupportAppStore;
    L383:
        if ((r186 & Integer.MIN_VALUE) == 0) goto L385;
        int r266 = r24.mSupportSHSYAlgorithm;
    L386:
        int r1019 = r265;
        if ((r187 & 1) == 0) goto L389;
        int r267 = r24.mSupportQiblaSet;
    L390:
        int r1110 = r267;
        if ((r187 & 2) == 0) goto L393;
        int r268 = r24.mSupportMeasurementBloodGlucose;
    L394:
        int r1111 = r268;
        if ((r187 & 4) == 0) goto L397;
        int r269 = r24.mSupportGameControls;
    L398:
        int r1112 = r269;
        if ((r187 & 8) == 0) goto L401;
        int r270 = r24.mSupportBatteryUsage;
    L402:
        int r1113 = r270;
        if ((r187 & 16) == 0) goto L405;
        int r271 = r24.mSupportAITranslation;
    L406:
        int r1114 = r271;
        if ((r187 & 32) == 0) goto L409;
        int r272 = r24.mSupportSimultaneousTranslation;
    L410:
        int r1115 = r272;
        if ((r187 & 64) == 0) goto L413;
        int r273 = r24.mSupportTouchSet;
    L414:
        int r1116 = r273;
        if ((r187 & 128) == 0) goto L417;
        int r274 = r24.mSupportIMEISet;
    L418:
        int r1117 = r274;
        if ((r187 & 256) == 0) goto L421;
        int r275 = r24.mSupportQuran;
    L422:
        int r1118 = r275;
        if ((r187 & 512) == 0) goto L425;
        int r276 = r24.mSupportSyncAGPSInBackground;
    L426:
        int r1119 = r276;
        if ((r187 & 1024) == 0) goto L429;
        int r277 = r24.mSupportRestoreFactory;
    L430:
        int r1210 = r277;
        if ((r187 & 2048) == 0) goto L433;
        int r278 = r24.mSupportRecordNote;
    L434:
        int r1211 = r278;
        if ((r187 & 4096) == 0) goto L437;
        int r279 = r24.mSupportSleepScore;
    L438:
        int r1212 = r279;
        if ((r187 & 8192) == 0) goto L441;
        int r280 = r24.mSupportWatchface2;
    L442:
        int r1213 = r280;
        if ((r187 & 16384) == 0) goto L445;
        int r281 = r24.mSupportAICoach;
    L446:
        int r1214 = r281;
        if ((r187 & 32768) == 0) goto L449;
        int r282 = r24.mSupportCrossAppTranslation;
    L450:
        int r1215 = r282;
        if ((r187 & 65536) == 0) goto L453;
        int r283 = r24.mSupportRelaxReminder;
    L454:
        int r1216 = r283;
        if ((r187 & 131072) == 0) goto L457;
        int r284 = r24.mSupportPower2;
    L458:
        int r1217 = r284;
        if ((r187 & 262144) == 0) goto L461;
        int r285 = r24.mSupportWeChat;
    L462:
        int r1218 = r285;
        if ((r187 & 524288) == 0) goto L465;
        int r286 = r24.mSupportWhatsApp;
    L466:
        int r1219 = r286;
        if ((r187 & 1048576) == 0) goto L469;
        int r287 = r24.mSupportReadLanguages2;
    L470:
        int r1310 = r287;
        if ((r187 & 2097152) == 0) goto L473;
        int r288 = r24.mSupportTimeFormat;
    L474:
        int r1311 = r288;
        if ((r187 & 4194304) == 0) goto L477;
        int r289 = r24.mSupportVibrationIntensity;
    L478:
        int r1312 = r289;
        if ((r187 & 8388608) == 0) goto L481;
        int r290 = r24.mSupportHighAntiAssist;
    L482:
        int r1313 = r290;
        if ((r187 & 16777216) == 0) goto L485;
        int r291 = r24.mSupportWechatPay;
    L486:
        int r1314 = r291;
        if ((r187 & 33554432) == 0) goto L489;
        int r292 = r24.mSupportVitalityValue;
    L490:
        int r1315 = r292;
        if ((r187 & 67108864) == 0) goto L493;
        int r293 = r24.mSupportHRDetectionMode;
    L494:
        int r1316 = r293;
        if ((r187 & 134217728) == 0) goto L497;
        int r294 = r24.mSupportAICoachV2;
    L498:
        int r1317 = r294;
        if ((r187 & 268435456) == 0) goto L501;
        int r295 = r24.mSupportRespiratoryRate;
    L502:
        int r1318 = r295;
        if ((r187 & 536870912) == 0) goto L505;
        int r296 = r24.mSupportPhysicalStrength;
    L506:
        int r1319 = r296;
        if ((r187 & 1073741824) == 0) goto L509;
        int r297 = r24.mSupportIPC;
    L511:
        if ((r187 & Integer.MIN_VALUE) == 0) goto L513;
        int r298 = r24.mSupportVideoCalls;
    L514:
        int r1410 = r297;
        if ((r188 & 1) == 0) goto L517;
        int r299 = r24.mSupportRecordAudio;
    L518:
        int r1411 = r299;
        if ((r188 & 2) == 0) goto L521;
        int r300 = r24.mSupportActivityRecognition;
    L522:
        int r1412 = r300;
        if ((r188 & 4) == 0) goto L525;
        int r301 = r24.mSupportMatchV3;
    L526:
        int r1413 = r301;
        if ((r188 & 8) == 0) goto L529;
        int r302 = r24.mSupportLaunchDeviceSport;
    L530:
        int r1414 = r302;
        if ((r188 & 16) == 0) goto L533;
        int r303 = r24.mSupportGetWatchFaceMaxSize;
    L534:
        int r1415 = r303;
        if ((r188 & 32) == 0) goto L537;
        int r304 = r24.mSupportHrvSet;
    L538:
        int r1416 = r304;
        if ((r188 & 64) == 0) goto L541;
        int r305 = r24.mSupportSleepSet;
    L542:
        int r1417 = r305;
        if ((r188 & 128) == 0) goto L545;
        int r306 = r24.mSupportVoiceControl;
    L546:
        int r1418 = r306;
        if ((r188 & 256) == 0) goto L549;
        int r307 = r24.mSupportSwitchPhoneAssistant;
    L550:
        int r1419 = r307;
        if ((r188 & 512) == 0) goto L553;
        int r308 = r24.mSupportWeChatCall;
    L554:
        int r1510 = r308;
        if ((r188 & 1024) == 0) goto L557;
        int r309 = r24.mSupportAiOngoingDialogue;
    L558:
        int r1511 = r309;
        if ((r188 & 2048) == 0) goto L561;
        int r319 = r24.mSupportGoogleNavigation;
    L562:
        int r1512 = r319;
        if ((r188 & 4096) == 0) goto L565;
        int r320 = r24.mSupportSpecialSleepStructure;
    L566:
        int r1513 = r320;
        if ((r188 & 8192) == 0) goto L569;
        int r321 = r24.mSupportInheritanceAgreement;
    L570:
        int r1514 = r321;
        if ((r188 & 16384) == 0) goto L573;
        int r322 = r24.mSupportChargeWhileUsing;
    L574:
        int r1515 = r322;
        if ((r188 & 32768) == 0) goto L577;
        int r323 = r24.mSupportCyWeeAlgorithm;
    L578:
        int r1516 = r323;
        if ((r188 & 65536) == 0) goto L581;
        String r324 = r24.mSupportShowSNNumber;
    L582:
        String r1517 = r324;
        if ((r188 & 131072) == 0) goto L585;
        int r325 = r24.mSupportReadOffLineMap;
    L586:
        int r1518 = r325;
        if ((r188 & 262144) == 0) goto L589;
        int r326 = r24.mSupportGolfMapData;
    L590:
        int r1519 = r326;
        if ((r188 & 524288) == 0) goto L593;
        int r327 = r24.mSupportNotSaveAPPSport;
    L594:
        int r1610 = r327;
        if ((r188 & 1048576) == 0) goto L597;
        int r328 = r24.mSupportNoiseSet;
    L598:
        int r1611 = r328;
        if ((r188 & 2097152) == 0) goto L601;
        int r329 = r24.mSupportWearDetection;
    L602:
        int r1612 = r329;
        if ((r188 & 4194304) == 0) goto L605;
        int r330 = r24.mBlockSwimmingReminders;
    L606:
        int r1613 = r330;
        if ((r188 & 8388608) == 0) goto L609;
        int r331 = r24.mSupportEnergyRating;
    L610:
        int r1614 = r331;
        if ((r188 & 16777216) == 0) goto L613;
        int r332 = r24.mSupportAMapOfflineMap;
    L614:
        int r1615 = r332;
        if ((r188 & 33554432) == 0) goto L617;
        int r333 = r24.mSupportCyWeeAlgorithmGpsPush;
    L618:
        int r1616 = r333;
        if ((r188 & 67108864) == 0) goto L621;
        int r334 = r24.mSupportAppPushSwitch3;
    L622:
        int r1617 = r334;
        if ((r188 & 134217728) == 0) goto L625;
        int r335 = r24.mSupportHydrationReminder;
    L626:
        int r1618 = r335;
        if ((r188 & 268435456) == 0) goto L629;
        int r336 = r24.mSupportMeetingReminder;
    L631:
        if ((r188 & 536870912) == 0) goto L634;
        int r1810 = r24.mSupportOfflineAsrAuth;
    L636:
        return r24.copy(r210, r211, r8, r9, r10, r11, r12, r13, r14, r212, r16, r213, r18, r35, r20, r310, r311, r312, r313, r314, r315, r316, r317, r318, r410, r411, r412, r413, r414, r415, r416, r417, r418, r419, r510, r511, r512, r513, r514, r515, r516, r517, r518, r519, r610, r611, r612, r613, r614, r615, r616, r617, r618, r619, r710, r711, r712, r713, r714, r715, r716, r717, r718, r234, r719, r810, r811, r812, r813, r814, r815, r816, r817, r818, r819, r910, r911, r912, r913, r914, r915, r916, r917, r918, r919, r1010, r1011, r1012, r1013, r1014, r1015, r1016, r1017, r1018, r1019, r266, r1110, r1111, r1112, r1113, r1114, r1115, r1116, r1117, r1118, r1119, r1210, r1211, r1212, r1213, r1214, r1215, r1216, r1217, r1218, r1219, r1310, r1311, r1312, r1313, r1314, r1315, r1316, r1317, r1318, r1319, r1410, r298, r1411, r1412, r1413, r1414, r1415, r1416, r1417, r1418, r1419, r1510, r1511, r1512, r1513, r1514, r1515, r1516, r1517, r1518, r1519, r1610, r1611, r1612, r1613, r1614, r1615, r1616, r1617, r1618, r336, r1810);
    L634:
        r1810 = r183;
        goto L636
    L629:
        r336 = r182;
        goto L631
    L625:
        r335 = r181;
        goto L626
    L621:
        r334 = r180;
        goto L622
    L617:
        r333 = r179;
        goto L618
    L613:
        r332 = r178;
        goto L614
    L609:
        r331 = r177;
        goto L610
    L605:
        r330 = r176;
        goto L606
    L601:
        r329 = r175;
        goto L602
    L597:
        r328 = r174;
        goto L598
    L593:
        r327 = r173;
        goto L594
    L589:
        r326 = r172;
        goto L590
    L585:
        r325 = r171;
        goto L586
    L581:
        r324 = r170;
        goto L582
    L577:
        r323 = r169;
        goto L578
    L573:
        r322 = r168;
        goto L574
    L569:
        r321 = r167;
        goto L570
    L565:
        r320 = r166;
        goto L566
    L561:
        r319 = r165;
        goto L562
    L557:
        r309 = r164;
        goto L558
    L553:
        r308 = r163;
        goto L554
    L549:
        r307 = r162;
        goto L550
    L545:
        r306 = r161;
        goto L546
    L541:
        r305 = r160;
        goto L542
    L537:
        r304 = r159;
        goto L538
    L533:
        r303 = r158;
        goto L534
    L529:
        r302 = r157;
        goto L530
    L525:
        r301 = r156;
        goto L526
    L521:
        r300 = r155;
        goto L522
    L517:
        r299 = r154;
        goto L518
    L513:
        r298 = r153;
        goto L514
    L509:
        r297 = r152;
        goto L511
    L505:
        r296 = r151;
        goto L506
    L501:
        r295 = r150;
        goto L502
    L497:
        r294 = r149;
        goto L498
    L493:
        r293 = r148;
        goto L494
    L489:
        r292 = r147;
        goto L490
    L485:
        r291 = r146;
        goto L486
    L481:
        r290 = r145;
        goto L482
    L477:
        r289 = r144;
        goto L478
    L473:
        r288 = r143;
        goto L474
    L469:
        r287 = r142;
        goto L470
    L465:
        r286 = r141;
        goto L466
    L461:
        r285 = r140;
        goto L462
    L457:
        r284 = r139;
        goto L458
    L453:
        r283 = r138;
        goto L454
    L449:
        r282 = r137;
        goto L450
    L445:
        r281 = r136;
        goto L446
    L441:
        r280 = r135;
        goto L442
    L437:
        r279 = r134;
        goto L438
    L433:
        r278 = r133;
        goto L434
    L429:
        r277 = r132;
        goto L430
    L425:
        r276 = r131;
        goto L426
    L421:
        r275 = r130;
        goto L422
    L417:
        r274 = r129;
        goto L418
    L413:
        r273 = r128;
        goto L414
    L409:
        r272 = r127;
        goto L410
    L405:
        r271 = r126;
        goto L406
    L401:
        r270 = r125;
        goto L402
    L397:
        r269 = r124;
        goto L398
    L393:
        r268 = r123;
        goto L394
    L389:
        r267 = r122;
        goto L390
    L385:
        r266 = r121;
        goto L386
    L381:
        r265 = r120;
        goto L383
    L377:
        r264 = r119;
        goto L378
    L373:
        r263 = r118;
        goto L374
    L369:
        r262 = r117;
        goto L370
    L365:
        r261 = r116;
        goto L366
    L361:
        r260 = r115;
        goto L362
    L357:
        r259 = r114;
        goto L358
    L353:
        r258 = r113;
        goto L354
    L349:
        r257 = r112;
        goto L350
    L345:
        r256 = r111;
        goto L346
    L341:
        r255 = r110;
        goto L342
    L337:
        r254 = r109;
        goto L338
    L333:
        r253 = r108;
        goto L334
    L329:
        r252 = r107;
        goto L330
    L325:
        r251 = r106;
        goto L326
    L321:
        r250 = r105;
        goto L322
    L317:
        r249 = r104;
        goto L318
    L313:
        r248 = r103;
        goto L314
    L309:
        r247 = r102;
        goto L310
    L305:
        r246 = r101;
        goto L306
    L301:
        r245 = r100;
        goto L302
    L297:
        r244 = r99;
        goto L298
    L293:
        r243 = r98;
        goto L294
    L289:
        r242 = r97;
        goto L290
    L285:
        r241 = r96;
        goto L286
    L281:
        r240 = r95;
        goto L282
    L277:
        r239 = r94;
        goto L278
    L273:
        r238 = r93;
        goto L274
    L269:
        r237 = r92;
        goto L270
    L265:
        r236 = r91;
        goto L266
    L261:
        r235 = r90;
        goto L262
    L257:
        r234 = r89;
        goto L258
    L253:
        r233 = r88;
        goto L255
    L249:
        r232 = r87;
        goto L250
    L245:
        r231 = r86;
        goto L246
    L241:
        r230 = r85;
        goto L242
    L237:
        r229 = r84;
        goto L238
    L233:
        r228 = r83;
        goto L234
    L229:
        r227 = r82;
        goto L230
    L225:
        r226 = r81;
        goto L226
    L221:
        r225 = r80;
        goto L222
    L217:
        r224 = r79;
        goto L218
    L213:
        r223 = r78;
        goto L214
    L209:
        r222 = r77;
        goto L210
    L205:
        r221 = r76;
        goto L206
    L201:
        r220 = r75;
        goto L202
    L197:
        r219 = r74;
        goto L198
    L193:
        r218 = r73;
        goto L194
    L189:
        r217 = r72;
        goto L190
    L185:
        r216 = r71;
        goto L186
    L181:
        r215 = r70;
        goto L182
    L177:
        r214 = r69;
        goto L178
    L173:
        r209 = r68;
        goto L174
    L169:
        r208 = r67;
        goto L170
    L165:
        r207 = r66;
        goto L166
    L161:
        r206 = r65;
        goto L162
    L157:
        r205 = r64;
        goto L158
    L153:
        r204 = r63;
        goto L154
    L149:
        r203 = r62;
        goto L150
    L145:
        r202 = r61;
        goto L146
    L141:
        r201 = r60;
        goto L142
    L137:
        r200 = r59;
        goto L138
    L133:
        r199 = r58;
        goto L134
    L129:
        r198 = r57;
        goto L130
    L125:
        r197 = r56;
        goto L126
    L121:
        r196 = r55;
        goto L122
    L117:
        r195 = r54;
        goto L118
    L113:
        r194 = r53;
        goto L114
    L109:
        r193 = r52;
        goto L110
    L105:
        r192 = r51;
        goto L106
    L101:
        r191 = r50;
        goto L102
    L97:
        r190 = r49;
        goto L98
    L93:
        r23 = r48;
        goto L94
    L89:
        r22 = r47;
        goto L90
    L85:
        r21 = r46;
        goto L86
    L81:
        r5 = r45;
        goto L82
    L77:
        r4 = r44;
        goto L78
    L73:
        r3 = r43;
        goto L74
    L69:
        r2 = r42;
        goto L70
    L65:
        r1 = r41;
        goto L66
    L61:
        r20 = r40;
        goto L63
    L57:
        r19 = r39;
        goto L58
    L53:
        r18 = r38;
        goto L54
    L49:
        r17 = r37;
        goto L51
    L45:
        r16 = r36;
        goto L46
    L41:
        r15 = r34;
        goto L43
    L37:
        r14 = r33;
        goto L38
    L33:
        r13 = r32;
        goto L35
    L29:
        r12 = r31;
        goto L31
    L25:
        r11 = r30;
        goto L27
    L21:
        r10 = r29;
        goto L23
    L17:
        r9 = r28;
        goto L19
    L13:
        r8 = r27;
        goto L15
    L9:
        r7 = r26;
        goto L11
    L5:
        r6 = r25;
        goto L7
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
    public final BleDeviceInfo copy(int r162, @aa1 List<Integer> r163, @aa1 String r164, @aa1 String r165, @aa1 String r166, @aa1 String r167, @aa1 String r168, @aa1 String r169, int r170, long r171, int r173, @aa1 String r174, int r175, int r176, int r177, int r178, int r179, int r180, int r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, int r189, int r190, int r191, int r192, int r193, int r194, int r195, int r196, int r197, int r198, int r199, int r200, int r201, int r202, int r203, int r204, int r205, int r206, int r207, int r208, int r209, int r210, int r211, int r212, int r213, int r214, @aa1 String r215, int r216, int r217, int r218, int r219, int r220, int r221, int r222, int r223, int r224, int r225, int r226, int r227, int r228, int r229, int r230, int r231, int r232, int r233, int r234, int r235, int r236, int r237, int r238, int r239, int r240, int r241, int r242, int r243, int r244, int r245, int r246, int r247, int r248, int r249, int r250, int r251, int r252, int r253, int r254, int r255, int r256, int r257, int r258, int r259, int r260, int r261, int r262, int r263, int r264, int r265, int r266, int r267, int r268, int r269, int r270, int r271, int r272, int r273, int r274, int r275, int r276, int r277, int r278, int r279, int r280, int r281, int r282, int r283, int r284, int r285, int r286, int r287, int r288, int r289, int r290, int r291, int r292, int r293, int r294, int r295, int r296, int r297, int r298, int r299, int r300, int r301, int r302, int r303, int r304, int r305, int r306, @aa1 String r307, int r308, int r309, int r310, int r311, int r312, int r313, int r314, int r315, int r316, int r317, int r318, int r319, int r320) {
        Intrinsics.X0O(r163, "mDataKeys");
        Intrinsics.X0O(r164, "mBleName");
        Intrinsics.X0O(r165, "mBleCustomName");
        Intrinsics.X0O(r166, "mBleAddress");
        Intrinsics.X0O(r167, "mPlatform");
        Intrinsics.X0O(r168, "mPrototype");
        Intrinsics.X0O(r169, "mFirmwareFlag");
        Intrinsics.X0O(r174, "mClassicAddress");
        Intrinsics.X0O(r215, "mBleDefaultName");
        Intrinsics.X0O(r307, "mSupportShowSNNumber");
        return new BleDeviceInfo(r162, r163, r164, r165, r166, r167, r168, r169, r170, r171, r173, r174, r175, r176, r177, r178, r179, r180, r181, r182, r183, r184, r185, r186, r187, r188, r189, r190, r191, r192, r193, r194, r195, r196, r197, r198, r199, r200, r201, r202, r203, r204, r205, r206, r207, r208, r209, r210, r211, r212, r213, r214, r215, r216, r217, r218, r219, r220, r221, r222, r223, r224, r225, r226, r227, r228, r229, r230, r231, r232, r233, r234, r235, r236, r237, r238, r239, r240, r241, r242, r243, r244, r245, r246, r247, r248, r249, r250, r251, r252, r253, r254, r255, r256, r257, r258, r259, r260, r261, r262, r263, r264, r265, r266, r267, r268, r269, r270, r271, r272, r273, r274, r275, r276, r277, r278, r279, r280, r281, r282, r283, r284, r285, r286, r287, r288, r289, r290, r291, r292, r293, r294, r295, r296, r297, r298, r299, r300, r301, r302, r303, r304, r305, r306, r307, r308, r309, r310, r311, r312, r313, r314, r315, r316, r317, r318, r319, r320);
    }

    @Override // com.bestmafen.baseble.data.BleReadable
    public void decode() {
        super.decode();
        this.mId = BleReadable.readInt32$default(this, null, 1, null);
        List r3 = CollectionsKt___CollectionsKt.X10i(ArraysKt___ArraysKt.O1XIOXO1i(readBytesUtil((byte) 0)), 2);
        ArrayList r5 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator r4 = r3.iterator();
    L4:
        if (r4.hasNext() == false) goto L6;
        List r7 = (List) r4.next();
        r5.add(Integer.valueOf((((Number) r7.get(1)).byteValue() & 255) | ((((Number) r7.get(0)).byteValue() & 255) << 8)));
        goto L4
    L6:
        this.mDataKeys = r5;
        this.mBleName = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        String r6 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale r8 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r8, "getDefault(...)");
        String r9 = r6.toUpperCase(r8);
        Intrinsics.O10IXXX0X(r9, "toUpperCase(...)");
        this.mBleAddress = r9;
        this.mPlatform = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mPrototype = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mFirmwareFlag = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mAGpsType = readInt8();
        this.mIOBufferSize = BleReadable.readUInt16$default(this, null, 1, null);
        this.mWatchFaceType = readInt8();
        String r10 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        Locale r11 = Locale.getDefault();
        Intrinsics.O10IXXX0X(r11, "getDefault(...)");
        String r12 = r10.toUpperCase(r11);
        Intrinsics.O10IXXX0X(r12, "toUpperCase(...)");
        this.mClassicAddress = r12;
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
        if (StringsKt__StringsKt.iIi011O(this.mFirmwareFlag, RAW_NAME_SEPARATOR, false, 2, null) == false) goto L13;
        String r1 = (String) StringsKt__StringsKt.i1I(this.mFirmwareFlag, new String[]{RAW_NAME_SEPARATOR}, false, 0, 6, null).get(1);
        if (TextUtils.isEmpty(r1) == true) goto L13;
        if (Intrinsics.XOO0ii0(r1, this.mBleName) == true) goto L13;
        this.mBleCustomName = this.mBleName;
        this.mBleName = r1;
    L13:
        String r2 = BleReadable.readStringUtil$default(this, (byte) 0, null, 2, null);
        this.mBleDefaultName = r2;
        if (TextUtils.isEmpty(r2) == true) goto L16;
        this.mBleCustomName = this.mBleName;
        this.mBleName = this.mBleDefaultName;
    L16:
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

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BleDeviceInfo) == true) goto L8;
        return false;
    L8:
        BleDeviceInfo r9 = (BleDeviceInfo) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mDataKeys, r9.mDataKeys) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mBleName, r9.mBleName) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mBleCustomName, r9.mBleCustomName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mBleAddress, r9.mBleAddress) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mPlatform, r9.mPlatform) == true) goto L27;
        return false;
    L27:
        if (Intrinsics.XOO0ii0(this.mPrototype, r9.mPrototype) == true) goto L30;
        return false;
    L30:
        if (Intrinsics.XOO0ii0(this.mFirmwareFlag, r9.mFirmwareFlag) == true) goto L33;
        return false;
    L33:
        if (this.mAGpsType == r9.mAGpsType) goto L36;
        return false;
    L36:
        if (this.mIOBufferSize == r9.mIOBufferSize) goto L39;
        return false;
    L39:
        if (this.mWatchFaceType == r9.mWatchFaceType) goto L42;
        return false;
    L42:
        if (Intrinsics.XOO0ii0(this.mClassicAddress, r9.mClassicAddress) == true) goto L45;
        return false;
    L45:
        if (this.mHideDigitalPower == r9.mHideDigitalPower) goto L48;
        return false;
    L48:
        if (this.mShowAntiLostSwitch == r9.mShowAntiLostSwitch) goto L51;
        return false;
    L51:
        if (this.mSleepAlgorithmType == r9.mSleepAlgorithmType) goto L54;
        return false;
    L54:
        if (this.mSupportDateFormatSet == r9.mSupportDateFormatSet) goto L57;
        return false;
    L57:
        if (this.mSupportReadDeviceInfo == r9.mSupportReadDeviceInfo) goto L60;
        return false;
    L60:
        if (this.mSupportTemperatureUnitSet == r9.mSupportTemperatureUnitSet) goto L63;
        return false;
    L63:
        if (this.mSupportDrinkWaterSet == r9.mSupportDrinkWaterSet) goto L66;
        return false;
    L66:
        if (this.mSupportChangeClassicBluetoothState == r9.mSupportChangeClassicBluetoothState) goto L69;
        return false;
    L69:
        if (this.mSupportAppSport == r9.mSupportAppSport) goto L72;
        return false;
    L72:
        if (this.mSupportBloodOxyGenSet == r9.mSupportBloodOxyGenSet) goto L75;
        return false;
    L75:
        if (this.mSupportWashSet == r9.mSupportWashSet) goto L78;
        return false;
    L78:
        if (this.mSupportRequestRealtimeWeather == r9.mSupportRequestRealtimeWeather) goto L81;
        return false;
    L81:
        if (this.mSupportHID == r9.mSupportHID) goto L84;
        return false;
    L84:
        if (this.mSupportIBeaconSet == r9.mSupportIBeaconSet) goto L87;
        return false;
    L87:
        if (this.mSupportWatchFaceId == r9.mSupportWatchFaceId) goto L90;
        return false;
    L90:
        if (this.mSupportNewTransportMode == r9.mSupportNewTransportMode) goto L93;
        return false;
    L93:
        if (this.mSupportJLTransport == r9.mSupportJLTransport) goto L96;
        return false;
    L96:
        if (this.mSupportFindWatch == r9.mSupportFindWatch) goto L99;
        return false;
    L99:
        if (this.mSupportWorldClock == r9.mSupportWorldClock) goto L102;
        return false;
    L102:
        if (this.mSupportStock == r9.mSupportStock) goto L105;
        return false;
    L105:
        if (this.mSupportSMSQuickReply == r9.mSupportSMSQuickReply) goto L108;
        return false;
    L108:
        if (this.mSupportNoDisturbSet == r9.mSupportNoDisturbSet) goto L111;
        return false;
    L111:
        if (this.mSupportSetWatchPassword == r9.mSupportSetWatchPassword) goto L114;
        return false;
    L114:
        if (this.mSupportRealTimeMeasurement == r9.mSupportRealTimeMeasurement) goto L117;
        return false;
    L117:
        if (this.mSupportPowerSaveMode == r9.mSupportPowerSaveMode) goto L120;
        return false;
    L120:
        if (this.mSupportLoveTap == r9.mSupportLoveTap) goto L123;
        return false;
    L123:
        if (this.mSupportNewsfeed == r9.mSupportNewsfeed) goto L126;
        return false;
    L126:
        if (this.mSupportMedicationReminder == r9.mSupportMedicationReminder) goto L129;
        return false;
    L129:
        if (this.mSupportQrcode == r9.mSupportQrcode) goto L132;
        return false;
    L132:
        if (this.mSupportWeather2 == r9.mSupportWeather2) goto L135;
        return false;
    L135:
        if (this.mSupportAlipay == r9.mSupportAlipay) goto L138;
        return false;
    L138:
        if (this.mSupportStandbySet == r9.mSupportStandbySet) goto L141;
        return false;
    L141:
        if (this.mSupport2DAcceleration == r9.mSupport2DAcceleration) goto L144;
        return false;
    L144:
        if (this.mSupportTuyaKey == r9.mSupportTuyaKey) goto L147;
        return false;
    L147:
        if (this.mSupportMedicationAlarm == r9.mSupportMedicationAlarm) goto L150;
        return false;
    L150:
        if (this.mSupportReadPackageStatus == r9.mSupportReadPackageStatus) goto L153;
        return false;
    L153:
        if (this.mSupportContactSize == r9.mSupportContactSize) goto L156;
        return false;
    L156:
        if (this.mSupportVoice == r9.mSupportVoice) goto L159;
        return false;
    L159:
        if (this.mSupportNavigation == r9.mSupportNavigation) goto L162;
        return false;
    L162:
        if (this.mSupportHrWarnSet == r9.mSupportHrWarnSet) goto L165;
        return false;
    L165:
        if (Intrinsics.XOO0ii0(this.mBleDefaultName, r9.mBleDefaultName) == true) goto L168;
        return false;
    L168:
        if (this.mSupportMusicTransfer == r9.mSupportMusicTransfer) goto L171;
        return false;
    L171:
        if (this.mSupportNoDisturbSet2 == r9.mSupportNoDisturbSet2) goto L174;
        return false;
    L174:
        if (this.mSupportSOSSet == r9.mSupportSOSSet) goto L177;
        return false;
    L177:
        if (this.mSupportReadLanguages == r9.mSupportReadLanguages) goto L180;
        return false;
    L180:
        if (this.mSupportGirlCareReminder == r9.mSupportGirlCareReminder) goto L183;
        return false;
    L183:
        if (this.mSupportAppPushSwitch == r9.mSupportAppPushSwitch) goto L186;
        return false;
    L186:
        if (this.mSupportReceiptCodeSize == r9.mSupportReceiptCodeSize) goto L189;
        return false;
    L189:
        if (this.mSupportGameTimeReminder == r9.mSupportGameTimeReminder) goto L192;
        return false;
    L192:
        if (this.mSupportMyCardCodeSize == r9.mSupportMyCardCodeSize) goto L195;
        return false;
    L195:
        if (this.mSupportDeviceSportData == r9.mSupportDeviceSportData) goto L198;
        return false;
    L198:
        if (this.mSupportEbookTransfer == r9.mSupportEbookTransfer) goto L201;
        return false;
    L201:
        if (this.mSupportDoubleScreen == r9.mSupportDoubleScreen) goto L204;
        return false;
    L204:
        if (this.mSupportCustomLogo == r9.mSupportCustomLogo) goto L207;
        return false;
    L207:
        if (this.mSupportPressureTimingMeasurement == r9.mSupportPressureTimingMeasurement) goto L210;
        return false;
    L210:
        if (this.mSupportTimerStandbySet == r9.mSupportTimerStandbySet) goto L213;
        return false;
    L213:
        if (this.mSupportSOSSet2 == r9.mSupportSOSSet2) goto L216;
        return false;
    L216:
        if (this.mSupportFallSet == r9.mSupportFallSet) goto L219;
        return false;
    L219:
        if (this.mSupportWalkAndBike == r9.mSupportWalkAndBike) goto L222;
        return false;
    L222:
        if (this.mSupportConnectReminder == r9.mSupportConnectReminder) goto L225;
        return false;
    L225:
        if (this.mSupportSDCardInfo == r9.mSupportSDCardInfo) goto L228;
        return false;
    L228:
        if (this.mSupportIncomingCallRing == r9.mSupportIncomingCallRing) goto L231;
        return false;
    L231:
        if (this.mSupportNotificationLightScreenSet == r9.mSupportNotificationLightScreenSet) goto L234;
        return false;
    L234:
        if (this.mSupportBloodPressureCalibration == r9.mSupportBloodPressureCalibration) goto L237;
        return false;
    L237:
        if (this.mSupportOTAFile == r9.mSupportOTAFile) goto L240;
        return false;
    L240:
        if (this.mSupportGPSFirmwareFile == r9.mSupportGPSFirmwareFile) goto L243;
        return false;
    L243:
        if (this.mSupportGoMoreSet == r9.mSupportGoMoreSet) goto L246;
        return false;
    L246:
        if (this.mSupportRingVibrationSet == r9.mSupportRingVibrationSet) goto L249;
        return false;
    L249:
        if (this.mSupportNetwork == r9.mSupportNetwork) goto L252;
        return false;
    L252:
        if (this.mSupportContactSort == r9.mSupportContactSort) goto L255;
        return false;
    L255:
        if (this.mQrcodeSize == r9.mQrcodeSize) goto L258;
        return false;
    L258:
        if (this.mQrcodeContentSize == r9.mQrcodeContentSize) goto L261;
        return false;
    L261:
        if (this.mSupportStringQrcode == r9.mSupportStringQrcode) goto L264;
        return false;
    L264:
        if (this.mSupportWatchFaceIndex == r9.mSupportWatchFaceIndex) goto L267;
        return false;
    L267:
        if (this.mSupportSosContact == r9.mSupportSosContact) goto L270;
        return false;
    L270:
        if (this.mSupportGirlCareMonthly == r9.mSupportGirlCareMonthly) goto L273;
        return false;
    L273:
        if (this.mSupportWearWay == r9.mSupportWearWay) goto L276;
        return false;
    L276:
        if (this.mSupportGestureWake2 == r9.mSupportGestureWake2) goto L279;
        return false;
    L279:
        if (this.mSupportNavImage == r9.mSupportNavImage) goto L282;
        return false;
    L282:
        if (this.mSupportVoiceMaxLength == r9.mSupportVoiceMaxLength) goto L285;
        return false;
    L285:
        if (this.mSupportAudioBooks == r9.mSupportAudioBooks) goto L288;
        return false;
    L288:
        if (this.mSupportStudyCards == r9.mSupportStudyCards) goto L291;
        return false;
    L291:
        if (this.mSupportAppStore == r9.mSupportAppStore) goto L294;
        return false;
    L294:
        if (this.mSupportSHSYAlgorithm == r9.mSupportSHSYAlgorithm) goto L297;
        return false;
    L297:
        if (this.mSupportQiblaSet == r9.mSupportQiblaSet) goto L300;
        return false;
    L300:
        if (this.mSupportMeasurementBloodGlucose == r9.mSupportMeasurementBloodGlucose) goto L303;
        return false;
    L303:
        if (this.mSupportGameControls == r9.mSupportGameControls) goto L306;
        return false;
    L306:
        if (this.mSupportBatteryUsage == r9.mSupportBatteryUsage) goto L309;
        return false;
    L309:
        if (this.mSupportAITranslation == r9.mSupportAITranslation) goto L312;
        return false;
    L312:
        if (this.mSupportSimultaneousTranslation == r9.mSupportSimultaneousTranslation) goto L315;
        return false;
    L315:
        if (this.mSupportTouchSet == r9.mSupportTouchSet) goto L318;
        return false;
    L318:
        if (this.mSupportIMEISet == r9.mSupportIMEISet) goto L321;
        return false;
    L321:
        if (this.mSupportQuran == r9.mSupportQuran) goto L324;
        return false;
    L324:
        if (this.mSupportSyncAGPSInBackground == r9.mSupportSyncAGPSInBackground) goto L327;
        return false;
    L327:
        if (this.mSupportRestoreFactory == r9.mSupportRestoreFactory) goto L330;
        return false;
    L330:
        if (this.mSupportRecordNote == r9.mSupportRecordNote) goto L333;
        return false;
    L333:
        if (this.mSupportSleepScore == r9.mSupportSleepScore) goto L336;
        return false;
    L336:
        if (this.mSupportWatchface2 == r9.mSupportWatchface2) goto L339;
        return false;
    L339:
        if (this.mSupportAICoach == r9.mSupportAICoach) goto L342;
        return false;
    L342:
        if (this.mSupportCrossAppTranslation == r9.mSupportCrossAppTranslation) goto L345;
        return false;
    L345:
        if (this.mSupportRelaxReminder == r9.mSupportRelaxReminder) goto L348;
        return false;
    L348:
        if (this.mSupportPower2 == r9.mSupportPower2) goto L351;
        return false;
    L351:
        if (this.mSupportWeChat == r9.mSupportWeChat) goto L354;
        return false;
    L354:
        if (this.mSupportWhatsApp == r9.mSupportWhatsApp) goto L357;
        return false;
    L357:
        if (this.mSupportReadLanguages2 == r9.mSupportReadLanguages2) goto L360;
        return false;
    L360:
        if (this.mSupportTimeFormat == r9.mSupportTimeFormat) goto L363;
        return false;
    L363:
        if (this.mSupportVibrationIntensity == r9.mSupportVibrationIntensity) goto L366;
        return false;
    L366:
        if (this.mSupportHighAntiAssist == r9.mSupportHighAntiAssist) goto L369;
        return false;
    L369:
        if (this.mSupportWechatPay == r9.mSupportWechatPay) goto L372;
        return false;
    L372:
        if (this.mSupportVitalityValue == r9.mSupportVitalityValue) goto L375;
        return false;
    L375:
        if (this.mSupportHRDetectionMode == r9.mSupportHRDetectionMode) goto L378;
        return false;
    L378:
        if (this.mSupportAICoachV2 == r9.mSupportAICoachV2) goto L381;
        return false;
    L381:
        if (this.mSupportRespiratoryRate == r9.mSupportRespiratoryRate) goto L384;
        return false;
    L384:
        if (this.mSupportPhysicalStrength == r9.mSupportPhysicalStrength) goto L387;
        return false;
    L387:
        if (this.mSupportIPC == r9.mSupportIPC) goto L390;
        return false;
    L390:
        if (this.mSupportVideoCalls == r9.mSupportVideoCalls) goto L393;
        return false;
    L393:
        if (this.mSupportRecordAudio == r9.mSupportRecordAudio) goto L396;
        return false;
    L396:
        if (this.mSupportActivityRecognition == r9.mSupportActivityRecognition) goto L399;
        return false;
    L399:
        if (this.mSupportMatchV3 == r9.mSupportMatchV3) goto L402;
        return false;
    L402:
        if (this.mSupportLaunchDeviceSport == r9.mSupportLaunchDeviceSport) goto L405;
        return false;
    L405:
        if (this.mSupportGetWatchFaceMaxSize == r9.mSupportGetWatchFaceMaxSize) goto L408;
        return false;
    L408:
        if (this.mSupportHrvSet == r9.mSupportHrvSet) goto L411;
        return false;
    L411:
        if (this.mSupportSleepSet == r9.mSupportSleepSet) goto L414;
        return false;
    L414:
        if (this.mSupportVoiceControl == r9.mSupportVoiceControl) goto L417;
        return false;
    L417:
        if (this.mSupportSwitchPhoneAssistant == r9.mSupportSwitchPhoneAssistant) goto L420;
        return false;
    L420:
        if (this.mSupportWeChatCall == r9.mSupportWeChatCall) goto L423;
        return false;
    L423:
        if (this.mSupportAiOngoingDialogue == r9.mSupportAiOngoingDialogue) goto L426;
        return false;
    L426:
        if (this.mSupportGoogleNavigation == r9.mSupportGoogleNavigation) goto L429;
        return false;
    L429:
        if (this.mSupportSpecialSleepStructure == r9.mSupportSpecialSleepStructure) goto L432;
        return false;
    L432:
        if (this.mSupportInheritanceAgreement == r9.mSupportInheritanceAgreement) goto L435;
        return false;
    L435:
        if (this.mSupportChargeWhileUsing == r9.mSupportChargeWhileUsing) goto L438;
        return false;
    L438:
        if (this.mSupportCyWeeAlgorithm == r9.mSupportCyWeeAlgorithm) goto L441;
        return false;
    L441:
        if (Intrinsics.XOO0ii0(this.mSupportShowSNNumber, r9.mSupportShowSNNumber) == true) goto L444;
        return false;
    L444:
        if (this.mSupportReadOffLineMap == r9.mSupportReadOffLineMap) goto L447;
        return false;
    L447:
        if (this.mSupportGolfMapData == r9.mSupportGolfMapData) goto L450;
        return false;
    L450:
        if (this.mSupportNotSaveAPPSport == r9.mSupportNotSaveAPPSport) goto L453;
        return false;
    L453:
        if (this.mSupportNoiseSet == r9.mSupportNoiseSet) goto L456;
        return false;
    L456:
        if (this.mSupportWearDetection == r9.mSupportWearDetection) goto L459;
        return false;
    L459:
        if (this.mBlockSwimmingReminders == r9.mBlockSwimmingReminders) goto L462;
        return false;
    L462:
        if (this.mSupportEnergyRating == r9.mSupportEnergyRating) goto L465;
        return false;
    L465:
        if (this.mSupportAMapOfflineMap == r9.mSupportAMapOfflineMap) goto L468;
        return false;
    L468:
        if (this.mSupportCyWeeAlgorithmGpsPush == r9.mSupportCyWeeAlgorithmGpsPush) goto L471;
        return false;
    L471:
        if (this.mSupportAppPushSwitch3 == r9.mSupportAppPushSwitch3) goto L474;
        return false;
    L474:
        if (this.mSupportHydrationReminder == r9.mSupportHydrationReminder) goto L477;
        return false;
    L477:
        if (this.mSupportMeetingReminder == r9.mSupportMeetingReminder) goto L480;
        return false;
    L480:
        if (this.mSupportOfflineAsrAuth == r9.mSupportOfflineAsrAuth) goto L482;
        return false;
    L482:
        return true;
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

    public final void setMAGpsType(int r1) {
        this.mAGpsType = r1;
    }

    public final void setMBleAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleAddress = r2;
    }

    public final void setMBleCustomName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleCustomName = r2;
    }

    public final void setMBleName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mBleName = r2;
    }

    public final void setMBlockSwimmingReminders(int r1) {
        this.mBlockSwimmingReminders = r1;
    }

    public final void setMClassicAddress(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mClassicAddress = r2;
    }

    public final void setMDataKeys(@aa1 List<Integer> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mDataKeys = r2;
    }

    public final void setMFirmwareFlag(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFirmwareFlag = r2;
    }

    public final void setMHideDigitalPower(int r1) {
        this.mHideDigitalPower = r1;
    }

    public final void setMIOBufferSize(long r1) {
        this.mIOBufferSize = r1;
    }

    public final void setMId(int r1) {
        this.mId = r1;
    }

    public final void setMPlatform(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPlatform = r2;
    }

    public final void setMPrototype(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPrototype = r2;
    }

    public final void setMQrcodeContentSize(int r1) {
        this.mQrcodeContentSize = r1;
    }

    public final void setMQrcodeSize(int r1) {
        this.mQrcodeSize = r1;
    }

    public final void setMShowAntiLostSwitch(int r1) {
        this.mShowAntiLostSwitch = r1;
    }

    public final void setMSleepAlgorithmType(int r1) {
        this.mSleepAlgorithmType = r1;
    }

    public final void setMSupport2DAcceleration(int r1) {
        this.mSupport2DAcceleration = r1;
    }

    public final void setMSupportAICoach(int r1) {
        this.mSupportAICoach = r1;
    }

    public final void setMSupportAICoachV2(int r1) {
        this.mSupportAICoachV2 = r1;
    }

    public final void setMSupportAITranslation(int r1) {
        this.mSupportAITranslation = r1;
    }

    public final void setMSupportAMapOfflineMap(int r1) {
        this.mSupportAMapOfflineMap = r1;
    }

    public final void setMSupportActivityRecognition(int r1) {
        this.mSupportActivityRecognition = r1;
    }

    public final void setMSupportAiOngoingDialogue(int r1) {
        this.mSupportAiOngoingDialogue = r1;
    }

    public final void setMSupportAlipay(int r1) {
        this.mSupportAlipay = r1;
    }

    public final void setMSupportAppPushSwitch(int r1) {
        this.mSupportAppPushSwitch = r1;
    }

    public final void setMSupportAppPushSwitch3(int r1) {
        this.mSupportAppPushSwitch3 = r1;
    }

    public final void setMSupportAppSport(int r1) {
        this.mSupportAppSport = r1;
    }

    public final void setMSupportAppStore(int r1) {
        this.mSupportAppStore = r1;
    }

    public final void setMSupportAudioBooks(int r1) {
        this.mSupportAudioBooks = r1;
    }

    public final void setMSupportBatteryUsage(int r1) {
        this.mSupportBatteryUsage = r1;
    }

    public final void setMSupportBloodOxyGenSet(int r1) {
        this.mSupportBloodOxyGenSet = r1;
    }

    public final void setMSupportBloodPressureCalibration(int r1) {
        this.mSupportBloodPressureCalibration = r1;
    }

    public final void setMSupportChangeClassicBluetoothState(int r1) {
        this.mSupportChangeClassicBluetoothState = r1;
    }

    public final void setMSupportChargeWhileUsing(int r1) {
        this.mSupportChargeWhileUsing = r1;
    }

    public final void setMSupportConnectReminder(int r1) {
        this.mSupportConnectReminder = r1;
    }

    public final void setMSupportContactSize(int r1) {
        this.mSupportContactSize = r1;
    }

    public final void setMSupportContactSort(int r1) {
        this.mSupportContactSort = r1;
    }

    public final void setMSupportCrossAppTranslation(int r1) {
        this.mSupportCrossAppTranslation = r1;
    }

    public final void setMSupportCustomLogo(int r1) {
        this.mSupportCustomLogo = r1;
    }

    public final void setMSupportCyWeeAlgorithm(int r1) {
        this.mSupportCyWeeAlgorithm = r1;
    }

    public final void setMSupportCyWeeAlgorithmGpsPush(int r1) {
        this.mSupportCyWeeAlgorithmGpsPush = r1;
    }

    public final void setMSupportDateFormatSet(int r1) {
        this.mSupportDateFormatSet = r1;
    }

    public final void setMSupportDeviceSportData(int r1) {
        this.mSupportDeviceSportData = r1;
    }

    public final void setMSupportDoubleScreen(int r1) {
        this.mSupportDoubleScreen = r1;
    }

    public final void setMSupportDrinkWaterSet(int r1) {
        this.mSupportDrinkWaterSet = r1;
    }

    public final void setMSupportEbookTransfer(int r1) {
        this.mSupportEbookTransfer = r1;
    }

    public final void setMSupportEnergyRating(int r1) {
        this.mSupportEnergyRating = r1;
    }

    public final void setMSupportFallSet(int r1) {
        this.mSupportFallSet = r1;
    }

    public final void setMSupportFindWatch(int r1) {
        this.mSupportFindWatch = r1;
    }

    public final void setMSupportGPSFirmwareFile(int r1) {
        this.mSupportGPSFirmwareFile = r1;
    }

    public final void setMSupportGameControls(int r1) {
        this.mSupportGameControls = r1;
    }

    public final void setMSupportGameTimeReminder(int r1) {
        this.mSupportGameTimeReminder = r1;
    }

    public final void setMSupportGestureWake2(int r1) {
        this.mSupportGestureWake2 = r1;
    }

    public final void setMSupportGetWatchFaceMaxSize(int r1) {
        this.mSupportGetWatchFaceMaxSize = r1;
    }

    public final void setMSupportGirlCareMonthly(int r1) {
        this.mSupportGirlCareMonthly = r1;
    }

    public final void setMSupportGirlCareReminder(int r1) {
        this.mSupportGirlCareReminder = r1;
    }

    public final void setMSupportGoMoreSet(int r1) {
        this.mSupportGoMoreSet = r1;
    }

    public final void setMSupportGolfMapData(int r1) {
        this.mSupportGolfMapData = r1;
    }

    public final void setMSupportGoogleNavigation(int r1) {
        this.mSupportGoogleNavigation = r1;
    }

    public final void setMSupportHID(int r1) {
        this.mSupportHID = r1;
    }

    public final void setMSupportHRDetectionMode(int r1) {
        this.mSupportHRDetectionMode = r1;
    }

    public final void setMSupportHighAntiAssist(int r1) {
        this.mSupportHighAntiAssist = r1;
    }

    public final void setMSupportHrWarnSet(int r1) {
        this.mSupportHrWarnSet = r1;
    }

    public final void setMSupportHrvSet(int r1) {
        this.mSupportHrvSet = r1;
    }

    public final void setMSupportHydrationReminder(int r1) {
        this.mSupportHydrationReminder = r1;
    }

    public final void setMSupportIBeaconSet(int r1) {
        this.mSupportIBeaconSet = r1;
    }

    public final void setMSupportIMEISet(int r1) {
        this.mSupportIMEISet = r1;
    }

    public final void setMSupportIPC(int r1) {
        this.mSupportIPC = r1;
    }

    public final void setMSupportIncomingCallRing(int r1) {
        this.mSupportIncomingCallRing = r1;
    }

    public final void setMSupportInheritanceAgreement(int r1) {
        this.mSupportInheritanceAgreement = r1;
    }

    public final void setMSupportJLTransport(int r1) {
        this.mSupportJLTransport = r1;
    }

    public final void setMSupportLaunchDeviceSport(int r1) {
        this.mSupportLaunchDeviceSport = r1;
    }

    public final void setMSupportLoveTap(int r1) {
        this.mSupportLoveTap = r1;
    }

    public final void setMSupportMatchV3(int r1) {
        this.mSupportMatchV3 = r1;
    }

    public final void setMSupportMeasurementBloodGlucose(int r1) {
        this.mSupportMeasurementBloodGlucose = r1;
    }

    public final void setMSupportMedicationAlarm(int r1) {
        this.mSupportMedicationAlarm = r1;
    }

    public final void setMSupportMedicationReminder(int r1) {
        this.mSupportMedicationReminder = r1;
    }

    public final void setMSupportMeetingReminder(int r1) {
        this.mSupportMeetingReminder = r1;
    }

    public final void setMSupportMusicTransfer(int r1) {
        this.mSupportMusicTransfer = r1;
    }

    public final void setMSupportMyCardCodeSize(int r1) {
        this.mSupportMyCardCodeSize = r1;
    }

    public final void setMSupportNavImage(int r1) {
        this.mSupportNavImage = r1;
    }

    public final void setMSupportNavigation(int r1) {
        this.mSupportNavigation = r1;
    }

    public final void setMSupportNetwork(int r1) {
        this.mSupportNetwork = r1;
    }

    public final void setMSupportNewTransportMode(int r1) {
        this.mSupportNewTransportMode = r1;
    }

    public final void setMSupportNewsfeed(int r1) {
        this.mSupportNewsfeed = r1;
    }

    public final void setMSupportNoDisturbSet(int r1) {
        this.mSupportNoDisturbSet = r1;
    }

    public final void setMSupportNoDisturbSet2(int r1) {
        this.mSupportNoDisturbSet2 = r1;
    }

    public final void setMSupportNoiseSet(int r1) {
        this.mSupportNoiseSet = r1;
    }

    public final void setMSupportNotSaveAPPSport(int r1) {
        this.mSupportNotSaveAPPSport = r1;
    }

    public final void setMSupportNotificationLightScreenSet(int r1) {
        this.mSupportNotificationLightScreenSet = r1;
    }

    public final void setMSupportOTAFile(int r1) {
        this.mSupportOTAFile = r1;
    }

    public final void setMSupportOfflineAsrAuth(int r1) {
        this.mSupportOfflineAsrAuth = r1;
    }

    public final void setMSupportPhysicalStrength(int r1) {
        this.mSupportPhysicalStrength = r1;
    }

    public final void setMSupportPower2(int r1) {
        this.mSupportPower2 = r1;
    }

    public final void setMSupportPowerSaveMode(int r1) {
        this.mSupportPowerSaveMode = r1;
    }

    public final void setMSupportPressureTimingMeasurement(int r1) {
        this.mSupportPressureTimingMeasurement = r1;
    }

    public final void setMSupportQiblaSet(int r1) {
        this.mSupportQiblaSet = r1;
    }

    public final void setMSupportQrcode(int r1) {
        this.mSupportQrcode = r1;
    }

    public final void setMSupportQuran(int r1) {
        this.mSupportQuran = r1;
    }

    public final void setMSupportReadDeviceInfo(int r1) {
        this.mSupportReadDeviceInfo = r1;
    }

    public final void setMSupportReadLanguages(int r1) {
        this.mSupportReadLanguages = r1;
    }

    public final void setMSupportReadLanguages2(int r1) {
        this.mSupportReadLanguages2 = r1;
    }

    public final void setMSupportReadOffLineMap(int r1) {
        this.mSupportReadOffLineMap = r1;
    }

    public final void setMSupportReadPackageStatus(int r1) {
        this.mSupportReadPackageStatus = r1;
    }

    public final void setMSupportRealTimeMeasurement(int r1) {
        this.mSupportRealTimeMeasurement = r1;
    }

    public final void setMSupportReceiptCodeSize(int r1) {
        this.mSupportReceiptCodeSize = r1;
    }

    public final void setMSupportRecordAudio(int r1) {
        this.mSupportRecordAudio = r1;
    }

    public final void setMSupportRecordNote(int r1) {
        this.mSupportRecordNote = r1;
    }

    public final void setMSupportRelaxReminder(int r1) {
        this.mSupportRelaxReminder = r1;
    }

    public final void setMSupportRequestRealtimeWeather(int r1) {
        this.mSupportRequestRealtimeWeather = r1;
    }

    public final void setMSupportRespiratoryRate(int r1) {
        this.mSupportRespiratoryRate = r1;
    }

    public final void setMSupportRestoreFactory(int r1) {
        this.mSupportRestoreFactory = r1;
    }

    public final void setMSupportRingVibrationSet(int r1) {
        this.mSupportRingVibrationSet = r1;
    }

    public final void setMSupportSDCardInfo(int r1) {
        this.mSupportSDCardInfo = r1;
    }

    public final void setMSupportSHSYAlgorithm(int r1) {
        this.mSupportSHSYAlgorithm = r1;
    }

    public final void setMSupportSMSQuickReply(int r1) {
        this.mSupportSMSQuickReply = r1;
    }

    public final void setMSupportSOSSet(int r1) {
        this.mSupportSOSSet = r1;
    }

    public final void setMSupportSOSSet2(int r1) {
        this.mSupportSOSSet2 = r1;
    }

    public final void setMSupportSetWatchPassword(int r1) {
        this.mSupportSetWatchPassword = r1;
    }

    public final void setMSupportShowSNNumber(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSupportShowSNNumber = r2;
    }

    public final void setMSupportSimultaneousTranslation(int r1) {
        this.mSupportSimultaneousTranslation = r1;
    }

    public final void setMSupportSleepScore(int r1) {
        this.mSupportSleepScore = r1;
    }

    public final void setMSupportSleepSet(int r1) {
        this.mSupportSleepSet = r1;
    }

    public final void setMSupportSosContact(int r1) {
        this.mSupportSosContact = r1;
    }

    public final void setMSupportSpecialSleepStructure(int r1) {
        this.mSupportSpecialSleepStructure = r1;
    }

    public final void setMSupportStandbySet(int r1) {
        this.mSupportStandbySet = r1;
    }

    public final void setMSupportStock(int r1) {
        this.mSupportStock = r1;
    }

    public final void setMSupportStringQrcode(int r1) {
        this.mSupportStringQrcode = r1;
    }

    public final void setMSupportStudyCards(int r1) {
        this.mSupportStudyCards = r1;
    }

    public final void setMSupportSwitchPhoneAssistant(int r1) {
        this.mSupportSwitchPhoneAssistant = r1;
    }

    public final void setMSupportSyncAGPSInBackground(int r1) {
        this.mSupportSyncAGPSInBackground = r1;
    }

    public final void setMSupportTemperatureUnitSet(int r1) {
        this.mSupportTemperatureUnitSet = r1;
    }

    public final void setMSupportTimeFormat(int r1) {
        this.mSupportTimeFormat = r1;
    }

    public final void setMSupportTimerStandbySet(int r1) {
        this.mSupportTimerStandbySet = r1;
    }

    public final void setMSupportTouchSet(int r1) {
        this.mSupportTouchSet = r1;
    }

    public final void setMSupportTuyaKey(int r1) {
        this.mSupportTuyaKey = r1;
    }

    public final void setMSupportVibrationIntensity(int r1) {
        this.mSupportVibrationIntensity = r1;
    }

    public final void setMSupportVideoCalls(int r1) {
        this.mSupportVideoCalls = r1;
    }

    public final void setMSupportVitalityValue(int r1) {
        this.mSupportVitalityValue = r1;
    }

    public final void setMSupportVoice(int r1) {
        this.mSupportVoice = r1;
    }

    public final void setMSupportVoiceControl(int r1) {
        this.mSupportVoiceControl = r1;
    }

    public final void setMSupportVoiceMaxLength(int r1) {
        this.mSupportVoiceMaxLength = r1;
    }

    public final void setMSupportWalkAndBike(int r1) {
        this.mSupportWalkAndBike = r1;
    }

    public final void setMSupportWashSet(int r1) {
        this.mSupportWashSet = r1;
    }

    public final void setMSupportWatchFaceId(int r1) {
        this.mSupportWatchFaceId = r1;
    }

    public final void setMSupportWatchFaceIndex(int r1) {
        this.mSupportWatchFaceIndex = r1;
    }

    public final void setMSupportWatchface2(int r1) {
        this.mSupportWatchface2 = r1;
    }

    public final void setMSupportWeChat(int r1) {
        this.mSupportWeChat = r1;
    }

    public final void setMSupportWeChatCall(int r1) {
        this.mSupportWeChatCall = r1;
    }

    public final void setMSupportWearDetection(int r1) {
        this.mSupportWearDetection = r1;
    }

    public final void setMSupportWearWay(int r1) {
        this.mSupportWearWay = r1;
    }

    public final void setMSupportWeather2(int r1) {
        this.mSupportWeather2 = r1;
    }

    public final void setMSupportWechatPay(int r1) {
        this.mSupportWechatPay = r1;
    }

    public final void setMSupportWhatsApp(int r1) {
        this.mSupportWhatsApp = r1;
    }

    public final void setMSupportWorldClock(int r1) {
        this.mSupportWorldClock = r1;
    }

    public final void setMWatchFaceType(int r1) {
        this.mWatchFaceType = r1;
    }

    @aa1
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("BleDeviceInfo(mId=");
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format("0x%08X", Arrays.copyOf(new Object[]{Integer.valueOf(this.mId)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.append(r2);
        r0.append(", id=");
        r0.append(this.mId);
        r0.append(", mDataKeys=");
        List<Integer> r3 = this.mDataKeys;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator<T> r5 = r3.iterator();
    L4:
        if (r5.hasNext() == false) goto L6;
        int r6 = ((Number) r5.next()).intValue();
        r4.add(BleKey.Companion.OXO1(r6));
        goto L4
    L6:
        r0.append(r4);
        r0.append(", mBleName='");
        r0.append(this.mBleName);
        r0.append("', mBleCustomName='");
        r0.append(this.mBleCustomName);
        r0.append("', mBleAddress='");
        r0.append(this.mBleAddress);
        r0.append("', mPlatform='");
        r0.append(this.mPlatform);
        r0.append("', mPrototype='");
        r0.append(this.mPrototype);
        r0.append("', mFirmwareFlag='");
        r0.append(this.mFirmwareFlag);
        r0.append("', mAGpsType=");
        r0.append(this.mAGpsType);
        r0.append(", mIOBufferSize=");
        r0.append(this.mIOBufferSize);
        r0.append(", mWatchFaceType=");
        r0.append(this.mWatchFaceType);
        r0.append(", mClassicAddress='");
        r0.append(this.mClassicAddress);
        r0.append("', mHideDigitalPower=");
        r0.append(this.mHideDigitalPower);
        r0.append(", mShowAntiLostSwitch=");
        r0.append(this.mShowAntiLostSwitch);
        r0.append(", mSleepAlgorithmType=");
        r0.append(this.mSleepAlgorithmType);
        r0.append(", mSupportDateFormatSet=");
        r0.append(this.mSupportDateFormatSet);
        r0.append(", mSupportReadDeviceInfo=");
        r0.append(this.mSupportReadDeviceInfo);
        r0.append(", mSupportTemperatureUnitSet=");
        r0.append(this.mSupportTemperatureUnitSet);
        r0.append(", mSupportDrinkWaterSet=");
        r0.append(this.mSupportDrinkWaterSet);
        r0.append(", mSupportChangeClassicBluetoothState=");
        r0.append(this.mSupportChangeClassicBluetoothState);
        r0.append(", mSupportAppSport=");
        r0.append(this.mSupportAppSport);
        r0.append(", mSupportBloodOxyGenSet=");
        r0.append(this.mSupportBloodOxyGenSet);
        r0.append(", mSupportWashSet=");
        r0.append(this.mSupportWashSet);
        r0.append(", mSupportRequestRealtimeWeather=");
        r0.append(this.mSupportRequestRealtimeWeather);
        r0.append(", mSupportHID=");
        r0.append(this.mSupportHID);
        r0.append(", mSupportIBeaconSet=");
        r0.append(this.mSupportIBeaconSet);
        r0.append(", mSupportWatchFaceId=");
        r0.append(this.mSupportWatchFaceId);
        r0.append(", mSupportNewTransportMode=");
        r0.append(this.mSupportNewTransportMode);
        r0.append(", mSupportJLTransport=");
        r0.append(this.mSupportJLTransport);
        r0.append(", mSupportFindWatch=");
        r0.append(this.mSupportFindWatch);
        r0.append(", mSupportWorldClock=");
        r0.append(this.mSupportWorldClock);
        r0.append(", mSupportStock=");
        r0.append(this.mSupportStock);
        r0.append(", mSupportSMSQuickReply=");
        r0.append(this.mSupportSMSQuickReply);
        r0.append(", mSupportNoDisturbSet=");
        r0.append(this.mSupportNoDisturbSet);
        r0.append(", mSupportSetWatchPassword=");
        r0.append(this.mSupportSetWatchPassword);
        r0.append(", mSupportRealTimeMeasurement=");
        r0.append(this.mSupportRealTimeMeasurement);
        r0.append(", mSupportPowerSaveMode=");
        r0.append(this.mSupportPowerSaveMode);
        r0.append(", mSupportLoveTap=");
        r0.append(this.mSupportLoveTap);
        r0.append(", mSupportNewsfeed=");
        r0.append(this.mSupportNewsfeed);
        r0.append(", mSupportMedicationReminder=");
        r0.append(this.mSupportMedicationReminder);
        r0.append(", mSupportQrcode=");
        r0.append(this.mSupportQrcode);
        r0.append(", mSupportWeather2=");
        r0.append(this.mSupportWeather2);
        r0.append(", mSupportAlipay=");
        r0.append(this.mSupportAlipay);
        r0.append(", mSupportStandbySet=");
        r0.append(this.mSupportStandbySet);
        r0.append(", mSupport2DAcceleration=");
        r0.append(this.mSupport2DAcceleration);
        r0.append(", mSupportTuyaKey=");
        r0.append(this.mSupportTuyaKey);
        r0.append(", mSupportMedicationAlarm=");
        r0.append(this.mSupportMedicationAlarm);
        r0.append(", mSupportReadPackageStatus=");
        r0.append(this.mSupportReadPackageStatus);
        r0.append(", mSupportContactSize=");
        r0.append(this.mSupportContactSize);
        r0.append(", mSupportVoice=");
        r0.append(this.mSupportVoice);
        r0.append(", mSupportNavigation=");
        r0.append(this.mSupportNavigation);
        r0.append(", mSupportHrWarnSet=");
        r0.append(this.mSupportHrWarnSet);
        r0.append(", mBleDefaultName='");
        r0.append(this.mBleDefaultName);
        r0.append("', mSupportMusicTransfer=");
        r0.append(this.mSupportMusicTransfer);
        r0.append(", mSupportNoDisturbSet2=");
        r0.append(this.mSupportNoDisturbSet2);
        r0.append(", mSupportSOSSet=");
        r0.append(this.mSupportSOSSet);
        r0.append(", mSupportReadLanguages=");
        r0.append(this.mSupportReadLanguages);
        r0.append(", mSupportGirlCareReminder=");
        r0.append(this.mSupportGirlCareReminder);
        r0.append(", mSupportAppPushSwitch=");
        r0.append(this.mSupportAppPushSwitch);
        r0.append(", mSupportReceiptCodeSize=");
        r0.append(this.mSupportReceiptCodeSize);
        r0.append(", mSupportGameTimeReminder=");
        r0.append(this.mSupportGameTimeReminder);
        r0.append(", mSupportMyCardCodeSize=");
        r0.append(this.mSupportMyCardCodeSize);
        r0.append(", mSupportDeviceSportData=");
        r0.append(this.mSupportDeviceSportData);
        r0.append(", mSupportEbookTransfer=");
        r0.append(this.mSupportEbookTransfer);
        r0.append(", mSupportDoubleScreen=");
        r0.append(this.mSupportDoubleScreen);
        r0.append(", mSupportCustomLogo=");
        r0.append(this.mSupportCustomLogo);
        r0.append(", mSupportPressureTimingMeasurement=");
        r0.append(this.mSupportPressureTimingMeasurement);
        r0.append(", mSupportTimerStandbySet=");
        r0.append(this.mSupportTimerStandbySet);
        r0.append(", mSupportSOSSet2=");
        r0.append(this.mSupportSOSSet2);
        r0.append(", mSupportFallSet=");
        r0.append(this.mSupportFallSet);
        r0.append(", mSupportWalkAndBike=");
        r0.append(this.mSupportWalkAndBike);
        r0.append(", mSupportConnectReminder=");
        r0.append(this.mSupportConnectReminder);
        r0.append(", mSupportSDCardInfo=");
        r0.append(this.mSupportSDCardInfo);
        r0.append(", mSupportIncomingCallRing=");
        r0.append(this.mSupportIncomingCallRing);
        r0.append(", mSupportNotificationLightScreenSet=");
        r0.append(this.mSupportNotificationLightScreenSet);
        r0.append(", mSupportBloodPressureCalibration=");
        r0.append(this.mSupportBloodPressureCalibration);
        r0.append(", mSupportOTAFile=");
        r0.append(this.mSupportOTAFile);
        r0.append(", mSupportGPSFirmwareFile=");
        r0.append(this.mSupportGPSFirmwareFile);
        r0.append(", mSupportGoMoreSet=");
        r0.append(this.mSupportGoMoreSet);
        r0.append(", mSupportRingVibrationSet=");
        r0.append(this.mSupportRingVibrationSet);
        r0.append(", mSupportNetwork=");
        r0.append(this.mSupportNetwork);
        r0.append(", mSupportContactSort=");
        r0.append(this.mSupportContactSort);
        r0.append(", mQrcodeSize=");
        r0.append(this.mQrcodeSize);
        r0.append(", mQrcodeContentSize=");
        r0.append(this.mQrcodeContentSize);
        r0.append(", mSupportStringQrcode=");
        r0.append(this.mSupportStringQrcode);
        r0.append(", mSupportWatchFaceIndex=");
        r0.append(this.mSupportWatchFaceIndex);
        r0.append(", mSupportSosContact=");
        r0.append(this.mSupportSosContact);
        r0.append(", mSupportGirlCareMonthly=");
        r0.append(this.mSupportGirlCareMonthly);
        r0.append(", mSupportWearWay=");
        r0.append(this.mSupportWearWay);
        r0.append(", mSupportGestureWake2=");
        r0.append(this.mSupportGestureWake2);
        r0.append(", mSupportNavImage=");
        r0.append(this.mSupportNavImage);
        r0.append(", mSupportVoiceMaxLength=");
        r0.append(this.mSupportVoiceMaxLength);
        r0.append(", mSupportAudioBooks=");
        r0.append(this.mSupportAudioBooks);
        r0.append(", mSupportStudyCards=");
        r0.append(this.mSupportStudyCards);
        r0.append(", mSupportAppStore=");
        r0.append(this.mSupportAppStore);
        r0.append(", mSupportSHSYAlgorithm=");
        r0.append(this.mSupportSHSYAlgorithm);
        r0.append(", mSupportQiblaSet=");
        r0.append(this.mSupportQiblaSet);
        r0.append(", mSupportMeasurementBloodGlucose=");
        r0.append(this.mSupportMeasurementBloodGlucose);
        r0.append(", mSupportGameControls=");
        r0.append(this.mSupportGameControls);
        r0.append(", mSupportBatteryUsage=");
        r0.append(this.mSupportBatteryUsage);
        r0.append(", mSupportAITranslation=");
        r0.append(this.mSupportAITranslation);
        r0.append(", mSupportSimultaneousTranslation=");
        r0.append(this.mSupportSimultaneousTranslation);
        r0.append(", mSupportTouchSet=");
        r0.append(this.mSupportTouchSet);
        r0.append(", mSupportIMEISet=");
        r0.append(this.mSupportIMEISet);
        r0.append(", mSupportQuran=");
        r0.append(this.mSupportQuran);
        r0.append(", mSupportSyncAGPSInBackground=");
        r0.append(this.mSupportSyncAGPSInBackground);
        r0.append(", mSupportRestoreFactory=");
        r0.append(this.mSupportRestoreFactory);
        r0.append(",mSupportRecordNote = ");
        r0.append(this.mSupportRecordNote);
        r0.append(", mSupportSleepScore=");
        r0.append(this.mSupportSleepScore);
        r0.append(", mSupportWatchface2=");
        r0.append(this.mSupportWatchface2);
        r0.append(",mSupportAICoach=");
        r0.append(this.mSupportAICoach);
        r0.append(",mSupportCrossAppTranslation=");
        r0.append(this.mSupportCrossAppTranslation);
        r0.append(", mSupportRelaxReminder=");
        r0.append(this.mSupportRelaxReminder);
        r0.append(", mSupportPower2=");
        r0.append(this.mSupportPower2);
        r0.append(", mSupportWeChat=");
        r0.append(this.mSupportWeChat);
        r0.append(", mSupportWhatsApp=");
        r0.append(this.mSupportWhatsApp);
        r0.append(", mSupportReadLanguages2=");
        r0.append(this.mSupportReadLanguages2);
        r0.append("mSupportTimeFormat=");
        r0.append(this.mSupportTimeFormat);
        r0.append(", mSupportVibrationIntensity=");
        r0.append(this.mSupportVibrationIntensity);
        r0.append(", mSupportHighAntiAssist=");
        r0.append(this.mSupportHighAntiAssist);
        r0.append(", mSupportWechatPay=");
        r0.append(this.mSupportWechatPay);
        r0.append(", mSupportVitalityValue=");
        r0.append(this.mSupportVitalityValue);
        r0.append(", mSupportHRDetectionMode=");
        r0.append(this.mSupportHRDetectionMode);
        r0.append(", mSupportAICoachV2=");
        r0.append(this.mSupportAICoachV2);
        r0.append(", mSupportRespiratoryRate=");
        r0.append(this.mSupportRespiratoryRate);
        r0.append(", mSupportPhysicalStrength=");
        r0.append(this.mSupportPhysicalStrength);
        r0.append(", mSupportIPC=");
        r0.append(this.mSupportIPC);
        r0.append(", mSupportVideoCalls=");
        r0.append(this.mSupportVideoCalls);
        r0.append(", mSupportRecordAudio=");
        r0.append(this.mSupportRecordAudio);
        r0.append(", mSupportActivityRecognition=");
        r0.append(this.mSupportActivityRecognition);
        r0.append(", mSupportMatchV3=");
        r0.append(this.mSupportMatchV3);
        r0.append(", mSupportLaunchDeviceSport=");
        r0.append(this.mSupportLaunchDeviceSport);
        r0.append(", mSupportGetWatchFaceMaxSize=");
        r0.append(this.mSupportGetWatchFaceMaxSize);
        r0.append(", mSupportHrvSet=");
        r0.append(this.mSupportHrvSet);
        r0.append(", mSupportSleepSet=");
        r0.append(this.mSupportSleepSet);
        r0.append(", mSupportVoiceControl=");
        r0.append(this.mSupportVoiceControl);
        r0.append(", mSupportSwitchPhoneAssistant=");
        r0.append(this.mSupportSwitchPhoneAssistant);
        r0.append(", mSupportWeChatCall=");
        r0.append(this.mSupportWeChatCall);
        r0.append(", mSupportAiOngoingDialogue=");
        r0.append(this.mSupportAiOngoingDialogue);
        r0.append(", mSupportChargeWhileUsing=");
        r0.append(this.mSupportChargeWhileUsing);
        r0.append(", mSupportGoogleNavigation=");
        r0.append(this.mSupportGoogleNavigation);
        r0.append(", mSupportSpecialSleepStructure=");
        r0.append(this.mSupportSpecialSleepStructure);
        r0.append(", mSupportInheritanceAgreement=");
        r0.append(this.mSupportInheritanceAgreement);
        r0.append(", mSupportCyWeeAlgorithm=");
        r0.append(this.mSupportCyWeeAlgorithm);
        r0.append(",mSupportSNNumber=");
        r0.append(this.mSupportShowSNNumber);
        r0.append(",mSupportReadOffLineMap=");
        r0.append(this.mSupportReadOffLineMap);
        r0.append(",mSupportGolfMapData=");
        r0.append(this.mSupportGolfMapData);
        r0.append(", mSupportNotSaveAPPStartSport=");
        r0.append(this.mSupportNotSaveAPPSport);
        r0.append(", mSupportNoiseSet=");
        r0.append(this.mSupportNoiseSet);
        r0.append(", mSupportWearDetection=");
        r0.append(this.mSupportWearDetection);
        r0.append(", mSupportBindWarnTipGuide=");
        r0.append(this.mBlockSwimmingReminders);
        r0.append(", mSupportEnergyRating=");
        r0.append(this.mSupportEnergyRating);
        r0.append(",mSupportAMapOfflineMap=");
        r0.append(this.mSupportAMapOfflineMap);
        r0.append(", mSupportCyWeeAlgorithmGpsPush=");
        r0.append(this.mSupportCyWeeAlgorithmGpsPush);
        r0.append(", mSupportAppPushSwitch3=");
        r0.append(this.mSupportAppPushSwitch3);
        r0.append(", mSupportHydrationReminder=");
        r0.append(this.mSupportHydrationReminder);
        r0.append(", mSupportMeetingReminder=");
        r0.append(this.mSupportMeetingReminder);
        r0.append(", mSupportOfflineAsrAuth=");
        r0.append(this.mSupportOfflineAsrAuth);
        r0.append(HexStringBuilder.COMMENT_END_CHAR);
        return r0.toString();
    }

    public BleDeviceInfo(int r6, @aa1 List<Integer> r7, @aa1 String r8, @aa1 String r9, @aa1 String r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, int r14, long r15, int r17, @aa1 String r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40, int r41, int r42, int r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, int r53, int r54, int r55, int r56, int r57, int r58, @aa1 String r59, int r60, int r61, int r62, int r63, int r64, int r65, int r66, int r67, int r68, int r69, int r70, int r71, int r72, int r73, int r74, int r75, int r76, int r77, int r78, int r79, int r80, int r81, int r82, int r83, int r84, int r85, int r86, int r87, int r88, int r89, int r90, int r91, int r92, int r93, int r94, int r95, int r96, int r97, int r98, int r99, int r100, int r101, int r102, int r103, int r104, int r105, int r106, int r107, int r108, int r109, int r110, int r111, int r112, int r113, int r114, int r115, int r116, int r117, int r118, int r119, int r120, int r121, int r122, int r123, int r124, int r125, int r126, int r127, int r128, int r129, int r130, int r131, int r132, int r133, int r134, int r135, int r136, int r137, int r138, int r139, int r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, int r149, int r150, @aa1 String r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, int r163, int r164) {
        Intrinsics.X0O(r7, "mDataKeys");
        Intrinsics.X0O(r8, "mBleName");
        Intrinsics.X0O(r9, "mBleCustomName");
        Intrinsics.X0O(r10, "mBleAddress");
        Intrinsics.X0O(r11, "mPlatform");
        Intrinsics.X0O(r12, "mPrototype");
        Intrinsics.X0O(r13, "mFirmwareFlag");
        Intrinsics.X0O(r18, "mClassicAddress");
        Intrinsics.X0O(r59, "mBleDefaultName");
        Intrinsics.X0O(r151, "mSupportShowSNNumber");
        this.mId = r6;
        this.mDataKeys = r7;
        this.mBleName = r8;
        this.mBleCustomName = r9;
        this.mBleAddress = r10;
        this.mPlatform = r11;
        this.mPrototype = r12;
        this.mFirmwareFlag = r13;
        this.mAGpsType = r14;
        this.mIOBufferSize = r15;
        this.mWatchFaceType = r17;
        this.mClassicAddress = r18;
        this.mHideDigitalPower = r19;
        this.mShowAntiLostSwitch = r20;
        this.mSleepAlgorithmType = r21;
        this.mSupportDateFormatSet = r22;
        this.mSupportReadDeviceInfo = r23;
        this.mSupportTemperatureUnitSet = r24;
        this.mSupportDrinkWaterSet = r25;
        this.mSupportChangeClassicBluetoothState = r26;
        this.mSupportAppSport = r27;
        this.mSupportBloodOxyGenSet = r28;
        this.mSupportWashSet = r29;
        this.mSupportRequestRealtimeWeather = r30;
        this.mSupportHID = r31;
        this.mSupportIBeaconSet = r32;
        this.mSupportWatchFaceId = r33;
        this.mSupportNewTransportMode = r34;
        this.mSupportJLTransport = r35;
        this.mSupportFindWatch = r36;
        this.mSupportWorldClock = r37;
        this.mSupportStock = r38;
        this.mSupportSMSQuickReply = r39;
        this.mSupportNoDisturbSet = r40;
        this.mSupportSetWatchPassword = r41;
        this.mSupportRealTimeMeasurement = r42;
        this.mSupportPowerSaveMode = r43;
        this.mSupportLoveTap = r44;
        this.mSupportNewsfeed = r45;
        this.mSupportMedicationReminder = r46;
        this.mSupportQrcode = r47;
        this.mSupportWeather2 = r48;
        this.mSupportAlipay = r49;
        this.mSupportStandbySet = r50;
        this.mSupport2DAcceleration = r51;
        this.mSupportTuyaKey = r52;
        this.mSupportMedicationAlarm = r53;
        this.mSupportReadPackageStatus = r54;
        this.mSupportContactSize = r55;
        this.mSupportVoice = r56;
        this.mSupportNavigation = r57;
        this.mSupportHrWarnSet = r58;
        this.mBleDefaultName = r59;
        this.mSupportMusicTransfer = r60;
        this.mSupportNoDisturbSet2 = r61;
        this.mSupportSOSSet = r62;
        this.mSupportReadLanguages = r63;
        this.mSupportGirlCareReminder = r64;
        this.mSupportAppPushSwitch = r65;
        this.mSupportReceiptCodeSize = r66;
        this.mSupportGameTimeReminder = r67;
        this.mSupportMyCardCodeSize = r68;
        this.mSupportDeviceSportData = r69;
        this.mSupportEbookTransfer = r70;
        this.mSupportDoubleScreen = r71;
        this.mSupportCustomLogo = r72;
        this.mSupportPressureTimingMeasurement = r73;
        this.mSupportTimerStandbySet = r74;
        this.mSupportSOSSet2 = r75;
        this.mSupportFallSet = r76;
        this.mSupportWalkAndBike = r77;
        this.mSupportConnectReminder = r78;
        this.mSupportSDCardInfo = r79;
        this.mSupportIncomingCallRing = r80;
        this.mSupportNotificationLightScreenSet = r81;
        this.mSupportBloodPressureCalibration = r82;
        this.mSupportOTAFile = r83;
        this.mSupportGPSFirmwareFile = r84;
        this.mSupportGoMoreSet = r85;
        this.mSupportRingVibrationSet = r86;
        this.mSupportNetwork = r87;
        this.mSupportContactSort = r88;
        this.mQrcodeSize = r89;
        this.mQrcodeContentSize = r90;
        this.mSupportStringQrcode = r91;
        this.mSupportWatchFaceIndex = r92;
        this.mSupportSosContact = r93;
        this.mSupportGirlCareMonthly = r94;
        this.mSupportWearWay = r95;
        this.mSupportGestureWake2 = r96;
        this.mSupportNavImage = r97;
        this.mSupportVoiceMaxLength = r98;
        this.mSupportAudioBooks = r99;
        this.mSupportStudyCards = r100;
        this.mSupportAppStore = r101;
        this.mSupportSHSYAlgorithm = r102;
        this.mSupportQiblaSet = r103;
        this.mSupportMeasurementBloodGlucose = r104;
        this.mSupportGameControls = r105;
        this.mSupportBatteryUsage = r106;
        this.mSupportAITranslation = r107;
        this.mSupportSimultaneousTranslation = r108;
        this.mSupportTouchSet = r109;
        this.mSupportIMEISet = r110;
        this.mSupportQuran = r111;
        this.mSupportSyncAGPSInBackground = r112;
        this.mSupportRestoreFactory = r113;
        this.mSupportRecordNote = r114;
        this.mSupportSleepScore = r115;
        this.mSupportWatchface2 = r116;
        this.mSupportAICoach = r117;
        this.mSupportCrossAppTranslation = r118;
        this.mSupportRelaxReminder = r119;
        this.mSupportPower2 = r120;
        this.mSupportWeChat = r121;
        this.mSupportWhatsApp = r122;
        this.mSupportReadLanguages2 = r123;
        this.mSupportTimeFormat = r124;
        this.mSupportVibrationIntensity = r125;
        this.mSupportHighAntiAssist = r126;
        this.mSupportWechatPay = r127;
        this.mSupportVitalityValue = r128;
        this.mSupportHRDetectionMode = r129;
        this.mSupportAICoachV2 = r130;
        this.mSupportRespiratoryRate = r131;
        this.mSupportPhysicalStrength = r132;
        this.mSupportIPC = r133;
        this.mSupportVideoCalls = r134;
        this.mSupportRecordAudio = r135;
        this.mSupportActivityRecognition = r136;
        this.mSupportMatchV3 = r137;
        this.mSupportLaunchDeviceSport = r138;
        this.mSupportGetWatchFaceMaxSize = r139;
        this.mSupportHrvSet = r140;
        this.mSupportSleepSet = r141;
        this.mSupportVoiceControl = r142;
        this.mSupportSwitchPhoneAssistant = r143;
        this.mSupportWeChatCall = r144;
        this.mSupportAiOngoingDialogue = r145;
        this.mSupportGoogleNavigation = r146;
        this.mSupportSpecialSleepStructure = r147;
        this.mSupportInheritanceAgreement = r148;
        this.mSupportChargeWhileUsing = r149;
        this.mSupportCyWeeAlgorithm = r150;
        this.mSupportShowSNNumber = r151;
        this.mSupportReadOffLineMap = r152;
        this.mSupportGolfMapData = r153;
        this.mSupportNotSaveAPPSport = r154;
        this.mSupportNoiseSet = r155;
        this.mSupportWearDetection = r156;
        this.mBlockSwimmingReminders = r157;
        this.mSupportEnergyRating = r158;
        this.mSupportAMapOfflineMap = r159;
        this.mSupportCyWeeAlgorithmGpsPush = r160;
        this.mSupportAppPushSwitch3 = r161;
        this.mSupportHydrationReminder = r162;
        this.mSupportMeetingReminder = r163;
        this.mSupportOfflineAsrAuth = r164;
    }

    public /* synthetic */ BleDeviceInfo(int r125, List r126, String r127, String r128, String r129, String r130, String r131, String r132, int r133, long r134, int r136, String r137, int r138, int r139, int r140, int r141, int r142, int r143, int r144, int r145, int r146, int r147, int r148, int r149, int r150, int r151, int r152, int r153, int r154, int r155, int r156, int r157, int r158, int r159, int r160, int r161, int r162, int r163, int r164, int r165, int r166, int r167, int r168, int r169, int r170, int r171, int r172, int r173, int r174, int r175, int r176, int r177, String r178, int r179, int r180, int r181, int r182, int r183, int r184, int r185, int r186, int r187, int r188, int r189, int r190, int r191, int r192, int r193, int r194, int r195, int r196, int r197, int r198, int r199, int r200, int r201, int r202, int r203, int r204, int r205, int r206, int r207, int r208, int r209, int r210, int r211, int r212, int r213, int r214, int r215, int r216, int r217, int r218, int r219, int r220, int r221, int r222, int r223, int r224, int r225, int r226, int r227, int r228, int r229, int r230, int r231, int r232, int r233, int r234, int r235, int r236, int r237, int r238, int r239, int r240, int r241, int r242, int r243, int r244, int r245, int r246, int r247, int r248, int r249, int r250, int r251, int r252, int r253, int r254, int r255, int r256, int r257, int r258, int r259, int r260, int r261, int r262, int r263, int r264, int r265, int r266, int r267, int r268, int r269, String r270, int r271, int r272, int r273, int r274, int r275, int r276, int r277, int r278, int r279, int r280, int r281, int r282, int r283, int r284, int r285, int r286, int r287, int r288, DefaultConstructorMarker r289) {
        if ((r284 & 1) == 0) goto L5;
        int r5 = 0;
    L7:
        if ((r284 & 2) == 0) goto L9;
        List r7 = CollectionsKt__CollectionsKt.iI();
    L10:
        String r9 = "";
        if ((r284 & 4) == 0) goto L13;
        String r8 = "";
    L15:
        if ((r284 & 8) == 0) goto L17;
        String r10 = "";
    L19:
        if ((r284 & 16) == 0) goto L21;
        String r11 = "";
    L23:
        if ((r284 & 32) == 0) goto L25;
        String r12 = "";
    L27:
        if ((r284 & 64) == 0) goto L29;
        String r13 = "";
    L31:
        if ((r284 & 128) == 0) goto L33;
        String r14 = "";
    L35:
        if ((r284 & 256) == 0) goto L37;
        int r15 = 0;
    L39:
        if ((r284 & 512) == 0) goto L41;
        long r16 = 0;
    L43:
        if ((r284 & 1024) == 0) goto L45;
        int r6 = 0;
    L46:
        int r1210 = r5;
        if ((r284 & 2048) == 0) goto L49;
        String r17 = "";
    L50:
        String r1211 = r17;
        if ((r284 & 4096) == 0) goto L53;
        int r18 = 0;
    L54:
        int r1212 = r18;
        if ((r284 & 8192) == 0) goto L57;
        int r19 = 0;
    L58:
        int r1213 = r19;
        if ((r284 & 16384) == 0) goto L61;
        int r20 = 0;
    L63:
        if ((r284 & 32768) == 0) goto L65;
        int r110 = 0;
    L67:
        if ((r284 & 65536) == 0) goto L69;
        int r21 = 0;
    L71:
        if ((r284 & 131072) == 0) goto L73;
        int r23 = 0;
    L75:
        if ((r284 & 262144) == 0) goto L77;
        int r25 = 0;
    L79:
        if ((r284 & 524288) == 0) goto L81;
        int r27 = 0;
    L83:
        if ((r284 & 1048576) == 0) goto L85;
        int r28 = 0;
    L87:
        if ((r284 & 2097152) == 0) goto L89;
        int r29 = 0;
    L91:
        if ((r284 & 4194304) == 0) goto L93;
        int r30 = 0;
    L95:
        if ((r284 & 8388608) == 0) goto L97;
        int r31 = 0;
    L99:
        if ((r284 & 16777216) == 0) goto L101;
        int r32 = 0;
    L103:
        if ((r284 & 33554432) == 0) goto L105;
        int r33 = 0;
    L107:
        if ((r284 & 67108864) == 0) goto L109;
        int r34 = 0;
    L111:
        if ((r284 & 134217728) == 0) goto L113;
        int r35 = 0;
    L115:
        if ((r284 & 268435456) == 0) goto L117;
        int r36 = 0;
    L119:
        if ((r284 & 536870912) == 0) goto L121;
        int r37 = 0;
    L123:
        if ((r284 & 1073741824) == 0) goto L125;
        int r38 = 0;
    L127:
        if ((r284 & Integer.MIN_VALUE) == 0) goto L129;
        int r0 = 0;
    L131:
        if ((r285 & 1) == 0) goto L133;
        int r39 = 0;
    L135:
        if ((r285 & 2) == 0) goto L137;
        int r40 = 0;
    L139:
        if ((r285 & 4) == 0) goto L141;
        int r41 = 0;
    L143:
        if ((r285 & 8) == 0) goto L145;
        int r42 = 0;
    L147:
        if ((r285 & 16) == 0) goto L149;
        int r43 = 0;
    L151:
        if ((r285 & 32) == 0) goto L153;
        int r44 = 0;
    L155:
        if ((r285 & 64) == 0) goto L157;
        int r45 = 0;
    L158:
        int r1214 = r0;
        if ((r285 & 128) == 0) goto L161;
        int r1 = 0;
    L162:
        int r135 = r1;
        if ((r285 & 256) == 0) goto L165;
        int r2 = 0;
    L166:
        int r1310 = r2;
        if ((r285 & 512) == 0) goto L169;
        int r3 = 0;
    L170:
        int r1311 = r3;
        if ((r285 & 1024) == 0) goto L173;
        int r4 = 0;
    L174:
        int r1312 = r4;
        if ((r285 & 2048) == 0) goto L177;
        int r22 = 0;
    L178:
        int r1313 = r22;
        if ((r285 & 4096) == 0) goto L181;
        int r24 = 0;
    L182:
        int r1314 = r24;
        if ((r285 & 8192) == 0) goto L185;
        int r26 = 0;
    L186:
        int r1315 = r26;
        if ((r285 & 16384) == 0) goto L189;
        int r46 = 0;
    L191:
        if ((r285 & 32768) == 0) goto L193;
        int r47 = 0;
    L195:
        if ((r285 & 65536) == 0) goto L197;
        int r48 = 0;
    L199:
        if ((r285 & 131072) == 0) goto L201;
        int r49 = 0;
    L203:
        if ((r285 & 262144) == 0) goto L205;
        int r410 = 0;
    L207:
        if ((r285 & 524288) == 0) goto L209;
        int r50 = 0;
    L211:
        if ((r285 & 1048576) == 0) goto L213;
        String r51 = "";
    L215:
        if ((r285 & 2097152) == 0) goto L217;
        int r52 = 0;
    L219:
        if ((r285 & 4194304) == 0) goto L221;
        int r53 = 0;
    L223:
        if ((r285 & 8388608) == 0) goto L225;
        int r54 = 0;
    L227:
        if ((r285 & 16777216) == 0) goto L229;
        int r55 = 0;
    L231:
        if ((r285 & 33554432) == 0) goto L233;
        int r56 = 0;
    L235:
        if ((r285 & 67108864) == 0) goto L237;
        int r57 = 0;
    L239:
        if ((r285 & 134217728) == 0) goto L241;
        int r58 = 0;
    L243:
        if ((r285 & 268435456) == 0) goto L245;
        int r59 = 0;
    L247:
        if ((r285 & 536870912) == 0) goto L249;
        int r60 = 0;
    L251:
        if ((r285 & 1073741824) == 0) goto L253;
        int r61 = 0;
    L255:
        if ((r285 & Integer.MIN_VALUE) == 0) goto L257;
        int r62 = 0;
    L259:
        if ((r286 & 1) == 0) goto L261;
        int r63 = 0;
    L263:
        if ((r286 & 2) == 0) goto L265;
        int r64 = 0;
    L267:
        if ((r286 & 4) == 0) goto L269;
        int r65 = 0;
    L271:
        if ((r286 & 8) == 0) goto L273;
        int r66 = 0;
    L275:
        if ((r286 & 16) == 0) goto L277;
        int r67 = 0;
    L279:
        if ((r286 & 32) == 0) goto L281;
        int r68 = 0;
    L283:
        if ((r286 & 64) == 0) goto L285;
        int r69 = 0;
    L286:
        int r1316 = r46;
        if ((r286 & 128) == 0) goto L289;
        int r70 = 0;
    L290:
        int r1317 = r70;
        if ((r286 & 256) == 0) goto L293;
        int r71 = 0;
    L294:
        int r1318 = r71;
        if ((r286 & 512) == 0) goto L297;
        int r72 = 0;
    L298:
        int r1410 = r72;
        if ((r286 & 1024) == 0) goto L301;
        int r73 = 0;
    L302:
        int r1411 = r73;
        if ((r286 & 2048) == 0) goto L305;
        int r74 = 0;
    L306:
        int r1412 = r74;
        if ((r286 & 4096) == 0) goto L309;
        int r75 = 0;
    L310:
        int r1413 = r75;
        if ((r286 & 8192) == 0) goto L313;
        int r76 = 0;
    L314:
        int r1414 = r76;
        if ((r286 & 16384) == 0) goto L317;
        int r77 = 0;
    L319:
        if ((r286 & 32768) == 0) goto L321;
        int r610 = 0;
    L323:
        if ((r286 & 65536) == 0) goto L325;
        int r78 = 0;
    L327:
        if ((r286 & 131072) == 0) goto L329;
        int r79 = 0;
    L331:
        if ((r286 & 262144) == 0) goto L333;
        int r710 = 0;
    L335:
        if ((r286 & 524288) == 0) goto L337;
        int r711 = 0;
    L339:
        if ((r286 & 1048576) == 0) goto L341;
        int r712 = 0;
    L343:
        if ((r286 & 2097152) == 0) goto L345;
        int r713 = 0;
    L347:
        if ((r286 & 4194304) == 0) goto L349;
        int r714 = 0;
    L351:
        if ((r286 & 8388608) == 0) goto L353;
        int r715 = 0;
    L355:
        if ((r286 & 16777216) == 0) goto L357;
        int r716 = 0;
    L359:
        if ((r286 & 33554432) == 0) goto L361;
        int r717 = 0;
    L363:
        if ((r286 & 67108864) == 0) goto L365;
        int r80 = 0;
    L367:
        if ((r286 & 134217728) == 0) goto L369;
        int r81 = 0;
    L371:
        if ((r286 & 268435456) == 0) goto L373;
        int r82 = 0;
    L375:
        if ((r286 & 536870912) == 0) goto L377;
        int r83 = 0;
    L379:
        if ((r286 & 1073741824) == 0) goto L381;
        int r84 = 0;
    L383:
        if ((r286 & Integer.MIN_VALUE) == 0) goto L385;
        int r85 = 0;
    L387:
        if ((r287 & 1) == 0) goto L389;
        int r86 = 0;
    L391:
        if ((r287 & 2) == 0) goto L393;
        int r87 = 0;
    L395:
        if ((r287 & 4) == 0) goto L397;
        int r88 = 0;
    L399:
        if ((r287 & 8) == 0) goto L401;
        int r89 = 0;
    L403:
        if ((r287 & 16) == 0) goto L405;
        int r810 = 0;
    L407:
        if ((r287 & 32) == 0) goto L409;
        int r90 = 0;
    L411:
        if ((r287 & 64) == 0) goto L413;
        int r91 = 0;
    L414:
        int r1415 = r77;
        if ((r287 & 128) == 0) goto L417;
        int r92 = 0;
    L418:
        int r1416 = r92;
        if ((r287 & 256) == 0) goto L421;
        int r93 = 0;
    L422:
        int r1417 = r93;
        if ((r287 & 512) == 0) goto L425;
        int r94 = 0;
    L426:
        int r1418 = r94;
        if ((r287 & 1024) == 0) goto L429;
        int r95 = 0;
    L430:
        int r1419 = r95;
        if ((r287 & 2048) == 0) goto L433;
        int r96 = 0;
    L434:
        int r1510 = r96;
        if ((r287 & 4096) == 0) goto L437;
        int r97 = 0;
    L438:
        int r1511 = r97;
        if ((r287 & 8192) == 0) goto L441;
        int r98 = 0;
    L442:
        int r1512 = r98;
        if ((r287 & 16384) == 0) goto L445;
        int r99 = 0;
    L447:
        if ((r287 & 32768) == 0) goto L449;
        int r910 = 0;
    L451:
        if ((r287 & 65536) == 0) goto L453;
        int r911 = 0;
    L455:
        if ((r287 & 131072) == 0) goto L457;
        int r912 = 0;
    L459:
        if ((r287 & 262144) == 0) goto L461;
        int r913 = 0;
    L463:
        if ((r287 & 524288) == 0) goto L465;
        int r914 = 0;
    L467:
        if ((r287 & 1048576) == 0) goto L469;
        int r915 = 0;
    L471:
        if ((r287 & 2097152) == 0) goto L473;
        int r916 = 0;
    L475:
        if ((r287 & 4194304) == 0) goto L477;
        int r917 = 0;
    L479:
        if ((r287 & 8388608) == 0) goto L481;
        int r100 = 0;
    L483:
        if ((r287 & 16777216) == 0) goto L485;
        int r101 = 0;
    L487:
        if ((r287 & 33554432) == 0) goto L489;
        int r102 = 0;
    L491:
        if ((r287 & 67108864) == 0) goto L493;
        int r103 = 0;
    L495:
        if ((r287 & 134217728) == 0) goto L497;
        int r104 = 0;
    L499:
        if ((r287 & 268435456) == 0) goto L501;
        int r105 = 0;
    L503:
        if ((r287 & 536870912) == 0) goto L505;
        int r106 = 0;
    L507:
        if ((r287 & 1073741824) == 0) goto L509;
        int r107 = 0;
    L511:
        if ((r287 & Integer.MIN_VALUE) == 0) goto L513;
        int r108 = 0;
    L515:
        if ((r288 & 1) == 0) goto L517;
        int r109 = 0;
    L519:
        if ((r288 & 2) == 0) goto L521;
        int r1010 = 0;
    L523:
        if ((r288 & 4) == 0) goto L525;
        int r111 = 0;
    L527:
        if ((r288 & 8) == 0) goto L529;
        int r112 = 0;
    L531:
        if ((r288 & 16) == 0) goto L533;
        int r113 = 0;
    L535:
        if ((r288 & 32) == 0) goto L537;
        int r114 = 0;
    L539:
        if ((r288 & 64) == 0) goto L541;
        int r115 = 0;
    L542:
        int r1513 = r99;
        if ((r288 & 128) == 0) goto L545;
        int r116 = 0;
    L546:
        int r1514 = r116;
        if ((r288 & 256) == 0) goto L549;
        int r117 = 0;
    L550:
        int r1515 = r117;
        if ((r288 & 512) == 0) goto L553;
        int r118 = 0;
    L554:
        int r1516 = r118;
        if ((r288 & 1024) == 0) goto L557;
        int r119 = 0;
    L558:
        int r1517 = r119;
        if ((r288 & 2048) == 0) goto L561;
        int r120 = 0;
    L562:
        int r1518 = r120;
        if ((r288 & 4096) == 0) goto L565;
        int r121 = 0;
    L566:
        int r1519 = r121;
        if ((r288 & 8192) == 0) goto L569;
        int r122 = 0;
    L570:
        int r1610 = r122;
        if ((r288 & 16384) == 0) goto L573;
        int r123 = 0;
    L575:
        if ((r288 & 32768) == 0) goto L577;
        int r124 = 0;
    L579:
        if ((r288 & 65536) != 0) goto L583;
        r9 = r270;
    L583:
        if ((r288 & 131072) == 0) goto L585;
        int r290 = 0;
    L587:
        if ((r288 & 262144) == 0) goto L589;
        int r291 = 0;
    L591:
        if ((r288 & 524288) == 0) goto L593;
        int r292 = 0;
    L595:
        if ((r288 & 1048576) == 0) goto L597;
        int r293 = 0;
    L599:
        if ((r288 & 2097152) == 0) goto L601;
        int r1110 = 0;
    L603:
        if ((r288 & 4194304) == 0) goto L605;
        int r1111 = 0;
    L607:
        if ((r288 & 8388608) == 0) goto L609;
        int r1112 = 0;
    L611:
        if ((r288 & 16777216) == 0) goto L613;
        int r1113 = 0;
    L615:
        if ((r288 & 33554432) == 0) goto L617;
        int r1114 = 0;
    L619:
        if ((r288 & 67108864) == 0) goto L621;
        int r1215 = 0;
    L623:
        if ((r288 & 134217728) == 0) goto L625;
        int r1216 = 0;
    L627:
        if ((r288 & 268435456) == 0) goto L629;
        int r1217 = 0;
    L631:
        if ((r288 & 536870912) == 0) goto L634;
        int r2810 = 0;
    L635:
        this(r1210, r7, r8, r10, r11, r12, r13, r14, r15, r16, r6, r1211, r1212, r1213, r20, r110, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r1214, r39, r40, r41, r42, r43, r44, r45, r135, r1310, r1311, r1312, r1313, r1314, r1315, r1316, r47, r48, r49, r410, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r1317, r1318, r1410, r1411, r1412, r1413, r1414, r1415, r610, r78, r79, r710, r711, r712, r713, r714, r715, r716, r717, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r810, r90, r91, r1416, r1417, r1418, r1419, r1510, r1511, r1512, r1513, r910, r911, r912, r913, r914, r915, r916, r917, r100, r101, r102, r103, r104, r105, r106, r107, r108, r109, r1010, r111, r112, r113, r114, r115, r1514, r1515, r1516, r1517, r1518, r1519, r1610, r123, r124, r9, r290, r291, r292, r293, r1110, r1111, r1112, r1113, r1114, r1215, r1216, r1217, r2810);
        return;
    L634:
        r2810 = r283;
        goto L635
    L629:
        r1217 = r282;
        goto L631
    L625:
        r1216 = r281;
        goto L627
    L621:
        r1215 = r280;
        goto L623
    L617:
        r1114 = r279;
        goto L619
    L613:
        r1113 = r278;
        goto L615
    L609:
        r1112 = r277;
        goto L611
    L605:
        r1111 = r276;
        goto L607
    L601:
        r1110 = r275;
        goto L603
    L597:
        r293 = r274;
        goto L599
    L593:
        r292 = r273;
        goto L595
    L589:
        r291 = r272;
        goto L591
    L585:
        r290 = r271;
        goto L587
    L577:
        r124 = r269;
        goto L579
    L573:
        r123 = r268;
        goto L575
    L569:
        r122 = r267;
        goto L570
    L565:
        r121 = r266;
        goto L566
    L561:
        r120 = r265;
        goto L562
    L557:
        r119 = r264;
        goto L558
    L553:
        r118 = r263;
        goto L554
    L549:
        r117 = r262;
        goto L550
    L545:
        r116 = r261;
        goto L546
    L541:
        r115 = r260;
        goto L542
    L537:
        r114 = r259;
        goto L539
    L533:
        r113 = r258;
        goto L535
    L529:
        r112 = r257;
        goto L531
    L525:
        r111 = r256;
        goto L527
    L521:
        r1010 = r255;
        goto L523
    L517:
        r109 = r254;
        goto L519
    L513:
        r108 = r253;
        goto L515
    L509:
        r107 = r252;
        goto L511
    L505:
        r106 = r251;
        goto L507
    L501:
        r105 = r250;
        goto L503
    L497:
        r104 = r249;
        goto L499
    L493:
        r103 = r248;
        goto L495
    L489:
        r102 = r247;
        goto L491
    L485:
        r101 = r246;
        goto L487
    L481:
        r100 = r245;
        goto L483
    L477:
        r917 = r244;
        goto L479
    L473:
        r916 = r243;
        goto L475
    L469:
        r915 = r242;
        goto L471
    L465:
        r914 = r241;
        goto L467
    L461:
        r913 = r240;
        goto L463
    L457:
        r912 = r239;
        goto L459
    L453:
        r911 = r238;
        goto L455
    L449:
        r910 = r237;
        goto L451
    L445:
        r99 = r236;
        goto L447
    L441:
        r98 = r235;
        goto L442
    L437:
        r97 = r234;
        goto L438
    L433:
        r96 = r233;
        goto L434
    L429:
        r95 = r232;
        goto L430
    L425:
        r94 = r231;
        goto L426
    L421:
        r93 = r230;
        goto L422
    L417:
        r92 = r229;
        goto L418
    L413:
        r91 = r228;
        goto L414
    L409:
        r90 = r227;
        goto L411
    L405:
        r810 = r226;
        goto L407
    L401:
        r89 = r225;
        goto L403
    L397:
        r88 = r224;
        goto L399
    L393:
        r87 = r223;
        goto L395
    L389:
        r86 = r222;
        goto L391
    L385:
        r85 = r221;
        goto L387
    L381:
        r84 = r220;
        goto L383
    L377:
        r83 = r219;
        goto L379
    L373:
        r82 = r218;
        goto L375
    L369:
        r81 = r217;
        goto L371
    L365:
        r80 = r216;
        goto L367
    L361:
        r717 = r215;
        goto L363
    L357:
        r716 = r214;
        goto L359
    L353:
        r715 = r213;
        goto L355
    L349:
        r714 = r212;
        goto L351
    L345:
        r713 = r211;
        goto L347
    L341:
        r712 = r210;
        goto L343
    L337:
        r711 = r209;
        goto L339
    L333:
        r710 = r208;
        goto L335
    L329:
        r79 = r207;
        goto L331
    L325:
        r78 = r206;
        goto L327
    L321:
        r610 = r205;
        goto L323
    L317:
        r77 = r204;
        goto L319
    L313:
        r76 = r203;
        goto L314
    L309:
        r75 = r202;
        goto L310
    L305:
        r74 = r201;
        goto L306
    L301:
        r73 = r200;
        goto L302
    L297:
        r72 = r199;
        goto L298
    L293:
        r71 = r198;
        goto L294
    L289:
        r70 = r197;
        goto L290
    L285:
        r69 = r196;
        goto L286
    L281:
        r68 = r195;
        goto L283
    L277:
        r67 = r194;
        goto L279
    L273:
        r66 = r193;
        goto L275
    L269:
        r65 = r192;
        goto L271
    L265:
        r64 = r191;
        goto L267
    L261:
        r63 = r190;
        goto L263
    L257:
        r62 = r189;
        goto L259
    L253:
        r61 = r188;
        goto L255
    L249:
        r60 = r187;
        goto L251
    L245:
        r59 = r186;
        goto L247
    L241:
        r58 = r185;
        goto L243
    L237:
        r57 = r184;
        goto L239
    L233:
        r56 = r183;
        goto L235
    L229:
        r55 = r182;
        goto L231
    L225:
        r54 = r181;
        goto L227
    L221:
        r53 = r180;
        goto L223
    L217:
        r52 = r179;
        goto L219
    L213:
        r51 = r178;
        goto L215
    L209:
        r50 = r177;
        goto L211
    L205:
        r410 = r176;
        goto L207
    L201:
        r49 = r175;
        goto L203
    L197:
        r48 = r174;
        goto L199
    L193:
        r47 = r173;
        goto L195
    L189:
        r46 = r172;
        goto L191
    L185:
        r26 = r171;
        goto L186
    L181:
        r24 = r170;
        goto L182
    L177:
        r22 = r169;
        goto L178
    L173:
        r4 = r168;
        goto L174
    L169:
        r3 = r167;
        goto L170
    L165:
        r2 = r166;
        goto L166
    L161:
        r1 = r165;
        goto L162
    L157:
        r45 = r164;
        goto L158
    L153:
        r44 = r163;
        goto L155
    L149:
        r43 = r162;
        goto L151
    L145:
        r42 = r161;
        goto L147
    L141:
        r41 = r160;
        goto L143
    L137:
        r40 = r159;
        goto L139
    L133:
        r39 = r158;
        goto L135
    L129:
        r0 = r157;
        goto L131
    L125:
        r38 = r156;
        goto L127
    L121:
        r37 = r155;
        goto L123
    L117:
        r36 = r154;
        goto L119
    L113:
        r35 = r153;
        goto L115
    L109:
        r34 = r152;
        goto L111
    L105:
        r33 = r151;
        goto L107
    L101:
        r32 = r150;
        goto L103
    L97:
        r31 = r149;
        goto L99
    L93:
        r30 = r148;
        goto L95
    L89:
        r29 = r147;
        goto L91
    L85:
        r28 = r146;
        goto L87
    L81:
        r27 = r145;
        goto L83
    L77:
        r25 = r144;
        goto L79
    L73:
        r23 = r143;
        goto L75
    L69:
        r21 = r142;
        goto L71
    L65:
        r110 = r141;
        goto L67
    L61:
        r20 = r140;
        goto L63
    L57:
        r19 = r139;
        goto L58
    L53:
        r18 = r138;
        goto L54
    L49:
        r17 = r137;
        goto L50
    L45:
        r6 = r136;
        goto L46
    L41:
        r16 = r134;
        goto L43
    L37:
        r15 = r133;
        goto L39
    L33:
        r14 = r132;
        goto L35
    L29:
        r13 = r131;
        goto L31
    L25:
        r12 = r130;
        goto L27
    L21:
        r11 = r129;
        goto L23
    L17:
        r10 = r128;
        goto L19
    L13:
        r8 = r127;
        goto L15
    L9:
        r7 = r126;
        goto L10
    L5:
        r5 = r125;
        goto L7
    }
}
