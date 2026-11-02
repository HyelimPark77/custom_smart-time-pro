.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;
.super Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-direct {p0}, Lcom/jieli/jl_bt_ota/interfaces/BtEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnection(Landroid/bluetooth/BluetoothDevice;I)V
    .locals 6

    const-string v0, "device"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, 0x1

    if-eq p2, v1, :cond_1

    const/4 v2, 0x3

    if-eq p2, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->getMReconnectCount()I

    move-result v2

    if-eq v2, v0, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->setReconnect(Z)V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->setReconnect(Z)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v2, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->setMReconnectCount(I)V

    :cond_2
    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v3}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v3

    iget-object v4, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " ota onConnection -> mOTAStatus = "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " ,status = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " ,isOTA = "

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->XIi00iiXO(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)I

    move-result v2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    sget-object v2, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;->FIRMWARE:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$FileType;

    if-ne p1, v2, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAManager$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/jieli/watchtesttool/tool/upgrade/OTAManager;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/impl/BluetoothOTAManager;->isOTA()Z

    move-result p1

    if-nez p1, :cond_6

    if-eqz p2, :cond_5

    if-eq p2, v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$canOTA(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    new-instance p2, Ljava/io/File;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMLatestFirmware$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/model/FirmwareVersion;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/FirmwareVersion;->getFileName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    const-string v0, "getAbsolutePath(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->startOTA(Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " ota onConnection -> device disconnected"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object p1

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE:Lcom/sma/smartv3/ui/device/OTAStatus;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object p2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_PREPARE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v0, "device disconnected"

    invoke-static {p1, p2, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void
.end method
