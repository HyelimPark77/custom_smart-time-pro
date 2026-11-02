package com.jieli.jl_rcsp.model.device;

import com.jieli.jl_rcsp.model.device.health.HealthSettingInfo;
import com.jieli.jl_rcsp.model.device.health.SportsInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.TargetInfoResponse;
import com.jieli.jl_rcsp.util.CHexConver;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class DeviceInfo extends TargetInfoResponse {
    private List<DefaultAlarmBell> alarmDefaultBells;
    private byte alarmExpandFlag;
    private AlarmListInfo alarmListInfo;
    private int alarmVersion;
    private List<ChannelInfo> channelInfos;
    private int cluster;
    private byte currentDevIndex;
    private VoiceMode currentVoiceMode;
    private DevStorageInfo devStorageInfo;
    private EqInfo eqInfo;
    private EqPresetInfo eqPresetInfo;
    private ExpandFunction expandFunction;
    private FmStatusInfo fmStatusInfo;
    private float frequency;
    private HealthSettingInfo healthSettingInfo;
    private ID3MusicInfo iD3MusicInfo;
    private boolean isAuxPlay;
    private LightControlInfo lightControlInfo;
    private MusicNameInfo musicNameInfo;
    private MusicStatusInfo musicStatusInfo;
    private NetworkInfo networkInfo;
    private int phoneStatus;
    private String playFileFormat;
    private PlayModeInfo playModeInfo;
    private EqInfo soundCardEqInfo;
    private SportsInfo sportsInfo;
    private List<VoiceMode> voiceModeList;

    public DeviceInfo() {
        this.alarmExpandFlag = 0;
    }

    public static DeviceInfo convertFromTargetInfo(TargetInfoResponse r3) {
        if (r3 != null) goto L5;
        return null;
    L5:
        DeviceInfo r0 = new DeviceInfo();
        r0.setVersionName(r3.getVersionName()).setVersionCode(r3.getVersionCode()).setProtocolVersion(r3.getProtocolVersion()).setEdrAddr(r3.getEdrAddr()).setEdrStatus(r3.getEdrStatus()).setEdrProfile(r3.getEdrProfile()).setBleAddr(r3.getBleAddr()).setBleOnly(r3.isBleOnly()).setPlatform(r3.getPlatform()).setLicense(r3.getLicense()).setVolume(r3.getVolume()).setMaxVol(r3.getMaxVol()).setQuantity(r3.getQuantity()).setLowPowerLimit(r3.getLowPowerLimit()).setFunctionMask(r3.getFunctionMask()).setCurFunction(r3.getCurFunction()).setSdkType(r3.getSdkType()).setName(r3.getName()).setPid(r3.getPid()).setVid(r3.getVid()).setUid(r3.getUid()).setMandatoryUpgradeFlag(r3.getMandatoryUpgradeFlag()).setRequestOtaFlag(r3.getRequestOtaFlag()).setUbootVersionCode(r3.getUbootVersionCode()).setUbootVersionName(r3.getUbootVersionName()).setSupportDoubleBackup(r3.isSupportDoubleBackup()).setNeedBootLoader(r3.isNeedBootLoader()).setSingleBackupOtaWay(r3.getSingleBackupOtaWay()).setAllowConnectFlag(r3.getAllowConnectFlag()).setAuthKey(r3.getAuthKey()).setProjectCode(r3.getProjectCode()).setCustomVersionMsg(r3.getCustomVersionMsg()).setEmitterSupport(r3.isEmitterSupport()).setEmitterStatus(r3.getEmitterStatus()).setSupportOfflineShow(r3.isSupportOfflineShow()).setSupportUsb(r3.isSupportUsb()).setSupportSd0(r3.isSupportSd0()).setSupportSd1(r3.isSupportSd1()).setSupportVolumeSync(r3.isSupportVolumeSync()).setSupportPackageCrc16(r3.isSupportPackageCrc16()).setGetFileByNameWithDev(r3.isGetFileByNameWithDev()).setContactsTransferBySmallFile(r3.isContactsTransferBySmallFile()).setExpandMode(r3.getExpandMode()).setBLEToSppWay(r3.isBLEToSppWay()).setExpandFunc(r3.getExpandFunc().getRawData());
        return r0;
    }

    public static DeviceInfo mergeTargetInfos(DeviceInfo r2, DeviceInfo r3) {
        if (r2 != null) goto L4;
        return r3;
    L4:
        r3.setVoiceModeList(r2.getVoiceModeList()).setCurrentVoiceMode(r2.getCurrentVoiceMode()).setAlarmVersion(r2.getAlarmVersion()).setAlarmDefaultBells(r2.getAlarmDefaultBells()).setAlarmExpandFlag(r2.getAlarmExpandFlag()).setAlarmListInfo(r2.getAlarmListInfo()).setMusicNameInfo(r2.getMusicNameInfo()).setMusicStatusInfo(r2.getMusicStatusInfo()).setPlayModeInfo(r2.getPlayModeInfo()).setPlayFileFormat(r2.getPlayFileFormat()).setPhoneStatus(r2.getPhoneStatus()).setEqInfo(r2.getEqInfo()).setEqPresetInfo(r2.getEqPresetInfo()).setSoundCardEqInfo(r2.getSoundCardEqInfo()).setLightControlInfo(r2.getLightControlInfo()).setCluster(r2.getCluster()).setCurrentDevIndex(r2.getCurrentDevIndex()).setFrequency(r2.getFrequency()).setFmStatusInfo(r2.getFmStatusInfo()).setAuxPlay(r2.isAuxPlay()).setiD3MusicInfo(r2.getiD3MusicInfo()).setHealthSettingInfo(r2.getHealthSettingInfo()).setSportsInfo(r2.getSportsInfo()).setNetworkInfo(r2.getNetworkInfo());
        return r3;
    }

    public boolean checkDevModeExist(byte r7) {
        if (r7 <= 32) goto L5;
        return false;
    L5:
        byte r8 = CHexConver.intToByte((int) Math.pow(2.0d, CHexConver.byteToInt(r7)));
        if ((getFunctionMask() & r8) != r8) goto L9;
        return true;
    L9:
        return false;
    }

    public List<DefaultAlarmBell> getAlarmDefaultBells() {
        return this.alarmDefaultBells;
    }

    public byte getAlarmExpandFlag() {
        return this.alarmExpandFlag;
    }

    public AlarmListInfo getAlarmListInfo() {
        return this.alarmListInfo;
    }

    public int getAlarmVersion() {
        return this.alarmVersion;
    }

    public List<ChannelInfo> getChannelInfos() {
        return this.channelInfos;
    }

    public int getCluster() {
        return this.cluster;
    }

    public byte getCurrentDevIndex() {
        return this.currentDevIndex;
    }

    public VoiceMode getCurrentVoiceMode() {
        return this.currentVoiceMode;
    }

    public DevStorageInfo getDevStorageInfo() {
        return this.devStorageInfo;
    }

    public EqInfo getEqInfo() {
        return this.eqInfo;
    }

    public EqPresetInfo getEqPresetInfo() {
        return this.eqPresetInfo;
    }

    public ExpandFunction getExpandFunction() {
        return this.expandFunction;
    }

    public FmStatusInfo getFmStatusInfo() {
        return this.fmStatusInfo;
    }

    public float getFrequency() {
        return this.frequency;
    }

    public HealthSettingInfo getHealthSettingInfo() {
        return this.healthSettingInfo;
    }

    public LightControlInfo getLightControlInfo() {
        return this.lightControlInfo;
    }

    public MusicNameInfo getMusicNameInfo() {
        return this.musicNameInfo;
    }

    public MusicStatusInfo getMusicStatusInfo() {
        return this.musicStatusInfo;
    }

    public NetworkInfo getNetworkInfo() {
        return this.networkInfo;
    }

    public int getPhoneStatus() {
        return this.phoneStatus;
    }

    public String getPlayFileFormat() {
        return this.playFileFormat;
    }

    public PlayModeInfo getPlayModeInfo() {
        return this.playModeInfo;
    }

    public EqInfo getSoundCardEqInfo() {
        return this.soundCardEqInfo;
    }

    public SportsInfo getSportsInfo() {
        return this.sportsInfo;
    }

    public List<VoiceMode> getVoiceModeList() {
        return this.voiceModeList;
    }

    public ID3MusicInfo getiD3MusicInfo() {
        return this.iD3MusicInfo;
    }

    public boolean isAuxEnable() {
        return checkDevModeExist((byte) 3);
    }

    public boolean isAuxPlay() {
        return this.isAuxPlay;
    }

    public boolean isBtEnable() {
        if (getFunctionMask() != 0) goto L5;
        return true;
    L5:
        if (checkDevModeExist((byte) 0) == true) goto L10;
        return false;
    L10:
        return true;
    }

    public boolean isDevMusicEnable() {
        return checkDevModeExist((byte) 1);
    }

    public boolean isFmEnable() {
        return checkDevModeExist((byte) 4);
    }

    public boolean isFmTxEnable() {
        return checkDevModeExist((byte) 6);
    }

    public boolean isLightEnable() {
        return checkDevModeExist((byte) 5);
    }

    public boolean isMandatoryUpgrade() {
        if (getMandatoryUpgradeFlag() != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isRTCEnable() {
        return checkDevModeExist((byte) 2);
    }

    public DeviceInfo setAlarmDefaultBells(List<DefaultAlarmBell> r1) {
        this.alarmDefaultBells = r1;
        return this;
    }

    public DeviceInfo setAlarmExpandFlag(byte r1) {
        this.alarmExpandFlag = r1;
        return this;
    }

    public DeviceInfo setAlarmListInfo(AlarmListInfo r1) {
        this.alarmListInfo = r1;
        return this;
    }

    public DeviceInfo setAlarmVersion(int r1) {
        this.alarmVersion = r1;
        return this;
    }

    public DeviceInfo setAuxPlay(boolean r1) {
        this.isAuxPlay = r1;
        return this;
    }

    public DeviceInfo setChannelInfos(List<ChannelInfo> r1) {
        this.channelInfos = r1;
        return this;
    }

    public DeviceInfo setCluster(int r1) {
        this.cluster = r1;
        return this;
    }

    public DeviceInfo setCurrentDevIndex(byte r1) {
        this.currentDevIndex = r1;
        return this;
    }

    public DeviceInfo setCurrentVoiceMode(VoiceMode r1) {
        this.currentVoiceMode = r1;
        return this;
    }

    public DeviceInfo setDevStorageInfo(DevStorageInfo r1) {
        this.devStorageInfo = r1;
        return this;
    }

    public DeviceInfo setEqInfo(EqInfo r1) {
        this.eqInfo = r1;
        return this;
    }

    public DeviceInfo setEqPresetInfo(EqPresetInfo r1) {
        this.eqPresetInfo = r1;
        return this;
    }

    public DeviceInfo setExpandFunction(ExpandFunction r1) {
        this.expandFunction = r1;
        return this;
    }

    public DeviceInfo setFmStatusInfo(FmStatusInfo r1) {
        this.fmStatusInfo = r1;
        return this;
    }

    public DeviceInfo setFrequency(float r1) {
        this.frequency = r1;
        return this;
    }

    public DeviceInfo setHealthSettingInfo(HealthSettingInfo r1) {
        this.healthSettingInfo = r1;
        return this;
    }

    public DeviceInfo setLightControlInfo(LightControlInfo r1) {
        this.lightControlInfo = r1;
        return this;
    }

    public DeviceInfo setMusicNameInfo(MusicNameInfo r1) {
        this.musicNameInfo = r1;
        return this;
    }

    public DeviceInfo setMusicStatusInfo(MusicStatusInfo r1) {
        this.musicStatusInfo = r1;
        return this;
    }

    public DeviceInfo setNetworkInfo(NetworkInfo r1) {
        this.networkInfo = r1;
        return this;
    }

    public DeviceInfo setPhoneStatus(int r1) {
        this.phoneStatus = r1;
        return this;
    }

    public DeviceInfo setPlayFileFormat(String r1) {
        this.playFileFormat = r1;
        return this;
    }

    public DeviceInfo setPlayModeInfo(PlayModeInfo r1) {
        this.playModeInfo = r1;
        return this;
    }

    public DeviceInfo setSoundCardEqInfo(EqInfo r1) {
        this.soundCardEqInfo = r1;
        return this;
    }

    public DeviceInfo setSportsInfo(SportsInfo r1) {
        this.sportsInfo = r1;
        return this;
    }

    public DeviceInfo setVoiceModeList(List<VoiceMode> r1) {
        this.voiceModeList = r1;
        return this;
    }

    public DeviceInfo setiD3MusicInfo(ID3MusicInfo r1) {
        this.iD3MusicInfo = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.response.TargetInfoResponse, com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "DeviceInfo{alarmListInfo=" + this.alarmListInfo + ", alarmDefaultBells=" + this.alarmDefaultBells + ", alarmVersion=" + this.alarmVersion + ", alarmExpandFlag=" + this.alarmExpandFlag + ", musicNameInfo=" + this.musicNameInfo + ", musicStatusInfo=" + this.musicStatusInfo + ", playModeInfo=" + this.playModeInfo + ", isAuxPlay=" + this.isAuxPlay + ", playFileFormat='" + this.playFileFormat + "', cluster=" + this.cluster + ", currentDevIndex=" + this.currentDevIndex + ", eqPresetInfo=" + this.eqPresetInfo + ", eqInfo=" + this.eqInfo + ", devStorageInfo=" + this.devStorageInfo + ", lightControlInfo=" + this.lightControlInfo + ", soundCardEqInfo=" + this.soundCardEqInfo + ", channelInfos=" + this.channelInfos + ", fmStatusInfo=" + this.fmStatusInfo + ", frequency=" + this.frequency + ", iD3MusicInfo=" + this.iD3MusicInfo + ", currentVoiceMode=" + this.currentVoiceMode + ", voiceModeList=" + this.voiceModeList + ", phoneStatus=" + this.phoneStatus + ", expandFunction=" + this.expandFunction + ", healthSettingInfo=" + this.healthSettingInfo + ", sportsInfo=" + this.sportsInfo + ", networkInfo=" + this.networkInfo + "} \n" + super.toString();
    }
}
