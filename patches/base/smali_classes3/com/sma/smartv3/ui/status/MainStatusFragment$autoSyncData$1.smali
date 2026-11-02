.class public final Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/status/MainStatusFragment;->autoSyncData(J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/status/MainStatusFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;->IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;->IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->isRefreshing()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;->IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;

    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->O00()Lcom/android/mltcode/paycertificationapi/g10;

    move-result-object v3

    new-instance v5, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1$run$1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;->IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;

    const/4 v4, 0x0

    invoke-direct {v5, v1, v4}, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1$run$1;-><init>(Lcom/sma/smartv3/ui/status/MainStatusFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->OXO1()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    const-string v2, "DEVICE_DATA_SYNC_STATUS"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Z)V

    const-string v1, "Auto Data Sync Run"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->DATA_ALL:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x1c

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendData$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;[BZZILjava/lang/Object;)Z

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/MainStatusFragment$autoSyncData$1;->IO:Lcom/sma/smartv3/ui/status/MainStatusFragment;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/MainStatusFragment;->getPower()V

    :cond_0
    return-void

    :cond_1
    const-string v0, "No Connect"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    return-void
.end method
