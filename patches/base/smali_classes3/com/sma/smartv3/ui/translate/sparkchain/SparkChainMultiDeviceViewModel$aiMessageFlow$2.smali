.class final Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function4;


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
        "Lkotlin/jvm/functions/Function4<",
        "Lcom/android/mltcode/paycertificationapi/IXiXI<",
        "-",
        "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
        ">;",
        "Lcom/android/mltcode/paycertificationapi/i1iII1i1;",
        "Ljava/lang/String;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/DebugMetadata;
    c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$aiMessageFlow$2"
    f = "SparkChainMultiDeviceViewModel.kt"
    i = {
        0x0,
        0x0,
        0x0
    }
    l = {
        0x42
    }
    m = "invokeSuspend"
    n = {
        "$this$combineTransform",
        "asr",
        "translate"
    }
    s = {
        "L$0",
        "L$1",
        "L$2"
    }
    v = 0x1
.end annotation


# instance fields
.field private synthetic L$0:Ljava/lang/Object;

.field synthetic L$1:Ljava/lang/Object;

.field synthetic L$2:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;Lkotlin/coroutines/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lcom/android/mltcode/paycertificationapi/i1iII1i1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/android/mltcode/paycertificationapi/IXiXI<",
            "-",
            "Lcom/android/mltcode/paycertificationapi/iOIXXXII0;",
            ">;",
            "Lcom/android/mltcode/paycertificationapi/i1iII1i1;",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    invoke-direct {v0, v1, p4}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;Lkotlin/coroutines/Continuation;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$2:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    check-cast p2, Lcom/android/mltcode/paycertificationapi/i1iII1i1;

    check-cast p3, Ljava/lang/String;

    check-cast p4, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->invoke(Lcom/android/mltcode/paycertificationapi/IXiXI;Lcom/android/mltcode/paycertificationapi/i1iII1i1;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$0:Ljava/lang/Object;

    check-cast v1, Lcom/android/mltcode/paycertificationapi/IXiXI;

    iget-object v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$1:Ljava/lang/Object;

    check-cast v2, Lcom/android/mltcode/paycertificationapi/i1iII1i1;

    iget-object v3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$2:Ljava/lang/Object;

    move-object v9, v3

    check-cast v9, Ljava/lang/String;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v3

    iget v4, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-ne v4, v5, :cond_0

    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i1iII1i1;->O00()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_2
    if-eqz v9, :cond_4

    invoke-static {v9}, Lkotlin/text/StringsKt__StringsKt;->i0XI0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/i1iII1i1;->O00()Ljava/lang/String;

    move-result-object v10

    iget-object v4, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->this$0:Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    invoke-static {v4}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;->access$getDeviceType$p(Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;)I

    move-result v4

    move v6, v4

    new-instance v4, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;

    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/Boxing;->IiI10X(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v17, 0xfcd

    const/16 v18, 0x0

    move v7, v5

    const/4 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v20, v2

    move/from16 v2, v19

    invoke-direct/range {v4 .. v18}, Lcom/android/mltcode/paycertificationapi/iOIXXXII0;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$0:Ljava/lang/Object;

    invoke-static/range {v20 .. v20}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$1:Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->L$2:Ljava/lang/Object;

    iput v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$aiMessageFlow$2;->label:I

    invoke-interface {v1, v4, v0}, Lcom/android/mltcode/paycertificationapi/IXiXI;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    :goto_0
    sget-object v1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v1
.end method
