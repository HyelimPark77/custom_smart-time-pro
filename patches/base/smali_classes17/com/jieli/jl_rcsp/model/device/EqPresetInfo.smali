.class public Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private eqInfos:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
            ">;"
        }
    .end annotation
.end field

.field private freqs:[I

.field private number:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getEqInfos()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->eqInfos:Ljava/util/List;

    return-object v0
.end method

.method public getFreqs()[I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->freqs:[I

    return-object v0
.end method

.method public getNumber()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->number:I

    return v0
.end method

.method public setEqInfos(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/jieli/jl_rcsp/model/device/EqInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->eqInfos:Ljava/util/List;

    return-void
.end method

.method public setFreqs([I)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->freqs:[I

    return-void
.end method

.method public setNumber(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->number:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EqPresetInfo{number="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->number:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eqInfos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->eqInfos:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", freqs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqPresetInfo;->freqs:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
