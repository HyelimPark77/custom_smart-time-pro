.class final Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/wa/WAManager;->Ii0i()V
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
    c = "com.sma.smartv3.biz.wa.WAManager$startPollingCheckLoginStatus$1"
    f = "WAManager.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x35f,
        0x364
    }
    m = "invokeSuspend"
    n = {
        "retryCount",
        "maxRetries",
        "result",
        "retryCount",
        "maxRetries",
        "result"
    }
    s = {
        "I$0",
        "I$1",
        "Z$0",
        "I$0",
        "I$1",
        "Z$0"
    }
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field Z$0:Z

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 0
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

    new-instance p1, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$1:I

    iget v4, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$0:I

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/16 v1, 0x3c

    move v4, p1

    :goto_0
    if-ge v4, v1, :cond_6

    sget-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/wa/WAManager;->XIi00iiXO(Lcom/sma/smartv3/biz/wa/WAManager;)Z

    move-result v5

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "WAManager checkLoginStatusBlock -> "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    const-wide/16 v6, 0x7d0

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/WAManager;->i0X000X0O()V

    iput v4, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$0:I

    iput v1, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$1:I

    iput-boolean v5, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->Z$0:Z

    iput v3, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->label:I

    invoke-static {v6, v7, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    sget-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/WAManager;->OII()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_4
    iput v4, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$0:I

    iput v1, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->I$1:I

    iput-boolean v5, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->Z$0:Z

    iput v2, p0, Lcom/sma/smartv3/biz/wa/WAManager$startPollingCheckLoginStatus$1;->label:I

    invoke-static {v6, v7, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_2
    return-object v0

    :cond_5
    :goto_3
    add-int/2addr v4, v3

    goto :goto_0

    :cond_6
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WAManager checkLoginQrcodeStatus -> timeout"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/wa/WAManager;->OXO1:Lcom/sma/smartv3/biz/wa/WAManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wa/WAManager;->i11I()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
