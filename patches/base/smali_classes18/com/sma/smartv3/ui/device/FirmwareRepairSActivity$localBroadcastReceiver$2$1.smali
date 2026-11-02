.class public final Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,243:1\n27#2,2:244\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n*L\n90#1:244,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nFirmwareRepairSActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,243:1\n27#2,2:244\n*S KotlinDebug\n*F\n+ 1 FirmwareRepairSActivity.kt\ncom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1\n*L\n90#1:244,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->iO(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;I)V

    return-void
.end method

.method public static synthetic XIi00iiXO(ILcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->XO0O10(ILcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V

    return-void
.end method

.method public static final XO0O10(ILcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    const/16 v1, 0x3f

    const v2, 0x7f140bf5

    if-eq p0, v1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "  error="

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p0, 0x7f141195

    invoke-virtual {p1, p0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    new-array v1, v0, [Ljava/lang/Object;

    invoke-static {p0, v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    sget-object p0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "firmware_upgrade_failed"

    invoke-virtual {v1, v2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const v1, 0x7f14146f

    invoke-static {v1}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/model/FirmwareVersion;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/blankj/utilcode/util/SPUtils;->remove(Ljava/lang/String;)V

    const-string p0, "firmware_version_changed"

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v2}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    :goto_0
    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->setMStarted(Z)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;I)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412ba

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/BaseFirmwareRepairActivity;->getDfuProgress()Lcom/sma/smartv3/view/DfuProgress;

    move-result-object p0

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/DfuProgress;->setProgress(F)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x736983ec

    const/4 v2, 0x0

    if-eq v0, v1, :cond_6

    const v1, 0x34f7a38d

    if-eq v0, v1, :cond_2

    const v1, 0x69031540

    if-eq v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string v0, "com.sifli.siflidfu.BROADCAST_DFU_LOG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto/16 :goto_0

    :cond_1
    const-string p1, "com.sifli.siflidfu.EXTRA_LOG_MESSAGE"

    invoke-virtual {p2, p1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " DFU LOG - "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_2
    const-string v0, "com.sifli.siflidfu.BROADCAST_DFU_STATE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto/16 :goto_0

    :cond_3
    const-string p1, "com.sifli.siflidfu.EXTRA_DFU_STATE"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "com.sifli.siflidfu.EXTRA_DFU_STATE_RESULT"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  BROADCAST_DFU_STATE  result : dfuState="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  dfuStateResult = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/4 v0, 0x7

    if-eq p1, v0, :cond_5

    const/16 v0, 0x64

    if-eq p1, v0, :cond_4

    goto :goto_0

    :cond_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XiXiii1i;

    invoke-direct {v0, p2, p1}, Lcom/android/mltcode/paycertificationapi/XiXiii1i;-><init>(ILcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_5
    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XIi00iiXO()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    const-string p2, "firmware_upgrade_failed"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    return-void

    :cond_6
    const-string v0, "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const-string p1, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS_TYPE"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " progress - "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1Xii1O;

    invoke-direct {v0, p2, p1}, Lcom/android/mltcode/paycertificationapi/i1Xii1O;-><init>(Lcom/sma/smartv3/ui/device/FirmwareRepairSActivity;I)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_8
    :goto_0
    return-void
.end method
