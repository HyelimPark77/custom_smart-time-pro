package com.jieli.jl_bt_ota.constant;

import com.jieli.jl_bt_ota.interfaces.command.ICmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.CustomCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.DataCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.DisconnectClassicBluetoothCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.GetDevMD5CmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.GetTargetFeatureMapCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.GetTargetInfoCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.NotifyCommunicationWayCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.OtaCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.RcspCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.SettingsMtuCmdHandler;
import com.jieli.jl_bt_ota.model.cmdHandler.TwsCmdHandler;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public class Command {
    public static final int CMD_ADV_DEVICE_NOTIFY = 194;
    public static final int CMD_ADV_DEV_REQUEST_OPERATION = 196;
    public static final int CMD_ADV_NOTIFY_SETTINGS = 195;
    public static final int CMD_CUSTOM = 240;
    public static final int CMD_DATA = 1;
    public static final int CMD_DISCONNECT_CLASSIC_BLUETOOTH = 6;
    public static final int CMD_EXTRA_CUSTOM = 255;
    public static final int CMD_GET_DEV_MD5 = 212;
    public static final int CMD_GET_TARGET_FEATURE_MAP = 2;
    public static final int CMD_GET_TARGET_INFO = 3;
    public static final int CMD_OTA_ENTER_UPDATE_MODE = 227;
    public static final int CMD_OTA_EXIT_UPDATE_MODE = 228;
    public static final int CMD_OTA_GET_DEVICE_REFRESH_FIRMWARE_STATUS = 230;
    public static final int CMD_OTA_GET_DEVICE_UPDATE_FILE_INFO_OFFSET = 225;
    public static final int CMD_OTA_INQUIRE_DEVICE_IF_CAN_UPDATE = 226;
    public static final int CMD_OTA_NOTIFY_UPDATE_CONTENT_SIZE = 232;
    public static final int CMD_OTA_SEND_FIRMWARE_UPDATE_BLOCK = 229;
    public static final int CMD_REBOOT_DEVICE = 231;
    public static final int CMD_SETTINGS_COMMUNICATION_MTU = 209;
    public static final int CMD_SWITCH_DEVICE_REQUEST = 11;

    /* JADX INFO: renamed from: a */
    private static Map<Integer, ICmdHandler> f37470a;

    public static Map<Integer, ICmdHandler> getValidCommandList() {
        Map<Integer, ICmdHandler> map = f37470a;
        if (map == null || map.isEmpty()) {
            HashMap map2 = new HashMap();
            f37470a = map2;
            map2.put(1, new DataCmdHandler());
            f37470a.put(2, new GetTargetFeatureMapCmdHandler());
            f37470a.put(3, new GetTargetInfoCmdHandler());
            f37470a.put(6, new DisconnectClassicBluetoothCmdHandler());
            f37470a.put(11, new NotifyCommunicationWayCmdHandler());
            f37470a.put(225, new OtaCmdHandler());
            f37470a.put(226, new OtaCmdHandler());
            f37470a.put(227, new OtaCmdHandler());
            f37470a.put(228, new OtaCmdHandler());
            f37470a.put(229, new OtaCmdHandler());
            f37470a.put(230, new OtaCmdHandler());
            f37470a.put(231, new OtaCmdHandler());
            f37470a.put(232, new OtaCmdHandler());
            f37470a.put(209, new SettingsMtuCmdHandler());
            f37470a.put(212, new GetDevMD5CmdHandler());
            f37470a.put(240, new RcspCmdHandler());
            f37470a.put(255, new CustomCmdHandler());
            f37470a.put(194, new TwsCmdHandler());
            f37470a.put(195, new TwsCmdHandler());
            f37470a.put(196, new TwsCmdHandler());
        }
        return f37470a;
    }

    public static boolean isValidCmd(int i) {
        return getValidCommandList().containsKey(Integer.valueOf(i));
    }
}
