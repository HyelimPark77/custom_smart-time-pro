.class public abstract Lcom/jieli/jl_audio_decode/tool/BaseManager;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract decodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
.end method

.method public abstract encodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/callback/OnStateCallback;)V
.end method

.method public abstract isDecodeStream()Z
.end method

.method public abstract nativeAddAudioStream(I[B)Z
.end method

.method public abstract nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract nativeDecodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
.end method

.method public abstract nativeDecodeStream(I)V
.end method

.method public abstract nativeDecodeStream(ILcom/jieli/jl_audio_decode/opus/model/OpusOption;)V
.end method

.method public abstract nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;)I
.end method

.method public abstract nativeEncodeFile(Ljava/lang/String;Ljava/lang/String;Lcom/jieli/jl_audio_decode/opus/model/OpusOption;)I
.end method

.method public abstract startDecodeStream(Lcom/jieli/jl_audio_decode/callback/OnDecodeStreamCallback;)V
.end method

.method public abstract stopDecodeStream()V
.end method

.method public abstract writeAudioStream([B)V
.end method
