.class public Lcom/jieli/jl_rcsp/model/device/EqInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private count:I

.field private dynamic:Z

.field private freqs:[I

.field private mode:I

.field private value:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 2
    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    .line 3
    sget-object v1, Lcom/jieli/jl_rcsp/constant/RcspConstant;->DEFAULT_EQ_FREQS:[I

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    .line 4
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 2

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 6
    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    .line 7
    sget-object v1, Lcom/jieli/jl_rcsp/constant/RcspConstant;->DEFAULT_EQ_FREQS:[I

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    .line 8
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    .line 9
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    .line 10
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    return-void
.end method

.method public constructor <init>(I[B[I)V
    .locals 2

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    .line 12
    new-array v1, v0, [B

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    .line 13
    sget-object v1, Lcom/jieli/jl_rcsp/constant/RcspConstant;->DEFAULT_EQ_FREQS:[I

    iput-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    .line 14
    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    .line 15
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setMode(I)V

    .line 16
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setValue([B)V

    .line 17
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setFreqs([I)V

    return-void
.end method


# virtual methods
.method public copy()Lcom/jieli/jl_rcsp/model/device/EqInfo;
    .locals 4

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/EqInfo;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->mode:I

    iget-object v2, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    invoke-virtual {p0}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->getFreqs()[I

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/jieli/jl_rcsp/model/device/EqInfo;-><init>(I[B[I)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    iput v1, v0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->dynamic:Z

    invoke-virtual {v0, v1}, Lcom/jieli/jl_rcsp/model/device/EqInfo;->setDynamic(Z)V

    return-object v0
.end method

.method public getCount()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    return v0
.end method

.method public getFreqs()[I
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    return-object v0
.end method

.method public getMode()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->mode:I

    return v0
.end method

.method public getValue()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    return-object v0
.end method

.method public isDynamic()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->dynamic:Z

    return v0
.end method

.method public setDynamic(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->dynamic:Z

    return-void
.end method

.method public setFreqs([I)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    array-length p1, p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->count:I

    return-void
.end method

.method public setMode(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->mode:I

    return-void
.end method

.method public setValue([B)V
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "EqInfo{mode="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->mode:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isNew="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->dynamic:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->value:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", freqs="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/EqInfo;->freqs:[I

    invoke-static {v1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
