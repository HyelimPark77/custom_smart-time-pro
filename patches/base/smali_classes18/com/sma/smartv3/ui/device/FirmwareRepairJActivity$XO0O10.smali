.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->startOTA(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,275:1\n27#2,2:276\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n*L\n158#1:276,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairJActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,275:1\n27#2,2:276\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairJActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairJActivity$startOTA$1\n*L\n158#1:276,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancelOTA()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota cancel"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onError -> status = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public onNeedReconnect(Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "addr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onNeedReconnect -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void
.end method

.method public onProgress(IF)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota p -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    const v1, 0x7f1402b3

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    const v1, 0x7f1412ba

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getDfuProgress()Lcom/sma/smartv3/view/DfuProgress;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/DfuProgress;->setProgress(F)V

    return-void
.end method

.method public onStartOTA()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota start"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onStopOTA()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota stop! upgrade is ok"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "firmware_upgrade_failed"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const v1, 0x7f14118e

    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object v1, Lcom/sma/smartv3/model/UpgradeFailedDeviceData;->INSTANCE:Lcom/sma/smartv3/model/UpgradeFailedDeviceData;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;->access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;)Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/model/UpgradeFailedDeviceData;->delete(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "firmware_version_changed"

    invoke-static {v2, v0, v1, v0}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
