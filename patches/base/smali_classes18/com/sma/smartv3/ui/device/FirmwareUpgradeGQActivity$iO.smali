.class public final Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/goodix/ble/gr/toolbox/app/libfastdfu/FastDfuProgressCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V

    return-void
.end method

.method public static final XIi00iiXO(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;->access$upgrade(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V

    return-void
.end method


# virtual methods
.method public onDfuComplete()V
    .locals 5

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    add-int/lit8 v0, v0, 0x1

    invoke-static {v1, v0}, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getTvStep()Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/XOXOXOIX0;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/XOXOXOIX0;-><init>(Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;)V

    const-wide/16 v3, 0x7d0

    invoke-virtual {v0, v2, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    const v0, 0x7f14146f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDfuErase(I)V
    .locals 4

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v2, 0x7f140265

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method

.method public onDfuError(ILjava/lang/String;Ljava/lang/Error;)V
    .locals 2

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 p3, 0x2

    const/4 v0, 0x0

    const v1, 0x7f140bf5

    invoke-static {p1, v1, p2, p3, v0}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "firmware_upgrade_failed"

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    sget-object p1, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {p1, p3}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method public onDfuProgress(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public onDfuStart()V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity$iO;->IO:Lcom/sma/smartv3/ui/device/FirmwareUpgradeGQActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareUpgradeActivity;->getProgressButton()Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f1412ba

    const/4 v4, 0x0

    invoke-static {v0, v3, v4, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method
