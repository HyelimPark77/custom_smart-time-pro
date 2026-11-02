.class public Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Param"
.end annotation


# instance fields
.field public data:[B

.field private mask:I

.field public type:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    .line 5
    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->mask:I

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
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->parse([B)I

    move-result v0

    if-ltz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Lcom/jieli/jl_rcsp/exception/ParseDataException;

    const/4 v1, 0x1

    const-string v2, "Failed to parse data."

    invoke-direct {v0, v1, v2, p1}, Lcom/jieli/jl_rcsp/exception/ParseDataException;-><init>(ILjava/lang/String;[B)V

    throw v0
.end method


# virtual methods
.method public getMask()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->mask:I

    return v0
.end method

.method public getParamData()[B
    .locals 1

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->toData()[B

    move-result-object v0

    return-object v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->data:[B

    if-eqz p1, :cond_3

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    array-length v1, p1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    invoke-static {p1, v0, v2}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->type:I

    array-length v1, p1

    if-le v1, v2, :cond_2

    array-length v1, p1

    sub-int/2addr v1, v2

    new-array v3, v1, [B

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->data:[B

    invoke-static {p1, v2, v3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    array-length p1, p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/watch/SensorLogCmd$Param;->mask:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v0

    return-object v0
.end method
