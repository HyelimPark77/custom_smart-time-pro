.class public final Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO;
.super Lcom/blankj/utilcode/util/ThreadUtils$SimpleTask;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/biz/wx/WxManager;->iOX()V
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
    invoke-virtual {p0}, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO;->doInBackground()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public doInBackground()Ljava/lang/Void;
    .locals 4

    .line 2
    sget-object v0, Lcom/sma/smartv3/biz/wx/WxManager;->OXO1:Lcom/sma/smartv3/biz/wx/WxManager;

    const/4 v1, 0x1

    invoke-static {v1}, Lcom/sma/smartv3/biz/wx/WxManager;->II1Xi0(Z)V

    .line 3
    new-instance v1, Ljava/io/PipedInputStream;

    invoke-direct {v1}, Ljava/io/PipedInputStream;-><init>()V

    invoke-static {v1}, Lcom/sma/smartv3/biz/wx/WxManager;->OII(Ljava/io/PipedInputStream;)V

    .line 4
    new-instance v1, Ljava/io/PipedOutputStream;

    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO()Ljava/io/PipedInputStream;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/PipedOutputStream;-><init>(Ljava/io/PipedInputStream;)V

    invoke-static {v1}, Lcom/sma/smartv3/biz/wx/WxManager;->iOOX010X(Ljava/io/PipedOutputStream;)V

    .line 5
    new-instance v1, Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->I0iXXO()Ljava/io/PipedInputStream;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;-><init>(Ljava/io/InputStream;I)V

    invoke-static {v1}, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIii1(Lcom/baidu/ai/speech/realtime/full/connection/Runner;)V

    .line 6
    invoke-static {}, Lcom/sma/smartv3/biz/wx/WxManager;->OIX0iXi()Lcom/baidu/ai/speech/realtime/full/connection/Runner;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO$OXO1;

    invoke-direct {v2}, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO$OXO1;-><init>()V

    invoke-virtual {v1, v2}, Lcom/baidu/ai/speech/realtime/full/connection/Runner;->run(Lcom/baidu/ai/speech/realtime/full/download/SimpleDownloader;)V

    .line 7
    :cond_0
    invoke-static {v0}, Lcom/sma/smartv3/biz/wx/WxManager;->XiOIO(Lcom/sma/smartv3/biz/wx/WxManager;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 2
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/biz/wx/WxManager$XIi00iiXO;->onSuccess(Ljava/lang/Void;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Void;)V
    .locals 0

    .line 1
    return-void
.end method
