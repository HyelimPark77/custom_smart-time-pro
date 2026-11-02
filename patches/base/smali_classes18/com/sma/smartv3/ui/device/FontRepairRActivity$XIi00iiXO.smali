.class public final Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;
.super Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FontRepairRActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-direct {p0}, Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(II)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FirmwareUpgradeRActivity onError: type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", code"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->e([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {p2}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public onProcessStateChanged(ILcom/realsil/sdk/dfu/model/Throughput;)V
    .locals 1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onProcessStateChanged "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 p2, 0x102

    if-ne p1, p2, :cond_0

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-static {p2}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->access$getMLanguageData$p(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)Lcom/sma/smartv3/model/ExtraPackageData;

    move-result-object p2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/ExtraPackageData;->getType()I

    move-result p2

    const-string v0, "SWITCH_LANGUAGE_CODE"

    invoke-virtual {p1, v0, p2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    const p1, 0x7f14118e

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_0
    return-void
.end method

.method public onProgressChanged(Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 2

    const-string v0, "progressInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getDfuProgress()Lcom/sma/smartv3/view/DfuProgress;

    move-result-object v0

    invoke-virtual {p1}, Lcom/realsil/sdk/dfu/model/DfuProgressInfo;->getProgress()I

    move-result p1

    int-to-float p1, p1

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/DfuProgress;->setProgress(F)V

    return-void
.end method

.method public onStateChanged(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    const/16 v0, 0x102

    if-eq p1, v0, :cond_1

    const/16 v0, 0x1001

    if-eq p1, v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p1

    const v0, 0x7f140476

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FontRepairRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/device/FontRepairRActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/device/FontRepairRActivity;->access$initCacheFile(Lcom/sma/smartv3/ui/device/FontRepairRActivity;)V

    return-void
.end method
