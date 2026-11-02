.class public Lcom/jieli/jl_bt_ota/model/base/LtvBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_bt_ota/interfaces/command/IDataOp;


# static fields
.field public static final VERSION_0:I = 0x0

.field public static final VERSION_1:I = 0x1


# instance fields
.field private data:[B

.field private len:I

.field private type:I

.field private final version:I


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    new-array v1, v0, [B

    invoke-direct {p0, v0, v0, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(II[B)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const/4 v0, 0x0

    .line 2
    new-array v1, v0, [B

    invoke-direct {p0, p1, v0, v0, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(III[B)V

    return-void
.end method

.method public constructor <init>(III[B)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->version:I

    .line 7
    iput p2, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->len:I

    .line 8
    iput p3, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    .line 9
    iput-object p4, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->data:[B

    return-void
.end method

.method public constructor <init>(II[B)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(III[B)V

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 3
    :cond_0
    array-length v0, p2

    :goto_0
    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0, p1, p2}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(II[B)V

    return-void
.end method

.method public static parseLTVData(I[B)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I[B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/base/LtvBean;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 2
    array-length v0, p1

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto :goto_2

    .line 3
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 4
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_2

    .line 5
    new-instance v2, Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    invoke-direct {v2, p0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;-><init>(I)V

    .line 6
    array-length v3, p1

    invoke-static {p1, v1, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->parse([B)I

    move-result v3

    if-gtz v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/2addr v1, v3

    .line 7
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0

    .line 8
    :cond_3
    :goto_2
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0
.end method

.method public static parseLTVData([B)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Ljava/util/List<",
            "Lcom/jieli/jl_bt_ota/model/base/LtvBean;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-static {v0, p0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->parseLTVData(I[B)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public getData()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->data:[B

    return-object v0
.end method

.method public getLen()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->len:I

    return v0
.end method

.method public getType()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    return v0
.end method

.method public getVersion()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->version:I

    return v0
.end method

.method public parse([B)I
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    array-length v1, p1

    const/4 v2, 0x1

    if-ge v1, v2, :cond_0

    goto :goto_2

    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v1

    iget v3, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->version:I

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    if-lt v1, v2, :cond_4

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result v3

    if-le v1, v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p0, v1}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->setLen(I)Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    iget v0, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->version:I

    if-nez v0, :cond_3

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    invoke-static {v0}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byteToInt(B)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->setType(I)Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v0

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->setType(I)Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    :goto_1
    sub-int/2addr v1, v2

    new-array v0, v1, [B

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p0, v0}, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->setData([B)Lcom/jieli/jl_bt_ota/model/base/LtvBean;

    invoke-virtual {p1}, Ljava/nio/Buffer;->position()I

    move-result p1

    return p1

    :cond_4
    :goto_2
    return v0
.end method

.method public setData([B)Lcom/jieli/jl_bt_ota/model/base/LtvBean;
    .locals 0

    iput-object p1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->data:[B

    return-object p0
.end method

.method public setLen(I)Lcom/jieli/jl_bt_ota/model/base/LtvBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->len:I

    return-object p0
.end method

.method public setType(I)Lcom/jieli/jl_bt_ota/model/base/LtvBean;
    .locals 0

    iput p1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    return-object p0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->len:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->version:I

    if-nez v1, :cond_0

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    :goto_0
    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->data:[B

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    :goto_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LtvBean{len="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->len:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->type:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", data="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_bt_ota/model/base/LtvBean;->data:[B

    invoke-static {v1}, Lcom/jieli/jl_bt_ota/util/CHexConver;->byte2HexStr([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
