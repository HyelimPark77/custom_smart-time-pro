.class public Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;
.super Lcom/jieli/jl_audio_decode/tool/OperationThread;
.source "SourceFile"


# instance fields
.field private final inFile:Ljava/lang/String;

.field private final opusOption:Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

.field private final outFile:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 1

    const-string v0, "DecodeFileThread"

    invoke-direct {p0, v0, p1, p5, p6}, Lcom/jieli/jl_audio_decode/tool/OperationThread;-><init>(Ljava/lang/String;Lcom/jieli/jl_audio_decode/tool/BaseManager;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    iput-object p2, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->inFile:Ljava/lang/String;

    iput-object p3, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->outFile:Ljava/lang/String;

    iput-object p4, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->opusOption:Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    return-void
.end method


# virtual methods
.method public operation()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public run()V
    .locals 4

    invoke-super {p0}, Ljava/lang/Thread;->run()V

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

    if-eqz v0, :cond_1

    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->inFile:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->inFile:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->outFile:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->inFile:Ljava/lang/String;

    iget-object v2, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->outFile:Ljava/lang/String;

    iget-object v3, p0, Lcom/jieli/jl_audio_decode/tool/DecodeFileThread;->opusOption:Lcom/jieli/jl_audio_decode/opus/model/OpusOption;

    invoke-virtual {v0, v1, v2, v3}, Lcom/jieli/jl_audio_decode/tool/BaseManager;->nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(I)V

    goto :goto_0

    :cond_0
    const/16 v0, -0x3ea

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(I)V

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(I)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->onThreadFinish()V

    return-void
.end method
