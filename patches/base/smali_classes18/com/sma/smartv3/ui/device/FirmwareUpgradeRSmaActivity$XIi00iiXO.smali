.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/szabh/smable3/component/BleHandleCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO$OXO1;
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->XO0O10(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->iO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final XO0O10(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V
    .locals 6

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMLatestUi$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public bridge onAICoachGeneratePlanUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAICoachGeneratePlanUpdate(I)V

    return-void
.end method

.method public bridge onAICommandUpdate(Lcom/szabh/smable3/entity/BleAICommand;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAICommandUpdate(Lcom/szabh/smable3/entity/BleAICommand;)V

    return-void
.end method

.method public bridge onActivityRecognitionUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onActivityRecognitionUpdate(I)V

    return-void
.end method

.method public bridge onAlarmAdd(Lcom/szabh/smable3/entity/BleAlarm;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAlarmAdd(Lcom/szabh/smable3/entity/BleAlarm;)V

    return-void
.end method

.method public bridge onAlarmDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAlarmDelete(I)V

    return-void
.end method

.method public bridge onAlarmUpdate(Lcom/szabh/smable3/entity/BleAlarm;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAlarmUpdate(Lcom/szabh/smable3/entity/BleAlarm;)V

    return-void
.end method

.method public bridge onAppOpUpdate(Lcom/szabh/smable3/entity/BleAppOp;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAppOpUpdate(Lcom/szabh/smable3/entity/BleAppOp;)V

    return-void
.end method

.method public bridge onAppSportDataResponse(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onAppSportDataResponse(Z)V

    return-void
.end method

.method public bridge onBWNaviInfoUpdate(Lcom/szabh/smable3/entity/BleBWNaviInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBWNaviInfoUpdate(Lcom/szabh/smable3/entity/BleBWNaviInfo;)V

    return-void
.end method

.method public bridge onBacklightUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBacklightUpdate(I)V

    return-void
.end method

.method public bridge onBandKeyUpdate(Lcom/szabh/smable3/entity/BleBandKey;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBandKeyUpdate(Lcom/szabh/smable3/entity/BleBandKey;)V

    return-void
.end method

.method public bridge onBleGolfScore(Lcom/szabh/smable3/entity/BleGolfScore;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBleGolfScore(Lcom/szabh/smable3/entity/BleGolfScore;)V

    return-void
.end method

.method public bridge onBleThirdPartyDataUpdate(Lcom/szabh/smable3/entity/BleThirdPartyData;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBleThirdPartyDataUpdate(Lcom/szabh/smable3/entity/BleThirdPartyData;)V

    return-void
.end method

.method public bridge onBleVideoCallInfo(Lcom/szabh/smable3/entity/BleVideoCallInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onBleVideoCallInfo(Lcom/szabh/smable3/entity/BleVideoCallInfo;)V

    return-void
.end method

.method public bridge onCPChatUpdate(Lcom/szabh/smable3/entity/BleCPChat;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCPChatUpdate(Lcom/szabh/smable3/entity/BleCPChat;)V

    return-void
.end method

.method public bridge onCPGiftsInfoUpdate(Lcom/szabh/smable3/entity/BleCPGiftsInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCPGiftsInfoUpdate(Lcom/szabh/smable3/entity/BleCPGiftsInfo;)V

    return-void
.end method

.method public bridge onCPListenerUpdate(Lcom/szabh/smable3/entity/BleCPListener;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCPListenerUpdate(Lcom/szabh/smable3/entity/BleCPListener;)V

    return-void
.end method

.method public bridge onCPMissYouUpdate(Lcom/szabh/smable3/entity/BleCPMissYou;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCPMissYouUpdate(Lcom/szabh/smable3/entity/BleCPMissYou;)V

    return-void
.end method

.method public bridge onCPTodoUpdate(Lcom/szabh/smable3/entity/BleCPTodo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCPTodoUpdate(Lcom/szabh/smable3/entity/BleCPTodo;)V

    return-void
.end method

.method public bridge onCaloriesGoalUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCaloriesGoalUpdate(I)V

    return-void
.end method

.method public bridge onCameraResponse(ZI)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->onCameraResponse(ZI)V

    return-void
.end method

.method public bridge onCameraStateChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCameraStateChange(I)V

    return-void
.end method

.method public bridge onChatAppUpdate(Lcom/szabh/smable3/entity/BleChatApp;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onChatAppUpdate(Lcom/szabh/smable3/entity/BleChatApp;)V

    return-void
.end method

.method public bridge onChatMessageUpdate(Lcom/szabh/smable3/entity/BleChatMessage;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onChatMessageUpdate(Lcom/szabh/smable3/entity/BleChatMessage;)V

    return-void
.end method

.method public bridge onChatVoiceUpdate(Lcom/szabh/smable3/entity/BleChatVoice;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onChatVoiceUpdate(Lcom/szabh/smable3/entity/BleChatVoice;)V

    return-void
.end method

.method public bridge onCheckInEveryDayUpdate(Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onCheckInEveryDayUpdate(Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V

    return-void
.end method

.method public bridge onClassicBluetoothStateChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onClassicBluetoothStateChange(I)V

    return-void
.end method

.method public bridge onCommandReply(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Z)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BleHandleCallback;->onCommandReply(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Z)V

    return-void
.end method

.method public onCommandSendTimeout(Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 3

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/szabh/smable3/BleKey;->UI_FILE:Lcom/szabh/smable3/BleKey;

    if-eq p1, p2, :cond_1

    sget-object p2, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, p2, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge onContactUsStateChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onContactUsStateChange(I)V

    return-void
.end method

.method public bridge onDeleteAICoachPlan()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeleteAICoachPlan()V

    return-void
.end method

.method public bridge onDeleteFileResponse(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeleteFileResponse(I)V

    return-void
.end method

.method public bridge onDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceConnected(Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public bridge onDeviceConnecting(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceConnecting(Z)V

    return-void
.end method

.method public bridge onDeviceFileUpdate(Lcom/szabh/smable3/entity/BleDeviceFile;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceFileUpdate(Lcom/szabh/smable3/entity/BleDeviceFile;)V

    return-void
.end method

.method public bridge onDeviceOpUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceOpUpdate(I)V

    return-void
.end method

.method public bridge onDeviceRequestAGpsFile(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceRequestAGpsFile(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onDeviceSMSQuickReply(Lcom/szabh/smable3/entity/BleSMSQuickReply;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceSMSQuickReply(Lcom/szabh/smable3/entity/BleSMSQuickReply;)V

    return-void
.end method

.method public bridge onDeviceSportDataUpdate(Lcom/szabh/smable3/entity/BleDeviceSportData;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDeviceSportDataUpdate(Lcom/szabh/smable3/entity/BleDeviceSportData;)V

    return-void
.end method

.method public bridge onDistanceGoalUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDistanceGoalUpdate(I)V

    return-void
.end method

.method public bridge onDoubleScreenSettingsUpdate(Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDoubleScreenSettingsUpdate(Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V

    return-void
.end method

.method public bridge onDrinkWaterUpdate(Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onDrinkWaterUpdate(Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V

    return-void
.end method

.method public bridge onEarphoneAncSettingsUpdate(Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onEarphoneAncSettingsUpdate(Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V

    return-void
.end method

.method public bridge onEarphoneCallUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onEarphoneCallUpdate(I)V

    return-void
.end method

.method public bridge onEarphoneKeyUpdate(Lcom/szabh/smable3/entity/BleEarphoneKey;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onEarphoneKeyUpdate(Lcom/szabh/smable3/entity/BleEarphoneKey;)V

    return-void
.end method

.method public bridge onEarphoneSoundEffectsSettingsUpdate(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onEarphoneSoundEffectsSettingsUpdate(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V

    return-void
.end method

.method public bridge onEarphoneStateUpdate(Lcom/szabh/smable3/entity/BleEarphoneState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onEarphoneStateUpdate(Lcom/szabh/smable3/entity/BleEarphoneState;)V

    return-void
.end method

.method public bridge onFactoryTestUpdate(Lcom/szabh/smable3/entity/BleFactoryTest;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFactoryTestUpdate(Lcom/szabh/smable3/entity/BleFactoryTest;)V

    return-void
.end method

.method public bridge onFallSetUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFallSetUpdate(I)V

    return-void
.end method

.method public bridge onFindEarphoneUpdate(Lcom/szabh/smable3/entity/BleFindEarphone;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFindEarphoneUpdate(Lcom/szabh/smable3/entity/BleFindEarphone;)V

    return-void
.end method

.method public bridge onFindPhone(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFindPhone(Z)V

    return-void
.end method

.method public bridge onFindWatchUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFindWatchUpdate(I)V

    return-void
.end method

.method public bridge onFollowSystemDateFormat()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onFollowSystemDateFormat()V

    return-void
.end method

.method public bridge onFollowSystemHour()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onFollowSystemHour()V

    return-void
.end method

.method public bridge onFollowSystemLanguage(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onFollowSystemLanguage(Z)V

    return-void
.end method

.method public bridge onGameControlUpdate(Lcom/szabh/smable3/entity/BleGameControl;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onGameControlUpdate(Lcom/szabh/smable3/entity/BleGameControl;)V

    return-void
.end method

.method public bridge onGestureWake2Update(Lcom/szabh/smable3/entity/BleGestureWake2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onGestureWake2Update(Lcom/szabh/smable3/entity/BleGestureWake2;)V

    return-void
.end method

.method public bridge onGestureWakeUpdate(Lcom/szabh/smable3/entity/BleGestureWake;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onGestureWakeUpdate(Lcom/szabh/smable3/entity/BleGestureWake;)V

    return-void
.end method

.method public bridge onGoogleNaviInfoUpdate(Lcom/szabh/smable3/entity/BleGoogleNaviInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onGoogleNaviInfoUpdate(Lcom/szabh/smable3/entity/BleGoogleNaviInfo;)V

    return-void
.end method

.method public bridge onHIDState(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHIDState(I)V

    return-void
.end method

.method public bridge onHIDValueChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHIDValueChange(I)V

    return-void
.end method

.method public bridge onHRWarningSet(Lcom/szabh/smable3/entity/BleHrWarningSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHRWarningSet(Lcom/szabh/smable3/entity/BleHrWarningSettings;)V

    return-void
.end method

.method public bridge onHanBaoVibrationStateChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHanBaoVibrationStateChange(I)V

    return-void
.end method

.method public bridge onHighAntiAssistChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHighAntiAssistChange(I)V

    return-void
.end method

.method public bridge onHourSystemUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHourSystemUpdate(I)V

    return-void
.end method

.method public bridge onHydrationUpdate(Lcom/szabh/smable3/entity/BleHydrationSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onHydrationUpdate(Lcom/szabh/smable3/entity/BleHydrationSettings;)V

    return-void
.end method

.method public bridge onIPCExceptionUpdate(Lcom/szabh/smable3/entity/BleIPCException;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIPCExceptionUpdate(Lcom/szabh/smable3/entity/BleIPCException;)V

    return-void
.end method

.method public bridge onIPCOTAStateUpdate(Lcom/szabh/smable3/entity/BleIPCOTAState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIPCOTAStateUpdate(Lcom/szabh/smable3/entity/BleIPCOTAState;)V

    return-void
.end method

.method public bridge onIPCStateUpdate(Lcom/szabh/smable3/entity/BleIPCState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIPCStateUpdate(Lcom/szabh/smable3/entity/BleIPCState;)V

    return-void
.end method

.method public bridge onIPCStoresInfoUpdate(Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIPCStoresInfoUpdate(Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V

    return-void
.end method

.method public bridge onIPCWifiInfoUpdate(Lcom/szabh/smable3/entity/BleIPCWifiInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIPCWifiInfoUpdate(Lcom/szabh/smable3/entity/BleIPCWifiInfo;)V

    return-void
.end method

.method public bridge onIdentityCreate(ZLcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->onIdentityCreate(ZLcom/szabh/smable3/entity/BleDeviceInfo;)V

    return-void
.end method

.method public bridge onIdentityDelete(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIdentityDelete(Z)V

    return-void
.end method

.method public bridge onIdentityDeleteByDevice(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIdentityDeleteByDevice(Z)V

    return-void
.end method

.method public bridge onIncomingCallRingUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIncomingCallRingUpdate(I)V

    return-void
.end method

.method public bridge onIncomingCallStatus(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onIncomingCallStatus(I)V

    return-void
.end method

.method public bridge onLoveTapUpdate(Lcom/szabh/smable3/entity/BleLoveTap;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onLoveTapUpdate(Lcom/szabh/smable3/entity/BleLoveTap;)V

    return-void
.end method

.method public bridge onLoveTapUserDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onLoveTapUserDelete(I)V

    return-void
.end method

.method public bridge onLoveTapUserUpdate(Lcom/szabh/smable3/entity/BleLoveTapUser;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onLoveTapUserUpdate(Lcom/szabh/smable3/entity/BleLoveTapUser;)V

    return-void
.end method

.method public bridge onMeasurementUpdate(Lcom/szabh/smable3/entity/BleMeasurement;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMeasurementUpdate(Lcom/szabh/smable3/entity/BleMeasurement;)V

    return-void
.end method

.method public bridge onMedicationAlarmAdd(Lcom/szabh/smable3/entity/BleMedicationAlarm;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMedicationAlarmAdd(Lcom/szabh/smable3/entity/BleMedicationAlarm;)V

    return-void
.end method

.method public bridge onMedicationAlarmDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMedicationAlarmDelete(I)V

    return-void
.end method

.method public bridge onMedicationAlarmUpdate(Lcom/szabh/smable3/entity/BleMedicationAlarm;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMedicationAlarmUpdate(Lcom/szabh/smable3/entity/BleMedicationAlarm;)V

    return-void
.end method

.method public bridge onMedicationReminderDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMedicationReminderDelete(I)V

    return-void
.end method

.method public bridge onMedicationReminderUpdate(Lcom/szabh/smable3/entity/BleMedicationReminder;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMedicationReminderUpdate(Lcom/szabh/smable3/entity/BleMedicationReminder;)V

    return-void
.end method

.method public bridge onMeetingReminderAdd(Lcom/szabh/smable3/entity/BleMeetingReminder;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMeetingReminderAdd(Lcom/szabh/smable3/entity/BleMeetingReminder;)V

    return-void
.end method

.method public bridge onMeetingReminderDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMeetingReminderDelete(I)V

    return-void
.end method

.method public bridge onMeetingReminderUpdate(Lcom/szabh/smable3/entity/BleMeetingReminder;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMeetingReminderUpdate(Lcom/szabh/smable3/entity/BleMeetingReminder;)V

    return-void
.end method

.method public bridge onMultiFileTransferReadFile(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMultiFileTransferReadFile(I)V

    return-void
.end method

.method public bridge onMultiFileTransferResponse(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onMultiFileTransferResponse(I)V

    return-void
.end method

.method public bridge onNaviInfoUpdate(Lcom/szabh/smable3/entity/BleNaviInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onNaviInfoUpdate(Lcom/szabh/smable3/entity/BleNaviInfo;)V

    return-void
.end method

.method public bridge onNoDisturbUpdate(Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onNoDisturbUpdate(Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V

    return-void
.end method

.method public bridge onNotificationLightScreenSetUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onNotificationLightScreenSetUpdate(I)V

    return-void
.end method

.method public bridge onNotificationSettings2Update(Lcom/szabh/smable3/entity/BleNotificationSettings2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onNotificationSettings2Update(Lcom/szabh/smable3/entity/BleNotificationSettings2;)V

    return-void
.end method

.method public bridge onOTA(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onOTA(Z)V

    return-void
.end method

.method public bridge onPowerSaveModeState(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onPowerSaveModeState(I)V

    return-void
.end method

.method public bridge onPowerSaveModeStateChange(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onPowerSaveModeStateChange(I)V

    return-void
.end method

.method public bridge onQiblaSettingsUpdate()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onQiblaSettingsUpdate()V

    return-void
.end method

.method public bridge onReadAICoachGenerateBeforeInfo(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAICoachGenerateBeforeInfo(Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V

    return-void
.end method

.method public bridge onReadAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V

    return-void
.end method

.method public bridge onReadAICoachPlan(Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAICoachPlan(Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V

    return-void
.end method

.method public bridge onReadAICoachPlanV2(Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAICoachPlanV2(Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;)V

    return-void
.end method

.method public bridge onReadActivity(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleActivity;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadActivity(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadActivityDetail(Lcom/szabh/smable3/entity/BleActivityDetail;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadActivityDetail(Lcom/szabh/smable3/entity/BleActivityDetail;)V

    return-void
.end method

.method public bridge onReadAddressBook(Lcom/szabh/smable3/entity/BleAddressBook;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAddressBook(Lcom/szabh/smable3/entity/BleAddressBook;)V

    return-void
.end method

.method public bridge onReadAlarm(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAlarm(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadAlipayBindInfo(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlipayBindInfo;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAlipayBindInfo(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadAlipaySettings(Lcom/szabh/smable3/entity/BleAlipaySettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAlipaySettings(Lcom/szabh/smable3/entity/BleAlipaySettings;)V

    return-void
.end method

.method public bridge onReadAppApiVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAppApiVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadAppInfoList(Lcom/szabh/smable3/entity/BleAppInfoList;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAppInfoList(Lcom/szabh/smable3/entity/BleAppInfoList;)V

    return-void
.end method

.method public bridge onReadAppSportState(Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAppSportState(Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public bridge onReadAvgHeartRate(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAvgHeartRate;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadAvgHeartRate(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBAC(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBAC;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBAC(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBacCalibration(Lcom/szabh/smable3/entity/BleBacCalibration;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBacCalibration(Lcom/szabh/smable3/entity/BleBacCalibration;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public bridge onReadBacklight(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBacklight(I)V

    return-void
.end method

.method public bridge onReadBatteryUsage(Lcom/szabh/smable3/entity/BleBatteryUsage;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBatteryUsage(Lcom/szabh/smable3/entity/BleBatteryUsage;)V

    return-void
.end method

.method public bridge onReadBleAddress(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleAddress(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadBleGolfMapCacheInfo(Lcom/szabh/smable3/entity/BleGolfMapCacheInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleGolfMapCacheInfo(Lcom/szabh/smable3/entity/BleGolfMapCacheInfo;)V

    return-void
.end method

.method public bridge onReadBleGolfSportSwitch(Lcom/szabh/smable3/entity/BleGolfSportSwitch;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleGolfSportSwitch(Lcom/szabh/smable3/entity/BleGolfSportSwitch;)V

    return-void
.end method

.method public bridge onReadBleGolfWatchMapInfo(Lcom/szabh/smable3/entity/BleGolfWatchMapInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleGolfWatchMapInfo(Lcom/szabh/smable3/entity/BleGolfWatchMapInfo;)V

    return-void
.end method

.method public bridge onReadBleGolfWatchVersionInfo(Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleGolfWatchVersionInfo(Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;)V

    return-void
.end method

.method public bridge onReadBleHrv(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHrv;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleHrv(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBleLogText(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLogText;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBleLogText(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBloodGlucose(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodGlucose;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBloodGlucose(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBloodOxyGenSettings(Lcom/szabh/smable3/entity/BleBloodOxyGenSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBloodOxyGenSettings(Lcom/szabh/smable3/entity/BleBloodOxyGenSettings;)V

    return-void
.end method

.method public bridge onReadBloodOxygen(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodOxygen;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBloodOxygen(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBloodPressure(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodPressure;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBloodPressure(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadBloodPressureCalibration(Lcom/szabh/smable3/entity/BleBloodPressureCalibration;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBloodPressureCalibration(Lcom/szabh/smable3/entity/BleBloodPressureCalibration;)V

    return-void
.end method

.method public bridge onReadBodyStatus(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBodyStatus;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadBodyStatus(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadCPUserInfo(Lcom/szabh/smable3/entity/BleCPUserInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCPUserInfo(Lcom/szabh/smable3/entity/BleCPUserInfo;)V

    return-void
.end method

.method public bridge onReadCalibrationData(Lcom/szabh/smable3/entity/BleCalibrationData;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCalibrationData(Lcom/szabh/smable3/entity/BleCalibrationData;)V

    return-void
.end method

.method public bridge onReadCalorieIntake(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCalorieIntake;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCalorieIntake(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadCaloriesGoal(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCaloriesGoal(I)V

    return-void
.end method

.method public bridge onReadChatApp(Lcom/szabh/smable3/entity/BleChatApp;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadChatApp(Lcom/szabh/smable3/entity/BleChatApp;)V

    return-void
.end method

.method public bridge onReadCheckInEveryDay(Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCheckInEveryDay(Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V

    return-void
.end method

.method public bridge onReadClassicBluetoothState(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadClassicBluetoothState(I)V

    return-void
.end method

.method public bridge onReadCoachingIds(Lcom/szabh/smable3/entity/BleCoachingIds;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCoachingIds(Lcom/szabh/smable3/entity/BleCoachingIds;)V

    return-void
.end method

.method public bridge onReadCyWeeAlgorithm(Lcom/szabh/smable3/entity/BleCyWeeAlgorithm;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadCyWeeAlgorithm(Lcom/szabh/smable3/entity/BleCyWeeAlgorithm;)V

    return-void
.end method

.method public bridge onReadDailyPower(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePhysicalPower;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDailyPower(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadDateFormat(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDateFormat(I)V

    return-void
.end method

.method public bridge onReadDeviceFile(Lcom/szabh/smable3/entity/BleDeviceFile;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceFile(Lcom/szabh/smable3/entity/BleDeviceFile;)V

    return-void
.end method

.method public bridge onReadDeviceFileV2(Lcom/szabh/smable3/entity/BleDeviceFile2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceFileV2(Lcom/szabh/smable3/entity/BleDeviceFile2;)V

    return-void
.end method

.method public bridge onReadDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceInfo(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    return-void
.end method

.method public bridge onReadDeviceInfo2(Lcom/szabh/smable3/entity/BleDeviceInfo2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceInfo2(Lcom/szabh/smable3/entity/BleDeviceInfo2;)V

    return-void
.end method

.method public bridge onReadDeviceLanguages(Lcom/szabh/smable3/entity/BleDeviceLanguages;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceLanguages(Lcom/szabh/smable3/entity/BleDeviceLanguages;)V

    return-void
.end method

.method public bridge onReadDeviceLanguages2(Lcom/szabh/smable3/entity/BleDeviceLanguages2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceLanguages2(Lcom/szabh/smable3/entity/BleDeviceLanguages2;)V

    return-void
.end method

.method public bridge onReadDeviceUniqueDataSettings(Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDeviceUniqueDataSettings(Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;)V

    return-void
.end method

.method public bridge onReadDistanceGoal(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDistanceGoal(I)V

    return-void
.end method

.method public bridge onReadDoubleScreenSettings(Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDoubleScreenSettings(Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V

    return-void
.end method

.method public bridge onReadDrinkWater(Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadDrinkWater(Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V

    return-void
.end method

.method public bridge onReadECGRealtime(Lcom/szabh/smable3/entity/BleECGRealtime;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadECGRealtime(Lcom/szabh/smable3/entity/BleECGRealtime;)V

    return-void
.end method

.method public bridge onReadEarphoneAncSettings(Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneAncSettings(Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V

    return-void
.end method

.method public bridge onReadEarphoneCall(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneCall(I)V

    return-void
.end method

.method public bridge onReadEarphoneInfo(Lcom/szabh/smable3/entity/BleEarphoneInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneInfo(Lcom/szabh/smable3/entity/BleEarphoneInfo;)V

    return-void
.end method

.method public bridge onReadEarphoneKey(Lcom/szabh/smable3/entity/BleEarphoneKey;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneKey(Lcom/szabh/smable3/entity/BleEarphoneKey;)V

    return-void
.end method

.method public bridge onReadEarphonePower(Lcom/szabh/smable3/entity/BleEarphonePower;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphonePower(Lcom/szabh/smable3/entity/BleEarphonePower;)V

    return-void
.end method

.method public bridge onReadEarphoneSoundEffectsSettings(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneSoundEffectsSettings(Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V

    return-void
.end method

.method public bridge onReadEarphoneState(Lcom/szabh/smable3/entity/BleEarphoneState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEarphoneState(Lcom/szabh/smable3/entity/BleEarphoneState;)V

    return-void
.end method

.method public bridge onReadEcg(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEcg;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEcg(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadEcgSettings(Lcom/szabh/smable3/entity/BleEcgSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEcgSettings(Lcom/szabh/smable3/entity/BleEcgSettings;)V

    return-void
.end method

.method public bridge onReadEnergyRating(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEnergyRating;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadEnergyRating(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadFallSet(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadFallSet(I)V

    return-void
.end method

.method public bridge onReadFilePath(Lcom/szabh/smable3/entity/BleAppAudioBookList;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadFilePath(Lcom/szabh/smable3/entity/BleAppAudioBookList;)V

    return-void
.end method

.method public bridge onReadFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadFirmwareVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadFoodBalance(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleFoodBalance;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadFoodBalance(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadGestureWake(Lcom/szabh/smable3/entity/BleGestureWake;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGestureWake(Lcom/szabh/smable3/entity/BleGestureWake;)V

    return-void
.end method

.method public bridge onReadGestureWake2(Lcom/szabh/smable3/entity/BleGestureWake2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGestureWake2(Lcom/szabh/smable3/entity/BleGestureWake2;)V

    return-void
.end method

.method public bridge onReadGirlCareMonthly(Lcom/szabh/smable3/entity/BleGirlCareMonthly;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGirlCareMonthly(Lcom/szabh/smable3/entity/BleGirlCareMonthly;)V

    return-void
.end method

.method public bridge onReadGirlCareSettings(Lcom/szabh/smable3/entity/BleGirlCareSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGirlCareSettings(Lcom/szabh/smable3/entity/BleGirlCareSettings;)V

    return-void
.end method

.method public bridge onReadGoMoreSettings(Lcom/szabh/smable3/entity/BleGoMoreSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGoMoreSettings(Lcom/szabh/smable3/entity/BleGoMoreSettings;)V

    return-void
.end method

.method public bridge onReadGolfWatchScore(Lcom/szabh/smable3/entity/BleGolfWatchScore;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGolfWatchScore(Lcom/szabh/smable3/entity/BleGolfWatchScore;)V

    return-void
.end method

.method public bridge onReadGpsFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadGpsFirmwareVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadHanBaoSettings(Lcom/szabh/smable3/entity/BleHanBaoSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHanBaoSettings(Lcom/szabh/smable3/entity/BleHanBaoSettings;)V

    return-void
.end method

.method public bridge onReadHanBaoVibration(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHanBaoVibration;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHanBaoVibration(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadHeartRate(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHeartRate;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHeartRate(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadHeartRateZones(Lcom/szabh/smable3/entity/BleHeartRateZones;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHeartRateZones(Lcom/szabh/smable3/entity/BleHeartRateZones;)V

    return-void
.end method

.method public bridge onReadHourSystem(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHourSystem(I)V

    return-void
.end method

.method public bridge onReadHrMonitoringSettings(Lcom/szabh/smable3/entity/BleHrMonitoringSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHrMonitoringSettings(Lcom/szabh/smable3/entity/BleHrMonitoringSettings;)V

    return-void
.end method

.method public bridge onReadHrMonitoringSettingsV2(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHrMonitoringSettingsV2(I)V

    return-void
.end method

.method public bridge onReadHrvBaseLine(Lcom/szabh/smable3/entity/BleHrvBaseLine;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHrvBaseLine(Lcom/szabh/smable3/entity/BleHrvBaseLine;)V

    return-void
.end method

.method public bridge onReadHrvMonitoringSettings(Lcom/szabh/smable3/entity/BleHrvMonitoringSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHrvMonitoringSettings(Lcom/szabh/smable3/entity/BleHrvMonitoringSettings;)V

    return-void
.end method

.method public bridge onReadHydrationSettings(Lcom/szabh/smable3/entity/BleHydrationSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadHydrationSettings(Lcom/szabh/smable3/entity/BleHydrationSettings;)V

    return-void
.end method

.method public bridge onReadIPCInfo(Lcom/szabh/smable3/entity/BleIPCInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadIPCInfo(Lcom/szabh/smable3/entity/BleIPCInfo;)V

    return-void
.end method

.method public bridge onReadIPCState(Lcom/szabh/smable3/entity/BleIPCState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadIPCState(Lcom/szabh/smable3/entity/BleIPCState;)V

    return-void
.end method

.method public bridge onReadIPCStoresInfo(Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadIPCStoresInfo(Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V

    return-void
.end method

.method public bridge onReadIPCVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadIPCVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadIncomingCallRing(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadIncomingCallRing(I)V

    return-void
.end method

.method public bridge onReadLactateThreshold(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLactateThreshold;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadLactateThreshold(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadLanguage(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadLanguage(I)V

    return-void
.end method

.method public bridge onReadLanguagePackVersion(Lcom/szabh/smable3/entity/BleLanguagePackVersion;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadLanguagePackVersion(Lcom/szabh/smable3/entity/BleLanguagePackVersion;)V

    return-void
.end method

.method public bridge onReadLocation(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLocation;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadLocation(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadLoveTapUser(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLoveTapUser;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadLoveTapUser(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMatchRecord(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMatchRecord(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMatchRecord2(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord2;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMatchRecord2(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMatchRecord3(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord3;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMatchRecord3(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMedicationAlarm(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMedicationAlarm(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMedicationReminder(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationReminder;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMedicationReminder(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMeetingReminder(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMeetingReminder;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMeetingReminder(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMindStatus(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMindStatus;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMindStatus(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadMtkOtaMeta()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMtkOtaMeta()V

    return-void
.end method

.method public bridge onReadMultiFileTransfer(Lcom/szabh/smable3/entity/BleMapFileList;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadMultiFileTransfer(Lcom/szabh/smable3/entity/BleMapFileList;)V

    return-void
.end method

.method public bridge onReadNetworkFirmwareVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadNetworkFirmwareVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadNoDisturb(Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadNoDisturb(Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V

    return-void
.end method

.method public bridge onReadNotificationLightScreenSet(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadNotificationLightScreenSet(I)V

    return-void
.end method

.method public bridge onReadNotificationSettings2(Lcom/szabh/smable3/entity/BleNotificationSettings2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadNotificationSettings2(Lcom/szabh/smable3/entity/BleNotificationSettings2;)V

    return-void
.end method

.method public bridge onReadOfflineAsrSettings(Lcom/szabh/smable3/entity/BleOfflineAsrSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadOfflineAsrSettings(Lcom/szabh/smable3/entity/BleOfflineAsrSettings;)V

    return-void
.end method

.method public bridge onReadOngoingDialogue(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadOngoingDialogue(I)V

    return-void
.end method

.method public bridge onReadOptionalMapAuthInfo(Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadOptionalMapAuthInfo(Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;)V

    return-void
.end method

.method public bridge onReadPackageStatus(Lcom/szabh/smable3/entity/BlePackageStatus;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadPackageStatus(Lcom/szabh/smable3/entity/BlePackageStatus;)V

    return-void
.end method

.method public bridge onReadPower(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadPower(I)V

    return-void
.end method

.method public bridge onReadPower2(Lcom/szabh/smable3/entity/BlePower2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadPower2(Lcom/szabh/smable3/entity/BlePower2;)V

    return-void
.end method

.method public bridge onReadPressure(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePressure;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadPressure(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadPressureTimingMeasurement(Lcom/szabh/smable3/entity/BlePressureTimingMeasurement;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadPressureTimingMeasurement(Lcom/szabh/smable3/entity/BlePressureTimingMeasurement;)V

    return-void
.end method

.method public bridge onReadQiblaSettings(Lcom/szabh/smable3/entity/BleQiblaSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadQiblaSettings(Lcom/szabh/smable3/entity/BleQiblaSettings;)V

    return-void
.end method

.method public bridge onReadRecordControl(Lcom/szabh/smable3/entity/BleRecordControl;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRecordControl(Lcom/szabh/smable3/entity/BleRecordControl;)V

    return-void
.end method

.method public bridge onReadRelaxReminder(Lcom/szabh/smable3/entity/BleRelaxReminder;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRelaxReminder(Lcom/szabh/smable3/entity/BleRelaxReminder;)V

    return-void
.end method

.method public bridge onReadRespiratoryRate(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRespiratoryRate;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRespiratoryRate(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadRestingHeartRate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRestingHeartRate(I)V

    return-void
.end method

.method public bridge onReadRingVibrationSet(Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRingVibrationSet(Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V

    return-void
.end method

.method public bridge onReadRri(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRri;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadRri(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadSDCardInfo(Lcom/szabh/smable3/entity/BleSDCardInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSDCardInfo(Lcom/szabh/smable3/entity/BleSDCardInfo;)V

    return-void
.end method

.method public bridge onReadSGCameraSet(Lcom/szabh/smable3/entity/BleSGCameraSet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSGCameraSet(Lcom/szabh/smable3/entity/BleSGCameraSet;)V

    return-void
.end method

.method public bridge onReadSGKeySet(Lcom/szabh/smable3/entity/BleSGKeySet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSGKeySet(Lcom/szabh/smable3/entity/BleSGKeySet;)V

    return-void
.end method

.method public bridge onReadSGKeywordAwake(Lcom/szabh/smable3/entity/BleSGKeywordAwake;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSGKeywordAwake(Lcom/szabh/smable3/entity/BleSGKeywordAwake;)V

    return-void
.end method

.method public bridge onReadSGSet(Lcom/szabh/smable3/entity/BleSGSet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSGSet(Lcom/szabh/smable3/entity/BleSGSet;)V

    return-void
.end method

.method public bridge onReadSGSleepSet(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSGSleepSet(I)V

    return-void
.end method

.method public bridge onReadSOSSettings(Lcom/szabh/smable3/entity/BleSOSSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSOSSettings(Lcom/szabh/smable3/entity/BleSOSSettings;)V

    return-void
.end method

.method public bridge onReadScreenBrightnessSet(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadScreenBrightnessSet(I)V

    return-void
.end method

.method public bridge onReadSedentariness(Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSedentariness(Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V

    return-void
.end method

.method public bridge onReadSleep(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleep(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadSleepGoal(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepGoal(I)V

    return-void
.end method

.method public bridge onReadSleepMonitoringMode(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepMonitoringMode(I)V

    return-void
.end method

.method public bridge onReadSleepQuality(Lcom/szabh/smable3/entity/BleSleepQuality;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepQuality(Lcom/szabh/smable3/entity/BleSleepQuality;)V

    return-void
.end method

.method public bridge onReadSleepQualityScore(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepQualityScore(I)V

    return-void
.end method

.method public bridge onReadSleepRaw([B)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepRaw([B)V

    return-void
.end method

.method public bridge onReadSleepRespiratoryRate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepRespiratoryRate(I)V

    return-void
.end method

.method public bridge onReadSleepRiskLevel(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepRiskLevel(I)V

    return-void
.end method

.method public bridge onReadSleepSet(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSleepSet(I)V

    return-void
.end method

.method public bridge onReadSosCallLog(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSosCallLog;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSosCallLog(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadSosContact(Lcom/szabh/smable3/entity/BleSosContact;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSosContact(Lcom/szabh/smable3/entity/BleSosContact;)V

    return-void
.end method

.method public bridge onReadSportDurationGoal(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadSportDurationGoal(I)V

    return-void
.end method

.method public bridge onReadStandbyWatchFaceSet(Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadStandbyWatchFaceSet(Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V

    return-void
.end method

.method public bridge onReadStepGoal(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadStepGoal(I)V

    return-void
.end method

.method public bridge onReadStock(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleStock;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadStock(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadStock(Z)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadStock(Z)V

    return-void
.end method

.method public bridge onReadTemperature(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleTemperature;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadTemperature(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadTemperatureUnit(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadTemperatureUnit(I)V

    return-void
.end method

.method public bridge onReadTrainingStatus(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleTrainingStatus;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadTrainingStatus(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadTuyaKey(Lcom/szabh/smable3/entity/BleTuyaKey;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadTuyaKey(Lcom/szabh/smable3/entity/BleTuyaKey;)V

    return-void
.end method

.method public bridge onReadUiPackVersion(Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadUiPackVersion(Ljava/lang/String;)V

    return-void
.end method

.method public bridge onReadUnit(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadUnit(I)V

    return-void
.end method

.method public bridge onReadUserProfile(Lcom/szabh/smable3/entity/BleUserProfile;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadUserProfile(Lcom/szabh/smable3/entity/BleUserProfile;)V

    return-void
.end method

.method public bridge onReadVitalityValue(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleVitality;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadVitalityValue(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadVoiceControl(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadVoiceControl(I)V

    return-void
.end method

.method public bridge onReadWatchFaceId(Lcom/szabh/smable3/entity/BleWatchFaceId;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWatchFaceId(Lcom/szabh/smable3/entity/BleWatchFaceId;)V

    return-void
.end method

.method public bridge onReadWatchFaceIndex(Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWatchFaceIndex(Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V

    return-void
.end method

.method public bridge onReadWatchFaceMaxSize(Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWatchFaceMaxSize(Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V

    return-void
.end method

.method public bridge onReadWatchFaceSwitch(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWatchFaceSwitch(I)V

    return-void
.end method

.method public bridge onReadWatchPassword(Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWatchPassword(Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V

    return-void
.end method

.method public bridge onReadWearWayState(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWearWayState(I)V

    return-void
.end method

.method public bridge onReadWeatherRealTime(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWeatherRealTime(Z)V

    return-void
.end method

.method public bridge onReadWechatPaySettings(Lcom/szabh/smable3/entity/BleWechatPaySettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWechatPaySettings(Lcom/szabh/smable3/entity/BleWechatPaySettings;)V

    return-void
.end method

.method public bridge onReadWorkout(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorkout(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadWorkout2(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout2;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorkout2(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadWorkout3(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout3;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorkout3(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadWorkout4(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout4;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorkout4(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReadWorkout4Segmentation(Lcom/szabh/smable3/entity/BleWorkout4Segmentation;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorkout4Segmentation(Lcom/szabh/smable3/entity/BleWorkout4Segmentation;)V

    return-void
.end method

.method public bridge onReadWorldClock(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorldClock;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReadWorldClock(Ljava/util/List;)V

    return-void
.end method

.method public bridge onRealTimeMeasurement(Lcom/szabh/smable3/entity/BleRealTimeMeasurement;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onRealTimeMeasurement(Lcom/szabh/smable3/entity/BleRealTimeMeasurement;)V

    return-void
.end method

.method public bridge onReceiveCmTrace([BZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveCmTrace([BZ)V

    return-void
.end method

.method public bridge onReceiveFilePacket(Lcom/szabh/smable3/entity/BleReceiveFilePacket;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveFilePacket(Lcom/szabh/smable3/entity/BleReceiveFilePacket;)V

    return-void
.end method

.method public bridge onReceiveGSensorMotion(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorMotion;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveGSensorMotion(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveGSensorRaw(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorRaw;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveGSensorRaw(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveGSensorSHSY(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorSHSY;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveGSensorSHSY(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveHRRaw(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHRRaw;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveHRRaw(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveLocationGga(Lcom/szabh/smable3/entity/BleLocationGga;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveLocationGga(Lcom/szabh/smable3/entity/BleLocationGga;)V

    return-void
.end method

.method public bridge onReceiveLocationGsv(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLocationGsv;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveLocationGsv(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveMusicCommand(Lcom/szabh/smable3/entity/MusicCommand;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveMusicCommand(Lcom/szabh/smable3/entity/MusicCommand;)V

    return-void
.end method

.method public bridge onReceivePpgSHSY(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePpgSHSY;",
            ">;)V"
        }
    .end annotation

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceivePpgSHSY(Ljava/util/List;)V

    return-void
.end method

.method public bridge onReceiveRealtimeLog(Lcom/szabh/smable3/entity/BleRealtimeLog;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveRealtimeLog(Lcom/szabh/smable3/entity/BleRealtimeLog;)V

    return-void
.end method

.method public bridge onReceiveRecordPacket(Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onReceiveRecordPacket(Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void
.end method

.method public bridge onRecordControlUpdate(Lcom/szabh/smable3/entity/BleRecordControl;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onRecordControlUpdate(Lcom/szabh/smable3/entity/BleRecordControl;)V

    return-void
.end method

.method public bridge onRequestAgpsPrerequisite()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onRequestAgpsPrerequisite()V

    return-void
.end method

.method public bridge onRequestLocation(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onRequestLocation(I)V

    return-void
.end method

.method public bridge onRingVibrationSetUpdate(Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onRingVibrationSetUpdate(Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V

    return-void
.end method

.method public bridge onSDCardInfoUpdate(Lcom/szabh/smable3/entity/BleSDCardInfo;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSDCardInfoUpdate(Lcom/szabh/smable3/entity/BleSDCardInfo;)V

    return-void
.end method

.method public bridge onSGTestUpdate(Lcom/szabh/smable3/entity/BleSGTest;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSGTestUpdate(Lcom/szabh/smable3/entity/BleSGTest;)V

    return-void
.end method

.method public bridge onSGTtsUpdate(Lcom/szabh/smable3/entity/BleSGTts;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSGTtsUpdate(Lcom/szabh/smable3/entity/BleSGTts;)V

    return-void
.end method

.method public bridge onSOSSettingsUpdate(Lcom/szabh/smable3/entity/BleSOSSettings;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSOSSettingsUpdate(Lcom/szabh/smable3/entity/BleSOSSettings;)V

    return-void
.end method

.method public bridge onScreenBrightnessSetUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onScreenBrightnessSetUpdate(I)V

    return-void
.end method

.method public onSessionStateChange(Z)V
    .locals 11

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)I

    move-result v0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$FileType;

    sget-object v0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO$OXO1;->OXO1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x7f140006

    const/4 v4, 0x2

    if-eq p1, v0, :cond_1

    if-eq p1, v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    invoke-static {p1, v3, v2, v4, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object v5, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v6, Lcom/szabh/smable3/BleKey;->LANGUAGE_FILE:Lcom/szabh/smable3/BleKey;

    new-instance v7, Ljava/io/File;

    sget-object p1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {p1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMLatestLanguage$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v7, p1, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lcom/szabh/smable3/component/BaseBleConnector;->sendStream$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Ljava/io/File;IILjava/lang/Object;)Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    invoke-static {p1, v3, v2, v4, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/ii1IXIIII;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/ii1IXIIII;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    const-wide/16 v2, 0x2710

    invoke-virtual {p1, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_2
    :goto_0
    return-void
.end method

.method public bridge onSleepNotifyUpdate(Lcom/szabh/smable3/entity/BleSleepNotify;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSleepNotifyUpdate(Lcom/szabh/smable3/entity/BleSleepNotify;)V

    return-void
.end method

.method public bridge onSosContactUpdate(Lcom/szabh/smable3/entity/BleSosContact;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSosContactUpdate(Lcom/szabh/smable3/entity/BleSosContact;)V

    return-void
.end method

.method public bridge onSportEndNotifyUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onSportEndNotifyUpdate(I)V

    return-void
.end method

.method public bridge onStandbyWatchFaceSetUpdate(Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onStandbyWatchFaceSetUpdate(Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V

    return-void
.end method

.method public bridge onStepGoalUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onStepGoalUpdate(I)V

    return-void
.end method

.method public bridge onStockDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onStockDelete(I)V

    return-void
.end method

.method public onStreamProgress(ZIIILcom/szabh/smable3/BleKey;)V
    .locals 0

    const-string p2, "bleKey"

    invoke-static {p5, p2}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    int-to-float p2, p4

    int-to-float p5, p3

    div-float/2addr p2, p5

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgressDecimalPlaces(F)V

    if-ne p3, p4, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result p2

    if-ge p1, p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)I

    move-result p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    add-int/lit8 p1, p1, 0x1

    invoke-static {p2, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    new-instance p3, Lcom/android/mltcode/paycertificationapi/XO1I0i1;

    invoke-direct {p3, p2}, Lcom/android/mltcode/paycertificationapi/XO1I0i1;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;)V

    const-wide/16 p4, 0x7d0

    invoke-virtual {p1, p3, p4, p5}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;->upgradeDone()V

    :cond_1
    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity$XIi00iiXO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeRSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    sget-object p3, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {p3}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x2

    const/4 p5, 0x0

    invoke-static {p1, p3, p2, p4, p5}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    return-void
.end method

.method public bridge onSyncData(ILcom/szabh/smable3/BleKey;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->onSyncData(ILcom/szabh/smable3/BleKey;)V

    return-void
.end method

.method public bridge onTimeUpdate()V
    .locals 0

    invoke-super {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->onTimeUpdate()V

    return-void
.end method

.method public bridge onUpdateAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V

    return-void
.end method

.method public bridge onUpdateAICoachLeaveDay(Lcom/szabh/smable3/entity/BleLeaveDay;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateAICoachLeaveDay(Lcom/szabh/smable3/entity/BleLeaveDay;)V

    return-void
.end method

.method public bridge onUpdateAppSportState(Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateAppSportState(Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public bridge onUpdateBAC(Lcom/szabh/smable3/entity/BleBAC;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateBAC(Lcom/szabh/smable3/entity/BleBAC;)V

    return-void
.end method

.method public bridge onUpdateBloodPressure(Lcom/szabh/smable3/entity/BleBloodPressure;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateBloodPressure(Lcom/szabh/smable3/entity/BleBloodPressure;)V

    return-void
.end method

.method public bridge onUpdateHeartRate(Lcom/szabh/smable3/entity/BleHeartRate;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateHeartRate(Lcom/szabh/smable3/entity/BleHeartRate;)V

    return-void
.end method

.method public bridge onUpdateTemperature(Lcom/szabh/smable3/entity/BleTemperature;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateTemperature(Lcom/szabh/smable3/entity/BleTemperature;)V

    return-void
.end method

.method public bridge onUpdateWatchFaceSwitch(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUpdateWatchFaceSwitch(Z)V

    return-void
.end method

.method public bridge onUserProfileUpdate(Lcom/szabh/smable3/entity/BleUserProfile;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onUserProfileUpdate(Lcom/szabh/smable3/entity/BleUserProfile;)V

    return-void
.end method

.method public bridge onVibrationUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onVibrationUpdate(I)V

    return-void
.end method

.method public bridge onVibrationUpdateV2(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onVibrationUpdateV2(I)V

    return-void
.end method

.method public bridge onWatchFaceIdUpdate(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWatchFaceIdUpdate(Z)V

    return-void
.end method

.method public bridge onWatchFaceIndexCreate(Z)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWatchFaceIndexCreate(Z)V

    return-void
.end method

.method public bridge onWatchFaceIndexUpdate(Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWatchFaceIndexUpdate(Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V

    return-void
.end method

.method public bridge onWatchPasswordUpdate(Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWatchPasswordUpdate(Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V

    return-void
.end method

.method public bridge onWearWayUpdate(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWearWayUpdate(I)V

    return-void
.end method

.method public bridge onWorldClockDelete(I)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onWorldClockDelete(I)V

    return-void
.end method

.method public bridge onXMLYBandSetUpdate(Lcom/szabh/smable3/entity/BleXMLYBandSet;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onXMLYBandSetUpdate(Lcom/szabh/smable3/entity/BleXMLYBandSet;)V

    return-void
.end method

.method public bridge onXModem(B)V
    .locals 0

    invoke-super {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->onXModem(B)V

    return-void
.end method
