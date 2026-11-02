.class public Lcom/jieli/jl_rcsp/model/device/DevStorageState;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private handle:I

.field private index:I

.field private isOnline:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->handle:I

    return v0
.end method

.method public getIndex()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->index:I

    return v0
.end method

.method public isOnline()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->isOnline:Z

    return v0
.end method

.method public parseData([B)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    array-length v1, p1

    const/4 v2, 0x2

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_1

    move v0, v3

    :cond_1
    invoke-virtual {p0, v0}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->setOnline(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    aget-byte v0, p1, v3

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->index:I

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->isOnline:Z

    if-eqz v0, :cond_2

    array-length v0, p1

    const/4 v1, 0x6

    if-lt v0, v1, :cond_2

    const/4 v0, 0x4

    invoke-static {p1, v2, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->setHandle(I)Lcom/jieli/jl_rcsp/model/device/DevStorageState;

    return v1

    :cond_2
    return v2

    :cond_3
    :goto_0
    return v0
.end method

.method public setHandle(I)Lcom/jieli/jl_rcsp/model/device/DevStorageState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->handle:I

    return-object p0
.end method

.method public setIndex(I)Lcom/jieli/jl_rcsp/model/device/DevStorageState;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->index:I

    return-object p0
.end method

.method public setOnline(Z)Lcom/jieli/jl_rcsp/model/device/DevStorageState;
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->isOnline:Z

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DevStorageState{isOnline="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->isOnline:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", index="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->index:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", handle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/DevStorageState;->handle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
