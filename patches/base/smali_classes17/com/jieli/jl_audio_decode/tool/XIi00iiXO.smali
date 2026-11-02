.class public final synthetic Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic I1:I

.field public final synthetic IO:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

.field public final synthetic iX1O1:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->IO:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    iput p2, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->I1:I

    iput-object p3, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->iX1O1:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->IO:Lcom/jieli/jl_audio_decode/callback/OnStateCallback;

    iget v1, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->I1:I

    iget-object v2, p0, Lcom/jieli/jl_audio_decode/tool/XIi00iiXO;->iX1O1:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lcom/jieli/jl_audio_decode/tool/OperationThread;->OXO1(Lcom/jieli/jl_audio_decode/callback/OnStateCallback;ILjava/lang/String;)V

    return-void
.end method
