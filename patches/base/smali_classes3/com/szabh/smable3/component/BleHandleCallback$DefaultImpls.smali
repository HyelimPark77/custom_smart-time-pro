.class public final Lcom/szabh/smable3/component/BleHandleCallback$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/szabh/smable3/component/BleHandleCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation


# direct methods
.method public static onAICoachGeneratePlanUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAICoachGeneratePlanUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onAICommandUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICommand;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICommand;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAICommandUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICommand;)V

    return-void
.end method

.method public static onActivityRecognitionUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onActivityRecognitionUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onAlarmAdd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlarm;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "alarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAlarmAdd$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlarm;)V

    return-void
.end method

.method public static onAlarmDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAlarmDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onAlarmUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlarm;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "alarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAlarmUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlarm;)V

    return-void
.end method

.method public static onAppOpUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppOp;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAppOp;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "appOp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAppOpUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppOp;)V

    return-void
.end method

.method public static onAppSportDataResponse(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onAppSportDataResponse$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onBWNaviInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBWNaviInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBWNaviInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "naviInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBWNaviInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBWNaviInfo;)V

    return-void
.end method

.method public static onBacklightUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBacklightUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onBandKeyUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBandKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBandKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBandKeyUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBandKey;)V

    return-void
.end method

.method public static onBleGolfScore(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfScore;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfScore;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBleGolfScore$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfScore;)V

    return-void
.end method

.method public static onBleThirdPartyDataUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleThirdPartyData;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleThirdPartyData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "thirdPartyData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBleThirdPartyDataUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleThirdPartyData;)V

    return-void
.end method

.method public static onBleVideoCallInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleVideoCallInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleVideoCallInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onBleVideoCallInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleVideoCallInfo;)V

    return-void
.end method

.method public static onCPChatUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPChat;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPChat;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "chat"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCPChatUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPChat;)V

    return-void
.end method

.method public static onCPGiftsInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPGiftsInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPGiftsInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCPGiftsInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPGiftsInfo;)V

    return-void
.end method

.method public static onCPListenerUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPListener;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPListener;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCPListenerUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPListener;)V

    return-void
.end method

.method public static onCPMissYouUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPMissYou;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPMissYou;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "you"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCPMissYouUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPMissYou;)V

    return-void
.end method

.method public static onCPTodoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPTodo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPTodo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "todo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCPTodoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPTodo;)V

    return-void
.end method

.method public static onCaloriesGoalUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCaloriesGoalUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onCameraResponse(Lcom/szabh/smable3/component/BleHandleCallback;ZI)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCameraResponse$jd(Lcom/szabh/smable3/component/BleHandleCallback;ZI)V

    return-void
.end method

.method public static onCameraStateChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCameraStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onChatAppUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatApp;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleChatApp;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onChatAppUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatApp;)V

    return-void
.end method

.method public static onChatMessageUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatMessage;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleChatMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onChatMessageUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatMessage;)V

    return-void
.end method

.method public static onChatVoiceUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatVoice;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleChatVoice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "voice"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onChatVoiceUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatVoice;)V

    return-void
.end method

.method public static onCheckInEveryDayUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCheckInEveryDay;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "everyDay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCheckInEveryDayUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V

    return-void
.end method

.method public static onClassicBluetoothStateChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onClassicBluetoothStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onCommandReply(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Z)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2, p3}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCommandReply$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Z)V

    return-void
.end method

