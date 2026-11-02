package com.jieli.jl_bt_ota.model.response;

import android.bluetooth.BluetoothAdapter;
import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.interfaces.command.IDataOp;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.base.LtvBean;
import com.jieli.jl_bt_ota.model.response.device.BleInfo;
import com.jieli.jl_bt_ota.model.response.device.ClassicBtInfo;
import com.jieli.jl_bt_ota.model.response.device.ExpandFunc;
import com.jieli.jl_bt_ota.model.response.device.FunctionConfiguration;
import com.jieli.jl_bt_ota.model.response.device.OTASettings;
import com.jieli.jl_bt_ota.model.response.device.OTAState;
import com.jieli.jl_bt_ota.model.response.device.ProductInfo;
import com.jieli.jl_bt_ota.model.response.device.ProtocolMTU;
import com.jieli.jl_bt_ota.model.response.device.ProtocolVersion;
import com.jieli.jl_bt_ota.model.response.device.SystemInfo;
import com.jieli.jl_bt_ota.model.response.device.Version;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes17.dex */
public class TargetInfoResponse extends CommonResponse implements IDataOp {
    private int allowConnectFlag;
    private String authKey;
    public final BleInfo bleInfo;
    public final ClassicBtInfo classicBtInfo;
    private String customVersionMsg;
    public final ExpandFunc expandFunc;
    public final FunctionConfiguration functionConfiguration;
    public final OTASettings otaSettings;
    public final OTAState otaState;
    public final ProductInfo productInfo;
    private String projectCode;
    public final ProtocolMTU protocolMtu;
    public final ProtocolVersion protocolVersion;
    private int sdkType;
    public final SystemInfo systemInfo;
    public final Version uBootVersion;
    public final Version version;

    public TargetInfoResponse() {
        this.protocolVersion = new ProtocolVersion();
        this.systemInfo = new SystemInfo();
        this.classicBtInfo = new ClassicBtInfo();
        this.functionConfiguration = new FunctionConfiguration();
        this.version = new Version();
        this.uBootVersion = new Version();
        this.otaSettings = new OTASettings();
        this.otaState = new OTAState();
        this.productInfo = new ProductInfo();
        this.protocolMtu = new ProtocolMTU();
        this.bleInfo = new BleInfo();
        this.expandFunc = new ExpandFunc();
    }

    private static byte[] stringToData(String r0) {
        if (r0 != null) goto L6;
        return new byte[0];
    L6:
        return r0.getBytes();
    }

