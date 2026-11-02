.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/IUpgradeCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->startOTA(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$upgradeDone(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    return-void
.end method


# virtual methods
.method public onCancelOTA()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onCancelOTA"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onError(Lcom/jieli/jl_bt_ota/model/base/BaseError;)V
    .locals 4

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/ui/device/OTAStatus;

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

    invoke-virtual {p1}, Lcom/jieli/jl_bt_ota/model/base/BaseError;->getMessage()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v0, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onNeedReconnect(Ljava/lang/String;Z)V
    .locals 3

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onNeedReconnect : "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    const/4 p2, 0x1

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$setUseDfuAddress$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Z)V

    return-void
.end method

.method public onProgress(IF)V
    .locals 3

    const/high16 v0, 0x42c80000    # 100.0f

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_CHECKING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

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
    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {p1, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    div-float/2addr p2, v0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public onStartOTA()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartOTA"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    return-void
.end method

.method public onStopOTA()V
    .locals 6

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v4}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getStartTime$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    const/16 v4, 0x3e8

    int-to-long v4, v4

    div-long/2addr v2, v4

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStopOTA upgrade done. "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "s"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v1

    const-wide/16 v2, 0xfa0

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getUpgradeRunnable$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;

    new-instance v4, Lcom/android/mltcode/paycertificationapi/OXO1X1O;

    invoke-direct {v4, v1}, Lcom/android/mltcode/paycertificationapi/OXO1X1O;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeJSmaActivity;)V

    invoke-virtual {v0, v4, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
