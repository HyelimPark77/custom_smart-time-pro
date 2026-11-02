.class public final Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getDeviceAddress$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "access$getDeviceAddress$p(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->setAddress(Ljava/lang/String;)Lcom/bestmafen/baseble/connector/AbsBleConnector;

    move-result-object p0

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/bestmafen/baseble/connector/AbsBleConnector;->connect(Z)V

    return-void
.end method

.method public static final O00(ILcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 5

    const/4 v0, 0x0

    if-nez p0, :cond_1

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$isAutoShutdown$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getMHandler$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Landroid/os/Handler;

    move-result-object p0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XIIiiXi;

    invoke-direct {v1, p1}, Lcom/android/mltcode/paycertificationapi/XIIiiXi;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V

    const-wide/16 v2, 0x7d0

    invoke-virtual {p0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$upgradeExit(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTvTip(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Landroid/widget/TextView;

    move-result-object v1

    const v2, 0x7f140bf5

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  error="

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-static {p0, v2, v0, v1, v3}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    :goto_0
    invoke-static {p1, v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$setMStarted(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;Z)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->XO0O10(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;I)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->IiI10X(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V

    return-void
.end method

.method public static final XO0O10(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;I)V
    .locals 2

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTvTip(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412ba

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getProgressButton(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Lcom/sma/smartv3/view/ProgressButton;

    move-result-object p0

    int-to-float p1, p1

    const/high16 v0, 0x42c80000    # 100.0f

    div-float/2addr p1, v0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/view/ProgressButton;->setProgress(F)V

    return-void
.end method

.method public static synthetic iO(ILcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->O00(ILcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V

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

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, -0x736983ec

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

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

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Ljava/lang/String;

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

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " BROADCAST_DFU_STATE result : dfuState="

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "  dfuStateResult = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const/16 v0, 0x64

    if-ne p1, v0, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/XOOIii0I;

    invoke-direct {v0, p2, p1}, Lcom/android/mltcode/paycertificationapi/XOOIii0I;-><init>(ILcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_4
    const-string v0, "com.sifli.siflidfu.EXTRA_BROADCAST_PROGRESS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const-string p1, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS"

    invoke-virtual {p2, p1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    const-string v0, "com.sifli.siflidfu.EXTRA_DFU_PROGRESS_TYPE"

    invoke-virtual {p2, v0, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;)Ljava/lang/String;

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

    iget-object p2, p0, Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity$localBroadcastReceiver$2$1;->OXO1:Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i1OI0;

    invoke-direct {v0, p2, p1}, Lcom/android/mltcode/paycertificationapi/i1OI0;-><init>(Lcom/sma/smartv3/ui/me/DeveloperUpgradeSActivity;I)V

    invoke-static {v0}, Lcom/blankj/utilcode/util/ThreadUtils;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_6
    :goto_0
    return-void
.end method
