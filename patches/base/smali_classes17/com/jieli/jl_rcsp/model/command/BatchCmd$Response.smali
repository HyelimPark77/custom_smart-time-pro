.class public Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/BatchCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Response"
.end annotation


# instance fields
.field private final op:B

.field private final ret:B


# direct methods
.method public constructor <init>(BB)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;->op:B

    iput-byte p2, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;->ret:B

    return-void
.end method


# virtual methods
.method public getOp()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;->op:B

    return v0
.end method

.method public getRet()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/command/BatchCmd$Response;->ret:B

    return v0
.end method
