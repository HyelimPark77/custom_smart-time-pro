.class public final Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->startRealTime()V
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic doInBackground()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 3

    .line 2
    :try_start_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    const/4 v0, 0x1

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$setRealTimeRunning$p(Z)V

    .line 3
    new-instance v0, Ljava/io/PipedInputStream;

    invoke-direct {v0}, Ljava/io/PipedInputStream;-><init>()V

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$setMInputStream$p(Ljava/io/PipedInputStream;)V

    .line 4
    new-instance v0, Ljava/io/PipedOutputStream;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMInputStream$p()Ljava/io/PipedInputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/PipedOutputStream;-><init>(Ljava/io/PipedInputStream;)V

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$setMOutputStream$p(Ljava/io/PipedOutputStream;)V

    .line 5
    new-instance v0, Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMInputStream$p()Ljava/io/PipedInputStream;

    move-result-object v1

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;-><init>(Ljava/io/InputStream;I)V

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$setMFullRunner$p(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V

    .line 6
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMFullRunner$p()Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1$doInBackground$1;

    invoke-direct {v1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1$doInBackground$1;-><init>()V

    invoke-virtual {v0, v1}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;->run(Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const v1, 0x7f141286

    .line 7
    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v2}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 8
    invoke-static {}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$getMIdentificationCallback$p()Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$OnIdentificationCallback;->onIdentificationError(Ljava/lang/String;)V

    .line 9
    :cond_0
    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;->access$pollCheckStop(Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/voice/v2/AIIdentificationManager$startRealTime$1;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
