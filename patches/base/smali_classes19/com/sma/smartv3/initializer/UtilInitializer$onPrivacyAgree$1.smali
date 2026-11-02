.class final Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/initializer/UtilInitializer;->XOO0ii0(Ljava/lang/Object;)V
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
    c = "com.sma.smartv3.initializer.UtilInitializer$onPrivacyAgree$1"
    f = "UtilInitializer.kt"
    i = {}
    l = {}
    m = "invokeSuspend"
    n = {}
    s = {}
    v = 0x1
.end annotation


# instance fields
.field label:I


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;",
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

    new-instance p1, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;

    invoke-direct {p1, p2}, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;-><init>(Lkotlin/coroutines/Continuation;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;->create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;

    sget-object p2, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lcom/android/mltcode/paycertificationapi/i00OIXiO;

    check-cast p2, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;->invoke(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    iget v0, p0, Lcom/sma/smartv3/initializer/UtilInitializer$onPrivacyAgree$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    sget-object p1, Lcom/sma/smartv3/initializer/UtilInitializer;->IO:Lcom/sma/smartv3/initializer/UtilInitializer;

    sget-object v0, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OIX0iXi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OX110i(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->X1IX(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XiOIO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->iIiiO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XX1Oi(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->XX0(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v1

    invoke-static {p1, v1, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/uz0;->OO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v0

    invoke-static {p1, v0, v2, v3, v4}, Lcom/sma/smartv3/initializer/UtilInitializer;->IiI10X(Lcom/sma/smartv3/initializer/UtilInitializer;Ljava/io/File;IILjava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
