.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;
.super Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$mOTAEventCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$mOTAEventCallback$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,275:1\n1#2:276\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

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

    const-string v1, " ota onConnection -> mOTAStatus = "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ,status = "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,isOTA = "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    if-nez p1, :cond_3

    if-eqz p2, :cond_2

    const/4 p1, 0x1

    if-eq p2, p1, :cond_1

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMFilePath$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->startOTA(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ota onConnection -> device disconnected"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_3

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$iO;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_3
    :goto_1
    return-void
.end method
