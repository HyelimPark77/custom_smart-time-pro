.class public Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;
.super Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/SportHealthConfigure;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SportModeFunc"
.end annotation


# instance fields
.field private isSupportCount:Z

.field private isSupportInDoor:Z

.field private isSupportOutDoor:Z

.field private isSupportRecord:Z


# direct methods
.method public constructor <init>(I[B)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    const/16 v0, 0xfe

    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$BaseFunc;-><init>(II[B)V

    return-void
.end method


# virtual methods
.method public isSupportCount()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportCount:Z

    return v0
.end method

.method public isSupportInDoor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportInDoor:Z

    return v0
.end method

.method public isSupportOutDoor()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportOutDoor:Z

    return v0
.end method

.method public isSupportRecord()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportRecord:Z

    return v0
.end method

.method public parseData(I[B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/RuntimeException;
        }
    .end annotation

    if-nez p1, :cond_5

    if-eqz p2, :cond_4

    array-length p1, p2

    const/4 v0, 0x1

    if-lt p1, v0, :cond_4

    const/4 p1, 0x0

    aget-byte p2, p2, p1

    and-int/lit8 v1, p2, 0x1

    if-ne v1, v0, :cond_0

    move v1, v0

    goto :goto_0

    :cond_0
    move v1, p1

    :goto_0
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportRecord:Z

    shr-int/lit8 v1, p2, 0x1

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportCount:Z

    shr-int/lit8 v1, p2, 0x2

    and-int/2addr v1, v0

    if-ne v1, v0, :cond_2

    move v1, v0

    goto :goto_2

    :cond_2
    move v1, p1

    :goto_2
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportOutDoor:Z

    shr-int/lit8 p2, p2, 0x3

    and-int/2addr p2, v0

    if-ne p2, v0, :cond_3

    goto :goto_3

    :cond_3
    move v0, p1

    :goto_3
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportInDoor:Z

    return-void

    :cond_4
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " : Data exception : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/jieli/jl_rcsp/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p2, Ljava/lang/RuntimeException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported version :  "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SportModeFunc{isSupportRecord="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportRecord:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportCount:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportOutDoor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportOutDoor:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isSupportInDoor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/SportHealthConfigure$SportModeFunc;->isSupportInDoor:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "} "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
