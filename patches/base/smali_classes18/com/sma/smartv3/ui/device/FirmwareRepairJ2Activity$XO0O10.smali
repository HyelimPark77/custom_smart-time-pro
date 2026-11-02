.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->startOTA(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->upgrade()V

    return-void
.end method


# virtual methods
.method public onCancelOTA()V
    .locals 2

    const-string v0, "onCancelOTA"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onError -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

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
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onNeedReconnect : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Z)V

    return-void
.end method

.method public onProgress(IF)V
    .locals 2

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    const v1, 0x7f1402b3

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    const v1, 0x7f1412ba

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

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

    const-string v0, "onStartOTA"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onStopOTA()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I

    move-result v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onStopOTA() upgrade ok "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    sget-object v2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v2}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getDfuProgress()Lcom/sma/smartv3/view/DfuProgress;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/DfuProgress;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I001OO;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/I001OO;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)V

    const-wide/16 v3, 0x1388

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v2, "firmware_upgrade_failed"

    invoke-virtual {v0, v2, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const v0, 0x7f14118e

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    sget-object v0, Lcom/sma/smartv3/model/UpgradeFailedDeviceData;->INSTANCE:Lcom/sma/smartv3/model/UpgradeFailedDeviceData;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;->access$getMDeviceInfo$p(Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;)Lcom/szabh/smable3/entity/BleDeviceInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/model/UpgradeFailedDeviceData;->delete(Lcom/szabh/smable3/entity/BleDeviceInfo;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity$XO0O10;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairJ2Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
