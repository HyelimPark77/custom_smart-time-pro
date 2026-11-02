.class public Lcom/jieli/jl_rcsp/tool/datahandles/DataInfoCache;
.super Ljava/util/ArrayList;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/ArrayList<",
        "Lcom/jieli/jl_rcsp/model/DataInfo;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-void
.end method


# virtual methods
.method public getDataInfo(Lcom/jieli/jl_rcsp/model/base/BasePacket;)Lcom/jieli/jl_rcsp/model/DataInfo;
    .locals 4

    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/jieli/jl_rcsp/model/DataInfo;

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCode()I

    move-result v3

    if-ne v2, v3, :cond_0

    invoke-virtual {v1}, Lcom/jieli/jl_rcsp/model/DataInfo;->getBasePacket()Lcom/jieli/jl_rcsp/model/base/BasePacket;

    move-result-object v2

    invoke-virtual {v2}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v2

    invoke-virtual {p1}, Lcom/jieli/jl_rcsp/model/base/BasePacket;->getOpCodeSn()I

    move-result v3

    if-ne v2, v3, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method
