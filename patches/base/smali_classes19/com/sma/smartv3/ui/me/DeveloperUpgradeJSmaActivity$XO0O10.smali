.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;
.super Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 5

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v3

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

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    if-nez p1, :cond_2

    if-eqz p2, :cond_1

    const/4 p1, 0x1

    if-eq p2, p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$canOTA(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    new-instance p2, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->startOTA(Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ota onConnection -> device disconnected"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    :cond_2
    :goto_0
    return-void
.end method
