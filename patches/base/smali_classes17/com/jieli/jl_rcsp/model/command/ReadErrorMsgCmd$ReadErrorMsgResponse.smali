.class public Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadErrorMsgResponse"
.end annotation


# instance fields
.field private crc:S

.field private size:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->crc:S

    return v0
.end method

.method public getSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->size:I

    return v0
.end method

.method public parseData([B)V
    .locals 3

    if-eqz p1, :cond_2

    array-length v0, p1

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->setSize(I)V

    array-length v0, p1

    const/4 v2, 0x6

    if-le v2, v0, :cond_1

    goto :goto_0

    :cond_1
    aget-byte v0, p1, v1

    const/4 v1, 0x5

    aget-byte p1, p1, v1

    invoke-static {v0, p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort(BB)S

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->setCrc(S)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setCrc(S)V
    .locals 0

    iput-short p1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->crc:S

    return-void
.end method

.method public setSize(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgResponse;->size:I

    return-void
.end method
