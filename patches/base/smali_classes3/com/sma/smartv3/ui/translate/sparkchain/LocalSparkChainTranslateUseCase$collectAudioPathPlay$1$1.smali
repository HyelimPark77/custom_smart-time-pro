.class public final Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$updateAiRecord"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMAudioPath(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;->IiI10X(Ljava/lang/String;Lcom/sma/smartv3/db/entity/AIRecords;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final O00(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/pr;

    invoke-direct {v2, p1}, Lcom/android/mltcode/paycertificationapi/pr;-><init>(Ljava/lang/String;)V

    iput-object p1, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;->label:I

    invoke-virtual {p2, v2, v0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iOOX010X(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-static {p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->XIi00iiXO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Lcom/sma/smartv3/util/audio_play/MediaPlayManager;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/sma/smartv3/util/audio_play/MediaPlayManager;->iO(Ljava/lang/String;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1;->O00(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
