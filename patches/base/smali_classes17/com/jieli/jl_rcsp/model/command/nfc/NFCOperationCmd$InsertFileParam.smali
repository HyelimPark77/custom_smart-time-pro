.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InsertFileParam"
.end annotation


# instance fields
.field private final fileName:Ljava/lang/String;

.field private final fileSize:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;-><init>(II)V

    iput p2, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileSize:I

    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getFileName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileName:Ljava/lang/String;

    return-object v0
.end method

.method public getFileSize()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileSize:I

    return v0
.end method

.method public getParamData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-super {p0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;->getParamData()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileSize:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$InsertFileParam;->fileName:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

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
