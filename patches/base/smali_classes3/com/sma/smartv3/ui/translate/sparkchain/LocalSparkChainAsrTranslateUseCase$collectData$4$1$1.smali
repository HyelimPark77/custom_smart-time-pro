.class final Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1;->OXO1(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
    c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$4$1$1"
    f = "LocalSparkChainAsrTranslateUseCase.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;[B)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;[B)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final invokeSuspend$lambda$0(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;[B)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/np4;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/android/mltcode/paycertificationapi/np4;->IO([B)Ljava/lang/Integer;

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
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

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-direct {p1, v0, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/np4;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->O00(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/np4;->XOO0ii0(Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->XO0O10(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/android/mltcode/paycertificationapi/b06;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$4$1$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    new-instance v1, Lcom/sma/smartv3/ui/translate/sparkchain/OXO1;

    invoke-direct {v1, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/OXO1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)V

    invoke-interface {p1, v1}, Lcom/android/mltcode/paycertificationapi/b06;->OXO1(Lkotlin/jvm/functions/Function1;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
