.class public final synthetic Lcom/jieli/jl_audio_decode/tool/OXO1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

.field public final synthetic IO:Lcom/jieli/jl_audio_decode/tool/OperationThread;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_audio_decode/tool/OperationThread;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/tool/OXO1;->IO:Lcom/jieli/jl_audio_decode/tool/OperationThread;

    iput-object p2, p0, Lcom/jieli/jl_audio_decode/tool/OXO1;->I1:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/OXO1;->IO:Lcom/jieli/jl_audio_decode/tool/OperationThread;

    iget-object v1, p0, Lcom/jieli/jl_audio_decode/tool/OXO1;->I1:Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;

    invoke-static {v0, v1}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->XIi00iiXO(Lcom/jieli/jl_audio_decode/tool/OperationThread;Lcom/jieli/jl_audio_decode/callback/OnThreadFinishListener;)V

    return-void
.end method
