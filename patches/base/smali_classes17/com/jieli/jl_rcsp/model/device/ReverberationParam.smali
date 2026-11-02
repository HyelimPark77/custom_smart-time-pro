.class public Lcom/jieli/jl_rcsp/model/device/ReverberationParam;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MASK:I = 0x1


# instance fields
.field private depthValue:I

.field private isOn:Z

.field private strengthValue:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ZII)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->setOn(Z)V

    .line 4
    invoke-virtual {p0, p2}, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->setDepthValue(I)V

    .line 5
    invoke-virtual {p0, p3}, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->setStrengthValue(I)V

    return-void
.end method

.method public static parseData([B)Lcom/jieli/jl_rcsp/model/device/ReverberationParam;
    .locals 4

    if-eqz p0, :cond_2

    array-length v0, p0

    const/4 v1, 0x5

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    aget-byte v1, p0, v0

    const/4 v2, 0x1

    if-ne v1, v2, :cond_1

    move v0, v2

    :cond_1
    const/4 v1, 0x2

    invoke-static {p0, v2, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v2

    const/4 v3, 0x3

    invoke-static {p0, v3, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p0

    new-instance v1, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;

    invoke-direct {v1, v0, v2, p0}, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;-><init>(ZII)V

    return-object v1

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public getDepthValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->depthValue:I

    return v0
.end method

.method public getStrengthValue()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->strengthValue:I

    return v0
.end method

.method public isOn()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->isOn:Z

    return v0
.end method

.method public setDepthValue(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->depthValue:I

    return-void
.end method

.method public setOn(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->isOn:Z

    return-void
.end method

.method public setStrengthValue(I)V
    .locals 0

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->strengthValue:I

    return-void
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->isOn:Z

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToByte(I)B

    move-result v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->depthValue:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->strengthValue:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReverberationParam{isOn="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->isOn:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", depthValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->depthValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", strengthValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/ReverberationParam;->strengthValue:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
