.class public Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;
.super Lcom/jieli/jl_rcsp/model/base/CommonResponse;
.source "SourceFile"


# instance fields
.field private attrs:Ljava/util/List;
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
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;-><init>()V

    return-void
.end method


# virtual methods
.method public getAttrs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->attrs:Ljava/util/List;

    return-object v0
.end method

.method public getFunction()B
    .locals 1

    iget-byte v0, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->function:B

    return v0
.end method

.method public setAttrs(Ljava/util/List;)Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/AttrBean;",
            ">;)",
            "Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;"
        }
    .end annotation

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->attrs:Ljava/util/List;

    return-object p0
.end method

.method public setFunction(B)Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;
    .locals 0

    iput-byte p1, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->function:B

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SysInfoResponse{function="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-byte v1, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->function:B

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", attrs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/response/SysInfoResponse;->attrs:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/base/CommonResponse;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
