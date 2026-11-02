.class final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
        "Ljava/lang/String;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$saveFlow$1"
    f = "SparkChainMultiDeviceViewModel.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;

    invoke-direct {v0, p3}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;-><init>(Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->L$1:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->invoke(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->L$0:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    iget-object v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->L$1:Ljava/lang/Object;

    move-object v3, v1

    check-cast v3, Ljava/lang/String;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$saveFlow$1;->label:I

    if-nez v1, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    const/16 v15, 0xffe

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v2 .. v16}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;->X1ii(Lcom/android/mltcode/paycertificationapi/iOIXXXII0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    move-result-object v1

    return-object v1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
