.class public Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private op:B


# direct methods
.method public constructor <init>(B)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 4
    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;->op:B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;->parse([B)I

    return-void
.end method


# virtual methods
.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;->op:B

    return v0
.end method

.method public parse([B)I
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    array-length v1, p1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    aget-byte p1, p1, v0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;->op:B

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 3

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/file_op/DeviceExtendParamCmd$Response;->op:B

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method