.method public static onCommandSendTimeout(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onCommandSendTimeout$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public static onContactUsStateChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onContactUsStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onDeleteAICoachPlan(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeleteAICoachPlan$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onDeleteFileResponse(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeleteFileResponse$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onDeviceConnected(Lcom/szabh/smable3/component/BleHandleCallback;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Landroid/bluetooth/BluetoothDevice;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceConnected$jd(Lcom/szabh/smable3/component/BleHandleCallback;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method public static onDeviceConnecting(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceConnecting$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onDeviceFileUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceFile;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceFileUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile;)V

    return-void
.end method

.method public static onDeviceOpUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceOpUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onDeviceRequestAGpsFile(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceRequestAGpsFile$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onDeviceSMSQuickReply(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSMSQuickReply;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSMSQuickReply;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "smsQuickReply"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceSMSQuickReply$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSMSQuickReply;)V

    return-void
.end method

.method public static onDeviceSportDataUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceSportData;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceSportData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceSportData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDeviceSportDataUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceSportData;)V

    return-void
.end method

.method public static onDistanceGoalUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDistanceGoalUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onDoubleScreenSettingsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDoubleScreenSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "doubleScreenSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDoubleScreenSettingsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V

    return-void
.end method

.method public static onDrinkWaterUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onDrinkWaterUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V

    return-void
.end method

.method public static onEarphoneAncSettingsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneAncSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onEarphoneAncSettingsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V

    return-void
.end method

.method public static onEarphoneCallUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onEarphoneCallUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onEarphoneKeyUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onEarphoneKeyUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneKey;)V

    return-void
.end method

.method public static onEarphoneSoundEffectsSettingsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneSoundEffectsSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onEarphoneSoundEffectsSettingsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V

    return-void
.end method

.method public static onEarphoneStateUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onEarphoneStateUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneState;)V

    return-void
.end method

.method public static onFactoryTestUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleFactoryTest;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleFactoryTest;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "factoryTest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFactoryTestUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleFactoryTest;)V

    return-void
.end method

.method public static onFallSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFallSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onFindEarphoneUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleFindEarphone;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleFindEarphone;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "findEarphone"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFindEarphoneUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleFindEarphone;)V

    return-void
.end method

.method public static onFindPhone(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFindPhone$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onFindWatchUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFindWatchUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onFollowSystemDateFormat(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFollowSystemDateFormat$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onFollowSystemHour(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFollowSystemHour$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onFollowSystemLanguage(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onFollowSystemLanguage$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onGameControlUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGameControl;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGameControl;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gameControl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onGameControlUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGameControl;)V

    return-void
.end method

.method public static onGestureWake2Update(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGestureWake2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gestureWake2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onGestureWake2Update$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake2;)V

    return-void
.end method

.method public static onGestureWakeUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGestureWake;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gestureWake"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onGestureWakeUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake;)V

    return-void
.end method

.method public static onGoogleNaviInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGoogleNaviInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGoogleNaviInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "naviInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onGoogleNaviInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGoogleNaviInfo;)V

    return-void
.end method

.method public static onHIDState(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHIDState$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onHIDValueChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHIDValueChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onHRWarningSet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrWarningSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHrWarningSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "set"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHRWarningSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrWarningSettings;)V

    return-void
.end method

.method public static onHanBaoVibrationStateChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHanBaoVibrationStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onHighAntiAssistChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHighAntiAssistChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onHourSystemUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHourSystemUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onHydrationUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHydrationSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHydrationSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onHydrationUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHydrationSettings;)V

    return-void
.end method

.method public static onIPCExceptionUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCException;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCException;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIPCExceptionUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCException;)V

    return-void
.end method

.method public static onIPCOTAStateUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCOTAState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCOTAState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIPCOTAStateUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCOTAState;)V

    return-void
.end method

.method public static onIPCStateUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIPCStateUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCState;)V

    return-void
.end method

.method public static onIPCStoresInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCStoresInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIPCStoresInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V

    return-void
.end method

.method public static onIPCWifiInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCWifiInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCWifiInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIPCWifiInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCWifiInfo;)V

    return-void
.end method

