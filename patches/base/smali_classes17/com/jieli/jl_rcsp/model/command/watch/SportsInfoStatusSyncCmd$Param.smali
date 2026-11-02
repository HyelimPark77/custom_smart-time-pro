.class public Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field private data:[B

.field private op:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    .line 8
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 9
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->op:B

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 10
    new-array p2, p1, [B

    :cond_0
    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/jieli/jl_rcsp/exception/ParseDataException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->parse([B)I

    move-result p1

    if-ltz p1, :cond_2

    if-lez p1, :cond_1

    .line 3
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getParamType()I

    move-result p1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_1

    .line 4
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result v0

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 6
    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->getOp()B

    move-result v2

    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Operation[%d] does not match the target operation[%d]."

    invoke-static {v1, v2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x2

    invoke-direct {v0, v1, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    return-void

    .line 7
    :cond_2
    new-instance v0, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failure to parse data. size = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1, v1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw v0
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    return-object v0
.end method

.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->op:B

    return v0
.end method

.method public getParamData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public getParamType()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    if-eqz p1, :cond_2

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v1, p1, v0

    iput-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->op:B

    array-length v1, p1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    array-length p1, p1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->op:B

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SportsInfoStatusSyncCmd$Param;->data:[B

    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    :try_start_0
    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method
