.class public Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;
.super Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private isMandatoryOTA:Z

.field private startOtaTimeout:I

.field private stopOtaTimeout:I

.field private version:Ljava/lang/String;

.field private vid:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo$1;

    invoke-direct {v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo$1;-><init>()V

    sput-object v0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(IZLjava/lang/String;II)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(I)V

    .line 3
    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    .line 4
    iput-boolean p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    if-nez p3, :cond_0

    .line 5
    const-string p3, ""

    .line 6
    :cond_0
    iput-object p3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    .line 7
    iput p4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    .line 8
    iput p5, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 9
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>(Landroid/os/Parcel;)V

    .line 10
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    .line 11
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    .line 12
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    .line 13
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    .line 14
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;-><init>([B)V

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public getStartOtaTimeout()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    return v0
.end method

.method public getStopOtaTimeout()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    return v0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    return-object v0
.end method

.method public getVid()I
    .locals 1

    iget v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    return v0
.end method

.method public isMandatoryOTA()Z
    .locals 1

    iget-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    return v0
.end method

.method public parse([B)I
    .locals 5

    const/4 v0, -0x1

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    const-string v0, ""

    iput-object v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    const/16 v0, 0x3c

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    const/16 v0, 0xf0

    iput v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    array-length v1, p1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    goto :goto_1

    :cond_0
    aget-byte v1, p1, v0

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    const/4 v1, 0x1

    aget-byte v3, p1, v1

    invoke-static {v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v3

    iput v3, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    const/4 v3, 0x2

    aget-byte v4, p1, v3

    invoke-static {v4}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v4

    if-ne v4, v1, :cond_1

    move v0, v1

    :cond_1
    iput-boolean v0, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    const/4 v0, 0x3

    aget-byte v0, p1, v0

    invoke-static {v0}, Lcom/jieli/jl_rcsp/util/CHexConver;->byteToInt(B)I

    move-result v0

    add-int/lit8 v1, v0, 0x4

    array-length v4, p1

    if-gt v1, v4, :cond_2

    :try_start_0
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, p1, v2, v0}, Ljava/lang/String;-><init>([BII)V

    iput-object v4, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    add-int/lit8 v0, v2, 0x2

    array-length v1, p1

    if-gt v0, v1, :cond_3

    invoke-static {p1, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result v1

    iput v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    move v2, v0

    :cond_3
    add-int/lit8 v0, v2, 0x2

    array-length v1, p1

    if-gt v0, v1, :cond_4

    invoke-static {p1, v2, v3}, Lcom/jieli/jl_rcsp/util/CHexConver;->bytesToInt([BII)I

    move-result p1

    iput p1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    move v2, v0

    :cond_4
    return v2

    :cond_5
    :goto_1
    return v0
.end method

.method public toData()[B
    .locals 2

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->type:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    array-length v1, v1

    :goto_0
    invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    if-lez v1, :cond_1

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    invoke-static {v1}, Lcom/jieli/jl_rcsp/util/CHexConver;->int2byte2(I)[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/io/OutputStream;->write([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "NetworkInfo{vid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", isMandatoryOTA="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", version=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", startOtaTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", stopOtaTimeout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkBase;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->vid:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->isMandatoryOTA:Z

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget-object p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->version:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->startOtaTimeout:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    iget p2, p0, Lcom/jieli/jl_rcsp/model/device/settings/v0/NetworkInfo;->stopOtaTimeout:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
