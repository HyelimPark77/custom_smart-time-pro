.class public Lcom/jieli/jl_rcsp/model/parameter/NotifyAppInfoParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private final XiaoMiFlag:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyAppInfoParam;->XiaoMiFlag:I

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyAppInfoParam;->XiaoMiFlag:I

    int-to-byte v0, v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public getXiaoMiFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/NotifyAppInfoParam;->XiaoMiFlag:I

    return v0
.end method
