.class public Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;
.super Lcom/jieli/jl_rcsp/model/base/BaseParameter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SetDevStorageParam"
.end annotation


# instance fields
.field private final devHandler:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Lcom/jieli/jl_rcsp/model/base/BaseParameter;-><init>()V

    iput p1, p0, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;->devHandler:I

    return-void
.end method


# virtual methods
.method public getDevHandler()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;->devHandler:I

    return v0
.end method

.method public getParamData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/command/SetDevStorageCmd$SetDevStorageParam;->devHandler:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

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
