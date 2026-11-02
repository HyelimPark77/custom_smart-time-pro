.class public Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam$AIOperateResultParam;
.super Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AIOperateResultParam"
.end annotation


# instance fields
.field private final result:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam$AIOperateResultParam;->result:I

    return-void
.end method


# virtual methods
.method public getParamData()[B
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam$AIOperateResultParam;->result:I

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    return-object v1
.end method

.method public getResult()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam$AIOperateResultParam;->result:I

    return v0
.end method
