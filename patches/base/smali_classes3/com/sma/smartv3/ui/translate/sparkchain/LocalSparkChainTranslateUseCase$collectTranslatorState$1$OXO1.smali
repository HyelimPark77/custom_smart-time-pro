.class public final Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/IXiXI;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;[B)Lkotlin/Unit;
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->XOO0ii0(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Lcom/sma/smartv3/ui/translate/sparkchain/iO;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/iO;->OIi0([B)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;[B)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IiI10X(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;[B)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final O00(Lcom/sma/smartv3/ui/translate/sparkchain/O00;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/translate/sparkchain/O00;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p2, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->IiI10X(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " STATE :"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    instance-of p2, p1, Lcom/sma/smartv3/ui/translate/sparkchain/O00$iO;

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    iget-object p2, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/qr;

    invoke-direct {v0, p2}, Lcom/android/mltcode/paycertificationapi/qr;-><init>(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lcom/sma/smartv3/ui/translate/sparkchain/O00$OXO1;

    if-eqz p2, :cond_1

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/O00$OXO1;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/O00$OXO1;->IiI10X()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/AudioRepository;->stop()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->IO:Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;

    invoke-static {p1}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;->iO(Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase;)Lcom/sma/smartv3/ui/translate/AudioRepository;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/translate/AudioRepository;->stop()V

    :goto_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/sma/smartv3/ui/translate/sparkchain/O00;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainTranslateUseCase$collectTranslatorState$1$OXO1;->O00(Lcom/sma/smartv3/ui/translate/sparkchain/O00;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
