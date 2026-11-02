.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;
.super Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-direct {p0}, Lcom/jieli/watchtesttool/tool/bluetooth/BluetoothEventListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onAdapterStatus(Z)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " bt onAdapterStatus -> "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method

.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " bt onConnection -> mOTAStatus = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", status = "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,isOTA = "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " bt onConnection -> device disconnected"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_1
    return-void
.end method
