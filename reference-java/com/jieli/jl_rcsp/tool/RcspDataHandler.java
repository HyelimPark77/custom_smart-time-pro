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

    /* JADX INFO: renamed from: c */
    public static final String f38195c = "rcsp_handler";

    /* JADX INFO: renamed from: d */
    public static final int f38196d = 64;

    /* JADX INFO: renamed from: a */
    public final RcspOpImpl f38197a;

    /* JADX INFO: renamed from: b */
    public final RcspEventListenerManager f38198b;

    public RcspDataHandler(RcspOpImpl rcspOpImpl, RcspEventListenerManager rcspEventListenerManager) {
        this.f38197a = rcspOpImpl;
        this.f38198b = rcspEventListenerManager;
    }

    /* JADX INFO: renamed from: a */
    public final void m27631a(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo;
        if (list == null || (deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            if (attrData != null && attrData.length != 0 && attrBean.getType() == 0) {
                boolean z = CHexConver.byteToInt(attrData[0]) == 1;
                JL_Log.m27883i(f38195c, "parseAUXData", "onAuxStatusChange >> " + z);
                deviceInfo.setAuxPlay(z);
                this.f38198b.onAuxStatusChange(bluetoothDevice, z);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m27634b(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo;
        String str;
        String str2;
        String str3;
        String str4;
        if (list == null || (deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        ID3MusicInfo iD3MusicInfo = deviceInfo.getiD3MusicInfo();
        if (iD3MusicInfo == null) {
            iD3MusicInfo = new ID3MusicInfo();
        }
        ID3MusicInfo iD3MusicInfo2 = iD3MusicInfo;
        boolean z = false;
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            if (attrData != null && attrData.length != 0) {
                switch (attrBean.getType()) {
                    case 0:
                        String strByte2HexStr = CHexConver.byte2HexStr(attrData);
                        try {
                            str = new String(attrData, StandardCharsets.UTF_8);
                        } catch (Exception e) {
                            e.printStackTrace();
                            str = null;
                        }
                        if (str != null && attrData.length == 64) {
                            str = str.substring(0, str.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
                        }
                        iD3MusicInfo2.setTitle("00".equals(strByte2HexStr) ? "" : str);
                        break;
                    case 1:
                        String strByte2HexStr2 = CHexConver.byte2HexStr(attrData);
                        try {
                            str2 = new String(attrData, 0, attrData.length, StandardCharsets.UTF_8);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            str2 = null;
                        }
                        if (str2 != null && attrData.length == 64) {
                            str2 = str2.substring(0, str2.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
                        }
                        iD3MusicInfo2.setArtist("00".equals(strByte2HexStr2) ? "" : str2);
                        break;
                    case 2:
                        String strByte2HexStr3 = CHexConver.byte2HexStr(attrData);
                        try {
                            str3 = new String(attrData, StandardCharsets.UTF_8);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                            str3 = null;
                        }
                        if (str3 != null && attrData.length == 64) {
                            str3 = str3.substring(0, str3.length() - 1) + APSSharedUtil.TRUNCATE_SEPARATOR;
                        }
                        iD3MusicInfo2.setAlbum("00".equals(strByte2HexStr3) ? "" : str3);
                        break;
                    case 3:
                        int iByteToInt = CHexConver.byteToInt(attrData[0]);
                        JL_Log.m27877d(f38195c, "parseBtData", "id3 number: " + iByteToInt);
                        iD3MusicInfo2.setNumber(iByteToInt);
                        break;
                    case 4:
                        int iBytesToInt = attrData.length >= 2 ? CHexConver.bytesToInt(attrData, 0, 2) : 0;
                        JL_Log.m27877d(f38195c, "parseBtData", "id3 allNum: " + iBytesToInt);
                        iD3MusicInfo2.setTotal(iBytesToInt);
                        break;
                    case 5:
                        try {
                            str4 = new String(attrData, 0, attrData.length, StandardCharsets.UTF_8);
                        } catch (Exception e4) {
                            e4.printStackTrace();
                            str4 = null;
                        }
                        JL_Log.m27877d(f38195c, "parseBtData", "id3 genre: " + str4);
                        iD3MusicInfo2.setGenre(str4);
                        break;
                    case 6:
                        int iBytesToInt2 = attrData.length >= 2 ? CHexConver.bytesToInt(attrData, 0, 2) : 0;
                        JL_Log.m27883i(f38195c, "parseBtData", "id3 allTime: " + iBytesToInt2);
                        iD3MusicInfo2.setTotalTime(iBytesToInt2);
                        break;
                    case 7:
                        boolean z2 = (attrData[0] & 1) == 1;
                        JL_Log.m27877d(f38195c, "parseBtData", "id3 isPlay: " + z2);
                        iD3MusicInfo2.setPlayStatus(z2);
                        break;
                    case 8:
                        int iBytesToInt3 = attrData.length >= 4 ? CHexConver.bytesToInt(attrData, 0, 4) / 1000 : 0;
                        JL_Log.m27877d(f38195c, "parseBtData", "id3 currentTime: " + iBytesToInt3);
                        iD3MusicInfo2.setCurrentTime(iBytesToInt3);
                        break;
                    default:
                        continue;
                }
                z = true;
            }
        }
        if (z) {
            deviceInfo.setiD3MusicInfo(iD3MusicInfo2);
            this.f38198b.onID3MusicInfo(bluetoothDevice, iD3MusicInfo2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m27635c(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo;
        if (list == null || (deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            if (attrData != null && attrData.length != 0) {
                byte type = attrBean.getType();
                int i = 1;
                if (type == 0) {
                    FmStatusInfo fmStatusInfo = new FmStatusInfo(CHexConver.byteToInt(attrData[0]) == 1, attrData.length > 1 ? CHexConver.byteToInt(attrData[1]) : 0, attrData.length > 3 ? CHexConver.bytesToInt(attrData[2], attrData[3]) / 10.0f : 0.0f, attrData.length > 4 ? CHexConver.byteToInt(attrData[4]) : 0);
                    deviceInfo.setFmStatusInfo(fmStatusInfo);
                    this.f38198b.onFmStatusChange(bluetoothDevice, fmStatusInfo);
                } else if (type == 1) {
                    ArrayList arrayList = new ArrayList();
                    int length = attrData.length;
                    while (length - i >= 3) {
                        int iByteToInt = CHexConver.byteToInt(attrData[i]);
                        float fBytesToInt = CHexConver.bytesToInt(attrData[i + 1], attrData[i + 2]) / 10.0f;
                        i += 3;
                        arrayList.add(new ChannelInfo(iByteToInt, fBytesToInt));
                    }
                    deviceInfo.setChannelInfos(arrayList);
                    this.f38198b.onFmChannelsChange(bluetoothDevice, arrayList);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX INFO: renamed from: d */
    public final void m27636d(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo;
        String str;
        int i;
        int iBytesToInt;
        if (list == null || (deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            if (attrData != null && attrData.length != 0) {
                byte type = attrBean.getType();
                int iByteToInt = 0;
                if (type == 0) {
                    boolean z = (attrData[0] & 1) == 1;
                    if (attrData.length > 4) {
                        byte[] bArr = new byte[4];
                        System.arraycopy(attrData, 1, bArr, 0, 4);
                        int iBytesToInt2 = CHexConver.bytesToInt(bArr) * 1000;
                        if (attrData.length > 8) {
                            System.arraycopy(attrData, 5, bArr, 0, 4);
                            iBytesToInt = CHexConver.bytesToInt(bArr) * 1000;
                            if (attrData.length > 9) {
                                iByteToInt = CHexConver.byteToInt(attrData[9]);
                            }
                        } else {
                            iBytesToInt = 0;
                        }
                        i = iByteToInt;
                        iByteToInt = iBytesToInt2;
                    } else {
                        i = 0;
                        iBytesToInt = 0;
                    }
                    MusicStatusInfo musicStatusInfo = new MusicStatusInfo(z, iByteToInt, iBytesToInt, i);
                    deviceInfo.setMusicStatusInfo(musicStatusInfo);
                    deviceInfo.setCurrentDevIndex(CHexConver.intToByte(musicStatusInfo.getCurrentDev()));
                    this.f38198b.onMusicStatusChange(bluetoothDevice, musicStatusInfo);
                } else if (type != 1) {
                    if (type == 2) {
                        int iByteToInt2 = CHexConver.byteToInt(attrData[0]);
                        JL_Log.m27877d(f38195c, "parseMusicData", "music play mode : " + iByteToInt2);
                        PlayModeInfo playModeInfo = new PlayModeInfo(iByteToInt2);
                        deviceInfo.setPlayModeInfo(playModeInfo);
                        this.f38198b.onPlayModeChange(bluetoothDevice, playModeInfo);
                    }
                } else if (attrData.length > 3) {
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(attrData, 0, bArr2, 0, 4);
                    int iBytesToInt3 = CHexConver.bytesToInt(bArr2);
                    if (attrData.length <= 4) {
                        str = null;
                    } else {
                        boolean z2 = (attrData[4] & 255) == 1;
                        if (attrData.length > 5) {
                            try {
                                str = new String(attrData, 5, attrData.length - 5, z2 ? "gbk" : "utf-16le");
                            } catch (UnsupportedEncodingException e) {
                                e.printStackTrace();
                                str = null;
                            }
                        } else {
                            str = null;
                        }
                    }
                    MusicNameInfo musicNameInfo = new MusicNameInfo(iBytesToInt3, str);
                    deviceInfo.setMusicNameInfo(musicNameInfo);
                    deviceInfo.setCluster(musicNameInfo.getCluster());
                    this.f38198b.onMusicNameChange(bluetoothDevice, musicNameInfo);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m27637e(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        String str;
        DeviceInfo deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null) {
            return;
        }
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            if (attrData != 0 && attrData.length != 0) {
                int i = 1;
                int iBytesToInt = 0;
                switch (attrBean.getType()) {
                    case 0:
                        this.f38198b.onBatteryChange(bluetoothDevice, new BatteryInfo(CHexConver.byteToInt(attrData[0])));
                        break;
                    case 1:
                        int maxVol = deviceInfo.getMaxVol();
                        boolean zIsSupportVolumeSync = deviceInfo.isSupportVolumeSync();
                        int iByteToInt = CHexConver.byteToInt(attrData[0]);
                        deviceInfo.setVolume(iByteToInt);
                        this.f38198b.onVolumeChange(bluetoothDevice, new VolumeInfo(maxVol, iByteToInt, zIsSupportVolumeSync));
                        break;
                    case 2:
                        DevStorageInfo devStorageInfo = new DevStorageInfo();
                        devStorageInfo.parseData(attrData);
                        deviceInfo.setDevStorageInfo(devStorageInfo);
                        this.f38198b.onDevStorageInfoChange(bluetoothDevice, devStorageInfo);
                        break;
                    case 4:
                        byte b = attrData[0];
                        boolean z = (b & 128) == 128;
                        int iByteToInt2 = CHexConver.byteToInt(b) & 127;
                        EqInfo eqInfo = new EqInfo();
                        eqInfo.setMode(iByteToInt2);
                        eqInfo.setDynamic(z);
                        if (z) {
                            int i2 = attrData[1];
                            byte[] bArr = new byte[i2];
                            System.arraycopy(attrData, 2, bArr, 0, i2);
                            eqInfo.setValue(bArr);
                            EqPresetInfo eqPresetInfoM27630a = m27630a(list);
                            if (eqPresetInfoM27630a == null) {
                                eqPresetInfoM27630a = deviceInfo.getEqPresetInfo();
                            }
                            if (eqPresetInfoM27630a != null) {
                                eqInfo.setFreqs(eqPresetInfoM27630a.getFreqs());
                            }
                            JL_Log.m27877d(f38195c, "parsePublicData", "eq data freq-->" + eqPresetInfoM27630a);
                        } else {
                            byte[] bArr2 = new byte[0];
                            if (attrData.length > 10) {
                                bArr2 = new byte[10];
                                System.arraycopy(attrData, 1, bArr2, 0, 10);
                            }
                            eqInfo.setValue(bArr2);
                        }
                        deviceInfo.setEqInfo(eqInfo);
                        this.f38198b.onEqChange(bluetoothDevice, eqInfo);
                        break;
                    case 5:
                        try {
                            str = new String(attrData);
                        } catch (Exception e) {
                            e.printStackTrace();
                            str = null;
                        }
                        deviceInfo.setPlayFileFormat(str);
                        this.f38198b.onFileFormatChange(bluetoothDevice, str);
                        break;
                    case 6:
                        int iByteToInt3 = CHexConver.byteToInt(attrData[0]);
                        deviceInfo.setCurFunction(attrData[0]);
                        JL_Log.m27883i(f38195c, "parsePublicData", "onDeviceModeChange >> " + iByteToInt3);
                        this.f38198b.onDeviceModeChange(bluetoothDevice, iByteToInt3);
                        break;
                    case 7:
                        JL_Log.m27883i(f38195c, "parsePublicData", "SYS_INFO_ATTR_LIGHT");
                        int iByteToInt4 = CHexConver.byteToInt(attrData[0]);
                        int iByteToInt5 = CHexConver.byteToInt(attrData[1]);
                        int iByteToInt6 = CHexConver.byteToInt(attrData[2]);
                        int iByteToInt7 = CHexConver.byteToInt(attrData[3]);
                        int iByteToInt8 = CHexConver.byteToInt(attrData[4]);
                        int iByteToInt9 = CHexConver.byteToInt(attrData[5]);
                        int iByteToInt10 = CHexConver.byteToInt(attrData[6]);
                        LightControlInfo luminance = new LightControlInfo().setSwitchState(iByteToInt4 & 3).setLightMode((iByteToInt4 & 12) >>> 2).setColor(Color.rgb(iByteToInt5, iByteToInt6, iByteToInt7)).setTwinkleMode(iByteToInt8).setTwinkleFreq(iByteToInt9).setSceneMode(iByteToInt10).setHue(CHexConver.bytesToInt(attrData[7], attrData[8])).setSaturation(CHexConver.byteToInt(attrData[9])).setLuminance(CHexConver.byteToInt(attrData[10]));
                        deviceInfo.setLightControlInfo(luminance);
                        this.f38198b.onLightControlInfo(bluetoothDevice, luminance);
                        break;
                    case 8:
                        if (attrData.length >= 2 && attrData.length < 4) {
                            byte[] bArr3 = new byte[2];
                            System.arraycopy(attrData, 0, bArr3, 0, 2);
                            iBytesToInt = CHexConver.bytesToInt(bArr3[0], bArr3[1]);
                        } else if (attrData.length >= 4) {
                            byte[] bArr4 = new byte[4];
                            System.arraycopy(attrData, 0, bArr4, 0, 4);
                            iBytesToInt = CHexConver.bytesToInt(bArr4);
                        }
                        float f = iBytesToInt / 10.0f;
                        deviceInfo.setFrequency(f);
                        this.f38198b.onFrequencyTx(bluetoothDevice, f);
                        break;
                    case 9:
                        this.f38198b.onPeripheralsModeChange(bluetoothDevice, CHexConver.byteToInt(attrData[0]));
                        break;
                    case 10:
                        byte[] bArr5 = new byte[0];
                        boolean z2 = attrData[0] == 1;
                        if (z2 && attrData.length > 6) {
                            bArr5 = new byte[6];
                            System.arraycopy(attrData, 1, bArr5, 0, 6);
                        }
                        this.f38198b.onPeripheralsConnectStatusChange(bluetoothDevice, z2, CHexConver.hexDataCovetToAddress(bArr5));
                        break;
                    case 11:
                        if (attrData.length >= 8) {
                            this.f38198b.onHighAndBassChange(bluetoothDevice, CHexConver.bytesToInt(attrData, 0, 4), CHexConver.bytesToInt(attrData, 4, 4));
                        }
                        break;
                    case 12:
                        JL_Log.m27877d(f38195c, "parsePublicData", "eq preset data-->" + CHexConver.byte2HexStr(attrData, attrData.length));
                        EqPresetInfo eqPresetInfoM27629a = m27629a(attrBean);
                        deviceInfo.setEqPresetInfo(eqPresetInfoM27629a);
                        this.f38198b.onEqPresetChange(bluetoothDevice, eqPresetInfoM27629a);
                        break;
                    case 13:
                        if (attrData.length >= 9) {
                            byte[] bArr6 = new byte[9];
                            System.arraycopy(attrData, 0, bArr6, 0, 9);
                            VoiceMode voiceMode = VoiceMode.parse(bArr6);
                            deviceInfo.setCurrentVoiceMode(voiceMode);
                            this.f38198b.onCurrentVoiceMode(bluetoothDevice, voiceMode);
                        }
                        break;
                    case 14:
                        int i3 = attrData[0];
                        if (i3 > 0 && attrData.length >= (i3 * 9) + 1) {
                            byte[] bArr7 = new byte[9];
                            ArrayList arrayList = new ArrayList();
                            for (int i4 = 0; i4 < i3; i4++) {
                                System.arraycopy(attrData, i, bArr7, 0, 9);
                                i += 9;
                                arrayList.add(VoiceMode.parse(bArr7));
                            }
                            deviceInfo.setVoiceModeList(arrayList);
                            this.f38198b.onVoiceModeList(bluetoothDevice, arrayList);
                        }
                        break;
                    case 15:
                        JL_Log.m27880e(f38195c, "parsePublicData", "phone status change ：" + CHexConver.byte2HexStr(attrData));
                        int iByteToInt11 = CHexConver.byteToInt(attrData[0]);
                        deviceInfo.setPhoneStatus(iByteToInt11);
                        this.f38198b.onPhoneCallStatusChange(bluetoothDevice, iByteToInt11);
                        break;
                    case 16:
                        int length = attrData.length;
                        byte[] bArr8 = new byte[length];
                        System.arraycopy(attrData, 0, bArr8, 0, length);
                        m27632a(bluetoothDevice, bArr8);
                        break;
                    case 17:
                        EqInfo eqInfo2 = new EqInfo();
                        eqInfo2.setDynamic(true);
                        eqInfo2.setMode(0);
                        int i5 = attrData[0];
                        int[] iArr = new int[i5];
                        while (iBytesToInt < i5) {
                            iArr[iBytesToInt] = CHexConver.bytesToInt(attrData, i, 2);
                            iBytesToInt++;
                            i += 2;
                        }
                        eqInfo2.setFreqs(iArr);
                        deviceInfo.setSoundCardEqInfo(eqInfo2);
                        break;
                    case 18:
                        EqInfo soundCardEqInfo = deviceInfo.getSoundCardEqInfo();
                        if (soundCardEqInfo != null) {
                            int i6 = attrData[0];
                            byte[] bArr9 = new byte[i6];
                            System.arraycopy(attrData, 1, bArr9, 0, i6);
                            soundCardEqInfo.setValue(bArr9);
                            deviceInfo.setSoundCardEqInfo(soundCardEqInfo);
                            this.f38198b.onSoundCardEqChange(bluetoothDevice, soundCardEqInfo);
                        }
                        break;
                    case 19:
                        JL_Log.m27877d(f38195c, "parsePublicData", "SYS_INFO_ATTR_SOUND_CARD : " + CHexConver.byte2HexStr(attrData));
                        if (attrData.length >= 8) {
                            long jBytesToLong = CHexConver.bytesToLong(attrData, 0, 8);
                            JL_Log.m27877d(f38195c, "parsePublicData", "mask  ->  " + CHexConver.byte2HexStr(attrData, 8));
                            byte[] bArr10 = new byte[0];
                            if (attrData.length > 8) {
                                int length2 = attrData.length - 8;
                                byte[] bArr11 = new byte[length2];
                                System.arraycopy(attrData, 8, bArr11, 0, length2);
                                JL_Log.m27877d(f38195c, "parsePublicData", "values  ->  " + CHexConver.byte2HexStr(bArr11));
                                bArr10 = bArr11;
                            }
                            this.f38198b.onSoundCardStatusChange(bluetoothDevice, jBytesToLong, bArr10);
                        }
                        break;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m27638f(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo;
        Iterator<AttrBean> it;
        int i;
        String str;
        String str2;
        int i2;
        byte b;
        byte b2;
        int iBytesToInt;
        AlarmBean alarmBean;
        List<AlarmBean> alarmBeans;
        if (list == null || (deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice)) == null) {
            return;
        }
        int iM27633b = m27633b(list);
        Iterator<AttrBean> it2 = list.iterator();
        while (it2.hasNext()) {
            AttrBean next = it2.next();
            byte[] attrData = next.getAttrData();
            if (attrData == 0 || attrData.length == 0) {
                it = it2;
            } else {
                byte type = next.getType();
                int i3 = 5;
                int i4 = 1;
                boolean z = false;
                if (type != 1) {
                    if (type == 2 || type == 3) {
                        int iByteToInt = CHexConver.byteToInt(attrData[0]);
                        if (deviceInfo.getAlarmListInfo() != null && (alarmBeans = deviceInfo.getAlarmListInfo().getAlarmBeans()) != null && !alarmBeans.isEmpty()) {
                            Iterator<AlarmBean> it3 = alarmBeans.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    alarmBean = null;
                                    break;
                                }
                                AlarmBean next2 = it3.next();
                                if (iByteToInt == next2.getIndex()) {
                                    alarmBean = next2.copy();
                                    break;
                                }
                            }
                        } else {
                            alarmBean = null;
                            break;
                        }
                        if (alarmBean == null) {
                            alarmBean = new AlarmBean();
                            alarmBean.setIndex((byte) iByteToInt);
                            alarmBean.setName("Alarm");
                            Calendar calendar = Calendar.getInstance();
                            alarmBean.setHour((byte) calendar.get(11));
                            alarmBean.setMin((byte) calendar.get(12));
                        }
                        JL_Log.m27880e(f38195c, "parseRTCData", "index = " + iByteToInt + " " + alarmBean);
                        if (next.getType() == 3) {
                            this.f38198b.onAlarmStop(bluetoothDevice, alarmBean);
                        } else {
                            this.f38198b.onAlarmNotify(bluetoothDevice, alarmBean);
                        }
                    } else if (type == 4) {
                        JL_Log.m27877d(f38195c, "parseRTCData", "parse alarm ver " + CHexConver.byte2HexStr(attrData));
                        deviceInfo.setAlarmVersion(iM27633b);
                        if (deviceInfo.getAlarmListInfo() == null) {
                            deviceInfo.setAlarmListInfo(new AlarmListInfo(iM27633b, new ArrayList()));
                        } else {
                            deviceInfo.getAlarmListInfo().setVersion(iM27633b);
                        }
                    } else if (type == 5) {
                        JL_Log.m27883i(f38195c, "parseRTCData", "parse alarm default bell " + CHexConver.byte2HexStr(attrData));
                        int i5 = attrData[0] & 15;
                        ArrayList arrayList = new ArrayList();
                        while (i4 < attrData.length && arrayList.size() < i5) {
                            int i6 = i4 + 1;
                            int i7 = attrData[i4];
                            int i8 = i4 + 2;
                            int i9 = attrData[i6];
                            byte[] bArr = new byte[i9];
                            System.arraycopy(attrData, i8, bArr, 0, i9);
                            i4 = i8 + i9;
                            arrayList.add(new DefaultAlarmBell(i7, new String(bArr), false));
                        }
                        deviceInfo.setAlarmDefaultBells(arrayList);
                        this.f38198b.onAlarmDefaultBellListChange(bluetoothDevice, arrayList);
                    } else if (type == 7) {
                        deviceInfo.setAlarmExpandFlag(attrData[0]);
                    }
                    it = it2;
                } else {
                    int iByteToInt2 = CHexConver.byteToInt(attrData[0]);
                    ArrayList arrayList2 = new ArrayList();
                    if (iByteToInt2 > 0) {
                        int i10 = 1;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= iByteToInt2 || attrData.length - i10 <= i3) {
                                i = iM27633b;
                                break;
                            }
                            byte b3 = attrData[i10];
                            int i12 = i10 + 2;
                            boolean z2 = CHexConver.byteToInt(attrData[i10 + 1]) == i4 ? i4 : z;
                            byte b4 = attrData[i12];
                            byte b5 = attrData[i10 + 3];
                            byte b6 = attrData[i10 + 4];
                            int i13 = i10 + 6;
                            int iByteToInt3 = CHexConver.byteToInt(attrData[i10 + 5]);
                            i = iM27633b;
                            if (iByteToInt3 > attrData.length - i13) {
                                break;
                            }
                            if (iByteToInt3 > 0) {
                                try {
                                    str = new String(attrData, i13, iByteToInt3);
                                    i13 += iByteToInt3;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    str = null;
                                }
                            } else {
                                str = null;
                            }
                            int alarmVersion = i == 0 ? deviceInfo.getAlarmVersion() : i;
                            int length = attrData.length - i13;
                            int i14 = iByteToInt2;
                            if (alarmVersion != 1 || length <= 6) {
                                str2 = "";
                                i2 = i13;
                                b = 0;
                                b2 = 0;
                                iBytesToInt = 0;
                                attrData = attrData;
                            } else {
                                byte b7 = attrData[i13];
                                int i15 = i13 + 2;
                                b = attrData[i13 + 1];
                                int i16 = i13;
                                byte[] bArr2 = new byte[4];
                                System.arraycopy(attrData, i15, bArr2, 0, 4);
                                iBytesToInt = CHexConver.bytesToInt(bArr2);
                                int i17 = i16 + 7;
                                int i18 = attrData[i16 + 6] & 255;
                                if (i18 <= attrData.length - i17) {
                                    try {
                                        str2 = new String(attrData, i17, i18);
                                        i2 = i17 + i18;
                                    } catch (Exception e2) {
                                        e2.printStackTrace();
                                        str2 = "";
                                        i2 = i17;
                                    }
                                } else {
                                    str2 = "";
                                    i2 = i17;
                                }
                                b2 = b7;
                            }
                            arrayList2.add(new AlarmBean().setVersion(alarmVersion).setIndex(b3).setRepeatMode(b4).setName(str).setDevIndex(b).setHour(b5).setMin(b6).setBellCluster(iBytesToInt).setBellName(str2).setBellType(b2).setOpen(z2));
                            i11++;
                            iM27633b = alarmVersion;
                            i10 = i2;
                            attrData = attrData;
                            it2 = it2;
                            iByteToInt2 = i14;
                            i3 = 5;
                            i4 = 1;
                            z = false;
                        }
                        it = it2;
                        iM27633b = i;
                    } else {
                        it = it2;
                    }
                    AlarmListInfo alarmListInfo = new AlarmListInfo(arrayList2);
                    alarmListInfo.setVersion(iM27633b);
                    deviceInfo.setAlarmListInfo(alarmListInfo);
                    this.f38198b.onAlarmListChange(bluetoothDevice, alarmListInfo);
                }
            }
            it2 = it;
        }
    }

    public void parseAttrMessage(BluetoothDevice bluetoothDevice, byte b, List<AttrBean> list) {
        if (bluetoothDevice == null || list == null) {
            return;
        }
        if (b == -1) {
            m27637e(bluetoothDevice, list);
            return;
        }
        if (b == 0) {
            m27634b(bluetoothDevice, list);
            return;
        }
        if (b == 1) {
            m27636d(bluetoothDevice, list);
            return;
        }
        if (b == 2) {
            m27638f(bluetoothDevice, list);
        } else if (b == 3) {
            m27631a(bluetoothDevice, list);
        } else {
            if (b != 4) {
                return;
            }
            m27635c(bluetoothDevice, list);
        }
    }

    public void parseHealthSetting(BluetoothDevice bluetoothDevice, List<AttrBean> list) {
        DeviceInfo deviceInfo = this.f38197a.getDeviceInfo();
        if (deviceInfo == null) {
            return;
        }
        HealthSettingInfo healthSettingInfo = deviceInfo.getHealthSettingInfo();
        if (healthSettingInfo == null) {
            healthSettingInfo = new HealthSettingInfo();
            deviceInfo.setHealthSettingInfo(healthSettingInfo);
        }
        for (AttrBean attrBean : list) {
            byte[] attrData = attrBean.getAttrData();
            healthSettingInfo.setFuncFlag(attrBean.getType());
            switch (attrBean.getType()) {
                case 1:
                    healthSettingInfo.setSensorInfo(new SensorInfo(CHexConver.bytesToInt(attrData, 0, 2)));
                    break;
                case 2:
                    healthSettingInfo.setSedentaryReminder(new SedentaryReminder(attrData));
                    break;
                case 3:
                    healthSettingInfo.setHeartRateMeasure(new HeartRateMeasure(attrData));
                    break;
                case 4:
                    healthSettingInfo.setExerciseHeartRateReminder(new ExerciseHeartRateReminder(attrData));
                    break;
                case 5:
                    healthSettingInfo.setAutomaticPressureDetection(new AutomaticPressureDetection(attrData));
                    break;
                case 6:
                    healthSettingInfo.setSleepDetection(new SleepDetection(attrData));
                    break;
                case 7:
                    healthSettingInfo.setFallDetection(new FallDetection(attrData));
                    break;
                case 8:
                    healthSettingInfo.setLiftWristDetection(new LiftWristDetection(attrData));
                    break;
                case 9:
                    healthSettingInfo.setUserInfo(new UserInfo(attrData));
                    break;
                case 10:
                    healthSettingInfo.setDisconnectReminder(new DisconnectReminder(attrData));
                    break;
                case 11:
                    healthSettingInfo.setBloodOxygenMeasurementAlert(new BloodOxygenMeasurementAlert(attrData));
                    break;
                case 12:
                    healthSettingInfo.setEmergencyContact(new EmergencyContact(attrData));
                    break;
            }
            this.f38198b.onHealthSettingChange(bluetoothDevice, healthSettingInfo.cloneObject());
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m27632a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        JL_Log.m27877d(f38195c, "parseFixedLenData", "data ---> " + CHexConver.byte2HexStr(bArr));
        DeviceInfo deviceInfo = this.f38197a.getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null) {
            return;
        }
        ExpandFunction expandFunction = deviceInfo.getExpandFunction();
        int i = 4;
        if (bArr.length >= 4) {
            int iBytesToInt = CHexConver.bytesToInt(bArr, 0, 4);
            if (expandFunction == null) {
                expandFunction = new ExpandFunction();
                expandFunction.setMask(iBytesToInt);
            } else {
                expandFunction.setMask(expandFunction.getMask() | iBytesToInt);
            }
            if ((iBytesToInt & 1) == 1 && bArr.length >= 9) {
                byte[] bArr2 = new byte[5];
                System.arraycopy(bArr, 4, bArr2, 0, 5);
                expandFunction.putData(0, bArr2);
                this.f38198b.onExpandFunction(bluetoothDevice, 0, bArr2);
                ReverberationParam data = ReverberationParam.parseData(bArr2);
                if (data != null) {
                    this.f38198b.onReverberation(bluetoothDevice, data);
                }
                i = 9;
            }
            if ((iBytesToInt & 2) == 2 && bArr.length >= i + 2) {
                byte[] bArr3 = new byte[2];
                System.arraycopy(bArr, i, bArr3, 0, 2);
                expandFunction.putData(1, bArr3);
                this.f38198b.onExpandFunction(bluetoothDevice, 1, bArr3);
                DynamicLimiterParam data2 = DynamicLimiterParam.parseData(bArr3);
                if (data2 != null) {
                    this.f38198b.onDynamicLimiter(bluetoothDevice, data2);
                }
            }
            deviceInfo.setExpandFunction(expandFunction);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX INFO: renamed from: a */
    public final EqPresetInfo m27630a(List<AttrBean> list) {
        for (AttrBean attrBean : list) {
            if (attrBean.getType() == 12) {
                if (attrBean == null) {
                    return null;
                }
                return m27629a(attrBean);
            }
        }
        attrBean = null;
        if (attrBean == null) {
            return null;
        }
        return m27629a(attrBean);
    }

    /* JADX INFO: renamed from: a */
    public final EqPresetInfo m27629a(AttrBean attrBean) {
        EqPresetInfo eqPresetInfo = new EqPresetInfo();
        byte[] attrData = attrBean.getAttrData();
        ArrayList arrayList = new ArrayList();
        int i = attrData[0];
        int[] iArr = new int[i];
        int i2 = 1;
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = ((attrData[i2] & 255) << 8) | (attrData[i2 + 1] & 255);
            i2 += 2;
        }
        for (int i4 = 0; i4 < 7; i4++) {
            byte[] bArr = new byte[i];
            byte b = (byte) (attrData[i2] & 127);
            System.arraycopy(attrData, i2 + 1, bArr, 0, i);
            EqInfo eqInfo = new EqInfo(b, bArr, iArr);
            eqInfo.setDynamic((attrData[i2] & 128) == 128);
            arrayList.add(eqInfo);
            i2 += i + 1;
        }
        eqPresetInfo.setNumber(i);
        eqPresetInfo.setFreqs(iArr);
        eqPresetInfo.setEqInfos(arrayList);
        JL_Log.m27877d(f38195c, "parseEqPresetInfo", "eq--->" + eqPresetInfo);
        return eqPresetInfo;
    }

    /* JADX INFO: renamed from: b */
    public final int m27633b(List<AttrBean> list) {
        for (AttrBean attrBean : list) {
            if (attrBean.getType() == 4) {
                return attrBean.getAttrData()[0] & 7;
            }
        }
        return 0;
    }
}
