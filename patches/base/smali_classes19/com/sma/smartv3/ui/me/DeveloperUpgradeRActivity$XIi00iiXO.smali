.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;
.super Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeRActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$mDfuCallback$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,286:1\n11#2,2:287\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeRActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$mDfuCallback$1\n*L\n93#1:287,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeRActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeRActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$mDfuCallback$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,286:1\n11#2,2:287\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeRActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$mDfuCallback$1\n*L\n93#1:287,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    invoke-direct {p0}, Lcom/realsil/sdk/dfu/utils/DfuAdapter$DfuHelperCallback;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static final IO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 4

    const/16 v0, 0x102

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1001

    if-eq p0, v0, :cond_0

    return-void

    :cond_0
    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Z)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, p0, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->onBottomClick(Landroid/view/View;)V

    return-void

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$upgrade(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 5

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/OOX00;->OXO1:Lcom/android/mltcode/paycertificationapi/OOX00;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/OOX00;->O00()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static {v0, v1, v4, v2, v3}, Lcom/sma/smartv3/view/ProgressButton;->IiI10X(Lcom/sma/smartv3/view/ProgressButton;Ljava/lang/String;ZILjava/lang/Object;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Landroid/widget/TextView;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->onBottomClick(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->IO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static final OIi0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 1

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    invoke-virtual {p1}, Lcom/realsil/sdk/dfu/model/DfuProgressInfo;->getProgress()I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public static synthetic OXO1(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->XOO0ii0(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->I0IIOi(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    return-void
.end method

.method public static final XOO0ii0(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V
    .locals 3

    const/16 v0, 0x102

    if-ne p0, v0, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)I

    move-result p0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getMSteps$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    if-ge p0, v0, :cond_0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p1, p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$setMStepsIndex$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;I)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getTvStep(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Landroid/widget/TextView;

    move-result-object p0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/OiOiOOi;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/OiOiOOi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    const-wide/16 v1, 0x7d0

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getAlreadyUpdateDeviceList$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    move-result-object p0

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object p0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$getAlreadyUpdateDeviceList$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    move-result-object v0

    const-class v1, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :cond_1
    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OIi0(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V

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

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Z)V

    const p1, 0x7f140bf6

    invoke-static {p1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    new-instance p2, Lcom/android/mltcode/paycertificationapi/i111110i1;

    invoke-direct {p2, p1}, Lcom/android/mltcode/paycertificationapi/i111110i1;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    invoke-virtual {p1, p2}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProcessStateChanged(ILcom/realsil/sdk/dfu/model/Throughput;)V
    .locals 1

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/X00011i1I;

    invoke-direct {v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X00011i1I;-><init>(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    invoke-virtual {p2, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onProgressChanged(Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V
    .locals 2

    const-string v0, "progressInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OIXiIXO;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/OIXiIXO;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;Lcom/realsil/sdk/dfu/model/DfuProgressInfo;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStateChanged(I)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXIOXXI10;

    invoke-direct {v1, p1, v0}, Lcom/android/mltcode/paycertificationapi/OXIOXXI10;-><init>(ILcom/sma/smartv3/ui/me/DeveloperUpgradeRActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
