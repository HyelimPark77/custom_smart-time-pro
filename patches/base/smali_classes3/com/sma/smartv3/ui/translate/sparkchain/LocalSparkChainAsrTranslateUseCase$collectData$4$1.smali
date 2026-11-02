.class public final Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/IXiXI;"
    }
.end annotation


# instance fields
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lkotlinx/coroutines/XiOIO;->isActive()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lkotlinx/coroutines/XiOIO;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1, p2, v0, p2}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->I0IIOi(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    move-result-object v0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;

    iget-object v2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-direct {v3, v2, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->OIX0iXi(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lkotlinx/coroutines/XiOIO;)V

    :cond_1
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->OXO1(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
