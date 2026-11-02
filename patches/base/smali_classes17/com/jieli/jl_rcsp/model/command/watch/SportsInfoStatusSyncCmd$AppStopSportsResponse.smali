.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;
.super Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AppStopSportsResponse"
.end annotation


# instance fields
.field public fileId:S

.field public fileSize:I

.field public restoreTime:I

.field public stopTime:I

.field public strengthIntervalTimer:[B


# direct methods
.method public constructor <init>(IISI[B)V
    .locals 2

    .line 2
    invoke-static {p1, p2, p3, p4, p5}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->convertResponseData(IISI[B)[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {p0, v1, v0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>(I[B)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->stopTime:I

    .line 4
    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->restoreTime:I

    .line 5
    iput-short p3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileId:S

    .line 6
    iput p4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileSize:I

    .line 7
    iput-object p5, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->strengthIntervalTimer:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;-><init>([B)V

    return-void
.end method

.method private static convertResponseData(IISI[B)[B
    .locals 1

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-static {p0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    invoke-static {p3}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/OutputStream;->write([B)V

    if-eqz p4, :cond_0

    array-length p0, p4

    if-lez p0, :cond_0

    invoke-virtual {v0, p4}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getResponseType()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->strengthIntervalTimer:[B

    invoke-super {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->parse([B)I

    move-result p1

    if-gtz p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Response;->getResponseData()[B

    move-result-object v1

    if-eqz v1, :cond_3

    array-length v2, v1

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    array-length v2, v1

    const/16 v3, 0xc

    if-ge v2, v3, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    const/4 v2, 0x4

    invoke-static {v1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v4

    iput v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->stopTime:I

    invoke-static {v1, v2, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->restoreTime:I

    const/16 v2, 0x8

    invoke-static {v1, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort([BI)S

    move-result v2

    iput-short v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileId:S

    const/16 v2, 0xa

    const/4 v4, 0x2

    invoke-static {v1, v2, v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    iput v2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->fileSize:I

    array-length v2, v1

    if-ge v3, v2, :cond_3

    array-length v2, v1

    sub-int/2addr v2, v3

    new-array v4, v2, [B

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->strengthIntervalTimer:[B

    invoke-static {v1, v3, v4, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AppStopExerciseResponse{stopTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->stopTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", restoreTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->restoreTime:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", strengthIntervalTimer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$AppStopSportsResponse;->strengthIntervalTimer:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
