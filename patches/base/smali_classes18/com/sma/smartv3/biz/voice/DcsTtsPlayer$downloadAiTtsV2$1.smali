.class public final Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->downloadAiTtsV2(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDcsTtsPlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DcsTtsPlayer.kt\ncom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,623:1\n1#2:624\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $callback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->$url:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->$callback:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 8

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->$url:Ljava/lang/String;

    invoke-static {v0}, Lcom/androidnetworking/AndroidNetworking;->get(Ljava/lang/String;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    .line 3
    sget-object v1, Lcom/androidnetworking/common/Priority;->LOW:Lcom/androidnetworking/common/Priority;

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setPriority(Lcom/androidnetworking/common/Priority;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    .line 4
    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getOPENAI_TTS_URL$p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->setTag(Ljava/lang/Object;)Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;

    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest$GetRequestBuilder;->build()Lcom/androidnetworking/common/ANRequest;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/androidnetworking/common/ANRequest;->executeForOkHttpResponse()Lcom/androidnetworking/common/ANResponse;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->$callback:Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x0

    .line 7
    :try_start_0
    invoke-virtual {v0}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_6

    .line 8
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lokhttp3/Response;->code()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    .line 9
    :goto_1
    invoke-virtual {v0}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object v4

    goto :goto_2

    :cond_2
    move-object v4, v2

    :goto_2
    if-nez v3, :cond_3

    goto/16 :goto_5

    .line 10
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v5, 0xc8

    if-ne v3, v5, :cond_7

    if-eqz v4, :cond_4

    .line 11
    invoke-virtual {v4}, Lokhttp3/ResponseBody;->byteStream()Ljava/io/InputStream;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :cond_4
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_6

    .line 12
    :try_start_1
    invoke-static {v3}, Lkotlin/io/ByteStreamsKt;->X0O(Ljava/io/InputStream;)[B

    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {v3, v2}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 13
    sget-object v3, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->access$getTAG$p()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/androidnetworking/common/ANResponse;->getOkHttpResponse()Lokhttp3/Response;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v0

    goto :goto_4

    :cond_5
    move-object v0, v2

    :goto_4
    array-length v6, v4

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " downloadOpenAiTtsV2 -> "

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    .line 14
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getMTtsFile()Ljava/io/File;

    move-result-object v0

    invoke-static {v0, v4}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[B)Z

    if-eqz v1, :cond_8

    .line 15
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :catchall_0
    move-exception v0

    .line 16
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v3, v0}, Lkotlin/io/CloseableKt;->OXO1(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4

    :cond_6
    if-eqz v1, :cond_8

    .line 17
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    goto :goto_7

    :cond_7
    :goto_5
    if-eqz v1, :cond_8

    .line 18
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_7

    .line 19
    :goto_6
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    if-eqz v1, :cond_8

    .line 20
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Unit;

    :cond_8
    :goto_7
    return-object v2
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer$downloadAiTtsV2$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
