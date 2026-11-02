.class public Lcom/jieli/jl_rcsp/model/Option;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private cmdTimeout:I

.field private isMultiDevice:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x7d0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/Option;->cmdTimeout:I

    return-void
.end method

.method public static createOption()Lcom/jieli/jl_rcsp/model/Option;
    .locals 2

    new-instance v0, Lcom/jieli/jl_rcsp/model/Option;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/Option;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/Option;->setMultiDevice(Z)Lcom/jieli/jl_rcsp/model/Option;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public getCmdTimeout()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/Option;->cmdTimeout:I

    return v0
.end method

.method public isMultiDevice()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/Option;->isMultiDevice:Z

    return v0
.end method

.method public setCmdTimeout(I)Lcom/jieli/jl_rcsp/model/Option;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/Option;->cmdTimeout:I

    return-object p0
.end method

.method public setMultiDevice(Z)Lcom/jieli/jl_rcsp/model/Option;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/Option;->isMultiDevice:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Option{isMultiDevice="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/Option;->isMultiDevice:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", cmdTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/Option;->cmdTimeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
