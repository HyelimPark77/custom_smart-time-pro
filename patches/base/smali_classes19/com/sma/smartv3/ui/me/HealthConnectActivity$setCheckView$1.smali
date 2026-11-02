.class final Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/me/HealthConnectActivity;->setCheckView()V
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

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.me.HealthConnectActivity$setCheckView$1"
    f = "HealthConnectActivity.kt"
    i = {
        0x0,
        0x0
    }
    l = {
        0x67
    }
    m = "invokeSuspend"
    n = {
        "it",
        "$i$a$-let-HealthConnectActivity$setCheckView$1$1"
    }
    s = {
        "L$0",
        "I$0"
    }
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field L$0:Ljava/lang/Object;

.field L$1:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/me/HealthConnectActivity;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1
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

    new-instance p1, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;-><init>(Lcom/sma/smartv3/ui/me/HealthConnectActivity;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->L$1:Ljava/lang/Object;

    check-cast v0, Landroidx/appcompat/widget/AppCompatCheckBox;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-static {p1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getViewModel$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->this$0:Lcom/sma/smartv3/ui/me/HealthConnectActivity;

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getMContext(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroid/app/Activity;

    move-result-object v3

    const-string v4, "com.google.android.apps.healthdata"

    invoke-static {v3, v4}, Lcom/android/mltcode/paycertificationapi/ad6;->XIi00iiXO(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getCheck_health_connect(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v3

    invoke-static {v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getHealthConnectManager$p(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Lcom/example/health/data/HealthConnectManager;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, v4}, Lcom/example/health/presentation/screen/exercisesession/ExerciseSessionViewModel;->getPermissions(I)Ljava/util/Set;

    move-result-object v5

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->L$0:Ljava/lang/Object;

    iput-object v3, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->L$1:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->I$0:I

    iput v2, p0, Lcom/sma/smartv3/ui/me/HealthConnectActivity$setCheckView$1;->label:I

    invoke-virtual {v1, v5, p0}, Lcom/example/health/data/HealthConnectManager;->iIiiO(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v3

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lcom/sma/smartv3/ui/me/HealthConnectActivity;->access$getCheck_health_connect(Lcom/sma/smartv3/ui/me/HealthConnectActivity;)Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_4
    :goto_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
