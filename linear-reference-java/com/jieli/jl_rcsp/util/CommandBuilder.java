package com.jieli.jl_rcsp.util;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.sh1;
import com.jieli.jl_filebrowse.bean.PathData;
import com.jieli.jl_rcsp.model.base.CommandBase;
import com.jieli.jl_rcsp.model.command.AlarmExpandCmd;
import com.jieli.jl_rcsp.model.command.DisconnectClassicBluetoothCmd;
import com.jieli.jl_rcsp.model.command.FunctionCmd;
import com.jieli.jl_rcsp.model.command.GetDevConfigureCmd;
import com.jieli.jl_rcsp.model.command.NotifyCommunicationWayCmd;
import com.jieli.jl_rcsp.model.command.NotifyPrepareEnvCmd;
import com.jieli.jl_rcsp.model.command.ReadErrorMsgCmd;
import com.jieli.jl_rcsp.model.command.SearchDevCmd;
import com.jieli.jl_rcsp.model.command.SetDevStorageCmd;
import com.jieli.jl_rcsp.model.command.ai.AIOperateCmd;
import com.jieli.jl_rcsp.model.command.custom.CustomCmd;
import com.jieli.jl_rcsp.model.command.data.DataCmd;
import com.jieli.jl_rcsp.model.command.data.DataHasResponseCmd;
import com.jieli.jl_rcsp.model.command.external_flash.ExtFlashIOCtrlNoResponseCmd;
import com.jieli.jl_rcsp.model.command.external_flash.ExternalFlashIOCtrlCmd;
import com.jieli.jl_rcsp.model.command.external_flash.GetExternalFlashMsgCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartFileBrowseCmd;
import com.jieli.jl_rcsp.model.command.file_op.StartFileTransferCmd;
import com.jieli.jl_rcsp.model.command.file_op.StopFileTransferCmd;
import com.jieli.jl_rcsp.model.command.nfc.NFCOperationCmd;
import com.jieli.jl_rcsp.model.command.phone.PhoneCallRequestCmd;
import com.jieli.jl_rcsp.model.command.status.GetTargetInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.GetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.sys.SetSysInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.GetADVInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.SetADVInfoCmd;
import com.jieli.jl_rcsp.model.command.tws.SetDeviceNotifyAdvInfoCmd;
import com.jieli.jl_rcsp.model.command.upgrade.RebootDeviceCmd;
import com.jieli.jl_rcsp.model.command.watch.HealthSettingCmd;
import com.jieli.jl_rcsp.model.command.watch.PushInfoDataToDeviceCmd;
import com.jieli.jl_rcsp.model.command.watch.RequestHealthDataCmd;
import com.jieli.jl_rcsp.model.command.watch.SportsInfoStatusSyncCmd;
import com.jieli.jl_rcsp.model.device.AttrBean;
import com.jieli.jl_rcsp.model.device.VoiceMode;
import com.jieli.jl_rcsp.model.device.health.IHealthSettingToAttr;
import com.jieli.jl_rcsp.model.parameter.AIOperateParam;
import com.jieli.jl_rcsp.model.parameter.CustomParam;
import com.jieli.jl_rcsp.model.parameter.DataParam;
import com.jieli.jl_rcsp.model.parameter.ExternalFlashIOCtrlParam;
import com.jieli.jl_rcsp.model.parameter.FunctionParam;
import com.jieli.jl_rcsp.model.parameter.GetADVInfoParam;
import com.jieli.jl_rcsp.model.parameter.GetSysInfoParam;
import com.jieli.jl_rcsp.model.parameter.GetTargetInfoParam;
import com.jieli.jl_rcsp.model.parameter.NotifyCommunicationWayParam;
import com.jieli.jl_rcsp.model.parameter.PhoneCallRequestParam;
import com.jieli.jl_rcsp.model.parameter.RebootDeviceParam;
import com.jieli.jl_rcsp.model.parameter.SearchDevParam;
import com.jieli.jl_rcsp.model.parameter.SetADVInfoParam;
import com.jieli.jl_rcsp.model.parameter.SetDeviceNotifyAdvInfoParam;
import com.jieli.jl_rcsp.model.parameter.SetSysInfoParam;
import com.jieli.jl_rcsp.model.parameter.StartFileBrowseParam;
import com.jieli.jl_rcsp.model.parameter.StartFileTransferParam;
import com.jieli.jl_rcsp.model.parameter.StopFileTransferParam;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class CommandBuilder {
    public CommandBuilder() {
    }

    public static CommandBase buildAuditionAlarmBellCmd(byte r3, byte r4, int r5) {
        byte[] r0 = {1, r3, r4, 0, 0, 0, 0};
        System.arraycopy(CHexConver.intToBigBytes(r5), 0, r0, 3, 4);
        AttrBean r6 = new AttrBean();
        r6.setType((byte) 6);
        r6.setAttrData(r0);
        ArrayList r7 = new ArrayList();
        r7.add(r6);
        return buildSetSysInfoCmd((byte) 2, r7);
    }

    public static CommandBase buildAuxPlayOrPauseCmd() {
        return buildFunctionCmd((byte) 3, (byte) 1, null);
    }

    public static CommandBase buildCustomCmd(byte[] r2) {
        return new CustomCmd(new CustomParam(r2));
    }

    public static CommandBase buildCustomCmdWithoutResponse(byte[] r2) {
        return new CustomCmd(1, new CustomParam(r2));
    }

    public static DataCmd buildDataCmd(CommandBase r1, byte[] r2) {
        if (r1 == null) goto L6;
        if (r2 == null) goto L8;
        DataParam r0 = new DataParam(r2);
        r0.setXmOpCode(r1.getId());
        return new DataCmd(r0);
    L8:
        return null;
    L6:
        return null;
    }

    public static DataHasResponseCmd buildDataCmdWithResponse(CommandBase r1, byte[] r2) {
        if (r1 == null) goto L8;
        if (r2 != null) goto L5;
        return null;
    L5:
        if (r2.length <= 0) goto L11;
        DataParam r0 = new DataParam(r2);
        r0.setXmOpCode(r1.getId());
        return new DataHasResponseCmd(r0);
    L11:
        return null;
    L8:
        return null;
    }

    public static CommandBase buildDelAlarmCmd(AttrBean r1) {
        ArrayList r0 = new ArrayList();
        r0.add(r1);
        return buildSetSysInfoCmd((byte) 2, r0);
    }

    public static CommandBase buildDeleteNFCInfoSyncCmd(int r2, short r3) {
        return new NFCOperationCmd(new NFCOperationCmd.DeleteMsgParam(r2, r3));
    }

    public static CommandBase buildDisconnectClassicBluetoothCmd() {
        return new DisconnectClassicBluetoothCmd();
    }

    public static CommandBase buildExternalFlashDeleteFileEndCmd() {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(5).setFlag(0));
    }

    public static CommandBase buildExternalFlashDeleteFileStartCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(5).setFlag(1).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashEnableCustomWatchCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(3).setFlag(4).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashErasureDataCmd(int r3, int r4) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(4).setOffset(r3).setSize(r4));
    }

    public static CommandBase buildExternalFlashGetCurrentWatchMsgCmd() {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(3).setFlag(0));
    }

    public static CommandBase buildExternalFlashGetCustomBgInfoCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(3).setFlag(5).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashGetFileMsgCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(11).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashGetLeftSpaceCmd() {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(12));
    }

    public static CommandBase buildExternalFlashGetWatchVersionCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(3).setFlag(3).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashInsertNewFileEndCmd() {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(2).setFlag(0));
    }

    public static CommandBase buildExternalFlashInsertNewFileStartCmd(String r3, int r4) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(2).setFlag(1).setFilePath(r3).setSize(r4));
    }

    public static CommandBase buildExternalFlashOTAResourceCmd(boolean r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(9).setFlag(!r3 ? 1 : 0));
    }

    public static CommandBase buildExternalFlashQueryWriteResultCmd(int r3, short r4) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(8).setFlag(r3).setCrc16(r4));
    }

    public static CommandBase buildExternalFlashReadDataCmd(int r3, int r4, int r5) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(1).setFlag(r3).setOffset(r4).setSize(r5));
    }

    public static CommandBase buildExternalFlashRestoreSystemCmd() {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(10));
    }

    public static CommandBase buildExternalFlashSetWatchCmd(String r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(3).setFlag(1).setFilePath(r3));
    }

    public static CommandBase buildExternalFlashUpdateResourceCmd(boolean r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(7).setFlag(!r3 ? 1 : 0));
    }

    public static CommandBase buildExternalFlashWriteDataCmd(int r3, int r4, byte[] r5) {
        return new ExtFlashIOCtrlNoResponseCmd(new ExternalFlashIOCtrlParam().setOp(0).setFlag(r3).setOffset(r4).setData(r5));
    }

    public static CommandBase buildExternalFlashWriteProtectCmd(boolean r3) {
        return new ExternalFlashIOCtrlCmd(new ExternalFlashIOCtrlParam().setOp(6).setFlag(!r3 ? 1 : 0));
    }

    public static CommandBase buildFastForwardCmd(short r2) {
        return buildFunctionCmd((byte) 1, (byte) 7, CHexConver.shortToBigBytes(r2));
    }

    public static CommandBase buildFmDelChannelCmd(byte r2) {
        return buildFunctionCmd((byte) 4, (byte) 8, new byte[]{r2});
    }

    public static CommandBase buildFmFunctionCmd(byte r1, byte[] r2) {
        return buildFunctionCmd((byte) 4, r1, r2);
    }

    public static CommandBase buildFmNextChannelCmd() {
        return buildFunctionCmd((byte) 4, (byte) 5, null);
    }

    public static CommandBase buildFmNextFreqCmd() {
        return buildFunctionCmd((byte) 4, (byte) 3, null);
    }

    public static CommandBase buildFmPlayOrPauseCmd() {
        return buildFunctionCmd((byte) 4, (byte) 1, null);
    }

    public static CommandBase buildFmPrevChannelCmd() {
        return buildFunctionCmd((byte) 4, (byte) 4, null);
    }

    public static CommandBase buildFmPrevFreqCmd() {
        return buildFunctionCmd((byte) 4, (byte) 2, null);
    }

    public static CommandBase buildFmScanCmd(byte r2) {
        return buildFunctionCmd((byte) 4, (byte) 6, new byte[]{r2});
    }

    public static CommandBase buildFmSelChannelCmd(byte r2) {
        return buildFunctionCmd((byte) 4, (byte) 7, new byte[]{r2});
    }

    public static CommandBase buildFmSelectFreqCmd(float r3) {
        int r4 = (int) (r3 * 10.0f);
        return buildFunctionCmd((byte) 4, (byte) 9, new byte[]{(byte) ((r4 >> 8) & 255), (byte) (r4 & 255)});
    }

    public static CommandBase buildFunctionCmd(byte r1, byte r2, byte[] r3) {
        FunctionParam r0 = new FunctionParam(r1, r2);
        r0.setExtend(r3);
        return new FunctionCmd(r0);
    }

    public static CommandBase buildGetADVInfoCmd(int r2) {
        return new GetADVInfoCmd(new GetADVInfoParam(r2));
    }

    public static CommandBase buildGetADVInfoCmdWithAll() {
        return buildGetADVInfoCmd(-1);
    }

    public static CommandBase buildGetAlarmCmd() {
        return buildGetSysInfoCmd((byte) 2, 18);
    }

    public static CommandBase buildGetAllVoiceModes() {
        return buildGetSysInfoCmd((byte) -1, 16384);
    }

    public static CommandBase buildGetAuxPlayStatueCmd() {
        return buildGetSysInfoCmd((byte) 3, 1);
    }

    public static CommandBase buildGetBrowseFileTypeCmd() {
        return buildGetPublicSysInfoCmd(32);
    }

    public static CommandBase buildGetBtSysInfoCmd() {
        return buildGetBtSysInfoCmd(bo0.iO);
    }

    public static CommandBase buildGetCurrentVoiceMode() {
        return buildGetSysInfoCmd((byte) -1, 8192);
    }

    public static CommandBase buildGetDefaultAlarmBellsCmd() {
        return buildGetSysInfoCmd((byte) 2, 32);
    }

    public static CommandBase buildGetDefaultNfcOpCmd(int r2) {
        return new NFCOperationCmd(new NFCOperationCmd.GetDefaultNfcParam(r2));
    }

    public static CommandBase buildGetDevConfigureCmd() {
        return new GetDevConfigureCmd();
    }

    public static CommandBase buildGetDeviceInfoCmd(int r2) {
        return new GetTargetInfoCmd(new GetTargetInfoParam(r2));
    }

    public static CommandBase buildGetDeviceInfoCmdForAll() {
        return buildGetDeviceInfoCmd(-1);
    }

    public static CommandBase buildGetEqPresetAndEqValueCmd() {
        return buildGetPublicSysInfoCmd(4112);
    }

    public static CommandBase buildGetEqPresetValueCmd() {
        return buildGetPublicSysInfoCmd(4096);
    }

    public static CommandBase buildGetEqValueCmd() {
        return buildGetPublicSysInfoCmd(16);
    }

    public static CommandBase buildGetExternalFlashMsgCmd() {
        return new GetExternalFlashMsgCmd();
    }

    public static CommandBase buildGetFixedLenDataCmd() {
        return buildGetSysInfoCmd((byte) -1, 65536);
    }

    public static CommandBase buildGetFmChannelCmd() {
        return buildGetFmSysInfoCmd(2);
    }

    public static CommandBase buildGetFmStatueCmd() {
        return buildGetFmSysInfoCmd(1);
    }

    public static CommandBase buildGetFmSysInfoCmd(int r1) {
        return buildGetSysInfoCmd((byte) 4, r1);
    }

    public static CommandBase buildGetFrequencyTxInfoCmd() {
        return buildGetSysInfoCmd((byte) -1, 256);
    }

    public static CommandBase buildGetHealthDataInfoCmd(int r1, int r2, byte... r3) {
        return new RequestHealthDataCmd(new RequestHealthDataCmd.Param(r1, (byte) r2, r3));
    }

    public static CommandBase buildGetHealthSettingCmd(int r1) {
        return new HealthSettingCmd(new HealthSettingCmd.GetParam(r1));
    }

    public static CommandBase buildGetHighAndBassCmd() {
        return buildGetSysInfoCmd((byte) -1, 2048);
    }

    public static CommandBase buildGetLightControlInfoCmd() {
        return buildGetSysInfoCmd((byte) -1, 128);
    }

    public static CommandBase buildGetMusicFileInfoCmd() {
        return buildGetMusicSysInfoCmd(2);
    }

    public static CommandBase buildGetMusicPlayModeCmd() {
        return buildGetMusicSysInfoCmd(4);
    }

    public static CommandBase buildGetMusicStatusInfoCmd() {
        return buildGetMusicSysInfoCmd(1);
    }

    public static CommandBase buildGetMusicSysInfoCmd() {
        return buildGetMusicSysInfoCmd(bo0.iO);
    }

    public static CommandBase buildGetPublicSysInfoCmd() {
        return buildGetPublicSysInfoCmd(65527);
    }

    public static CommandBase buildGetSoundCardEqInfo() {
        return buildGetPublicSysInfoCmd(sh1.iO);
    }

    public static CommandBase buildGetSoundCardStatusInfo() {
        return buildGetPublicSysInfoCmd(524288);
    }

    public static CommandBase buildGetSysInfoCmd(byte r1, int r2) {
        return new GetSysInfoCmd(new GetSysInfoParam(r1, r2));
    }

    public static CommandBase buildGetVolumeCmd() {
        return buildGetPublicSysInfoCmd(2);
    }

    public static CommandBase buildID3DataPushSwitch(byte r2) {
        return buildFunctionCmd((byte) 0, (byte) 4, new byte[]{r2});
    }

    public static CommandBase buildID3PlayNextCmd() {
        return buildFunctionCmd((byte) 0, (byte) 3, null);
    }

    public static CommandBase buildID3PlayOrPauseCmd() {
        return buildFunctionCmd((byte) 0, (byte) 1, null);
    }

    public static CommandBase buildID3PlayPrevCmd() {
        return buildFunctionCmd((byte) 0, (byte) 2, null);
    }

    public static CommandBase buildInsertNfcFileCmd(int r2, int r3, String r4) {
        return new NFCOperationCmd(new NFCOperationCmd.InsertFileParam(r2, r3, r4));
    }

    public static CommandBase buildInsertNfcFileEndCmd(int r2, String r3) {
        return new NFCOperationCmd(new NFCOperationCmd.InsertFileEndParam(r2, r3));
    }

    public static CommandBase buildModifyNFCInfoCmd(NFCOperationCmd.ModifyMsgParam r1) {
        return new NFCOperationCmd(r1);
    }

    public static CommandBase buildNextEqModeCmd() {
        return buildFunctionCmd((byte) 1, (byte) 5, null);
    }

    public static CommandBase buildNextPlaymodeCmd() {
        return buildFunctionCmd((byte) 1, (byte) 4, null);
    }

    public static CommandBase buildNotifyAIDialThumbSuccess(String r3) {
        return new AIOperateCmd(new AIOperateParam().setOp(0).setFlag(4).setThumbPath(r3));
    }

    public static CommandBase buildNotifyAIPaintStyle(String r3) {
        return new AIOperateCmd(new AIOperateParam().setOp(0).setFlag(0).setAiDialStyle(r3));
    }

    public static NotifyCommunicationWayCmd buildNotifyCommunicationWayCmd(int r2, int r3) {
        return new NotifyCommunicationWayCmd(new NotifyCommunicationWayParam(r2, r3));
    }

    public static CommandBase buildNotifyPrepareEnvCmd(byte r1) {
        return new NotifyPrepareEnvCmd(new NotifyPrepareEnvCmd.Param(r1));
    }

    public static CommandBase buildPhoneCallCmd(String r1) {
        PhoneCallRequestParam r0 = new PhoneCallRequestParam(r1);
        r0.setType(1);
        return new PhoneCallRequestCmd(r0);
    }

    public static CommandBase buildPlayNextCmd() {
        return buildFunctionCmd((byte) 1, (byte) 3, null);
    }

    public static CommandBase buildPlayOrPauseCmd() {
        return buildFunctionCmd((byte) 1, (byte) 1, null);
    }

    public static CommandBase buildPlayPrevCmd() {
        return buildFunctionCmd((byte) 1, (byte) 2, null);
    }

    public static CommandBase buildPushMessageInfoCmd(PushInfoDataToDeviceCmd.MessageData r2) {
        return new PushInfoDataToDeviceCmd(new PushInfoDataToDeviceCmd.Param(r2));
    }

    public static CommandBase buildReadBellArgsCmd(byte r1) {
        return new AlarmExpandCmd(new AlarmExpandCmd.ReadRtcBellArgsParams(r1));
    }

    public static CommandBase buildRebootCmd() {
        return new RebootDeviceCmd(new RebootDeviceParam(0));
    }

    public static CommandBase buildRemoveMessageCmd(PushInfoDataToDeviceCmd.RemoveMsg r2) {
        return new PushInfoDataToDeviceCmd(new PushInfoDataToDeviceCmd.Param(r2));
    }

    public static CommandBase buildRetreatQuicklyCmd(short r2) {
        return buildFunctionCmd((byte) 1, (byte) 6, CHexConver.shortToBigBytes(r2));
    }

    public static CommandBase buildSearchDevCmd(int r1, int r2) {
        return buildSearchDevCmd(r1, r2, 0, 0);
    }

    public static CommandBase buildSendPathDataCmd(PathData r2) {
        return new StartFileBrowseCmd(new StartFileBrowseParam(r2));
    }

    public static CommandBase buildSetADVInfoCmd(byte[] r2) {
        if (r2 != null) goto L5;
        r2 = new byte[0];
    L5:
        return new SetADVInfoCmd(new SetADVInfoParam(r2));
    }

    public static CommandBase buildSetAlarmCmd(AttrBean r1) {
        ArrayList r0 = new ArrayList();
        r0.add(r1);
        return buildSetSysInfoCmd((byte) 2, r0);
    }

    public static CommandBase buildSetBellArgsCmd(AlarmExpandCmd.BellArg r1) {
        return new AlarmExpandCmd(new AlarmExpandCmd.SetRtcBellArgsParams(r1));
    }

    public static CommandBase buildSetBrowseFileTypeCmd(String r4) {
        if (TextUtils.isEmpty(r4) == true) goto L7;
        byte[] r5 = r4.getBytes();
        byte[] r0 = new byte[r5.length + 1];
        r0[0] = (byte) r5.length;
        System.arraycopy(r5, 0, r0, 1, r5.length);
        AttrBean r6 = new AttrBean();
        r6.setType((byte) 5);
        r6.setAttrData(r0);
        ArrayList r1 = new ArrayList();
        r1.add(r6);
        return buildSetPublicSysInfoCmd(r1);
    L7:
        throw new IllegalArgumentException("文件类型参数不能为null");
    }

    public static CommandBase buildSetBtSysInfoCmd(List<AttrBean> r1) {
        return buildSetSysInfoCmd((byte) 0, r1);
    }

    public static CommandBase buildSetCurrentVoiceMode(VoiceMode r2) {
        if (r2 != null) goto L5;
        return null;
    L5:
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 13);
        r0.setAttrData(r2.getBytes());
        ArrayList r3 = new ArrayList();
        r3.add(r0);
        return buildSetSysInfoCmd((byte) -1, r3);
    }

    public static CommandBase buildSetDefaultNfcOpCmd(int r2, short r3) {
        return new NFCOperationCmd(new NFCOperationCmd.SetDefaultNfcParam(r2, r3));
    }

    public static CommandBase buildSetDeviceNotifyADVInfoCmd(int r2) {
        return new SetDeviceNotifyAdvInfoCmd(new SetDeviceNotifyAdvInfoParam(r2));
    }

    public static CommandBase buildSetDeviceStorageCmd(int r1) {
        return new SetDevStorageCmd(r1);
    }

    @Deprecated
    public static CommandBase buildSetEqValueCmd(byte r4, byte[] r5) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 4);
        byte[] r1 = new byte[11];
        r1[0] = r4;
        if (r5 != null) goto L5;
    L7:
        r0.setAttrData(r1);
        ArrayList r6 = new ArrayList();
        r6.add(r0);
        return buildSetPublicSysInfoCmd(r6);
    L5:
        if (r5.length != 10) goto L7;
        System.arraycopy(r5, 0, r1, 1, r5.length);
        goto L7
    }

    public static CommandBase buildSetFixedLenDataCmd(int r4, byte[] r5) {
        ArrayList r0 = new ArrayList();
        byte[] r1 = new byte[r5.length + 4];
        byte[] r6 = CHexConver.intToBigBytes(r4);
        System.arraycopy(r6, 0, r1, 0, r6.length);
        System.arraycopy(r5, 0, r1, r6.length, r5.length);
        AttrBean r7 = new AttrBean();
        r7.setType((byte) 16);
        r7.setAttrData(r1);
        r0.add(r7);
        return buildSetSysInfoCmd((byte) -1, r0);
    }

    public static CommandBase buildSetFrequencyTxInfoCmd(byte[] r2) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 8);
        r0.setAttrData(r2);
        ArrayList r3 = new ArrayList();
        r3.add(r0);
        return buildSetSysInfoCmd((byte) -1, r3);
    }

    public static CommandBase buildSetHealthSettingCmd(List<AttrBean> r1) {
        return new HealthSettingCmd(new HealthSettingCmd.SetParam(r1));
    }

    public static CommandBase buildSetHighAndBassCmd(int r5, int r6) {
        ArrayList r0 = new ArrayList();
        AttrBean r1 = new AttrBean();
        r1.setType((byte) 11);
        byte[] r2 = new byte[8];
        byte[] r7 = CHexConver.intToBigBytes(r5);
        System.arraycopy(CHexConver.intToBigBytes(r6), 0, r2, 0, 4);
        System.arraycopy(r7, 0, r2, 4, 4);
        r1.setAttrData(r2);
        r0.add(r1);
        return buildSetSysInfoCmd((byte) -1, r0);
    }

    public static CommandBase buildSetLightControlInfoCmd(byte[] r3) {
        ArrayList r0 = new ArrayList();
        AttrBean r1 = new AttrBean();
        r1.setType((byte) 7);
        r1.setAttrData(r3);
        r0.add(r1);
        return buildSetSysInfoCmd((byte) -1, r0);
    }

    public static CommandBase buildSetMusicPlayModeCmd(byte r2) {
        byte[] r0 = {r2};
        AttrBean r3 = new AttrBean();
        r3.setType((byte) 2);
        r3.setAttrData(r0);
        ArrayList r1 = new ArrayList();
        r1.add(r3);
        return buildSetMusicSysInfoCmd(r1);
    }

    public static CommandBase buildSetMusicSysInfoCmd(List<AttrBean> r1) {
        return buildSetSysInfoCmd((byte) 1, r1);
    }

    public static CommandBase buildSetPublicSysInfoCmd(List<AttrBean> r1) {
        return buildSetSysInfoCmd((byte) -1, r1);
    }

    public static CommandBase buildSetSoundCardEqValue(byte[] r5) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 18);
        byte[] r1 = new byte[r5.length + 1];
        r1[0] = (byte) r5.length;
        System.arraycopy(r5, 0, r1, 1, r5.length);
        r0.setAttrData(r1);
        ArrayList r6 = new ArrayList();
        r6.add(r0);
        return buildSetPublicSysInfoCmd(r6);
    }

    public static CommandBase buildSetSoundCardInfo(byte r4, int r5) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 19);
        r0.setAttrData(new byte[]{r4, (byte) ((r5 >> 8) & 255), (byte) (r5 & 255)});
        ArrayList r6 = new ArrayList();
        r6.add(r0);
        return buildSetPublicSysInfoCmd(r6);
    }

    public static CommandBase buildSetSysInfoCmd(byte r2, List<AttrBean> r3) {
        return new SetSysInfoCmd(new SetSysInfoParam(r2, r3));
    }

    public static CommandBase buildSetVolumeCmd(int r3) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 1);
        r0.setAttrData(new byte[]{(byte) r3});
        ArrayList r4 = new ArrayList();
        r4.add(r0);
        return buildSetPublicSysInfoCmd(r4);
    }

    public static CommandBase buildShutdownCmd() {
        return new RebootDeviceCmd(new RebootDeviceParam(1));
    }

    @Deprecated
    public static CommandBase buildStartFileTransferCmd(String r1, int r2, boolean r3) {
        StartFileTransferParam r0 = new StartFileTransferParam(r1, r2);
        r0.enableDataNeedResponse(r3);
        return new StartFileTransferCmd(r0);
    }

    public static CommandBase buildStartNFCInfoSyncCmd(int r2) {
        return new NFCOperationCmd(new NFCOperationCmd.StartSyncParam(r2));
    }

    public static CommandBase buildStartReadErrorMsgCmd() {
        ReadErrorMsgCmd.ReadErrorMsgParam r0 = new ReadErrorMsgCmd.ReadErrorMsgParam();
        r0.setOp(0);
        return new ReadErrorMsgCmd(r0);
    }

    public static CommandBase buildStopAlarmCmd() {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 1);
        r0.setAttrData(new byte[]{2});
        ArrayList r1 = new ArrayList();
        r1.add(r0);
        return buildSetSysInfoCmd((byte) 2, r1);
    }

    public static CommandBase buildStopAuditionAlarmBellCmd() {
        AttrBean r1 = new AttrBean();
        r1.setType((byte) 6);
        r1.setAttrData(new byte[1]);
        ArrayList r0 = new ArrayList();
        r0.add(r1);
        return buildSetSysInfoCmd((byte) 2, r0);
    }

    public static CommandBase buildStopDeviceNotifyADVInfoCmd() {
        return buildSetDeviceNotifyADVInfoCmd(0);
    }

    @Deprecated
    public static CommandBase buildStopFileTransferCmd(int r1) {
        return new StopFileTransferCmd(new StopFileTransferParam(r1));
    }

    public static CommandBase buildStopReadErrorMsgCmd() {
        ReadErrorMsgCmd.ReadErrorMsgParam r0 = new ReadErrorMsgCmd.ReadErrorMsgParam();
        r0.setOp(1);
        return new ReadErrorMsgCmd(r0);
    }

    public static CommandBase buildSwitchBtModeCmd() {
        return buildSwitchModeCmd((byte) 0);
    }

    public static CommandBase buildSwitchFMModeCmd() {
        return buildSwitchModeCmd((byte) 4);
    }

    public static CommandBase buildSwitchLineInModeCmd() {
        return buildSwitchModeCmd((byte) 3);
    }

    public static CommandBase buildSwitchModeCmd(byte r2) {
        return buildFunctionCmd((byte) -1, r2, null);
    }

    public static CommandBase buildSwitchMusicModeCmd() {
        return buildSwitchModeCmd((byte) 1);
    }

    public static CommandBase buildSwitchRtcModeCmd() {
        return buildSwitchModeCmd((byte) 2);
    }

    public static CommandBase buildSyncSportsStatusCmd(SportsInfoStatusSyncCmd.Param r1) {
        return new SportsInfoStatusSyncCmd(r1);
    }

    public static CommandBase buildSyncTimeCmd(Calendar r12) {
        AttrBean r0 = new AttrBean();
        r0.setType((byte) 0);
        int r3 = r12.get(1);
        r0.setAttrData(new byte[]{(byte) ((r3 >> 8) & 255), (byte) (r3 & 255), (byte) (r12.get(2) + 1), (byte) r12.get(5), (byte) r12.get(11), (byte) r12.get(12), (byte) r12.get(13)});
        ArrayList r13 = new ArrayList();
        r13.add(r0);
        return buildSetSysInfoCmd((byte) 2, r13);
    }

    public static CommandBase buildGetBtSysInfoCmd(int r1) {
        return buildGetSysInfoCmd((byte) 0, r1);
    }

    public static CommandBase buildGetDeviceInfoCmd(int r2, byte r3) {
        return new GetTargetInfoCmd(new GetTargetInfoParam(r2).setPlatform(r3));
    }

    public static CommandBase buildGetMusicSysInfoCmd(int r1) {
        return buildGetSysInfoCmd((byte) 1, r1);
    }

    public static CommandBase buildGetPublicSysInfoCmd(int r1) {
        return buildGetSysInfoCmd((byte) -1, r1);
    }

    public static CommandBase buildSearchDevCmd(int r2, int r3, int r4, int r5) {
        SearchDevParam r0 = new SearchDevParam(1, r2, r3);
        r0.setWay(r4);
        r0.setPlayer(r5);
        return new SearchDevCmd(r0);
    }

    public static CommandBase buildSetHealthSettingCmd(IHealthSettingToAttr r1) {
        ArrayList r0 = new ArrayList();
        r0.add(r1.toAttr());
        return buildSetHealthSettingCmd(r0);
    }

    public static CommandBase buildSetFrequencyTxInfoCmd(float r2) {
        return buildSetFrequencyTxInfoCmd(CHexConver.int2byte2((int) Math.floor(r2 * 10.0f)));
    }

    public static CommandBase buildSetEqValueCmd(boolean r4, byte r5, byte[] r6) {
        if (r4 == false) goto L4;
        AttrBean r7 = new AttrBean();
        r7.setType((byte) 4);
        byte[] r0 = new byte[r6.length + 2];
        r0[0] = (byte) (r5 | 128);
        r0[1] = (byte) r6.length;
        System.arraycopy(r6, 0, r0, 2, r6.length);
        r7.setAttrData(r0);
        ArrayList r8 = new ArrayList();
        r8.add(r7);
        return buildSetPublicSysInfoCmd(r8);
    L4:
        return buildSetEqValueCmd(r5, r6);
    }
}
