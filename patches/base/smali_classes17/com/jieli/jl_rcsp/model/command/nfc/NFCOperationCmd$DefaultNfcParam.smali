.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DefaultNfcParam"
.end annotation


# instance fields
.field private final flag:I

.field private final value:[B


# direct methods
.method public constructor <init>(II[B)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;-><init>(II)V

    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->flag:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->value:[B

    return-void
.end method


# virtual methods
.method public getFlag()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->flag:I

    return v0
.end method

.method public getParamData()[B
    .locals 3

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;->getParamData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->flag:I

    int-to-byte v1, v1

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->value:[B

    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_0
    :goto_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public getValue()[B
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DefaultNfcParam;->value:[B

    return-object v0
.end method
