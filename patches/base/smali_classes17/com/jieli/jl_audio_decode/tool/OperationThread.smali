.class abstract Lcom/jieli/jl_audio_decode/tool/OperationThread;
.super Ljava/lang/Thread;
.source "SourceFile"


# static fields
.field public static final OP_ADD_STREAM_DATA:I = 0x3

.field public static final OP_DECODE_FILE:I = 0x1

.field public static final OP_ENCODE_FILE:I = 0x2


# instance fields
.field protected final callback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field protected final listener:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

.field protected final manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

.field protected final uiHandler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/jieli/jl_audio_decode/tool/BaseManager;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/jieli/jl_audio_decode/tool/OperationThread;-><init>(Ljava/lang/String;Lcom/jieli/jl_audio_decode/tool/BaseManager;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/jieli/jl_audio_decode/tool/BaseManager;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    .line 3
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->uiHandler:Landroid/os/Handler;

    .line 4
    iput-object p2, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->manager:Lcom/jieli/jl_audio_decode/tool/BaseManager;

    .line 5
    iput-object p3, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    .line 6
    iput-object p4, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->listener:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

    return-void
.end method

.method public static synthetic OXO1(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;ILjava/lang/String;)V
    .locals 0

    invoke-interface {p0, p1, p2}, Lcom/jieli/jl_audio_decode/callback/OnStateCallback;->onError(ILjava/lang/String;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/jieli/jl_audio_decode/tool/OperationThread;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-interface {p1, v0, v1}, Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;->onThreadFinish(J)V

    return-void
.end method


# virtual methods
.method public callbackError(I)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/jieli/jl_audio_decode/constant/ErrorCode;->getErrorMsg(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callbackError(ILjava/lang/String;)V

    return-void
.end method

.method public callbackError(ILjava/lang/String;)V
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->callback:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->uiHandler:Landroid/os/Handler;

    new-instance v2, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;

    invoke-direct {v2, v0, p1, p2}, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;-><init>(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;ILjava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public onThreadFinish()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->listener:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/OperationThread;->uiHandler:Landroid/os/Handler;

    new-instance v2, Lcom/jieli/jl_audio_decode/tool/OXO1;

    invoke-direct {v2, p0, v0}, Lcom/jieli/jl_audio_decode/tool/OXO1;-><init>(Lcom/jieli/jl_audio_decode/tool/OperationThread;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public abstract operation()I
.end method
