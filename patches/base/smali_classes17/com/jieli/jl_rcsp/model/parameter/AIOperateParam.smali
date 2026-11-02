.class public Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam$AIOperateResultParam;
    }
.end annotation


# instance fields
.field private aiDialFunUIState:Ljava/lang/Integer;

.field private aiDialStyle:Ljava/lang/String;

.field private flag:I

.field private op:I

.field private scaleZoomHeight:Ljava/lang/Integer;

.field private scaleZoomWidth:Ljava/lang/Integer;

.field private thumbPath:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    return-void
.end method

.method private getParamSize()I
    .locals 3

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialStyle:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    :goto_0
    add-int/2addr v0, v1

    return v0

    :cond_1
    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialFunUIState:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    const/4 v0, 0x3

    return v0

    :cond_2
    const/4 v2, 0x4

    if-ne v0, v2, :cond_3

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->thumbPath:Ljava/lang/String;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    array-length v0, v0

    goto :goto_0

    :cond_3
    :goto_1
    return v1
.end method


# virtual methods
.method public getAiDialFunUIState()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialFunUIState:Ljava/lang/Integer;

    return-object v0
.end method

.method public getAiDialStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialStyle:Ljava/lang/String;

    return-object v0
.end method

.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    return v0
.end method

.method public getOp()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    return v0
.end method

.method public getParamData()[B
    .locals 5

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->getParamSize()I

    move-result v0

    new-array v0, v0, [B

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v2, 0x0

    aput-byte v1, v0, v2

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    const/4 v3, 0x1

    aput-byte v1, v0, v3

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    const/4 v4, 0x2

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialStyle:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v3, v1

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_1
    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialFunUIState:Ljava/lang/Integer;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    aput-byte v1, v0, v4

    return-object v0

    :cond_2
    const/4 v3, 0x4

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->thumbPath:Ljava/lang/String;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v3, v1

    invoke-static {v1, v2, v0, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_3
    :goto_0
    return-object v0
.end method

.method public getScaleZoomHeight()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->scaleZoomHeight:Ljava/lang/Integer;

    return-object v0
.end method

.method public getScaleZoomWidth()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->scaleZoomWidth:Ljava/lang/Integer;

    return-object v0
.end method

.method public getThumbPath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->thumbPath:Ljava/lang/String;

    return-object v0
.end method

.method public setAiDialFunUIState(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialFunUIState:Ljava/lang/Integer;

    return-object p0
.end method

.method public setAiDialStyle(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialStyle:Ljava/lang/String;

    return-object p0
.end method

.method public setFlag(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    return-object p0
.end method

.method public setOp(I)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    return-object p0
.end method

.method public setScaleZoomHeight(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->scaleZoomHeight:Ljava/lang/Integer;

    return-object p0
.end method

.method public setScaleZoomWidth(Ljava/lang/Integer;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->scaleZoomWidth:Ljava/lang/Integer;

    return-object p0
.end method

.method public setThumbPath(Ljava/lang/String;)Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->thumbPath:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "AIOperateParam{op="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->op:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", flag="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->flag:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", aiDialStyle=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialStyle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", aiDialFunUIState="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->aiDialFunUIState:Ljava/lang/Integer;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", thumbPath=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/parameter/AIOperateParam;->thumbPath:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
