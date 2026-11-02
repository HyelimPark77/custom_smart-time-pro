.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadSportsInfoResponse"
.end annotation


# instance fields
.field public hasGps:Z

.field public heartRateMode:B

.field public id:I

.field public readReadDataInterval:I

.field public status:B

.field public type:B


# direct methods
.method public constructor <init>(BBIZBI)V
    .locals 2

    .line 1
    invoke-static/range {p1 .. p6}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->convertResponseData(BBIZBI)[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>(I[B)V

    .line 2
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->type:B

    .line 3
    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->status:B

    .line 4
    iput p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->id:I

    .line 5
    iput-boolean p4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->hasGps:Z

    .line 6
    iput-byte p5, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->heartRateMode:B

    .line 7
    iput p6, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->readReadDataInterval:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>([B)V

    return-void
.end method

.method private static convertResponseData(BBIZBI)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v0, p3}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-virtual {v0, p4}, Ljava/io/ByteArrayOutputStream;->write(I)V

    invoke-static {p5}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getResponseType()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public parse([B)I
    .locals 3

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getResponseData()[B

    move-result-object v0

    if-eqz v0, :cond_4

    array-length v1, v0

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    array-length v1, v0

    const/16 v2, 0xa

    if-ge v1, v2, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->type:B

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->status:B

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->id:I

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    iput-boolean v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->hasGps:Z

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->heartRateMode:B

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->readReadDataInterval:I

    :cond_4
    :goto_1
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReadExerciseInfoResponse{mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->type:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->status:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", hasGps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->hasGps:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateMode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$ReadSportsInfoResponse;->heartRateMode:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
