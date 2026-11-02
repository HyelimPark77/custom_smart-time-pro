.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;
.super Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    invoke-direct {p0}, Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final IO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 4

    const/16 v0, 0x102

    if-eq p0, v0, :cond_2

    const/16 v0, 0x20f

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1001

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1, v3}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Z)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, v3, v2, v1}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    const v0, 0x7f141117

    invoke-static {p0, v0, v3, v2, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getMDfuHelper(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;

    move-result-object p0

    invoke-virtual {p0}, Lcom/realsil/sdk/dfu/utils/GattDfuAdapter;->getOtaDeviceInfo()Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->setMOtaDeviceInfo(Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->getMOtaDeviceInfo()Lcom/realsil/sdk/dfu/model/OtaDeviceInfo;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged -> mOtaDeviceInfo = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$startOtaProcess(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void

    :cond_2
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 5

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final OIi0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    invoke-virtual {p1}, Lcom/realsil/sdk/dfu/model/DfuProgressInfo;->getProgress()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OIi0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->XOO0ii0(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->I0IIOi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method

.method public static final XOO0ii0(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 3

    const/16 v0, 0x102

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)I

    move-result p0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    if-ge p0, v0, :cond_0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;I)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)Landroid/widget/TextView;

    move-result-object p0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X10X0;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/X10X0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$upgradeDone(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    :cond_1
    return-void
.end method

.method public static synthetic iO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->IO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    return-void
.end method


# virtual methods
.method public onError(II)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FirmwareUpgradeRSmaActivity onError: type="

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Z)V

    const p1, 0x7f140bf6

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/XO00iXOOi;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/XO00iXOOi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProcessStateChanged(ILcom/realsil/sdk/dfu/model/Throughput;)V
    .locals 1

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIX010II;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iIX010II;-><init>(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProgressChanged(Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 2

    const-string v0, "progressInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O001X;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/O001X;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStateChanged(I)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "onStateChanged -> state = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OOIii10I1;

    invoke-direct {v1, p1, v0}, Lcom/android/mltcode/paycertificationapi/OOIii10I1;-><init>(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRSmaActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
