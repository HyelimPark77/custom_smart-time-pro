.class public final Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;
.super Ljava/util/TimerTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onTime()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/me/HealthConnectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;->IO:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;->IO:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v1

    new-instance v4, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1$run$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1;->IO:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onTime$task$1$run$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
