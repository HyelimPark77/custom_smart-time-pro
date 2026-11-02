.class Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "MyHandler"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;Landroid/os/Looper;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x1010,
            0x0
        }
        names = {
            "this$0",
            "looper"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private handleWrite32Command([F)V
    .locals 4
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->XO0O10(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)I

    move-result v2

    div-int/lit8 v2, v2, 0x4

    array-length v3, p1

    sub-int/2addr v3, v1

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget-object v3, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v3}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v3

    invoke-virtual {v3, p1, v1, v2, v0}, Landroid/media/AudioTrack;->write([FIII)I

    add-int/2addr v1, v2

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private handleWriteCommand([B)V
    .locals 3
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "data"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v0}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {v0}, Landroid/media/AudioTrack;->getPlayState()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->XO0O10(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)I

    move-result v1

    array-length v2, p1

    sub-int/2addr v2, v0

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget-object v2, p0, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->this$0:Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;

    invoke-static {v2}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;->iO(Lcom/sma/smartv3/biz/voice/ai/PcmPlayer;)Landroid/media/AudioTrack;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Landroid/media/AudioTrack;->write([BII)I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3
    .param p1    # Landroid/os/Message;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x0
        }
        names = {
            "msg"
        }
    .end annotation

    const-string v0, "PcmPlayer"

    :try_start_0
    iget v1, p1, Landroid/os/Message;->what:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported command: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Landroid/os/Message;->what:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, [F

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->handleWrite32Command([F)V

    return-void

    :cond_1
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, [B

    invoke-direct {p0, p1}, Lcom/sma/smartv3/biz/voice/ai/PcmPlayer$MyHandler;->handleWriteCommand([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_0
    const-string v1, "Error handling message"

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method
