.class final Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->OiIIX101O(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;)Lkotlinx/coroutines/XiOIO;
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
    c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$saveItem$1"
    f = "LocalSparkChainAsrTranslateUseCase.kt"
    i = {}
    l = {
        0x3a
    }
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field final synthetic $aiMsg:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->$aiMsg:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

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

    new-instance p1, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->$aiMsg:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-direct {p1, v0, v1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {v2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;

    move-result-object v2

    iget-object v4, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->$aiMsg:Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    iget-object v5, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {v5}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->O00(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->X0O()Ljava/lang/String;

    move-result-object v11

    iget-object v5, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;

    invoke-static {v5}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;->O00(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;

    move-result-object v5

    invoke-virtual {v5}, Lcom/sma/smartv3/ui/translate/sparkchain/XO0O10;->iIiiO()Ljava/lang/String;

    move-result-object v12

    const/16 v17, 0xf3f

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->X1ii(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    move-result-object v4

    iput v3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$saveItem$1;->label:I

    invoke-virtual {v2, v4, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainSessionRepository;->XIi00iiXO(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
