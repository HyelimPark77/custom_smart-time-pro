.class final Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/wx/WxManager;->O101()V
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
    c = "com.sma.smartv3.biz.wx.WxManager$startPollingCheckLoginQrcodeStatus$1"
    f = "WxManager.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x1,
        0x1,
        0x1
    }
    l = {
        0x477,
        0x47c
    }
    m = "invokeSuspend"
    n = {
        "result",
        "retryCount",
        "maxRetries",
        "result",
        "retryCount",
        "maxRetries"
    }
    s = {
        "L$0",
        "I$0",
        "I$1",
        "L$0",
        "I$0",
        "I$1"
    }
    v = 0x1
.end annotation


# instance fields
.field I$0:I

.field I$1:I

.field L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;",
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

    new-instance p1, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->label:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$1:I

    iget v4, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$0:I

    iget-object v5, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/16 v1, 0x1e

    move v4, p1

    :goto_0
    if-ge v4, v1, :cond_9

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-static {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->XOO0ii0(Lcom/sma/smartv3/biz/wx/WxManager;)Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    move-result-object v5

    sget-object v6, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->XXI()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "WxManager checkLoginQrcodeStatus -> "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v9, ", "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v6, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Verification:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    if-ne v5, v6, :cond_4

    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->XXI()Ljava/lang/String;

    move-result-object v6

    const-string v7, "ipad"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->Xii()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_3
    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->I1XOi1()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->X0iO()V

    :cond_4
    sget-object v6, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanning:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    if-ne v5, v6, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->Xii11I()V

    :cond_5
    sget-object v6, Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;->Scanned:Lcom/sma/smartv3/biz/wx/data/WxLoginQrCodeState;

    if-ne v5, v6, :cond_7

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->Xii11I()V

    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$0:I

    iput v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$1:I

    iput v3, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->label:I

    const-wide/16 v1, 0x1770

    invoke-static {v1, v2, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    const/4 v0, 0x0

    invoke-static {p1, v0, v3, v0}, Lcom/sma/smartv3/biz/wx/WxManager;->XXIIO1i11(Lcom/sma/smartv3/biz/wx/WxManager;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_7
    invoke-static {v5}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->L$0:Ljava/lang/Object;

    iput v4, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$0:I

    iput v1, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->I$1:I

    iput v2, p0, Lcom/sma/smartv3/biz/wx/WxManager$startPollingCheckLoginQrcodeStatus$1;->label:I

    const-wide/16 v5, 0x7d0

    invoke-static {v5, v6, p0}, Lkotlinx/coroutines/DelayKt;->XIi00iiXO(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    :goto_3
    add-int/2addr v4, v3

    goto/16 :goto_0

    :cond_9
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    const-string v0, "WxManager checkLoginQrcodeStatus -> timeout"

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/wx/WxManager;->X00O0()V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method
