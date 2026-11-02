.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/network/OnNetworkOTACallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->startNetworkOTA(Ljava/lang/String;)V
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " NetworkOTA onCancel"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    const-string v2, "NetworkOTA onCancel"

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onError(ILjava/lang/String;)V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " NetworkOTA onError -> error = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v2, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_FAILED:Lcom/sma/smartv3/ui/device/OTAStatus;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "error = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, p1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$updateUpgradeStatus(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;)V

    return-void
.end method

.method public onProgress(I)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " NetworkOTA p -> "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADEING:Lcom/sma/smartv3/ui/device/OTAStatus;

    invoke-static {v0, v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setMOTAStatus$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public onStart()V
    .locals 4

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " NetworkOTA start"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_START:Lcom/sma/smartv3/ui/device/OTAStatus;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onStop()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " NetworkOTA onStop upgrade ok"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    sget-object v1, Lcom/sma/smartv3/ui/device/OTAStatus;->UPGRADE_STOP:Lcom/sma/smartv3/ui/device/OTAStatus;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->updateUpgradeStatus$default(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;Lcom/sma/smartv3/ui/device/OTAStatus;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v2

    if-ge v0, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)I

    move-result v0

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    add-int/2addr v0, v1

    invoke-static {v2, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/O1I11Ii;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/O1I11Ii;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;)V

    const-wide/16 v3, 0xbb8

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity$O00;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeJSmaActivity;->upgradeDone()V

    return-void
.end method
