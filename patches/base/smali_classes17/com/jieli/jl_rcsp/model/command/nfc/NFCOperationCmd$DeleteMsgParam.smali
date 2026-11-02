.class public Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;
.super Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DeleteMsgParam"
.end annotation


# instance fields
.field private final id:S


# direct methods
.method public constructor <init>(IS)V
    .locals 1

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$Param;-><init>(II)V

    iput-short p2, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;->id:S

    return-void
.end method


# virtual methods
.method public getId()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;->id:S

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

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/command/nfc/NFCOperationCmd$DeleteMsgParam;->id:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

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
