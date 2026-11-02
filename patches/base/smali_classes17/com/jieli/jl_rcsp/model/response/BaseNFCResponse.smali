.class public Lcom/jieli/jl_rcsp/model/response/BaseNFCResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private final data:[B

.field private final result:B


# direct methods
.method public constructor <init>(B[B)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/response/BaseNFCResponse;->result:B

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/response/BaseNFCResponse;->data:[B

    return-void
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/BaseNFCResponse;->data:[B

    return-object v0
.end method

.method public getResult()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/response/BaseNFCResponse;->result:B

    return v0
.end method
