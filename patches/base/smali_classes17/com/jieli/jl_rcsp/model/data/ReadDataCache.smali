.class public Lcom/jieli/jl_rcsp/model/data/ReadDataCache;
.super Lcom/jieli/jl_rcsp/model/data/ReadParams;
.source "SourceFile"


# instance fields
.field private mCallback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

.field private final mOutputStream:Ljava/io/ByteArrayOutputStream;

.field private offset:I

.field private seq:I


# direct methods
.method public constructor <init>(Lcom/jieli/jl_rcsp/model/data/ReadParams;)V
    .locals 7

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getDataType()I

    move-result v1

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getVersion()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getSendLimit()I

    move-result v3

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/DataParams;->getReceiveLimit()I

    move-result v4

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getDataLen()I

    move-result v5

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/data/ReadParams;->getCrc()S

    move-result v6

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/jieli/jl_rcsp/model/data/ReadParams;-><init>(IIIIIS)V

    new-instance p1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {p1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, v0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mOutputStream:Ljava/io/ByteArrayOutputStream;

    const/4 p1, -0x1

    iput p1, v0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->seq:I

    return-void
.end method


# virtual methods
.method public getCallback()Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mCallback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    return-object v0
.end method

.method public getOffset()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->offset:I

    return v0
.end method

.method public getOutputData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mOutputStream:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getSeq()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->seq:I

    return v0
.end method

.method public putData([B)Z
    .locals 1

    if-eqz p1, :cond_0

    array-length v0, p1

    if-lez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mOutputStream:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mOutputStream:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->offset:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->seq:I

    return-void
.end method

.method public setCallback(Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mCallback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    return-void
.end method

.method public setOffset(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->offset:I

    return-void
.end method

.method public setSeq(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->seq:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReadDataCache{mOutputStream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mOutputStream:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mCallback="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->mCallback:Lcom/jieli/jl_rcsp/interfaces/data/OnDataEventCallback;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->offset:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", seq="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/data/ReadDataCache;->seq:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
