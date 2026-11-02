.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;
.super Lno/nordicsemi/android/dfu/DfuProgressListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDeveloperUpgradeNActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeNActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$mDfuProgressListener$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,199:1\n11#2,2:200\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeNActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$mDfuProgressListener$1\n*L\n103#1:200,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDeveloperUpgradeNActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeveloperUpgradeNActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$mDfuProgressListener$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,199:1\n11#2,2:200\n*S KotlinDebug\n*F\n+ 1 DeveloperUpgradeNActivity.kt\ncom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$mDfuProgressListener$1\n*L\n103#1:200,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-direct {p0}, Lno/nordicsemi/android/dfu/DfuProgressListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onDfuAborted(Ljava/lang/String;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const v3, 0x7f140bf5

    invoke-static {p1, v3, v0, v1, v2}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string v0, "firmware_upgrade_failed"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public onDfuCompleted(Ljava/lang/String;)V
    .locals 3

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "firmware_upgrade_failed"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const v0, 0x7f14146f

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getAlreadyUpdateDeviceList$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    move-result-object v0

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;->XO0O10()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "TEST_MODE_OTA_DEVICE_ADDRESS"

    invoke-virtual {v1, v2}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getAlreadyUpdateDeviceList$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    move-result-object v0

    const-class v1, Lcom/android/mltcode/paycertificationapi/OIOO0X00O;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, v0}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public onDfuProcessStarting(Ljava/lang/String;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v2, 0x7f1412ba

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    return-void
.end method

.method public onError(Ljava/lang/String;IILjava/lang/String;)V
    .locals 2

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DeveloperUpgradeNActivity onError -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;Z)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    const/4 p3, 0x2

    const/4 p4, 0x0

    const v0, 0x7f140bf5

    invoke-static {p1, v0, p2, p3, p4}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "firmware_upgrade_failed"

    const/4 p3, 0x1

    invoke-virtual {p1, p2, p3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void
.end method

.method public onProgressChanged(Ljava/lang/String;IFFII)V
    .locals 0

    const-string p3, "deviceAddress"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity$iO;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeNActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p1

    int-to-float p2, p2

    const/high16 p3, 0x42c80000    # 100.0f

    div-float/2addr p2, p3

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method
