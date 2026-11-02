package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class Api {

    /* JADX INFO: renamed from: A */
    @aa1
    public static final String f51335A = "A";

    @aa1
    public static final String ACCESS_TOKEN = "accessToken";

    @aa1
    public static final String ADDRESS = "address";

    @aa1
    public static final String AGPS_TYPE = "agpsType";

    @aa1
    public static final String AI_MODEL = "model";

    @aa1
    public static final String AI_QUERY = "text";

    @aa1
    public static final String API_TOKEN = "token";

    @aa1
    public static final String APP_NAME = "appName";

    @aa1
    public static final String APP_PLATFORM = "appPlatform";

    @aa1
    public static final String APP_VERSION = "androidVersion";

    @aa1
    public static final String AVATAR = "avatar";

    @aa1
    public static final String BIRTHDAY = "birthday";

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String CITY = "city";

    @aa1
    public static final String CONTACT_WAY = "contactWay";

    @aa1
    public static final String CONTENT = "content";

    @aa1
    public static final String COUNTRY = "country";

    @aa1
    public static final String DATA_ACTIVITY = "1";

    @aa1
    public static final String DATA_BLOOD_OXYGEN = "9";

    @aa1
    public static final String DATA_BLOOD_PRESSURE = "2";

    @aa1
    public static final String DATA_HEART_RATE = "3";

    @aa1
    public static final String DATA_HRV = "10";

    @aa1
    public static final String DATA_LOCATION = "4";

    @aa1
    public static final String DATA_SLEEP = "5";

    @aa1
    public static final String DATA_TEMPERATURE = "8";

    @aa1
    public static final String DATA_WEIGHT = "6";

    @aa1
    public static final String DATA_WORKOUT = "7";
    public static final int DEFALUT_LIMIT = 200;
    public static final int DEFAULT_PAGE = 1;
    public static final int DEFAULT_PROJECT_ID = 58;

    @aa1
    public static final String DIAL_TYPE = "dialType";

    @aa1
    public static final String DICT_TYPE = "dictType";

    @aa1
    public static final String EMAIL = "email";

    @aa1
    public static final String EXTRA_INFO = "extraInfo";

    @aa1
    public static final String EXT_INFO = "extInfo";

    @aa1
    public static final String FILTER = "filter";

    @aa1
    public static final String FIRMWARE_FLAG = "flag";

    @aa1
    public static final String FIRMWARE_FLAG2 = "firmwareFlag";

    @aa1
    public static final String FIRMWARE_ID = "firmwareId";

    @aa1
    public static final String FIRMWARE_VERSION = "firmwareVersion";

    @aa1
    public static final String FONT_VERSION = "fontVersion";

    @aa1
    public static final String GENDER = "gender";

    @aa1
    public static final String GOALSERVER = "goalServer";

    @aa1
    public static final String GPS_PACK_VERSION = "gpsPackVersion";

    @aa1
    public static final String HEIGHT = "height";

    /* JADX INFO: renamed from: ID */
    @aa1
    public static final String f51336ID = "id";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final String IMAGE_COUNT = "imageCount";

    @aa1
    public static final Api INSTANCE = new Api();

    @aa1
    public static final String JOBID = "jobId";

    @aa1
    public static final String LANGUAGE = "language";

    @aa1
    public static final String LANGUAGE_CODE = "languageCode";

    @aa1
    public static final String LANGUAGE_PACK_VERSION = "languagePackVersion";

    @aa1
    public static final String LAT = "lat";

    @aa1
    public static final String LATITUDE = "latitude";

    @aa1
    public static final String LIMIT = "limit";

    @aa1
    public static final String LON = "lon";

    @aa1
    public static final String LONGITUDE = "longitude";

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    /* JADX INFO: renamed from: N */
    @aa1
    public static final String f51337N = "N";

    @aa1
    public static final String NAME = "name";

    @aa1
    public static final String NETWORK_PACK_VERSION = "networkPackVersion";

    @aa1
    public static final String NICK_NAME = "nickname";

    @aa1
    public static final String NICK_NAME_V2 = "nickName";

    @aa1
    public static final String OLD_MAC_ADDRESS = "oldMacAddress";

    @aa1
    public static final String OLD_OPEN_ID = "oldOpenId";

    @aa1
    public static final String OPEN_ID = "openId";

    @aa1
    public static final String ORDER_ELE_ID = "eleId";

    @aa1
    public static final String ORDER_NUM = "orderNum";

    @aa1
    public static final String ORDER_PAGE_NUM = "pageNum";

    @aa1
    public static final String ORDER_PAGE_SIZE = "pageSize";

    @aa1
    public static final String ORDER_TYPE = "orderType";

    @aa1
    public static final String OSVERSION = "osVersion";

    @aa1
    public static final String PAGE = "page";

    @aa1
    public static final String PASSWORD = "password";

    @aa1
    public static final String PHONEIDENTITY = "phoneIdentity";

    @aa1
    public static final String PHONEMODEL = "phoneModel";

    @aa1
    public static final String PHONEOS = "phoneOs";

    @aa1
    public static final String PHONE_IDENTITY = "phoneIdentity";

    @aa1
    public static final String PLATFORM = "platform";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String PROTOTYPE = "prototype";

    @aa1
    public static final String PROTOTYPE2 = "devicePrototype";

    @aa1
    public static final String QUERY = "query";

    @aa1
    public static final String QUERYKEY = "queryKey";

    @aa1
    public static final String SERVER = "server";

    @aa1
    public static final String SETTINGS = "settings";

    @aa1
    public static final String STATE = "state";

    @aa1
    public static final String STOCK_ID = "stockId";

    @aa1
    public static final String STYLE = "style";

    @aa1
    public static final String UI_PACK_VERSION = "uiPackVersion";

    @aa1
    public static final String UI_VERSION = "uiVersion";

    @aa1
    public static final String UNIT = "unit";

    @aa1
    public static final String USER_ID = "uid";

    @aa1
    public static final String USER_NAME = "userName";

    @aa1
    public static final String VALID = "valid";

    @aa1
    public static final String VERIFICATION_CODE = "verificationCode";

    @aa1
    public static final String VERIFICATION_TYPE = "verificationType";

    @aa1
    public static final String VERIFY_PASSWORD = "verifyPassword";

    @aa1
    public static final String VERSION = "version";

    @aa1
    public static final String WEIGHT = "weight";

    /* JADX INFO: renamed from: Y */
    @aa1
    public static final String f51338Y = "Y";

    private Api() {
    }

    @aa1
    public final String getBASE_URL() {
        String string = a01.OXO1.IiI10X().getString(b01.X01IiOiIi);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        return string;
    }
}
