.class final Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/HealthConnectActivity;->onLaunch(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n140#2,5:247\n145#2,5:253\n1#3:252\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n*L\n159#1:247,5\n159#1:253,5\n159#1:252\n*E\n"
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.me.HealthConnectActivity$onLaunch$1"
    f = "HealthConnectActivity.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x98
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-HealthConnectActivity$onLaunch$1$1"
    }
    s = {
        "L$1",
        "I$1"
    }
    v = 0x1
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHealthConnectActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,246:1\n140#2,5:247\n145#2,5:253\n1#3:252\n*S KotlinDebug\n*F\n+ 1 HealthConnectActivity.kt\ncom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1\n*L\n159#1:247,5\n159#1:253,5\n159#1:252\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $id:I

.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;ILkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/me/HealthConnectActivity;",
            "I",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    iput p2, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->$id:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lkotlin/coroutines/Continuation<",
            "*>;)",
            "Lkotlin/coroutines/Continuation<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    iget v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->$id:I

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;ILkotlin/coroutines/Continuation;)V

    return-object p1
.end method

.method public final invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->I$0:I

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getViewModel$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    iget v3, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->$id:I

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getHealthConnectManager$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;->getPermissions(I)Ljava/util/Set;

    move-result-object v5

    iput-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->L$0:Ljava/lang/Object;

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->L$1:Ljava/lang/Object;

    iput v3, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->I$0:I

    const/4 p1, 0x0

    iput p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->I$1:I

    iput v2, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$onLaunch$1;->label:I

    invoke-virtual {v4, v5, p0}, Lcom/example/health/data/HealthConnectManager;->iIiiO(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move v0, v3

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "HealthConnectActivity hasAllPermissions "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    if-nez p1, :cond_3

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    new-instance v2, Landroid/content/Intent;

    const-class v3, Lcom/example/health/presentation/HealthConnectPermissionsActivity;

    invoke-direct {v2, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v2, p1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {v1, v2, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    :cond_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
