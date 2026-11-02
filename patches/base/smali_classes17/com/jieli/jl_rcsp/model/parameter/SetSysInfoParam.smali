.class public Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;
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

    iput-object p2, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->attrBeanList:Ljava/util/List;

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->function:B

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

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->attrBeanList:Ljava/util/List;

    return-object v0
.end method

.method public getFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->function:B

    return v0
.end method

.method public getParamData()[B
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->attrBeanList:Ljava/util/List;

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
    const/4 v1, 0x1

    add-int/2addr v3, v1

    new-array v3, v3, [B

    iget-byte v4, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->function:B

    aput-byte v4, v3, v2

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [B

    array-length v5, v4

    invoke-static {v4, v2, v3, v1, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v4, v4

    add-int/2addr v1, v4

    goto :goto_1

    :cond_1
    return-object v3
.end method

.method public setAttrBeanList(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->attrBeanList:Ljava/util/List;

    return-object p0
.end method

.method public setFunction(B)Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/parameter/SetSysInfoParam;->function:B

    return-object p0
.end method
