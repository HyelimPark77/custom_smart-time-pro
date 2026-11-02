.class final Lcom/sma/smartv3/util/PopManager$showLoadPop$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/util/PopManager;->OiIIX101O(Landroid/view/View;Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;)V
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
    c = "com.sma.smartv3.util.PopManager$showLoadPop$1"
    f = "PopManager.kt"
    i = {
        0x0,
        0x0,
        0x1
    }
    l = {
        0x50,
        0x54
    }
    m = "invokeSuspend"
    n = {
        "countDownPop",
        "i",
        "countDownPop"
    }
    s = {
        "L$0",
        "I$0",
        "L$0"
    }
    v = 0x1
.end annotation


# instance fields
.field final synthetic $action:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $activity:Landroidx/appcompat/app/AppCompatActivity;

.field final synthetic $rootView:Landroid/view/View;

.field I$0:I

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Landroid/view/View;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/appcompat/app/AppCompatActivity;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Landroid/view/View;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/PopManager$showLoadPop$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    iput-object p2, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$action:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$rootView:Landroid/view/View;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3
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

    new-instance p1, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;

    iget-object v0, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    iget-object v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$action:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$rootView:Landroid/view/View;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;-><init>(Landroidx/appcompat/app/AppCompatActivity;Lkotlin/jvm/functions/Function1;Landroid/view/View;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->label:I

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/android/mltcode/paycertificationapi/O110O1III;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->I$0:I

    iget-object v5, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/android/mltcode/paycertificationapi/O110O1III;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/O110O1III;

    iget-object v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$activity:Landroidx/appcompat/app/AppCompatActivity;

    invoke-direct {p1, v1}, Lcom/android/mltcode/paycertificationapi/O110O1III;-><init>(Landroid/app/Activity;)V

    iget-object v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$rootView:Landroid/view/View;

    const/4 v5, 0x0

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->I0iXXO(Z)V

    const-string v5, "3"

    invoke-virtual {p1, v5}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIii1(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIO(Landroid/view/View;)V

    move-object v5, p1

    move v1, v4

    :goto_0
    if-ge v2, v1, :cond_4

    iput-object v5, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->L$0:Ljava/lang/Object;

    iput v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->I$0:I

    iput v3, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->label:I

    const-wide/16 v6, 0x3e8

    invoke-static {v6, v7, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/android/mltcode/paycertificationapi/O110O1III;->XiOIii1(Ljava/lang/String;)V

    add-int/2addr v1, v2

    goto :goto_0

    :cond_4
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->dismiss()V

    iget-object p1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->$action:Lkotlin/jvm/functions/Function1;

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/util/PopManager$showLoadPop$1;->label:I

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
