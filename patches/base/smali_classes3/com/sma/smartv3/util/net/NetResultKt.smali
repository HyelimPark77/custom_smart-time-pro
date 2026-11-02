.class public final Lcom/sma/smartv3/util/net/NetResultKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNetResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNetResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"
    }
.end annotation


# direct methods
.method public static final OXO1(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4
    .param p0    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p1    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/net/ApiResponse<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/net/NetResult<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;

    iget v1, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;

    invoke-direct {v0, p1}, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;-><init>(Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/net/http/HttpException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {p0}, Lkotlin/coroutines/jvm/internal/SpillingKt;->OXO1(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/util/net/NetResultKt$safeApiCall$1;->label:I

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result p0

    if-eqz p0, :cond_4

    new-instance p0, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    return-object p0

    :cond_4
    invoke-virtual {p1}, Lcom/sma/smartv3/util/net/ApiResponse;->getMesg()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_5

    const-string p0, "Business Error"

    :cond_5
    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/net/http/HttpException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_6

    const-string p0, "Unknown Error"

    :cond_6
    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :catch_1
    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string p0, "Network Error"

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :catch_2
    move-exception p0

    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/o51;->OXO1(Landroid/net/http/HttpException;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Http "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    :goto_2
    return-object p1
.end method

.method public static final XIi00iiXO(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/net/ApiResponse<",
            "TT;>;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lcom/sma/smartv3/util/net/NetResult<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/util/net/ApiResponse;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/net/ApiResponse;->isSuccess()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;

    invoke-virtual {p0}, Lcom/sma/smartv3/util/net/ApiResponse;->getData()Ljava/lang/Object;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$XIi00iiXO;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/util/net/ApiResponse;->getMesg()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    const-string p0, "Business Error"

    :cond_1
    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/net/http/HttpException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p0

    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    goto :goto_0

    :cond_2
    const-string p0, "Unknown Error"

    :goto_0
    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    const-string p0, "Network Error"

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catch_2
    move-exception p0

    new-instance p1, Lcom/sma/smartv3/util/net/NetResult$OXO1;

    invoke-static {p0}, Lcom/android/mltcode/paycertificationapi/o51;->OXO1(Landroid/net/http/HttpException;)Ljava/lang/String;

    move-result-object p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Http "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/net/NetResult$OXO1;-><init>(Ljava/lang/String;)V

    :goto_1
    return-object p1
.end method
