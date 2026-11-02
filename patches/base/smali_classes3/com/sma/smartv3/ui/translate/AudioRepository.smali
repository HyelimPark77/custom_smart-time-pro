.class public final Lcom/sma/smartv3/ui/translate/AudioRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/b06;


# instance fields
.field public final OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XO0O10:Lcom/android/mltcode/paycertificationapi/k85;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;Lcom/android/mltcode/paycertificationapi/X0I1OO1;)V
    .locals 1
    .param p1    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lcom/android/mltcode/paycertificationapi/X0I1OO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioOutput"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioInput"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    iput-object p2, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    iput-object p3, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    invoke-interface {p3}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->iO()Lcom/android/mltcode/paycertificationapi/k85;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/k85;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/translate/AudioRepository;Lcom/android/mltcode/paycertificationapi/iXOIii;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/translate/AudioRepository;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/translate/AudioRepository;ZLcom/android/mltcode/paycertificationapi/iXOIii;ILjava/lang/Object;)V
    .locals 0

    const/4 p4, 0x1

    and-int/2addr p3, p4

    if-eqz p3, :cond_0

    move p1, p4

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/ui/translate/AudioRepository;->OIi0(ZLcom/android/mltcode/paycertificationapi/iXOIii;)V

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/ui/translate/AudioRepository;)Lcom/android/mltcode/paycertificationapi/X0I1OO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    return-object p0
.end method


# virtual methods
.method public final I0IIOi(Lcom/android/mltcode/paycertificationapi/iXOIii;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/iXOIii;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    return-void
.end method

.method public final I1XOi1(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/iX1iI;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final IiI10X()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1}, Lcom/android/mltcode/paycertificationapi/iX1iI;->OXO1(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method

.method public final O00(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/zq;->XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final O10IXXX0X()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/AudioRepository$stopRecordAndStreamPlayer$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/AudioRepository$stopRecordAndStreamPlayer$1;-><init>(Lcom/sma/smartv3/ui/translate/AudioRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final OIX0iXi(Lcom/android/mltcode/paycertificationapi/iXOIii;)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/iXOIii;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/iX1iI;->OXO1(Lcom/android/mltcode/paycertificationapi/i00OIXiO;)V

    return-void
.end method

.method public final OIi0(ZLcom/android/mltcode/paycertificationapi/iXOIii;)V
    .locals 2
    .param p2    # Lcom/android/mltcode/paycertificationapi/iXOIii;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1, p2}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/translate/AudioRepository;->IiI10X()V

    :cond_0
    return-void
.end method

.method public OXO1(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-[B",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "audioByte"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    new-instance v2, Lcom/sma/smartv3/ui/translate/AudioRepository$OXO1;

    invoke-direct {v2, p1}, Lcom/sma/smartv3/ui/translate/AudioRepository$OXO1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v0, v1, v2}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lcom/android/mltcode/paycertificationapi/iXOIii;)V

    return-void
.end method

.method public final X0O(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    invoke-interface {v0, p1}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1
.end method

.method public final X1ii()Lkotlinx/coroutines/XiOIO;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/AudioRepository$stopRecord$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/AudioRepository$stopRecord$1;-><init>(Lcom/sma/smartv3/ui/translate/AudioRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    move-result-object v0

    return-object v0
.end method

.method public final XO0O10(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    iget-object v1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-interface {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/zq;->XO0O10(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final XOO0ii0()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    invoke-interface {v0}, Lcom/android/mltcode/paycertificationapi/I1OO;->play()V

    return-void
.end method

.method public final XXI(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;

    iget v1, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;

    invoke-direct {v0, p0, p1}, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;-><init>(Lcom/sma/smartv3/ui/translate/AudioRepository;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_7

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :try_start_2
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    iput v4, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->label:I

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    iput v3, v0, Lcom/sma/smartv3/ui/translate/AudioRepository$stopAllJob$1;->label:I

    invoke-interface {p1, v0}, Lcom/android/mltcode/paycertificationapi/iX1iI;->XIi00iiXO(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->iO:Lcom/android/mltcode/paycertificationapi/X0I1OO1;

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/I0OiOOI1;->clear()V

    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XIi00iiXO:Lcom/android/mltcode/paycertificationapi/i1Ii0IIi0;

    invoke-interface {p1}, Lcom/android/mltcode/paycertificationapi/iX1iI;->clear()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_4
    iget-object p1, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {p1, v5, v4, v5}, Lkotlinx/coroutines/I0IIOi;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    goto :goto_6

    :goto_5
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_4

    :goto_6
    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :goto_7
    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {v0, v5, v4, v5}, Lkotlinx/coroutines/I0IIOi;->IiI10X(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    throw p1
.end method

.method public iO()Lcom/android/mltcode/paycertificationapi/k85;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/android/mltcode/paycertificationapi/k85<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->XO0O10:Lcom/android/mltcode/paycertificationapi/k85;

    return-object v0
.end method

.method public stop()V
    .locals 6

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/AudioRepository;->OXO1:Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object v1

    new-instance v3, Lcom/sma/smartv3/ui/translate/AudioRepository$stop$1;

    const/4 v2, 0x0

    invoke-direct {v3, p0, v2}, Lcom/sma/smartv3/ui/translate/AudioRepository$stop$1;-><init>(Lcom/sma/smartv3/ui/translate/AudioRepository;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method
