package com.jieli.jl_rcsp.tool;

import android.bluetooth.BluetoothDevice;
import android.graphics.Color;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.jieli.jl_rcsp.impl.RcspOpImpl;
import com.jieli.jl_rcsp.model.device.AlarmBean;
import com.jieli.jl_rcsp.model.device.AlarmListInfo;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.ChannelInfo;
import com.jieli.jl_rcsp.model.device.DefaultAlarmBell;
import com.jieli.jl_rcsp.model.device.DevStorageInfo;
import com.jieli.jl_rcsp.model.device.DeviceInfo;
import com.jieli.jl_rcsp.model.device.DynamicLimiterParam;
import com.jieli.jl_rcsp.model.device.EqInfo;
import com.jieli.jl_rcsp.model.device.EqPresetInfo;
import com.jieli.jl_rcsp.model.device.ExpandFunction;
import com.jieli.jl_rcsp.model.device.FmStatusInfo;
import com.jieli.jl_rcsp.model.device.ID3MusicInfo;
import com.jieli.jl_rcsp.model.device.LightControlInfo;
import com.jieli.jl_rcsp.model.device.MusicNameInfo;
import com.jieli.jl_rcsp.model.device.MusicStatusInfo;
import com.jieli.jl_rcsp.model.device.PlayModeInfo;
import com.jieli.jl_rcsp.model.device.ReverberationParam;
import com.jieli.jl_rcsp.model.device.VoiceMode;
import com.jieli.jl_rcsp.model.device.VolumeInfo;
import com.jieli.jl_rcsp.model.device.health.AutomaticPressureDetection;
import com.jieli.jl_rcsp.model.device.health.BloodOxygenMeasurementAlert;
import com.jieli.jl_rcsp.model.device.health.DisconnectReminder;
import com.jieli.jl_rcsp.model.device.health.EmergencyContact;
import com.jieli.jl_rcsp.model.device.health.ExerciseHeartRateReminder;
import com.jieli.jl_rcsp.model.device.health.FallDetection;
import com.jieli.jl_rcsp.model.device.health.HealthSettingInfo;
import com.jieli.jl_rcsp.model.device.health.HeartRateMeasure;
import com.jieli.jl_rcsp.model.device.health.LiftWristDetection;
import com.jieli.jl_rcsp.model.device.health.SedentaryReminder;
import com.jieli.jl_rcsp.model.device.health.SensorInfo;
import com.jieli.jl_rcsp.model.device.health.SleepDetection;
import com.jieli.jl_rcsp.model.device.health.UserInfo;
import com.jieli.jl_rcsp.tool.callback.RcspEventListenerManager;
import com.jieli.jl_rcsp.util.CHexConver;
import com.jieli.jl_rcsp.util.JL_Log;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class RcspDataHandler {
    public static final String c = "rcsp_handler";
    public static final int d = 64;
    public final RcspOpImpl a;
    public final RcspEventListenerManager b;

    public RcspDataHandler(RcspOpImpl r1, RcspEventListenerManager r2) {
        this.a = r1;
        this.b = r2;
    }

    public final void a(BluetoothDevice r6, List<AttrBean> r7) {
        if (r7 == null) goto L21;
        DeviceInfo r0 = this.a.getDeviceInfo(r6);
        if (r0 == null) goto L31;
        Iterator<AttrBean> r8 = r7.iterator();
    L9:
        if (r8.hasNext() == false) goto L32;
        AttrBean r1 = r8.next();
        byte[] r2 = r1.getAttrData();
        if (r2 == null) goto L9;
        if (r2.length == 0) goto L9;
        if (r1.getType() != 0) goto L9;
        boolean r3 = false;
        if (CHexConver.byteToInt(r2[0]) != 1) goto L20;
        r3 = true;
    L20:
        JL_Log.i(c, "parseAUXData", "onAuxStatusChange >> " + r3);
        r0.setAuxPlay(r3);
        this.b.onAuxStatusChange(r6, r3);
        goto L9
    L32:
        return;
    L31:
        return;
    }

    public final void b(BluetoothDevice r17, List<AttrBean> r18) {
        if (r18 == null) goto L119;
        DeviceInfo r3 = this.a.getDeviceInfo(r17);
        if (r3 == null) goto L120;
        ID3MusicInfo r0 = r3.getiD3MusicInfo();
        if (r0 != null) goto L11;
        r0 = new ID3MusicInfo();
    L11:
        ID3MusicInfo r4 = r0;
        Iterator<AttrBean> r5 = r18.iterator();
        boolean r1 = false;
    L13:
        if (r5.hasNext() == false) goto L91;
        AttrBean r7 = r5.next();
        byte[] r8 = r7.getAttrData();
        if (r8 == null) goto L13;
        if (r8.length == 0) goto L13;
        String r9 = "";
        switch(r7.getType()) {
            case 0: goto L77;
            case 1: goto L63;
            case 2: goto L49;
            case 3: goto L48;
            case 4: goto L44;
            case 5: goto L94;
            case 6: goto L34;
            case 7: goto L29;
            case 8: goto L23;
            default: goto L13;
        };
    L94:
        String r2 = new String(r8, 0, r8.length, StandardCharsets.UTF_8);     // Catch: Exception -> L40
    L42:
        JL_Log.d(c, "parseBtData", "id3 genre: " + r2);
        r4.setGenre(r2);
    L27:
        r1 = true;
    L40:
        e = move-exception;
        e.printStackTrace();
        r2 = null;
        goto L42
    L23:
        if (r8.length < 4) goto L25;
        int r6 = CHexConver.bytesToInt(r8, 0, 4) / 1000;
    L26:
        JL_Log.d(c, "parseBtData", "id3 currentTime: " + r6);
        r4.setCurrentTime(r6);
        goto L27
    L25:
        r6 = 0;
        goto L26
    L29:
        if ((r8[0] & 1) != 1) goto L31;
        boolean r10 = true;
    L32:
        JL_Log.d(c, "parseBtData", "id3 isPlay: " + r10);
        r4.setPlayStatus(r10);
        goto L27
    L31:
        r10 = false;
        goto L32
    L34:
        if (r8.length < 2) goto L36;
        int r11 = CHexConver.bytesToInt(r8, 0, 2);
    L37:
        JL_Log.i(c, "parseBtData", "id3 allTime: " + r11);
        r4.setTotalTime(r11);
        goto L27
    L36:
        r11 = 0;
        goto L37
    L44:
        if (r8.length < 2) goto L46;
        int r12 = CHexConver.bytesToInt(r8, 0, 2);
    L47:
        JL_Log.d(c, "parseBtData", "id3 allNum: " + r12);
        r4.setTotal(r12);
        goto L27
    L46:
        r12 = 0;
        goto L47
    L48:
        int r13 = CHexConver.byteToInt(r8[0]);
        JL_Log.d(c, "parseBtData", "id3 number: " + r13);
        r4.setNumber(r13);
        goto L27
    L49:
        String r14 = CHexConver.byte2HexStr(r8);
        String r15 = new String(r8, StandardCharsets.UTF_8);     // Catch: Exception -> L52
    L54:
        if (r15 == null) goto L59;
        if (r8.length != 64) goto L59;
        r15 = r15.substring(0, r15.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
    L59:
        if ("00".equals(r14) == true) goto L62;
        r9 = r15;
    L62:
        r4.setAlbum(r9);
    L52:
        e = move-exception;
        e.printStackTrace();
        r15 = null;
        goto L54
    L63:
        String r16 = CHexConver.byte2HexStr(r8);
        String r19 = new String(r8, 0, r8.length, StandardCharsets.UTF_8);     // Catch: Exception -> L66
    L68:
        if (r19 == null) goto L73;
        if (r8.length != 64) goto L73;
        r19 = r19.substring(0, r19.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
    L73:
        if ("00".equals(r16) == true) goto L76;
        r9 = r19;
    L76:
        r4.setArtist(r9);
    L66:
        e = move-exception;
        e.printStackTrace();
        r19 = null;
        goto L68
    L77:
        String r20 = CHexConver.byte2HexStr(r8);
        String r110 = new String(r8, StandardCharsets.UTF_8);     // Catch: Exception -> L80
    L82:
        if (r110 == null) goto L87;
        if (r8.length != 64) goto L87;
        r110 = r110.substring(0, r110.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
    L87:
        if ("00".equals(r20) == true) goto L90;
        r9 = r110;
    L90:
        r4.setTitle(r9);
    L80:
        e = move-exception;
        e.printStackTrace();
        r110 = null;
        goto L82
    L91:
        if (r1 == false) goto L118;
        r3.setiD3MusicInfo(r4);
        this.b.onID3MusicInfo(r17, r4);
        return;
    L118:
        return;
    L120:
        return;
    }

    public final void c(BluetoothDevice r11, List<AttrBean> r12) {
        if (r12 == null) goto L40;
        DeviceInfo r0 = this.a.getDeviceInfo(r11);
        if (r0 == null) goto L54;
        Iterator<AttrBean> r13 = r12.iterator();
    L9:
        if (r13.hasNext() == false) goto L55;
        AttrBean r1 = r13.next();
        byte[] r2 = r1.getAttrData();
        if (r2 == null) goto L9;
        if (r2.length == 0) goto L9;
        byte r3 = r1.getType();
        int r5 = 1;
        if (r3 != 0) goto L17;
        int r4 = 0;
        if (CHexConver.byteToInt(r2[0]) != 1) goto L27;
        boolean r6 = true;
    L29:
        if (r2.length <= 1) goto L31;
        int r7 = CHexConver.byteToInt(r2[1]);
    L33:
        if (r2.length <= 3) goto L35;
        float r8 = CHexConver.bytesToInt(r2[2], r2[3]) / 10.0f;
    L37:
        if (r2.length <= 4) goto L39;
        r4 = CHexConver.byteToInt(r2[4]);
    L39:
        FmStatusInfo r9 = new FmStatusInfo(r6, r7, r8, r4);
        r0.setFmStatusInfo(r9);
        this.b.onFmStatusChange(r11, r9);
        goto L9
    L35:
        r8 = 0.0f;
        goto L37
    L31:
        r7 = 0;
        goto L33
    L27:
        r6 = false;
        goto L29
    L17:
        if (r3 != 1) goto L9;
        ArrayList r10 = new ArrayList();
        int r14 = r2.length;
    L21:
        if ((r14 - r5) < 3) goto L23;
        int r15 = CHexConver.byteToInt(r2[r5]);
        float r16 = CHexConver.bytesToInt(r2[r5 + 1], r2[r5 + 2]) / 10.0f;
        r5 = r5 + 3;
        r10.add(new ChannelInfo(r15, r16));
        goto L21
    L23:
        r0.setChannelInfos(r10);
        this.b.onFmChannelsChange(r11, r10);
        goto L9
    L55:
        return;
    L54:
        return;
    }

    public final void d(BluetoothDevice r11, List<AttrBean> r12) {
        if (r12 == null) goto L58;
        DeviceInfo r0 = this.a.getDeviceInfo(r11);
        if (r0 == null) goto L78;
        Iterator<AttrBean> r13 = r12.iterator();
    L9:
        if (r13.hasNext() == false) goto L79;
        AttrBean r1 = r13.next();
        byte[] r2 = r1.getAttrData();
        if (r2 == null) goto L9;
        if (r2.length == 0) goto L9;
        byte r3 = r1.getType();
        boolean r5 = true;
        int r6 = 0;
        if (r3 != 0) goto L17;
        if ((r2[0] & 1) != 1) goto L46;
        boolean r4 = true;
    L48:
        if (r2.length <= 4) goto L56;
        byte[] r7 = new byte[4];
        System.arraycopy(r2, 1, r7, 0, 4);
        int r8 = CHexConver.bytesToInt(r7) * 1000;
        if (r2.length <= 8) goto L55;
        System.arraycopy(r2, 5, r7, 0, 4);
        int r9 = CHexConver.bytesToInt(r7) * 1000;
        if (r2.length <= 9) goto L54;
        r6 = CHexConver.byteToInt(r2[9]);
    L54:
        int r10 = r6;
        r6 = r8;
    L57:
        MusicStatusInfo r14 = new MusicStatusInfo(r4, r6, r9, r10);
        r0.setMusicStatusInfo(r14);
        r0.setCurrentDevIndex(CHexConver.intToByte(r14.getCurrentDev()));
        this.b.onMusicStatusChange(r11, r14);
        goto L9
    L55:
        r9 = 0;
        goto L54
    L56:
        r10 = 0;
        r9 = 0;
        goto L57
    L46:
        r4 = false;
        goto L48
    L17:
        if (r3 != 1) goto L19;
        if (r2.length <= 3) goto L9;
        byte[] r15 = new byte[4];
        System.arraycopy(r2, 0, r15, 0, 4);
        int r16 = CHexConver.bytesToInt(r15);
        if (r2.length > 4) goto L27;
    L41:
        String r17 = null;
    L42:
        MusicNameInfo r18 = new MusicNameInfo(r16, r17);
        r0.setMusicNameInfo(r18);
        r0.setCluster(r18.getCluster());
        this.b.onMusicNameChange(r11, r18);
        goto L9
    L27:
        if ((r2[4] & 255) == 1) goto L31;
        r5 = false;
    L31:
        if (r2.length <= 5) goto L41;
        int r19 = r2.length - 5;     // Catch: UnsupportedEncodingException -> L35
        if (r5 == false) goto L37;
        String r20 = "gbk";
    L38:
        r17 = new String(r2, 5, r19, r20);     // Catch: UnsupportedEncodingException -> L35
        goto L42
    L37:
        r20 = "utf-16le";
    L35:
        e = move-exception;
        e.printStackTrace();
        goto L41
    L19:
        if (r3 != 2) goto L9;
        int r21 = CHexConver.byteToInt(r2[0]);
        JL_Log.d(c, "parseMusicData", "music play mode : " + r21);
        PlayModeInfo r22 = new PlayModeInfo(r21);
        r0.setPlayModeInfo(r22);
        this.b.onPlayModeChange(r11, r22);
        goto L9
    L79:
        return;
    L78:
        return;
    }

    public final void e(BluetoothDevice r18, List<AttrBean> r19) {
        DeviceInfo r3 = this.a.getDeviceInfo(r18);
        if (r3 == null) goto L94;
        Iterator<AttrBean> r4 = r19.iterator();
    L7:
        if (r4.hasNext() == false) goto L156;
        AttrBean r0 = r4.next();
        byte[] r5 = r0.getAttrData();
        if (r5 == 0) goto L7;
        if (r5.length == 0) goto L7;
        int r15 = 1;
        int r7 = 0;
        switch(r0.getType()) {
            case 0: goto L92;
            case 1: goto L91;
            case 2: goto L90;
            case 3: goto L7;
            case 4: goto L73;
            case 5: goto L95;
            case 6: goto L67;
            case 7: goto L66;
            case 8: goto L58;
            case 9: goto L56;
            case 10: goto L47;
            case 11: goto L45;
            case 12: goto L43;
            case 13: goto L41;
            case 14: goto L32;
            case 15: goto L31;
            case 16: goto L30;
            case 17: goto L26;
            case 18: goto L22;
            case 19: goto L16;
            default: goto L7;
        };
    L95:
        String r1 = new String(r5);     // Catch: Exception -> L70
    L72:
        r3.setPlayFileFormat(r1);
        this.b.onFileFormatChange(r18, r1);
    L70:
        e = move-exception;
        e.printStackTrace();
        r1 = null;
        goto L72
    L16:
        JL_Log.d(c, "parsePublicData", "SYS_INFO_ATTR_SOUND_CARD : " + CHexConver.byte2HexStr(r5));
        if (r5.length < 8) goto L7;
        long r8 = CHexConver.bytesToLong(r5, 0, 8);
        JL_Log.d(c, "parsePublicData", "mask  ->  " + CHexConver.byte2HexStr(r5, 8));
        byte[] r2 = new byte[0];
        if (r5.length <= 8) goto L21;
        int r6 = r5.length - 8;
        byte[] r9 = new byte[r6];
        System.arraycopy(r5, 8, r9, 0, r6);
        JL_Log.d(c, "parsePublicData", "values  ->  " + CHexConver.byte2HexStr(r9));
        r2 = r9;
    L21:
        this.b.onSoundCardStatusChange(r18, r8, r2);
        goto L7
    L22:
        EqInfo r10 = r3.getSoundCardEqInfo();
        if (r10 == null) goto L7;
        int r11 = r5[0];
        byte[] r12 = new byte[r11];
        System.arraycopy(r5, 1, r12, 0, r11);
        r10.setValue(r12);
        r3.setSoundCardEqInfo(r10);
        this.b.onSoundCardEqChange(r18, r10);
        goto L7
    L26:
        EqInfo r13 = new EqInfo();
        r13.setDynamic(true);
        r13.setMode(0);
        int r14 = r5[0];
        int[] r16 = new int[r14];
    L27:
        if (r7 >= r14) goto L29;
        r16[r7] = CHexConver.bytesToInt(r5, r15, 2);
        r7 = r7 + 1;
        r15 = r15 + 2;
        goto L27
    L29:
        r13.setFreqs(r16);
        r3.setSoundCardEqInfo(r13);
        goto L7
    L30:
        int r17 = r5.length;
        byte[] r20 = new byte[r17];
        System.arraycopy(r5, 0, r20, 0, r17);
        a(r18, r20);
        goto L7
    L31:
        JL_Log.e(c, "parsePublicData", "phone status change ：" + CHexConver.byte2HexStr(r5));
        int r21 = CHexConver.byteToInt(r5[0]);
        r3.setPhoneStatus(r21);
        this.b.onPhoneCallStatusChange(r18, r21);
        goto L7
    L32:
        int r22 = r5[0];
        if (r22 <= 0) goto L7;
        if (r5.length < ((r22 * 9) + 1)) goto L7;
        byte[] r23 = new byte[9];
        ArrayList r24 = new ArrayList();
        int r110 = 0;
    L37:
        if (r110 >= r22) goto L39;
        System.arraycopy(r5, r15, r23, 0, 9);
        r15 = r15 + 9;
        r24.add(VoiceMode.parse(r23));
        r110 = r110 + 1;
        goto L37
    L39:
        r3.setVoiceModeList(r24);
        this.b.onVoiceModeList(r18, r24);
        goto L7
    L41:
        if (r5.length < 9) goto L7;
        byte[] r25 = new byte[9];
        System.arraycopy(r5, 0, r25, 0, 9);
        VoiceMode r26 = VoiceMode.parse(r25);
        r3.setCurrentVoiceMode(r26);
        this.b.onCurrentVoiceMode(r18, r26);
        goto L7
    L43:
        JL_Log.d(c, "parsePublicData", "eq preset data-->" + CHexConver.byte2HexStr(r5, r5.length));
        EqPresetInfo r27 = a(r0);
        r3.setEqPresetInfo(r27);
        this.b.onEqPresetChange(r18, r27);
        goto L7
    L45:
        if (r5.length < 8) goto L7;
        this.b.onHighAndBassChange(r18, CHexConver.bytesToInt(r5, 0, 4), CHexConver.bytesToInt(r5, 4, 4));
        goto L7
    L47:
        byte[] r28 = new byte[0];
        if (r5[0] != 1) goto L50;
        boolean r29 = true;
    L51:
        if (r29 == true) goto L53;
    L55:
        this.b.onPeripheralsConnectStatusChange(r18, r29, CHexConver.hexDataCovetToAddress(r28));
        goto L7
    L53:
        if (r5.length <= 6) goto L55;
        r28 = new byte[6];
        System.arraycopy(r5, 1, r28, 0, 6);
        goto L55
    L50:
        r29 = false;
        goto L51
    L56:
        this.b.onPeripheralsModeChange(r18, CHexConver.byteToInt(r5[0]));
        goto L7
    L58:
        if (r5.length < 2) goto L63;
        if (r5.length >= 4) goto L63;
        byte[] r30 = new byte[2];
        System.arraycopy(r5, 0, r30, 0, 2);
        r7 = CHexConver.bytesToInt(r30[0], r30[1]);
    L65:
        float r31 = r7 / 10.0f;
        r3.setFrequency(r31);
        this.b.onFrequencyTx(r18, r31);
    L63:
        if (r5.length < 4) goto L65;
        byte[] r32 = new byte[4];
        System.arraycopy(r5, 0, r32, 0, 4);
        r7 = CHexConver.bytesToInt(r32);
        goto L65
    L66:
        JL_Log.i(c, "parsePublicData", "SYS_INFO_ATTR_LIGHT");
        int r33 = CHexConver.byteToInt(r5[0]);
        int r34 = CHexConver.byteToInt(r5[1]);
        int r111 = CHexConver.byteToInt(r5[2]);
        int r112 = CHexConver.byteToInt(r5[3]);
        int r113 = CHexConver.byteToInt(r5[4]);
        int r114 = CHexConver.byteToInt(r5[5]);
        int r35 = CHexConver.byteToInt(r5[6]);
        int r115 = CHexConver.bytesToInt(r5[7], r5[8]);
        int r36 = CHexConver.byteToInt(r5[9]);
        LightControlInfo r37 = new LightControlInfo().setSwitchState(r33 & 3).setLightMode((r33 & 12) >>> 2).setColor(Color.rgb(r34, r111, r112)).setTwinkleMode(r113).setTwinkleFreq(r114).setSceneMode(r35).setHue(r115).setSaturation(r36).setLuminance(CHexConver.byteToInt(r5[10]));
        r3.setLightControlInfo(r37);
        this.b.onLightControlInfo(r18, r37);
        goto L7
    L67:
        int r38 = CHexConver.byteToInt(r5[0]);
        r3.setCurFunction(r5[0]);
        JL_Log.i(c, "parsePublicData", "onDeviceModeChange >> " + r38);
        this.b.onDeviceModeChange(r18, r38);
        goto L7
    L73:
        byte r39 = r5[0];
        if ((r39 & 128) != 128) goto L76;
        boolean r40 = true;
    L77:
        int r41 = CHexConver.byteToInt(r39) & 127;
        EqInfo r42 = new EqInfo();
        r42.setMode(r41);
        r42.setDynamic(r40);
        if (r40 == false) goto L85;
        int r43 = r5[1];
        byte[] r44 = new byte[r43];
        System.arraycopy(r5, 2, r44, 0, r43);
        r42.setValue(r44);
        EqPresetInfo r45 = a(r19);
        if (r45 != null) goto L82;
        r45 = r3.getEqPresetInfo();
    L82:
        if (r45 == null) goto L84;
        r42.setFreqs(r45.getFreqs());
    L84:
        JL_Log.d(c, "parsePublicData", "eq data freq-->" + r45);
    L89:
        r3.setEqInfo(r42);
        this.b.onEqChange(r18, r42);
        goto L7
    L85:
        byte[] r46 = new byte[0];
        if (r5.length <= 10) goto L88;
        r46 = new byte[10];
        System.arraycopy(r5, 1, r46, 0, 10);
    L88:
        r42.setValue(r46);
        goto L89
    L76:
        r40 = false;
        goto L77
    L90:
        DevStorageInfo r47 = new DevStorageInfo();
        r47.parseData(r5);
        r3.setDevStorageInfo(r47);
        this.b.onDevStorageInfoChange(r18, r47);
        goto L7
    L91:
        int r48 = r3.getMaxVol();
        boolean r49 = r3.isSupportVolumeSync();
        int r50 = CHexConver.byteToInt(r5[0]);
        r3.setVolume(r50);
        this.b.onVolumeChange(r18, new VolumeInfo(r48, r50, r49));
        goto L7
    L92:
        this.b.onBatteryChange(r18, new BatteryInfo(CHexConver.byteToInt(r5[0])));
        goto L7
    L156:
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(BluetoothDevice r25, List<AttrBean> r26) {
        if (r26 == null) goto L98;
        DeviceInfo r3 = this.a.getDeviceInfo(r25);
        if (r3 == null) goto L116;
        int r4 = b(r26);
        Iterator<AttrBean> r5 = r26.iterator();
    L10:
        if (r5.hasNext() == false) goto L117;
        AttrBean r0 = r5.next();
        byte[] r6 = r0.getAttrData();
        if (r6 != 0) goto L14;
    L15:
        Iterator<AttrBean> r19 = r5;
    L97:
        r5 = r19;
        goto L10
    L14:
        if (r6.length == 0) goto L15;
        byte r7 = r0.getType();
        int r9 = 5;
        int r11 = 1;
        boolean r12 = false;
        if (r7 != 1) goto L19;
        int r8 = CHexConver.byteToInt(r6[0]);
        ArrayList r10 = new ArrayList();
        if (r8 <= 0) goto L95;
        int r1 = 1;
        int r13 = 0;
    L60:
        if (r13 >= r8) goto L93;
        if ((r6.length - r1) <= r9) goto L93;
        byte r15 = r6[r1];
        int r16 = r1 + 2;
        if (CHexConver.byteToInt(r6[r1 + 1]) != r11) goto L66;
        boolean r14 = r11;
    L67:
        byte r17 = r6[r16];
        byte r18 = r6[r1 + 3];
        byte r110 = r6[r1 + 4];
        int r111 = r1 + 6;
        int r2 = CHexConver.byteToInt(r6[r1 + 5]);
        int r112 = r4;
        if (r2 > (r6.length - r111)) goto L69;
        if (r2 > 0) goto L99;
    L75:
        String r20 = null;
    L76:
        if (r112 != 0) goto L78;
        int r21 = r3.getAlarmVersion();
    L79:
        int r22 = r6.length - r111;
        int r23 = r8;
        if (r21 == 1) goto L82;
    L91:
        String r113 = "";
        int r114 = r111;
        byte r24 = 0;
        byte r27 = 0;
        int r115 = 0;
        r6 = r6;
    L92:
        r10.add(new AlarmBean().setVersion(r21).setIndex(r15).setRepeatMode(r17).setName(r20).setDevIndex(r24).setHour(r18).setMin(r110).setBellCluster(r115).setBellName(r113).setBellType(r27).setOpen(r14));
        r13 = r13 + 1;
        r4 = r21;
        r1 = r114;
        r6 = r6;
        r5 = r5;
        r8 = r23;
        r9 = 5;
        r11 = 1;
        r12 = false;
        goto L60
    L82:
        if (r22 <= 6) goto L91;
        byte r28 = r6[r111];
        int r29 = r111 + 2;
        r24 = r6[r111 + 1];
        int r116 = r111;
        byte[] r117 = new byte[4];
        System.arraycopy(r6, r29, r117, 0, 4);
        r115 = CHexConver.bytesToInt(r117);
        int r30 = r116 + 7;
        int r31 = r6[r116 + 6] & 255;
        if (r31 <= (r6.length - r30)) goto L101;
    L90:
        r113 = "";
        r114 = r30;
    L87:
        r27 = r28;
        goto L92
    L101:
        r113 = new String(r6, r30, r31);     // Catch: Exception -> L88
        r114 = r30 + r31;
    L88:
        e = move-exception;
        e.printStackTrace();
        goto L90
    L78:
        r21 = r112;
        goto L79
    L99:
        r20 = new String(r6, r111, r2);     // Catch: Exception -> L73
        r111 = r111 + r2;
    L73:
        e = move-exception;
        e.printStackTrace();
    L69:
        r19 = r5;
        r4 = r112;
    L96:
        AlarmListInfo r32 = new AlarmListInfo(r10);
        r32.setVersion(r4);
        r3.setAlarmListInfo(r32);
        this.b.onAlarmListChange(r25, r32);
        goto L97
    L66:
        r14 = r12;
    L93:
        r112 = r4;
        goto L69
    L95:
        r19 = r5;
        goto L96
    L19:
        if (r7 == 2) goto L38;
        if (r7 == 3) goto L38;
        if (r7 == 4) goto L34;
        if (r7 != 5) goto L24;
        JL_Log.i(c, "parseRTCData", "parse alarm default bell " + CHexConver.byte2HexStr(r6));
        int r33 = r6[0] & 15;
        ArrayList r34 = new ArrayList();
    L29:
        if (r11 >= r6.length) goto L33;
        if (r34.size() >= r33) goto L33;
        int r35 = r11 + 1;
        int r36 = r6[r11];
        int r118 = r11 + 2;
        int r37 = r6[r35];
        byte[] r119 = new byte[r37];
        System.arraycopy(r6, r118, r119, 0, r37);
        r11 = r118 + r37;
        r34.add(new DefaultAlarmBell(r36, new String(r119), false));
    L33:
        r3.setAlarmDefaultBells(r34);
        this.b.onAlarmDefaultBellListChange(r25, r34);
        goto L15
    L24:
        if (r7 != 7) goto L15;
        r3.setAlarmExpandFlag(r6[0]);
        goto L15
    L34:
        JL_Log.d(c, "parseRTCData", "parse alarm ver " + CHexConver.byte2HexStr(r6));
        r3.setAlarmVersion(r4);
        if (r3.getAlarmListInfo() != null) goto L37;
        r3.setAlarmListInfo(new AlarmListInfo(r4, new ArrayList()));
        goto L15
    L37:
        r3.getAlarmListInfo().setVersion(r4);
    L38:
        int r38 = CHexConver.byteToInt(r6[0]);
        if (r3.getAlarmListInfo() == null) goto L50;
        List<AlarmBean> r39 = r3.getAlarmListInfo().getAlarmBeans();
        if (r39 == null) goto L50;
        if (r39.isEmpty() == true) goto L50;
        Iterator<AlarmBean> r40 = r39.iterator();
    L46:
        if (r40.hasNext() == false) goto L50;
        AlarmBean r41 = r40.next();
        if (r38 != r41.getIndex()) goto L46;
        AlarmBean r42 = r41.copy();
    L51:
        if (r42 != null) goto L53;
        r42 = new AlarmBean();
        r42.setIndex((byte) r38);
        r42.setName("Alarm");
        Calendar r43 = Calendar.getInstance();
        r42.setHour((byte) r43.get(11));
        r42.setMin((byte) r43.get(12));
    L53:
        JL_Log.e(c, "parseRTCData", "index = " + r38 + " " + r42);
        if (r0.getType() != 3) goto L56;
        this.b.onAlarmStop(r25, r42);
        goto L15
    L56:
        this.b.onAlarmNotify(r25, r42);
    L50:
        r42 = null;
        goto L51
    L117:
        return;
    L116:
        return;
    }

    public void parseAttrMessage(BluetoothDevice r2, byte r3, List<AttrBean> r4) {
        if (r2 == null) goto L29;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r3 == (-1)) goto L27;
        if (r3 != 0) goto L9;
        b(r2, r4);
        return;
    L9:
        if (r3 != 1) goto L11;
        d(r2, r4);
        return;
    L11:
        if (r3 != 2) goto L13;
        f(r2, r4);
        return;
    L13:
        if (r3 != 3) goto L15;
        a(r2, r4);
        return;
    L15:
        if (r3 != 4) goto L31;
        c(r2, r4);
        return;
    L31:
        return;
    L27:
        e(r2, r4);
        return;
    }

    public void parseHealthSetting(BluetoothDevice r6, List<AttrBean> r7) {
        DeviceInfo r0 = this.a.getDeviceInfo();
        if (r0 == null) goto L27;
        HealthSettingInfo r1 = r0.getHealthSettingInfo();
        if (r1 != null) goto L8;
        r1 = new HealthSettingInfo();
        r0.setHealthSettingInfo(r1);
    L8:
        Iterator<AttrBean> r8 = r7.iterator();
    L10:
        if (r8.hasNext() == false) goto L42;
        AttrBean r2 = r8.next();
        byte[] r3 = r2.getAttrData();
        r1.setFuncFlag(r2.getType());
        switch(r2.getType()) {
            case 1: goto L25;
            case 2: goto L24;
            case 3: goto L23;
            case 4: goto L22;
            case 5: goto L21;
            case 6: goto L20;
            case 7: goto L19;
            case 8: goto L18;
            case 9: goto L17;
            case 10: goto L16;
            case 11: goto L15;
            case 12: goto L14;
            default: goto L26;
        };
    L14:
        r1.setEmergencyContact(new EmergencyContact(r3));
        goto L26
    L15:
        r1.setBloodOxygenMeasurementAlert(new BloodOxygenMeasurementAlert(r3));
        goto L26
    L16:
        r1.setDisconnectReminder(new DisconnectReminder(r3));
        goto L26
    L17:
        r1.setUserInfo(new UserInfo(r3));
        goto L26
    L18:
        r1.setLiftWristDetection(new LiftWristDetection(r3));
        goto L26
    L19:
        r1.setFallDetection(new FallDetection(r3));
        goto L26
    L20:
        r1.setSleepDetection(new SleepDetection(r3));
        goto L26
    L21:
        r1.setAutomaticPressureDetection(new AutomaticPressureDetection(r3));
        goto L26
    L22:
        r1.setExerciseHeartRateReminder(new ExerciseHeartRateReminder(r3));
        goto L26
    L23:
        r1.setHeartRateMeasure(new HeartRateMeasure(r3));
        goto L26
    L24:
        r1.setSedentaryReminder(new SedentaryReminder(r3));
        goto L26
    L25:
        r1.setSensorInfo(new SensorInfo(CHexConver.bytesToInt(r3, 0, 2)));
    L26:
        this.b.onHealthSettingChange(r6, r1.cloneObject());
        goto L10
    L42:
        return;
    }

    public final void a(BluetoothDevice r10, byte[] r11) {
        JL_Log.d(c, "parseFixedLenData", "data ---> " + CHexConver.byte2HexStr(r11));
        DeviceInfo r0 = this.a.getDeviceInfo(r10);
        if (r0 == null) goto L29;
        ExpandFunction r1 = r0.getExpandFunction();
        int r3 = 4;
        if (r11.length < 4) goto L28;
        int r4 = CHexConver.bytesToInt(r11, 0, 4);
        if (r1 != null) goto L10;
        r1 = new ExpandFunction();
        r1.setMask(r4);
    L12:
        if ((r4 & 1) != 1) goto L20;
        if (r11.length < 9) goto L20;
        byte[] r8 = new byte[5];
        System.arraycopy(r11, 4, r8, 0, 5);
        r1.putData(0, r8);
        this.b.onExpandFunction(r10, 0, r8);
        ReverberationParam r5 = ReverberationParam.parseData(r8);
        if (r5 == null) goto L18;
        this.b.onReverberation(r10, r5);
    L18:
        r3 = 9;
    L20:
        if ((r4 & 2) == 2) goto L22;
    L26:
        r0.setExpandFunction(r1);
        return;
    L22:
        if (r11.length < (r3 + 2)) goto L26;
        byte[] r6 = new byte[2];
        System.arraycopy(r11, r3, r6, 0, 2);
        r1.putData(1, r6);
        this.b.onExpandFunction(r10, 1, r6);
        DynamicLimiterParam r12 = DynamicLimiterParam.parseData(r6);
        if (r12 == null) goto L26;
        this.b.onDynamicLimiter(r10, r12);
        goto L26
    L10:
        r1.setMask(r1.getMask() | r4);
        goto L12
    L28:
        return;
    }

    public final EqPresetInfo a(List<AttrBean> r5) {
        Iterator<AttrBean> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L8;
        AttrBean r0 = r6.next();
        if (r0.getType() != 12) goto L4;
    L9:
        if (r0 != null) goto L12;
        return null;
    L12:
        return a(r0);
    L8:
        r0 = null;
        goto L9
    }

    public final EqPresetInfo a(AttrBean r12) {
        EqPresetInfo r0 = new EqPresetInfo();
        byte[] r13 = r12.getAttrData();
        ArrayList r1 = new ArrayList();
        int r3 = r13[0];
        int[] r4 = new int[r3];
        int r6 = 0;
        int r7 = 1;
    L3:
        if (r6 >= r3) goto L5;
        r4[r6] = ((r13[r7] & 255) << 8) | (r13[r7 + 1] & 255);
        r7 = r7 + 2;
        r6 = r6 + 1;
        goto L3
    L5:
        int r8 = 0;
    L7:
        if (r8 >= 7) goto L13;
        byte[] r9 = new byte[r3];
        byte r10 = (byte) (r13[r7] & 127);
        System.arraycopy(r13, r7 + 1, r9, 0, r3);
        EqInfo r11 = new EqInfo(r10, r9, r4);
        if ((r13[r7] & 128) != 128) goto L11;
        boolean r14 = true;
    L12:
        r11.setDynamic(r14);
        r1.add(r11);
        r7 = r7 + (r3 + 1);
        r8 = r8 + 1;
        goto L7
    L11:
        r14 = false;
        goto L12
    L13:
        r0.setNumber(r3);
        r0.setFreqs(r4);
        r0.setEqInfos(r1);
        JL_Log.d(c, "parseEqPresetInfo", "eq--->" + r0);
        return r0;
    }

    public final int b(List<AttrBean> r5) {
        Iterator<AttrBean> r6 = r5.iterator();
    L4:
        if (r6.hasNext() == false) goto L9;
        AttrBean r0 = r6.next();
        if (r0.getType() != 4) goto L4;
        return r0.getAttrData()[0] & 7;
    L9:
        return 0;
    }
}