    public int getAllowConnectFlag() {
        return this.allowConnectFlag;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public String getBleAddr() {
        return this.bleInfo.getBleAddr();
    }

    public int getCurFunction() {
        return this.functionConfiguration.getCurFunction();
    }

    public String getCustomVersionMsg() {
        return this.customVersionMsg;
    }

    public String getEdrAddr() {
        return this.classicBtInfo.getEdrAddr();
    }

    public int getEdrProfile() {
        return this.classicBtInfo.getEdrProfile();
    }

    public int getEdrStatus() {
        return this.classicBtInfo.getEdrStatus();
    }

    public int getExpandMode() {
        return this.otaState.getExpandMode();
    }

    public int getFunctionMask() {
        return this.functionConfiguration.getFunctionMask();
    }

    public int getLowPowerLimit() {
        return this.systemInfo.getLowPowerLimit();
    }

    public int getMandatoryUpgradeFlag() {
        return this.otaState.getMandatoryUpgradeFlag();
    }

    public int getMaxVol() {
        return this.systemInfo.getMaxVol();
    }

    public int getPid() {
        return this.productInfo.getPid();
    }

    public String getProjectCode() {
        return this.projectCode;
    }

    public String getProtocolVersion() {
        return this.protocolVersion.getVersionName();
    }

    public int getQuantity() {
        return this.systemInfo.getQuantity();
    }

    public int getReceiveMtu() {
        return this.protocolMtu.getReceiveMtu();
    }

    public int getRequestOtaFlag() {
        return this.otaState.getRequestOtaFlag();
    }

    public int getSdkType() {
        return this.sdkType;
    }

    public int getSendMtu() {
        return this.protocolMtu.getSendMtu();
    }

    public int getSingleBackupOtaWay() {
        return this.otaSettings.getSingleBackupOtaWay();
    }

    public int getUbootVersionCode() {
        return this.uBootVersion.getVersionCode();
    }

    public String getUbootVersionName() {
        return this.uBootVersion.getVersionName();
    }

    public int getUid() {
        return this.productInfo.getUid();
    }

    public int getVersionCode() {
        return this.version.getVersionCode();
    }

    public String getVersionName() {
        return this.version.getVersionName();
    }

    public int getVid() {
        return this.productInfo.getVid();
    }

    public int getVolume() {
        return this.systemInfo.getVolume();
    }

    public boolean isBLEToSppWay() {
        return this.bleInfo.isBLEToSppWay();
    }

    public boolean isBanEq() {
        return this.expandFunc.isBanEq();
    }

    public boolean isBleOnly() {
        return this.bleInfo.isBleOnly();
    }

    public boolean isGameMode() {
        return this.expandFunc.isGameMode();
    }

    public boolean isHideNetRadio() {
        return this.functionConfiguration.isHideNetRadio();
    }

    public boolean isMandatoryUpgrade() {
        if (getMandatoryUpgradeFlag() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isNeedBootLoader() {
        return this.otaSettings.isNeedBootLoader();
    }

    public boolean isSupportAdaptiveANC() {
        return this.expandFunc.isSupportAdaptiveANC();
    }

    public boolean isSupportAnc() {
        return this.expandFunc.isSupportAnc();
    }

    public boolean isSupportDevConfigure() {
        return this.expandFunc.isSupportDevConfigure();
    }

    public boolean isSupportDoubleBackup() {
        return this.otaSettings.isSupportDoubleBackup();
    }

    public boolean isSupportDoubleConnection() {
        return this.expandFunc.isSupportDoubleConnection();
    }

    public boolean isSupportExternalFlashTransfer() {
        return this.expandFunc.isSupportExternalFlashTransfer();
    }

    public boolean isSupportHearingAssist() {
        return this.expandFunc.isSupportHearingAssist();
    }

    public boolean isSupportMD5() {
        return this.expandFunc.isSupportMD5();
    }

    public boolean isSupportOfflineShow() {
        return this.functionConfiguration.isSupportOfflineShow();
    }

    public boolean isSupportReadErrorMSg() {
        return this.expandFunc.isSupportReadErrorMSg();
    }

    public boolean isSupportReuseSpaceOTA() {
        return this.otaSettings.isSupportReuseSpaceOTA();
    }

    public boolean isSupportSceneDenoising() {
        return this.expandFunc.isSupportSceneDenoising();
    }

    public boolean isSupportSd0() {
        return this.functionConfiguration.isSupportSd0();
    }

    public boolean isSupportSd1() {
        return this.functionConfiguration.isSupportSd1();
    }

    public boolean isSupportSearchDevice() {
        return this.expandFunc.isSupportSearchDevice();
    }

    public boolean isSupportSmartNoPick() {
        return this.expandFunc.isSupportSmartNoPick();
    }

    public boolean isSupportSoundCard() {
        return this.expandFunc.isSupportSoundCard();
    }

    public boolean isSupportUsb() {
        return this.functionConfiguration.isSupportUsb();
    }

    public boolean isSupportVocalBooster() {
        return this.expandFunc.isSupportVocalBooster();
    }

    public boolean isSupportVolumeSync() {
        return this.systemInfo.isSupportVolumeSync();
    }

    public boolean isSupportWindNoiseDetection() {
        return this.expandFunc.isSupportWindNoiseDetection();
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public int parse(byte[] r8) {
        if (r8 != null) goto L5;
    L73:
        return 0;
    L5:
        if (r8.length < 2) goto L73;
        Iterator<LtvBean> r1 = LtvBean.parseLTVData(r8).iterator();
    L9:
        if (r1.hasNext() == false) goto L72;
        LtvBean r3 = r1.next();
        byte[] r4 = r3.getData();
        int r5 = r3.getType();
        if (r5 != 0) goto L12;
        this.protocolVersion.parse(r4);
        goto L9
    L12:
        boolean r6 = true;
        if (r5 != 1) goto L14;
        this.systemInfo.parse(r4);
        goto L9
    L14:
        if (r5 != 2) goto L16;
        this.classicBtInfo.parse(r4);
        goto L9
    L16:
        if (r5 != 17) goto L18;
        this.bleInfo.parse(r4);
        goto L9
    L18:
        if (r5 != 19) goto L20;
        this.expandFunc.parse(r4);
        goto L9
    L20:
        if (r5 != 31) goto L21;
        if (r4 == null) goto L9;
        setCustomVersionMsg(new String(r4));     // Catch: Exception -> L64
    L64:
        e = move-exception;
        e.printStackTrace();
        goto L9
    L21:
        switch(r5) {
            case 4: goto L59;
            case 5: goto L58;
            case 6: goto L45;
            case 7: goto L44;
            case 8: goto L43;
            case 9: goto L42;
            case 10: goto L41;
            case 11: goto L35;
            case 12: goto L29;
            case 13: goto L28;
            case 14: goto L23;
            default: goto L9;
        };
    L23:
        if (r4 == null) goto L9;
        if (r4.length == 0) goto L9;
        setAllowConnectFlag(CHexConver.byteToInt(r4[0]));
        goto L9
    L28:
        this.protocolMtu.parse(r4);
        goto L9
    L29:
        if (r4 == null) goto L9;
        setProjectCode(new String(r4));     // Catch: Exception -> L33
    L33:
        e = move-exception;
        e.printStackTrace();
        goto L9
    L35:
        if (r4 == null) goto L9;
        setAuthKey(new String(r4));     // Catch: Exception -> L39
    L39:
        e = move-exception;
        e.printStackTrace();
        goto L9
    L41:
        this.productInfo.parse(r4);
        goto L9
    L42:
        this.otaState.parse(r4);
        goto L9
    L43:
        this.otaSettings.parse(r4);
        goto L9
    L44:
        this.uBootVersion.parse(r4);
        goto L9
    L45:
        if (r4 == null) goto L9;
        if (r4.length == 0) goto L9;
        setSdkType(CHexConver.byteToInt(r4[0]));
        if (isSupportVolumeSync() == true) goto L9;
        SystemInfo r7 = this.systemInfo;
        if (getSdkType() != 2) goto L54;
    L57:
        r7.setSupportVolumeSync(r6);
        goto L9
    L54:
        if (getSdkType() == 4) goto L57;
        r6 = false;
        goto L57
    L58:
        this.version.parse(r4);
        goto L9
    L59:
        this.functionConfiguration.parse(r4);
        goto L9
    L72:
        return r8.length;
    }

    public TargetInfoResponse setAllowConnectFlag(int r1) {
        this.allowConnectFlag = r1;
        return this;
    }

    public TargetInfoResponse setAuthKey(String r1) {
        this.authKey = r1;
        return this;
    }

    public TargetInfoResponse setCurFunction(int r2) {
        this.functionConfiguration.setCurFunction(r2);
        return this;
    }

    public TargetInfoResponse setCustomVersionMsg(String r1) {
        this.customVersionMsg = r1;
        return this;
    }

    public TargetInfoResponse setProjectCode(String r1) {
        this.projectCode = r1;
        return this;
    }

    public TargetInfoResponse setSdkType(int r1) {
        this.sdkType = r1;
        return this;
    }

    public TargetInfoResponse setVolume(int r2) {
        this.systemInfo.setVolume(r2);
        return this;
    }

    @Override // com.jieli.jl_bt_ota.interfaces.command.IDataOp
    public byte[] toData() {
        ByteArrayOutputStream r2 = new ByteArrayOutputStream();
    L8:
        e = move-exception;
        e.printStackTrace();
    L44:
        return r2.toByteArray();
    L4:
        if (this.protocolVersion.getVersionName() != null) goto L6;
    L10:
        r2.write(new LtvBean(1, this.systemInfo.toData()).toData());     // Catch: IOException -> L8
        if (BluetoothAdapter.checkBluetoothAddress(this.classicBtInfo.getEdrAddr()) == false) goto L13;
        r2.write(new LtvBean(2, this.classicBtInfo.toData()).toData());     // Catch: IOException -> L8
    L13:
        r2.write(new LtvBean(4, this.functionConfiguration.toData()).toData());     // Catch: IOException -> L8
        if (this.version.getVersionName() != null) goto L16;
    L18:
        r2.write(new LtvBean(6, new byte[]{CHexConver.intToByte(this.sdkType)}).toData());     // Catch: IOException -> L8
        if (this.uBootVersion.getVersionName() != null) goto L21;
    L23:
        r2.write(new LtvBean(8, this.otaSettings.toData()).toData());     // Catch: IOException -> L8
        r2.write(new LtvBean(9, this.otaState.toData()).toData());     // Catch: IOException -> L8
        r2.write(new LtvBean(10, this.productInfo.toData()).toData());     // Catch: IOException -> L8
        String r3 = this.authKey;     // Catch: IOException -> L8
        if (r3 != null) goto L26;
    L28:
        String r4 = this.projectCode;     // Catch: IOException -> L8
        if (r4 != null) goto L31;
    L33:
        r2.write(new LtvBean(13, this.protocolMtu.toData()).toData());     // Catch: IOException -> L8
        r2.write(new LtvBean(14, new byte[]{CHexConver.intToByte(this.allowConnectFlag)}).toData());     // Catch: IOException -> L8
        if (BluetoothAdapter.checkBluetoothAddress(this.bleInfo.getBleAddr()) == false) goto L36;
        r2.write(new LtvBean(17, this.bleInfo.toData()).toData());     // Catch: IOException -> L8
    L36:
        r2.write(new LtvBean(19, this.expandFunc.toData()).toData());     // Catch: IOException -> L8
        String r0 = this.customVersionMsg;     // Catch: IOException -> L8
        if (r0 == null) goto L44;
        if (r0.isEmpty() == true) goto L44;
        r2.write(new LtvBean(31, stringToData(this.customVersionMsg)).toData());     // Catch: IOException -> L8
        goto L44
    L31:
        if (r4.isEmpty() == true) goto L33;
        r2.write(new LtvBean(12, stringToData(this.projectCode)).toData());     // Catch: IOException -> L8
        goto L33
    L26:
        if (r3.isEmpty() == true) goto L28;
        r2.write(new LtvBean(11, stringToData(this.authKey)).toData());     // Catch: IOException -> L8
        goto L28
    L21:
        if (this.uBootVersion.getVersionName().isEmpty() == true) goto L23;
        r2.write(new LtvBean(7, this.uBootVersion.toData()).toData());     // Catch: IOException -> L8
        goto L23
    L16:
        if (this.version.getVersionName().isEmpty() == true) goto L18;
        r2.write(new LtvBean(5, this.version.toData()).toData());     // Catch: IOException -> L8
        goto L18
    L6:
        if (this.protocolVersion.getVersionName().isEmpty() == true) goto L10;
        r2.write(new LtvBean(0, this.protocolVersion.toData()).toData());     // Catch: IOException -> L8
        goto L10
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "TargetInfoResponse{protocolVersion=" + this.protocolVersion + ", \nsystemInfo=" + this.systemInfo + ", \nclassicBtInfo=" + this.classicBtInfo + ", \nfunctionConfiguration=" + this.functionConfiguration + ", \nversion=" + this.version + ", \nsdkType=" + this.sdkType + ", \nuBootVersion=" + this.uBootVersion + ", \notaSettings=" + this.otaSettings + ", \notaState=" + this.otaState + ", \nproductInfo=" + this.productInfo + ", \nauthKey='" + this.authKey + "', \nprojectCode='" + this.projectCode + "', \nprotocolMtu=" + this.protocolMtu + ", \nallowConnectFlag=" + this.allowConnectFlag + ", \nbleInfo=" + this.bleInfo + ", \nexpandFunc=" + this.expandFunc + ", \ncustomVersionMsg='" + this.customVersionMsg + '\'' + i0XO1.IO;
    }
}
