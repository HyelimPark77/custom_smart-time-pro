.class public Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# instance fields
.field private attrBeanList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation
.end field

.field private function:B


# direct methods
.method public constructor <init>(BLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->setAttrBeanList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->setFunction(B)Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;

    return-void
.end method


# virtual methods
.method public getAttrBeanList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->attrBeanList:Ljava/util/List;

    return-object v0
.end method

.method public getFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->function:B

    return v0
.end method

.method public getParamData()[B
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->attrBeanList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/jieli/jl_rcsp/model/device/AttrBean;

    invoke-virtual {v4}, Lcom/jieli/jl_rcsp/model/device/AttrBean;->getData()[B

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    array-length v4, v4

    add-int/2addr v3, v4

    goto :goto_0

    :cond_0
    new-array v1, v3, [B

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    array-length v5, v4

    invoke-static {v4, v2, v1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, v4

    add-int/2addr v3, v4

    goto :goto_1

    :cond_1
    return-object v1
.end method

.method public setAttrBeanList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->attrBeanList:Ljava/util/List;

    return-object p0
.end method

.method public setFunction(B)Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->function:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "UpdateSysInfoParam{attrBeanList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->attrBeanList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", function="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/parameter/UpdateSysInfoParam;->function:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
