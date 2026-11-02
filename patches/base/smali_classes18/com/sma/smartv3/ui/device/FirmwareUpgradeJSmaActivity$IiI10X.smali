.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->startOTA(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    return-void
.end method


# virtual methods
.method public onCancelOTA()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota cancel"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v2, "ota cancel"

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 6

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota onError -> status = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "status = "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onNeedReconnect(Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "addr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota onNeedReconnect -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Z)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "firmware_upgrade_failed"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public onProgress(IF)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

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

    const/high16 v0, 0x42c80000    # 100.0f

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    const v2, 0x7f1402b3

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, v1, p2}, Lcom/sma/smartv3/view/ProgressButton;->XIi00iiXO(Ljava/lang/String;F)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public onStartOTA()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota start"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->setUpgradeDoneOTAFile(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onStopOTA()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " ota stop! upgrade is ok"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/I0O01O0i;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/I0O01O0i;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$IiI10X;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->upgradeDone()V

    return-void
.end method
