.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;
.super Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 4

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

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

    const-string v3, "ota onConnection -> mOTAStatus = "

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    if-nez p1, :cond_4

    if-eqz p2, :cond_3

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I

    move-result p1

    const-string p2, "getAbsolutePath(...)"

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->startOTA(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName2()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->startOTA(Ljava/lang/String;)V

    return-void

    :cond_3
    const-string p1, "ota onConnection -> device disconnected"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_4
    :goto_1
    return-void
.end method
