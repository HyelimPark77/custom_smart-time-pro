.class public Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "HealthDataParseHelper"


# instance fields
.field public final a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

.field public final b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

.field public c:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/jieli/jl_rcsp/impl/RcspOpImpl;Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    iput-object p1, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    return-void
.end method


# virtual methods
.method public final a(IIB[B)Lcom/jieli/jl_rcsp/model/device/health/HealthData;
    .locals 1

    packed-switch p2, :pswitch_data_0

    .line 13
    new-instance v0, Lcom/jieli/jl_rcsp/model/device/health/HealthData;

    invoke-direct {v0, p2, p3, p4, p1}, Lcom/jieli/jl_rcsp/model/device/health/HealthData;-><init>(IB[BI)V

    return-object v0

    .line 14
    :pswitch_0
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/ExerciseRecoveryTime;-><init>(IB[B)V

    return-object p2

    .line 15
    :pswitch_1
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/MaxOxygenUptake;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/MaxOxygenUptake;-><init>(IB[B)V

    return-object p2

    .line 16
    :pswitch_2
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/TrainingLoad;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/TrainingLoad;-><init>(IB[B)V

    return-object p2

    .line 17
    :pswitch_3
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/OxygenSaturation;-><init>(IB[B)V

    return-object p2

    .line 18
    :pswitch_4
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/PressureDetection;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/PressureDetection;-><init>(IB[B)V

    return-object p2

    .line 19
    :pswitch_5
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/SportsSteps;-><init>(IB[B)V

    return-object p2

    .line 20
    :pswitch_6
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/Altitude;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/Altitude;-><init>(IB[B)V

    return-object p2

    .line 21
    :pswitch_7
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/AirPressure;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/AirPressure;-><init>(IB[B)V

    return-object p2

    .line 22
    :pswitch_8
    new-instance p2, Lcom/jieli/jl_rcsp/model/device/health/HeartRate;

    invoke-direct {p2, p1, p3, p4}, Lcom/jieli/jl_rcsp/model/device/health/HeartRate;-><init>(IB[B)V

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;I[B)V
    .locals 8

    const-string v0, "handleHealthData"

    if-eqz p2, :cond_0

    .line 1
    sget-object p1, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->d:Ljava/lang/String;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "no implement parse version = "

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " health data"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    const/4 v1, 0x0

    move v2, v1

    :goto_0
    add-int/lit8 v3, v2, 0x4

    .line 2
    array-length v4, p3

    if-gt v3, v4, :cond_4

    .line 3
    aget-byte v4, p3, v2

    add-int/lit8 v5, v2, 0x1

    aget-byte v5, p3, v5

    invoke-static {v4, v5}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt(BB)I

    move-result v4

    add-int/lit8 v5, v2, 0x2

    .line 4
    aget-byte v5, p3, v5

    add-int/lit8 v2, v2, 0x3

    .line 5
    aget-byte v2, p3, v2

    add-int/lit8 v4, v4, -0x2

    if-gtz v4, :cond_1

    .line 6
    sget-object v2, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->d:Ljava/lang/String;

    const-string v4, "missing health sensor data."

    invoke-static {v2, v0, v4}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move v2, v3

    goto :goto_0

    :cond_1
    add-int v6, v3, v4

    .line 7
    array-length v7, p3

    if-le v6, v7, :cond_2

    .line 8
    sget-object p1, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->d:Ljava/lang/String;

    const-string p2, "health sensor data length error."

    invoke-static {p1, v0, p2}, Lcom/jieli/jl_rcsp/util/JL_Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 9
    :cond_2
    new-array v7, v4, [B

    .line 10
    invoke-static {p3, v3, v7, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    iget-object v3, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz v3, :cond_3

    .line 12
    invoke-virtual {p0, p2, v5, v2, v7}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a(IIB[B)Lcom/jieli/jl_rcsp/model/device/health/HealthData;

    move-result-object v2

    invoke-virtual {v3, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onHealthDataChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/HealthData;)V

    :cond_3
    move v2, v6

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)V
    .locals 6

    .line 23
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->b:Lcom/jieli/jl_rcsp/impl/RcspOpImpl;

    invoke-virtual {v0, p1}, Lcom/jieli/jl_rcsp/impl/RcspOpImpl;->getDeviceInfo(Landroid/bluetooth/BluetoothDevice;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 24
    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;

    .line 25
    invoke-virtual {v0}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->getSportsInfo()Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v2

    if-nez v2, :cond_1

    .line 26
    new-instance v2, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    invoke-direct {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;-><init>()V

    .line 27
    invoke-virtual {v0, v2}, Lcom/jieli/jl_rcsp/model/device/DeviceInfo;->setSportsInfo(Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)Lcom/jieli/jl_rcsp/model/device/DeviceInfo;

    .line 28
    :cond_1
    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result v0

    if-eqz v0, :cond_10

    const/4 v1, 0x1

    if-eq v0, v1, :cond_e

    const/4 v3, 0x2

    const/4 v4, 0x0

    if-eq v0, v3, :cond_a

    const/4 v5, 0x3

    if-eq v0, v5, :cond_6

    const/4 p2, 0x4

    if-eq v0, p2, :cond_4

    const/4 p2, 0x5

    if-eq v0, p2, :cond_2

    goto/16 :goto_4

    .line 29
    :cond_2
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result p2

    if-eq p2, v5, :cond_3

    goto :goto_0

    :cond_3
    move v1, v4

    .line 30
    :goto_0
    invoke-virtual {v2, v5}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 31
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    if-eqz v1, :cond_12

    .line 32
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 33
    :cond_4
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result p2

    if-eq p2, v3, :cond_5

    goto :goto_1

    :cond_5
    move v1, v4

    .line 34
    :goto_1
    invoke-virtual {v2, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 35
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    if-eqz v1, :cond_12

    .line 36
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 37
    :cond_6
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;

    if-nez p2, :cond_7

    goto/16 :goto_4

    .line 38
    :cond_7
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_2

    :cond_8
    move v1, v4

    .line 39
    :goto_2
    invoke-virtual {v2, v4}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->stopTime:I

    .line 40
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setEndTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->restoreTime:I

    .line 41
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecoveryTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-short v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileId:S

    .line 42
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecordFileId(S)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->fileSize:I

    .line 43
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecordFileSize(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-object p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$FirmwareStopSportsParam;->strengthIntervalTimer:[B

    .line 44
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a([B)[I

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setExerciseIntensityState([I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 45
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    if-eqz v1, :cond_9

    .line 46
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    .line 47
    :cond_9
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {p2, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V

    return-void

    .line 48
    :cond_a
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;

    if-nez p2, :cond_b

    goto/16 :goto_4

    .line 49
    :cond_b
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_3

    :cond_c
    move v1, v4

    .line 50
    :goto_3
    invoke-virtual {v2, v4}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->stopTime:I

    .line 51
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setEndTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->restoreTime:I

    .line 52
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecoveryTime(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-short v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileId:S

    .line 53
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecordFileId(S)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget v3, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileSize:I

    .line 54
    invoke-virtual {v0, v3}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setRecordFileSize(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-object p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->strengthIntervalTimer:[B

    .line 55
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a([B)[I

    move-result-object p2

    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setExerciseIntensityState([I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 56
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    if-eqz v1, :cond_d

    .line 57
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    .line 58
    :cond_d
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {p2, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V

    return-void

    .line 59
    :cond_e
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;

    if-nez p2, :cond_f

    goto :goto_4

    .line 60
    :cond_f
    iget-byte p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$StartSportsParam;->type:B

    invoke-virtual {v2, p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object p2

    .line 61
    invoke-virtual {p2, v1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 62
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    .line 63
    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->getState()I

    move-result v0

    invoke-virtual {p2, p1, v0}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportsState(Landroid/bluetooth/BluetoothDevice;I)V

    return-void

    .line 64
    :cond_10
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;

    if-nez p2, :cond_11

    goto :goto_4

    .line 65
    :cond_11
    iget v0, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->id:I

    invoke-virtual {v2, v0}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setId(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-byte v1, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->type:B

    .line 66
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-byte v1, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->status:B

    .line 67
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setState(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-boolean v1, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->hasGps:Z

    .line 68
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setNeedAppGPS(Z)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget-byte v1, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->heartRateMode:B

    .line 69
    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setHeartRateMode(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    move-result-object v0

    iget p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->readReadDataInterval:I

    .line 70
    invoke-virtual {v0, p2}, Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;->setReadRealTimeDataInterval(I)Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;

    .line 71
    iget-object p2, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    if-eqz p2, :cond_12

    .line 72
    invoke-virtual {p2, p1, v2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSportInfoChange(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/device/health/SportsInfo;)V

    :cond_12
    :goto_4
    return-void
.end method

.method public final a([B)[I
    .locals 5

    if-eqz p1, :cond_3

    .line 73
    array-length v0, p1

    const/16 v1, 0x14

    if-ge v0, v1, :cond_0

    goto :goto_2

    .line 74
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    add-int/lit8 v3, v2, 0x4

    .line 75
    array-length v4, p1

    if-gt v3, v4, :cond_1

    const/4 v4, 0x4

    .line 76
    invoke-static {p1, v2, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    .line 77
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v2, v3

    goto :goto_0

    .line 78
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    new-array v2, p1, [I

    :goto_1
    if-ge v1, p1, :cond_2

    .line 79
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-object v2

    :cond_3
    :goto_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public receiveCmdFromDevice(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/base/CommandBase;)V
    .locals 3

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getStatus()I

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getId()I

    move-result v0

    const/16 v1, 0xa0

    const/4 v2, 0x0

    if-eq v0, v1, :cond_7

    const/16 v1, 0xa6

    if-eq v0, v1, :cond_6

    const/16 v1, 0xa2

    if-eq v0, v1, :cond_2

    const/16 v1, 0xa3

    if-eq v0, v1, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;

    iget v0, v0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->type:I

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;

    iget-object p2, p2, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->data:[B

    iget-object v1, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a:Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;

    invoke-virtual {v1, p1, v0, p2}, Lcom/jieli/jl_rcsp/tool/callback/RcspEventListenerManager;->onSensorLogDataChange(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void

    :cond_2
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    iget-byte v2, v0, Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd$Param;->version:B

    :goto_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->c:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;

    if-nez v0, :cond_4

    new-instance v0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;-><init>(Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$1;)V

    iput-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->c:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;

    :cond_4
    iget-object v0, p0, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->c:Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper$RecombineHealthDataBuffer;->pushAndReturnResult(Ljava/lang/String;Lcom/jieli/jl_rcsp/model/command/watch/ReceiveHealthDataCmd;)[B

    move-result-object p2

    if-eqz p2, :cond_a

    array-length v0, p2

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {p0, p1, v2, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    return-void

    :cond_6
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;

    invoke-virtual {p0, p1, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a(Landroid/bluetooth/BluetoothDevice;Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;)V

    return-void

    :cond_7
    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getResponse()Lcom/jieli/jl_rcsp/model/base/CommonResponse;

    move-result-object v0

    check-cast v0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;

    invoke-virtual {p2}, Lcom/jieli/jl_rcsp/model/base/CommandBase;->getParam()Lcom/jieli/jl_rcsp/model/base/BaseParameter;

    move-result-object p2

    check-cast p2, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;

    if-nez p2, :cond_8

    goto :goto_1

    :cond_8
    iget-byte v2, p2, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Param;->version:B

    :goto_1
    if-eqz v0, :cond_a

    iget-byte p2, v0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->ret:B

    if-nez p2, :cond_a

    iget-byte p2, v0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->flag:B

    if-nez p2, :cond_9

    goto :goto_2

    :cond_9
    iget-object p2, v0, Lcom/jieli/jl_rcsp/model/command/watch/RequestHealthDataCmd$Response;->data:[B

    invoke-virtual {p0, p1, v2, p2}, Lcom/jieli/jl_rcsp/tool/HealthDataParseHelper;->a(Landroid/bluetooth/BluetoothDevice;I[B)V

    :cond_a
    :goto_2
    return-void
.end method
