.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(Z)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "bt onAdapterStatus "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 4

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "bt onConnection -> mOTAStatus = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ,status = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,isOTA = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-nez p2, :cond_2

    const-string p1, "bt onConnection -> device disconnected"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "bt onConnection -> try ble Address"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object p2

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleDeviceInfo;->getMBleAddress()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->connectDevice(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_2
    return-void
.end method
