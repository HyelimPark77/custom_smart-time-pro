package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class TargetInfoResponse extends CommonResponse {
    private int allowConnectFlag;
    private String authKey;
    private String bleAddr;
    private boolean bleOnly;
    private boolean contactsTransferBySmallFile;
    private byte curFunction;
    private String customVersionMsg;
    private String edrAddr;
    private int edrProfile;
    private int edrStatus;
    private int emitterStatus;
    private boolean emitterSupport;
    private final ExpandFunc expandFunc;
    private int expandMode;
    private int functionMask;
    private boolean getFileByNameWithDev;
    private boolean hideNetRadio;
    private boolean isBLEToSppWay;
    private boolean isNeedBootLoader;
    private boolean isSupportDoubleBackup;
    private String license;
    private int lowPowerLimit;
    private int mandatoryUpgradeFlag;
    private int maxVol;

    @Deprecated
    private String name;
    private int pid;
    private int platform;
    private String projectCode;
    private String protocolVersion;
    private int quantity;
    private int requestOtaFlag;
    private int sdkType;
    private int singleBackupOtaWay;
    private boolean supportOfflineShow;
    private boolean supportPackageCrc16;
    private boolean supportSd0;
    private boolean supportSd1;
    private boolean supportUsb;
    private boolean supportVolumeSync;
    private int ubootVersionCode;
    private String ubootVersionName;
    private int uid;
    private int versionCode;
    private String versionName;
    private int vid;
    private int volume;

    public TargetInfoResponse() {
        this.edrStatus = 0;
        this.edrProfile = 0;
        this.platform = -1;
        this.lowPowerLimit = 30;
        this.curFunction = 0;
        this.supportOfflineShow = false;
        this.supportUsb = true;
        this.supportSd0 = true;
        this.supportSd1 = true;
        this.hideNetRadio = false;
        this.supportVolumeSync = false;
        this.supportPackageCrc16 = false;
        this.getFileByNameWithDev = false;
        this.contactsTransferBySmallFile = false;
        this.expandFunc = new ExpandFunc();
    }

    public int getAllowConnectFlag() {
        return this.allowConnectFlag;
    }

    public String getAuthKey() {
        return this.authKey;
    }

    public String getBleAddr() {
        return this.bleAddr;
    }

    public byte getCurFunction() {
        return this.curFunction;
    }

    public String getCustomVersionMsg() {
        return this.customVersionMsg;
    }

    public String getEdrAddr() {
        return this.edrAddr;
    }

    public int getEdrProfile() {
        return this.edrProfile;
    }

    public int getEdrStatus() {
        return this.edrStatus;
    }

    public int getEmitterStatus() {
        return this.emitterStatus;
    }

    public ExpandFunc getExpandFunc() {
        return this.expandFunc;
    }

    public int getExpandMode() {
        return this.expandMode;
    }

    public int getFunctionMask() {
        return this.functionMask;
    }

    public String getLicense() {
        return this.license;
    }

    public int getLowPowerLimit() {
        return this.lowPowerLimit;
    }

    public int getMandatoryUpgradeFlag() {
        return this.mandatoryUpgradeFlag;
    }

    public int getMaxVol() {
        return this.maxVol;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    public int getPid() {
        return this.pid;
    }

    public int getPlatform() {
        return this.platform;
    }

    public String getProjectCode() {
        return this.projectCode;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public int getRequestOtaFlag() {
        return this.requestOtaFlag;
    }

    public int getSdkType() {
        return this.sdkType;
    }

    public int getSingleBackupOtaWay() {
        return this.singleBackupOtaWay;
    }

    public int getUbootVersionCode() {
        return this.ubootVersionCode;
    }

    public String getUbootVersionName() {
        return this.ubootVersionName;
    }

    public int getUid() {
        return this.uid;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int getVid() {
        return this.vid;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean isBLEToSppWay() {
        return this.isBLEToSppWay;
    }

    public boolean isBanEq() {
        return this.expandFunc.isBanEq();
    }

    public boolean isBleOnly() {
        return this.bleOnly;
    }

    public boolean isContactsTransferBySmallFile() {
        return this.contactsTransferBySmallFile;
    }

    public boolean isEmitterSupport() {
        return this.emitterSupport;
    }

    public boolean isGameMode() {
        return this.expandFunc.isGameMode();
    }

    public boolean isGetFileByNameWithDev() {
        return this.getFileByNameWithDev;
    }

    public boolean isHideNetRadio() {
        return this.hideNetRadio;
    }

    public boolean isNeedBootLoader() {
        return this.isNeedBootLoader;
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
        return this.isSupportDoubleBackup;
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
        return this.supportOfflineShow;
    }

    public boolean isSupportPackageCrc16() {
        return this.supportPackageCrc16;
    }

    public boolean isSupportReadErrorMSg() {
        return this.expandFunc.isSupportReadErrorMSg();
    }

    public boolean isSupportSd0() {
        return this.supportSd0;
    }

    public boolean isSupportSd1() {
        return this.supportSd1;
    }

    public boolean isSupportSearchDevice() {
        return this.expandFunc.isSupportSearchDevice();
    }

    public boolean isSupportSoundCard() {
        return this.expandFunc.isSupportSoundCard();
    }

    public boolean isSupportUsb() {
        return this.supportUsb;
    }

    public boolean isSupportVolumeSync() {
        return this.supportVolumeSync;
    }

    public TargetInfoResponse setAllowConnectFlag(int r1) {
        this.allowConnectFlag = r1;
        return this;
    }

    public TargetInfoResponse setAuthKey(String r1) {
        this.authKey = r1;
        return this;
    }

    public TargetInfoResponse setBLEToSppWay(boolean r1) {
        this.isBLEToSppWay = r1;
        return this;
    }

    public TargetInfoResponse setBleAddr(String r1) {
        this.bleAddr = r1;
        return this;
    }

    public TargetInfoResponse setBleOnly(boolean r1) {
        this.bleOnly = r1;
        return this;
    }

    public TargetInfoResponse setContactsTransferBySmallFile(boolean r1) {
        this.contactsTransferBySmallFile = r1;
        return this;
    }

    public TargetInfoResponse setCurFunction(byte r1) {
        this.curFunction = r1;
        return this;
    }

    public TargetInfoResponse setCustomVersionMsg(String r1) {
        this.customVersionMsg = r1;
        return this;
    }

    public TargetInfoResponse setEdrAddr(String r1) {
        this.edrAddr = r1;
        return this;
    }

    public TargetInfoResponse setEdrProfile(int r1) {
        this.edrProfile = r1;
        return this;
    }

    public TargetInfoResponse setEdrStatus(int r1) {
        this.edrStatus = r1;
        return this;
    }

    public TargetInfoResponse setEmitterStatus(int r1) {
        this.emitterStatus = r1;
        return this;
    }

    public TargetInfoResponse setEmitterSupport(boolean r1) {
        this.emitterSupport = r1;
        return this;
    }

    public TargetInfoResponse setExpandFunc(byte[] r2) {
        this.expandFunc.parseData(r2);
        return this;
    }

    public TargetInfoResponse setExpandMode(int r1) {
        this.expandMode = r1;
        return this;
    }

    public TargetInfoResponse setFunctionMask(int r1) {
        this.functionMask = r1;
        return this;
    }

    public TargetInfoResponse setGetFileByNameWithDev(boolean r1) {
        this.getFileByNameWithDev = r1;
        return this;
    }

    public TargetInfoResponse setHideNetRadio(boolean r1) {
        this.hideNetRadio = r1;
        return this;
    }

    public TargetInfoResponse setLicense(String r1) {
        this.license = r1;
        return this;
    }

    public TargetInfoResponse setLowPowerLimit(int r1) {
        this.lowPowerLimit = r1;
        return this;
    }

    public TargetInfoResponse setMandatoryUpgradeFlag(int r1) {
        this.mandatoryUpgradeFlag = r1;
        return this;
    }

    public TargetInfoResponse setMaxVol(int r1) {
        this.maxVol = r1;
        return this;
    }

    @Deprecated
    public TargetInfoResponse setName(String r1) {
        this.name = r1;
        return this;
    }

    public TargetInfoResponse setNeedBootLoader(boolean r1) {
        this.isNeedBootLoader = r1;
        return this;
    }

    public TargetInfoResponse setPid(int r1) {
        this.pid = r1;
        return this;
    }

    public TargetInfoResponse setPlatform(int r1) {
        this.platform = r1;
        return this;
    }

    public TargetInfoResponse setProjectCode(String r1) {
        this.projectCode = r1;
        return this;
    }

    public TargetInfoResponse setProtocolVersion(String r1) {
        this.protocolVersion = r1;
        return this;
    }

    public TargetInfoResponse setQuantity(int r1) {
        this.quantity = r1;
        return this;
    }

    public TargetInfoResponse setRequestOtaFlag(int r1) {
        this.requestOtaFlag = r1;
        return this;
    }

    public TargetInfoResponse setSdkType(int r1) {
        this.sdkType = r1;
        return this;
    }

    public TargetInfoResponse setSingleBackupOtaWay(int r1) {
        this.singleBackupOtaWay = r1;
        return this;
    }

    public TargetInfoResponse setSupportDoubleBackup(boolean r1) {
        this.isSupportDoubleBackup = r1;
        return this;
    }

    public TargetInfoResponse setSupportOfflineShow(boolean r1) {
        this.supportOfflineShow = r1;
        return this;
    }

    public TargetInfoResponse setSupportPackageCrc16(boolean r1) {
        this.supportPackageCrc16 = r1;
        return this;
    }

    public TargetInfoResponse setSupportSd0(boolean r1) {
        this.supportSd0 = r1;
        return this;
    }

    public TargetInfoResponse setSupportSd1(boolean r1) {
        this.supportSd1 = r1;
        return this;
    }

    public TargetInfoResponse setSupportUsb(boolean r1) {
        this.supportUsb = r1;
        return this;
    }

    public TargetInfoResponse setSupportVolumeSync(boolean r1) {
        this.supportVolumeSync = r1;
        return this;
    }

    public TargetInfoResponse setUbootVersionCode(int r1) {
        this.ubootVersionCode = r1;
        return this;
    }

    public TargetInfoResponse setUbootVersionName(String r1) {
        this.ubootVersionName = r1;
        return this;
    }

    public TargetInfoResponse setUid(int r1) {
        this.uid = r1;
        return this;
    }

    public TargetInfoResponse setVersionCode(int r1) {
        this.versionCode = r1;
        return this;
    }

    public TargetInfoResponse setVersionName(String r1) {
        this.versionName = r1;
        return this;
    }

    public TargetInfoResponse setVid(int r1) {
        this.vid = r1;
        return this;
    }

    public TargetInfoResponse setVolume(int r1) {
        this.volume = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "TargetInfoResponse{versionName='" + this.versionName + "', versionCode=" + this.versionCode + ", protocolVersion='" + this.protocolVersion + "', edrAddr='" + this.edrAddr + "', edrStatus=" + this.edrStatus + ", edrProfile=" + this.edrProfile + ", bleAddr='" + this.bleAddr + "', platform=" + this.platform + ", license='" + this.license + "', volume=" + this.volume + ", maxVol=" + this.maxVol + ", quantity=" + this.quantity + ", lowPowerLimit=" + this.lowPowerLimit + ", functionMask=" + this.functionMask + ", curFunction=" + this.curFunction + ", sdkType=" + this.sdkType + ", name='" + this.name + "', pid=" + this.pid + ", vid=" + this.vid + ", uid=" + this.uid + ", mandatoryUpgradeFlag=" + this.mandatoryUpgradeFlag + ", requestOtaFlag=" + this.requestOtaFlag + ", ubootVersionCode=" + this.ubootVersionCode + ", ubootVersionName='" + this.ubootVersionName + "', isSupportDoubleBackup=" + this.isSupportDoubleBackup + ", isNeedBootLoader=" + this.isNeedBootLoader + ", singleBackupOtaWay=" + this.singleBackupOtaWay + ", allowConnectFlag=" + this.allowConnectFlag + ", authKey='" + this.authKey + "', projectCode='" + this.projectCode + "', customVersionMsg='" + this.customVersionMsg + "', bleOnly=" + this.bleOnly + ", emitterSupport=" + this.emitterSupport + ", emitterStatus=" + this.emitterStatus + ", supportOfflineShow=" + this.supportOfflineShow + ", supportUsb=" + this.supportUsb + ", supportSd0=" + this.supportSd0 + ", supportSd1=" + this.supportSd1 + ", hideNetRadio=" + this.hideNetRadio + ", supportVolumeSync=" + this.supportVolumeSync + ", expandMode=" + this.expandMode + ", supportPackageCrc16 = " + this.supportPackageCrc16 + ", getFileByNameWithDev = " + this.getFileByNameWithDev + ", contactsTransferBySmallFile = " + this.contactsTransferBySmallFile + ", isBLEToSppWay = " + this.isBLEToSppWay + ", expandFunc = " + this.expandFunc + "} ";
    }
}
