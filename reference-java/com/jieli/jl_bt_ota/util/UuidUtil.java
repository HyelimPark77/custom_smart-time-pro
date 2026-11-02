package com.jieli.jl_bt_ota.util;

import android.os.ParcelUuid;
import androidx.annotation.NonNull;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public class UuidUtil {

    /* JADX INFO: renamed from: a */
    private static final String f37756a = "0000-1000-8000-00805F9B34FB";

    /* JADX INFO: renamed from: a */
    private static String m27245a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static boolean equalUUID(UUID uuid, UUID uuid2) {
        if (uuid == null || uuid2 == null) {
            return false;
        }
        return uuid.toString().equalsIgnoreCase(uuid2.toString());
    }

    public static String getDescriptorName(@NonNull UUID uuid) {
        String strReplace = read16BitUUID(uuid).replace(HexStringBuilder.DEFAULT_PREFIX, "");
        strReplace.getClass();
        switch (strReplace) {
            case "2900":
                return "Characteristic Extended Properties";
            case "2901":
                return "Characteristic User Description";
            case "2902":
                return "Client Characteristic Configuration";
            case "2903":
                return "Server Characteristic Configuration";
            case "2904":
                return "Characteristic Presentation Format";
            case "2905":
                return "Characteristic Aggregate Format";
            default:
                return "Unknown Descriptor";
        }
    }

    public static String getUUIDName(UUID uuid) {
        if (uuid == null) {
            return "";
        }
        String strReplace = read16BitUUID(uuid).replace(HexStringBuilder.DEFAULT_PREFIX, "");
        strReplace.getClass();
        switch (strReplace) {
            case "1101":
                return "Serial Port Profile(SPP)";
            case "1102":
                return "LAN Access Using PPP Profile";
            case "1103":
                return "Dialup Networking Profile";
            case "1104":
                return "IrMC Sync Profile";
            case "1105":
                return "Object Push Profile(OPP)";
            case "1106":
                return "File Transfer Profile(SPP)";
            case "1107":
                return "IrMC Sync Command Profile";
            case "1108":
                return "Headset Profile";
            case "1109":
                return "Cordless Telephony Profile";
            case "110A":
                return "Audio Source Profile";
            case "110B":
                return "Advanced Audio Distribution Profile(A2DP)";
            case "110C":
                return "Audio/Video Remote Control Target Profile";
            case "110D":
                return "Advanced Audio Distribution Profile";
            case "110E":
                return "Audio/Video Remote Control Profile(AVRCP)";
            case "110F":
                return "Video Conferencing Profile";
            case "1110":
                return "Intercom Profile";
            case "1111":
                return "Fax Profile";
            case "1112":
                return "Headset Audio Gateway Profile";
            case "111E":
                return "Heads-Free Profile(HFP)";
            case "111F":
                return "Hands-Free Audio Gateway Profile(HFP)";
            case "1124":
                return "Human Interface Device Profile(HID)";
            case "1800":
                return "Generic Access Service";
            case "1801":
                return "Generic Attribute Profile";
            case "1808":
                return "Glucose Service";
            case "1809":
                return "Health Thermometer Service";
            case "180A":
                return "Device Information Service";
            case "180D":
                return "Heart Rate Service";
            case "180F":
                return "Battery Service";
            case "1810":
                return "Blood Pressure Service";
            case "1811":
                return "Alert Notification Service";
            case "1812":
                return "Human Interface Device (HID) Service";
            case "1814":
                return "Running Speed and Cadence Service";
            case "1816":
                return "Cycling Speed and Cadence Service";
            case "181A":
                return "Environmental Sensing Service";
            case "1820":
                return "Internet Protocol Support Service";
            case "1826":
                return "Fitness Machine Service";
            case "2A00":
                return "Device Name";
            case "2A01":
                return "Appearance";
            case "2A04":
                return "Peripheral Preferred Connection Parameters";
            case "2A05":
                return "RSSI Characteristic";
            case "2A19":
                return "Battery Level";
            case "2A1C":
                return "Temperature Measurement";
            case "2A23":
                return "System ID";
            case "2A24":
                return "Model Number String";
            case "2A25":
                return "Serial Number String";
            case "2A26":
                return "Firmware Revision String";
            case "2A27":
                return "Hardware Revision String";
            case "2A28":
                return "Software Revision String";
            case "2A29":
                return "Manufacturer Name String";
            case "2A37":
                return "Heart Rate Measurement";
            case "2A5B":
                return "Cycling Speed and Cadence Measurement";
            case "2A5C":
                return "Running Speed and Cadence Measurement";
            default:
                return "Unknown UUID(" + uuid + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static String read16BitUUID(UUID uuid) {
        if (uuid == null) {
            return "";
        }
        String[] strArrSplit = uuid.toString().split(HelpFormatter.DEFAULT_OPT_PREFIX, 2);
        if (strArrSplit.length == 2 && strArrSplit[1].equalsIgnoreCase(f37756a)) {
            String str = strArrSplit[0];
            return str.length() != 8 ? uuid.toString() : m27245a("0x%s", str.substring(4).toUpperCase(Locale.getDefault()));
        }
        return uuid.toString();
    }

    public static String read32BitUUID(UUID uuid) {
        if (uuid == null) {
            return "";
        }
        String[] strArrSplit = uuid.toString().split(HelpFormatter.DEFAULT_OPT_PREFIX, 2);
        if (strArrSplit.length == 2 && strArrSplit[1].equalsIgnoreCase(f37756a)) {
            String str = strArrSplit[0];
            return str.length() != 8 ? uuid.toString() : m27245a("0x%s", str);
        }
        return uuid.toString();
    }

    public static UUID to128BitUUID(String str) {
        return UUID.fromString(str);
    }

    public static UUID to16BitUUID(String str) {
        if (str == null || str.isEmpty()) {
            str = "0000";
        }
        return UUID.fromString(m27245a("0000%s-0000-1000-8000-00805F9B34FB", str));
    }

    public static UUID to32BitUUID(String str) {
        if (str == null || str.isEmpty()) {
            str = "00000000";
        }
        return UUID.fromString(m27245a("%s-0000-1000-8000-00805F9B34FB", str));
    }

    public static ParcelUuid toUUID(String str) {
        int length = str.length();
        if (length != 4) {
            return length != 8 ? new ParcelUuid(to128BitUUID(str)) : new ParcelUuid(to32BitUUID(str));
        }
        return new ParcelUuid(to16BitUUID(str));
    }
}
