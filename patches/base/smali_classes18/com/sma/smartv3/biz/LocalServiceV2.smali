.class public final Lcom/sma/smartv3/biz/LocalServiceV2;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;
    }
.end annotation


# instance fields
.field public IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/biz/LocalServiceV2;->IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    if-nez v0, :cond_0

    new-instance v0, Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;-><init>(Lcom/sma/smartv3/biz/LocalServiceV2;)V

    iput-object v0, p0, Lcom/sma/smartv3/biz/LocalServiceV2;->IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/biz/LocalServiceV2;->IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    if-eqz v0, :cond_1

    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    const-string v2, "android.intent.action.TIME_TICK"

    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    sget-object v2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method public final XIi00iiXO()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/biz/LocalServiceV2;->IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/biz/LocalServiceV2;->IO:Lcom/sma/smartv3/biz/LocalServiceV2$ServiceReceiverV2;

    :cond_0
    return-void
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public onCreate()V
    .locals 0

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/LocalServiceV2;->OXO1()V

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0(Landroid/app/Service;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/biz/LocalServiceV2;->XIi00iiXO()V

    return-void
.end method

.method public onStartCommand(Landroid/content/Intent;II)I
    .locals 0
    .param p1    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object p1, Lcom/sma/smartv3/biz/OXO1;->XOO0ii0:Lcom/sma/smartv3/biz/OXO1$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/OXO1$OXO1;->OXO1()Lcom/sma/smartv3/biz/OXO1;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/biz/OXO1;->OIX0iXi(Landroid/app/Service;)V

    const/4 p1, 0x1

    return p1
.end method
