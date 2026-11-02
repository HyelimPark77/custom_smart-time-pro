.class public Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReadErrorMsgParam"
.end annotation


# static fields
.field public static final READ_START:I = 0x0

.field public static final READ_STOP:I = 0x1


# instance fields
.field private op:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method


# virtual methods
.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->op:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public parseData([B)V
    .locals 1

    if-eqz p1, :cond_1

    array-length v0, p1

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte p1, p1, v0

    invoke-static {p1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->setOp(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setOp(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/ReadErrorMsgCmd$ReadErrorMsgParam;->op:I

    return-void
.end method
