.class public final Lcom/sma/smartv3/util/tts/ServerTTSStrategy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/jl5;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nServerTTSStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n310#2,9:91\n319#2,2:101\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n*L\n56#1:91,9\n56#1:101,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nServerTTSStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n310#2,9:91\n319#2,2:101\n1#3:100\n*S KotlinDebug\n*F\n+ 1 ServerTTSStrategy.kt\ncom/sma/smartv3/util/tts/ServerTTSStrategy\n*L\n56#1:91,9\n56#1:101,2\n*E\n"
    }
.end annotation


# instance fields
.field public final OXO1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public final XIi00iiXO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public iO:Lkotlinx/coroutines/OIX0iXi;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/OIX0iXi<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "ServerTTSStrategy"

    iput-object v0, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->OXO1:Ljava/lang/String;

    const-string v0, "ServerTTSStrategy requestText2Audio"

    iput-object v0, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->XIi00iiXO:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic XIi00iiXO(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->XIi00iiXO:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic XO0O10(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->O00(Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic iO(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->OXO1:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final O00(Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/tts/TTSData;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Result<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;

    iget v1, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;

    invoke-direct {v0, p0, p2}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;-><init>(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->result:Ljava/lang/Object;

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lcom/sma/smartv3/util/tts/TTSData;

    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->X1ii(Ljava/lang/Object;)V

    iput-object p1, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->L$0:Ljava/lang/Object;

    const/4 p2, 0x0

    iput p2, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->I$0:I

    iput v3, v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$requestTextToAudio$1;->label:I

    new-instance p2, Lkotlinx/coroutines/XIi00iiXO;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->O00(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v2

    invoke-direct {p2, v2, v3}, Lkotlinx/coroutines/XIi00iiXO;-><init>(Lkotlin/coroutines/Continuation;I)V

    invoke-virtual {p2}, Lkotlinx/coroutines/XIi00iiXO;->XXX11i()V

    new-instance v2, Ljava/io/File;

    sget-object v3, Lcom/android/mltcode/paycertificationapi/sz0;->OXO1:Lcom/android/mltcode/paycertificationapi/sz0;

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/uz0;->I0iXXO(Lcom/android/mltcode/paycertificationapi/sz0;)Ljava/io/File;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "ai_tts_"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ".mp3"

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    sget-object v3, Lcom/sma/smartv3/network/NetWorkUtils;->INSTANCE:Lcom/sma/smartv3/network/NetWorkUtils;

    sget-object v4, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v4}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v4

    const-string v5, "/ai/text2Audio"

    invoke-virtual {v3, v4, v5}, Lcom/sma/smartv3/network/NetWorkUtils;->convertBaseUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/sma/smartv3/util/tts/TTSData;->XOO0ii0()Ljava/lang/String;

    move-result-object v4

    const-string v5, "text"

    invoke-virtual {v3, v5, v4}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v3

    const-string v4, "model"

    invoke-virtual {p1}, Lcom/sma/smartv3/util/tts/TTSData;->IiI10X()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, v4, p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    sget-object v3, Lcom/androidnetworking/common/Priority;->LOW:Lcom/androidnetworking/common/Priority;

    invoke-virtual {p1, v3}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->XIi00iiXO(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/androidnetworking/common/ANRequest;->executeForOkHttpResponse()Lcom/androidnetworking/common/ANResponse;

    move-result-object p1

    :try_start_0
    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    goto :goto_1

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    move-result v3

    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/Boxing;->IiI10X(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v4

    :goto_2
    invoke-virtual {p1}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p1

    goto :goto_3

    :cond_5
    move-object p1, v4

    :goto_3
    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object p1

    goto :goto_4

    :cond_6
    move-object p1, v4

    :goto_4
    if-nez v3, :cond_7

    goto :goto_5

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/16 v5, 0xc8

    if-ne v3, v5, :cond_8

    if-eqz p1, :cond_8

    :try_start_1
    invoke-static {p1}, Lkotlin/io/ByteStreamsKt;->X0O(Ljava/io/InputStream;)[B

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {p1, v4}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    invoke-static {v2, v3}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[B)Z

    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :catchall_0
    move-exception v2

    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v3

    :try_start_4
    invoke-static {p1, v2}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3

    :cond_8
    :goto_5
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Ljava/io/IOException;

    const-string v2, "Empty Response"

    invoke-direct {p1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lkotlin/ResultKt;->OXO1(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_7

    :goto_6
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->OXO1(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p2, p1}, Lkotlin/coroutines/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_7
    new-instance p1, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$OXO1;-><init>(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;)V

    invoke-interface {p2, p1}, Lcom/android/mltcode/paycertificationapi/IO0i;->iX(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p2}, Lkotlinx/coroutines/XIi00iiXO;->OII()Ljava/lang/Object;

    move-result-object p2

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/pb;->I0iXXO()Ljava/lang/Object;

    move-result-object p1

    if-ne p2, p1, :cond_9

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->iO(Lkotlin/coroutines/Continuation;)V

    :cond_9
    if-ne p2, v1, :cond_a

    return-object v1

    :cond_a
    :goto_8
    check-cast p2, Lkotlin/Result;

    invoke-virtual {p2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public OXO1(Lcom/sma/smartv3/util/tts/TTSData;Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lcom/sma/smartv3/util/tts/TTSData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/android/mltcode/paycertificationapi/i00OIXiO;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p3    # Lkotlin/coroutines/Continuation;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/util/tts/TTSData;",
            "Lcom/android/mltcode/paycertificationapi/i00OIXiO;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/IXOX0Xiii;->iO()Lkotlinx/coroutines/CoroutineDispatcher;

    move-result-object p2

    new-instance v0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$execute$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/sma/smartv3/util/tts/ServerTTSStrategy$execute$2;-><init>(Lcom/sma/smartv3/util/tts/ServerTTSStrategy;Lcom/sma/smartv3/util/tts/TTSData;Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, v0, p3}, Lcom/android/mltcode/paycertificationapi/I100X1;->I0IIOi(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public cancel()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/util/tts/ServerTTSStrategy;->iO:Lkotlinx/coroutines/OIX0iXi;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/XiOIO$OXO1;->XIi00iiXO(Lkotlinx/coroutines/XiOIO;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    :cond_0
    return-void
.end method
