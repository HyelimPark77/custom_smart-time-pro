.class public final Lcom/sma/smartv3/screen_lock/ScreenLockService;
.super Landroid/app/Service;
.source "SourceFile"


# instance fields
.field public final IO:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/gw3;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/gw3;-><init>(Lcom/sma/smartv3/screen_lock/ScreenLockService;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/screen_lock/ScreenLockService;->IO:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/screen_lock/ScreenLockService;)Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/screen_lock/ScreenLockService;->iO(Lcom/sma/smartv3/screen_lock/ScreenLockService;)Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;

    move-result-object p0

    return-object p0
.end method

.method public static final iO(Lcom/sma/smartv3/screen_lock/ScreenLockService;)Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;
    .locals 1

    new-instance v0, Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;-><init>(Lcom/sma/smartv3/screen_lock/ScreenLockService;)V

    return-object v0
.end method


# virtual methods
.method public final XIi00iiXO()Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/screen_lock/ScreenLockService;->IO:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;

    return-object v0
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
    .locals 2

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    const-string v1, "android.intent.action.SCREEN_OFF"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    const-string v1, "android.intent.action.USER_PRESENT"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/screen_lock/ScreenLockService;->XIi00iiXO()Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;

    move-result-object v1

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    return-void
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    invoke-virtual {p0}, Lcom/sma/smartv3/screen_lock/ScreenLockService;->XIi00iiXO()Lcom/sma/smartv3/screen_lock/ScreenLockService$mReceiver$2$1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    return-void
.end method
