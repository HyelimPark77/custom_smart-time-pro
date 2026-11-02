.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jieli/jl_rcsp/interfaces/cmd/IDataOp;
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private cluster:I

.field private crc:S

.field private devHandle:I

.field private filePath:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IISLjava/lang/String;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p4, :cond_0

    .line 5
    const-string p4, ""

    .line 6
    :cond_0
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    .line 7
    iput p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    .line 8
    iput-short p3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    .line 9
    iput-object p4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v0, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;-><init>(IISLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    int-to-short v0, v0

    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->parse([B)I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getCluster()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    return v0
.end method

.method public getCrc()S
    .locals 1

    iget-short v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    return v0
.end method

.method public getDevHandle()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    return v0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public getFilename()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    return-object v0
.end method

.method public parse([B)I
    .locals 4

    const-string v0, ""

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    array-length v1, p1

    const/16 v2, 0xc

    if-ge v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x4

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    invoke-static {p1, v1, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    const/16 v0, 0x8

    invoke-static {p1, v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToShort([BI)S

    move-result v0

    iput-short v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    const/16 v0, 0xa

    const/4 v1, 0x2

    invoke-static {p1, v0, v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v0

    add-int/lit8 v1, v0, 0xc

    array-length v3, p1

    if-gt v1, v3, :cond_1

    :try_start_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, p1, v2, v0}, Ljava/lang/String;-><init>([BII)V

    iput-object v3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_1
    return v2

    :cond_2
    :goto_0
    return v0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->intToBigBytes(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->shortToBigBytes(S)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ResourceInfo{devHandle="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", cluster="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", crc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-short v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", filePath=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->devHandle:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->cluster:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-short p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->crc:S

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/ResourceInfo;->filePath:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