.method public static onIdentityCreate(Lcom/szabh/smable3/component/BleHandleCallback;ZLcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIdentityCreate$jd(Lcom/szabh/smable3/component/BleHandleCallback;ZLcom/szabh/smable3/entity/BleDeviceInfo;)V

    return-void
.end method

.method public static synthetic onIdentityCreate$default(Lcom/szabh/smable3/component/BleHandleCallback;ZLcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/szabh/smable3/component/BleHandleCallback;->onIdentityCreate$default(Lcom/szabh/smable3/component/BleHandleCallback;ZLcom/szabh/smable3/entity/BleDeviceInfo;ILjava/lang/Object;)V

    return-void
.end method

.method public static onIdentityDelete(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIdentityDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onIdentityDeleteByDevice(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIdentityDeleteByDevice$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onIncomingCallRingUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIncomingCallRingUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onIncomingCallStatus(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onIncomingCallStatus$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onLoveTapUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLoveTap;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleLoveTap;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "loveTap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onLoveTapUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLoveTap;)V

    return-void
.end method

.method public static onLoveTapUserDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onLoveTapUserDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onLoveTapUserUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLoveTapUser;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleLoveTapUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "loveTapUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onLoveTapUserUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLoveTapUser;)V

    return-void
.end method

.method public static onMeasurementUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeasurement;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMeasurement;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "measurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMeasurementUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeasurement;)V

    return-void
.end method

.method public static onMedicationAlarmAdd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationAlarm;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMedicationAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "medicationAlarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMedicationAlarmAdd$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationAlarm;)V

    return-void
.end method

.method public static onMedicationAlarmDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMedicationAlarmDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onMedicationAlarmUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationAlarm;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMedicationAlarm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "medicationAlarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMedicationAlarmUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationAlarm;)V

    return-void
.end method

.method public static onMedicationReminderDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMedicationReminderDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onMedicationReminderUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationReminder;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMedicationReminder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "medicationReminder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMedicationReminderUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMedicationReminder;)V

    return-void
.end method

.method public static onMeetingReminderAdd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeetingReminder;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMeetingReminder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "meetingReminder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMeetingReminderAdd$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeetingReminder;)V

    return-void
.end method

.method public static onMeetingReminderDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMeetingReminderDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onMeetingReminderUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeetingReminder;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMeetingReminder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "meetingReminder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMeetingReminderUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMeetingReminder;)V

    return-void
.end method

.method public static onMultiFileTransferReadFile(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMultiFileTransferReadFile$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onMultiFileTransferResponse(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onMultiFileTransferResponse$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onNaviInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNaviInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleNaviInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "naviInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onNaviInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNaviInfo;)V

    return-void
.end method

.method public static onNoDisturbUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleNoDisturbSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "noDisturbSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onNoDisturbUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V

    return-void
.end method

.method public static onNotificationLightScreenSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onNotificationLightScreenSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onNotificationSettings2Update(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNotificationSettings2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleNotificationSettings2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "notificationSettings2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onNotificationSettings2Update$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNotificationSettings2;)V

    return-void
.end method

.method public static onOTA(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onOTA$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onPowerSaveModeState(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onPowerSaveModeState$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onPowerSaveModeStateChange(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onPowerSaveModeStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onQiblaSettingsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onQiblaSettingsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onReadAICoachGenerateBeforeInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachBeforePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAICoachGenerateBeforeInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlan;)V

    return-void
.end method

.method public static onReadAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAICoachGenerateBeforeInfoV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V

    return-void
.end method

.method public static onReadAICoachPlan(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "plan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAICoachPlan$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachGeneratePlan;)V

    return-void
.end method

.method public static onReadAICoachPlanV2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "plan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAICoachPlanV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachGeneratePlanV2;)V

    return-void
.end method

.method public static onReadActivity(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleActivity;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "activities"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadActivity$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadActivityDetail(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleActivityDetail;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleActivityDetail;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "activityDetail"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadActivityDetail$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleActivityDetail;)V

    return-void
.end method

.method public static onReadAddressBook(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAddressBook;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAddressBook;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAddressBook$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAddressBook;)V

    return-void
.end method

.method public static onReadAlarm(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlarm;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "alarms"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAlarm$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadAlipayBindInfo(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAlipayBindInfo;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "alipayBindInfos"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAlipayBindInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadAlipaySettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlipaySettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAlipaySettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "alipaySettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAlipaySettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAlipaySettings;)V

    return-void
.end method

.method public static onReadAppApiVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAppApiVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadAppInfoList(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppInfoList;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAppInfoList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "appInfoList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAppInfoList$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppInfoList;)V

    return-void
.end method

.method public static onReadAppSportState(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAppSportState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "appSportState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAppSportState$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public static onReadAvgHeartRate(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleAvgHeartRate;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "heartRates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadAvgHeartRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBAC(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBAC;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bacs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBAC$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBacCalibration(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBacCalibration;Lcom/szabh/smable3/BleKeyFlag;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBacCalibration;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKeyFlag;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleKeyFlag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBacCalibration$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBacCalibration;Lcom/szabh/smable3/BleKeyFlag;)V

    return-void
.end method

.method public static onReadBacklight(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBacklight$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadBatteryUsage(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBatteryUsage;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBatteryUsage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "batteryUsage"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBatteryUsage$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBatteryUsage;)V

    return-void
.end method

.method public static onReadBleAddress(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleAddress$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadBleGolfMapCacheInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfMapCacheInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfMapCacheInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleGolfMapCacheInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleGolfMapCacheInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfMapCacheInfo;)V

    return-void
.end method

.method public static onReadBleGolfSportSwitch(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfSportSwitch;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfSportSwitch;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleGolfSportSwitch"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleGolfSportSwitch$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfSportSwitch;)V

    return-void
.end method

.method public static onReadBleGolfWatchMapInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchMapInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfWatchMapInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleGolfWatchMapInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleGolfWatchMapInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchMapInfo;)V

    return-void
.end method

.method public static onReadBleGolfWatchVersionInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleGolfWatchVersionInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleGolfWatchVersionInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchVersionInfo;)V

    return-void
.end method

.method public static onReadBleHrv(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHrv;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hrv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleHrv$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBleLogText(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLogText;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "logs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBleLogText$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBloodGlucose(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodGlucose;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodGlucoses"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBloodGlucose$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBloodOxyGenSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodOxyGenSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBloodOxyGenSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodOxyGenSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBloodOxyGenSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodOxyGenSettings;)V

    return-void
.end method

.method public static onReadBloodOxygen(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodOxygen;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodOxygen"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBloodOxygen$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBloodPressure(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBloodPressure;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodPressures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBloodPressure$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadBloodPressureCalibration(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodPressureCalibration;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBloodPressureCalibration;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodPressureCalibration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBloodPressureCalibration$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodPressureCalibration;)V

    return-void
.end method

.method public static onReadBodyStatus(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleBodyStatus;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bodyData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadBodyStatus$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadCPUserInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPUserInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCPUserInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCPUserInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCPUserInfo;)V

    return-void
.end method

.method public static onReadCalibrationData(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCalibrationData;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCalibrationData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "calibrationData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCalibrationData$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCalibrationData;)V

    return-void
.end method

.method public static onReadCalorieIntake(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCalorieIntake;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "calorieIntakes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCalorieIntake$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadCaloriesGoal(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCaloriesGoal$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadChatApp(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatApp;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleChatApp;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "app"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadChatApp$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleChatApp;)V

    return-void
.end method

.method public static onReadCheckInEveryDay(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCheckInEveryDay;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "everyDay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCheckInEveryDay$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCheckInEveryDay;)V

    return-void
.end method

.method public static onReadClassicBluetoothState(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadClassicBluetoothState$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadCoachingIds(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCoachingIds;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCoachingIds;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleCoachingIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCoachingIds$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCoachingIds;)V

    return-void
.end method

.method public static onReadCyWeeAlgorithm(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCyWeeAlgorithm;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleCyWeeAlgorithm;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleCyWeeAlgorithm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadCyWeeAlgorithm$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleCyWeeAlgorithm;)V

    return-void
.end method

.method public static onReadDailyPower(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePhysicalPower;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "powers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDailyPower$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadDateFormat(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDateFormat$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadDeviceFile(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceFile;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceFile$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile;)V

    return-void
.end method

.method public static onReadDeviceFileV2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceFile2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceFile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceFileV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceFile2;)V

    return-void
.end method

.method public static onReadDeviceInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    return-void
.end method

.method public static onReadDeviceInfo2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceInfo2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceInfo2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceInfo2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceInfo2;)V

    return-void
.end method

.method public static onReadDeviceLanguages(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceLanguages;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceLanguages;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceLanguages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceLanguages$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceLanguages;)V

    return-void
.end method

.method public static onReadDeviceLanguages2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceLanguages2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceLanguages2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceLanguages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceLanguages2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceLanguages2;)V

    return-void
.end method

.method public static onReadDeviceUniqueDataSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "deviceUniqueDataSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDeviceUniqueDataSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDeviceUniqueDataSettings;)V

    return-void
.end method

.method public static onReadDistanceGoal(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDistanceGoal$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadDoubleScreenSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDoubleScreenSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "doubleScreenSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDoubleScreenSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDoubleScreenSettings;)V

    return-void
.end method

.method public static onReadDrinkWater(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleDrinkWaterSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "drinkWaterSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadDrinkWater$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleDrinkWaterSettings;)V

    return-void
.end method

.method public static onReadECGRealtime(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleECGRealtime;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleECGRealtime;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ecgRealtime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadECGRealtime$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleECGRealtime;)V

    return-void
.end method

.method public static onReadEarphoneAncSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneAncSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneAncSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneAncSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneAncSettings;)V

    return-void
.end method

.method public static onReadEarphoneCall(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneCall$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadEarphoneInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneInfo;)V

    return-void
.end method

.method public static onReadEarphoneKey(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneKey$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneKey;)V

    return-void
.end method

.method public static onReadEarphonePower(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphonePower;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphonePower;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphonePower"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphonePower$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphonePower;)V

    return-void
.end method

.method public static onReadEarphoneSoundEffectsSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneSoundEffectsSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneSoundEffectsSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneSoundEffectsSettings;)V

    return-void
.end method

.method public static onReadEarphoneState(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEarphoneState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "earphoneState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEarphoneState$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEarphoneState;)V

    return-void
.end method

.method public static onReadEcg(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEcg;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ecgs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEcg$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadEcgSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEcgSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleEcgSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ecgSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEcgSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleEcgSettings;)V

    return-void
.end method

.method public static onReadEnergyRating(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleEnergyRating;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "energyRating"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadEnergyRating$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadFallSet(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadFallSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadFilePath(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppAudioBookList;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAppAudioBookList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "filePath"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadFilePath$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppAudioBookList;)V

    return-void
.end method

.method public static onReadFirmwareVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadFirmwareVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadFoodBalance(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleFoodBalance;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "foodBalances"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadFoodBalance$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadGestureWake(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGestureWake;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gestureWake"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGestureWake$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake;)V

    return-void
.end method

.method public static onReadGestureWake2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGestureWake2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gestureWake2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGestureWake2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGestureWake2;)V

    return-void
.end method

.method public static onReadGirlCareMonthly(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGirlCareMonthly;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGirlCareMonthly;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "girlCareMonthly"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGirlCareMonthly$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGirlCareMonthly;)V

    return-void
.end method

.method public static onReadGirlCareSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGirlCareSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGirlCareSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "girlCareSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGirlCareSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGirlCareSettings;)V

    return-void
.end method

.method public static onReadGoMoreSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGoMoreSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGoMoreSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "goMoreSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGoMoreSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGoMoreSettings;)V

    return-void
.end method

.method public static onReadGolfWatchScore(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchScore;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleGolfWatchScore;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchScore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGolfWatchScore$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleGolfWatchScore;)V

    return-void
.end method

.method public static onReadGpsFirmwareVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadGpsFirmwareVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadHanBaoSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHanBaoSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHanBaoSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hanBaoSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHanBaoSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHanBaoSettings;)V

    return-void
.end method

.method public static onReadHanBaoVibration(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHanBaoVibration;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hanBaoVibrations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHanBaoVibration$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadHeartRate(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHeartRate;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "heartRates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHeartRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadHeartRateZones(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHeartRateZones;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHeartRateZones;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bmp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHeartRateZones$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHeartRateZones;)V

    return-void
.end method

.method public static onReadHourSystem(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHourSystem$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadHrMonitoringSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHrMonitoringSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hrMonitoringSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHrMonitoringSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrMonitoringSettings;)V

    return-void
.end method

.method public static onReadHrMonitoringSettingsV2(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHrMonitoringSettingsV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadHrvBaseLine(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrvBaseLine;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHrvBaseLine;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "mBleHrvBaseLine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHrvBaseLine$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrvBaseLine;)V

    return-void
.end method

.method public static onReadHrvMonitoringSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrvMonitoringSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHrvMonitoringSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hrvMonitoringSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHrvMonitoringSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHrvMonitoringSettings;)V

    return-void
.end method

.method public static onReadHydrationSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHydrationSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHydrationSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hydrationSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadHydrationSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHydrationSettings;)V

    return-void
.end method

.method public static onReadIPCInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadIPCInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCInfo;)V

    return-void
.end method

.method public static onReadIPCState(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadIPCState$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCState;)V

    return-void
.end method

.method public static onReadIPCStoresInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleIPCStoresInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadIPCStoresInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleIPCStoresInfo;)V

    return-void
.end method

.method public static onReadIPCVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadIPCVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadIncomingCallRing(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadIncomingCallRing$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadLactateThreshold(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLactateThreshold;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "lactateThreshold"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadLactateThreshold$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadLanguage(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadLanguage$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadLanguagePackVersion(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLanguagePackVersion;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleLanguagePackVersion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadLanguagePackVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLanguagePackVersion;)V

    return-void
.end method

.method public static onReadLocation(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLocation;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadLocation$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadLoveTapUser(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLoveTapUser;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "loveTapUsers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadLoveTapUser$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMatchRecord(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "matchRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMatchRecord$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMatchRecord2(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord2;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "matchRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMatchRecord2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMatchRecord3(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMatchRecord3;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "matchRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMatchRecord3$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMedicationAlarm(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationAlarm;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "medicationAlarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMedicationAlarm$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMedicationReminder(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMedicationReminder;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "medicationReminders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMedicationReminder$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMeetingReminder(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMeetingReminder;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "meetingReminders"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMeetingReminder$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMindStatus(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleMindStatus;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "feelingData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMindStatus$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadMtkOtaMeta(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMtkOtaMeta$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onReadMultiFileTransfer(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMapFileList;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleMapFileList;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadMultiFileTransfer$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleMapFileList;)V

    return-void
.end method

.method public static onReadNetworkFirmwareVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadNetworkFirmwareVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadNoDisturb(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleNoDisturbSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "noDisturbSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadNoDisturb$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNoDisturbSettings;)V

    return-void
.end method

.method public static onReadNotificationLightScreenSet(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadNotificationLightScreenSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadNotificationSettings2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNotificationSettings2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleNotificationSettings2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "notificationSettings2"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadNotificationSettings2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleNotificationSettings2;)V

    return-void
.end method

.method public static onReadOfflineAsrSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleOfflineAsrSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleOfflineAsrSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "settings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadOfflineAsrSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleOfflineAsrSettings;)V

    return-void
.end method

.method public static onReadOngoingDialogue(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadOngoingDialogue$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadOptionalMapAuthInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "optionalMapAuthInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadOptionalMapAuthInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleOptionalMapAuthInfo;)V

    return-void
.end method

.method public static onReadPackageStatus(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePackageStatus;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BlePackageStatus;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "packageStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadPackageStatus$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePackageStatus;)V

    return-void
.end method

.method public static onReadPower(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadPower$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadPower2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePower2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BlePower2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "power"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadPower2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePower2;)V

    return-void
.end method

.method public static onReadPressure(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePressure;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "pressures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadPressure$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadPressureTimingMeasurement(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePressureTimingMeasurement;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BlePressureTimingMeasurement;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "pressureTimingMeasurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadPressureTimingMeasurement$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BlePressureTimingMeasurement;)V

    return-void
.end method

.method public static onReadQiblaSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleQiblaSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleQiblaSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "qiblaSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadQiblaSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleQiblaSettings;)V

    return-void
.end method

.method public static onReadRecordControl(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordControl;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRecordControl;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "control"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRecordControl$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordControl;)V

    return-void
.end method

.method public static onReadRelaxReminder(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRelaxReminder;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRelaxReminder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "reminder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRelaxReminder$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRelaxReminder;)V

    return-void
.end method

.method public static onReadRespiratoryRate(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRespiratoryRate;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "rate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRespiratoryRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadRestingHeartRate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRestingHeartRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadRingVibrationSet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRingVibrationSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ringVibrationSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRingVibrationSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V

    return-void
.end method

.method public static onReadRri(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleRri;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "rris"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadRri$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadSDCardInfo(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSDCardInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSDCardInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sdCardInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSDCardInfo$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSDCardInfo;)V

    return-void
.end method

.method public static onReadSGCameraSet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGCameraSet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGCameraSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "cameraSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSGCameraSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGCameraSet;)V

    return-void
.end method

.method public static onReadSGKeySet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGKeySet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGKeySet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "set"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSGKeySet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGKeySet;)V

    return-void
.end method

.method public static onReadSGKeywordAwake(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGKeywordAwake;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGKeywordAwake;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "keyword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSGKeywordAwake$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGKeywordAwake;)V

    return-void
.end method

.method public static onReadSGSet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGSet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "set"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSGSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGSet;)V

    return-void
.end method

.method public static onReadSGSleepSet(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSGSleepSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSOSSettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSOSSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSOSSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sosSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSOSSettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSOSSettings;)V

    return-void
.end method

.method public static onReadScreenBrightnessSet(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadScreenBrightnessSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSedentariness(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSedentarinessSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sedentarinessSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSedentariness$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSedentarinessSettings;)V

    return-void
.end method

.method public static onReadSleep(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSleep;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sleeps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleep$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadSleepGoal(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepGoal$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSleepMonitoringMode(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepMonitoringMode$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSleepQuality(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSleepQuality;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSleepQuality;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sleepQuality"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepQuality$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSleepQuality;)V

    return-void
.end method

.method public static onReadSleepQualityScore(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepQualityScore$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSleepRaw(Lcom/szabh/smable3/component/BleHandleCallback;[B)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sleepRawData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepRaw$jd(Lcom/szabh/smable3/component/BleHandleCallback;[B)V

    return-void
.end method

.method public static onReadSleepRespiratoryRate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepRespiratoryRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSleepRiskLevel(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepRiskLevel$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSleepSet(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSleepSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadSosCallLog(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleSosCallLog;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "callLogs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSosCallLog$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadSosContact(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSosContact;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSosContact;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sosContact"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSosContact$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSosContact;)V

    return-void
.end method

.method public static onReadSportDurationGoal(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadSportDurationGoal$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadStandbyWatchFaceSet(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "standbyWatchFaceSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadStandbyWatchFaceSet$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V

    return-void
.end method

.method public static onReadStepGoal(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadStepGoal$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadStock(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleStock;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "stocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadStock$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadStock(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadStock$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onReadTemperature(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleTemperature;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "temperatures"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadTemperature$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadTemperatureUnit(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadTemperatureUnit$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadTrainingStatus(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleTrainingStatus;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadTrainingStatus$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadTuyaKey(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleTuyaKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleTuyaKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "tuyaKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadTuyaKey$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleTuyaKey;)V

    return-void
.end method

.method public static onReadUiPackVersion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "version"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadUiPackVersion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/lang/String;)V

    return-void
.end method

.method public static onReadUnit(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadUnit$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadUserProfile(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleUserProfile;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleUserProfile;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "userProfile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadUserProfile$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleUserProfile;)V

    return-void
.end method

.method public static onReadVitalityValue(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleVitality;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "vitalityValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadVitalityValue$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadVoiceControl(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadVoiceControl$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadWatchFaceId(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceId;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWatchFaceId;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchFaceId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWatchFaceId$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceId;)V

    return-void
.end method

.method public static onReadWatchFaceIndex(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWatchFaceIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchfaceIndex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWatchFaceIndex$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V

    return-void
.end method

.method public static onReadWatchFaceMaxSize(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sizeInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWatchFaceMaxSize$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceMaxSize;)V

    return-void
.end method

.method public static onReadWatchFaceSwitch(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWatchFaceSwitch$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadWatchPassword(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSettingWatchPassword;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWatchPassword$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V

    return-void
.end method

.method public static onReadWearWayState(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWearWayState$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onReadWeatherRealTime(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWeatherRealTime$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onReadWechatPaySettings(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWechatPaySettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWechatPaySettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "wechatPaySetting"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWechatPaySettings$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWechatPaySettings;)V

    return-void
.end method

.method public static onReadWorkout(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "workouts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorkout$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadWorkout2(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout2;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "workouts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorkout2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadWorkout3(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout3;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "workouts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorkout3$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadWorkout4(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorkout4;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "workouts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorkout4$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReadWorkout4Segmentation(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWorkout4Segmentation;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWorkout4Segmentation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "mBleWorkout4Segmentation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorkout4Segmentation$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWorkout4Segmentation;)V

    return-void
.end method

.method public static onReadWorldClock(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorldClock;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "clocks"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReadWorldClock$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onRealTimeMeasurement(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRealTimeMeasurement;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRealTimeMeasurement;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "realTimeMeasurement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onRealTimeMeasurement$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRealTimeMeasurement;)V

    return-void
.end method

.method public static onReceiveCmTrace(Lcom/szabh/smable3/component/BleHandleCallback;[BZ)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveCmTrace$jd(Lcom/szabh/smable3/component/BleHandleCallback;[BZ)V

    return-void
.end method

.method public static onReceiveFilePacket(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleReceiveFilePacket;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleReceiveFilePacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "filePacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveFilePacket$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleReceiveFilePacket;)V

    return-void
.end method

.method public static onReceiveGSensorMotion(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorMotion;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gSensorMotions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveGSensorMotion$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveGSensorRaw(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorRaw;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gSensorRaws"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveGSensorRaw$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveGSensorSHSY(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleGSensorSHSY;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "gSensorSHSYs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveGSensorSHSY$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveHRRaw(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleHRRaw;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "hrRaw"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveHRRaw$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveLocationGga(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLocationGga;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleLocationGga;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "locationGga"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveLocationGga$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLocationGga;)V

    return-void
.end method

.method public static onReceiveLocationGsv(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleLocationGsv;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "locationGsv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveLocationGsv$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveMusicCommand(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/MusicCommand;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/MusicCommand;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "musicCommand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveMusicCommand$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/MusicCommand;)V

    return-void
.end method

.method public static onReceivePpgSHSY(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/szabh/smable3/component/BleHandleCallback;",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BlePpgSHSY;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ppgSHSYs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceivePpgSHSY$jd(Lcom/szabh/smable3/component/BleHandleCallback;Ljava/util/List;)V

    return-void
.end method

.method public static onReceiveRealtimeLog(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRealtimeLog;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRealtimeLog;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "realtimeLog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveRealtimeLog$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRealtimeLog;)V

    return-void
.end method

.method public static onReceiveRecordPacket(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordPacket;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRecordPacket;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "recordPacket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onReceiveRecordPacket$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordPacket;)V

    return-void
.end method

.method public static onRecordControlUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordControl;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRecordControl;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "control"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onRecordControlUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRecordControl;)V

    return-void
.end method

.method public static onRequestAgpsPrerequisite(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onRequestAgpsPrerequisite$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onRequestLocation(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onRequestLocation$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onRingVibrationSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleRingVibrationSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "ringVibrationSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onRingVibrationSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleRingVibrationSettings;)V

    return-void
.end method

.method public static onSDCardInfoUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSDCardInfo;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSDCardInfo;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sdCardInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSDCardInfoUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSDCardInfo;)V

    return-void
.end method

.method public static onSGTestUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGTest;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGTest;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "test"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSGTestUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGTest;)V

    return-void
.end method

.method public static onSGTtsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGTts;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSGTts;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "tts"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSGTtsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSGTts;)V

    return-void
.end method

.method public static onSOSSettingsUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSOSSettings;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSOSSettings;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sosSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSOSSettingsUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSOSSettings;)V

    return-void
.end method

.method public static onScreenBrightnessSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onScreenBrightnessSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onSessionStateChange(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSessionStateChange$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onSleepNotifyUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSleepNotify;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSleepNotify;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sleepNotify"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSleepNotifyUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSleepNotify;)V

    return-void
.end method

.method public static onSosContactUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSosContact;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSosContact;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "sosContact"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSosContactUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSosContact;)V

    return-void
.end method

.method public static onSportEndNotifyUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSportEndNotifyUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onStandbyWatchFaceSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "standbyWatchFaceSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onStandbyWatchFaceSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleStandbyWatchFaceSet;)V

    return-void
.end method

.method public static onStepGoalUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onStepGoalUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onStockDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onStockDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onStreamProgress(Lcom/szabh/smable3/component/BleHandleCallback;ZIIILcom/szabh/smable3/BleKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p5    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p5}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onStreamProgress$jd(Lcom/szabh/smable3/component/BleHandleCallback;ZIIILcom/szabh/smable3/BleKey;)V

    return-void
.end method

.method public static synthetic onStreamProgress$default(Lcom/szabh/smable3/component/BleHandleCallback;ZIIILcom/szabh/smable3/BleKey;ILjava/lang/Object;)V
    .locals 0

    invoke-static/range {p0 .. p7}, Lcom/szabh/smable3/component/BleHandleCallback;->onStreamProgress$default(Lcom/szabh/smable3/component/BleHandleCallback;ZIIILcom/szabh/smable3/BleKey;ILjava/lang/Object;)V

    return-void
.end method

.method public static onSyncData(Lcom/szabh/smable3/component/BleHandleCallback;ILcom/szabh/smable3/BleKey;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/BleKey;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bleKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onSyncData$jd(Lcom/szabh/smable3/component/BleHandleCallback;ILcom/szabh/smable3/BleKey;)V

    return-void
.end method

.method public static onTimeUpdate(Lcom/szabh/smable3/component/BleHandleCallback;)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onTimeUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;)V

    return-void
.end method

.method public static onUpdateAICoachGenerateBeforeInfoV2(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "info"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateAICoachGenerateBeforeInfoV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAICoachBeforePlanV2;)V

    return-void
.end method

.method public static onUpdateAICoachLeaveDay(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLeaveDay;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleLeaveDay;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "plan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateAICoachLeaveDay$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleLeaveDay;)V

    return-void
.end method

.method public static onUpdateAppSportState(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppSportState;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleAppSportState;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "appSportState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateAppSportState$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleAppSportState;)V

    return-void
.end method

.method public static onUpdateBAC(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBAC;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBAC;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bac"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateBAC$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBAC;)V

    return-void
.end method

.method public static onUpdateBloodPressure(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodPressure;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleBloodPressure;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "bloodPressure"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateBloodPressure$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleBloodPressure;)V

    return-void
.end method

.method public static onUpdateHeartRate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHeartRate;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleHeartRate;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "heartRate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateHeartRate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleHeartRate;)V

    return-void
.end method

.method public static onUpdateTemperature(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleTemperature;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleTemperature;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "temperature"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateTemperature$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleTemperature;)V

    return-void
.end method

.method public static onUpdateWatchFaceSwitch(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUpdateWatchFaceSwitch$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onUserProfileUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleUserProfile;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleUserProfile;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "profile"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onUserProfileUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleUserProfile;)V

    return-void
.end method

.method public static onVibrationUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onVibrationUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onVibrationUpdateV2(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onVibrationUpdateV2$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onWatchFaceIdUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWatchFaceIdUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onWatchFaceIndexCreate(Lcom/szabh/smable3/component/BleHandleCallback;Z)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWatchFaceIndexCreate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Z)V

    return-void
.end method

.method public static onWatchFaceIndexUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleWatchFaceIndex;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchfaceIndex"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWatchFaceIndexUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleWatchFaceIndex;)V

    return-void
.end method

.method public static onWatchPasswordUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleSettingWatchPassword;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "watchPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWatchPasswordUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleSettingWatchPassword;)V

    return-void
.end method

.method public static onWearWayUpdate(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWearWayUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onWorldClockDelete(Lcom/szabh/smable3/component/BleHandleCallback;I)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onWorldClockDelete$jd(Lcom/szabh/smable3/component/BleHandleCallback;I)V

    return-void
.end method

.method public static onXMLYBandSetUpdate(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleXMLYBandSet;)V
    .locals 1
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lcom/szabh/smable3/entity/BleXMLYBandSet;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onXMLYBandSetUpdate$jd(Lcom/szabh/smable3/component/BleHandleCallback;Lcom/szabh/smable3/entity/BleXMLYBandSet;)V

    return-void
.end method

.method public static onXModem(Lcom/szabh/smable3/component/BleHandleCallback;B)V
    .locals 0
    .param p0    # Lcom/szabh/smable3/component/BleHandleCallback;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p0, p1}, Lcom/szabh/smable3/component/BleHandleCallback;->access$onXModem$jd(Lcom/szabh/smable3/component/BleHandleCallback;B)V

    return-void
.end method
