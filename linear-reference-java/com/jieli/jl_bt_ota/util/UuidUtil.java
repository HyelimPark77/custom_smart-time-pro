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
    private static final String a = "0000-1000-8000-00805F9B34FB";

    public UuidUtil() {
    }

    private static String a(String r1, Object... r2) {
        return String.format(Locale.ENGLISH, r1, r2);
    }

    public static boolean equalUUID(UUID r0, UUID r1) {
        if (r0 == null) goto L7;
        if (r1 != null) goto L6;
        return false;
    L6:
        return r0.toString().equalsIgnoreCase(r1.toString());
    L7:
        return false;
    }

    public static String getDescriptorName(@NonNull UUID r2) {
        String r3 = read16BitUUID(r2).replace(HexStringBuilder.DEFAULT_PREFIX, "");
        r3.getClass();
        byte r0 = -1;
        switch(r3.hashCode()) {
            case 1545863: goto L26;
            case 1545864: goto L22;
            case 1545865: goto L18;
            case 1545866: goto L14;
            case 1545867: goto L10;
            case 1545868: goto L6;
            default: goto L29;
        };
    L29:
        switch(r0) {
            case 0: goto L42;
            case 1: goto L40;
            case 2: goto L38;
            case 3: goto L36;
            case 4: goto L34;
            case 5: goto L32;
            default: goto L30;
        };
    L30:
        return "Unknown Descriptor";
    L32:
        return "Characteristic Aggregate Format";
    L34:
        return "Characteristic Presentation Format";
    L36:
        return "Server Characteristic Configuration";
    L38:
        return "Client Characteristic Configuration";
    L40:
        return "Characteristic User Description";
    L42:
        return "Characteristic Extended Properties";
    L6:
        if (r3.equals("2905") == false) goto L29;
        r0 = 5;
        goto L29
    L10:
        if (r3.equals("2904") == false) goto L29;
        r0 = 4;
        goto L29
    L14:
        if (r3.equals("2903") == false) goto L29;
        r0 = 3;
        goto L29
    L18:
        if (r3.equals("2902") == false) goto L29;
        r0 = 2;
        goto L29
    L22:
        if (r3.equals("2901") == false) goto L29;
        r0 = 1;
        goto L29
    L26:
        if (r3.equals("2900") == false) goto L29;
        r0 = 0;
        goto L29
    }

    public static String getUUIDName(UUID r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        String r0 = read16BitUUID(r3).replace(HexStringBuilder.DEFAULT_PREFIX, "");
        r0.getClass();
        byte r1 = -1;
        switch(r0.hashCode()) {
            case 1508385: goto L213;
            case 1508386: goto L209;
            case 1508387: goto L205;
            case 1508388: goto L201;
            case 1508389: goto L197;
            case 1508390: goto L193;
            case 1508391: goto L189;
            case 1508392: goto L185;
            case 1508393: goto L181;
            case 1508401: goto L177;
            case 1508402: goto L173;
            case 1508403: goto L169;
            case 1508404: goto L165;
            case 1508405: goto L161;
            case 1508406: goto L157;
            case 1508415: goto L153;
            case 1508416: goto L149;
            case 1508417: goto L145;
            case 1508436: goto L141;
            case 1508437: goto L137;
            case 1508450: goto L133;
            case 1515111: goto L129;
            case 1515112: goto L125;
            case 1515119: goto L121;
            case 1515120: goto L117;
            case 1515128: goto L113;
            case 1515131: goto L109;
            case 1515133: goto L105;
            case 1515142: goto L101;
            case 1515143: goto L97;
            case 1515144: goto L93;
            case 1515146: goto L89;
            case 1515148: goto L85;
            case 1515159: goto L81;
            case 1515173: goto L77;
            case 1515179: goto L73;
            case 1553551: goto L69;
            case 1553552: goto L65;
            case 1553555: goto L61;
            case 1553556: goto L57;
            case 1553591: goto L53;
            case 1553601: goto L49;
            case 1553616: goto L45;
            case 1553617: goto L41;
            case 1553618: goto L37;
            case 1553619: goto L33;
            case 1553620: goto L29;
            case 1553621: goto L25;
            case 1553622: goto L21;
            case 1553651: goto L17;
            case 1553724: goto L13;
            case 1553725: goto L9;
            default: goto L216;
        };
    L216:
        switch(r1) {
            case 0: goto L321;
            case 1: goto L319;
            case 2: goto L317;
            case 3: goto L315;
            case 4: goto L313;
            case 5: goto L311;
            case 6: goto L309;
            case 7: goto L307;
            case 8: goto L305;
            case 9: goto L303;
            case 10: goto L301;
            case 11: goto L299;
            case 12: goto L297;
            case 13: goto L295;
            case 14: goto L293;
            case 15: goto L291;
            case 16: goto L289;
            case 17: goto L287;
            case 18: goto L285;
            case 19: goto L283;
            case 20: goto L281;
            case 21: goto L279;
            case 22: goto L277;
            case 23: goto L275;
            case 24: goto L273;
            case 25: goto L271;
            case 26: goto L269;
            case 27: goto L267;
            case 28: goto L265;
            case 29: goto L263;
            case 30: goto L261;
            case 31: goto L259;
            case 32: goto L257;
            case 33: goto L255;
            case 34: goto L253;
            case 35: goto L251;
            case 36: goto L249;
            case 37: goto L247;
            case 38: goto L245;
            case 39: goto L243;
            case 40: goto L241;
            case 41: goto L239;
            case 42: goto L237;
            case 43: goto L235;
            case 44: goto L233;
            case 45: goto L231;
            case 46: goto L229;
            case 47: goto L227;
            case 48: goto L225;
            case 49: goto L223;
            case 50: goto L221;
            case 51: goto L219;
            default: goto L218;
        };
    L219:
        return "Running Speed and Cadence Measurement";
    L221:
        return "Cycling Speed and Cadence Measurement";
    L223:
        return "Heart Rate Measurement";
    L225:
        return "Manufacturer Name String";
    L227:
        return "Software Revision String";
    L229:
        return "Hardware Revision String";
    L231:
        return "Firmware Revision String";
    L233:
        return "Serial Number String";
    L235:
        return "Model Number String";
    L237:
        return "System ID";
    L239:
        return "Temperature Measurement";
    L241:
        return "Battery Level";
    L243:
        return "RSSI Characteristic";
    L245:
        return "Peripheral Preferred Connection Parameters";
    L247:
        return "Appearance";
    L249:
        return "Device Name";
    L251:
        return "Fitness Machine Service";
    L253:
        return "Internet Protocol Support Service";
    L255:
        return "Environmental Sensing Service";
    L257:
        return "Cycling Speed and Cadence Service";
    L259:
        return "Running Speed and Cadence Service";
    L261:
        return "Human Interface Device (HID) Service";
    L263:
        return "Alert Notification Service";
    L265:
        return "Blood Pressure Service";
    L267:
        return "Battery Service";
    L269:
        return "Heart Rate Service";
    L271:
        return "Device Information Service";
    L273:
        return "Health Thermometer Service";
    L275:
        return "Glucose Service";
    L277:
        return "Generic Attribute Profile";
    L279:
        return "Generic Access Service";
    L281:
        return "Human Interface Device Profile(HID)";
    L283:
        return "Hands-Free Audio Gateway Profile(HFP)";
    L285:
        return "Heads-Free Profile(HFP)";
    L287:
        return "Headset Audio Gateway Profile";
    L289:
        return "Fax Profile";
    L291:
        return "Intercom Profile";
    L293:
        return "Video Conferencing Profile";
    L295:
        return "Audio/Video Remote Control Profile(AVRCP)";
    L297:
        return "Advanced Audio Distribution Profile";
    L299:
        return "Audio/Video Remote Control Target Profile";
    L301:
        return "Advanced Audio Distribution Profile(A2DP)";
    L303:
        return "Audio Source Profile";
    L305:
        return "Cordless Telephony Profile";
    L307:
        return "Headset Profile";
    L309:
        return "IrMC Sync Command Profile";
    L311:
        return "File Transfer Profile(SPP)";
    L313:
        return "Object Push Profile(OPP)";
    L315:
        return "IrMC Sync Profile";
    L317:
        return "Dialup Networking Profile";
    L319:
        return "LAN Access Using PPP Profile";
    L321:
        return "Serial Port Profile(SPP)";
    L218:
        return "Unknown UUID(" + r3 + I000IiI1O.iO.iO;
    L9:
        if (r0.equals("2A5C") == false) goto L216;
        r1 = 51;
        goto L216
    L13:
        if (r0.equals("2A5B") == false) goto L216;
        r1 = 50;
        goto L216
    L17:
        if (r0.equals("2A37") == false) goto L216;
        r1 = 49;
        goto L216
    L21:
        if (r0.equals("2A29") == false) goto L216;
        r1 = 48;
        goto L216
    L25:
        if (r0.equals("2A28") == false) goto L216;
        r1 = 47;
        goto L216
    L29:
        if (r0.equals("2A27") == false) goto L216;
        r1 = 46;
        goto L216
    L33:
        if (r0.equals("2A26") == false) goto L216;
        r1 = 45;
        goto L216
    L37:
        if (r0.equals("2A25") == false) goto L216;
        r1 = 44;
        goto L216
    L41:
        if (r0.equals("2A24") == false) goto L216;
        r1 = 43;
        goto L216
    L45:
        if (r0.equals("2A23") == false) goto L216;
        r1 = 42;
        goto L216
    L49:
        if (r0.equals("2A1C") == false) goto L216;
        r1 = 41;
        goto L216
    L53:
        if (r0.equals("2A19") == false) goto L216;
        r1 = 40;
        goto L216
    L57:
        if (r0.equals("2A05") == false) goto L216;
        r1 = 39;
        goto L216
    L61:
        if (r0.equals("2A04") == false) goto L216;
        r1 = 38;
        goto L216
    L65:
        if (r0.equals("2A01") == false) goto L216;
        r1 = 37;
        goto L216
    L69:
        if (r0.equals("2A00") == false) goto L216;
        r1 = 36;
        goto L216
    L73:
        if (r0.equals("1826") == false) goto L216;
        r1 = 35;
        goto L216
    L77:
        if (r0.equals("1820") == false) goto L216;
        r1 = 34;
        goto L216
    L81:
        if (r0.equals("181A") == false) goto L216;
        r1 = 33;
        goto L216
    L85:
        if (r0.equals("1816") == false) goto L216;
        r1 = 32;
        goto L216
    L89:
        if (r0.equals("1814") == false) goto L216;
        r1 = 31;
        goto L216
    L93:
        if (r0.equals("1812") == false) goto L216;
        r1 = 30;
        goto L216
    L97:
        if (r0.equals("1811") == false) goto L216;
        r1 = 29;
        goto L216
    L101:
        if (r0.equals("1810") == false) goto L216;
        r1 = 28;
        goto L216
    L105:
        if (r0.equals("180F") == false) goto L216;
        r1 = 27;
        goto L216
    L109:
        if (r0.equals("180D") == false) goto L216;
        r1 = 26;
        goto L216
    L113:
        if (r0.equals("180A") == false) goto L216;
        r1 = 25;
        goto L216
    L117:
        if (r0.equals("1809") == false) goto L216;
        r1 = 24;
        goto L216
    L121:
        if (r0.equals("1808") == false) goto L216;
        r1 = 23;
        goto L216
    L125:
        if (r0.equals("1801") == false) goto L216;
        r1 = 22;
        goto L216
    L129:
        if (r0.equals("1800") == false) goto L216;
        r1 = 21;
        goto L216
    L133:
        if (r0.equals("1124") == false) goto L216;
        r1 = 20;
        goto L216
    L137:
        if (r0.equals("111F") == false) goto L216;
        r1 = 19;
        goto L216
    L141:
        if (r0.equals("111E") == false) goto L216;
        r1 = 18;
        goto L216
    L145:
        if (r0.equals("1112") == false) goto L216;
        r1 = 17;
        goto L216
    L149:
        if (r0.equals("1111") == false) goto L216;
        r1 = 16;
        goto L216
    L153:
        if (r0.equals("1110") == false) goto L216;
        r1 = 15;
        goto L216
    L157:
        if (r0.equals("110F") == false) goto L216;
        r1 = 14;
        goto L216
    L161:
        if (r0.equals("110E") == false) goto L216;
        r1 = 13;
        goto L216
    L165:
        if (r0.equals("110D") == false) goto L216;
        r1 = 12;
        goto L216
    L169:
        if (r0.equals("110C") == false) goto L216;
        r1 = 11;
        goto L216
    L173:
        if (r0.equals("110B") == false) goto L216;
        r1 = 10;
        goto L216
    L177:
        if (r0.equals("110A") == false) goto L216;
        r1 = 9;
        goto L216
    L181:
        if (r0.equals("1109") == false) goto L216;
        r1 = 8;
        goto L216
    L185:
        if (r0.equals("1108") == false) goto L216;
        r1 = 7;
        goto L216
    L189:
        if (r0.equals("1107") == false) goto L216;
        r1 = 6;
        goto L216
    L193:
        if (r0.equals("1106") == false) goto L216;
        r1 = 5;
        goto L216
    L197:
        if (r0.equals("1105") == false) goto L216;
        r1 = 4;
        goto L216
    L201:
        if (r0.equals("1104") == false) goto L216;
        r1 = 3;
        goto L216
    L205:
        if (r0.equals("1103") == false) goto L216;
        r1 = 2;
        goto L216
    L209:
        if (r0.equals("1102") == false) goto L216;
        r1 = 1;
        goto L216
    L213:
        if (r0.equals("1101") == false) goto L216;
        r1 = 0;
        goto L216
    }

    public static String read16BitUUID(UUID r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        String[] r0 = r3.toString().split(HelpFormatter.DEFAULT_OPT_PREFIX, 2);
        if (r0.length == 2) goto L10;
        return r3.toString();
    L10:
        if (r0[1].equalsIgnoreCase(a) == false) goto L12;
        String r1 = r0[0];
        if (r1.length() == 8) goto L18;
        return r3.toString();
    L18:
        return a("0x%s", new Object[]{r1.substring(4).toUpperCase(Locale.getDefault())});
    L12:
        return r3.toString();
    }

    public static String read32BitUUID(UUID r3) {
        if (r3 != null) goto L5;
        return "";
    L5:
        String[] r0 = r3.toString().split(HelpFormatter.DEFAULT_OPT_PREFIX, 2);
        if (r0.length == 2) goto L10;
        return r3.toString();
    L10:
        if (r0[1].equalsIgnoreCase(a) == false) goto L12;
        String r1 = r0[0];
        if (r1.length() == 8) goto L18;
        return r3.toString();
    L18:
        return a("0x%s", new Object[]{r1});
    L12:
        return r3.toString();
    }

    public static UUID to128BitUUID(String r0) {
        return UUID.fromString(r0);
    }

    public static UUID to16BitUUID(String r1) {
        if (r1 != null) goto L4;
    L5:
        r1 = "0000";
    L7:
        return UUID.fromString(a("0000%s-0000-1000-8000-00805F9B34FB", new Object[]{r1}));
    L4:
        if (r1.isEmpty() == false) goto L7;
        goto L5
    }

    public static UUID to32BitUUID(String r1) {
        if (r1 != null) goto L4;
    L5:
        r1 = "00000000";
    L7:
        return UUID.fromString(a("%s-0000-1000-8000-00805F9B34FB", new Object[]{r1}));
    L4:
        if (r1.isEmpty() == false) goto L7;
        goto L5
    }

    public static ParcelUuid toUUID(String r2) {
        int r0 = r2.length();
        if (r0 == 4) goto L11;
        if (r0 == 8) goto L9;
        return new ParcelUuid(to128BitUUID(r2));
    L9:
        return new ParcelUuid(to32BitUUID(r2));
    L11:
        return new ParcelUuid(to16BitUUID(r2));
    }
}
